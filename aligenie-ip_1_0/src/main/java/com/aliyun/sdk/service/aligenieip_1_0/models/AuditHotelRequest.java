// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuditHotelRequest} extends {@link RequestModel}
 *
 * <p>AuditHotelRequest</p>
 */
public class AuditHotelRequest extends Request {
    @Query
    @NameInMap("AuditHotelReq")
    @Validation(required = true)
    private AuditHotelReq auditHotelReq;

    private AuditHotelRequest(Builder builder) {
        super(builder);
        this.auditHotelReq = builder.auditHotelReq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuditHotelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditHotelReq
     */
    public AuditHotelReq getAuditHotelReq() {
        return this.auditHotelReq;
    }

    public static final class Builder extends Request.Builder<AuditHotelRequest, Builder> {
        private AuditHotelReq auditHotelReq; 

        private Builder() {
            super();
        } 

        private Builder(AuditHotelRequest request) {
            super(request);
            this.auditHotelReq = request.auditHotelReq;
        } 

        /**
         * AuditHotelReq.
         */
        public Builder auditHotelReq(AuditHotelReq auditHotelReq) {
            String auditHotelReqShrink = shrink(auditHotelReq, "AuditHotelReq", "json");
            this.putQueryParameter("AuditHotelReq", auditHotelReqShrink);
            this.auditHotelReq = auditHotelReq;
            return this;
        }

        @Override
        public AuditHotelRequest build() {
            return new AuditHotelRequest(this);
        } 

    } 

    public static class AuditHotelReq extends TeaModel {
        @NameInMap("AuditOpinion")
        private String auditOpinion;

        @NameInMap("HotelId")
        @Validation(required = true)
        private String hotelId;

        @NameInMap("Status")
        @Validation(required = true)
        private Integer status;

        private AuditHotelReq(Builder builder) {
            this.auditOpinion = builder.auditOpinion;
            this.hotelId = builder.hotelId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuditHotelReq create() {
            return builder().build();
        }

        /**
         * @return auditOpinion
         */
        public String getAuditOpinion() {
            return this.auditOpinion;
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
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String auditOpinion; 
            private String hotelId; 
            private Integer status; 

            /**
             * AuditOpinion.
             */
            public Builder auditOpinion(String auditOpinion) {
                this.auditOpinion = auditOpinion;
                return this;
            }

            /**
             * HotelId.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public AuditHotelReq build() {
                return new AuditHotelReq(this);
            } 

        } 

    }
}
