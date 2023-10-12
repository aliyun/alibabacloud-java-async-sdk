// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Script} extends {@link TeaModel}
 *
 * <p>Script</p>
 */
public class Script extends TeaModel {
    @NameInMap("Content")
    private String content;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModify")
    private String gmtModify;

    @NameInMap("Input")
    private java.util.List < Input> input;

    @NameInMap("Output")
    private java.util.List < Output> output;

    @NameInMap("Rules")
    private java.util.List < ScriptRule > rules;

    @NameInMap("ScriptId")
    private String scriptId;

    @NameInMap("TemplateId")
    private String templateId;

    @NameInMap("VersionId")
    private String versionId;

    private Script(Builder builder) {
        this.content = builder.content;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModify = builder.gmtModify;
        this.input = builder.input;
        this.output = builder.output;
        this.rules = builder.rules;
        this.scriptId = builder.scriptId;
        this.templateId = builder.templateId;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Script create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModify
     */
    public String getGmtModify() {
        return this.gmtModify;
    }

    /**
     * @return input
     */
    public java.util.List < Input> getInput() {
        return this.input;
    }

    /**
     * @return output
     */
    public java.util.List < Output> getOutput() {
        return this.output;
    }

    /**
     * @return rules
     */
    public java.util.List < ScriptRule > getRules() {
        return this.rules;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private String content; 
        private String gmtCreate; 
        private String gmtModify; 
        private java.util.List < Input> input; 
        private java.util.List < Output> output; 
        private java.util.List < ScriptRule > rules; 
        private String scriptId; 
        private String templateId; 
        private String versionId; 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModify.
         */
        public Builder gmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }

        /**
         * Input.
         */
        public Builder input(java.util.List < Input> input) {
            this.input = input;
            return this;
        }

        /**
         * Output.
         */
        public Builder output(java.util.List < Output> output) {
            this.output = output;
            return this;
        }

        /**
         * Rules.
         */
        public Builder rules(java.util.List < ScriptRule > rules) {
            this.rules = rules;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public Script build() {
            return new Script(this);
        } 

    } 

    public static class Input extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Sample")
        private String sample;

        @NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.sample = builder.sample;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sample
         */
        public String getSample() {
            return this.sample;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String sample; 
            private String type; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * Sample.
             */
            public Builder sample(String sample) {
                this.sample = sample;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    public static class Output extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Sample")
        private String sample;

        @NameInMap("Type")
        private String type;

        private Output(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.sample = builder.sample;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sample
         */
        public String getSample() {
            return this.sample;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String sample; 
            private String type; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * Sample.
             */
            public Builder sample(String sample) {
                this.sample = sample;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
}
