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

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("InternetEndpoint")
    private String internetEndpoint;

    @com.aliyun.core.annotation.NameInMap("IntranetEndpoint")
    private String intranetEndpoint;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("QueueService")
    private String queueService;

    @com.aliyun.core.annotation.NameInMap("TrafficMode")
    private String trafficMode;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private Group(Builder builder) {
        this.accessToken = builder.accessToken;
        this.clusterId = builder.clusterId;
        this.createTime = builder.createTime;
        this.internetEndpoint = builder.internetEndpoint;
        this.intranetEndpoint = builder.intranetEndpoint;
        this.name = builder.name;
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

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
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
     * @return name
     */
    public String getName() {
        return this.name;
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
        private String clusterId; 
        private String createTime; 
        private String internetEndpoint; 
        private String intranetEndpoint; 
        private String name; 
        private String queueService; 
        private String trafficMode; 
        private String updateTime; 

        /**
         * AccessToken.
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
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
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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

}
