// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicesDownloadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDevicesDownloadUrlResponseBody</p>
 */
public class QueryDevicesDownloadUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryDevicesDownloadUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicesDownloadUrlResponseBody create() {
        return builder().build();
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public QueryDevicesDownloadUrlResponseBody build() {
            return new QueryDevicesDownloadUrlResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("OssDownloadUrl")
        private String ossDownloadUrl;

        private Data(Builder builder) {
            this.ossDownloadUrl = builder.ossDownloadUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ossDownloadUrl
         */
        public String getOssDownloadUrl() {
            return this.ossDownloadUrl;
        }

        public static final class Builder {
            private String ossDownloadUrl; 

            /**
             * OssDownloadUrl.
             */
            public Builder ossDownloadUrl(String ossDownloadUrl) {
                this.ossDownloadUrl = ossDownloadUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
