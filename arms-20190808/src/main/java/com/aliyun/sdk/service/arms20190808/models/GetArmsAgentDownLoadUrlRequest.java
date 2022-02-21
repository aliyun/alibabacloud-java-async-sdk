// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetArmsAgentDownLoadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetArmsAgentDownLoadUrlRequest</p>
 */
public class GetArmsAgentDownLoadUrlRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetArmsAgentDownLoadUrlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArmsAgentDownLoadUrlRequest create() {
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

    public static final class Builder extends Request.Builder<GetArmsAgentDownLoadUrlRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetArmsAgentDownLoadUrlRequest response) {
            super(response);
            this.regionId = response.regionId;
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
        public GetArmsAgentDownLoadUrlRequest build() {
            return new GetArmsAgentDownLoadUrlRequest(this);
        } 

    } 

}
