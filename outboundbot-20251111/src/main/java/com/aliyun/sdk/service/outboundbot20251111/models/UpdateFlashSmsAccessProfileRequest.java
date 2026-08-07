// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link UpdateFlashSmsAccessProfileRequest} extends {@link RequestModel}
 *
 * <p>UpdateFlashSmsAccessProfileRequest</p>
 */
public class UpdateFlashSmsAccessProfileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessProfile")
    private AccessProfile accessProfile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessProfileId")
    private String accessProfileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProviderId")
    private String providerId;

    private UpdateFlashSmsAccessProfileRequest(Builder builder) {
        super(builder);
        this.accessProfile = builder.accessProfile;
        this.accessProfileId = builder.accessProfileId;
        this.instanceId = builder.instanceId;
        this.providerId = builder.providerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlashSmsAccessProfileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessProfile
     */
    public AccessProfile getAccessProfile() {
        return this.accessProfile;
    }

    /**
     * @return accessProfileId
     */
    public String getAccessProfileId() {
        return this.accessProfileId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return providerId
     */
    public String getProviderId() {
        return this.providerId;
    }

    public static final class Builder extends Request.Builder<UpdateFlashSmsAccessProfileRequest, Builder> {
        private AccessProfile accessProfile; 
        private String accessProfileId; 
        private String instanceId; 
        private String providerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFlashSmsAccessProfileRequest request) {
            super(request);
            this.accessProfile = request.accessProfile;
            this.accessProfileId = request.accessProfileId;
            this.instanceId = request.instanceId;
            this.providerId = request.providerId;
        } 

        /**
         * <p>接入配置</p>
         */
        public Builder accessProfile(AccessProfile accessProfile) {
            String accessProfileShrink = shrink(accessProfile, "AccessProfile", "json");
            this.putBodyParameter("AccessProfile", accessProfileShrink);
            this.accessProfile = accessProfile;
            return this;
        }

        /**
         * <p>接入配置ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        public Builder accessProfileId(String accessProfileId) {
            this.putBodyParameter("AccessProfileId", accessProfileId);
            this.accessProfileId = accessProfileId;
            return this;
        }

        /**
         * <p>实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>供应商ID</p>
         * 
         * <strong>example:</strong>
         * <p>Uincall</p>
         */
        public Builder providerId(String providerId) {
            this.putBodyParameter("ProviderId", providerId);
            this.providerId = providerId;
            return this;
        }

        @Override
        public UpdateFlashSmsAccessProfileRequest build() {
            return new UpdateFlashSmsAccessProfileRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateFlashSmsAccessProfileRequest} extends {@link TeaModel}
     *
     * <p>UpdateFlashSmsAccessProfileRequest</p>
     */
    public static class DySmsAccessProfiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SignName")
        private String signName;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        private DySmsAccessProfiles(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.signName = builder.signName;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DySmsAccessProfiles create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String signName; 
            private String templateCode; 

            private Builder() {
            } 

            private Builder(DySmsAccessProfiles model) {
                this.description = model.description;
                this.name = model.name;
                this.signName = model.signName;
                this.templateCode = model.templateCode;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SignName.
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            /**
             * TemplateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public DySmsAccessProfiles build() {
                return new DySmsAccessProfiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateFlashSmsAccessProfileRequest} extends {@link TeaModel}
     *
     * <p>UpdateFlashSmsAccessProfileRequest</p>
     */
    public static class AccessProfile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("AesKey")
        private String aesKey;

        @com.aliyun.core.annotation.NameInMap("ApiAccount")
        private String apiAccount;

        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("ApiPassword")
        private String apiPassword;

        @com.aliyun.core.annotation.NameInMap("CapAppId")
        private String capAppId;

        @com.aliyun.core.annotation.NameInMap("DySmsAccessProfiles")
        private java.util.List<DySmsAccessProfiles> dySmsAccessProfiles;

        @com.aliyun.core.annotation.NameInMap("Extno")
        private String extno;

        @com.aliyun.core.annotation.NameInMap("ManagementPassword")
        private String managementPassword;

        @com.aliyun.core.annotation.NameInMap("ManagementSubUserId")
        private String managementSubUserId;

        @com.aliyun.core.annotation.NameInMap("ManagementUsername")
        private String managementUsername;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Pwd")
        private String pwd;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private AccessProfile(Builder builder) {
            this.account = builder.account;
            this.aesKey = builder.aesKey;
            this.apiAccount = builder.apiAccount;
            this.apiId = builder.apiId;
            this.apiKey = builder.apiKey;
            this.apiPassword = builder.apiPassword;
            this.capAppId = builder.capAppId;
            this.dySmsAccessProfiles = builder.dySmsAccessProfiles;
            this.extno = builder.extno;
            this.managementPassword = builder.managementPassword;
            this.managementSubUserId = builder.managementSubUserId;
            this.managementUsername = builder.managementUsername;
            this.password = builder.password;
            this.pwd = builder.pwd;
            this.user = builder.user;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessProfile create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return aesKey
         */
        public String getAesKey() {
            return this.aesKey;
        }

        /**
         * @return apiAccount
         */
        public String getApiAccount() {
            return this.apiAccount;
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return apiPassword
         */
        public String getApiPassword() {
            return this.apiPassword;
        }

        /**
         * @return capAppId
         */
        public String getCapAppId() {
            return this.capAppId;
        }

        /**
         * @return dySmsAccessProfiles
         */
        public java.util.List<DySmsAccessProfiles> getDySmsAccessProfiles() {
            return this.dySmsAccessProfiles;
        }

        /**
         * @return extno
         */
        public String getExtno() {
            return this.extno;
        }

        /**
         * @return managementPassword
         */
        public String getManagementPassword() {
            return this.managementPassword;
        }

        /**
         * @return managementSubUserId
         */
        public String getManagementSubUserId() {
            return this.managementSubUserId;
        }

        /**
         * @return managementUsername
         */
        public String getManagementUsername() {
            return this.managementUsername;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return pwd
         */
        public String getPwd() {
            return this.pwd;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String account; 
            private String aesKey; 
            private String apiAccount; 
            private String apiId; 
            private String apiKey; 
            private String apiPassword; 
            private String capAppId; 
            private java.util.List<DySmsAccessProfiles> dySmsAccessProfiles; 
            private String extno; 
            private String managementPassword; 
            private String managementSubUserId; 
            private String managementUsername; 
            private String password; 
            private String pwd; 
            private String user; 
            private String userName; 

            private Builder() {
            } 

            private Builder(AccessProfile model) {
                this.account = model.account;
                this.aesKey = model.aesKey;
                this.apiAccount = model.apiAccount;
                this.apiId = model.apiId;
                this.apiKey = model.apiKey;
                this.apiPassword = model.apiPassword;
                this.capAppId = model.capAppId;
                this.dySmsAccessProfiles = model.dySmsAccessProfiles;
                this.extno = model.extno;
                this.managementPassword = model.managementPassword;
                this.managementSubUserId = model.managementSubUserId;
                this.managementUsername = model.managementUsername;
                this.password = model.password;
                this.pwd = model.pwd;
                this.user = model.user;
                this.userName = model.userName;
            } 

            /**
             * Account.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * AesKey.
             */
            public Builder aesKey(String aesKey) {
                this.aesKey = aesKey;
                return this;
            }

            /**
             * ApiAccount.
             */
            public Builder apiAccount(String apiAccount) {
                this.apiAccount = apiAccount;
                return this;
            }

            /**
             * ApiId.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * ApiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * ApiPassword.
             */
            public Builder apiPassword(String apiPassword) {
                this.apiPassword = apiPassword;
                return this;
            }

            /**
             * CapAppId.
             */
            public Builder capAppId(String capAppId) {
                this.capAppId = capAppId;
                return this;
            }

            /**
             * DySmsAccessProfiles.
             */
            public Builder dySmsAccessProfiles(java.util.List<DySmsAccessProfiles> dySmsAccessProfiles) {
                this.dySmsAccessProfiles = dySmsAccessProfiles;
                return this;
            }

            /**
             * Extno.
             */
            public Builder extno(String extno) {
                this.extno = extno;
                return this;
            }

            /**
             * ManagementPassword.
             */
            public Builder managementPassword(String managementPassword) {
                this.managementPassword = managementPassword;
                return this;
            }

            /**
             * ManagementSubUserId.
             */
            public Builder managementSubUserId(String managementSubUserId) {
                this.managementSubUserId = managementSubUserId;
                return this;
            }

            /**
             * ManagementUsername.
             */
            public Builder managementUsername(String managementUsername) {
                this.managementUsername = managementUsername;
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
             * Pwd.
             */
            public Builder pwd(String pwd) {
                this.pwd = pwd;
                return this;
            }

            /**
             * User.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public AccessProfile build() {
                return new AccessProfile(this);
            } 

        } 

    }
}
