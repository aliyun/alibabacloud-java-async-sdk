// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link Group} extends {@link TeaModel}
 *
 * <p>Group</p>
 */
public class Group extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessToken")
    private String accessToken;

    @com.aliyun.core.annotation.NameInMap("CallerUid")
    private String callerUid;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("InternetEndpoint")
    private String internetEndpoint;

    @com.aliyun.core.annotation.NameInMap("IntranetEndpoint")
    private String intranetEndpoint;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Network")
    private Network network;

    @com.aliyun.core.annotation.NameInMap("ParentUid")
    private String parentUid;

    @com.aliyun.core.annotation.NameInMap("QueueService")
    private String queueService;

    @com.aliyun.core.annotation.NameInMap("TrafficMode")
    private String trafficMode;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private Group(Builder builder) {
        this.accessToken = builder.accessToken;
        this.callerUid = builder.callerUid;
        this.clusterId = builder.clusterId;
        this.createTime = builder.createTime;
        this.internetEndpoint = builder.internetEndpoint;
        this.intranetEndpoint = builder.intranetEndpoint;
        this.labels = builder.labels;
        this.name = builder.name;
        this.network = builder.network;
        this.parentUid = builder.parentUid;
        this.queueService = builder.queueService;
        this.trafficMode = builder.trafficMode;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Group create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return callerUid
     */
    public String getCallerUid() {
        return this.callerUid;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return internetEndpoint
     */
    public String getInternetEndpoint() {
        return this.internetEndpoint;
    }

    /**
     * @return intranetEndpoint
     */
    public String getIntranetEndpoint() {
        return this.intranetEndpoint;
    }

    /**
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return network
     */
    public Network getNetwork() {
        return this.network;
    }

    /**
     * @return parentUid
     */
    public String getParentUid() {
        return this.parentUid;
    }

    /**
     * @return queueService
     */
    public String getQueueService() {
        return this.queueService;
    }

    /**
     * @return trafficMode
     */
    public String getTrafficMode() {
        return this.trafficMode;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String accessToken; 
        private String callerUid; 
        private String clusterId; 
        private String createTime; 
        private String internetEndpoint; 
        private String intranetEndpoint; 
        private java.util.List<Labels> labels; 
        private String name; 
        private Network network; 
        private String parentUid; 
        private String queueService; 
        private String trafficMode; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(Group model) {
            this.accessToken = model.accessToken;
            this.callerUid = model.callerUid;
            this.clusterId = model.clusterId;
            this.createTime = model.createTime;
            this.internetEndpoint = model.internetEndpoint;
            this.intranetEndpoint = model.intranetEndpoint;
            this.labels = model.labels;
            this.name = model.name;
            this.network = model.network;
            this.parentUid = model.parentUid;
            this.queueService = model.queueService;
            this.trafficMode = model.trafficMode;
            this.updateTime = model.updateTime;
        } 

        /**
         * AccessToken.
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * CallerUid.
         */
        public Builder callerUid(String callerUid) {
            this.callerUid = callerUid;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * InternetEndpoint.
         */
        public Builder internetEndpoint(String internetEndpoint) {
            this.internetEndpoint = internetEndpoint;
            return this;
        }

        /**
         * IntranetEndpoint.
         */
        public Builder intranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Network.
         */
        public Builder network(Network network) {
            this.network = network;
            return this;
        }

        /**
         * ParentUid.
         */
        public Builder parentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }

        /**
         * QueueService.
         */
        public Builder queueService(String queueService) {
            this.queueService = queueService;
            return this;
        }

        /**
         * TrafficMode.
         */
        public Builder trafficMode(String trafficMode) {
            this.trafficMode = trafficMode;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Group build() {
            return new Group(this);
        } 

    } 

    /**
     * 
     * {@link Group} extends {@link TeaModel}
     *
     * <p>Group</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LabelKey")
        private String labelKey;

        @com.aliyun.core.annotation.NameInMap("LabelValue")
        private String labelValue;

        private Labels(Builder builder) {
            this.labelKey = builder.labelKey;
            this.labelValue = builder.labelValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return labelKey
         */
        public String getLabelKey() {
            return this.labelKey;
        }

        /**
         * @return labelValue
         */
        public String getLabelValue() {
            return this.labelValue;
        }

        public static final class Builder {
            private String labelKey; 
            private String labelValue; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.labelKey = model.labelKey;
                this.labelValue = model.labelValue;
            } 

            /**
             * LabelKey.
             */
            public Builder labelKey(String labelKey) {
                this.labelKey = labelKey;
                return this;
            }

            /**
             * LabelValue.
             */
            public Builder labelValue(String labelValue) {
                this.labelValue = labelValue;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link Group} extends {@link TeaModel}
     *
     * <p>Group</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Network(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String gatewayId; 
            private String securityGroupId; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.gatewayId = model.gatewayId;
                this.securityGroupId = model.securityGroupId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * GatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
}
