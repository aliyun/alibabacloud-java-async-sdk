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
 * {@link DeleteAdaptorRequest} extends {@link RequestModel}
 *
 * <p>DeleteAdaptorRequest</p>
 */
public class DeleteAdaptorRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdaptorId")
    private String adaptorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersionId")
    private String appVersionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private DeleteAdaptorRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.adaptorId = builder.adaptorId;
        this.appId = builder.appId;
        this.appVersionId = builder.appVersionId;
        this.imageId = builder.imageId;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAdaptorRequest create() {
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
     * @return adaptorId
     */
    public String getAdaptorId() {
        return this.adaptorId;
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

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<DeleteAdaptorRequest, Builder> {
        private String regionId; 
        private String adaptorId; 
        private String appId; 
        private String appVersionId; 
        private String imageId; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAdaptorRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.adaptorId = request.adaptorId;
            this.appId = request.appId;
            this.appVersionId = request.appVersionId;
            this.imageId = request.imageId;
            this.versionId = request.versionId;
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
         * <p>The ID of the application adapter to process. <strong>Required</strong>. It must correspond to the same application adapter as AppId and AppVersionId.</p>
         * 
         * <strong>example:</strong>
         * <p>adt-bp1example****</p>
         */
        public Builder adaptorId(String adaptorId) {
            this.putBodyParameter("AdaptorId", adaptorId);
            this.adaptorId = adaptorId;
            return this;
        }

        /**
         * <p>The ID of the application. <strong>Required</strong>. It must correspond to the same application as AdaptorId.</p>
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
         * <p>The ID of the application version. <strong>Required</strong>. It must correspond to the same application version as AdaptorId. This parameter is not the image version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>apv-bp1example****</p>
         */
        public Builder appVersionId(String appVersionId) {
            this.putBodyParameter("AppVersionId", appVersionId);
            this.appVersionId = appVersionId;
            return this;
        }

        /**
         * <p>The ID of the image to dissociate. <strong>Must be provided together with VersionId</strong>. If both parameters are not specified at the same time, the adapter deletion process is initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-bp1example****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The ID of the image version to dissociate. It must be provided together with ImageId and belong to the specified image.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-bp1example****</p>
         */
        public Builder versionId(String versionId) {
            this.putBodyParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public DeleteAdaptorRequest build() {
            return new DeleteAdaptorRequest(this);
        } 

    } 

}
