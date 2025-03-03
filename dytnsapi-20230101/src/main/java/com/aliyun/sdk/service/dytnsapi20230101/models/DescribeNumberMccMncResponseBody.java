// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20230101.models;

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
 * {@link DescribeNumberMccMncResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNumberMccMncResponseBody</p>
 */
public class DescribeNumberMccMncResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNumberMccMncResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNumberMccMncResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNumberMccMncResponseBody build() {
            return new DescribeNumberMccMncResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNumberMccMncResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNumberMccMncResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CountryIso3")
        private String countryIso3;

        @com.aliyun.core.annotation.NameInMap("Mcc")
        private String mcc;

        @com.aliyun.core.annotation.NameInMap("Mnc")
        private String mnc;

        @com.aliyun.core.annotation.NameInMap("Ported")
        private Boolean ported;

        private Data(Builder builder) {
            this.countryIso3 = builder.countryIso3;
            this.mcc = builder.mcc;
            this.mnc = builder.mnc;
            this.ported = builder.ported;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return countryIso3
         */
        public String getCountryIso3() {
            return this.countryIso3;
        }

        /**
         * @return mcc
         */
        public String getMcc() {
            return this.mcc;
        }

        /**
         * @return mnc
         */
        public String getMnc() {
            return this.mnc;
        }

        /**
         * @return ported
         */
        public Boolean getPorted() {
            return this.ported;
        }

        public static final class Builder {
            private String countryIso3; 
            private String mcc; 
            private String mnc; 
            private Boolean ported; 

            /**
             * CountryIso3.
             */
            public Builder countryIso3(String countryIso3) {
                this.countryIso3 = countryIso3;
                return this;
            }

            /**
             * Mcc.
             */
            public Builder mcc(String mcc) {
                this.mcc = mcc;
                return this;
            }

            /**
             * Mnc.
             */
            public Builder mnc(String mnc) {
                this.mnc = mnc;
                return this;
            }

            /**
             * Ported.
             */
            public Builder ported(Boolean ported) {
                this.ported = ported;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
