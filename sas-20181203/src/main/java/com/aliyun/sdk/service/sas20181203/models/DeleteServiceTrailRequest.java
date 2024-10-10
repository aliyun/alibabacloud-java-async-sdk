// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteServiceTrailRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceTrailRequest</p>
 */
public class DeleteServiceTrailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteServiceTrailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceTrailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteServiceTrailRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceTrailRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * <p>The region in which your Security Center service is deployed. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: center.</li>
         * <li><strong>ap-southeast-1</strong>: Singapore.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteServiceTrailRequest build() {
            return new DeleteServiceTrailRequest(this);
        } 

    } 

}
