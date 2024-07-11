// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataValue} extends {@link TeaModel}
 *
 * <p>DataValue</p>
 */
public class DataValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("masterUid")
    private Long masterUid;

    @com.aliyun.core.annotation.NameInMap("cInstanceId")
    private String cInstanceId;

    @com.aliyun.core.annotation.NameInMap("accessKey")
    private String accessKey;

    @com.aliyun.core.annotation.NameInMap("userName")
    private String userName;

    @com.aliyun.core.annotation.NameInMap("password")
    private String password;

    @com.aliyun.core.annotation.NameInMap("deleted")
    private Long deleted;

    @com.aliyun.core.annotation.NameInMap("createTimestamp")
    private Long createTimestamp;

    private DataValue(Builder builder) {
        this.masterUid = builder.masterUid;
        this.cInstanceId = builder.cInstanceId;
        this.accessKey = builder.accessKey;
        this.userName = builder.userName;
        this.password = builder.password;
        this.deleted = builder.deleted;
        this.createTimestamp = builder.createTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataValue create() {
        return builder().build();
    }

    /**
     * @return masterUid
     */
    public Long getMasterUid() {
        return this.masterUid;
    }

    /**
     * @return cInstanceId
     */
    public String getCInstanceId() {
        return this.cInstanceId;
    }

    /**
     * @return accessKey
     */
    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return deleted
     */
    public Long getDeleted() {
        return this.deleted;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public static final class Builder {
        private Long masterUid; 
        private String cInstanceId; 
        private String accessKey; 
        private String userName; 
        private String password; 
        private Long deleted; 
        private Long createTimestamp; 

        /**
         * The Alibaba Cloud account ID or Resource Access Management (RAM) user to which the AccessKey pair that is used to create the static username and password belongs.
         */
        public Builder masterUid(Long masterUid) {
            this.masterUid = masterUid;
            return this;
        }

        /**
         * The ID of the ApsaraMQ for RabbitMQ instance.
         */
        public Builder cInstanceId(String cInstanceId) {
            this.cInstanceId = cInstanceId;
            return this;
        }

        /**
         * The AccessKey ID that is used to create the static username and password.
         */
        public Builder accessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        /**
         * The static username.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * The static password.
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * The timestamp that indicates when the static username and password were deleted. Unit: milliseconds.
         */
        public Builder deleted(Long deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * The timestamp that indicates when the static username and password were created. Unit: milliseconds.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        public DataValue build() {
            return new DataValue(this);
        } 

    } 

}
