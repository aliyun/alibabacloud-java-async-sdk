// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataValue} extends {@link TeaModel}
 *
 * <p>DataValue</p>
 */
public class DataValue extends TeaModel {
    @NameInMap("masterUid")
    private Long masterUid;

    @NameInMap("cInstanceId")
    private String cInstanceId;

    @NameInMap("accessKey")
    private String accessKey;

    @NameInMap("userName")
    private String userName;

    @NameInMap("password")
    private String password;

    @NameInMap("deleted")
    private Long deleted;

    @NameInMap("createTimestamp")
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
         * masterUid.
         */
        public Builder masterUid(Long masterUid) {
            this.masterUid = masterUid;
            return this;
        }

        /**
         * cInstanceId.
         */
        public Builder cInstanceId(String cInstanceId) {
            this.cInstanceId = cInstanceId;
            return this;
        }

        /**
         * accessKey.
         */
        public Builder accessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        /**
         * userName.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * password.
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * deleted.
         */
        public Builder deleted(Long deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * createTimestamp.
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
