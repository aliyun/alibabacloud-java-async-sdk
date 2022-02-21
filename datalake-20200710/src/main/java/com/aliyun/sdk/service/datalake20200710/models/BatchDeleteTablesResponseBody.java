// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteTablesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchDeleteTablesResponseBody</p>
 */
public class BatchDeleteTablesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TableErrors")
    private java.util.List < TableError > tableErrors;

    private BatchDeleteTablesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tableErrors = builder.tableErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteTablesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tableErrors
     */
    public java.util.List < TableError > getTableErrors() {
        return this.tableErrors;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < TableError > tableErrors; 

        /**
         * Code
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * PartitionErrors
         */
        public Builder tableErrors(java.util.List < TableError > tableErrors) {
            this.tableErrors = tableErrors;
            return this;
        }

        public BatchDeleteTablesResponseBody build() {
            return new BatchDeleteTablesResponseBody(this);
        } 

    } 

}
