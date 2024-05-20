// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRDSToClickhouseDbResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRDSToClickhouseDbResponseBody</p>
 */
public class CreateRDSToClickhouseDbResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RepeatedDbs")
    private java.util.List < String > repeatedDbs;

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
    public java.util.List < String > getRepeatedDbs() {
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
        private java.util.List < String > repeatedDbs; 
        private String requestId; 
        private Long status; 

        /**
         * If -1 is returned for the **Status** parameter, the cause of the creation failure is returned.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Duplicate tables in the synchronization task.
         */
        public Builder repeatedDbs(java.util.List < String > repeatedDbs) {
            this.repeatedDbs = repeatedDbs;
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
         * Indicates whether the synchronization task was created. Valid values:
         * <p>
         * 
         * *   **1**: Created.
         * *   **0**: Creation failed. The tables in the synchronization task are duplicate. The duplicate tables are returned for the **RepeatedDbs** parameter.
         * *   **-1**: Creation failed. The cause why the creation failed is returned for the **ErrorMsg** parameter.
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
