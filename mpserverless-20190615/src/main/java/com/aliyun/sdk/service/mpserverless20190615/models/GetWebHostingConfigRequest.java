// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWebHostingConfigRequest} extends {@link RequestModel}
 *
 * <p>GetWebHostingConfigRequest</p>
 */
public class GetWebHostingConfigRequest extends Request {
    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private GetWebHostingConfigRequest(Builder builder) {
        super(builder);
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWebHostingConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<GetWebHostingConfigRequest, Builder> {
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetWebHostingConfigRequest request) {
            super(request);
            this.spaceId = request.spaceId;
        } 

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public GetWebHostingConfigRequest build() {
            return new GetWebHostingConfigRequest(this);
        } 

    } 

}
