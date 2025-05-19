
/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress(
    "unused",
    "nothing_to_inline",
    "useless_cast",
    "unchecked_cast",
    "extension_shadowed_by_member",
    "redundant_projection",
    "RemoveRedundantBackticks",
    "ObjectPropertyName",
    "deprecation",
    "detekt:all"
)
@file:org.gradle.api.Generated

package gradle.kotlin.dsl.accessors._468688d98eaf46a7bd7d111a60143bd6


import org.gradle.api.Action
import org.gradle.api.Incubating
import org.gradle.api.NamedDomainObjectProvider
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.artifacts.Configuration
import org.gradle.api.artifacts.ConfigurablePublishArtifact
import org.gradle.api.artifacts.ConfigurationContainer
import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.DependencyConstraint
import org.gradle.api.artifacts.ExternalModuleDependency
import org.gradle.api.artifacts.ModuleDependency
import org.gradle.api.artifacts.PublishArtifact
import org.gradle.api.artifacts.dsl.ArtifactHandler
import org.gradle.api.artifacts.dsl.DependencyConstraintHandler
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.api.initialization.SharedModelDefaults
import org.gradle.api.provider.Provider
import org.gradle.api.provider.ProviderConvertible
import org.gradle.api.tasks.TaskContainer
import org.gradle.api.tasks.TaskProvider

import org.gradle.kotlin.dsl.*
import org.gradle.kotlin.dsl.accessors.runtime.*


/**
 * Adds a dependency to the 'quarkusTestRuntimeClasspathConfigurationDeployment' configuration.
 *
 * @param dependencyNotation notation for the dependency to be added.
 * @return The dependency.
 *
 * @see [DependencyHandler.add]
 */
internal
fun DependencyHandler.`quarkusTestRuntimeClasspathConfigurationDeployment`(dependencyNotation: Any): Dependency? =
    add("quarkusTestRuntimeClasspathConfigurationDeployment", dependencyNotation)

/**
 * Adds a dependency to the 'quarkusTestRuntimeClasspathConfigurationDeployment' configuration.
 *
 * @param dependencyNotation notation for the dependency to be added.
 * @param dependencyConfiguration expression to use to configure the dependency.
 * @return The dependency.
 *
 * @see [DependencyHandler.add]
 */
internal
fun DependencyHandler.`quarkusTestRuntimeClasspathConfigurationDeployment`(
    dependencyNotation: String,
    dependencyConfiguration: Action<ExternalModuleDependency>
): ExternalModuleDependency = addDependencyTo(
    this, "quarkusTestRuntimeClasspathConfigurationDeployment", dependencyNotation, dependencyConfiguration
) as ExternalModuleDependency

/**
 * Adds a dependency to the 'quarkusTestRuntimeClasspathConfigurationDeployment' configuration.
 *
 * @param dependencyNotation notation for the dependency to be added.
 * @param dependencyConfiguration expression to use to configure the dependency.
 * @return The dependency.
 *
 * @see [DependencyHandler.add]
 */
internal
fun DependencyHandler.`quarkusTestRuntimeClasspathConfigurationDeployment`(
    dependencyNotation: Provider<*>,
    dependencyConfiguration: Action<ExternalModuleDependency>
): Unit = addConfiguredDependencyTo(
    this, "quarkusTestRuntimeClasspathConfigurationDeployment", dependencyNotation, dependencyConfiguration
)

/**
 * Adds a dependency to the 'quarkusTestRuntimeClasspathConfigurationDeployment' configuration.
 *
 * @param dependencyNotation notation for the dependency to be added.
 * @param dependencyConfiguration expression to use to configure the dependency.
 * @return The dependency.
 *
 * @see [DependencyHandler.add]
 */
internal
fun DependencyHandler.`quarkusTestRuntimeClasspathConfigurationDeployment`(
    dependencyNotation: ProviderConvertible<*>,
    dependencyConfiguration: Action<ExternalModuleDependency>
): Unit = addConfiguredDependencyTo(
    this, "quarkusTestRuntimeClasspathConfigurationDeployment", dependencyNotation, dependencyConfiguration
)

/**
 * Adds a dependency to the 'quarkusTestRuntimeClasspathConfigurationDeployment' configuration.
 *
 * @param group the group of the module to be added as a dependency.
 * @param name the name of the module to be added as a dependency.
 * @param version the optional version of the module to be added as a dependency.
 * @param configuration the optional configuration of the module to be added as a dependency.
 * @param classifier the optional classifier of the module artifact to be added as a dependency.
 * @param ext the optional extension of the module artifact to be added as a dependency.
 * @param dependencyConfiguration expression to use to configure the dependency.
 * @return The dependency.
 *
 * @see [DependencyHandler.create]
 * @see [DependencyHandler.add]
 */
internal
fun DependencyHandler.`quarkusTestRuntimeClasspathConfigurationDeployment`(
    group: String,
    name: String,
    version: String? = null,
    configuration: String? = null,
    classifier: String? = null,
    ext: String? = null,
    dependencyConfiguration: Action<ExternalModuleDependency>? = null
): ExternalModuleDependency = addExternalModuleDependencyTo(
    this, "quarkusTestRuntimeClasspathConfigurationDeployment", group, name, version, configuration, classifier, ext, dependencyConfiguration
)

/**
 * Adds a dependency to the 'quarkusTestRuntimeClasspathConfigurationDeployment' configuration.
 *
 * @param dependency dependency to be added.
 * @param dependencyConfiguration expression to use to configure the dependency.
 * @return The dependency.
 *
 * @see [DependencyHandler.add]
 */
internal
fun <T : ModuleDependency> DependencyHandler.`quarkusTestRuntimeClasspathConfigurationDeployment`(
    dependency: T,
    dependencyConfiguration: T.() -> Unit
): T = add("quarkusTestRuntimeClasspathConfigurationDeployment", dependency, dependencyConfiguration)

/**
 * Adds a dependency constraint to the 'quarkusTestRuntimeClasspathConfigurationDeployment' configuration.
 *
 * @param constraintNotation the dependency constraint notation
 *
 * @return the added dependency constraint
 *
 * @see [DependencyConstraintHandler.add]
 */
internal
fun DependencyConstraintHandler.`quarkusTestRuntimeClasspathConfigurationDeployment`(constraintNotation: Any): DependencyConstraint =
    add("quarkusTestRuntimeClasspathConfigurationDeployment", constraintNotation)

/**
 * Adds a dependency constraint to the 'quarkusTestRuntimeClasspathConfigurationDeployment' configuration.
 *
 * @param constraintNotation the dependency constraint notation
 * @param block the block to use to configure the dependency constraint
 *
 * @return the added dependency constraint
 *
 * @see [DependencyConstraintHandler.add]
 */
internal
fun DependencyConstraintHandler.`quarkusTestRuntimeClasspathConfigurationDeployment`(constraintNotation: Any, block: DependencyConstraint.() -> Unit): DependencyConstraint =
    add("quarkusTestRuntimeClasspathConfigurationDeployment", constraintNotation, block)

/**
 * Adds an artifact to the 'quarkusTestRuntimeClasspathConfigurationDeployment' configuration.
 *
 * @param artifactNotation the group of the module to be added as a dependency.
 * @return The artifact.
 *
 * @see [ArtifactHandler.add]
 */
internal
fun ArtifactHandler.`quarkusTestRuntimeClasspathConfigurationDeployment`(artifactNotation: Any): PublishArtifact =
    add("quarkusTestRuntimeClasspathConfigurationDeployment", artifactNotation)

/**
 * Adds an artifact to the 'quarkusTestRuntimeClasspathConfigurationDeployment' configuration.
 *
 * @param artifactNotation the group of the module to be added as a dependency.
 * @param configureAction The action to execute to configure the artifact.
 * @return The artifact.
 *
 * @see [ArtifactHandler.add]
 */
internal
fun ArtifactHandler.`quarkusTestRuntimeClasspathConfigurationDeployment`(
    artifactNotation: Any,
    configureAction:  ConfigurablePublishArtifact.() -> Unit
): PublishArtifact =
    add("quarkusTestRuntimeClasspathConfigurationDeployment", artifactNotation, configureAction)



