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
 * {@link ResizeWuyingServerDiskRequest} extends {@link RequestModel}
 *
 * <p>ResizeWuyingServerDiskRequest</p>
 */
public class ResizeWuyingServerDiskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataDiskList")
    private java.util.List<DataDiskList> dataDiskList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemDiskNewSize")
    private Integer systemDiskNewSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerId")
    private String wuyingServerId;

    private ResizeWuyingServerDiskRequest(Builder builder) {
        super(builder);
        this.dataDiskList = builder.dataDiskList;
        this.productType = builder.productType;
        this.systemDiskNewSize = builder.systemDiskNewSize;
        this.wuyingServerId = builder.wuyingServerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeWuyingServerDiskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataDiskList
     */
    public java.util.List<DataDiskList> getDataDiskList() {
        return this.dataDiskList;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return systemDiskNewSize
     */
    public Integer getSystemDiskNewSize() {
        return this.systemDiskNewSize;
    }

    /**
     * @return wuyingServerId
     */
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

    public static final class Builder extends Request.Builder<ResizeWuyingServerDiskRequest, Builder> {
        private java.util.List<DataDiskList> dataDiskList; 
        private String productType; 
        private Integer systemDiskNewSize; 
        private String wuyingServerId; 

        private Builder() {
            super();
        } 

        private Builder(ResizeWuyingServerDiskRequest request) {
            super(request);
            this.dataDiskList = request.dataDiskList;
            this.productType = request.productType;
            this.systemDiskNewSize = request.systemDiskNewSize;
            this.wuyingServerId = request.wuyingServerId;
        } 

        /**
         * <p>The size and specifications of the data cloud disks.</p>
         */
        public Builder dataDiskList(java.util.List<DataDiskList> dataDiskList) {
            String dataDiskListShrink = shrink(dataDiskList, "DataDiskList", "json");
            this.putBodyParameter("DataDiskList", dataDiskListShrink);
            this.dataDiskList = dataDiskList;
            return this;
        }

        /**
         * <p>The product type.</p>
         * 
         * <strong>example:</strong>
         * <p>WuyingServer</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The new size of the system cloud disk, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>220</p>
         */
        public Builder systemDiskNewSize(Integer systemDiskNewSize) {
            this.putBodyParameter("SystemDiskNewSize", systemDiskNewSize);
            this.systemDiskNewSize = systemDiskNewSize;
            return this;
        }

        /**
         * <p>The ID of the WUYING Workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0bw2f11****dial</p>
         */
        public Builder wuyingServerId(String wuyingServerId) {
            this.putBodyParameter("WuyingServerId", wuyingServerId);
            this.wuyingServerId = wuyingServerId;
            return this;
        }

        @Override
        public ResizeWuyingServerDiskRequest build() {
            return new ResizeWuyingServerDiskRequest(this);
        } 

    } 

    /**
     * 
     * {@link ResizeWuyingServerDiskRequest} extends {@link TeaModel}
     *
     * <p>ResizeWuyingServerDiskRequest</p>
     */
    public static class DataDiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskNo")
        private String diskNo;

        @com.aliyun.core.annotation.NameInMap("DiskSubType")
        private String diskSubType;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("NewSize")
        private Integer newSize;

        private DataDiskList(Builder builder) {
            this.diskNo = builder.diskNo;
            this.diskSubType = builder.diskSubType;
            this.diskType = builder.diskType;
            this.newSize = builder.newSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDiskList create() {
            return builder().build();
        }

        /**
         * @return diskNo
         */
        public String getDiskNo() {
            return this.diskNo;
        }

        /**
         * @return diskSubType
         */
        public String getDiskSubType() {
            return this.diskSubType;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return newSize
         */
        public Integer getNewSize() {
            return this.newSize;
        }

        public static final class Builder {
            private String diskNo; 
            private String diskSubType; 
            private String diskType; 
            private Integer newSize; 

            private Builder() {
            } 

            private Builder(DataDiskList model) {
                this.diskNo = model.diskNo;
                this.diskSubType = model.diskSubType;
                this.diskType = model.diskType;
                this.newSize = model.newSize;
            } 

            /**
             * <p>The disk number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder diskNo(String diskNo) {
                this.diskNo = diskNo;
                return this;
            }

            /**
             * <p>The disk subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>USER_DATA</p>
             */
            public Builder diskSubType(String diskSubType) {
                this.diskSubType = diskSubType;
                return this;
            }

            /**
             * <p>The type of disk data included in the image. By default, the system cloud disk and data cloud disks of the instance are included.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The new size.</p>
             * 
             * <strong>example:</strong>
             * <p>220</p>
             */
            public Builder newSize(Integer newSize) {
                this.newSize = newSize;
                return this;
            }

            public DataDiskList build() {
                return new DataDiskList(this);
            } 

        } 

    }
}
