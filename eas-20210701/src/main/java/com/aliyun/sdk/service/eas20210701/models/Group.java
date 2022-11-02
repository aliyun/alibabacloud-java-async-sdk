// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Group} extends {@link TeaModel}
 *
 * <p>Group</p>
 */
public class Group extends TeaModel {
    @NameInMap("AccessToken")
    private String accessToken;

    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("InternetEndpoint")
    private String internetEndpoint;

    @NameInMap("IntranetEndpoint")
    private String intranetEndpoint;

    @NameInMap("Name")
    private String name;

    @NameInMap("QueueService")
    private String queueService;

    @NameInMap("UpdateTime")
    private String updateTime;

    private Group(Builder builder) {
        this.accessToken = builder.accessToken;
        this.clusterId = builder.clusterId;
        this.createTime = builder.createTime;
        this.internetEndpoint = builder.internetEndpoint;
        this.intranetEndpoint = builder.intranetEndpoint;
        this.name = builder.name;
        this.queueService = builder.queueService;
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
        private String updateTime; 

        /**
         * 服务组流量入口Token
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * 服务组所在集群
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 服务组创建时间
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 服务组公网地址
         */
        public Builder internetEndpoint(String internetEndpoint) {
            this.internetEndpoint = internetEndpoint;
            return this;
        }

        /**
         * 服务组内网地址
         */
        public Builder intranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }

        /**
         * 服务组名称
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 服务组包含的队列服务
         */
        public Builder queueService(String queueService) {
            this.queueService = queueService;
            return this;
        }

        /**
         * 服务组更新时间
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
