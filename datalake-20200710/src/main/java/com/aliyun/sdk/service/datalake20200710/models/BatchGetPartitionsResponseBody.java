// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetPartitionsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetPartitionsResponseBody</p>
 */
public class BatchGetPartitionsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PartitionErrors")
    private java.util.List < PartitionError > partitionErrors;

    @NameInMap("PartitionSpecs")
    private java.util.List < PartitionSpec > partitionSpecs;

    @NameInMap("Partitions")
    private java.util.List < Partition > partitions;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private BatchGetPartitionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.partitionErrors = builder.partitionErrors;
        this.partitionSpecs = builder.partitionSpecs;
        this.partitions = builder.partitions;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetPartitionsResponseBody create() {
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
     * @return partitionSpecs
     */
    public java.util.List < PartitionSpec > getPartitionSpecs() {
        return this.partitionSpecs;
    }

    /**
     * @return partitions
     */
    public java.util.List < Partition > getPartitions() {
        return this.partitions;
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
        private java.util.List < PartitionSpec > partitionSpecs; 
        private java.util.List < Partition > partitions; 
        private String requestId; 
        private Boolean success; 

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
         * PartitionErrors
         */
        public Builder partitionErrors(java.util.List < PartitionError > partitionErrors) {
            this.partitionErrors = partitionErrors;
            return this;
        }

        /**
         * PartitionSpecs
         */
        public Builder partitionSpecs(java.util.List < PartitionSpec > partitionSpecs) {
            this.partitionSpecs = partitionSpecs;
            return this;
        }

        /**
         * Partitions
         */
        public Builder partitions(java.util.List < Partition > partitions) {
            this.partitions = partitions;
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

        public BatchGetPartitionsResponseBody build() {
            return new BatchGetPartitionsResponseBody(this);
        } 

    } 

}
