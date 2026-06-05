// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DelHiveEdgeWorkersRequest} extends {@link RequestModel}
 *
 * <p>DelHiveEdgeWorkersRequest</p>
 */
public class DelHiveEdgeWorkersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HiveId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hiveId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceIds;

    private DelHiveEdgeWorkersRequest(Builder builder) {
        super(builder);
        this.hiveId = builder.hiveId;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DelHiveEdgeWorkersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hiveId
     */
    public String getHiveId() {
        return this.hiveId;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<DelHiveEdgeWorkersRequest, Builder> {
        private String hiveId; 
        private java.util.List<String> instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(DelHiveEdgeWorkersRequest request) {
            super(request);
            this.hiveId = request.hiveId;
            this.instanceIds = request.instanceIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hive-xxxx-xxx-xxx</p>
         */
        public Builder hiveId(String hiveId) {
            this.putQueryParameter("HiveId", hiveId);
            this.hiveId = hiveId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ew-xxxx&quot;]</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public DelHiveEdgeWorkersRequest build() {
            return new DelHiveEdgeWorkersRequest(this);
        } 

    } 

}
