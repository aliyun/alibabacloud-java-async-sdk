// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetAggregateDiscoveredResourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateDiscoveredResourceResponseBody</p>
 */
public class GetAggregateDiscoveredResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiscoveredResourceDetail")
    private DiscoveredResourceDetail discoveredResourceDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAggregateDiscoveredResourceResponseBody(Builder builder) {
        this.discoveredResourceDetail = builder.discoveredResourceDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateDiscoveredResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return discoveredResourceDetail
     */
    public DiscoveredResourceDetail getDiscoveredResourceDetail() {
        return this.discoveredResourceDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DiscoveredResourceDetail discoveredResourceDetail; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAggregateDiscoveredResourceResponseBody model) {
            this.discoveredResourceDetail = model.discoveredResourceDetail;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the resource.</p>
         */
        public Builder discoveredResourceDetail(DiscoveredResourceDetail discoveredResourceDetail) {
            this.discoveredResourceDetail = discoveredResourceDetail;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E4D71ACE-6B0A-46E0-8352-56952378CC7F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAggregateDiscoveredResourceResponseBody build() {
            return new GetAggregateDiscoveredResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAggregateDiscoveredResourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregateDiscoveredResourceResponseBody</p>
     */
    public static class DiscoveredResourceDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AvailabilityZone")
        private String availabilityZone;

        @com.aliyun.core.annotation.NameInMap("ComplianceType")
        private String complianceType;

        @com.aliyun.core.annotation.NameInMap("Configuration")
        private String configuration;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceCreationTime")
        private Long resourceCreationTime;

        @com.aliyun.core.annotation.NameInMap("ResourceDeleted")
        private Integer resourceDeleted;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceStatus")
        private String resourceStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        private DiscoveredResourceDetail(Builder builder) {
            this.accountId = builder.accountId;
            this.availabilityZone = builder.availabilityZone;
            this.complianceType = builder.complianceType;
            this.configuration = builder.configuration;
            this.region = builder.region;
            this.resourceCreationTime = builder.resourceCreationTime;
            this.resourceDeleted = builder.resourceDeleted;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceStatus = builder.resourceStatus;
            this.resourceType = builder.resourceType;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiscoveredResourceDetail create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return availabilityZone
         */
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        /**
         * @return complianceType
         */
        public String getComplianceType() {
            return this.complianceType;
        }

        /**
         * @return configuration
         */
        public String getConfiguration() {
            return this.configuration;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceCreationTime
         */
        public Long getResourceCreationTime() {
            return this.resourceCreationTime;
        }

        /**
         * @return resourceDeleted
         */
        public Integer getResourceDeleted() {
            return this.resourceDeleted;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceStatus
         */
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long accountId; 
            private String availabilityZone; 
            private String complianceType; 
            private String configuration; 
            private String region; 
            private Long resourceCreationTime; 
            private Integer resourceDeleted; 
            private String resourceId; 
            private String resourceName; 
            private String resourceStatus; 
            private String resourceType; 
            private String tags; 

            private Builder() {
            } 

            private Builder(DiscoveredResourceDetail model) {
                this.accountId = model.accountId;
                this.availabilityZone = model.availabilityZone;
                this.complianceType = model.complianceType;
                this.configuration = model.configuration;
                this.region = model.region;
                this.resourceCreationTime = model.resourceCreationTime;
                this.resourceDeleted = model.resourceDeleted;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.resourceStatus = model.resourceStatus;
                this.resourceType = model.resourceType;
                this.tags = model.tags;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The ID of the zone in which the resource resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder availabilityZone(String availabilityZone) {
                this.availabilityZone = availabilityZone;
                return this;
            }

            /**
             * <p>The compliance evaluation result of the resource. Valid values:</p>
             * <ul>
             * <li>COMPLIANT: The resource is evaluated as compliant.</li>
             * <li>NON_COMPLIANT: The resource is evaluated as non-compliant.</li>
             * <li>NOT_APPLICABLE: The rule does not apply to the resource.</li>
             * <li>INSUFFICIENT_DATA: No data is available.</li>
             * <li>IGNORED: The resource is ignored during compliance evaluation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLIANT</p>
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * <p>The configuration of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;AccessControlList&quot;:{&quot;Grant&quot;:&quot;private&quot;},&quot;ServerSideEncryptionRule&quot;:{&quot;SSEAlgorithm&quot;:&quot;None&quot;},&quot;Comment&quot;:&quot;&quot;,&quot;CreationDate&quot;:&quot;2021-06-29T10:05:12.000Z&quot;,&quot;Owner&quot;:{&quot;DisplayName&quot;:&quot;100931896542****&quot;,&quot;ID&quot;:&quot;100931896542****&quot;},&quot;StorageClass&quot;:&quot;Standard&quot;,&quot;DataRedundancyType&quot;:&quot;LRS&quot;,&quot;AllowEmptyReferer&quot;:&quot;true&quot;,&quot;Name&quot;:&quot;new-bucket&quot;,&quot;BucketPolicy&quot;:{&quot;LogPrefix&quot;:&quot;&quot;,&quot;LogBucket&quot;:&quot;&quot;},&quot;ExtranetEndpoint&quot;:&quot;oss-cn-hangzhou.aliyuncs.com&quot;,&quot;IntranetEndpoint&quot;:&quot;oss-cn-hangzhou-internal.aliyuncs.com&quot;,&quot;Location&quot;:&quot;oss-cn-hangzhou&quot;}</p>
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The timestamp when the resource was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1624961112000</p>
             */
            public Builder resourceCreationTime(Long resourceCreationTime) {
                this.resourceCreationTime = resourceCreationTime;
                return this;
            }

            /**
             * <p>Indicates whether the resource was deleted. Valid values:</p>
             * <ul>
             * <li>1: The resource was not deleted.</li>
             * <li>0: The resource was deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder resourceDeleted(Integer resourceDeleted) {
                this.resourceDeleted = resourceDeleted;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>new-bucket</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>new-bucket</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The status of the resource. The value of this parameter varies based on the resource type and may be empty.</p>
             * <ul>
             * <li>If the ResourceType parameter is set to ACS::ECS::Instance, the resource is an ECS instance that has a specific state. In this case, the valid values of this parameter are Running and Stopped.</li>
             * <li>If the ResourceType parameter is ACS::OSS::Bucket, the resource is an Object Storage Service (OSS) bucket that is not in a specific state. In this case, this parameter is left empty.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>offline</p>
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::OSS::BucketACS::CDN::Domain</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The tags of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;&quot;hc&quot;&quot;:[&quot;&quot;value2&quot;&quot;]}</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            public DiscoveredResourceDetail build() {
                return new DiscoveredResourceDetail(this);
            } 

        } 

    }
}
