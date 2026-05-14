// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link EnableWarehouseAutoScaleRequest} extends {@link RequestModel}
 *
 * <p>EnableWarehouseAutoScaleRequest</p>
 */
public class EnableWarehouseAutoScaleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxClusterCount")
    private String maxClusterCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private EnableWarehouseAutoScaleRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.maxClusterCount = builder.maxClusterCount;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableWarehouseAutoScaleRequest create() {
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
     * @return maxClusterCount
     */
    public String getMaxClusterCount() {
        return this.maxClusterCount;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<EnableWarehouseAutoScaleRequest, Builder> {
        private String instanceId; 
        private String maxClusterCount; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(EnableWarehouseAutoScaleRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.maxClusterCount = request.maxClusterCount;
            this.name = request.name;
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
         * maxClusterCount.
         */
        public Builder maxClusterCount(String maxClusterCount) {
            this.putBodyParameter("maxClusterCount", maxClusterCount);
            this.maxClusterCount = maxClusterCount;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public EnableWarehouseAutoScaleRequest build() {
            return new EnableWarehouseAutoScaleRequest(this);
        } 

    } 

}
