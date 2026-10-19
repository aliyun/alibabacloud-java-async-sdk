// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeDBInstanceTDEInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceTDEInfoResponseBody</p>
 */
public class DescribeDBInstanceTDEInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.NameInMap("EncryptorName")
    private String encryptorName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleARN")
    private String roleARN;

    @com.aliyun.core.annotation.NameInMap("TDEStatus")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDBInstanceTDEInfoResponseBody model) {
            this.encryptionKey = model.encryptionKey;
            this.encryptorName = model.encryptorName;
            this.requestId = model.requestId;
            this.roleARN = model.roleARN;
            this.TDEStatus = model.TDEStatus;
        } 

        /**
         * <p>The custom key of the instance.</p>
         * <p>Currently, only the following regions support Bring Your Own Key (BYOK), which allows you to manage and own encryption keys:</p>
         * <ul>
         * <li>China (Hangzhou)</li>
         * <li>China (Shanghai)</li>
         * <li>China (Beijing)</li>
         * <li>China (Shenzhen)</li>
         * <li>Hong Kong (China)</li>
         * <li>Singapore</li>
         * <li>Malaysia (Kuala Lumpur)</li>
         * </ul>
         * <blockquote>
         * <p>If BYOK is supported, you can manage and own the key, and the system returns your custom key. If BYOK is not supported, you cannot manage the key, and the system returns the string <code>NoActiveBYOK</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2axxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * <p>The encryption algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>aes-256-cbc</p>
         */
        public Builder encryptorName(String encryptorName) {
            this.encryptorName = encryptorName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F4DD0E29-361B-42F2-9301-B0048CCCE5D6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The global resource descriptor ARN (Alibaba Cloud Resource Name) of the role pending authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/aliyunrdsinstanceencryptiondefaultrole</p>
         */
        public Builder roleARN(String roleARN) {
            this.roleARN = roleARN;
            return this;
        }

        /**
         * <p>The TDE enabling status. Valid values:</p>
         * <ul>
         * <li><strong>enabled</strong>: TDE is enabled.</li>
         * <li><strong>disabled</strong>: TDE is disabled.</li>
         * </ul>
         * <blockquote>
         * <p>If the TDE status is disabled, the <strong>RoleARN</strong>, <strong>EncryptionKey</strong>, and <strong>EncryptorName</strong> parameters are not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
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
