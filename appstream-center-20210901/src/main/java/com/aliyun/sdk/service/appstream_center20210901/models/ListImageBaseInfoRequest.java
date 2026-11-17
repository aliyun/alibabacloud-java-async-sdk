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
 * {@link ListImageBaseInfoRequest} extends {@link RequestModel}
 *
 * <p>ListImageBaseInfoRequest</p>
 */
public class ListImageBaseInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageType")
    private String imageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PackageType")
    private String packageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private String protocolType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListImageBaseInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizType = builder.bizType;
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.imageType = builder.imageType;
        this.osType = builder.osType;
        this.packageType = builder.packageType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
        this.protocolType = builder.protocolType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageBaseInfoRequest create() {
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
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return imageType
     */
    public String getImageType() {
        return this.imageType;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return packageType
     */
    public String getPackageType() {
        return this.packageType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListImageBaseInfoRequest, Builder> {
        private String regionId; 
        private Integer bizType; 
        private String imageId; 
        private String imageName; 
        private String imageType; 
        private String osType; 
        private String packageType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productType; 
        private String protocolType; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListImageBaseInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizType = request.bizType;
            this.imageId = request.imageId;
            this.imageName = request.imageName;
            this.imageType = request.imageType;
            this.osType = request.osType;
            this.packageType = request.packageType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
            this.protocolType = request.protocolType;
            this.status = request.status;
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
         * <p>The business line code. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizType(Integer bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The image ID. You can specify multiple IDs separated by commas (,). The query matches any of the specified IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>img-bp13mu****</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The keyword for querying images. Fuzzy matching is performed on both the image name and the image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder imageName(String imageName) {
            this.putBodyParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The image type. Valid values: System (system image), User (custom image), Shared (shared image), and Community (community image).</p>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        public Builder imageType(String imageType) {
            this.putBodyParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * <p>The image operating system type. Valid values: Windows (Windows operating system), Linux (Linux operating system), Android (Android operating system), and Unknown (unknown operating system).</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        public Builder osType(String osType) {
            this.putBodyParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * <p>The image package type. Valid values: Ecs (ECS image), Vhd (VHD image), Container (container image), Ecs_Container (ECS and container combined image), and K8s_Node (Kubernetes node image).</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        public Builder packageType(String packageType) {
            this.putBodyParameter("PackageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * <p>The page number of the page to return. Pages start from page 1. If you do not specify this parameter or specify a value less than 1, the first page is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100. If the value is less than 1, 10 is used. If the value is greater than 100, 100 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The product type, used to filter the products to which the images belong. Examples: CloudDesktop (WUYING Workspace), CloudApp (WUYING Cloud App), and WuyingServer (WUYING Workstation).</p>
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
         * <p>The image protocol type. Valid values: ASP (Alibaba Cloud proprietary ASP protocol) and HDX (HDX protocol).</p>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        public Builder protocolType(String protocolType) {
            this.putBodyParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>The image status. Valid values: INIT (initializing), CREATING (creating), AVAILABLE (available), and CREATE_FAILED (creation failed). If you do not specify this parameter, all non-deleted images are queried. Deleted images are not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListImageBaseInfoRequest build() {
            return new ListImageBaseInfoRequest(this);
        } 

    } 

}
