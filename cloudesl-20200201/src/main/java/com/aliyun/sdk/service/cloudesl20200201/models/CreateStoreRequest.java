// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStoreRequest} extends {@link RequestModel}
 *
 * <p>CreateStoreRequest</p>
 */
public class CreateStoreRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("ParentId")
    private String parentId;

    @Body
    @NameInMap("Phone")
    @Validation(required = true)
    private String phone;

    @Body
    @NameInMap("StoreName")
    @Validation(required = true)
    private String storeName;

    @Body
    @NameInMap("TimeZone")
    private String timeZone;

    @Body
    @NameInMap("UserStoreCode")
    private String userStoreCode;

    private CreateStoreRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.extraParams = builder.extraParams;
        this.parentId = builder.parentId;
        this.phone = builder.phone;
        this.storeName = builder.storeName;
        this.timeZone = builder.timeZone;
        this.userStoreCode = builder.userStoreCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStoreRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return storeName
     */
    public String getStoreName() {
        return this.storeName;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * @return userStoreCode
     */
    public String getUserStoreCode() {
        return this.userStoreCode;
    }

    public static final class Builder extends Request.Builder<CreateStoreRequest, Builder> {
        private String clientToken; 
        private String extraParams; 
        private String parentId; 
        private String phone; 
        private String storeName; 
        private String timeZone; 
        private String userStoreCode; 

        private Builder() {
            super();
        } 

        private Builder(CreateStoreRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.extraParams = response.extraParams;
            this.parentId = response.parentId;
            this.phone = response.phone;
            this.storeName = response.storeName;
            this.timeZone = response.timeZone;
            this.userStoreCode = response.userStoreCode;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
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
         * ParentId.
         */
        public Builder parentId(String parentId) {
            this.putBodyParameter("ParentId", parentId);
            this.parentId = parentId;
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
         * StoreName.
         */
        public Builder storeName(String storeName) {
            this.putBodyParameter("StoreName", storeName);
            this.storeName = storeName;
            return this;
        }

        /**
         * TimeZone.
         */
        public Builder timeZone(String timeZone) {
            this.putBodyParameter("TimeZone", timeZone);
            this.timeZone = timeZone;
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
        public CreateStoreRequest build() {
            return new CreateStoreRequest(this);
        } 

    } 

}
