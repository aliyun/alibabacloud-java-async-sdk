// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcListLiteRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcListLiteRequest</p>
 */
public class DescribeVpcListLiteRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RegionNo")
    private String regionNo;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("VpcName")
    private String vpcName;

    private DescribeVpcListLiteRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regionNo = builder.regionNo;
        this.sourceIp = builder.sourceIp;
        this.vpcId = builder.vpcId;
        this.vpcName = builder.vpcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcListLiteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcName
     */
    public String getVpcName() {
        return this.vpcName;
    }

    public static final class Builder extends Request.Builder<DescribeVpcListLiteRequest, Builder> {
        private String lang; 
        private String regionNo; 
        private String sourceIp; 
        private String vpcId; 
        private String vpcName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcListLiteRequest request) {
            super(request);
            this.lang = request.lang;
            this.regionNo = request.regionNo;
            this.sourceIp = request.sourceIp;
            this.vpcId = request.vpcId;
            this.vpcName = request.vpcName;
        } 

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh** (default): Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The region ID of the VPC.
         * <p>
         * 
         * >  For more information about Cloud Firewall supported regions, see [Supported regions](~~195657~~).
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

        /**
         * The ID of the VPC.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The name of the VPC.
         */
        public Builder vpcName(String vpcName) {
            this.putQueryParameter("VpcName", vpcName);
            this.vpcName = vpcName;
            return this;
        }

        @Override
        public DescribeVpcListLiteRequest build() {
            return new DescribeVpcListLiteRequest(this);
        } 

    } 

}
