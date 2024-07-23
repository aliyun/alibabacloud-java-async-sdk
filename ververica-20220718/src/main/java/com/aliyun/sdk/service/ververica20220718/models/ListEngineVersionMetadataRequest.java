// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEngineVersionMetadataRequest} extends {@link RequestModel}
 *
 * <p>ListEngineVersionMetadataRequest</p>
 */
public class ListEngineVersionMetadataRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private ListEngineVersionMetadataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEngineVersionMetadataRequest create() {
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
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ListEngineVersionMetadataRequest, Builder> {
        private String regionId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListEngineVersionMetadataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspace = request.workspace;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The workspace ID.
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public ListEngineVersionMetadataRequest build() {
            return new ListEngineVersionMetadataRequest(this);
        } 

    } 

}
