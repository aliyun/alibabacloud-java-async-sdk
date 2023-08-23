// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveWebRtcInfoResponseBody} extends {@link TeaModel}
 *
 * <p>SaveWebRtcInfoResponseBody</p>
 */
public class SaveWebRtcInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RowCount")
    private Long rowCount;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TimeStamp")
    private Long timeStamp;

    private SaveWebRtcInfoResponseBody(Builder builder) {
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

    public static SaveWebRtcInfoResponseBody create() {
        return builder().build();
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

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * RowCount.
         */
        public Builder rowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TimeStamp.
         */
        public Builder timeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        public SaveWebRtcInfoResponseBody build() {
            return new SaveWebRtcInfoResponseBody(this);
        } 

    } 

}
