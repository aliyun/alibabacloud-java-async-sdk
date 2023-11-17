// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBatchStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryBatchStatusRequest</p>
 */
public class QueryBatchStatusRequest extends Request {
    @Query
    @NameInMap("BatchId")
    @Validation(required = true)
    private String batchId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private QueryBatchStatusRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.productKey = builder.productKey;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBatchStatusRequest create() {
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

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<QueryBatchStatusRequest, Builder> {
        private String batchId; 
        private String productKey; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(QueryBatchStatusRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.productKey = request.productKey;
            this.projectId = request.projectId;
        } 

        /**
         * BatchId.
         */
        public Builder batchId(String batchId) {
            this.putQueryParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public QueryBatchStatusRequest build() {
            return new QueryBatchStatusRequest(this);
        } 

    } 

}
