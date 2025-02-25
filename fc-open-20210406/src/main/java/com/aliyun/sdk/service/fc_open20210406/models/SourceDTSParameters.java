// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SourceDTSParameters} extends {@link TeaModel}
 *
 * <p>SourceDTSParameters</p>
 */
public class SourceDTSParameters extends TeaModel {
    @NameInMap("BrokerUrl")
    @Validation(required = true)
    private String brokerUrl;

    @NameInMap("InitCheckPoint")
    @Validation(required = true)
    private Long initCheckPoint;

    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @NameInMap("Sid")
    @Validation(required = true)
    private String sid;

    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    @NameInMap("Username")
    @Validation(required = true)
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
    public Long getInitCheckPoint() {
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
        private Long initCheckPoint; 
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
        public Builder initCheckPoint(Long initCheckPoint) {
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
