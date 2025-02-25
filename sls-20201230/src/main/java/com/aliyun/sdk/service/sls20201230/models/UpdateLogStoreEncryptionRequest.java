// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link UpdateLogStoreEncryptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateLogStoreEncryptionRequest</p>
 */
public class UpdateLogStoreEncryptionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("encryptType")
    private String encryptType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userCmkInfo")
    private UserCmkInfo userCmkInfo;

    private UpdateLogStoreEncryptionRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.enable = builder.enable;
        this.encryptType = builder.encryptType;
        this.userCmkInfo = builder.userCmkInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLogStoreEncryptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return encryptType
     */
    public String getEncryptType() {
        return this.encryptType;
    }

    /**
     * @return userCmkInfo
     */
    public UserCmkInfo getUserCmkInfo() {
        return this.userCmkInfo;
    }

    public static final class Builder extends Request.Builder<UpdateLogStoreEncryptionRequest, Builder> {
        private String project; 
        private String logstore; 
        private Boolean enable; 
        private String encryptType; 
        private UserCmkInfo userCmkInfo; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLogStoreEncryptionRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.enable = request.enable;
            this.encryptType = request.encryptType;
            this.userCmkInfo = request.userCmkInfo;
        } 

        /**
         * <p>The Simple Log Service project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The Logstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>Specifies whether to enable the encryption feature. After you update the encryption configuration of the Logstore, you can modify only the enable parameter in subsequent update requests. You cannot modify the encryptType or userCmkInfo parameters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The encryption algorithm. Valid values: default, m4, sm4_ecb, sm4_cbc, sm4_gcm, aes_ecb, aes_cbc, aes_cfb, aes_ofb, and aes_gcm.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder encryptType(String encryptType) {
            this.putBodyParameter("encryptType", encryptType);
            this.encryptType = encryptType;
            return this;
        }

        /**
         * <p>Optional. If you use a BYOK key to encrypt logs, you must specify this parameter. If you use the service key of Simple Log Service to encrypt logs, you do not need to specify this parameter.</p>
         */
        public Builder userCmkInfo(UserCmkInfo userCmkInfo) {
            this.putBodyParameter("userCmkInfo", userCmkInfo);
            this.userCmkInfo = userCmkInfo;
            return this;
        }

        @Override
        public UpdateLogStoreEncryptionRequest build() {
            return new UpdateLogStoreEncryptionRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLogStoreEncryptionRequest} extends {@link TeaModel}
     *
     * <p>UpdateLogStoreEncryptionRequest</p>
     */
    public static class UserCmkInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("keyId")
        private String keyId;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("roleArn")
        private String roleArn;

        private UserCmkInfo(Builder builder) {
            this.keyId = builder.keyId;
            this.regionId = builder.regionId;
            this.roleArn = builder.roleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserCmkInfo create() {
            return builder().build();
        }

        /**
         * @return keyId
         */
        public String getKeyId() {
            return this.keyId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        public static final class Builder {
            private String keyId; 
            private String regionId; 
            private String roleArn; 

            /**
             * <p>The ID of the CMK to which the BYOK key belongs. You can create a CMK in KMS. The CMK must be in the same region as the endpoint of Simple Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>f5136b95-2420-ab31-xxxxxxxxx</p>
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * <p>The region ID. Example: cn-hangzhou.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role.The value is in the acs:ram::12344***:role/xxxxx format. To use a BYOK key to encrypt logs, you must create a RAM role and grant the AliyunKMSReadOnlyAccess and AliyunKMSCryptoUserAccess permissions to the RAM role. You must grant the API caller the PassRole permission on the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::12344***:role/xxxxx</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            public UserCmkInfo build() {
                return new UserCmkInfo(this);
            } 

        } 

    }
}
