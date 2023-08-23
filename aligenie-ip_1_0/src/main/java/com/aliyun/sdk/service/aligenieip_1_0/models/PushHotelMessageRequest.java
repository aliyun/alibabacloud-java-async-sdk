// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushHotelMessageRequest} extends {@link RequestModel}
 *
 * <p>PushHotelMessageRequest</p>
 */
public class PushHotelMessageRequest extends Request {
    @Query
    @NameInMap("PushHotelMessageReq")
    @Validation(required = true)
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
         * pushHotelMessageReq
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

    public static class PushHotelMessageReq extends TeaModel {
        @NameInMap("HotelId")
        @Validation(required = true)
        private String hotelId;

        @NameInMap("ParamMap")
        private java.util.Map < String, String > paramMap;

        @NameInMap("RoomNo")
        @Validation(required = true)
        private String roomNo;

        @NameInMap("TemplateId")
        @Validation(required = true)
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
        public java.util.Map < String, String > getParamMap() {
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
            private java.util.Map < String, String > paramMap; 
            private String roomNo; 
            private Long templateId; 

            /**
             * HotelId.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * ParamMap.
             */
            public Builder paramMap(java.util.Map < String, String > paramMap) {
                this.paramMap = paramMap;
                return this;
            }

            /**
             * RoomNo.
             */
            public Builder roomNo(String roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            /**
             * TemplateId.
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
