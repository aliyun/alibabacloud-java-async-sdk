// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertClusterMemberRequest} extends {@link RequestModel}
 *
 * <p>InsertClusterMemberRequest</p>
 */
public class InsertClusterMemberRequest extends Request {
    @Query
    @NameInMap("clusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("instanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("password")
    @Validation(required = true)
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
         * The ID of the cluster into which you want to import ECS instances.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the ECS instance that you want to import into the cluster. Separate multiple IDs with commas (,).
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("instanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The logon password of the ECS instance that you want to import into the cluster.
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
