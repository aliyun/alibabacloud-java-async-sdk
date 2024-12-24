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
 * {@link SaveVirtualDatasourceDdlRequest} extends {@link RequestModel}
 *
 * <p>SaveVirtualDatasourceDdlRequest</p>
 */
public class SaveVirtualDatasourceDdlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ddl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ddl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vdbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vdbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SaveVirtualDatasourceDdlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ddl = builder.ddl;
        this.vdbId = builder.vdbId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveVirtualDatasourceDdlRequest create() {
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
     * @return ddl
     */
    public String getDdl() {
        return this.ddl;
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

    public static final class Builder extends Request.Builder<SaveVirtualDatasourceDdlRequest, Builder> {
        private String regionId; 
        private String ddl; 
        private String vdbId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SaveVirtualDatasourceDdlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ddl = request.ddl;
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
         */
        public Builder ddl(String ddl) {
            this.putBodyParameter("ddl", ddl);
            this.ddl = ddl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vdb-E0F693C8-9F72-5830-B81A-696C9D8EBBD1</p>
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
        public SaveVirtualDatasourceDdlRequest build() {
            return new SaveVirtualDatasourceDdlRequest(this);
        } 

    } 

}
