// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceVodUrlResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceVodUrlResponseBody</p>
 */
public class QueryDeviceVodUrlResponseBody extends TeaModel {
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

    private QueryDeviceVodUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceVodUrlResponseBody create() {
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

        public QueryDeviceVodUrlResponseBody build() {
            return new QueryDeviceVodUrlResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DecryptKey")
        private String decryptKey;

        @NameInMap("StunInfo")
        private String stunInfo;

        @NameInMap("VodUrl")
        private String vodUrl;

        private Data(Builder builder) {
            this.decryptKey = builder.decryptKey;
            this.stunInfo = builder.stunInfo;
            this.vodUrl = builder.vodUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return decryptKey
         */
        public String getDecryptKey() {
            return this.decryptKey;
        }

        /**
         * @return stunInfo
         */
        public String getStunInfo() {
            return this.stunInfo;
        }

        /**
         * @return vodUrl
         */
        public String getVodUrl() {
            return this.vodUrl;
        }

        public static final class Builder {
            private String decryptKey; 
            private String stunInfo; 
            private String vodUrl; 

            /**
             * DecryptKey.
             */
            public Builder decryptKey(String decryptKey) {
                this.decryptKey = decryptKey;
                return this;
            }

            /**
             * StunInfo.
             */
            public Builder stunInfo(String stunInfo) {
                this.stunInfo = stunInfo;
                return this;
            }

            /**
             * VodUrl.
             */
            public Builder vodUrl(String vodUrl) {
                this.vodUrl = vodUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
