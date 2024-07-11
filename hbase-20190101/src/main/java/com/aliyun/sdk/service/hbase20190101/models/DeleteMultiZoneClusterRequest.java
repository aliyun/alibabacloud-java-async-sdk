// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMultiZoneClusterRequest} extends {@link RequestModel}
 *
 * <p>DeleteMultiZoneClusterRequest</p>
 */
public class DeleteMultiZoneClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImmediateDeleteFlag")
    private Boolean immediateDeleteFlag;

    private DeleteMultiZoneClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.immediateDeleteFlag = builder.immediateDeleteFlag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMultiZoneClusterRequest create() {
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
     * @return immediateDeleteFlag
     */
    public Boolean getImmediateDeleteFlag() {
        return this.immediateDeleteFlag;
    }

    public static final class Builder extends Request.Builder<DeleteMultiZoneClusterRequest, Builder> {
        private String clusterId; 
        private Boolean immediateDeleteFlag; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMultiZoneClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.immediateDeleteFlag = request.immediateDeleteFlag;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ImmediateDeleteFlag.
         */
        public Builder immediateDeleteFlag(Boolean immediateDeleteFlag) {
            this.putQueryParameter("ImmediateDeleteFlag", immediateDeleteFlag);
            this.immediateDeleteFlag = immediateDeleteFlag;
            return this;
        }

        @Override
        public DeleteMultiZoneClusterRequest build() {
            return new DeleteMultiZoneClusterRequest(this);
        } 

    } 

}
