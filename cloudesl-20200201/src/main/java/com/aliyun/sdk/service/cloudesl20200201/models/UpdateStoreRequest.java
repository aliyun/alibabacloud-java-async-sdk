// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStoreRequest} extends {@link RequestModel}
 *
 * <p>UpdateStoreRequest</p>
 */
public class UpdateStoreRequest extends Request {
    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("Phone")
    private String phone;

    @Body
    @NameInMap("StoreId")
    @Validation(required = true)
    private String storeId;

    @Body
    @NameInMap("StoreName")
    private String storeName;

    @Body
    @NameInMap("TemplateVersion")
    private String templateVersion;

    @Body
    @NameInMap("Timezone")
    private String timezone;

    @Body
    @NameInMap("UserStoreCode")
    private String userStoreCode;

    private UpdateStoreRequest(Builder builder) {
        super(builder);
        this.extraParams = builder.extraParams;
        this.phone = builder.phone;
        this.storeId = builder.storeId;
        this.storeName = builder.storeName;
        this.templateVersion = builder.templateVersion;
        this.timezone = builder.timezone;
        this.userStoreCode = builder.userStoreCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStoreRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    /**
     * @return storeName
     */
    public String getStoreName() {
        return this.storeName;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * @return userStoreCode
     */
    public String getUserStoreCode() {
        return this.userStoreCode;
    }

    public static final class Builder extends Request.Builder<UpdateStoreRequest, Builder> {
        private String extraParams; 
        private String phone; 
        private String storeId; 
        private String storeName; 
        private String templateVersion; 
        private String timezone; 
        private String userStoreCode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStoreRequest response) {
            super(response);
            this.extraParams = response.extraParams;
            this.phone = response.phone;
            this.storeId = response.storeId;
            this.storeName = response.storeName;
            this.templateVersion = response.templateVersion;
            this.timezone = response.timezone;
            this.userStoreCode = response.userStoreCode;
        } 

        /**
         * ExtraParams.
         */
        public Builder extraParams(String extraParams) {
            this.putBodyParameter("ExtraParams", extraParams);
            this.extraParams = extraParams;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.putBodyParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        /**
         * StoreName.
         */
        public Builder storeName(String storeName) {
            this.putBodyParameter("StoreName", storeName);
            this.storeName = storeName;
            return this;
        }

        /**
         * TemplateVersion.
         */
        public Builder templateVersion(String templateVersion) {
            this.putBodyParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * Timezone.
         */
        public Builder timezone(String timezone) {
            this.putBodyParameter("Timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        /**
         * UserStoreCode.
         */
        public Builder userStoreCode(String userStoreCode) {
            this.putBodyParameter("UserStoreCode", userStoreCode);
            this.userStoreCode = userStoreCode;
            return this;
        }

        @Override
        public UpdateStoreRequest build() {
            return new UpdateStoreRequest(this);
        } 

    } 

}
