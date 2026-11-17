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
 * {@link ListImageBaseInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListImageBaseInfoResponseBody</p>
 */
public class ListImageBaseInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListImageBaseInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageBaseInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer count; 
        private java.util.List<Data> data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListImageBaseInfoResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.data = model.data;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The result code of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The total number of images that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The list of basic image information on the current page.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The result message of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number returned as specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page as specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8737D130-BFD0-5D51-96F6-C08EB1139A25</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. A value of true indicates success, and a value of false indicates failure.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListImageBaseInfoResponseBody build() {
            return new ListImageBaseInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListImageBaseInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageBaseInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private Integer bizType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Distro")
        private String distro;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageType")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("LatestVersionId")
        private String latestVersionId;

        @com.aliyun.core.annotation.NameInMap("OnlineVersionId")
        private String onlineVersionId;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.aliUid = builder.aliUid;
            this.bizType = builder.bizType;
            this.description = builder.description;
            this.distro = builder.distro;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageType = builder.imageType;
            this.latestVersionId = builder.latestVersionId;
            this.onlineVersionId = builder.onlineVersionId;
            this.osType = builder.osType;
            this.packageType = builder.packageType;
            this.productType = builder.productType;
            this.protocolType = builder.protocolType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return bizType
         */
        public Integer getBizType() {
            return this.bizType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return distro
         */
        public String getDistro() {
            return this.distro;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
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
         * @return latestVersionId
         */
        public String getLatestVersionId() {
            return this.latestVersionId;
        }

        /**
         * @return onlineVersionId
         */
        public String getOnlineVersionId() {
            return this.onlineVersionId;
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

        public static final class Builder {
            private Long aliUid; 
            private Integer bizType; 
            private String description; 
            private String distro; 
            private String gmtCreate; 
            private String gmtModified; 
            private String imageId; 
            private String imageName; 
            private String imageType; 
            private String latestVersionId; 
            private String onlineVersionId; 
            private String osType; 
            private String packageType; 
            private String productType; 
            private String protocolType; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliUid = model.aliUid;
                this.bizType = model.bizType;
                this.description = model.description;
                this.distro = model.distro;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.imageType = model.imageType;
                this.latestVersionId = model.latestVersionId;
                this.onlineVersionId = model.onlineVersionId;
                this.osType = model.osType;
                this.packageType = model.packageType;
                this.productType = model.productType;
                this.protocolType = model.protocolType;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the image belongs. A value of 0 indicates a system image.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The business line code to which the image belongs. This corresponds to the BizType request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizType(Integer bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The description of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The distribution name of the image operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>Ubuntu 22.04 64-bit</p>
             */
            public Builder distro(String distro) {
                this.distro = distro;
                return this;
            }

            /**
             * <p>The time when the image was created. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-25 15:13:57</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the image was last updated. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-25 15:13:57</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The image ID. The IDs of custom images are generated by the system.</p>
             * 
             * <strong>example:</strong>
             * <p>img-bp13mu****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>DemoImage</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The image type. A value of System indicates a system image, User indicates a custom image, Shared indicates a shared image, and Community indicates a community image.</p>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * <p>The ID of the latest sub-version of this image.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-xxx</p>
             */
            public Builder latestVersionId(String latestVersionId) {
                this.latestVersionId = latestVersionId;
                return this;
            }

            /**
             * <p>The ID of the sub-version currently used to read the main image information for this image.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-xxxx</p>
             */
            public Builder onlineVersionId(String onlineVersionId) {
                this.onlineVersionId = onlineVersionId;
                return this;
            }

            /**
             * <p>The image operating system type. A value of Windows indicates the Windows operating system, Linux indicates the Linux operating system, Android indicates the Android operating system, and Unknown indicates an unknown operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The image package type. A value of Ecs indicates an ECS image, Vhd indicates a VHD image, Container indicates a container image, Ecs_Container indicates an ECS and container combined image, and K8s_Node indicates a Kubernetes node image.</p>
             * 
             * <strong>example:</strong>
             * <p>Ecs</p>
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * <p>The product type to which the image belongs. Examples: CloudDesktop (WUYING Workspace), CloudApp (WUYING Cloud App), and WuyingServer (WUYING Workstation).</p>
             * 
             * <strong>example:</strong>
             * <p>CloudApp</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The image protocol type. A value of ASP indicates the Alibaba Cloud proprietary ASP protocol, and HDX indicates the HDX protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>ASP</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The image status. A value of INIT indicates initializing, CREATING indicates creating, AVAILABLE indicates available, and CREATE_FAILED indicates creation failed.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
