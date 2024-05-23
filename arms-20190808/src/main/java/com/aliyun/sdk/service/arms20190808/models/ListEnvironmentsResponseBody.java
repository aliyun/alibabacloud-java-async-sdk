// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvironmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnvironmentsResponseBody</p>
 */
public class ListEnvironmentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListEnvironmentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentsResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code. The status code 200 indicates that the request was successful.
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values: true and false.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListEnvironmentsResponseBody build() {
            return new ListEnvironmentsResponseBody(this);
        } 

    } 

    public static class Addons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Addons(Builder builder) {
            this.alias = builder.alias;
            this.description = builder.description;
            this.icon = builder.icon;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addons create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String alias; 
            private String description; 
            private String icon; 
            private String name; 

            /**
             * The alias of the add-on.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The description of the add-on.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The URL of the icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * The name of the add-on.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Addons build() {
                return new Addons(this);
            } 

        } 

    }
    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Features(Builder builder) {
            this.alias = builder.alias;
            this.description = builder.description;
            this.icon = builder.icon;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String alias; 
            private String description; 
            private String icon; 
            private String name; 

            /**
             * The alias of the feature.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The description of the feature.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The URL of the icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * The name of the feature.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
    public static class Environments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Addons")
        private java.util.List < Addons> addons;

        @com.aliyun.core.annotation.NameInMap("BindResourceId")
        private String bindResourceId;

        @com.aliyun.core.annotation.NameInMap("BindResourceProfile")
        private String bindResourceProfile;

        @com.aliyun.core.annotation.NameInMap("BindResourceType")
        private String bindResourceType;

        @com.aliyun.core.annotation.NameInMap("BindVpcCidr")
        private String bindVpcCidr;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreatedUserId")
        private String createdUserId;

        @com.aliyun.core.annotation.NameInMap("EnvironmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("EnvironmentName")
        private String environmentName;

        @com.aliyun.core.annotation.NameInMap("EnvironmentType")
        private String environmentType;

        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.List < Features> features;

        @com.aliyun.core.annotation.NameInMap("FeePackage")
        private String feePackage;

        @com.aliyun.core.annotation.NameInMap("GrafanaDatasourceUid")
        private String grafanaDatasourceUid;

        @com.aliyun.core.annotation.NameInMap("GrafanaFolderTitle")
        private String grafanaFolderTitle;

        @com.aliyun.core.annotation.NameInMap("GrafanaFolderUid")
        private String grafanaFolderUid;

        @com.aliyun.core.annotation.NameInMap("LatestReleaseCreateTime")
        private String latestReleaseCreateTime;

        @com.aliyun.core.annotation.NameInMap("ManagedType")
        private String managedType;

        @com.aliyun.core.annotation.NameInMap("PrometheusId")
        private Long prometheusId;

        @com.aliyun.core.annotation.NameInMap("PrometheusInstanceId")
        private String prometheusInstanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReleaseCount")
        private Integer releaseCount;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Environments(Builder builder) {
            this.addons = builder.addons;
            this.bindResourceId = builder.bindResourceId;
            this.bindResourceProfile = builder.bindResourceProfile;
            this.bindResourceType = builder.bindResourceType;
            this.bindVpcCidr = builder.bindVpcCidr;
            this.createTime = builder.createTime;
            this.createdUserId = builder.createdUserId;
            this.environmentId = builder.environmentId;
            this.environmentName = builder.environmentName;
            this.environmentType = builder.environmentType;
            this.features = builder.features;
            this.feePackage = builder.feePackage;
            this.grafanaDatasourceUid = builder.grafanaDatasourceUid;
            this.grafanaFolderTitle = builder.grafanaFolderTitle;
            this.grafanaFolderUid = builder.grafanaFolderUid;
            this.latestReleaseCreateTime = builder.latestReleaseCreateTime;
            this.managedType = builder.managedType;
            this.prometheusId = builder.prometheusId;
            this.prometheusInstanceId = builder.prometheusInstanceId;
            this.regionId = builder.regionId;
            this.releaseCount = builder.releaseCount;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Environments create() {
            return builder().build();
        }

        /**
         * @return addons
         */
        public java.util.List < Addons> getAddons() {
            return this.addons;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createdUserId
         */
        public String getCreatedUserId() {
            return this.createdUserId;
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
         * @return environmentType
         */
        public String getEnvironmentType() {
            return this.environmentType;
        }

        /**
         * @return features
         */
        public java.util.List < Features> getFeatures() {
            return this.features;
        }

        /**
         * @return feePackage
         */
        public String getFeePackage() {
            return this.feePackage;
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
         * @return latestReleaseCreateTime
         */
        public String getLatestReleaseCreateTime() {
            return this.latestReleaseCreateTime;
        }

        /**
         * @return managedType
         */
        public String getManagedType() {
            return this.managedType;
        }

        /**
         * @return prometheusId
         */
        public Long getPrometheusId() {
            return this.prometheusId;
        }

        /**
         * @return prometheusInstanceId
         */
        public String getPrometheusInstanceId() {
            return this.prometheusInstanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return releaseCount
         */
        public Integer getReleaseCount() {
            return this.releaseCount;
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

        public static final class Builder {
            private java.util.List < Addons> addons; 
            private String bindResourceId; 
            private String bindResourceProfile; 
            private String bindResourceType; 
            private String bindVpcCidr; 
            private String createTime; 
            private String createdUserId; 
            private String environmentId; 
            private String environmentName; 
            private String environmentType; 
            private java.util.List < Features> features; 
            private String feePackage; 
            private String grafanaDatasourceUid; 
            private String grafanaFolderTitle; 
            private String grafanaFolderUid; 
            private String latestReleaseCreateTime; 
            private String managedType; 
            private Long prometheusId; 
            private String prometheusInstanceId; 
            private String regionId; 
            private Integer releaseCount; 
            private String resourceGroupId; 
            private java.util.List < Tags> tags; 
            private String userId; 

            /**
             * The add-ons.
             */
            public Builder addons(java.util.List < Addons> addons) {
                this.addons = addons;
                return this;
            }

            /**
             * The ID of the resource bound to the environment instance. The resource can be a Kubernetes cluster or a VPC.
             */
            public Builder bindResourceId(String bindResourceId) {
                this.bindResourceId = bindResourceId;
                return this;
            }

            /**
             * The profile that is bound to the resource.
             */
            public Builder bindResourceProfile(String bindResourceProfile) {
                this.bindResourceProfile = bindResourceProfile;
                return this;
            }

            /**
             * The resource type.
             */
            public Builder bindResourceType(String bindResourceType) {
                this.bindResourceType = bindResourceType;
                return this;
            }

            /**
             * The CIDR block that is bound to the VPC.
             */
            public Builder bindVpcCidr(String bindVpcCidr) {
                this.bindVpcCidr = bindVpcCidr;
                return this;
            }

            /**
             * The time when the environment instance was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The user ID.
             */
            public Builder createdUserId(String createdUserId) {
                this.createdUserId = createdUserId;
                return this;
            }

            /**
             * The ID of the environment instance.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * The name of the environment instance.
             */
            public Builder environmentName(String environmentName) {
                this.environmentName = environmentName;
                return this;
            }

            /**
             * The type of the environment instance. Valid values:
             * <p>
             * 
             * *   CS: Container Service
             * *   ECS: Elastic Compute Service (ECS)
             * *   Cloud: cloud service
             */
            public Builder environmentType(String environmentType) {
                this.environmentType = environmentType;
                return this;
            }

            /**
             * The parameters of the feature.
             */
            public Builder features(java.util.List < Features> features) {
                this.features = features;
                return this;
            }

            /**
             * The payable resource plan. Valid values:
             * <p>
             * 
             * *   If the EnvironmentType parameter is set to CS, set the value to CS_Basic or CS_Pro. Default value: CS_Basic.
             * *   Otherwise, leave the parameter empty.
             */
            public Builder feePackage(String feePackage) {
                this.feePackage = feePackage;
                return this;
            }

            /**
             * The unique ID of the Grafana data source.
             */
            public Builder grafanaDatasourceUid(String grafanaDatasourceUid) {
                this.grafanaDatasourceUid = grafanaDatasourceUid;
                return this;
            }

            /**
             * The name of the Grafana directory.
             */
            public Builder grafanaFolderTitle(String grafanaFolderTitle) {
                this.grafanaFolderTitle = grafanaFolderTitle;
                return this;
            }

            /**
             * The unique ID of the Grafana directory.
             */
            public Builder grafanaFolderUid(String grafanaFolderUid) {
                this.grafanaFolderUid = grafanaFolderUid;
                return this;
            }

            /**
             * The time when the last add-on was created.
             */
            public Builder latestReleaseCreateTime(String latestReleaseCreateTime) {
                this.latestReleaseCreateTime = latestReleaseCreateTime;
                return this;
            }

            /**
             * Indicates whether agents or exporters are managed. Valid values:
             * <p>
             * 
             * *   none: No. By default, no managed agents or exporters are provided for ACK clusters.
             * *   agent: Agents are managed. By default, managed agents are provided for ASK clusters, ACS clusters, and ACK One clusters.
             * *   agent-exproter: Agents and exporters are managed. By default, managed agents and exporters are provided for cloud services.
             */
            public Builder managedType(String managedType) {
                this.managedType = managedType;
                return this;
            }

            /**
             * The Prometheus ID.
             */
            public Builder prometheusId(Long prometheusId) {
                this.prometheusId = prometheusId;
                return this;
            }

            /**
             * The ID of the Prometheus instance.
             */
            public Builder prometheusInstanceId(String prometheusInstanceId) {
                this.prometheusInstanceId = prometheusInstanceId;
                return this;
            }

            /**
             * The ID of the region where the Message Queue for RabbitMQ instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The number of installed add-ons.
             */
            public Builder releaseCount(Integer releaseCount) {
                this.releaseCount = releaseCount;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The tags of the environment resource.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Environments build() {
                return new Environments(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Environments")
        private java.util.List < Environments> environments;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.environments = builder.environments;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return environments
         */
        public java.util.List < Environments> getEnvironments() {
            return this.environments;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < Environments> environments; 
            private Long total; 

            /**
             * The parameters of the environment instance.
             */
            public Builder environments(java.util.List < Environments> environments) {
                this.environments = environments;
                return this;
            }

            /**
             * The total number of returned entries.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
