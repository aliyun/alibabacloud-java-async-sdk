// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTriggerRequest} extends {@link RequestModel}
 *
 * <p>DeleteTriggerRequest</p>
 */
public class DeleteTriggerRequest extends Request {
    @Path
    @NameInMap("cluster_id")
    private String clusterId;

    @Path
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private DeleteTriggerRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTriggerRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteTriggerRequest, Builder> {
        private String clusterId; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTriggerRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.id = request.id;
        } 

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 触发器ID。
         */
        public Builder id(String id) {
            this.putPathParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteTriggerRequest build() {
            return new DeleteTriggerRequest(this);
        } 

    } 

}
