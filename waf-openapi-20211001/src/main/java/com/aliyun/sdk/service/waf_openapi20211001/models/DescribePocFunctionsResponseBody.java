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
         * <p>A list of the POC feature details.</p>
         */
        public Builder functions(java.util.List<Functions> functions) {
            this.functions = functions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1557B42F-B889-460A-B17F-1DE5C5AD7FF2</p>
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
             * <p>The expiration time of the POC feature trial. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1760581677000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The type of the POC feature trial. Valid values:</p>
             * <ul>
             * <li><p><strong>apisec</strong>: API security.</p>
             * </li>
             * <li><p><strong>botWeb</strong>: bot management for websites.</p>
             * </li>
             * <li><p><strong>botApp</strong>: bot management for apps.</p>
             * </li>
             * <li><p><strong>largeLanguageModel</strong>: AI-powered application protection.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>botWeb</p>
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
