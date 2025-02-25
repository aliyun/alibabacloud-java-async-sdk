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
 * {@link DeleteSyndbResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSyndbResponseBody</p>
 */
public class DeleteSyndbResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Long errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Boolean status;

    private DeleteSyndbResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSyndbResponseBody create() {
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
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Long errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean status; 

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
         * <li>If the value <strong>true</strong> is returned for the <strong>Status</strong> parameter, the system does not return the ErrorMsg parameter.</li>
         * <li>If the value <strong>false</strong> is returned for the <strong>Status</strong> parameter, the system returns the deletion failure cause for the ErrorMsg parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ClickHouse exception, code: 49, host: 100.100.xx.xx, port: 49670; Code: 49, e.displayText() = DB::Exception: Logical error: there is no global context (version 20.8.17.25)n</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2C7393F1-5FD1-5CEE-A2EA-270A2CF99693</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the database used for data synchronization was deleted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        public DeleteSyndbResponseBody build() {
            return new DeleteSyndbResponseBody(this);
        } 

    } 

}
