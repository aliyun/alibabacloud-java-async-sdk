// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link ListAutoGroupingRemediationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAutoGroupingRemediationsResponseBody</p>
 */
public class ListAutoGroupingRemediationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Remediations")
    private java.util.List<Remediations> remediations;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAutoGroupingRemediationsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.remediations = builder.remediations;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAutoGroupingRemediationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return remediations
     */
    public java.util.List<Remediations> getRemediations() {
        return this.remediations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<Remediations> remediations; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAutoGroupingRemediationsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.remediations = model.remediations;
            this.requestId = model.requestId;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Remediations.
         */
        public Builder remediations(java.util.List<Remediations> remediations) {
            this.remediations = remediations;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAutoGroupingRemediationsResponseBody build() {
            return new ListAutoGroupingRemediationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAutoGroupingRemediationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoGroupingRemediationsResponseBody</p>
     */
    public static class TargetResourceGroupInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroupDisplayName")
        private String resourceGroupDisplayName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private TargetResourceGroupInfo(Builder builder) {
            this.resourceGroupDisplayName = builder.resourceGroupDisplayName;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetResourceGroupInfo create() {
            return builder().build();
        }

        /**
         * @return resourceGroupDisplayName
         */
        public String getResourceGroupDisplayName() {
            return this.resourceGroupDisplayName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private String resourceGroupDisplayName; 
            private String resourceGroupId; 

            private Builder() {
            } 

            private Builder(TargetResourceGroupInfo model) {
                this.resourceGroupDisplayName = model.resourceGroupDisplayName;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * ResourceGroupDisplayName.
             */
            public Builder resourceGroupDisplayName(String resourceGroupDisplayName) {
                this.resourceGroupDisplayName = resourceGroupDisplayName;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public TargetResourceGroupInfo build() {
                return new TargetResourceGroupInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAutoGroupingRemediationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoGroupingRemediationsResponseBody</p>
     */
    public static class Remediations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RemediationId")
        private String remediationId;

        @com.aliyun.core.annotation.NameInMap("RemediationTime")
        private String remediationTime;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Service")
        private String service;

        @com.aliyun.core.annotation.NameInMap("TargetResourceGroupInfo")
        private TargetResourceGroupInfo targetResourceGroupInfo;

        private Remediations(Builder builder) {
            this.regionId = builder.regionId;
            this.remediationId = builder.remediationId;
            this.remediationTime = builder.remediationTime;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.service = builder.service;
            this.targetResourceGroupInfo = builder.targetResourceGroupInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Remediations create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return remediationId
         */
        public String getRemediationId() {
            return this.remediationId;
        }

        /**
         * @return remediationTime
         */
        public String getRemediationTime() {
            return this.remediationTime;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        /**
         * @return targetResourceGroupInfo
         */
        public TargetResourceGroupInfo getTargetResourceGroupInfo() {
            return this.targetResourceGroupInfo;
        }

        public static final class Builder {
            private String regionId; 
            private String remediationId; 
            private String remediationTime; 
            private String resourceId; 
            private String resourceType; 
            private String service; 
            private TargetResourceGroupInfo targetResourceGroupInfo; 

            private Builder() {
            } 

            private Builder(Remediations model) {
                this.regionId = model.regionId;
                this.remediationId = model.remediationId;
                this.remediationTime = model.remediationTime;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.service = model.service;
                this.targetResourceGroupInfo = model.targetResourceGroupInfo;
            } 

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RemediationId.
             */
            public Builder remediationId(String remediationId) {
                this.remediationId = remediationId;
                return this;
            }

            /**
             * RemediationTime.
             */
            public Builder remediationTime(String remediationTime) {
                this.remediationTime = remediationTime;
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
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Service.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * TargetResourceGroupInfo.
             */
            public Builder targetResourceGroupInfo(TargetResourceGroupInfo targetResourceGroupInfo) {
                this.targetResourceGroupInfo = targetResourceGroupInfo;
                return this;
            }

            public Remediations build() {
                return new Remediations(this);
            } 

        } 

    }
}
