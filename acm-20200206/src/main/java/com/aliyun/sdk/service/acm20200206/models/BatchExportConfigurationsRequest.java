// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchExportConfigurationsRequest} extends {@link RequestModel}
 *
 * <p>BatchExportConfigurationsRequest</p>
 */
public class BatchExportConfigurationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    private BatchExportConfigurationsRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchExportConfigurationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static final class Builder extends Request.Builder<BatchExportConfigurationsRequest, Builder> {
        private String data; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchExportConfigurationsRequest request) {
            super(request);
            this.data = request.data;
            this.namespaceId = request.namespaceId;
        } 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public BatchExportConfigurationsRequest build() {
            return new BatchExportConfigurationsRequest(this);
        } 

    } 

}
