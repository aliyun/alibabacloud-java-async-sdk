// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePrefixListsRequest} extends {@link RequestModel}
 *
 * <p>DescribePrefixListsRequest</p>
 */
public class DescribePrefixListsRequest extends Request {
    @Query
    @NameInMap("RegionNo")
    private String regionNo;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribePrefixListsRequest(Builder builder) {
        super(builder);
        this.regionNo = builder.regionNo;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrefixListsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribePrefixListsRequest, Builder> {
        private String regionNo; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribePrefixListsRequest request) {
            super(request);
            this.regionNo = request.regionNo;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The region ID of the instance.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribePrefixListsRequest build() {
            return new DescribePrefixListsRequest(this);
        } 

    } 

}
