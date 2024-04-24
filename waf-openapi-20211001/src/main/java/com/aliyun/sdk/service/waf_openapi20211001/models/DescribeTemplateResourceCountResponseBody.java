// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplateResourceCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTemplateResourceCountResponseBody</p>
 */
public class DescribeTemplateResourceCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceCount")
    private java.util.List < ResourceCount> resourceCount;

    private DescribeTemplateResourceCountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceCount = builder.resourceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplateResourceCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceCount
     */
    public java.util.List < ResourceCount> getResourceCount() {
        return this.resourceCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResourceCount> resourceCount; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of protected objects or protected object groups for which the protection template takes effect.
         */
        public Builder resourceCount(java.util.List < ResourceCount> resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }

        public DescribeTemplateResourceCountResponseBody build() {
            return new DescribeTemplateResourceCountResponseBody(this);
        } 

    } 

    public static class ResourceCount extends TeaModel {
        @NameInMap("GroupCount")
        private Integer groupCount;

        @NameInMap("SingleCount")
        private Integer singleCount;

        @NameInMap("TemplateId")
        private Long templateId;

        private ResourceCount(Builder builder) {
            this.groupCount = builder.groupCount;
            this.singleCount = builder.singleCount;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceCount create() {
            return builder().build();
        }

        /**
         * @return groupCount
         */
        public Integer getGroupCount() {
            return this.groupCount;
        }

        /**
         * @return singleCount
         */
        public Integer getSingleCount() {
            return this.singleCount;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private Integer groupCount; 
            private Integer singleCount; 
            private Long templateId; 

            /**
             * The number of protected object groups.
             */
            public Builder groupCount(Integer groupCount) {
                this.groupCount = groupCount;
                return this;
            }

            /**
             * The number of protected objects.
             */
            public Builder singleCount(Integer singleCount) {
                this.singleCount = singleCount;
                return this;
            }

            /**
             * The ID of the protection template.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public ResourceCount build() {
                return new ResourceCount(this);
            } 

        } 

    }
}
