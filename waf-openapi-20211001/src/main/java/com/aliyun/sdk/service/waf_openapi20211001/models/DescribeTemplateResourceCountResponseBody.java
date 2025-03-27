// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeTemplateResourceCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTemplateResourceCountResponseBody</p>
 */
public class DescribeTemplateResourceCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceCount")
    private java.util.List<ResourceCount> resourceCount;

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
     * @return resourceCount
     */
    public java.util.List<ResourceCount> getResourceCount() {
        return this.resourceCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResourceCount> resourceCount; 

        private Builder() {
        } 

        private Builder(DescribeTemplateResourceCountResponseBody model) {
            this.requestId = model.requestId;
            this.resourceCount = model.resourceCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B8064433-9781-5E86-806E-C1DD****1D95</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of protected objects or protected object groups for which the protection template takes effect.</p>
         */
        public Builder resourceCount(java.util.List<ResourceCount> resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }

        public DescribeTemplateResourceCountResponseBody build() {
            return new DescribeTemplateResourceCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTemplateResourceCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTemplateResourceCountResponseBody</p>
     */
    public static class ResourceCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupCount")
        private Integer groupCount;

        @com.aliyun.core.annotation.NameInMap("SingleCount")
        private Integer singleCount;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
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

            private Builder() {
            } 

            private Builder(ResourceCount model) {
                this.groupCount = model.groupCount;
                this.singleCount = model.singleCount;
                this.templateId = model.templateId;
            } 

            /**
             * <p>The number of protected object groups.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder groupCount(Integer groupCount) {
                this.groupCount = groupCount;
                return this;
            }

            /**
             * <p>The number of protected objects.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder singleCount(Integer singleCount) {
                this.singleCount = singleCount;
                return this;
            }

            /**
             * <p>The ID of the protection template.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
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
