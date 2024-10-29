// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link LookupWmInfoMappingResponseBody} extends {@link TeaModel}
 *
 * <p>LookupWmInfoMappingResponseBody</p>
 */
public class LookupWmInfoMappingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private LookupWmInfoMappingResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LookupWmInfoMappingResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LookupWmInfoMappingResponseBody build() {
            return new LookupWmInfoMappingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link LookupWmInfoMappingResponseBody} extends {@link TeaModel}
     *
     * <p>LookupWmInfoMappingResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WmInfoBytesB64")
        private String wmInfoBytesB64;

        private Data(Builder builder) {
            this.wmInfoBytesB64 = builder.wmInfoBytesB64;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return wmInfoBytesB64
         */
        public String getWmInfoBytesB64() {
            return this.wmInfoBytesB64;
        }

        public static final class Builder {
            private String wmInfoBytesB64; 

            /**
             * WmInfoBytesB64.
             */
            public Builder wmInfoBytesB64(String wmInfoBytesB64) {
                this.wmInfoBytesB64 = wmInfoBytesB64;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
