// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicesDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>QueryDevicesDownloadUrlRequest</p>
 */
public class QueryDevicesDownloadUrlRequest extends Request {
    @Query
    @NameInMap("BatchId")
    @Validation(required = true)
    private String batchId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    private QueryDevicesDownloadUrlRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicesDownloadUrlRequest create() {
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

    public static final class Builder extends Request.Builder<QueryDevicesDownloadUrlRequest, Builder> {
        private String batchId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(QueryDevicesDownloadUrlRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.productKey = request.productKey;
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

        @Override
        public QueryDevicesDownloadUrlRequest build() {
            return new QueryDevicesDownloadUrlRequest(this);
        } 

    } 

}
