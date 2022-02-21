// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAntChainConsortiumRequest} extends {@link RequestModel}
 *
 * <p>UpdateAntChainConsortiumRequest</p>
 */
public class UpdateAntChainConsortiumRequest extends Request {
    @Body
    @NameInMap("ConsortiumDescription")
    private String consortiumDescription;

    @Body
    @NameInMap("ConsortiumId")
    @Validation(required = true)
    private String consortiumId;

    @Body
    @NameInMap("ConsortiumName")
    @Validation(required = true)
    private String consortiumName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateAntChainConsortiumRequest(Builder builder) {
        super(builder);
        this.consortiumDescription = builder.consortiumDescription;
        this.consortiumId = builder.consortiumId;
        this.consortiumName = builder.consortiumName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAntChainConsortiumRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consortiumDescription
     */
    public String getConsortiumDescription() {
        return this.consortiumDescription;
    }

    /**
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return consortiumName
     */
    public String getConsortiumName() {
        return this.consortiumName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateAntChainConsortiumRequest, Builder> {
        private String consortiumDescription; 
        private String consortiumId; 
        private String consortiumName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAntChainConsortiumRequest response) {
            super(response);
            this.consortiumDescription = response.consortiumDescription;
            this.consortiumId = response.consortiumId;
            this.consortiumName = response.consortiumName;
            this.regionId = response.regionId;
        } 

        /**
         * ConsortiumDescription.
         */
        public Builder consortiumDescription(String consortiumDescription) {
            this.putBodyParameter("ConsortiumDescription", consortiumDescription);
            this.consortiumDescription = consortiumDescription;
            return this;
        }

        /**
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putBodyParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
            return this;
        }

        /**
         * ConsortiumName.
         */
        public Builder consortiumName(String consortiumName) {
            this.putBodyParameter("ConsortiumName", consortiumName);
            this.consortiumName = consortiumName;
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
        public UpdateAntChainConsortiumRequest build() {
            return new UpdateAntChainConsortiumRequest(this);
        } 

    } 

}
