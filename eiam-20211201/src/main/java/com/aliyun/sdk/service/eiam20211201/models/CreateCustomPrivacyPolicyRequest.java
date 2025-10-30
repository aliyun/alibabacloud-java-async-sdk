// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateCustomPrivacyPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomPrivacyPolicyRequest</p>
 */
public class CreateCustomPrivacyPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyContents")
    private java.util.List<CustomPrivacyPolicyContents> customPrivacyPolicyContents;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 256)
    private String customPrivacyPolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultLanguageCode")
    private String defaultLanguageCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserConsentType")
    private String userConsentType;

    private CreateCustomPrivacyPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.customPrivacyPolicyContents = builder.customPrivacyPolicyContents;
        this.customPrivacyPolicyName = builder.customPrivacyPolicyName;
        this.defaultLanguageCode = builder.defaultLanguageCode;
        this.instanceId = builder.instanceId;
        this.status = builder.status;
        this.userConsentType = builder.userConsentType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomPrivacyPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return customPrivacyPolicyContents
     */
    public java.util.List<CustomPrivacyPolicyContents> getCustomPrivacyPolicyContents() {
        return this.customPrivacyPolicyContents;
    }

    /**
     * @return customPrivacyPolicyName
     */
    public String getCustomPrivacyPolicyName() {
        return this.customPrivacyPolicyName;
    }

    /**
     * @return defaultLanguageCode
     */
    public String getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userConsentType
     */
    public String getUserConsentType() {
        return this.userConsentType;
    }

    public static final class Builder extends Request.Builder<CreateCustomPrivacyPolicyRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private java.util.List<CustomPrivacyPolicyContents> customPrivacyPolicyContents; 
        private String customPrivacyPolicyName; 
        private String defaultLanguageCode; 
        private String instanceId; 
        private String status; 
        private String userConsentType; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomPrivacyPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.customPrivacyPolicyContents = request.customPrivacyPolicyContents;
            this.customPrivacyPolicyName = request.customPrivacyPolicyName;
            this.defaultLanguageCode = request.defaultLanguageCode;
            this.instanceId = request.instanceId;
            this.status = request.status;
            this.userConsentType = request.userConsentType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>自定义条款内容详情</p>
         */
        public Builder customPrivacyPolicyContents(java.util.List<CustomPrivacyPolicyContents> customPrivacyPolicyContents) {
            this.putQueryParameter("CustomPrivacyPolicyContents", customPrivacyPolicyContents);
            this.customPrivacyPolicyContents = customPrivacyPolicyContents;
            return this;
        }

        /**
         * <p>自定义条款名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom Privacy Policy Name</p>
         */
        public Builder customPrivacyPolicyName(String customPrivacyPolicyName) {
            this.putQueryParameter("CustomPrivacyPolicyName", customPrivacyPolicyName);
            this.customPrivacyPolicyName = customPrivacyPolicyName;
            return this;
        }

        /**
         * <p>默认条款语言，若其他语言未配置条款，则使用默认的</p>
         * 
         * <strong>example:</strong>
         * <p>zh-Hans-CN</p>
         */
        public Builder defaultLanguageCode(String defaultLanguageCode) {
            this.putQueryParameter("DefaultLanguageCode", defaultLanguageCode);
            this.defaultLanguageCode = defaultLanguageCode;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>自定义条款状态</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>手动勾选同意，还是默认同意</p>
         * 
         * <strong>example:</strong>
         * <p>implied_consent</p>
         */
        public Builder userConsentType(String userConsentType) {
            this.putQueryParameter("UserConsentType", userConsentType);
            this.userConsentType = userConsentType;
            return this;
        }

        @Override
        public CreateCustomPrivacyPolicyRequest build() {
            return new CreateCustomPrivacyPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCustomPrivacyPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomPrivacyPolicyRequest</p>
     */
    public static class CustomPrivacyPolicyItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyItemName")
        private String customPrivacyPolicyItemName;

        @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyItemUrl")
        private String customPrivacyPolicyItemUrl;

        private CustomPrivacyPolicyItems(Builder builder) {
            this.customPrivacyPolicyItemName = builder.customPrivacyPolicyItemName;
            this.customPrivacyPolicyItemUrl = builder.customPrivacyPolicyItemUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPrivacyPolicyItems create() {
            return builder().build();
        }

        /**
         * @return customPrivacyPolicyItemName
         */
        public String getCustomPrivacyPolicyItemName() {
            return this.customPrivacyPolicyItemName;
        }

        /**
         * @return customPrivacyPolicyItemUrl
         */
        public String getCustomPrivacyPolicyItemUrl() {
            return this.customPrivacyPolicyItemUrl;
        }

        public static final class Builder {
            private String customPrivacyPolicyItemName; 
            private String customPrivacyPolicyItemUrl; 

            private Builder() {
            } 

            private Builder(CustomPrivacyPolicyItems model) {
                this.customPrivacyPolicyItemName = model.customPrivacyPolicyItemName;
                this.customPrivacyPolicyItemUrl = model.customPrivacyPolicyItemUrl;
            } 

            /**
             * <p>自定义条款名称</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx隐私政策条款</p>
             */
            public Builder customPrivacyPolicyItemName(String customPrivacyPolicyItemName) {
                this.customPrivacyPolicyItemName = customPrivacyPolicyItemName;
                return this;
            }

            /**
             * <p>自定义条款访问地址</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.xxxx.com">http://www.xxxx.com</a></p>
             */
            public Builder customPrivacyPolicyItemUrl(String customPrivacyPolicyItemUrl) {
                this.customPrivacyPolicyItemUrl = customPrivacyPolicyItemUrl;
                return this;
            }

            public CustomPrivacyPolicyItems build() {
                return new CustomPrivacyPolicyItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomPrivacyPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomPrivacyPolicyRequest</p>
     */
    public static class CustomPrivacyPolicyContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyItems")
        private java.util.List<CustomPrivacyPolicyItems> customPrivacyPolicyItems;

        @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyTip")
        @com.aliyun.core.annotation.Validation(maxLength = 256)
        private String customPrivacyPolicyTip;

        @com.aliyun.core.annotation.NameInMap("LanguageCode")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String languageCode;

        private CustomPrivacyPolicyContents(Builder builder) {
            this.customPrivacyPolicyItems = builder.customPrivacyPolicyItems;
            this.customPrivacyPolicyTip = builder.customPrivacyPolicyTip;
            this.languageCode = builder.languageCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPrivacyPolicyContents create() {
            return builder().build();
        }

        /**
         * @return customPrivacyPolicyItems
         */
        public java.util.List<CustomPrivacyPolicyItems> getCustomPrivacyPolicyItems() {
            return this.customPrivacyPolicyItems;
        }

        /**
         * @return customPrivacyPolicyTip
         */
        public String getCustomPrivacyPolicyTip() {
            return this.customPrivacyPolicyTip;
        }

        /**
         * @return languageCode
         */
        public String getLanguageCode() {
            return this.languageCode;
        }

        public static final class Builder {
            private java.util.List<CustomPrivacyPolicyItems> customPrivacyPolicyItems; 
            private String customPrivacyPolicyTip; 
            private String languageCode; 

            private Builder() {
            } 

            private Builder(CustomPrivacyPolicyContents model) {
                this.customPrivacyPolicyItems = model.customPrivacyPolicyItems;
                this.customPrivacyPolicyTip = model.customPrivacyPolicyTip;
                this.languageCode = model.languageCode;
            } 

            /**
             * <p>自定义条款项</p>
             */
            public Builder customPrivacyPolicyItems(java.util.List<CustomPrivacyPolicyItems> customPrivacyPolicyItems) {
                this.customPrivacyPolicyItems = customPrivacyPolicyItems;
                return this;
            }

            /**
             * <p>自定义条款提示</p>
             * 
             * <strong>example:</strong>
             * <p>登录视为同意此条款</p>
             */
            public Builder customPrivacyPolicyTip(String customPrivacyPolicyTip) {
                this.customPrivacyPolicyTip = customPrivacyPolicyTip;
                return this;
            }

            /**
             * <p>自定义条款所属语言</p>
             * 
             * <strong>example:</strong>
             * <p>zh-Hans-CN</p>
             */
            public Builder languageCode(String languageCode) {
                this.languageCode = languageCode;
                return this;
            }

            public CustomPrivacyPolicyContents build() {
                return new CustomPrivacyPolicyContents(this);
            } 

        } 

    }
}
