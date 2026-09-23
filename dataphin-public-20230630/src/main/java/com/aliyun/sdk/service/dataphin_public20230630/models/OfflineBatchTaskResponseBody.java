// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link OfflineBatchTaskResponseBody} extends {@link TeaModel}
 *
 * <p>OfflineBatchTaskResponseBody</p>
 */
public class OfflineBatchTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OfflineResult")
    private OfflineResult offlineResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private OfflineBatchTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.offlineResult = builder.offlineResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OfflineBatchTaskResponseBody create() {
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
     * @return offlineResult
     */
    public OfflineResult getOfflineResult() {
        return this.offlineResult;
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
        private Integer httpStatusCode; 
        private String message; 
        private OfflineResult offlineResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(OfflineBatchTaskResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.offlineResult = model.offlineResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. A value of OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The offline result.</p>
         */
        public Builder offlineResult(OfflineResult offlineResult) {
            this.offlineResult = offlineResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public OfflineBatchTaskResponseBody build() {
            return new OfflineBatchTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OfflineBatchTaskResponseBody} extends {@link TeaModel}
     *
     * <p>OfflineBatchTaskResponseBody</p>
     */
    public static class OfflineResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PublishObjectId")
        private Long publishObjectId;

        private OfflineResult(Builder builder) {
            this.publishObjectId = builder.publishObjectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OfflineResult create() {
            return builder().build();
        }

        /**
         * @return publishObjectId
         */
        public Long getPublishObjectId() {
            return this.publishObjectId;
        }

        public static final class Builder {
            private Long publishObjectId; 

            private Builder() {
            } 

            private Builder(OfflineResult model) {
                this.publishObjectId = model.publishObjectId;
            } 

            /**
             * <p>The ID of the object to be published.</p>
             * 
             * <strong>example:</strong>
             * <p>10211123</p>
             */
            public Builder publishObjectId(Long publishObjectId) {
                this.publishObjectId = publishObjectId;
                return this;
            }

            public OfflineResult build() {
                return new OfflineResult(this);
            } 

        } 

    }
}
