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
 * {@link ListSceneCategoryRequest} extends {@link RequestModel}
 *
 * <p>ListSceneCategoryRequest</p>
 */
public class ListSceneCategoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ListSceneCategoryRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSceneCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListSceneCategoryRequest, Builder> {
        private String hotelId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListSceneCategoryRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.type = request.type;
        } 

        /**
         * <p>hotelId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80d84ea8ed9e422fbad52715c8fc56f1</p>
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
         * <p>REPAIR</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListSceneCategoryRequest build() {
            return new ListSceneCategoryRequest(this);
        } 

    } 

}
