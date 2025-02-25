// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteSchedruleOnDemandRequest} extends {@link RequestModel}
 *
 * <p>DeleteSchedruleOnDemandRequest</p>
 */
public class DeleteSchedruleOnDemandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    private DeleteSchedruleOnDemandRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSchedruleOnDemandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<DeleteSchedruleOnDemandRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSchedruleOnDemandRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.ruleName = request.ruleName;
        } 

        /**
         * <p>The ID of the anti-DDoS diversion instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/152120.html">DescribeOnDemandInstance</a> operation to query the IDs of all anti-DDoS diversion instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-z2q1qzxb****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the anti-DDoS diversion instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

        /**
         * <p>The name of the scheduling rule that you want to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testrule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public DeleteSchedruleOnDemandRequest build() {
            return new DeleteSchedruleOnDemandRequest(this);
        } 

    } 

}
