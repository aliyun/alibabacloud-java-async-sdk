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
 * {@link GetImageDistributeInfoRequest} extends {@link RequestModel}
 *
 * <p>GetImageDistributeInfoRequest</p>
 */
public class GetImageDistributeInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private GetImageDistributeInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.imageId = builder.imageId;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageDistributeInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetImageDistributeInfoRequest, Builder> {
        private String regionId; 
        private String imageId; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(GetImageDistributeInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
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
         * <p>The ID of the image whose region distribution information you want to query.</p>
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
         * <p>The ID of the image version. If this parameter is not specified, the online version of the image is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-xxx</p>
         */
        public Builder versionId(String versionId) {
            this.putBodyParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public GetImageDistributeInfoRequest build() {
            return new GetImageDistributeInfoRequest(this);
        } 

    } 

}
