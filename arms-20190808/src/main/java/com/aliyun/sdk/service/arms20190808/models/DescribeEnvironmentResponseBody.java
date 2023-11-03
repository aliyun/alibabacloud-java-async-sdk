// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnvironmentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnvironmentResponseBody</p>
 */
public class DescribeEnvironmentResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeEnvironmentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnvironmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The status code or error code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned struct.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEnvironmentResponseBody build() {
            return new DescribeEnvironmentResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("BindResourceId")
        private String bindResourceId;

        @NameInMap("BindResourceProfile")
        private String bindResourceProfile;

        @NameInMap("BindResourceStatus")
        private String bindResourceStatus;

        @NameInMap("BindResourceStoreDuration")
        private String bindResourceStoreDuration;

        @NameInMap("BindResourceType")
        private String bindResourceType;

        @NameInMap("BindVpcCidr")
        private String bindVpcCidr;

        @NameInMap("EnvironmentId")
        private String environmentId;

        @NameInMap("EnvironmentName")
        private String environmentName;

        @NameInMap("EnvironmentSubType")
        private String environmentSubType;

        @NameInMap("EnvironmentType")
        private String environmentType;

        @NameInMap("GrafaDataSourceName")
        private String grafaDataSourceName;

        @NameInMap("GrafanaDatasourceUid")
        private String grafanaDatasourceUid;

        @NameInMap("GrafanaFolderTitle")
        private String grafanaFolderTitle;

        @NameInMap("GrafanaFolderUid")
        private String grafanaFolderUid;

        @NameInMap("GrafanaFolderUrl")
        private String grafanaFolderUrl;

        @NameInMap("PrometheusInstanceId")
        private String prometheusInstanceId;

        @NameInMap("PrometheusInstanceName")
        private String prometheusInstanceName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("VpcId")
        private String vpcId;

        private Data(Builder builder) {
            this.bindResourceId = builder.bindResourceId;
            this.bindResourceProfile = builder.bindResourceProfile;
            this.bindResourceStatus = builder.bindResourceStatus;
            this.bindResourceStoreDuration = builder.bindResourceStoreDuration;
            this.bindResourceType = builder.bindResourceType;
            this.bindVpcCidr = builder.bindVpcCidr;
            this.environmentId = builder.environmentId;
            this.environmentName = builder.environmentName;
            this.environmentSubType = builder.environmentSubType;
            this.environmentType = builder.environmentType;
            this.grafaDataSourceName = builder.grafaDataSourceName;
            this.grafanaDatasourceUid = builder.grafanaDatasourceUid;
            this.grafanaFolderTitle = builder.grafanaFolderTitle;
            this.grafanaFolderUid = builder.grafanaFolderUid;
            this.grafanaFolderUrl = builder.grafanaFolderUrl;
            this.prometheusInstanceId = builder.prometheusInstanceId;
            this.prometheusInstanceName = builder.prometheusInstanceName;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.userId = builder.userId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bindResourceId
         */
        public String getBindResourceId() {
            return this.bindResourceId;
        }

        /**
         * @return bindResourceProfile
         */
        public String getBindResourceProfile() {
            return this.bindResourceProfile;
        }

        /**
         * @return bindResourceStatus
         */
        public String getBindResourceStatus() {
            return this.bindResourceStatus;
        }

        /**
         * @return bindResourceStoreDuration
         */
        public String getBindResourceStoreDuration() {
            return this.bindResourceStoreDuration;
        }

        /**
         * @return bindResourceType
         */
        public String getBindResourceType() {
            return this.bindResourceType;
        }

        /**
         * @return bindVpcCidr
         */
        public String getBindVpcCidr() {
            return this.bindVpcCidr;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return environmentName
         */
        public String getEnvironmentName() {
            return this.environmentName;
        }

        /**
         * @return environmentSubType
         */
        public String getEnvironmentSubType() {
            return this.environmentSubType;
        }

        /**
         * @return environmentType
         */
        public String getEnvironmentType() {
            return this.environmentType;
        }

        /**
         * @return grafaDataSourceName
         */
        public String getGrafaDataSourceName() {
            return this.grafaDataSourceName;
        }

        /**
         * @return grafanaDatasourceUid
         */
        public String getGrafanaDatasourceUid() {
            return this.grafanaDatasourceUid;
        }

        /**
         * @return grafanaFolderTitle
         */
        public String getGrafanaFolderTitle() {
            return this.grafanaFolderTitle;
        }

        /**
         * @return grafanaFolderUid
         */
        public String getGrafanaFolderUid() {
            return this.grafanaFolderUid;
        }

        /**
         * @return grafanaFolderUrl
         */
        public String getGrafanaFolderUrl() {
            return this.grafanaFolderUrl;
        }

        /**
         * @return prometheusInstanceId
         */
        public String getPrometheusInstanceId() {
            return this.prometheusInstanceId;
        }

        /**
         * @return prometheusInstanceName
         */
        public String getPrometheusInstanceName() {
            return this.prometheusInstanceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String bindResourceId; 
            private String bindResourceProfile; 
            private String bindResourceStatus; 
            private String bindResourceStoreDuration; 
            private String bindResourceType; 
            private String bindVpcCidr; 
            private String environmentId; 
            private String environmentName; 
            private String environmentSubType; 
            private String environmentType; 
            private String grafaDataSourceName; 
            private String grafanaDatasourceUid; 
            private String grafanaFolderTitle; 
            private String grafanaFolderUid; 
            private String grafanaFolderUrl; 
            private String prometheusInstanceId; 
            private String prometheusInstanceName; 
            private String regionId; 
            private String resourceGroupId; 
            private java.util.List < Tags> tags; 
            private String userId; 
            private String vpcId; 

            /**
             * Resource instance ID bound to the environment, including container instance ID or VpcId.
             */
            public Builder bindResourceId(String bindResourceId) {
                this.bindResourceId = bindResourceId;
                return this;
            }

            /**
             * Profile of bound resources.
             */
            public Builder bindResourceProfile(String bindResourceProfile) {
                this.bindResourceProfile = bindResourceProfile;
                return this;
            }

            /**
             * The state of the bound resource.
             */
            public Builder bindResourceStatus(String bindResourceStatus) {
                this.bindResourceStatus = bindResourceStatus;
                return this;
            }

            /**
             * The storage duration of bound resources (days).
             */
            public Builder bindResourceStoreDuration(String bindResourceStoreDuration) {
                this.bindResourceStoreDuration = bindResourceStoreDuration;
                return this;
            }

            /**
             * The bound resource type.
             */
            public Builder bindResourceType(String bindResourceType) {
                this.bindResourceType = bindResourceType;
                return this;
            }

            /**
             * Bind the network segment of the vpc.
             */
            public Builder bindVpcCidr(String bindVpcCidr) {
                this.bindVpcCidr = bindVpcCidr;
                return this;
            }

            /**
             * Environment instance ID.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * Environment name.
             */
            public Builder environmentName(String environmentName) {
                this.environmentName = environmentName;
                return this;
            }

            /**
             * EnvironmentSubType.
             */
            public Builder environmentSubType(String environmentSubType) {
                this.environmentSubType = environmentSubType;
                return this;
            }

            /**
             * Environment type:
             * <p>
             * - CS: Container Service.
             * - ECS.
             * - Cloud: cloud service.
             */
            public Builder environmentType(String environmentType) {
                this.environmentType = environmentType;
                return this;
            }

            /**
             * Grafana data source name.
             */
            public Builder grafaDataSourceName(String grafaDataSourceName) {
                this.grafaDataSourceName = grafaDataSourceName;
                return this;
            }

            /**
             * Grafana data source unique ID.
             */
            public Builder grafanaDatasourceUid(String grafanaDatasourceUid) {
                this.grafanaDatasourceUid = grafanaDatasourceUid;
                return this;
            }

            /**
             * Grafana directory name.
             */
            public Builder grafanaFolderTitle(String grafanaFolderTitle) {
                this.grafanaFolderTitle = grafanaFolderTitle;
                return this;
            }

            /**
             * Grafana directory unique ID.
             */
            public Builder grafanaFolderUid(String grafanaFolderUid) {
                this.grafanaFolderUid = grafanaFolderUid;
                return this;
            }

            /**
             * Grafana directory URL.
             */
            public Builder grafanaFolderUrl(String grafanaFolderUrl) {
                this.grafanaFolderUrl = grafanaFolderUrl;
                return this;
            }

            /**
             * The bound prometheus instance ID.
             */
            public Builder prometheusInstanceId(String prometheusInstanceId) {
                this.prometheusInstanceId = prometheusInstanceId;
                return this;
            }

            /**
             * The name of the bound prometheus instance.
             */
            public Builder prometheusInstanceName(String prometheusInstanceName) {
                this.prometheusInstanceName = prometheusInstanceName;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
