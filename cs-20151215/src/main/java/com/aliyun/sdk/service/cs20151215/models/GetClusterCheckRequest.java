// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterCheckRequest} extends {@link RequestModel}
 *
 * <p>GetClusterCheckRequest</p>
 */
public class GetClusterCheckRequest extends Request {
    @Path
    @NameInMap("cluster_id")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("check_id")
    @Validation(required = true)
    private String checkId;

    private GetClusterCheckRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.checkId = builder.checkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterCheckRequest create() {
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
     * @return checkId
     */
    public String getCheckId() {
        return this.checkId;
    }

    public static final class Builder extends Request.Builder<GetClusterCheckRequest, Builder> {
        private String clusterId; 
        private String checkId; 

        private Builder() {
            super();
        } 

        private Builder(GetClusterCheckRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.checkId = request.checkId;
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
         * The ID of the cluster check task.
         */
        public Builder checkId(String checkId) {
            this.putPathParameter("check_id", checkId);
            this.checkId = checkId;
            return this;
        }

        @Override
        public GetClusterCheckRequest build() {
            return new GetClusterCheckRequest(this);
        } 

    } 

}
