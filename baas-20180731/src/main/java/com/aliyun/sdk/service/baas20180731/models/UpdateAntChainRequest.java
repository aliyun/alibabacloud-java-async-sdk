// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAntChainRequest} extends {@link RequestModel}
 *
 * <p>UpdateAntChainRequest</p>
 */
public class UpdateAntChainRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("AntChainName")
    @Validation(required = true)
    private String antChainName;

    private UpdateAntChainRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.antChainId = builder.antChainId;
        this.antChainName = builder.antChainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAntChainRequest create() {
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

    /**
     * @return antChainId
     */
    public String getAntChainId() {
        return this.antChainId;
    }

    /**
     * @return antChainName
     */
    public String getAntChainName() {
        return this.antChainName;
    }

    public static final class Builder extends Request.Builder<UpdateAntChainRequest, Builder> {
        private String regionId; 
        private String antChainId; 
        private String antChainName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAntChainRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.antChainId = request.antChainId;
            this.antChainName = request.antChainName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AntChainId.
         */
        public Builder antChainId(String antChainId) {
            this.putBodyParameter("AntChainId", antChainId);
            this.antChainId = antChainId;
            return this;
        }

        /**
         * AntChainName.
         */
        public Builder antChainName(String antChainName) {
            this.putBodyParameter("AntChainName", antChainName);
            this.antChainName = antChainName;
            return this;
        }

        @Override
        public UpdateAntChainRequest build() {
            return new UpdateAntChainRequest(this);
        } 

    } 

}
