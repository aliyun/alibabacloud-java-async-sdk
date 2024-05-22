// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVSwitchesRequest} extends {@link RequestModel}
 *
 * <p>DescribeVSwitchesRequest</p>
 */
public class DescribeVSwitchesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderByParams")
    private String orderByParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchName")
    private String vSwitchName;

    private DescribeVSwitchesRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.networkId = builder.networkId;
        this.orderByParams = builder.orderByParams;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.vSwitchId = builder.vSwitchId;
        this.vSwitchName = builder.vSwitchName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVSwitchesRequest create() {
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
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return orderByParams
     */
    public String getOrderByParams() {
        return this.orderByParams;
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
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vSwitchName
     */
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public static final class Builder extends Request.Builder<DescribeVSwitchesRequest, Builder> {
        private String ensRegionId; 
        private String networkId; 
        private String orderByParams; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String vSwitchId; 
        private String vSwitchName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVSwitchesRequest request) {
            super(request);
            this.ensRegionId = request.ensRegionId;
            this.networkId = request.networkId;
            this.orderByParams = request.orderByParams;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.vSwitchId = request.vSwitchId;
            this.vSwitchName = request.vSwitchName;
        } 

        /**
         * The ID of the edge node.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * The ID of the VPC to which the vSwitches belong.
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        /**
         * The order in which you want to sort the returned data. Example: {"EnsRegionId":"desc"}.
         * <p>
         * 
         * By default, the nodes are sorted by IDs in descending order.
         */
        public Builder orderByParams(String orderByParams) {
            this.putQueryParameter("OrderByParams", orderByParams);
            this.orderByParams = orderByParams;
            return this;
        }

        /**
         * The page number of the returned page. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values: **1 to 50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The name of the vSwitch.
         */
        public Builder vSwitchName(String vSwitchName) {
            this.putQueryParameter("VSwitchName", vSwitchName);
            this.vSwitchName = vSwitchName;
            return this;
        }

        @Override
        public DescribeVSwitchesRequest build() {
            return new DescribeVSwitchesRequest(this);
        } 

    } 

}
