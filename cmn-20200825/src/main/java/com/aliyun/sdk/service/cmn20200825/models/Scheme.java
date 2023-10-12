// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Scheme} extends {@link TeaModel}
 *
 * <p>Scheme</p>
 */
public class Scheme extends TeaModel {
    @NameInMap("Category")
    private String category;

    @NameInMap("Content")
    private String content;

    @NameInMap("Description")
    private String description;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModify")
    private String gmtModify;

    @NameInMap("Input")
    private java.util.List < Input> input;

    @NameInMap("Output")
    private java.util.List < Output> output;

    @NameInMap("SchemeId")
    private String schemeId;

    @NameInMap("SchemeName")
    private String schemeName;

    @NameInMap("Status")
    private String status;

    @NameInMap("View")
    private String view;

    private Scheme(Builder builder) {
        this.category = builder.category;
        this.content = builder.content;
        this.description = builder.description;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModify = builder.gmtModify;
        this.input = builder.input;
        this.output = builder.output;
        this.schemeId = builder.schemeId;
        this.schemeName = builder.schemeName;
        this.status = builder.status;
        this.view = builder.view;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Scheme create() {
        return builder().build();
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return schemeId
     */
    public String getSchemeId() {
        return this.schemeId;
    }

    /**
     * @return schemeName
     */
    public String getSchemeName() {
        return this.schemeName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return view
     */
    public String getView() {
        return this.view;
    }

    public static final class Builder {
        private String category; 
        private String content; 
        private String description; 
        private String gmtCreate; 
        private String gmtModify; 
        private java.util.List < Input> input; 
        private java.util.List < Output> output; 
        private String schemeId; 
        private String schemeName; 
        private String status; 
        private String view; 

        /**
         * Category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * SchemeId.
         */
        public Builder schemeId(String schemeId) {
            this.schemeId = schemeId;
            return this;
        }

        /**
         * SchemeName.
         */
        public Builder schemeName(String schemeName) {
            this.schemeName = schemeName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * View.
         */
        public Builder view(String view) {
            this.view = view;
            return this;
        }

        public Scheme build() {
            return new Scheme(this);
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
