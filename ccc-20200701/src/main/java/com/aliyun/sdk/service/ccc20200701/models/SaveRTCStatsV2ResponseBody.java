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
 * {@link SaveRTCStatsV2ResponseBody} extends {@link TeaModel}
 *
 * <p>SaveRTCStatsV2ResponseBody</p>
 */
public class SaveRTCStatsV2ResponseBody extends TeaModel {
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

    private SaveRTCStatsV2ResponseBody(Builder builder) {
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

    public static SaveRTCStatsV2ResponseBody create() {
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

        private Builder(SaveRTCStatsV2ResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.rowCount = model.rowCount;
            this.success = model.success;
            this.timeStamp = model.timeStamp;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BA03159C-E808-4FF1-B27E-A61B6E888D7F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Number of rows.</p>
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
         * <p>Time when the record was generated, in Unix timestamp format, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1647309061000</p>
         */
        public Builder timeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        public SaveRTCStatsV2ResponseBody build() {
            return new SaveRTCStatsV2ResponseBody(this);
        } 

    } 

}
