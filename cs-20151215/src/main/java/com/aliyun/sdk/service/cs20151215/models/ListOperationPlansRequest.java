// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOperationPlansRequest} extends {@link RequestModel}
 *
 * <p>ListOperationPlansRequest</p>
 */
public class ListOperationPlansRequest extends Request {
    @Query
    @NameInMap("cluster_id")
    private String clusterId;

    @Query
    @NameInMap("type")
    private String type;

    private ListOperationPlansRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationPlansRequest create() {
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

    public static final class Builder extends Request.Builder<ListOperationPlansRequest, Builder> {
        private String clusterId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationPlansRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.type = request.type;
        } 

        /**
         * cluster_id.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListOperationPlansRequest build() {
            return new ListOperationPlansRequest(this);
        } 

    } 

}
