// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteDcdnKvWithHighCapacityRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteDcdnKvWithHighCapacityRequest</p>
 */
public class BatchDeleteDcdnKvWithHighCapacityRequest extends Request {
    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("Url")
    @Validation(required = true)
    private String url;

    private BatchDeleteDcdnKvWithHighCapacityRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteDcdnKvWithHighCapacityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<BatchDeleteDcdnKvWithHighCapacityRequest, Builder> {
        private String namespace; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteDcdnKvWithHighCapacityRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.url = request.url;
        } 

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public BatchDeleteDcdnKvWithHighCapacityRequest build() {
            return new BatchDeleteDcdnKvWithHighCapacityRequest(this);
        } 

    } 

}
