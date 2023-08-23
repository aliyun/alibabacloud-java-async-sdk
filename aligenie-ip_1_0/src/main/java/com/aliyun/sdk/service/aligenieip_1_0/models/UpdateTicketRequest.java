// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTicketRequest} extends {@link RequestModel}
 *
 * <p>UpdateTicketRequest</p>
 */
public class UpdateTicketRequest extends Request {
    @Body
    @NameInMap("GroupKey")
    @Validation(required = true)
    private String groupKey;

    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    private UpdateTicketRequest(Builder builder) {
        super(builder);
        this.groupKey = builder.groupKey;
        this.hotelId = builder.hotelId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTicketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupKey
     */
    public String getGroupKey() {
        return this.groupKey;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateTicketRequest, Builder> {
        private String groupKey; 
        private String hotelId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTicketRequest request) {
            super(request);
            this.groupKey = request.groupKey;
            this.hotelId = request.hotelId;
            this.status = request.status;
        } 

        /**
         * GroupKey.
         */
        public Builder groupKey(String groupKey) {
            this.putBodyParameter("GroupKey", groupKey);
            this.groupKey = groupKey;
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
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateTicketRequest build() {
            return new UpdateTicketRequest(this);
        } 

    } 

}
