// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeEncryptionDBSecretResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEncryptionDBSecretResponseBody</p>
 */
public class DescribeEncryptionDBSecretResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("EncryptionDBRegion")
    private String encryptionDBRegion;

    @com.aliyun.core.annotation.NameInMap("EncryptionDBStatus")
    private String encryptionDBStatus;

    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.NameInMap("EncryptionKeyStatus")
    private String encryptionKeyStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEncryptionDBSecretResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.encryptionDBRegion = builder.encryptionDBRegion;
        this.encryptionDBStatus = builder.encryptionDBStatus;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionKeyStatus = builder.encryptionKeyStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEncryptionDBSecretResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return encryptionDBRegion
     */
    public String getEncryptionDBRegion() {
        return this.encryptionDBRegion;
    }

    /**
     * @return encryptionDBStatus
     */
    public String getEncryptionDBStatus() {
        return this.encryptionDBStatus;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @return encryptionKeyStatus
     */
    public String getEncryptionKeyStatus() {
        return this.encryptionKeyStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String encryptionDBRegion; 
        private String encryptionDBStatus; 
        private String encryptionKey; 
        private String encryptionKeyStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeEncryptionDBSecretResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.encryptionDBRegion = model.encryptionDBRegion;
            this.encryptionDBStatus = model.encryptionDBStatus;
            this.encryptionKey = model.encryptionKey;
            this.encryptionKeyStatus = model.encryptionKeyStatus;
            this.requestId = model.requestId;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * EncryptionDBRegion.
         */
        public Builder encryptionDBRegion(String encryptionDBRegion) {
            this.encryptionDBRegion = encryptionDBRegion;
            return this;
        }

        /**
         * EncryptionDBStatus.
         */
        public Builder encryptionDBStatus(String encryptionDBStatus) {
            this.encryptionDBStatus = encryptionDBStatus;
            return this;
        }

        /**
         * EncryptionKey.
         */
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * EncryptionKeyStatus.
         */
        public Builder encryptionKeyStatus(String encryptionKeyStatus) {
            this.encryptionKeyStatus = encryptionKeyStatus;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>944CED46-A6F7-40C6-B6DC-C6E5CC******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEncryptionDBSecretResponseBody build() {
            return new DescribeEncryptionDBSecretResponseBody(this);
        } 

    } 

}
