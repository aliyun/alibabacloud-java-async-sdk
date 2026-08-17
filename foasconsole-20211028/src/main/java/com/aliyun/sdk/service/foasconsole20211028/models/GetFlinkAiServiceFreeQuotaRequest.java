// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link GetFlinkAiServiceFreeQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetFlinkAiServiceFreeQuotaRequest</p>
 */
public class GetFlinkAiServiceFreeQuotaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    private GetFlinkAiServiceFreeQuotaRequest(Builder builder) {
        super(builder);
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlinkAiServiceFreeQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<GetFlinkAiServiceFreeQuotaRequest, Builder> {
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(GetFlinkAiServiceFreeQuotaRequest request) {
            super(request);
            this.region = request.region;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public GetFlinkAiServiceFreeQuotaRequest build() {
            return new GetFlinkAiServiceFreeQuotaRequest(this);
        } 

    } 

}
