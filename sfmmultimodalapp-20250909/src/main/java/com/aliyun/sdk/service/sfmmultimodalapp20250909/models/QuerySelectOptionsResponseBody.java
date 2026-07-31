// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link QuerySelectOptionsResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySelectOptionsResponseBody</p>
 */
public class QuerySelectOptionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SelectOptions")
    private java.util.List<SelectOptions> selectOptions;

    private QuerySelectOptionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.selectOptions = builder.selectOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySelectOptionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return selectOptions
     */
    public java.util.List<SelectOptions> getSelectOptions() {
        return this.selectOptions;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SelectOptions> selectOptions; 

        private Builder() {
        } 

        private Builder(QuerySelectOptionsResponseBody model) {
            this.requestId = model.requestId;
            this.selectOptions = model.selectOptions;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>EDD6123F-0122-5FBF-9A7E-097F319CF478</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SelectOptions.
         */
        public Builder selectOptions(java.util.List<SelectOptions> selectOptions) {
            this.selectOptions = selectOptions;
            return this;
        }

        public QuerySelectOptionsResponseBody build() {
            return new QuerySelectOptionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySelectOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySelectOptionsResponseBody</p>
     */
    public static class Children extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizConfig")
        private java.util.Map<String, ?> bizConfig;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<String> tags;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Children(Builder builder) {
            this.bizConfig = builder.bizConfig;
            this.category = builder.category;
            this.description = builder.description;
            this.label = builder.label;
            this.tags = builder.tags;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Children create() {
            return builder().build();
        }

        /**
         * @return bizConfig
         */
        public java.util.Map<String, ?> getBizConfig() {
            return this.bizConfig;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.Map<String, ?> bizConfig; 
            private String category; 
            private String description; 
            private String label; 
            private java.util.List<String> tags; 
            private String value; 

            private Builder() {
            } 

            private Builder(Children model) {
                this.bizConfig = model.bizConfig;
                this.category = model.category;
                this.description = model.description;
                this.label = model.label;
                this.tags = model.tags;
                this.value = model.value;
            } 

            /**
             * BizConfig.
             */
            public Builder bizConfig(java.util.Map<String, ?> bizConfig) {
                this.bizConfig = bizConfig;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
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
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Children build() {
                return new Children(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySelectOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySelectOptionsResponseBody</p>
     */
    public static class SelectOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizConfig")
        private java.util.Map<String, ?> bizConfig;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Children")
        private java.util.List<Children> children;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<String> tags;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SelectOptions(Builder builder) {
            this.bizConfig = builder.bizConfig;
            this.category = builder.category;
            this.children = builder.children;
            this.description = builder.description;
            this.label = builder.label;
            this.tags = builder.tags;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectOptions create() {
            return builder().build();
        }

        /**
         * @return bizConfig
         */
        public java.util.Map<String, ?> getBizConfig() {
            return this.bizConfig;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return children
         */
        public java.util.List<Children> getChildren() {
            return this.children;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.Map<String, ?> bizConfig; 
            private String category; 
            private java.util.List<Children> children; 
            private String description; 
            private String label; 
            private java.util.List<String> tags; 
            private String value; 

            private Builder() {
            } 

            private Builder(SelectOptions model) {
                this.bizConfig = model.bizConfig;
                this.category = model.category;
                this.children = model.children;
                this.description = model.description;
                this.label = model.label;
                this.tags = model.tags;
                this.value = model.value;
            } 

            /**
             * BizConfig.
             */
            public Builder bizConfig(java.util.Map<String, ?> bizConfig) {
                this.bizConfig = bizConfig;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Children.
             */
            public Builder children(java.util.List<Children> children) {
                this.children = children;
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
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SelectOptions build() {
                return new SelectOptions(this);
            } 

        } 

    }
}
