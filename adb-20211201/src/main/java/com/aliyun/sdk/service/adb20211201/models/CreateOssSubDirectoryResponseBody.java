// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link CreateOssSubDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOssSubDirectoryResponseBody</p>
 */
public class CreateOssSubDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateOssSubDirectoryResponseBody model) {
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <ul>
         * <li>If the request was successful, a <strong>success</strong> message is returned.</li>
         * <li>If the request failed, an error message is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3A0DE2E0-A37B-5EE4-9136-C4C473714802</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateOssSubDirectoryResponseBody build() {
            return new CreateOssSubDirectoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateOssSubDirectoryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOssSubDirectoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientCRC")
        private Long clientCRC;

        @com.aliyun.core.annotation.NameInMap("ETag")
        private String eTag;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ServerCRC")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.clientCRC = model.clientCRC;
                this.eTag = model.eTag;
                this.requestId = model.requestId;
                this.serverCRC = model.serverCRC;
            } 

            /**
             * <p>The cyclic redundancy check (CRC) value on the client.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder clientCRC(Long clientCRC) {
                this.clientCRC = clientCRC;
                return this;
            }

            /**
             * <p>The tag of the OSS path.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder eTag(String eTag) {
                this.eTag = eTag;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3A0DE2E0-A37B-5EE4-9136-C4C473714802</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The CRC-64 value on the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
