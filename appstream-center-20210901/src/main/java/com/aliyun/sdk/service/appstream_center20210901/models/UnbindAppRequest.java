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
 * {@link UnbindAppRequest} extends {@link RequestModel}
 *
 * <p>UnbindAppRequest</p>
 */
public class UnbindAppRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> appIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private UnbindAppRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appIdList = builder.appIdList;
        this.imageId = builder.imageId;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindAppRequest create() {
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
     * @return appIdList
     */
    public java.util.List<String> getAppIdList() {
        return this.appIdList;
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

    public static final class Builder extends Request.Builder<UnbindAppRequest, Builder> {
        private String regionId; 
        private java.util.List<String> appIdList; 
        private String imageId; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindAppRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appIdList = request.appIdList;
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
         * <p>The list of application IDs to dissociate from the specified image version. Verify that each application is associated with the selected image version.</p>
         * <p>This parameter is required.</p>
         */
        public Builder appIdList(java.util.List<String> appIdList) {
            this.putBodyParameter("AppIdList", appIdList);
            this.appIdList = appIdList;
            return this;
        }

        /**
         * <p>The ID of the image from which to dissociate the applications. The image must be a custom image or a community image that the current account can manage.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the image version from which to dissociate the applications. If you omit this parameter, the current effective version of the image is used. If you specify this parameter, it must belong to the image specified by ImageId.</p>
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
        public UnbindAppRequest build() {
            return new UnbindAppRequest(this);
        } 

    } 

}
