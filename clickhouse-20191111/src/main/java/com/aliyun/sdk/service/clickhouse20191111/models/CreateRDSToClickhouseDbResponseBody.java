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
 * {@link CreateRDSToClickhouseDbResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRDSToClickhouseDbResponseBody</p>
 */
public class CreateRDSToClickhouseDbResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RepeatedDbs")
    private java.util.List<String> repeatedDbs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Long status;

    private CreateRDSToClickhouseDbResponseBody(Builder builder) {
        this.errorMsg = builder.errorMsg;
        this.repeatedDbs = builder.repeatedDbs;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRDSToClickhouseDbResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return repeatedDbs
     */
    public java.util.List<String> getRepeatedDbs() {
        return this.repeatedDbs;
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
        private String errorMsg; 
        private java.util.List<String> repeatedDbs; 
        private String requestId; 
        private Long status; 

        /**
         * <p>If the value of the <strong>Status</strong> parameter is -1, the cause of the creation failure is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>ClickHouse exception, code: 49, host: 100.100.79.102, port: 14540; Code: 49, e.displayText() = DB::Exception: Logical error: there is no global context (version 20.8.17.25)n</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>Duplicate tables in the synchronization task.</p>
         */
        public Builder repeatedDbs(java.util.List<String> repeatedDbs) {
            this.repeatedDbs = repeatedDbs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>66676F54-1994-5DCF-993F-74536649628A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the synchronization task was created. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Created.</li>
         * <li><strong>0</strong>: Creation failed. The tables in the synchronization task are duplicate. The duplicate tables are returned for the <strong>RepeatedDbs</strong> parameter.</li>
         * <li><strong>-1</strong>: Creation failed. The cause why the creation failed is returned for the <strong>ErrorMsg</strong> parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        public CreateRDSToClickhouseDbResponseBody build() {
            return new CreateRDSToClickhouseDbResponseBody(this);
        } 

    } 

}
