// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChildAccountAuthRequest} extends {@link RequestModel}
 *
 * <p>ChildAccountAuthRequest</p>
 */
public class ChildAccountAuthRequest extends Request {
    @Body
    @NameInMap("Account")
    @Validation(required = true)
    private String account;

    @Body
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("TbOpenId")
    @Validation(required = true)
    private String tbOpenId;

    private ChildAccountAuthRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.appKey = builder.appKey;
        this.hotelId = builder.hotelId;
        this.tbOpenId = builder.tbOpenId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChildAccountAuthRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return tbOpenId
     */
    public String getTbOpenId() {
        return this.tbOpenId;
    }

    public static final class Builder extends Request.Builder<ChildAccountAuthRequest, Builder> {
        private String account; 
        private String appKey; 
        private String hotelId; 
        private String tbOpenId; 

        private Builder() {
            super();
        } 

        private Builder(ChildAccountAuthRequest request) {
            super(request);
            this.account = request.account;
            this.appKey = request.appKey;
            this.hotelId = request.hotelId;
            this.tbOpenId = request.tbOpenId;
        } 

        /**
         * Account.
         */
        public Builder account(String account) {
            this.putBodyParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * HotelId.
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * TbOpenId.
         */
        public Builder tbOpenId(String tbOpenId) {
            this.putBodyParameter("TbOpenId", tbOpenId);
            this.tbOpenId = tbOpenId;
            return this;
        }

        @Override
        public ChildAccountAuthRequest build() {
            return new ChildAccountAuthRequest(this);
        } 

    } 

}
