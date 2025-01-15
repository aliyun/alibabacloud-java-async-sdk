// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823.models;

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
 * {@link ResyncTableRequest} extends {@link RequestModel}
 *
 * <p>ResyncTableRequest</p>
 */
public class ResyncTableRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keep")
    private Boolean keep;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableIdKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableIdKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ResyncTableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.keep = builder.keep;
        this.tableIdKey = builder.tableIdKey;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResyncTableRequest create() {
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
     * @return keep
     */
    public Boolean getKeep() {
        return this.keep;
    }

    /**
     * @return tableIdKey
     */
    public String getTableIdKey() {
        return this.tableIdKey;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ResyncTableRequest, Builder> {
        private String regionId; 
        private Boolean keep; 
        private String tableIdKey; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ResyncTableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.keep = request.keep;
            this.tableIdKey = request.tableIdKey;
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
         * keep.
         */
        public Builder keep(Boolean keep) {
            this.putBodyParameter("keep", keep);
            this.keep = keep;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>table-AAAAAAAAFQBwSLJkUj4CYg</p>
         */
        public Builder tableIdKey(String tableIdKey) {
            this.putBodyParameter("tableIdKey", tableIdKey);
            this.tableIdKey = tableIdKey;
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
        public ResyncTableRequest build() {
            return new ResyncTableRequest(this);
        } 

    } 

}
