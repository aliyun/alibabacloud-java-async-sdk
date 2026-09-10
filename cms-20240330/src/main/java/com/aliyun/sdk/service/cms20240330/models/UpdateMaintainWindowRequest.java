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
 * {@link UpdateMaintainWindowRequest} extends {@link RequestModel}
 *
 * <p>UpdateMaintainWindowRequest</p>
 */
public class UpdateMaintainWindowRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("maintainWindowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String maintainWindowId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private MaintainWindowForModify body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private UpdateMaintainWindowRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maintainWindowId = builder.maintainWindowId;
        this.body = builder.body;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMaintainWindowRequest create() {
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
     * @return body
     */
    public MaintainWindowForModify getBody() {
        return this.body;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<UpdateMaintainWindowRequest, Builder> {
        private String regionId; 
        private String maintainWindowId; 
        private MaintainWindowForModify body; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMaintainWindowRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maintainWindowId = request.maintainWindowId;
            this.body = request.body;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123-12-312-31-23123</p>
         */
        public Builder maintainWindowId(String maintainWindowId) {
            this.putPathParameter("maintainWindowId", maintainWindowId);
            this.maintainWindowId = maintainWindowId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(MaintainWindowForModify body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public UpdateMaintainWindowRequest build() {
            return new UpdateMaintainWindowRequest(this);
        } 

    } 

}
