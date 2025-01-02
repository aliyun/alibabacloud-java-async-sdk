// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetMmsPartitionRequest} extends {@link RequestModel}
 *
 * <p>GetMmsPartitionRequest</p>
 */
public class GetMmsPartitionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("partitionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long partitionId;

    private GetMmsPartitionRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.partitionId = builder.partitionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMmsPartitionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceId
     */
    public Long getSourceId() {
        return this.sourceId;
    }

    /**
     * @return partitionId
     */
    public Long getPartitionId() {
        return this.partitionId;
    }

    public static final class Builder extends Request.Builder<GetMmsPartitionRequest, Builder> {
        private Long sourceId; 
        private Long partitionId; 

        private Builder() {
            super();
        } 

        private Builder(GetMmsPartitionRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.partitionId = request.partitionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200018</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2323</p>
         */
        public Builder partitionId(Long partitionId) {
            this.putPathParameter("partitionId", partitionId);
            this.partitionId = partitionId;
            return this;
        }

        @Override
        public GetMmsPartitionRequest build() {
            return new GetMmsPartitionRequest(this);
        } 

    } 

}
