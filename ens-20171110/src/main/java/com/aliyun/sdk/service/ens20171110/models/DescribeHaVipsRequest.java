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
 * {@link DescribeHaVipsRequest} extends {@link RequestModel}
 *
 * <p>DescribeHaVipsRequest</p>
 */
public class DescribeHaVipsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaVipAddress")
    private String haVipAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaVipId")
    private String haVipId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private DescribeHaVipsRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.haVipAddress = builder.haVipAddress;
        this.haVipId = builder.haVipId;
        this.name = builder.name;
        this.networkId = builder.networkId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHaVipsRequest create() {
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
     * @return haVipAddress
     */
    public String getHaVipAddress() {
        return this.haVipAddress;
    }

    /**
     * @return haVipId
     */
    public String getHaVipId() {
        return this.haVipId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<DescribeHaVipsRequest, Builder> {
        private String ensRegionId; 
        private String haVipAddress; 
        private String haVipId; 
        private String name; 
        private String networkId; 
        private String pageNumber; 
        private String pageSize; 
        private String status; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHaVipsRequest request) {
            super(request);
            this.ensRegionId = request.ensRegionId;
            this.haVipAddress = request.haVipAddress;
            this.haVipId = request.haVipId;
            this.name = request.name;
            this.networkId = request.networkId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-cmcc</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The IP address of the HAVIP.</p>
         * 
         * <strong>example:</strong>
         * <p>10.5.XX.XX</p>
         */
        public Builder haVipAddress(String haVipAddress) {
            this.putQueryParameter("HaVipAddress", haVipAddress);
            this.haVipAddress = haVipAddress;
            return this;
        }

        /**
         * <p>The ID of the HAVIP.</p>
         * 
         * <strong>example:</strong>
         * <p>havip-5p14t****</p>
         */
        public Builder haVipId(String haVipId) {
            this.putQueryParameter("HaVipId", haVipId);
            this.haVipId = haVipId;
            return this;
        }

        /**
         * <p>The name of the HAVIP.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>n-57gqcdfvx6n****</p>
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
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
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The status of the HAVIP. Valid values:</p>
         * <ul>
         * <li>Creating</li>
         * <li>Available</li>
         * <li>InUse</li>
         * <li>Deleting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-5****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public DescribeHaVipsRequest build() {
            return new DescribeHaVipsRequest(this);
        } 

    } 

}
