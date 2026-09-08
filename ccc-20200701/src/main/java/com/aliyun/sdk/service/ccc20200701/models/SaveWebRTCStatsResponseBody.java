// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link SaveWebRTCStatsResponseBody} extends {@link TeaModel}
 *
 * <p>SaveWebRTCStatsResponseBody</p>
 */
public class SaveWebRTCStatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RowCount")
    private Long rowCount;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TimeStamp")
    private Long timeStamp;

    private SaveWebRTCStatsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.rowCount = builder.rowCount;
        this.success = builder.success;
        this.timeStamp = builder.timeStamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveWebRTCStatsResponseBody create() {
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
     * @return rowCount
     */
    public Long getRowCount() {
        return this.rowCount;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return timeStamp
     */
    public Long getTimeStamp() {
        return this.timeStamp;
    }

    public static final class Builder {
        private String code; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Long rowCount; 
        private Boolean success; 
        private Long timeStamp; 

        private Builder() {
        } 

        private Builder(SaveWebRTCStatsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.rowCount = model.rowCount;
            this.success = model.success;
            this.timeStamp = model.timeStamp;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CF1C21B9-2D49-4B54-880F-FBE248C16903</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of rows.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder rowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }

        /**
         * <p>Indicates whether the operation succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The time when the record was generated, in Unix timestamp format, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1555492246000</p>
         */
        public Builder timeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        public SaveWebRTCStatsResponseBody build() {
            return new SaveWebRTCStatsResponseBody(this);
        } 

    } 

}
