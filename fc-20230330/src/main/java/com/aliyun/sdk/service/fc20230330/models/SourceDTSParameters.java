// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SourceDTSParameters model) {
            this.brokerUrl = model.brokerUrl;
            this.initCheckPoint = model.initCheckPoint;
            this.password = model.password;
            this.regionId = model.regionId;
            this.sid = model.sid;
            this.taskId = model.taskId;
            this.topic = model.topic;
            this.username = model.username;
        } 

        /**
         * <p>The network address and port number of the change tracking instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dts-cn-shanghai-vpc.com:18003</p>
         */
        public Builder brokerUrl(String brokerUrl) {
            this.brokerUrl = brokerUrl;
            return this;
        }

        /**
         * <p>The UNIX timestamp that is generated when the SDK client consumes the first data record.</p>
         * 
         * <strong>example:</strong>
         * <p>1677340805</p>
         */
        public Builder initCheckPoint(Integer initCheckPoint) {
            this.initCheckPoint = initCheckPoint;
            return this;
        }

        /**
         * <p>The consumer group password.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsTest123</p>
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * <p>The region of the DTS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The consumer group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dtse34j22j025a****</p>
         */
        public Builder sid(String sid) {
            this.sid = sid;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e34z2gm325q****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The name of the tracked topic of the change tracking instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn_shanghai_vpc_rm_uf6398ykj0218****_dts_trigger_upgrade_from_old_version2</p>
         */
        public Builder topic(String topic) {
            this.topic = topic;
            return this;
        }

        /**
         * <p>The account of the consumer group.</p>
         * 
         * <strong>example:</strong>
         * <p>dts_trigger</p>
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
