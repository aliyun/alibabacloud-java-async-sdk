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
 * {@link AuditHotelRequest} extends {@link RequestModel}
 *
 * <p>AuditHotelRequest</p>
 */
public class AuditHotelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditHotelReq")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
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

    /**
     * 
     * {@link AuditHotelRequest} extends {@link TeaModel}
     *
     * <p>AuditHotelRequest</p>
     */
    public static class AuditHotelReq extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditOpinion")
        private String auditOpinion;

        @com.aliyun.core.annotation.NameInMap("HotelId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String hotelId;

        @com.aliyun.core.annotation.NameInMap("Status")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(AuditHotelReq model) {
                this.auditOpinion = model.auditOpinion;
                this.hotelId = model.hotelId;
                this.status = model.status;
            } 

            /**
             * AuditOpinion.
             */
            public Builder auditOpinion(String auditOpinion) {
                this.auditOpinion = auditOpinion;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>80d84ea8ed9e422fbad52715c8fc56f1</p>
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
