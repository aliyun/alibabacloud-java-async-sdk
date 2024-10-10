// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateKvNamespaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateKvNamespaceRequest</p>
 */
public class UpdateKvNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private UpdateKvNamespaceRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKvNamespaceRequest create() {
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
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateKvNamespaceRequest, Builder> {
        private String namespace; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKvNamespaceRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.title = request.title;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ns1</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>new_ns</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateKvNamespaceRequest build() {
            return new UpdateKvNamespaceRequest(this);
        } 

    } 

}
