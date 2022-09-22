// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomerIssueCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomerIssueCategoryResponseBody</p>
 */
public class DescribeCustomerIssueCategoryResponseBody extends TeaModel {
    @NameInMap("IssueCategoryModelList")
    private java.util.List < IssueCategoryModelList> issueCategoryModelList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCustomerIssueCategoryResponseBody(Builder builder) {
        this.issueCategoryModelList = builder.issueCategoryModelList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomerIssueCategoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return issueCategoryModelList
     */
    public java.util.List < IssueCategoryModelList> getIssueCategoryModelList() {
        return this.issueCategoryModelList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < IssueCategoryModelList> issueCategoryModelList; 
        private String requestId; 

        /**
         * IssueCategoryModelList.
         */
        public Builder issueCategoryModelList(java.util.List < IssueCategoryModelList> issueCategoryModelList) {
            this.issueCategoryModelList = issueCategoryModelList;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCustomerIssueCategoryResponseBody build() {
            return new DescribeCustomerIssueCategoryResponseBody(this);
        } 

    } 

    public static class IssueCategoryModelList extends TeaModel {
        @NameInMap("IssueCategoryId")
        private Long issueCategoryId;

        @NameInMap("IssueCategoryName")
        private String issueCategoryName;

        @NameInMap("IssueCategoryParentId")
        private Long issueCategoryParentId;

        @NameInMap("Layer")
        private Long layer;

        @NameInMap("MappingTools")
        private String mappingTools;

        @NameInMap("MetricSetId")
        private String metricSetId;

        @NameInMap("ResourceType")
        private String resourceType;

        private IssueCategoryModelList(Builder builder) {
            this.issueCategoryId = builder.issueCategoryId;
            this.issueCategoryName = builder.issueCategoryName;
            this.issueCategoryParentId = builder.issueCategoryParentId;
            this.layer = builder.layer;
            this.mappingTools = builder.mappingTools;
            this.metricSetId = builder.metricSetId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IssueCategoryModelList create() {
            return builder().build();
        }

        /**
         * @return issueCategoryId
         */
        public Long getIssueCategoryId() {
            return this.issueCategoryId;
        }

        /**
         * @return issueCategoryName
         */
        public String getIssueCategoryName() {
            return this.issueCategoryName;
        }

        /**
         * @return issueCategoryParentId
         */
        public Long getIssueCategoryParentId() {
            return this.issueCategoryParentId;
        }

        /**
         * @return layer
         */
        public Long getLayer() {
            return this.layer;
        }

        /**
         * @return mappingTools
         */
        public String getMappingTools() {
            return this.mappingTools;
        }

        /**
         * @return metricSetId
         */
        public String getMetricSetId() {
            return this.metricSetId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private Long issueCategoryId; 
            private String issueCategoryName; 
            private Long issueCategoryParentId; 
            private Long layer; 
            private String mappingTools; 
            private String metricSetId; 
            private String resourceType; 

            /**
             * IssueCategoryId.
             */
            public Builder issueCategoryId(Long issueCategoryId) {
                this.issueCategoryId = issueCategoryId;
                return this;
            }

            /**
             * IssueCategoryName.
             */
            public Builder issueCategoryName(String issueCategoryName) {
                this.issueCategoryName = issueCategoryName;
                return this;
            }

            /**
             * IssueCategoryParentId.
             */
            public Builder issueCategoryParentId(Long issueCategoryParentId) {
                this.issueCategoryParentId = issueCategoryParentId;
                return this;
            }

            /**
             * Layer.
             */
            public Builder layer(Long layer) {
                this.layer = layer;
                return this;
            }

            /**
             * MappingTools.
             */
            public Builder mappingTools(String mappingTools) {
                this.mappingTools = mappingTools;
                return this;
            }

            /**
             * MetricSetId.
             */
            public Builder metricSetId(String metricSetId) {
                this.metricSetId = metricSetId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public IssueCategoryModelList build() {
                return new IssueCategoryModelList(this);
            } 

        } 

    }
}
