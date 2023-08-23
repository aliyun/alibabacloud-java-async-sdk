// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushWelcomeTextAndMusicRequest} extends {@link RequestModel}
 *
 * <p>PushWelcomeTextAndMusicRequest</p>
 */
public class PushWelcomeTextAndMusicRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("RoomNo")
    @Validation(required = true)
    private String roomNo;

    @Body
    @NameInMap("TemplateVariable")
    private java.util.Map < String, String > templateVariable;

    private PushWelcomeTextAndMusicRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.roomNo = builder.roomNo;
        this.templateVariable = builder.templateVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushWelcomeTextAndMusicRequest create() {
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
     * @return roomNo
     */
    public String getRoomNo() {
        return this.roomNo;
    }

    /**
     * @return templateVariable
     */
    public java.util.Map < String, String > getTemplateVariable() {
        return this.templateVariable;
    }

    public static final class Builder extends Request.Builder<PushWelcomeTextAndMusicRequest, Builder> {
        private String hotelId; 
        private String roomNo; 
        private java.util.Map < String, String > templateVariable; 

        private Builder() {
            super();
        } 

        private Builder(PushWelcomeTextAndMusicRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.roomNo = request.roomNo;
            this.templateVariable = request.templateVariable;
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
         * RoomNo.
         */
        public Builder roomNo(String roomNo) {
            this.putBodyParameter("RoomNo", roomNo);
            this.roomNo = roomNo;
            return this;
        }

        /**
         * TemplateVariable.
         */
        public Builder templateVariable(java.util.Map < String, String > templateVariable) {
            String templateVariableShrink = shrink(templateVariable, "TemplateVariable", "json");
            this.putBodyParameter("TemplateVariable", templateVariableShrink);
            this.templateVariable = templateVariable;
            return this;
        }

        @Override
        public PushWelcomeTextAndMusicRequest build() {
            return new PushWelcomeTextAndMusicRequest(this);
        } 

    } 

}
