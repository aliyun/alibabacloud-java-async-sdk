// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeRuleMetadataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleMetadataResponseBody</p>
 */
public class DescribeRuleMetadataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Datas")
    private java.util.List<Datas> datas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRuleMetadataResponseBody(Builder builder) {
        this.datas = builder.datas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleMetadataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datas
     */
    public java.util.List<Datas> getDatas() {
        return this.datas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Datas> datas; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRuleMetadataResponseBody model) {
            this.datas = model.datas;
            this.requestId = model.requestId;
        } 

        /**
         * Datas.
         */
        public Builder datas(java.util.List<Datas> datas) {
            this.datas = datas;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRuleMetadataResponseBody build() {
            return new DescribeRuleMetadataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRuleMetadataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRuleMetadataResponseBody</p>
     */
    public static class Children extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Children(Builder builder) {
            this.text = builder.text;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Children create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String text; 
            private String value; 

            private Builder() {
            } 

            private Builder(Children model) {
                this.text = model.text;
                this.value = model.value;
            } 

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
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
     * {@link DescribeRuleMetadataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRuleMetadataResponseBody</p>
     */
    public static class Datas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Children")
        private java.util.List<Children> children;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Datas(Builder builder) {
            this.children = builder.children;
            this.text = builder.text;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datas create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List<Children> getChildren() {
            return this.children;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.List<Children> children; 
            private String text; 
            private String value; 

            private Builder() {
            } 

            private Builder(Datas model) {
                this.children = model.children;
                this.text = model.text;
                this.value = model.value;
            } 

            /**
             * Children.
             */
            public Builder children(java.util.List<Children> children) {
                this.children = children;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Datas build() {
                return new Datas(this);
            } 

        } 

    }
}
