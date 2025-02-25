// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPartitionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPartitionsResponseBody</p>
 */
public class ListPartitionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("PartitionSpecs")
    private java.util.List < PartitionSpec > partitionSpecs;

    @com.aliyun.core.annotation.NameInMap("Partitions")
    private java.util.List < Partition > partitions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListPartitionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.nextPageToken = builder.nextPageToken;
        this.partitionSpecs = builder.partitionSpecs;
        this.partitions = builder.partitions;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPartitionsResponseBody create() {
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
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
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
        private String nextPageToken; 
        private java.util.List < PartitionSpec > partitionSpecs; 
        private java.util.List < Partition > partitions; 
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
         * NextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
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
         * Partitions.
         */
        public Builder partitions(java.util.List < Partition > partitions) {
            this.partitions = partitions;
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

        public ListPartitionsResponseBody build() {
            return new ListPartitionsResponseBody(this);
        } 

    } 

}
