// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSnatTableEntriesRequest} extends {@link RequestModel}
 *
 * <p>DescribeSnatTableEntriesRequest</p>
 */
public class DescribeSnatTableEntriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnatEntryId")
    private String snatEntryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnatEntryName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String snatEntryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnatIp")
    private String snatIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCIDR")
    private String sourceCIDR;

    private DescribeSnatTableEntriesRequest(Builder builder) {
        super(builder);
        this.natGatewayId = builder.natGatewayId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.snatEntryId = builder.snatEntryId;
        this.snatEntryName = builder.snatEntryName;
        this.snatIp = builder.snatIp;
        this.sourceCIDR = builder.sourceCIDR;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnatTableEntriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
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
     * @return snatEntryId
     */
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    /**
     * @return snatEntryName
     */
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    /**
     * @return snatIp
     */
    public String getSnatIp() {
        return this.snatIp;
    }

    /**
     * @return sourceCIDR
     */
    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

    public static final class Builder extends Request.Builder<DescribeSnatTableEntriesRequest, Builder> {
        private String natGatewayId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String snatEntryId; 
        private String snatEntryName; 
        private String snatIp; 
        private String sourceCIDR; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSnatTableEntriesRequest request) {
            super(request);
            this.natGatewayId = request.natGatewayId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.snatEntryId = request.snatEntryId;
            this.snatEntryName = request.snatEntryName;
            this.snatIp = request.snatIp;
            this.sourceCIDR = request.sourceCIDR;
        } 

        /**
         * <p>The ID of the Network Address Translation (NAT) gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nat-5tawjw5j7sgd2deujxuk0****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The page number. Pages start from page <strong>1</strong>.</p>
         * <p>Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries per page. The maximum value is <strong>100</strong>.</p>
         * <p>Default value: <strong>10</strong>.</p>
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
         * <p>The ID of the SNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>snat-5tfjp36fsrb36zs36faj0****</p>
         */
        public Builder snatEntryId(String snatEntryId) {
            this.putQueryParameter("SnatEntryId", snatEntryId);
            this.snatEntryId = snatEntryId;
            return this;
        }

        /**
         * <p>The name of the SNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>test0</p>
         */
        public Builder snatEntryName(String snatEntryName) {
            this.putQueryParameter("SnatEntryName", snatEntryName);
            this.snatEntryName = snatEntryName;
            return this;
        }

        /**
         * <p>The elastic IP address (EIP) specified in the SNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>58.XXXX.XXX.29</p>
         */
        public Builder snatIp(String snatIp) {
            this.putQueryParameter("SnatIp", snatIp);
            this.snatIp = snatIp;
            return this;
        }

        /**
         * <p>The source CIDR block specified in the SNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.0.50/32</p>
         */
        public Builder sourceCIDR(String sourceCIDR) {
            this.putQueryParameter("SourceCIDR", sourceCIDR);
            this.sourceCIDR = sourceCIDR;
            return this;
        }

        @Override
        public DescribeSnatTableEntriesRequest build() {
            return new DescribeSnatTableEntriesRequest(this);
        } 

    } 

}
