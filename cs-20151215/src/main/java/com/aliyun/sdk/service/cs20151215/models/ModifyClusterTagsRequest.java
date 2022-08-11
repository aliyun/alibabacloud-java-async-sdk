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
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("body")
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
         * 汲取ID
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 集群标签列表。
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
