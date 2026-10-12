// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CheckCommodityStatusResponseBody} extends {@link TeaModel}
 *
 * <p>CheckCommodityStatusResponseBody</p>
 */
public class CheckCommodityStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("commodities")
    private java.util.List<Commodities> commodities;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CheckCommodityStatusResponseBody(Builder builder) {
        this.commodities = builder.commodities;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCommodityStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodities
     */
    public java.util.List<Commodities> getCommodities() {
        return this.commodities;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Commodities> commodities; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckCommodityStatusResponseBody model) {
            this.commodities = model.commodities;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The commodity status list. Each item contains the commodity code and indicates whether the commodity capability is enabled for the current account.</p>
         */
        public Builder commodities(java.util.List<Commodities> commodities) {
            this.commodities = commodities;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckCommodityStatusResponseBody build() {
            return new CheckCommodityStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckCommodityStatusResponseBody} extends {@link TeaModel}
     *
     * <p>CheckCommodityStatusResponseBody</p>
     */
    public static class Commodities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("commodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        private Commodities(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commodities create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private String commodityCode; 
            private Boolean enable; 

            private Builder() {
            } 

            private Builder(Commodities model) {
                this.commodityCode = model.commodityCode;
                this.enable = model.enable;
            } 

            /**
             * <p>The commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>apigateway_aicredits_public_cn</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>Indicates whether the commodity capability is enabled for the current account.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public Commodities build() {
                return new Commodities(this);
            } 

        } 

    }
}
