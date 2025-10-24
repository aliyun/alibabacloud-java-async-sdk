// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribePocFunctionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePocFunctionsResponseBody</p>
 */
public class DescribePocFunctionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Functions")
    private java.util.List<Functions> functions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePocFunctionsResponseBody(Builder builder) {
        this.functions = builder.functions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePocFunctionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functions
     */
    public java.util.List<Functions> getFunctions() {
        return this.functions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Functions> functions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePocFunctionsResponseBody model) {
            this.functions = model.functions;
            this.requestId = model.requestId;
        } 

        /**
         * Functions.
         */
        public Builder functions(java.util.List<Functions> functions) {
            this.functions = functions;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePocFunctionsResponseBody build() {
            return new DescribePocFunctionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePocFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePocFunctionsResponseBody</p>
     */
    public static class Functions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Functions(Builder builder) {
            this.expireTime = builder.expireTime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Functions create() {
            return builder().build();
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long expireTime; 
            private String type; 

            private Builder() {
            } 

            private Builder(Functions model) {
                this.expireTime = model.expireTime;
                this.type = model.type;
            } 

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Functions build() {
                return new Functions(this);
            } 

        } 

    }
}
