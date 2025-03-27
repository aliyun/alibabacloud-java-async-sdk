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
 * {@link UpdateServiceQARequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceQARequest</p>
 */
public class UpdateServiceQARequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Answer")
    private String answer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceQAId")
    private Long serviceQAId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isActive")
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>af7***536</p>
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
