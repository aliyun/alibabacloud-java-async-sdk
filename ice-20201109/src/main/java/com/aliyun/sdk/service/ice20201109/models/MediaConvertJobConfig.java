// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MediaConvertJobConfig} extends {@link TeaModel}
 *
 * <p>MediaConvertJobConfig</p>
 */
public class MediaConvertJobConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Inputs")
    private java.util.List<Inputs> inputs;

    @com.aliyun.core.annotation.NameInMap("JobName")
    private String jobName;

    @com.aliyun.core.annotation.NameInMap("OutputGroups")
    private java.util.List<OutputGroups> outputGroups;

    private MediaConvertJobConfig(Builder builder) {
        this.inputs = builder.inputs;
        this.jobName = builder.jobName;
        this.outputGroups = builder.outputGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertJobConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inputs
     */
    public java.util.List<Inputs> getInputs() {
        return this.inputs;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return outputGroups
     */
    public java.util.List<OutputGroups> getOutputGroups() {
        return this.outputGroups;
    }

    public static final class Builder {
        private java.util.List<Inputs> inputs; 
        private String jobName; 
        private java.util.List<OutputGroups> outputGroups; 

        private Builder() {
        } 

        private Builder(MediaConvertJobConfig model) {
            this.inputs = model.inputs;
            this.jobName = model.jobName;
            this.outputGroups = model.outputGroups;
        } 

        /**
         * Inputs.
         */
        public Builder inputs(java.util.List<Inputs> inputs) {
            this.inputs = inputs;
            return this;
        }

        /**
         * JobName.
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            return this;
        }

        /**
         * OutputGroups.
         */
        public Builder outputGroups(java.util.List<OutputGroups> outputGroups) {
            this.outputGroups = outputGroups;
            return this;
        }

        public MediaConvertJobConfig build() {
            return new MediaConvertJobConfig(this);
        } 

    } 

    /**
     * 
     * {@link MediaConvertJobConfig} extends {@link TeaModel}
     *
     * <p>MediaConvertJobConfig</p>
     */
    public static class InputFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private InputFile(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputFile create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            private Builder() {
            } 

            private Builder(InputFile model) {
                this.media = model.media;
                this.type = model.type;
            } 

            /**
             * Media.
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public InputFile build() {
                return new InputFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link MediaConvertJobConfig} extends {@link TeaModel}
     *
     * <p>MediaConvertJobConfig</p>
     */
    public static class Inputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputFile")
        private InputFile inputFile;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Inputs(Builder builder) {
            this.inputFile = builder.inputFile;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Inputs create() {
            return builder().build();
        }

        /**
         * @return inputFile
         */
        public InputFile getInputFile() {
            return this.inputFile;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private InputFile inputFile; 
            private String name; 

            private Builder() {
            } 

            private Builder(Inputs model) {
                this.inputFile = model.inputFile;
                this.name = model.name;
            } 

            /**
             * InputFile.
             */
            public Builder inputFile(InputFile inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Inputs build() {
                return new Inputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link MediaConvertJobConfig} extends {@link TeaModel}
     *
     * <p>MediaConvertJobConfig</p>
     */
    public static class Excludes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Excludes(Builder builder) {
            this.language = builder.language;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Excludes create() {
            return builder().build();
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String language; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Excludes model) {
                this.language = model.language;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Excludes build() {
                return new Excludes(this);
            } 

        } 

    }
    /**
     * 
     * {@link MediaConvertJobConfig} extends {@link TeaModel}
     *
     * <p>MediaConvertJobConfig</p>
     */
    public static class ManifestExtend extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Excludes")
        private java.util.List<Excludes> excludes;

        @com.aliyun.core.annotation.NameInMap("InputRef")
        private String inputRef;

        private ManifestExtend(Builder builder) {
            this.excludes = builder.excludes;
            this.inputRef = builder.inputRef;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManifestExtend create() {
            return builder().build();
        }

        /**
         * @return excludes
         */
        public java.util.List<Excludes> getExcludes() {
            return this.excludes;
        }

        /**
         * @return inputRef
         */
        public String getInputRef() {
            return this.inputRef;
        }

        public static final class Builder {
            private java.util.List<Excludes> excludes; 
            private String inputRef; 

            private Builder() {
            } 

            private Builder(ManifestExtend model) {
                this.excludes = model.excludes;
                this.inputRef = model.inputRef;
            } 

            /**
             * Excludes.
             */
            public Builder excludes(java.util.List<Excludes> excludes) {
                this.excludes = excludes;
                return this;
            }

            /**
             * InputRef.
             */
            public Builder inputRef(String inputRef) {
                this.inputRef = inputRef;
                return this;
            }

            public ManifestExtend build() {
                return new ManifestExtend(this);
            } 

        } 

    }
    /**
     * 
     * {@link MediaConvertJobConfig} extends {@link TeaModel}
     *
     * <p>MediaConvertJobConfig</p>
     */
    public static class OutputFileBase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private OutputFileBase(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputFileBase create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            private Builder() {
            } 

            private Builder(OutputFileBase model) {
                this.media = model.media;
                this.type = model.type;
            } 

            /**
             * Media.
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OutputFileBase build() {
                return new OutputFileBase(this);
            } 

        } 

    }
    /**
     * 
     * {@link MediaConvertJobConfig} extends {@link TeaModel}
     *
     * <p>MediaConvertJobConfig</p>
     */
    public static class GroupConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ManifestExtend")
        private ManifestExtend manifestExtend;

        @com.aliyun.core.annotation.NameInMap("ManifestName")
        private String manifestName;

        @com.aliyun.core.annotation.NameInMap("OutputFileBase")
        private OutputFileBase outputFileBase;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private GroupConfig(Builder builder) {
            this.manifestExtend = builder.manifestExtend;
            this.manifestName = builder.manifestName;
            this.outputFileBase = builder.outputFileBase;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupConfig create() {
            return builder().build();
        }

        /**
         * @return manifestExtend
         */
        public ManifestExtend getManifestExtend() {
            return this.manifestExtend;
        }

        /**
         * @return manifestName
         */
        public String getManifestName() {
            return this.manifestName;
        }

        /**
         * @return outputFileBase
         */
        public OutputFileBase getOutputFileBase() {
            return this.outputFileBase;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ManifestExtend manifestExtend; 
            private String manifestName; 
            private OutputFileBase outputFileBase; 
            private String type; 

            private Builder() {
            } 

            private Builder(GroupConfig model) {
                this.manifestExtend = model.manifestExtend;
                this.manifestName = model.manifestName;
                this.outputFileBase = model.outputFileBase;
                this.type = model.type;
            } 

            /**
             * ManifestExtend.
             */
            public Builder manifestExtend(ManifestExtend manifestExtend) {
                this.manifestExtend = manifestExtend;
                return this;
            }

            /**
             * ManifestName.
             */
            public Builder manifestName(String manifestName) {
                this.manifestName = manifestName;
                return this;
            }

            /**
             * OutputFileBase.
             */
            public Builder outputFileBase(OutputFileBase outputFileBase) {
                this.outputFileBase = outputFileBase;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public GroupConfig build() {
                return new GroupConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link MediaConvertJobConfig} extends {@link TeaModel}
     *
     * <p>MediaConvertJobConfig</p>
     */
    public static class HlsGroupConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioGroup")
        private String audioGroup;

        @com.aliyun.core.annotation.NameInMap("AutoSelect")
        private String autoSelect;

        @com.aliyun.core.annotation.NameInMap("Forced")
        private String forced;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private String isDefault;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SubtitleGroup")
        private String subtitleGroup;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private HlsGroupConfig(Builder builder) {
            this.audioGroup = builder.audioGroup;
            this.autoSelect = builder.autoSelect;
            this.forced = builder.forced;
            this.group = builder.group;
            this.isDefault = builder.isDefault;
            this.language = builder.language;
            this.name = builder.name;
            this.subtitleGroup = builder.subtitleGroup;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HlsGroupConfig create() {
            return builder().build();
        }

        /**
         * @return audioGroup
         */
        public String getAudioGroup() {
            return this.audioGroup;
        }

        /**
         * @return autoSelect
         */
        public String getAutoSelect() {
            return this.autoSelect;
        }

        /**
         * @return forced
         */
        public String getForced() {
            return this.forced;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return subtitleGroup
         */
        public String getSubtitleGroup() {
            return this.subtitleGroup;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String audioGroup; 
            private String autoSelect; 
            private String forced; 
            private String group; 
            private String isDefault; 
            private String language; 
            private String name; 
            private String subtitleGroup; 
            private String type; 

            private Builder() {
            } 

            private Builder(HlsGroupConfig model) {
                this.audioGroup = model.audioGroup;
                this.autoSelect = model.autoSelect;
                this.forced = model.forced;
                this.group = model.group;
                this.isDefault = model.isDefault;
                this.language = model.language;
                this.name = model.name;
                this.subtitleGroup = model.subtitleGroup;
                this.type = model.type;
            } 

            /**
             * AudioGroup.
             */
            public Builder audioGroup(String audioGroup) {
                this.audioGroup = audioGroup;
                return this;
            }

            /**
             * AutoSelect.
             */
            public Builder autoSelect(String autoSelect) {
                this.autoSelect = autoSelect;
                return this;
            }

            /**
             * Forced.
             */
            public Builder forced(String forced) {
                this.forced = forced;
                return this;
            }

            /**
             * Group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SubtitleGroup.
             */
            public Builder subtitleGroup(String subtitleGroup) {
                this.subtitleGroup = subtitleGroup;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public HlsGroupConfig build() {
                return new HlsGroupConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link MediaConvertJobConfig} extends {@link TeaModel}
     *
     * <p>MediaConvertJobConfig</p>
     */
    public static class Outputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Features")
        private String features;

        @com.aliyun.core.annotation.NameInMap("HlsGroupConfig")
        private HlsGroupConfig hlsGroupConfig;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutputFileName")
        private String outputFileName;

        @com.aliyun.core.annotation.NameInMap("OverrideParams")
        private String overrideParams;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private Outputs(Builder builder) {
            this.features = builder.features;
            this.hlsGroupConfig = builder.hlsGroupConfig;
            this.name = builder.name;
            this.outputFileName = builder.outputFileName;
            this.overrideParams = builder.overrideParams;
            this.priority = builder.priority;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outputs create() {
            return builder().build();
        }

        /**
         * @return features
         */
        public String getFeatures() {
            return this.features;
        }

        /**
         * @return hlsGroupConfig
         */
        public HlsGroupConfig getHlsGroupConfig() {
            return this.hlsGroupConfig;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputFileName
         */
        public String getOutputFileName() {
            return this.outputFileName;
        }

        /**
         * @return overrideParams
         */
        public String getOverrideParams() {
            return this.overrideParams;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String features; 
            private HlsGroupConfig hlsGroupConfig; 
            private String name; 
            private String outputFileName; 
            private String overrideParams; 
            private Integer priority; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(Outputs model) {
                this.features = model.features;
                this.hlsGroupConfig = model.hlsGroupConfig;
                this.name = model.name;
                this.outputFileName = model.outputFileName;
                this.overrideParams = model.overrideParams;
                this.priority = model.priority;
                this.templateId = model.templateId;
            } 

            /**
             * Features.
             */
            public Builder features(String features) {
                this.features = features;
                return this;
            }

            /**
             * HlsGroupConfig.
             */
            public Builder hlsGroupConfig(HlsGroupConfig hlsGroupConfig) {
                this.hlsGroupConfig = hlsGroupConfig;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OutputFileName.
             */
            public Builder outputFileName(String outputFileName) {
                this.outputFileName = outputFileName;
                return this;
            }

            /**
             * OverrideParams.
             */
            public Builder overrideParams(String overrideParams) {
                this.overrideParams = overrideParams;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public Outputs build() {
                return new Outputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link MediaConvertJobConfig} extends {@link TeaModel}
     *
     * <p>MediaConvertJobConfig</p>
     */
    public static class OutputGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupConfig")
        private GroupConfig groupConfig;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private java.util.List<Outputs> outputs;

        private OutputGroups(Builder builder) {
            this.groupConfig = builder.groupConfig;
            this.name = builder.name;
            this.outputs = builder.outputs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputGroups create() {
            return builder().build();
        }

        /**
         * @return groupConfig
         */
        public GroupConfig getGroupConfig() {
            return this.groupConfig;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputs
         */
        public java.util.List<Outputs> getOutputs() {
            return this.outputs;
        }

        public static final class Builder {
            private GroupConfig groupConfig; 
            private String name; 
            private java.util.List<Outputs> outputs; 

            private Builder() {
            } 

            private Builder(OutputGroups model) {
                this.groupConfig = model.groupConfig;
                this.name = model.name;
                this.outputs = model.outputs;
            } 

            /**
             * GroupConfig.
             */
            public Builder groupConfig(GroupConfig groupConfig) {
                this.groupConfig = groupConfig;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Outputs.
             */
            public Builder outputs(java.util.List<Outputs> outputs) {
                this.outputs = outputs;
                return this;
            }

            public OutputGroups build() {
                return new OutputGroups(this);
            } 

        } 

    }
}
