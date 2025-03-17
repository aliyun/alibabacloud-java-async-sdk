// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link PartitionError} extends {@link TeaModel}
 *
 * <p>PartitionError</p>
 */
public class PartitionError extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorDetail")
    private String errorDetail;

    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List<String> values;

    private PartitionError(Builder builder) {
        this.errorDetail = builder.errorDetail;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PartitionError create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorDetail
     */
    public String getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * @return values
     */
    public java.util.List<String> getValues() {
        return this.values;
    }

    public static final class Builder {
        private String errorDetail; 
        private java.util.List<String> values; 

        private Builder() {
        } 

        private Builder(PartitionError model) {
            this.errorDetail = model.errorDetail;
            this.values = model.values;
        } 

        /**
         * ErrorDetail.
         */
        public Builder errorDetail(String errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }

        /**
         * Values.
         */
        public Builder values(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        public PartitionError build() {
            return new PartitionError(this);
        } 

    } 

}
