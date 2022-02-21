// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceEncryptionKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceEncryptionKeyResponseBody</p>
 */
public class DescribeDBInstanceEncryptionKeyResponseBody extends TeaModel {
    @NameInMap("Creator")
    private String creator;

    @NameInMap("DeleteDate")
    private String deleteDate;

    @NameInMap("Description")
    private String description;

    @NameInMap("EncryptionKey")
    private String encryptionKey;

    @NameInMap("EncryptionKeyStatus")
    private String encryptionKeyStatus;

    @NameInMap("KeyUsage")
    private String keyUsage;

    @NameInMap("MaterialExpireTime")
    private String materialExpireTime;

    @NameInMap("Origin")
    private String origin;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceEncryptionKeyResponseBody(Builder builder) {
        this.creator = builder.creator;
        this.deleteDate = builder.deleteDate;
        this.description = builder.description;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionKeyStatus = builder.encryptionKeyStatus;
        this.keyUsage = builder.keyUsage;
        this.materialExpireTime = builder.materialExpireTime;
        this.origin = builder.origin;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceEncryptionKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return deleteDate
     */
    public String getDeleteDate() {
        return this.deleteDate;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return keyUsage
     */
    public String getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * @return materialExpireTime
     */
    public String getMaterialExpireTime() {
        return this.materialExpireTime;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String creator; 
        private String deleteDate; 
        private String description; 
        private String encryptionKey; 
        private String encryptionKeyStatus; 
        private String keyUsage; 
        private String materialExpireTime; 
        private String origin; 
        private String requestId; 

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * DeleteDate.
         */
        public Builder deleteDate(String deleteDate) {
            this.deleteDate = deleteDate;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * KeyUsage.
         */
        public Builder keyUsage(String keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }

        /**
         * MaterialExpireTime.
         */
        public Builder materialExpireTime(String materialExpireTime) {
            this.materialExpireTime = materialExpireTime;
            return this;
        }

        /**
         * Origin.
         */
        public Builder origin(String origin) {
            this.origin = origin;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceEncryptionKeyResponseBody build() {
            return new DescribeDBInstanceEncryptionKeyResponseBody(this);
        } 

    } 

}
