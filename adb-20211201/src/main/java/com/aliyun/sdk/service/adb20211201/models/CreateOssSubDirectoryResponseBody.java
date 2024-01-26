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
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The response code. The status code 200 indicates that the request was successful.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * *   If the request was successful, a **success** message is returned.
         * *   If the request failed, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
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
             * The cyclic redundancy check (CRC) value on the client.
             */
            public Builder clientCRC(Long clientCRC) {
                this.clientCRC = clientCRC;
                return this;
            }

            /**
             * The tag of the OSS path.
             */
            public Builder eTag(String eTag) {
                this.eTag = eTag;
                return this;
            }

            /**
             * The request ID.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * The CRC-64 value on the OSS bucket.
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
