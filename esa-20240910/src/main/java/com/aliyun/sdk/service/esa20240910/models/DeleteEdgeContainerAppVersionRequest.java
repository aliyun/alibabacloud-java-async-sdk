// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteEdgeContainerAppVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteEdgeContainerAppVersionRequest</p>
 */
public class DeleteEdgeContainerAppVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionId;

    private DeleteEdgeContainerAppVersionRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEdgeContainerAppVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<DeleteEdgeContainerAppVersionRequest, Builder> {
        private String appId; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEdgeContainerAppVersionRequest request) {
            super(request);
            this.appId = request.appId;
            this.versionId = request.versionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-96253477062511****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ver-89884764010378****</p>
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public DeleteEdgeContainerAppVersionRequest build() {
            return new DeleteEdgeContainerAppVersionRequest(this);
        } 

    } 

}
