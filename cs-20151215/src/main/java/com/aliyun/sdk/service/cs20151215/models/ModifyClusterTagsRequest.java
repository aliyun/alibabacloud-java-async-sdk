// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyClusterTagsRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterTagsRequest</p>
 */
public class ModifyClusterTagsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List < Tag > body;

    private ModifyClusterTagsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return body
     */
    public java.util.List < Tag > getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ModifyClusterTagsRequest, Builder> {
        private String clusterId; 
        private java.util.List < Tag > body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterTagsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.body = request.body;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c106f377e16f34eb1808d6b9362c9****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The data of the labels that you want to modify.</p>
         */
        public Builder body(java.util.List < Tag > body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ModifyClusterTagsRequest build() {
            return new ModifyClusterTagsRequest(this);
        } 

    } 

}
