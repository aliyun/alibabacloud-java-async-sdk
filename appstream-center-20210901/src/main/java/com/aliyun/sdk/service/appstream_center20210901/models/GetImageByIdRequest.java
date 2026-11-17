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
 * {@link GetImageByIdRequest} extends {@link RequestModel}
 *
 * <p>GetImageByIdRequest</p>
 */
public class GetImageByIdRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IgnoreFilter")
    private Boolean ignoreFilter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShowHidden")
    private String showHidden;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private GetImageByIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizRegionId = builder.bizRegionId;
        this.ignoreFilter = builder.ignoreFilter;
        this.imageId = builder.imageId;
        this.productType = builder.productType;
        this.showHidden = builder.showHidden;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageByIdRequest create() {
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
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return ignoreFilter
     */
    public Boolean getIgnoreFilter() {
        return this.ignoreFilter;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return showHidden
     */
    public String getShowHidden() {
        return this.showHidden;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<GetImageByIdRequest, Builder> {
        private String regionId; 
        private String bizRegionId; 
        private Boolean ignoreFilter; 
        private String imageId; 
        private String productType; 
        private String showHidden; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(GetImageByIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizRegionId = request.bizRegionId;
            this.ignoreFilter = request.ignoreFilter;
            this.imageId = request.imageId;
            this.productType = request.productType;
            this.showHidden = request.showHidden;
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
         * <p>The ID of the business region to query. If this parameter is not specified, regions are not filtered by this parameter. The returned regions are still subject to the visibility scope of the product and the account.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>Specifies whether to skip the operating system and adaptation status filtering for adapted applications. Default value: false. A value of false indicates that only applications whose operating system matches the image and whose adaptation is complete are retained. A value of true indicates that these two filters are skipped. Application type filtering is still controlled by the API and ShowHidden.</p>
         */
        public Builder ignoreFilter(Boolean ignoreFilter) {
            this.putBodyParameter("IgnoreFilter", ignoreFilter);
            this.ignoreFilter = ignoreFilter;
            return this;
        }

        /**
         * <p>The image ID. You must specify at least one of ImageId and VersionId. If only this parameter is specified, the online version is queried.</p>
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
         * <p>The product type, such as CloudDesktop (Cloud Desktop), CloudApp (Cloud App), or WuyingServer (WUYING Workspace Enterprise Edition workstation).</p>
         * 
         * <strong>example:</strong>
         * <p>CloudDesktop</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The types of virtual applications to include in addition to the default user applications and system applications. Valid values:</p>
         * <ul>
         * <li>VIRTUAL_DESKTOP_APP: desktop virtual applications.</li>
         * <li>ALL_VIRTUAL_APP: all virtual applications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VIRTUAL_DESKTOP_APP</p>
         */
        public Builder showHidden(String showHidden) {
            this.putBodyParameter("ShowHidden", showHidden);
            this.showHidden = showHidden;
            return this;
        }

        /**
         * <p>The image version ID. You can specify this parameter alone to query a specific version. If both ImageId and VersionId are specified, the version must belong to the specified image.</p>
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
        public GetImageByIdRequest build() {
            return new GetImageByIdRequest(this);
        } 

    } 

}
