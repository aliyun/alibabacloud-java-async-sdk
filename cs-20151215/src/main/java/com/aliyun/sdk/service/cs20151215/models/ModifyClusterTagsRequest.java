// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterTagsRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterTagsRequest</p>
 */
public class ModifyClusterTagsRequest extends Request {
    @Body
    @NameInMap("body")
    private java.util.List < Tag > body;

    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    private ModifyClusterTagsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.clusterId = builder.clusterId;
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
     * @return body
     */
    public java.util.List < Tag > getBody() {
        return this.body;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<ModifyClusterTagsRequest, Builder> {
        private java.util.List < Tag > body; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterTagsRequest request) {
            super(request);
            this.body = request.body;
            this.clusterId = request.clusterId;
        } 

        /**
         * Modify data.
         */
        public Builder body(java.util.List < Tag > body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public ModifyClusterTagsRequest build() {
            return new ModifyClusterTagsRequest(this);
        } 

    } 

}
