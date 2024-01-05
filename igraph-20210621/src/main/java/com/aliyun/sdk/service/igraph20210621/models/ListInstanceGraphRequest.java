// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.igraph20210621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceGraphRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceGraphRequest</p>
 */
public class ListInstanceGraphRequest extends Request {
    @Path
    @NameInMap("instanceId")
    private String instanceId;

    @Query
    @NameInMap("namespace")
    private String namespace;

    private ListInstanceGraphRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceGraphRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<ListInstanceGraphRequest, Builder> {
        private String instanceId; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceGraphRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.namespace = request.namespace;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public ListInstanceGraphRequest build() {
            return new ListInstanceGraphRequest(this);
        } 

    } 

}
