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
 * {@link GetResourceComplianceTimelineResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceComplianceTimelineResponseBody</p>
 */
public class GetResourceComplianceTimelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceComplianceTimeline")
    private ResourceComplianceTimeline resourceComplianceTimeline;

    private GetResourceComplianceTimelineResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceComplianceTimeline = builder.resourceComplianceTimeline;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceComplianceTimelineResponseBody create() {
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
     * @return resourceComplianceTimeline
     */
    public ResourceComplianceTimeline getResourceComplianceTimeline() {
        return this.resourceComplianceTimeline;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceComplianceTimeline resourceComplianceTimeline; 

        private Builder() {
        } 

        private Builder(GetResourceComplianceTimelineResponseBody model) {
            this.requestId = model.requestId;
            this.resourceComplianceTimeline = model.resourceComplianceTimeline;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8D53A78F-1EB8-4264-A554-72F07E34FAE6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the compliance timeline.</p>
         */
        public Builder resourceComplianceTimeline(ResourceComplianceTimeline resourceComplianceTimeline) {
            this.resourceComplianceTimeline = resourceComplianceTimeline;
            return this;
        }

        public GetResourceComplianceTimelineResponseBody build() {
            return new GetResourceComplianceTimelineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceComplianceTimelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceComplianceTimelineResponseBody</p>
     */
    public static class ComplianceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AvailabilityZone")
        private String availabilityZone;

        @com.aliyun.core.annotation.NameInMap("CaptureTime")
        private Long captureTime;

        @com.aliyun.core.annotation.NameInMap("Configuration")
        private String configuration;

        @com.aliyun.core.annotation.NameInMap("ConfigurationDiff")
        private String configurationDiff;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceCreateTime")
        private Long resourceCreateTime;

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

        private ComplianceList(Builder builder) {
            this.accountId = builder.accountId;
            this.availabilityZone = builder.availabilityZone;
            this.captureTime = builder.captureTime;
            this.configuration = builder.configuration;
            this.configurationDiff = builder.configurationDiff;
            this.region = builder.region;
            this.resourceCreateTime = builder.resourceCreateTime;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceStatus = builder.resourceStatus;
            this.resourceType = builder.resourceType;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComplianceList create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return availabilityZone
         */
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        /**
         * @return captureTime
         */
        public Long getCaptureTime() {
            return this.captureTime;
        }

        /**
         * @return configuration
         */
        public String getConfiguration() {
            return this.configuration;
        }

        /**
         * @return configurationDiff
         */
        public String getConfigurationDiff() {
            return this.configurationDiff;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceCreateTime
         */
        public Long getResourceCreateTime() {
            return this.resourceCreateTime;
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
            private String accountId; 
            private String availabilityZone; 
            private Long captureTime; 
            private String configuration; 
            private String configurationDiff; 
            private String region; 
            private Long resourceCreateTime; 
            private String resourceId; 
            private String resourceName; 
            private String resourceStatus; 
            private String resourceType; 
            private String tags; 

            private Builder() {
            } 

            private Builder(ComplianceList model) {
                this.accountId = model.accountId;
                this.availabilityZone = model.availabilityZone;
                this.captureTime = model.captureTime;
                this.configuration = model.configuration;
                this.configurationDiff = model.configurationDiff;
                this.region = model.region;
                this.resourceCreateTime = model.resourceCreateTime;
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
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The ID of the zone in which the resource resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-f</p>
             */
            public Builder availabilityZone(String availabilityZone) {
                this.availabilityZone = availabilityZone;
                return this;
            }

            /**
             * <p>The timestamp when the compliance evaluation was recorded. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1625200295276</p>
             */
            public Builder captureTime(Long captureTime) {
                this.captureTime = captureTime;
                return this;
            }

            /**
             * <p>The rules associated with the resource and the compliance details of the rules.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Compliance&quot;:{&quot;complianceType&quot;:&quot;COMPLIANT&quot;,&quot;count&quot;:1},&quot;ConfigRuleList&quot;:[{&quot;accountId&quot;:100931896542****,&quot;configRuleId&quot;:&quot;cr-9524626622af003d****&quot;,&quot;configRuleArn&quot;:&quot;acs:config::100931896542****:rule/cr-9524626622af003d****&quot;,&quot;configRuleName&quot;:&quot;test-rule-name&quot;,&quot;complianceType&quot;:&quot;COMPLIANT&quot;,&quot;riskLevel&quot;:1,&quot;annotation&quot;:&quot;&quot;,&quot;invokingEventMessageType&quot;:&quot;ScheduledNotification&quot;}]}</p>
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>The details of the resource changes that trigger the compliance evaluation.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;test-rule-name&quot;:[{&quot;accountId&quot;:100931896542****,&quot;configRuleId&quot;:&quot;cr-965f626622af003d****&quot;,&quot;configRuleArn&quot;:&quot;acs:config::100931896542****:rule/cr-965f626622af003d****&quot;,&quot;configRuleName&quot;:&quot;test-rule-name&quot;,&quot;complianceType&quot;:&quot;COMPLIANT&quot;,&quot;riskLevel&quot;:1,&quot;annotation&quot;:&quot;&quot;,&quot;invokingEventMessageType&quot;:&quot;ScheduledNotification&quot;},{}]}</p>
             */
            public Builder configurationDiff(String configurationDiff) {
                this.configurationDiff = configurationDiff;
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
             * <p>The time when the resource was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1624961112000</p>
             */
            public Builder resourceCreateTime(Long resourceCreateTime) {
                this.resourceCreateTime = resourceCreateTime;
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
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>new-bucket</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The status of the resource. The parameter value varies based on the resource type and may be left empty. Examples:</p>
             * <ul>
             * <li>If the ResourceType parameter is set to ACS::ECS::Instance, the resource is an Elastic Compute Service (ECS) instance that has a specific state. In this case, the valid values of this parameter are Running and Stopped.</li>
             * <li>If the ResourceType parameter is ACS::OSS::Bucket, the resource is an Object Storage Service (OSS) bucket that is not in a specific state. In this case, this parameter is left empty.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::OSS::Bucket</p>
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

            public ComplianceList build() {
                return new ComplianceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceComplianceTimelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceComplianceTimelineResponseBody</p>
     */
    public static class ResourceComplianceTimeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplianceList")
        private java.util.List<ComplianceList> complianceList;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        private ResourceComplianceTimeline(Builder builder) {
            this.complianceList = builder.complianceList;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceComplianceTimeline create() {
            return builder().build();
        }

        /**
         * @return complianceList
         */
        public java.util.List<ComplianceList> getComplianceList() {
            return this.complianceList;
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

        public static final class Builder {
            private java.util.List<ComplianceList> complianceList; 
            private Integer maxResults; 
            private String nextToken; 

            private Builder() {
            } 

            private Builder(ResourceComplianceTimeline model) {
                this.complianceList = model.complianceList;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
            } 

            /**
             * <p>The compliance evaluation records on the compliance timeline.</p>
             */
            public Builder complianceList(java.util.List<ComplianceList> complianceList) {
                this.complianceList = complianceList;
                return this;
            }

            /**
             * <p>The maximum number of entries that can be returned for a single request.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The token that is used to initiate the next request.</p>
             * 
             * <strong>example:</strong>
             * <p>5OVS5J4I1/UKTkHV5oNs****</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public ResourceComplianceTimeline build() {
                return new ResourceComplianceTimeline(this);
            } 

        } 

    }
}
