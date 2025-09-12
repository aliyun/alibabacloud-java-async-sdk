// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link TravelStandardRelateDeleteResponseBody} extends {@link TeaModel}
 *
 * <p>TravelStandardRelateDeleteResponseBody</p>
 */
public class TravelStandardRelateDeleteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultCode")
    private Integer resultCode;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private TravelStandardRelateDeleteResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TravelStandardRelateDeleteResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resultCode
     */
    public Integer getResultCode() {
        return this.resultCode;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private Integer resultCode; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(TravelStandardRelateDeleteResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultCode.
         */
        public Builder resultCode(Integer resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>210bcc3a16583004579056128d33d7</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public TravelStandardRelateDeleteResponseBody build() {
            return new TravelStandardRelateDeleteResponseBody(this);
        } 

    } 

}
