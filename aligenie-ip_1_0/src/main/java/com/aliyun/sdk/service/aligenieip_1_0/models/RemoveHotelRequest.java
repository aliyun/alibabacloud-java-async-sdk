// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link RemoveHotelRequest} extends {@link RequestModel}
 *
 * <p>RemoveHotelRequest</p>
 */
public class RemoveHotelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TbOpenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tbOpenId;

    private RemoveHotelRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.hotelId = builder.hotelId;
        this.tbOpenId = builder.tbOpenId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveHotelRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveHotelRequest, Builder> {
        private String appKey; 
        private String hotelId; 
        private String tbOpenId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveHotelRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.hotelId = request.hotelId;
            this.tbOpenId = request.tbOpenId;
        } 

        /**
         * <p>appkey</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30193305</p>
         */
        public Builder appKey(String appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e6dd44fd16084db8a60d69fd625d9f0f</p>
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AAEVK***UE3d3Z2ETwh</p>
         */
        public Builder tbOpenId(String tbOpenId) {
            this.putBodyParameter("TbOpenId", tbOpenId);
            this.tbOpenId = tbOpenId;
            return this;
        }

        @Override
        public RemoveHotelRequest build() {
            return new RemoveHotelRequest(this);
        } 

    } 

}
