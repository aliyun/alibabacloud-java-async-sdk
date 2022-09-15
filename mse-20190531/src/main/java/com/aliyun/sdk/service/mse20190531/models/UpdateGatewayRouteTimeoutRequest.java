// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayRouteTimeoutRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayRouteTimeoutRequest</p>
 */
public class UpdateGatewayRouteTimeoutRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("GatewayId")
    private Long gatewayId;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("MseSessionId")
    private String mseSessionId;

    @Query
    @NameInMap("TimeoutJSON")
    private TimeoutJSON timeoutJSON;

    private UpdateGatewayRouteTimeoutRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.gatewayId = builder.gatewayId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.id = builder.id;
        this.mseSessionId = builder.mseSessionId;
        this.timeoutJSON = builder.timeoutJSON;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayRouteTimeoutRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return gatewayId
     */
    public Long getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return mseSessionId
     */
    public String getMseSessionId() {
        return this.mseSessionId;
    }

    /**
     * @return timeoutJSON
     */
    public TimeoutJSON getTimeoutJSON() {
        return this.timeoutJSON;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayRouteTimeoutRequest, Builder> {
        private String acceptLanguage; 
        private Long gatewayId; 
        private String gatewayUniqueId; 
        private Long id; 
        private String mseSessionId; 
        private TimeoutJSON timeoutJSON; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayRouteTimeoutRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.gatewayId = request.gatewayId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.id = request.id;
            this.mseSessionId = request.mseSessionId;
            this.timeoutJSON = request.timeoutJSON;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * MseSessionId.
         */
        public Builder mseSessionId(String mseSessionId) {
            this.putQueryParameter("MseSessionId", mseSessionId);
            this.mseSessionId = mseSessionId;
            return this;
        }

        /**
         * TimeoutJSON.
         */
        public Builder timeoutJSON(TimeoutJSON timeoutJSON) {
            String timeoutJSONShrink = shrink(timeoutJSON, "TimeoutJSON", "json");
            this.putQueryParameter("TimeoutJSON", timeoutJSONShrink);
            this.timeoutJSON = timeoutJSON;
            return this;
        }

        @Override
        public UpdateGatewayRouteTimeoutRequest build() {
            return new UpdateGatewayRouteTimeoutRequest(this);
        } 

    } 

    public static class TimeoutJSON extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("TimeUnit")
        private String timeUnit;

        @NameInMap("UnitNum")
        private Integer unitNum;

        private TimeoutJSON(Builder builder) {
            this.status = builder.status;
            this.timeUnit = builder.timeUnit;
            this.unitNum = builder.unitNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeoutJSON create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeUnit
         */
        public String getTimeUnit() {
            return this.timeUnit;
        }

        /**
         * @return unitNum
         */
        public Integer getUnitNum() {
            return this.unitNum;
        }

        public static final class Builder {
            private String status; 
            private String timeUnit; 
            private Integer unitNum; 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TimeUnit.
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * UnitNum.
             */
            public Builder unitNum(Integer unitNum) {
                this.unitNum = unitNum;
                return this;
            }

            public TimeoutJSON build() {
                return new TimeoutJSON(this);
            } 

        } 

    }
}
