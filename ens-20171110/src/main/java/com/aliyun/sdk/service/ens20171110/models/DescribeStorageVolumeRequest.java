// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeStorageVolumeRequest} extends {@link RequestModel}
 *
 * <p>DescribeStorageVolumeRequest</p>
 */
public class DescribeStorageVolumeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsEnable")
    private Integer isEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageId")
    private String storageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeId")
    private String volumeId;

    private DescribeStorageVolumeRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.gatewayId = builder.gatewayId;
        this.isEnable = builder.isEnable;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.storageId = builder.storageId;
        this.volumeId = builder.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStorageVolumeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return isEnable
     */
    public Integer getIsEnable() {
        return this.isEnable;
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
     * @return storageId
     */
    public String getStorageId() {
        return this.storageId;
    }

    /**
     * @return volumeId
     */
    public String getVolumeId() {
        return this.volumeId;
    }

    public static final class Builder extends Request.Builder<DescribeStorageVolumeRequest, Builder> {
        private String ensRegionId; 
        private String gatewayId; 
        private Integer isEnable; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String storageId; 
        private String volumeId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStorageVolumeRequest request) {
            super(request);
            this.ensRegionId = request.ensRegionId;
            this.gatewayId = request.gatewayId;
            this.isEnable = request.isEnable;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.storageId = request.storageId;
            this.volumeId = request.volumeId;
        } 

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-3</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>sgw-****</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the volume. Valid values:</p>
         * <ul>
         * <li><strong>1</strong> (default): enables the volume.</li>
         * <li><strong>0</strong>: disables the volume.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isEnable(Integer isEnable) {
            this.putQueryParameter("IsEnable", isEnable);
            this.isEnable = isEnable;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the storage medium.</p>
         * 
         * <strong>example:</strong>
         * <p>d-***</p>
         */
        public Builder storageId(String storageId) {
            this.putQueryParameter("StorageId", storageId);
            this.storageId = storageId;
            return this;
        }

        /**
         * <p>The ID of the volume.</p>
         * 
         * <strong>example:</strong>
         * <p>sv-***</p>
         */
        public Builder volumeId(String volumeId) {
            this.putQueryParameter("VolumeId", volumeId);
            this.volumeId = volumeId;
            return this;
        }

        @Override
        public DescribeStorageVolumeRequest build() {
            return new DescribeStorageVolumeRequest(this);
        } 

    } 

}
