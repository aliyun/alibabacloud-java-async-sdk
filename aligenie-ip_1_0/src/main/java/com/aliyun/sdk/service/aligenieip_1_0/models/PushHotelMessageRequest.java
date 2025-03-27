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
 * {@link PushHotelMessageRequest} extends {@link RequestModel}
 *
 * <p>PushHotelMessageRequest</p>
 */
public class PushHotelMessageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushHotelMessageReq")
    @com.aliyun.core.annotation.Validation(required = true)
    private PushHotelMessageReq pushHotelMessageReq;

    private PushHotelMessageRequest(Builder builder) {
        super(builder);
        this.pushHotelMessageReq = builder.pushHotelMessageReq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushHotelMessageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pushHotelMessageReq
     */
    public PushHotelMessageReq getPushHotelMessageReq() {
        return this.pushHotelMessageReq;
    }

    public static final class Builder extends Request.Builder<PushHotelMessageRequest, Builder> {
        private PushHotelMessageReq pushHotelMessageReq; 

        private Builder() {
            super();
        } 

        private Builder(PushHotelMessageRequest request) {
            super(request);
            this.pushHotelMessageReq = request.pushHotelMessageReq;
        } 

        /**
         * <p>pushHotelMessageReq</p>
         * <p>This parameter is required.</p>
         */
        public Builder pushHotelMessageReq(PushHotelMessageReq pushHotelMessageReq) {
            String pushHotelMessageReqShrink = shrink(pushHotelMessageReq, "PushHotelMessageReq", "json");
            this.putQueryParameter("PushHotelMessageReq", pushHotelMessageReqShrink);
            this.pushHotelMessageReq = pushHotelMessageReq;
            return this;
        }

        @Override
        public PushHotelMessageRequest build() {
            return new PushHotelMessageRequest(this);
        } 

    } 

    /**
     * 
     * {@link PushHotelMessageRequest} extends {@link TeaModel}
     *
     * <p>PushHotelMessageRequest</p>
     */
    public static class PushHotelMessageReq extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HotelId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String hotelId;

        @com.aliyun.core.annotation.NameInMap("ParamMap")
        private java.util.Map<String, String> paramMap;

        @com.aliyun.core.annotation.NameInMap("RoomNo")
        @com.aliyun.core.annotation.Validation(required = true)
        private String roomNo;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long templateId;

        private PushHotelMessageReq(Builder builder) {
            this.hotelId = builder.hotelId;
            this.paramMap = builder.paramMap;
            this.roomNo = builder.roomNo;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushHotelMessageReq create() {
            return builder().build();
        }

        /**
         * @return hotelId
         */
        public String getHotelId() {
            return this.hotelId;
        }

        /**
         * @return paramMap
         */
        public java.util.Map<String, String> getParamMap() {
            return this.paramMap;
        }

        /**
         * @return roomNo
         */
        public String getRoomNo() {
            return this.roomNo;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String hotelId; 
            private java.util.Map<String, String> paramMap; 
            private String roomNo; 
            private Long templateId; 

            private Builder() {
            } 

            private Builder(PushHotelMessageReq model) {
                this.hotelId = model.hotelId;
                this.paramMap = model.paramMap;
                this.roomNo = model.roomNo;
                this.templateId = model.templateId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>e6dd44fd16084db8a60d69fd625d9f0f</p>
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * ParamMap.
             */
            public Builder paramMap(java.util.Map<String, String> paramMap) {
                this.paramMap = paramMap;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>102</p>
             */
            public Builder roomNo(String roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public PushHotelMessageReq build() {
                return new PushHotelMessageReq(this);
            } 

        } 

    }
}
