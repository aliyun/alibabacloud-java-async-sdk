// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterChecksRequest} extends {@link RequestModel}
 *
 * <p>ListClusterChecksRequest</p>
 */
public class ListClusterChecksRequest extends Request {
    @Path
    @NameInMap("cluster_id")
    private String clusterId;

    @Query
    @NameInMap("type")
    private String type;

    private ListClusterChecksRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterChecksRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListClusterChecksRequest, Builder> {
        private String clusterId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterChecksRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.type = request.type;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The check method.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListClusterChecksRequest build() {
            return new ListClusterChecksRequest(this);
        } 

    } 

}
