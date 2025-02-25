// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRegionConfigurationRequest} extends {@link RequestModel}
 *
 * <p>GetRegionConfigurationRequest</p>
 */
public class GetRegionConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("zoneId")
    private String zoneId;

    private GetRegionConfigurationRequest(Builder builder) {
        super(builder);
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegionConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<GetRegionConfigurationRequest, Builder> {
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(GetRegionConfigurationRequest request) {
            super(request);
            this.zoneId = request.zoneId;
        } 

        /**
         * zoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("zoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public GetRegionConfigurationRequest build() {
            return new GetRegionConfigurationRequest(this);
        } 

    } 

}
