// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDialogueTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListDialogueTemplateRequest</p>
 */
public class ListDialogueTemplateRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    private ListDialogueTemplateRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDialogueTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<ListDialogueTemplateRequest, Builder> {
        private String hotelId; 

        private Builder() {
            super();
        } 

        private Builder(ListDialogueTemplateRequest request) {
            super(request);
            this.hotelId = request.hotelId;
        } 

        /**
         * hotelId
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        @Override
        public ListDialogueTemplateRequest build() {
            return new ListDialogueTemplateRequest(this);
        } 

    } 

}
