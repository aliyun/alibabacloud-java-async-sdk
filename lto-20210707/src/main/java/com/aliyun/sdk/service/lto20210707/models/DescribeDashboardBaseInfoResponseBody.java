// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link DescribeDashboardBaseInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDashboardBaseInfoResponseBody</p>
 */
public class DescribeDashboardBaseInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDashboardBaseInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDashboardBaseInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeDashboardBaseInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDashboardBaseInfoResponseBody build() {
            return new DescribeDashboardBaseInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDashboardBaseInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDashboardBaseInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiInvokeCount")
        private Long apiInvokeCount;

        @com.aliyun.core.annotation.NameInMap("BizChainCount")
        private Integer bizChainCount;

        @com.aliyun.core.annotation.NameInMap("DeviceCount")
        private Integer deviceCount;

        @com.aliyun.core.annotation.NameInMap("MemberCount")
        private Integer memberCount;

        private Data(Builder builder) {
            this.apiInvokeCount = builder.apiInvokeCount;
            this.bizChainCount = builder.bizChainCount;
            this.deviceCount = builder.deviceCount;
            this.memberCount = builder.memberCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiInvokeCount
         */
        public Long getApiInvokeCount() {
            return this.apiInvokeCount;
        }

        /**
         * @return bizChainCount
         */
        public Integer getBizChainCount() {
            return this.bizChainCount;
        }

        /**
         * @return deviceCount
         */
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        /**
         * @return memberCount
         */
        public Integer getMemberCount() {
            return this.memberCount;
        }

        public static final class Builder {
            private Long apiInvokeCount; 
            private Integer bizChainCount; 
            private Integer deviceCount; 
            private Integer memberCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiInvokeCount = model.apiInvokeCount;
                this.bizChainCount = model.bizChainCount;
                this.deviceCount = model.deviceCount;
                this.memberCount = model.memberCount;
            } 

            /**
             * ApiInvokeCount.
             */
            public Builder apiInvokeCount(Long apiInvokeCount) {
                this.apiInvokeCount = apiInvokeCount;
                return this;
            }

            /**
             * BizChainCount.
             */
            public Builder bizChainCount(Integer bizChainCount) {
                this.bizChainCount = bizChainCount;
                return this;
            }

            /**
             * DeviceCount.
             */
            public Builder deviceCount(Integer deviceCount) {
                this.deviceCount = deviceCount;
                return this;
            }

            /**
             * MemberCount.
             */
            public Builder memberCount(Integer memberCount) {
                this.memberCount = memberCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
