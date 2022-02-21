// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PartitionError} extends {@link TeaModel}
 *
 * <p>PartitionError</p>
 */
public class PartitionError extends TeaModel {
    @NameInMap("ErrorDetail")
    private ErrorDetail errorDetail;

    @NameInMap("PartitionValues")
    private java.util.List < String > partitionValues;

    private PartitionError(Builder builder) {
        this.errorDetail = builder.errorDetail;
        this.partitionValues = builder.partitionValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PartitionError create() {
        return builder().build();
    }

    /**
     * @return errorDetail
     */
    public ErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * @return partitionValues
     */
    public java.util.List < String > getPartitionValues() {
        return this.partitionValues;
    }

    public static final class Builder {
        private ErrorDetail errorDetail; 
        private java.util.List < String > partitionValues; 

        /**
         * ErrorDetail.
         */
        public Builder errorDetail(ErrorDetail errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }

        /**
         * PartitionValues.
         */
        public Builder partitionValues(java.util.List < String > partitionValues) {
            this.partitionValues = partitionValues;
            return this;
        }

        public PartitionError build() {
            return new PartitionError(this);
        } 

    } 

}
