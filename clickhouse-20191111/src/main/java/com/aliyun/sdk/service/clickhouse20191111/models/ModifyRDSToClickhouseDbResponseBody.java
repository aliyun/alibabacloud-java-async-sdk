// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
 * {@link ModifyRDSToClickhouseDbResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyRDSToClickhouseDbResponseBody</p>
 */
public class ModifyRDSToClickhouseDbResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Long errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Long status;

    private ModifyRDSToClickhouseDbResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRDSToClickhouseDbResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Long getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Long errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Long status; 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errorCode(Long errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <ul>
         * <li>If the value <strong>1</strong> is returned for the <strong>Status</strong> parameter, the system does not return the ErrorMsg parameter.</li>
         * <li>If the value <strong>0</strong> is returned for the <strong>Status</strong> parameter, the ErrorMsg parameter returns the cause for the modification failure.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ClickHouse exception, code: 49, host: 100.100.118.132, port: 49670; Code: 49, e.displayText() = DB::Exception: Logical error: there is no global context (version 20.8.17.25)n</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>746CD303-0B82-5E8D-886D-93A9FAF3A876</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the modification was successful. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The modification was successful.</li>
         * <li><strong>0</strong>: The modification failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        public ModifyRDSToClickhouseDbResponseBody build() {
            return new ModifyRDSToClickhouseDbResponseBody(this);
        } 

    } 

}
