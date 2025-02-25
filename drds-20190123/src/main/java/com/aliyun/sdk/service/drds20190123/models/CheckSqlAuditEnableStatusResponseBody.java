// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckSqlAuditEnableStatusResponseBody} extends {@link TeaModel}
 *
 * <p>CheckSqlAuditEnableStatusResponseBody</p>
 */
public class CheckSqlAuditEnableStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Success")
    private Boolean success;

    private CheckSqlAuditEnableStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSqlAuditEnableStatusResponseBody create() {
        return builder().build();
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
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private String status; 
        private Boolean success; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the SQL audit feature. Valid values:
         * <p>
         * 
         * *   enabled: The SQL audit feature is enabled.
         * *   disabled: The SQL audit feature is disabled.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CheckSqlAuditEnableStatusResponseBody build() {
            return new CheckSqlAuditEnableStatusResponseBody(this);
        } 

    } 

}
