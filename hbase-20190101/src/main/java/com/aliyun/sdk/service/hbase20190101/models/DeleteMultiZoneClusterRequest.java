// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
         * <p>The ID of the multi-zone cluster to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-t4nn71xa0yn56****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to immediately delete the instance. By default, the instance is moved to the recycle bin and permanently deleted after 7 days. Valid values:</p>
         * <ul>
         * <li>true: Immediately deletes the instance without moving it to the recycle bin. Use this option with caution.</li>
         * <li>false: Moves the instance to the recycle bin. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
