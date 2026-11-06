// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link DeleteAppRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppRequest</p>
 */
public class DeleteAppRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersionId")
    private String appVersionId;

    private DeleteAppRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.appVersionId = builder.appVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appVersionId
     */
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public static final class Builder extends Request.Builder<DeleteAppRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String appVersionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.appVersionId = request.appVersionId;
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
         * <p>The ID of the application to be deleted. <strong>This parameter is required</strong>, and the application must belong to the current account. You must dissociate the image references from the target application or version before deletion.</p>
         * 
         * <strong>example:</strong>
         * <p>app-bp1example****</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the application version to be deleted. If specified, only the adapter corresponding to this application version is deleted. If omitted, the entire application and its adapters are deleted. If the application has no other adapters after the version is deleted, the application record is also deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>apv-bp1example****</p>
         */
        public Builder appVersionId(String appVersionId) {
            this.putBodyParameter("AppVersionId", appVersionId);
            this.appVersionId = appVersionId;
            return this;
        }

        @Override
        public DeleteAppRequest build() {
            return new DeleteAppRequest(this);
        } 

    } 

}
