// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceTDEInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceTDEInfoResponseBody</p>
 */
public class DescribeDBInstanceTDEInfoResponseBody extends TeaModel {
    @NameInMap("EncryptionKey")
    private String encryptionKey;

    @NameInMap("EncryptorName")
    private String encryptorName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RoleARN")
    private String roleARN;

    @NameInMap("TDEStatus")
    private String TDEStatus;

    private DescribeDBInstanceTDEInfoResponseBody(Builder builder) {
        this.encryptionKey = builder.encryptionKey;
        this.encryptorName = builder.encryptorName;
        this.requestId = builder.requestId;
        this.roleARN = builder.roleARN;
        this.TDEStatus = builder.TDEStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceTDEInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @return encryptorName
     */
    public String getEncryptorName() {
        return this.encryptorName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleARN
     */
    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * @return TDEStatus
     */
    public String getTDEStatus() {
        return this.TDEStatus;
    }

    public static final class Builder {
        private String encryptionKey; 
        private String encryptorName; 
        private String requestId; 
        private String roleARN; 
        private String TDEStatus; 

        /**
         * The custom key of the instance.
         * <p>
         * 
         * The Bring Your Own Key (BYOK) feature allows you to manage and obtain your own encryption key. This feature is supported only in the following regions:
         * 
         * *   cn-hangzhou
         * *   cn-shanghai
         * *   cn-beijing
         * *   cn-shenzhen
         * *   cn-hongkong
         * *   ap-southeast-1
         * *   ap-southeast-3
         */
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * The encryption algorithm.
         */
        public Builder encryptorName(String encryptorName) {
            this.encryptorName = encryptorName;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role to which you want to grant permissions.
         */
        public Builder roleARN(String roleARN) {
            this.roleARN = roleARN;
            return this;
        }

        /**
         * The TDE status. Valid values:
         * <p>
         * 
         * *   **enabled**
         * *   **disabled**
         */
        public Builder TDEStatus(String TDEStatus) {
            this.TDEStatus = TDEStatus;
            return this;
        }

        public DescribeDBInstanceTDEInfoResponseBody build() {
            return new DescribeDBInstanceTDEInfoResponseBody(this);
        } 

    } 

}
