// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceQARequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceQARequest</p>
 */
public class UpdateServiceQARequest extends Request {
    @Body
    @NameInMap("Answer")
    private String answer;

    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("ServiceQAId")
    private Long serviceQAId;

    @Body
    @NameInMap("isActive")
    private Boolean isActive;

    private UpdateServiceQARequest(Builder builder) {
        super(builder);
        this.answer = builder.answer;
        this.hotelId = builder.hotelId;
        this.serviceQAId = builder.serviceQAId;
        this.isActive = builder.isActive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceQARequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answer
     */
    public String getAnswer() {
        return this.answer;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return serviceQAId
     */
    public Long getServiceQAId() {
        return this.serviceQAId;
    }

    /**
     * @return isActive
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    public static final class Builder extends Request.Builder<UpdateServiceQARequest, Builder> {
        private String answer; 
        private String hotelId; 
        private Long serviceQAId; 
        private Boolean isActive; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceQARequest request) {
            super(request);
            this.answer = request.answer;
            this.hotelId = request.hotelId;
            this.serviceQAId = request.serviceQAId;
            this.isActive = request.isActive;
        } 

        /**
         * Answer.
         */
        public Builder answer(String answer) {
            this.putBodyParameter("Answer", answer);
            this.answer = answer;
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
         * ServiceQAId.
         */
        public Builder serviceQAId(Long serviceQAId) {
            this.putBodyParameter("ServiceQAId", serviceQAId);
            this.serviceQAId = serviceQAId;
            return this;
        }

        /**
         * isActive.
         */
        public Builder isActive(Boolean isActive) {
            this.putBodyParameter("isActive", isActive);
            this.isActive = isActive;
            return this;
        }

        @Override
        public UpdateServiceQARequest build() {
            return new UpdateServiceQARequest(this);
        } 

    } 

}
