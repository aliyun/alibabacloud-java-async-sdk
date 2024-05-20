// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseCapacityByBatchRequest} extends {@link RequestModel}
 *
 * <p>ReleaseCapacityByBatchRequest</p>
 */
public class ReleaseCapacityByBatchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResBatchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resBatchId;

    private ReleaseCapacityByBatchRequest(Builder builder) {
        super(builder);
        this.resBatchId = builder.resBatchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseCapacityByBatchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resBatchId
     */
    public String getResBatchId() {
        return this.resBatchId;
    }

    public static final class Builder extends Request.Builder<ReleaseCapacityByBatchRequest, Builder> {
        private String resBatchId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseCapacityByBatchRequest request) {
            super(request);
            this.resBatchId = request.resBatchId;
        } 

        /**
         * ResBatchId.
         */
        public Builder resBatchId(String resBatchId) {
            this.putBodyParameter("ResBatchId", resBatchId);
            this.resBatchId = resBatchId;
            return this;
        }

        @Override
        public ReleaseCapacityByBatchRequest build() {
            return new ReleaseCapacityByBatchRequest(this);
        } 

    } 

}
