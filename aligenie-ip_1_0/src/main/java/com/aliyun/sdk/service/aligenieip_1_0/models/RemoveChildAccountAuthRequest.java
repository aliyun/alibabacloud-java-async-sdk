// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveChildAccountAuthRequest} extends {@link RequestModel}
 *
 * <p>RemoveChildAccountAuthRequest</p>
 */
public class RemoveChildAccountAuthRequest extends Request {
    @Body
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Body
    @NameInMap("ChildAccountName")
    @Validation(required = true)
    private String childAccountName;

    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("TbOpenId")
    @Validation(required = true)
    private String tbOpenId;

    private RemoveChildAccountAuthRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.childAccountName = builder.childAccountName;
        this.hotelId = builder.hotelId;
        this.tbOpenId = builder.tbOpenId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveChildAccountAuthRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return childAccountName
     */
    public String getChildAccountName() {
        return this.childAccountName;
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

    public static final class Builder extends Request.Builder<RemoveChildAccountAuthRequest, Builder> {
        private String appKey; 
        private String childAccountName; 
        private String hotelId; 
        private String tbOpenId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveChildAccountAuthRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.childAccountName = request.childAccountName;
            this.hotelId = request.hotelId;
            this.tbOpenId = request.tbOpenId;
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
         * ChildAccountName.
         */
        public Builder childAccountName(String childAccountName) {
            this.putBodyParameter("ChildAccountName", childAccountName);
            this.childAccountName = childAccountName;
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
        public RemoveChildAccountAuthRequest build() {
            return new RemoveChildAccountAuthRequest(this);
        } 

    } 

}
