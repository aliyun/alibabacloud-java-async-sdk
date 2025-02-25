// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link UpdateGatewayRouteTimeoutRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayRouteTimeoutRequest</p>
 */
public class UpdateGatewayRouteTimeoutRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private Long gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutJSON")
    private TimeoutJSON timeoutJSON;

    private UpdateGatewayRouteTimeoutRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.gatewayId = builder.gatewayId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.id = builder.id;
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
            this.timeoutJSON = request.timeoutJSON;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>85</p>
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-533290d279c1405f9628c64f7c8272ee</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The ID of the associated record.</p>
         * 
         * <strong>example:</strong>
         * <p>567</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The timeout period.</p>
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

    /**
     * 
     * {@link UpdateGatewayRouteTimeoutRequest} extends {@link TeaModel}
     *
     * <p>UpdateGatewayRouteTimeoutRequest</p>
     */
    public static class TimeoutJSON extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TimeUnit")
        private String timeUnit;

        @com.aliyun.core.annotation.NameInMap("UnitNum")
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
             * <p>The status of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The unit of time. A value of s indicates seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>s</p>
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * <p>The value of the timeout period.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
