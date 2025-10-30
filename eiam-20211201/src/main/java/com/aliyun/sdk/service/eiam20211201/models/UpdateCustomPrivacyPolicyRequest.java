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
 * {@link UpdateCustomPrivacyPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomPrivacyPolicyRequest</p>
 */
public class UpdateCustomPrivacyPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyContents")
    private java.util.List<CustomPrivacyPolicyContents> customPrivacyPolicyContents;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String customPrivacyPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyName")
    private String customPrivacyPolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultLanguageCode")
    private String defaultLanguageCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserConsentType")
    private String userConsentType;

    private UpdateCustomPrivacyPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.customPrivacyPolicyContents = builder.customPrivacyPolicyContents;
        this.customPrivacyPolicyId = builder.customPrivacyPolicyId;
        this.customPrivacyPolicyName = builder.customPrivacyPolicyName;
        this.defaultLanguageCode = builder.defaultLanguageCode;
        this.instanceId = builder.instanceId;
        this.userConsentType = builder.userConsentType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomPrivacyPolicyRequest create() {
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
     * @return customPrivacyPolicyContents
     */
    public java.util.List<CustomPrivacyPolicyContents> getCustomPrivacyPolicyContents() {
        return this.customPrivacyPolicyContents;
    }

    /**
     * @return customPrivacyPolicyId
     */
    public String getCustomPrivacyPolicyId() {
        return this.customPrivacyPolicyId;
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
     * @return userConsentType
     */
    public String getUserConsentType() {
        return this.userConsentType;
    }

    public static final class Builder extends Request.Builder<UpdateCustomPrivacyPolicyRequest, Builder> {
        private String regionId; 
        private java.util.List<CustomPrivacyPolicyContents> customPrivacyPolicyContents; 
        private String customPrivacyPolicyId; 
        private String customPrivacyPolicyName; 
        private String defaultLanguageCode; 
        private String instanceId; 
        private String userConsentType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomPrivacyPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.customPrivacyPolicyContents = request.customPrivacyPolicyContents;
            this.customPrivacyPolicyId = request.customPrivacyPolicyId;
            this.customPrivacyPolicyName = request.customPrivacyPolicyName;
            this.defaultLanguageCode = request.defaultLanguageCode;
            this.instanceId = request.instanceId;
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
         * CustomPrivacyPolicyContents.
         */
        public Builder customPrivacyPolicyContents(java.util.List<CustomPrivacyPolicyContents> customPrivacyPolicyContents) {
            this.putQueryParameter("CustomPrivacyPolicyContents", customPrivacyPolicyContents);
            this.customPrivacyPolicyContents = customPrivacyPolicyContents;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pp_neagxpoznsjdtxxxxx</p>
         */
        public Builder customPrivacyPolicyId(String customPrivacyPolicyId) {
            this.putQueryParameter("CustomPrivacyPolicyId", customPrivacyPolicyId);
            this.customPrivacyPolicyId = customPrivacyPolicyId;
            return this;
        }

        /**
         * CustomPrivacyPolicyName.
         */
        public Builder customPrivacyPolicyName(String customPrivacyPolicyName) {
            this.putQueryParameter("CustomPrivacyPolicyName", customPrivacyPolicyName);
            this.customPrivacyPolicyName = customPrivacyPolicyName;
            return this;
        }

        /**
         * DefaultLanguageCode.
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
         * UserConsentType.
         */
        public Builder userConsentType(String userConsentType) {
            this.putQueryParameter("UserConsentType", userConsentType);
            this.userConsentType = userConsentType;
            return this;
        }

        @Override
        public UpdateCustomPrivacyPolicyRequest build() {
            return new UpdateCustomPrivacyPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCustomPrivacyPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateCustomPrivacyPolicyRequest</p>
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
             * CustomPrivacyPolicyItemName.
             */
            public Builder customPrivacyPolicyItemName(String customPrivacyPolicyItemName) {
                this.customPrivacyPolicyItemName = customPrivacyPolicyItemName;
                return this;
            }

            /**
             * CustomPrivacyPolicyItemUrl.
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
     * {@link UpdateCustomPrivacyPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateCustomPrivacyPolicyRequest</p>
     */
    public static class CustomPrivacyPolicyContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyItems")
        private java.util.List<CustomPrivacyPolicyItems> customPrivacyPolicyItems;

        @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyTip")
        private String customPrivacyPolicyTip;

        @com.aliyun.core.annotation.NameInMap("LanguageCode")
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
             * CustomPrivacyPolicyItems.
             */
            public Builder customPrivacyPolicyItems(java.util.List<CustomPrivacyPolicyItems> customPrivacyPolicyItems) {
                this.customPrivacyPolicyItems = customPrivacyPolicyItems;
                return this;
            }

            /**
             * CustomPrivacyPolicyTip.
             */
            public Builder customPrivacyPolicyTip(String customPrivacyPolicyTip) {
                this.customPrivacyPolicyTip = customPrivacyPolicyTip;
                return this;
            }

            /**
             * LanguageCode.
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
