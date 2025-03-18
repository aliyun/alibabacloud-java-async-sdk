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
 * {@link DescribeSecondaryPublicIpAddressesRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecondaryPublicIpAddressesRequest</p>
 */
public class DescribeSecondaryPublicIpAddressesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryPublicIpAddress")
    private String secondaryPublicIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryPublicIpId")
    private String secondaryPublicIpId;

    private DescribeSecondaryPublicIpAddressesRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.isp = builder.isp;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.secondaryPublicIpAddress = builder.secondaryPublicIpAddress;
        this.secondaryPublicIpId = builder.secondaryPublicIpId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecondaryPublicIpAddressesRequest create() {
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
     * @return isp
     */
    public String getIsp() {
        return this.isp;
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
     * @return secondaryPublicIpAddress
     */
    public String getSecondaryPublicIpAddress() {
        return this.secondaryPublicIpAddress;
    }

    /**
     * @return secondaryPublicIpId
     */
    public String getSecondaryPublicIpId() {
        return this.secondaryPublicIpId;
    }

    public static final class Builder extends Request.Builder<DescribeSecondaryPublicIpAddressesRequest, Builder> {
        private String ensRegionId; 
        private String isp; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String secondaryPublicIpAddress; 
        private String secondaryPublicIpId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecondaryPublicIpAddressesRequest request) {
            super(request);
            this.ensRegionId = request.ensRegionId;
            this.isp = request.isp;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.secondaryPublicIpAddress = request.secondaryPublicIpAddress;
            this.secondaryPublicIpId = request.secondaryPublicIpId;
        } 

        /**
         * <p>The ID of the edge node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-44</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The Internet service provider. Valid values:</p>
         * <ul>
         * <li>cmcc: China Mobile.</li>
         * <li>unicom: China Unicom.</li>
         * <li>telecom: China Telecom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>unicom</p>
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: 1.</p>
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
         * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The secondary IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>12.XXX.XXX.4</p>
         */
        public Builder secondaryPublicIpAddress(String secondaryPublicIpAddress) {
            this.putQueryParameter("SecondaryPublicIpAddress", secondaryPublicIpAddress);
            this.secondaryPublicIpAddress = secondaryPublicIpAddress;
            return this;
        }

        /**
         * <p>The ID of the secondary public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>spi-5wys0pio93c9f9ukzj2f2fwyr</p>
         */
        public Builder secondaryPublicIpId(String secondaryPublicIpId) {
            this.putQueryParameter("SecondaryPublicIpId", secondaryPublicIpId);
            this.secondaryPublicIpId = secondaryPublicIpId;
            return this;
        }

        @Override
        public DescribeSecondaryPublicIpAddressesRequest build() {
            return new DescribeSecondaryPublicIpAddressesRequest(this);
        } 

    } 

}
