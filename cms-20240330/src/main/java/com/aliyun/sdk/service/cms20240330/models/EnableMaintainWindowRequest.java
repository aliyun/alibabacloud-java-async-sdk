// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link EnableMaintainWindowRequest} extends {@link RequestModel}
 *
 * <p>EnableMaintainWindowRequest</p>
 */
public class EnableMaintainWindowRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("maintainWindowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String maintainWindowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private EnableMaintainWindowRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maintainWindowId = builder.maintainWindowId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableMaintainWindowRequest create() {
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
     * @return maintainWindowId
     */
    public String getMaintainWindowId() {
        return this.maintainWindowId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<EnableMaintainWindowRequest, Builder> {
        private String regionId; 
        private String maintainWindowId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(EnableMaintainWindowRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maintainWindowId = request.maintainWindowId;
            this.workspace = request.workspace;
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
         * <p>The ID of the silence policy. If you do not specify this parameter when creating a silence policy, the system generates the ID. You can query the ID by calling the ListMaintainWindows operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3ff3fbd0-8a0b-4b31-9b1c-8e3f0a2c5d71</p>
         */
        public Builder maintainWindowId(String maintainWindowId) {
            this.putPathParameter("maintainWindowId", maintainWindowId);
            this.maintainWindowId = maintainWindowId;
            return this;
        }

        /**
         * <p>The name of the workspace. This parameter is required by the backend and is used to isolate silence policy resources across different business workspaces.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-xxxx-cn-hangzhou</p>
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public EnableMaintainWindowRequest build() {
            return new EnableMaintainWindowRequest(this);
        } 

    } 

}
