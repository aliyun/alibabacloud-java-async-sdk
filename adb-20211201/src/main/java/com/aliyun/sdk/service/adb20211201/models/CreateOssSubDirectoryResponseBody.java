// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOssSubDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOssSubDirectoryResponseBody</p>
 */
public class CreateOssSubDirectoryResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateOssSubDirectoryResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOssSubDirectoryResponseBody create() {
        return builder().build();
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
    public Long getHttpStatusCode() {
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
        private Data data; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
        public Builder httpStatusCode(Long httpStatusCode) {
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

        public CreateOssSubDirectoryResponseBody build() {
            return new CreateOssSubDirectoryResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ClientCRC")
        private Long clientCRC;

        @NameInMap("ETag")
        private String eTag;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("ServerCRC")
        private Long serverCRC;

        private Data(Builder builder) {
            this.clientCRC = builder.clientCRC;
            this.eTag = builder.eTag;
            this.requestId = builder.requestId;
            this.serverCRC = builder.serverCRC;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clientCRC
         */
        public Long getClientCRC() {
            return this.clientCRC;
        }

        /**
         * @return eTag
         */
        public String getETag() {
            return this.eTag;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return serverCRC
         */
        public Long getServerCRC() {
            return this.serverCRC;
        }

        public static final class Builder {
            private Long clientCRC; 
            private String eTag; 
            private String requestId; 
            private Long serverCRC; 

            /**
             * ClientCRC.
             */
            public Builder clientCRC(Long clientCRC) {
                this.clientCRC = clientCRC;
                return this;
            }

            /**
             * ETag.
             */
            public Builder eTag(String eTag) {
                this.eTag = eTag;
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
             * ServerCRC.
             */
            public Builder serverCRC(Long serverCRC) {
                this.serverCRC = serverCRC;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
