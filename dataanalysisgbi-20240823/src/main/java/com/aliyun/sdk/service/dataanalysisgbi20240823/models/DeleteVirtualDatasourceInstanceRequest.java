// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteVirtualDatasourceInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteVirtualDatasourceInstanceRequest</p>
 */
public class DeleteVirtualDatasourceInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vdbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vdbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private DeleteVirtualDatasourceInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.vdbId = builder.vdbId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVirtualDatasourceInstanceRequest create() {
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
     * @return vdbId
     */
    public String getVdbId() {
        return this.vdbId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DeleteVirtualDatasourceInstanceRequest, Builder> {
        private String regionId; 
        private String vdbId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVirtualDatasourceInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.vdbId = request.vdbId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vdb-7D63529B-5D42-5BF0-84E4-F742FFE02E7F</p>
         */
        public Builder vdbId(String vdbId) {
            this.putBodyParameter("vdbId", vdbId);
            this.vdbId = vdbId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-2v3934xtp49esw64</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DeleteVirtualDatasourceInstanceRequest build() {
            return new DeleteVirtualDatasourceInstanceRequest(this);
        } 

    } 

}
