// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUpdatePartitionsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchUpdatePartitionsResponseBody</p>
 */
public class BatchUpdatePartitionsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PartitionErrors")
    private java.util.List < PartitionError > partitionErrors;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private BatchUpdatePartitionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.partitionErrors = builder.partitionErrors;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUpdatePartitionsResponseBody create() {
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
     * @return partitionErrors
     */
    public java.util.List < PartitionError > getPartitionErrors() {
        return this.partitionErrors;
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

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List < PartitionError > partitionErrors; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * PartitionErrors.
         */
        public Builder partitionErrors(java.util.List < PartitionError > partitionErrors) {
            this.partitionErrors = partitionErrors;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BatchUpdatePartitionsResponseBody build() {
            return new BatchUpdatePartitionsResponseBody(this);
        } 

    } 

}
