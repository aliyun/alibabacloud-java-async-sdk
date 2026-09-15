// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link OpenBackupAutoConfigRequest} extends {@link RequestModel}
 *
 * <p>OpenBackupAutoConfigRequest</p>
 */
public class OpenBackupAutoConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxBatchSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer maxBatchSize;

    private OpenBackupAutoConfigRequest(Builder builder) {
        super(builder);
        this.maxBatchSize = builder.maxBatchSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenBackupAutoConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxBatchSize
     */
    public Integer getMaxBatchSize() {
        return this.maxBatchSize;
    }

    public static final class Builder extends Request.Builder<OpenBackupAutoConfigRequest, Builder> {
        private Integer maxBatchSize; 

        private Builder() {
            super();
        } 

        private Builder(OpenBackupAutoConfigRequest request) {
            super(request);
            this.maxBatchSize = request.maxBatchSize;
        } 

        /**
         * <p>The number of servers included in a single batch when the anti-ransomware managed service automatically generates policies.</p>
         * <blockquote>
         * <p>The maximum value is 50. If you specify a value greater than 50, the value is set to 50.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxBatchSize(Integer maxBatchSize) {
            this.putQueryParameter("MaxBatchSize", maxBatchSize);
            this.maxBatchSize = maxBatchSize;
            return this;
        }

        @Override
        public OpenBackupAutoConfigRequest build() {
            return new OpenBackupAutoConfigRequest(this);
        } 

    } 

}
