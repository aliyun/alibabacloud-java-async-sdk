// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListOperationPlansForRegionRequest} extends {@link RequestModel}
 *
 * <p>ListOperationPlansForRegionRequest</p>
 */
public class ListOperationPlansForRegionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("region_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListOperationPlansForRegionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.state = builder.state;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationPlansForRegionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListOperationPlansForRegionRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private String state; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationPlansForRegionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.state = request.state;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putPathParameter("region_id", regionId);
            this.regionId = regionId;
            return this;
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
         * state.
         */
        public Builder state(String state) {
            this.putQueryParameter("state", state);
            this.state = state;
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
        public ListOperationPlansForRegionRequest build() {
            return new ListOperationPlansForRegionRequest(this);
        } 

    } 

}
