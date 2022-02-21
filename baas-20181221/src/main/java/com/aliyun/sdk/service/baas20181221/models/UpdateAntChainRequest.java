// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

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
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("AntChainName")
    @Validation(required = true)
    private String antChainName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateAntChainRequest(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.antChainName = builder.antChainName;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateAntChainRequest, Builder> {
        private String antChainId; 
        private String antChainName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAntChainRequest response) {
            super(response);
            this.antChainId = response.antChainId;
            this.antChainName = response.antChainName;
            this.regionId = response.regionId;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateAntChainRequest build() {
            return new UpdateAntChainRequest(this);
        } 

    } 

}
