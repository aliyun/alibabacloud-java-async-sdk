// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OpenXtraceServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenXtraceServiceRequest</p>
 */
public class OpenXtraceServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private OpenXtraceServiceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenXtraceServiceRequest create() {
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

    public static final class Builder extends Request.Builder<OpenXtraceServiceRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(OpenXtraceServiceRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public OpenXtraceServiceRequest build() {
            return new OpenXtraceServiceRequest(this);
        } 

    } 

}
