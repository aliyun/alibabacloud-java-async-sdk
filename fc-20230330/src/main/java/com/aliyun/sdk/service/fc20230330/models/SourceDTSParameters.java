// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SourceDTSParameters} extends {@link TeaModel}
 *
 * <p>SourceDTSParameters</p>
 */
public class SourceDTSParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BrokerUrl")
    private String brokerUrl;

    @com.aliyun.core.annotation.NameInMap("InitCheckPoint")
    private Integer initCheckPoint;

    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("Sid")
    private String sid;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("Topic")
    private String topic;

    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private SourceDTSParameters(Builder builder) {
        this.brokerUrl = builder.brokerUrl;
        this.initCheckPoint = builder.initCheckPoint;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.sid = builder.sid;
        this.taskId = builder.taskId;
        this.topic = builder.topic;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SourceDTSParameters create() {
        return builder().build();
    }

    /**
     * @return brokerUrl
     */
    public String getBrokerUrl() {
        return this.brokerUrl;
    }

    /**
     * @return initCheckPoint
     */
    public Integer getInitCheckPoint() {
        return this.initCheckPoint;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sid
     */
    public String getSid() {
        return this.sid;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder {
        private String brokerUrl; 
        private Integer initCheckPoint; 
        private String password; 
        private String regionId; 
        private String sid; 
        private String taskId; 
        private String topic; 
        private String username; 

        /**
         * BrokerUrl.
         */
        public Builder brokerUrl(String brokerUrl) {
            this.brokerUrl = brokerUrl;
            return this;
        }

        /**
         * InitCheckPoint.
         */
        public Builder initCheckPoint(Integer initCheckPoint) {
            this.initCheckPoint = initCheckPoint;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * Sid.
         */
        public Builder sid(String sid) {
            this.sid = sid;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(String topic) {
            this.topic = topic;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public SourceDTSParameters build() {
            return new SourceDTSParameters(this);
        } 

    } 

}
