// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdvicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdvicesResponseBody</p>
 */
public class DescribeAdvicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAdvicesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdvicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAdvicesResponseBody build() {
            return new DescribeAdvicesResponseBody(this);
        } 

    } 

    public static class Advice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunId")
        private Long aliyunId;

        @com.aliyun.core.annotation.NameInMap("CheckId")
        private String checkId;

        @com.aliyun.core.annotation.NameInMap("CheckName")
        private String checkName;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsExpired")
        private Boolean isExpired;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private Integer severity;

        private Advice(Builder builder) {
            this.aliyunId = builder.aliyunId;
            this.checkId = builder.checkId;
            this.checkName = builder.checkName;
            this.content = builder.content;
            this.description = builder.description;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.isExpired = builder.isExpired;
            this.product = builder.product;
            this.resource = builder.resource;
            this.resourceId = builder.resourceId;
            this.severity = builder.severity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Advice create() {
            return builder().build();
        }

        /**
         * @return aliyunId
         */
        public Long getAliyunId() {
            return this.aliyunId;
        }

        /**
         * @return checkId
         */
        public String getCheckId() {
            return this.checkId;
        }

        /**
         * @return checkName
         */
        public String getCheckName() {
            return this.checkName;
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
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isExpired
         */
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return severity
         */
        public Integer getSeverity() {
            return this.severity;
        }

        public static final class Builder {
            private Long aliyunId; 
            private String checkId; 
            private String checkName; 
            private String content; 
            private String description; 
            private String gmtCreated; 
            private String gmtModified; 
            private Long id; 
            private Boolean isExpired; 
            private String product; 
            private String resource; 
            private String resourceId; 
            private Integer severity; 

            /**
             * AliyunId.
             */
            public Builder aliyunId(Long aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

            /**
             * CheckId.
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * CheckName.
             */
            public Builder checkName(String checkName) {
                this.checkName = checkName;
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
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * ID
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IsExpired.
             */
            public Builder isExpired(Boolean isExpired) {
                this.isExpired = isExpired;
                return this;
            }

            /**
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * Resource.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(Integer severity) {
                this.severity = severity;
                return this;
            }

            public Advice build() {
                return new Advice(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Advice")
        private java.util.List < Advice> advice;

        private Data(Builder builder) {
            this.advice = builder.advice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return advice
         */
        public java.util.List < Advice> getAdvice() {
            return this.advice;
        }

        public static final class Builder {
            private java.util.List < Advice> advice; 

            /**
             * Advice.
             */
            public Builder advice(java.util.List < Advice> advice) {
                this.advice = advice;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
