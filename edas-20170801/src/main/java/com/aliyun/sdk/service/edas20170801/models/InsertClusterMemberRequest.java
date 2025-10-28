// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link InsertClusterMemberRequest} extends {@link RequestModel}
 *
 * <p>InsertClusterMemberRequest</p>
 */
public class InsertClusterMemberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    private InsertClusterMemberRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instanceIds = builder.instanceIds;
        this.password = builder.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertClusterMemberRequest create() {
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
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    public static final class Builder extends Request.Builder<InsertClusterMemberRequest, Builder> {
        private String clusterId; 
        private String instanceIds; 
        private String password; 

        private Builder() {
            super();
        } 

        private Builder(InsertClusterMemberRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instanceIds = request.instanceIds;
            this.password = request.password;
        } 

        /**
         * <p>The ID of the cluster into which you want to import ECS instances.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b3e3f77b-462e-<strong><strong>-</strong></strong>-bec8727a4dc8</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the ECS instance that you want to import into the cluster. Separate multiple IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2ze7s2v0b789k60p****</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("instanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The logon password of the ECS instance that you want to import into the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>YourPassword</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("password", password);
            this.password = password;
            return this;
        }

        @Override
        public InsertClusterMemberRequest build() {
            return new InsertClusterMemberRequest(this);
        } 

    } 

}
