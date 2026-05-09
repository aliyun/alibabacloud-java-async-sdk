// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeBatchTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeBatchTaskRequest</p>
 */
public class DescribeBatchTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchId")
    private String batchId;

    private DescribeBatchTaskRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBatchTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    public static final class Builder extends Request.Builder<DescribeBatchTaskRequest, Builder> {
        private String batchId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBatchTaskRequest request) {
            super(request);
            this.batchId = request.batchId;
        } 

        /**
         * BatchId.
         */
        public Builder batchId(String batchId) {
            this.putQueryParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
        }

        @Override
        public DescribeBatchTaskRequest build() {
            return new DescribeBatchTaskRequest(this);
        } 

    } 

}
