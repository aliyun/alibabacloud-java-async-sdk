// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeOnDemandInstanceStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeOnDemandInstanceStatusRequest</p>
 */
public class DescribeOnDemandInstanceStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > instanceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeOnDemandInstanceStatusRequest(Builder builder) {
        super(builder);
        this.instanceIdList = builder.instanceIdList;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOnDemandInstanceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIdList
     */
    public java.util.List < String > getInstanceIdList() {
        return this.instanceIdList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeOnDemandInstanceStatusRequest, Builder> {
        private java.util.List < String > instanceIdList; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOnDemandInstanceStatusRequest request) {
            super(request);
            this.instanceIdList = request.instanceIdList;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The IDs of the anti-DDoS diversion instances.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/152120.html">DescribeOnDemandInstance</a> operation to query the IDs of all anti-DDoS diversion instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-z2q1qzxb****</p>
         */
        public Builder instanceIdList(java.util.List < String > instanceIdList) {
            this.putQueryParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        /**
         * <p>The region ID of the anti-DDoS diversion instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query all regions that are supported by Anti-DDoS Origin.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeOnDemandInstanceStatusRequest build() {
            return new DescribeOnDemandInstanceStatusRequest(this);
        } 

    } 

}
