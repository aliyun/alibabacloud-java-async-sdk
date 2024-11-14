// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetInstanceModeOnDemandRequest} extends {@link RequestModel}
 *
 * <p>SetInstanceModeOnDemandRequest</p>
 */
public class SetInstanceModeOnDemandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > instanceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private SetInstanceModeOnDemandRequest(Builder builder) {
        super(builder);
        this.instanceIdList = builder.instanceIdList;
        this.mode = builder.mode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetInstanceModeOnDemandRequest create() {
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
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetInstanceModeOnDemandRequest, Builder> {
        private java.util.List < String > instanceIdList; 
        private String mode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetInstanceModeOnDemandRequest request) {
            super(request);
            this.instanceIdList = request.instanceIdList;
            this.mode = request.mode;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The IDs of on-demand instances.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/152120.html">DescribeOnDemandInstance</a> operation to query the IDs of all on-demand instances.</p>
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
         * <p>Specifies the scheduling mode for on-demand instances. Valid values:</p>
         * <ul>
         * <li><strong>manual</strong>: manual scheduling</li>
         * <li><strong>netflow-auto</strong>: automatic scheduling</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>netflow-auto</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The region ID of the on-demand instance.</p>
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
        public SetInstanceModeOnDemandRequest build() {
            return new SetInstanceModeOnDemandRequest(this);
        } 

    } 

}
