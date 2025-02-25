// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCrowdRequest} extends {@link RequestModel}
 *
 * <p>GetCrowdRequest</p>
 */
public class GetCrowdRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("CrowdId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String crowdId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("Regionid")
    private String regionid;

    private GetCrowdRequest(Builder builder) {
        super(builder);
        this.crowdId = builder.crowdId;
        this.regionid = builder.regionid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCrowdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crowdId
     */
    public String getCrowdId() {
        return this.crowdId;
    }

    /**
     * @return regionid
     */
    public String getRegionid() {
        return this.regionid;
    }

    public static final class Builder extends Request.Builder<GetCrowdRequest, Builder> {
        private String crowdId; 
        private String regionid; 

        private Builder() {
            super();
        } 

        private Builder(GetCrowdRequest request) {
            super(request);
            this.crowdId = request.crowdId;
            this.regionid = request.regionid;
        } 

        /**
         * CrowdId.
         */
        public Builder crowdId(String crowdId) {
            this.putPathParameter("CrowdId", crowdId);
            this.crowdId = crowdId;
            return this;
        }

        /**
         * Regionid.
         */
        public Builder regionid(String regionid) {
            this.putHostParameter("Regionid", regionid);
            this.regionid = regionid;
            return this;
        }

        @Override
        public GetCrowdRequest build() {
            return new GetCrowdRequest(this);
        } 

    } 

}
