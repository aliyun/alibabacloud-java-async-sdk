// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ChangeCheckScopeConfigInstanceRequest} extends {@link RequestModel}
 *
 * <p>ChangeCheckScopeConfigInstanceRequest</p>
 */
public class ChangeCheckScopeConfigInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddAssetUuids")
    private java.util.List<String> addAssetUuids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteAssetUuids")
    private java.util.List<String> deleteAssetUuids;

    private ChangeCheckScopeConfigInstanceRequest(Builder builder) {
        super(builder);
        this.addAssetUuids = builder.addAssetUuids;
        this.configId = builder.configId;
        this.deleteAssetUuids = builder.deleteAssetUuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeCheckScopeConfigInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addAssetUuids
     */
    public java.util.List<String> getAddAssetUuids() {
        return this.addAssetUuids;
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return deleteAssetUuids
     */
    public java.util.List<String> getDeleteAssetUuids() {
        return this.deleteAssetUuids;
    }

    public static final class Builder extends Request.Builder<ChangeCheckScopeConfigInstanceRequest, Builder> {
        private java.util.List<String> addAssetUuids; 
        private String configId; 
        private java.util.List<String> deleteAssetUuids; 

        private Builder() {
            super();
        } 

        private Builder(ChangeCheckScopeConfigInstanceRequest request) {
            super(request);
            this.addAssetUuids = request.addAssetUuids;
            this.configId = request.configId;
            this.deleteAssetUuids = request.deleteAssetUuids;
        } 

        /**
         * AddAssetUuids.
         */
        public Builder addAssetUuids(java.util.List<String> addAssetUuids) {
            this.putQueryParameter("AddAssetUuids", addAssetUuids);
            this.addAssetUuids = addAssetUuids;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>00cfa8161da093089e6804ba6a33****</p>
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * DeleteAssetUuids.
         */
        public Builder deleteAssetUuids(java.util.List<String> deleteAssetUuids) {
            this.putQueryParameter("DeleteAssetUuids", deleteAssetUuids);
            this.deleteAssetUuids = deleteAssetUuids;
            return this;
        }

        @Override
        public ChangeCheckScopeConfigInstanceRequest build() {
            return new ChangeCheckScopeConfigInstanceRequest(this);
        } 

    } 

}
