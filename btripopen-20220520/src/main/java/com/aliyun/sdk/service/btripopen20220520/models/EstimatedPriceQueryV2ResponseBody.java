// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link EstimatedPriceQueryV2ResponseBody} extends {@link TeaModel}
 *
 * <p>EstimatedPriceQueryV2ResponseBody</p>
 */
public class EstimatedPriceQueryV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("module")
    private java.util.List<Module> module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private EstimatedPriceQueryV2ResponseBody(Builder builder) {
        this.code = builder.code;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EstimatedPriceQueryV2ResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return module
     */
    public java.util.List<Module> getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List<Module> module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(EstimatedPriceQueryV2ResponseBody model) {
            this.code = model.code;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * module.
         */
        public Builder module(java.util.List<Module> module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>210bcc3a16583004579056128d33d7</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public EstimatedPriceQueryV2ResponseBody build() {
            return new EstimatedPriceQueryV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EstimatedPriceQueryV2ResponseBody} extends {@link TeaModel}
     *
     * <p>EstimatedPriceQueryV2ResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("biz_type")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("price_map")
        private java.util.Map<String, ModulePriceMapValue> priceMap;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Module(Builder builder) {
            this.bizType = builder.bizType;
            this.priceMap = builder.priceMap;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return priceMap
         */
        public java.util.Map<String, ModulePriceMapValue> getPriceMap() {
            return this.priceMap;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bizType; 
            private java.util.Map<String, ModulePriceMapValue> priceMap; 
            private String type; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.bizType = model.bizType;
                this.priceMap = model.priceMap;
                this.type = model.type;
            } 

            /**
             * biz_type.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * price_map.
             */
            public Builder priceMap(java.util.Map<String, ModulePriceMapValue> priceMap) {
                this.priceMap = priceMap;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
