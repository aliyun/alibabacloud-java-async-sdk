// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListApplicationGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationGroupsResponseBody</p>
 */
public class ListApplicationGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationGroups")
    private java.util.List<ApplicationGroups> applicationGroups;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListApplicationGroupsResponseBody(Builder builder) {
        this.applicationGroups = builder.applicationGroups;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationGroups
     */
    public java.util.List<ApplicationGroups> getApplicationGroups() {
        return this.applicationGroups;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ApplicationGroups> applicationGroups; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListApplicationGroupsResponseBody model) {
            this.applicationGroups = model.applicationGroups;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the application group.</p>
         */
        public Builder applicationGroups(java.util.List<ApplicationGroups> applicationGroups) {
            this.applicationGroups = applicationGroups;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>69D97BF2-5DF2-544C-A650-36A474E17BC3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListApplicationGroupsResponseBody build() {
            return new ListApplicationGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationGroupsResponseBody</p>
     */
    public static class ApplicationGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("CmsGroupId")
        private String cmsGroupId;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("DeployParameters")
        private String deployParameters;

        @com.aliyun.core.annotation.NameInMap("DeployRegionId")
        private String deployRegionId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ImportTagKey")
        private String importTagKey;

        @com.aliyun.core.annotation.NameInMap("ImportTagValue")
        private String importTagValue;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private ApplicationGroups(Builder builder) {
            this.applicationName = builder.applicationName;
            this.cmsGroupId = builder.cmsGroupId;
            this.createDate = builder.createDate;
            this.deployParameters = builder.deployParameters;
            this.deployRegionId = builder.deployRegionId;
            this.description = builder.description;
            this.importTagKey = builder.importTagKey;
            this.importTagValue = builder.importTagValue;
            this.name = builder.name;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationGroups create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return cmsGroupId
         */
        public String getCmsGroupId() {
            return this.cmsGroupId;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return deployParameters
         */
        public String getDeployParameters() {
            return this.deployParameters;
        }

        /**
         * @return deployRegionId
         */
        public String getDeployRegionId() {
            return this.deployRegionId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return importTagKey
         */
        public String getImportTagKey() {
            return this.importTagKey;
        }

        /**
         * @return importTagValue
         */
        public String getImportTagValue() {
            return this.importTagValue;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String applicationName; 
            private String cmsGroupId; 
            private String createDate; 
            private String deployParameters; 
            private String deployRegionId; 
            private String description; 
            private String importTagKey; 
            private String importTagValue; 
            private String name; 
            private String status; 
            private String statusReason; 
            private String updateDate; 

            private Builder() {
            } 

            private Builder(ApplicationGroups model) {
                this.applicationName = model.applicationName;
                this.cmsGroupId = model.cmsGroupId;
                this.createDate = model.createDate;
                this.deployParameters = model.deployParameters;
                this.deployRegionId = model.deployRegionId;
                this.description = model.description;
                this.importTagKey = model.importTagKey;
                this.importTagValue = model.importTagValue;
                this.name = model.name;
                this.status = model.status;
                this.statusReason = model.statusReason;
                this.updateDate = model.updateDate;
            } 

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>MyApplication</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The ID of the application group in CloudMonitor.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678</p>
             */
            public Builder cmsGroupId(String cmsGroupId) {
                this.cmsGroupId = cmsGroupId;
                return this;
            }

            /**
             * <p>The time when the application group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-07T10:28:25Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The configuration information of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>{   &quot;TemplateURL&quot;: &quot;<a href="https://ros-template.oss-cn-zhangjiakou.aliyuncs.com/App_Management_Existing_Vpc_Ecs_Instance.json">https://ros-template.oss-cn-zhangjiakou.aliyuncs.com/App_Management_Existing_Vpc_Ecs_Instance.json</a>&quot;,   &quot;Parameters&quot;: {     &quot;ZoneId&quot;: &quot;cn-hangzhou-k&quot;,     &quot;ProjectName&quot;: &quot;test&quot;,     &quot;SystemDiskSize&quot;: 40,     &quot;InstanceChargeType&quot;: &quot;PostPaid&quot;,     &quot;SecurityGroupId&quot;: &quot;sg-bp1a4374akk63jl8tddy&quot;,     &quot;VSwitchId&quot;: &quot;vsw-bp1fcvc3zn0jrag86rrlm&quot;,     &quot;SystemDiskCategory&quot;: &quot;cloud_essd&quot;,     &quot;InstancePassword&quot;: &quot;******&quot;,     &quot;InternetChargeType&quot;: &quot;PayByTraffic&quot;,     &quot;InstanceCount&quot;: 1,     &quot;InternetMaxBandwidthOut&quot;: 0,     &quot;VpcId&quot;: &quot;vpc-bp1i99boyas8i8m9t3skp&quot;,     &quot;EcsImageId&quot;: &quot;centos_8_5_x64_20G_alibase_20211228.vhd&quot;,     &quot;DataDiskSize&quot;: 100,     &quot;EcsInstanceType&quot;: &quot;ecs.s6-c1m4.small&quot;,     &quot;DataDiskCategory&quot;: &quot;cloud_efficiency&quot;,     &quot;EnvironmentCommandId&quot;: &quot;c-hz028fc3g031gcg&quot;   },   &quot;RegionId&quot;: &quot;cn-hangzhou&quot;,   &quot;StackName&quot;: &quot;stack-1645688523068-3no_AKhOJ&quot;,   &quot;DisableRollback&quot;: true }</p>
             */
            public Builder deployParameters(String deployParameters) {
                this.deployParameters = deployParameters;
                return this;
            }

            /**
             * <p>The ID of the region in which the related resources reside.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder deployRegionId(String deployRegionId) {
                this.deployRegionId = deployRegionId;
                return this;
            }

            /**
             * <p>The description of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>ApplicationGroup</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder importTagKey(String importTagKey) {
                this.importTagKey = importTagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder importTagValue(String importTagValue) {
                this.importTagValue = importTagValue;
                return this;
            }

            /**
             * <p>The name of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>UpdateMyApplicationGroup</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The state of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The state information of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>ApplicationGroup is Created.</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * <p>The time when the application group was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-08T03:01:53Z</p>
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public ApplicationGroups build() {
                return new ApplicationGroups(this);
            } 

        } 

    }
}
