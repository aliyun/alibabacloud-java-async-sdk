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
 * {@link DescribeVSwitchesRequest} extends {@link RequestModel}
 *
 * <p>DescribeVSwitchesRequest</p>
 */
public class DescribeVSwitchesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionIds")
    private java.util.List<String> ensRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private java.util.List<String> vSwitchIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchName")
    private String vSwitchName;

    private DescribeVSwitchesRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.ensRegionIds = builder.ensRegionIds;
        this.networkId = builder.networkId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.vSwitchId = builder.vSwitchId;
        this.vSwitchIds = builder.vSwitchIds;
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
     * @return ensRegionIds
     */
    public java.util.List<String> getEnsRegionIds() {
        return this.ensRegionIds;
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
     * @return vSwitchIds
     */
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return vSwitchName
     */
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public static final class Builder extends Request.Builder<DescribeVSwitchesRequest, Builder> {
        private String ensRegionId; 
        private java.util.List<String> ensRegionIds; 
        private String networkId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String vSwitchId; 
        private java.util.List<String> vSwitchIds; 
        private String vSwitchName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVSwitchesRequest request) {
            super(request);
            this.ensRegionId = request.ensRegionId;
            this.ensRegionIds = request.ensRegionIds;
            this.networkId = request.networkId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.vSwitchId = request.vSwitchId;
            this.vSwitchIds = request.vSwitchIds;
            this.vSwitchName = request.vSwitchName;
        } 

        /**
         * <p>The ID of the ENS node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-xian-unicom</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The IDs of edge nodes. You can specify 1 to 100 IDs.</p>
         */
        public Builder ensRegionIds(java.util.List<String> ensRegionIds) {
            this.putQueryParameter("EnsRegionIds", ensRegionIds);
            this.ensRegionIds = ensRegionIds;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the vSwitch belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-25cdvfeq58pl****</p>
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
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
         * <p>The number of entries per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
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
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-5m9xhlq8oh***</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The IDs of vSwitches. You can specify 1 to 100 IDs.</p>
         */
        public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
            this.putQueryParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>The name of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>testVSwitchName</p>
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
