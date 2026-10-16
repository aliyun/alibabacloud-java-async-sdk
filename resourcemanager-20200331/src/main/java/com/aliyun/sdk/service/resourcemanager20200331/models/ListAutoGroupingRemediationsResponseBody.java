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
         * <p>The number of entries per page.</p>
         * <p>Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The remediation records.</p>
         */
        public Builder remediations(java.util.List<Remediations> remediations) {
            this.remediations = remediations;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6F959E33-7B6D-5F58-BB0B-ED616DC7C70B</p>
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
             * <p>The resource group name.</p>
             * 
             * <strong>example:</strong>
             * <p>ProjectA</p>
             */
            public Builder resourceGroupDisplayName(String resourceGroupDisplayName) {
                this.resourceGroupDisplayName = resourceGroupDisplayName;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmygrk****wfa</p>
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
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The remediation record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0028d4****cfe94956ef6708a373f396fbc840e306f</p>
             */
            public Builder remediationId(String remediationId) {
                this.remediationId = remediationId;
                return this;
            }

            /**
             * <p>The remediation time. The format is YYYY-MM-DD HH:mm:ss without a time zone identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-01 00:00:00</p>
             */
            public Builder remediationTime(String remediationTime) {
                this.remediationTime = remediationTime;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-uf664f66v1****drkea4</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * <p>You can obtain the resource type from the <strong>Resource Type</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Cloud services that support resource groups</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The cloud service ID.</p>
             * <p>You can obtain the cloud service ID from the <strong>Cloud Service Code</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Cloud services that support resource groups</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * <p>The information about the target resource group for remediation.</p>
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
