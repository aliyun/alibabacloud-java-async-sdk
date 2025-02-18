// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link UpdateTunnelQuotaTimerRequest} extends {@link RequestModel}
 *
 * <p>UpdateTunnelQuotaTimerRequest</p>
 */
public class UpdateTunnelQuotaTimerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nickname")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickname;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<UpdateTunnelQuotaTimerRequestBody> body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timezone")
    private String timezone;

    private UpdateTunnelQuotaTimerRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
        this.body = builder.body;
        this.timezone = builder.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTunnelQuotaTimerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return body
     */
    public java.util.List<UpdateTunnelQuotaTimerRequestBody> getBody() {
        return this.body;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    public static final class Builder extends Request.Builder<UpdateTunnelQuotaTimerRequest, Builder> {
        private String nickname; 
        private java.util.List<UpdateTunnelQuotaTimerRequestBody> body; 
        private String timezone; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTunnelQuotaTimerRequest request) {
            super(request);
            this.nickname = request.nickname;
            this.body = request.body;
            this.timezone = request.timezone;
        } 

        /**
         * <p>The alias of the level-1 Tunnel quota.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ot_tunnel_quota_p</p>
         */
        public Builder nickname(String nickname) {
            this.putPathParameter("nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * <p>The request body.</p>
         */
        public Builder body(java.util.List<UpdateTunnelQuotaTimerRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * timezone.
         */
        public Builder timezone(String timezone) {
            this.putQueryParameter("timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        @Override
        public UpdateTunnelQuotaTimerRequest build() {
            return new UpdateTunnelQuotaTimerRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTunnelQuotaTimerRequest} extends {@link TeaModel}
     *
     * <p>UpdateTunnelQuotaTimerRequest</p>
     */
    public static class TunnelQuotaParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("elasticReservedSlotNum")
        private Long elasticReservedSlotNum;

        @com.aliyun.core.annotation.NameInMap("slotNum")
        private Long slotNum;

        private TunnelQuotaParameter(Builder builder) {
            this.elasticReservedSlotNum = builder.elasticReservedSlotNum;
            this.slotNum = builder.slotNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelQuotaParameter create() {
            return builder().build();
        }

        /**
         * @return elasticReservedSlotNum
         */
        public Long getElasticReservedSlotNum() {
            return this.elasticReservedSlotNum;
        }

        /**
         * @return slotNum
         */
        public Long getSlotNum() {
            return this.slotNum;
        }

        public static final class Builder {
            private Long elasticReservedSlotNum; 
            private Long slotNum; 

            /**
             * <p>The number of elastically reserved slots.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder elasticReservedSlotNum(Long elasticReservedSlotNum) {
                this.elasticReservedSlotNum = elasticReservedSlotNum;
                return this;
            }

            /**
             * <p>The number of reserved slots.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder slotNum(Long slotNum) {
                this.slotNum = slotNum;
                return this;
            }

            public TunnelQuotaParameter build() {
                return new TunnelQuotaParameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTunnelQuotaTimerRequest} extends {@link TeaModel}
     *
     * <p>UpdateTunnelQuotaTimerRequest</p>
     */
    public static class UpdateTunnelQuotaTimerRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("beginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("tunnelQuotaParameter")
        private TunnelQuotaParameter tunnelQuotaParameter;

        private UpdateTunnelQuotaTimerRequestBody(Builder builder) {
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
            this.tunnelQuotaParameter = builder.tunnelQuotaParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateTunnelQuotaTimerRequestBody create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return tunnelQuotaParameter
         */
        public TunnelQuotaParameter getTunnelQuotaParameter() {
            return this.tunnelQuotaParameter;
        }

        public static final class Builder {
            private String beginTime; 
            private String endTime; 
            private TunnelQuotaParameter tunnelQuotaParameter; 

            /**
             * <p>The start time of the time-specific configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00</p>
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The end time of the time-specific configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>08:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The parameters for the time-specific configuration.</p>
             */
            public Builder tunnelQuotaParameter(TunnelQuotaParameter tunnelQuotaParameter) {
                this.tunnelQuotaParameter = tunnelQuotaParameter;
                return this;
            }

            public UpdateTunnelQuotaTimerRequestBody build() {
                return new UpdateTunnelQuotaTimerRequestBody(this);
            } 

        } 

    }
}
