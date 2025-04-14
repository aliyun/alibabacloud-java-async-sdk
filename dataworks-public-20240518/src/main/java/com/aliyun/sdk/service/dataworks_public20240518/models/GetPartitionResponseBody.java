// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetPartitionResponseBody} extends {@link TeaModel}
 *
 * <p>GetPartitionResponseBody</p>
 */
public class GetPartitionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Partition")
    private Partition partition;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetPartitionResponseBody(Builder builder) {
        this.partition = builder.partition;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPartitionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return partition
     */
    public Partition getPartition() {
        return this.partition;
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
        private Partition partition; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetPartitionResponseBody model) {
            this.partition = model.partition;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Partition.
         */
        public Builder partition(Partition partition) {
            this.partition = partition;
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

        public GetPartitionResponseBody build() {
            return new GetPartitionResponseBody(this);
        } 

    } 

}
