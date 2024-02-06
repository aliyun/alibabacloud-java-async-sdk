// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnatTableEntriesRequest} extends {@link RequestModel}
 *
 * <p>DescribeSnatTableEntriesRequest</p>
 */
public class DescribeSnatTableEntriesRequest extends Request {
    @Query
    @NameInMap("NatGatewayId")
    @Validation(required = true)
    private String natGatewayId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SnatEntryId")
    private String snatEntryId;

    @Query
    @NameInMap("SnatEntryName")
    @Validation(maxLength = 128)
    private String snatEntryName;

    @Query
    @NameInMap("SnatIp")
    private String snatIp;

    @Query
    @NameInMap("SourceCIDR")
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
         * The ID of the Network Address Translation (NAT) gateway.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * The page number. Pages start from page **1**.
         * <p>
         * 
         * Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. The maximum value is **100**.
         * <p>
         * 
         * Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the SNAT entry.
         */
        public Builder snatEntryId(String snatEntryId) {
            this.putQueryParameter("SnatEntryId", snatEntryId);
            this.snatEntryId = snatEntryId;
            return this;
        }

        /**
         * The name of the SNAT entry.
         */
        public Builder snatEntryName(String snatEntryName) {
            this.putQueryParameter("SnatEntryName", snatEntryName);
            this.snatEntryName = snatEntryName;
            return this;
        }

        /**
         * The elastic IP address (EIP) specified in the SNAT entry.
         */
        public Builder snatIp(String snatIp) {
            this.putQueryParameter("SnatIp", snatIp);
            this.snatIp = snatIp;
            return this;
        }

        /**
         * The source CIDR block specified in the SNAT entry.
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
