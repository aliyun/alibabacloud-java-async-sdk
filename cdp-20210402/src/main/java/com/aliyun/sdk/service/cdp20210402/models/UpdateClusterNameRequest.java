// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateClusterNameRequest} extends {@link RequestModel}
 *
 * <p>UpdateClusterNameRequest</p>
 */
public class UpdateClusterNameRequest extends Request {
    @Query
    @NameInMap("ClusterBizId")
    @Validation(required = true)
    private String clusterBizId;

    @Query
    @NameInMap("ClusterName")
    @Validation(required = true)
    private String clusterName;

    private UpdateClusterNameRequest(Builder builder) {
        super(builder);
        this.clusterBizId = builder.clusterBizId;
        this.clusterName = builder.clusterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateClusterNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterBizId
     */
    public String getClusterBizId() {
        return this.clusterBizId;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    public static final class Builder extends Request.Builder<UpdateClusterNameRequest, Builder> {
        private String clusterBizId; 
        private String clusterName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateClusterNameRequest request) {
            super(request);
            this.clusterBizId = request.clusterBizId;
            this.clusterName = request.clusterName;
        } 

        /**
         * ClusterBizId.
         */
        public Builder clusterBizId(String clusterBizId) {
            this.putQueryParameter("ClusterBizId", clusterBizId);
            this.clusterBizId = clusterBizId;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        @Override
        public UpdateClusterNameRequest build() {
            return new UpdateClusterNameRequest(this);
        } 

    } 

}
