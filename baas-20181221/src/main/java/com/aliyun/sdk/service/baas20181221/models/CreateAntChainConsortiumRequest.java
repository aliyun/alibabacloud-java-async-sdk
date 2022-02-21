// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntChainConsortiumRequest} extends {@link RequestModel}
 *
 * <p>CreateAntChainConsortiumRequest</p>
 */
public class CreateAntChainConsortiumRequest extends Request {
    @Body
    @NameInMap("ConsortiumDescription")
    private String consortiumDescription;

    @Body
    @NameInMap("ConsortiumName")
    @Validation(required = true)
    private String consortiumName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateAntChainConsortiumRequest(Builder builder) {
        super(builder);
        this.consortiumDescription = builder.consortiumDescription;
        this.consortiumName = builder.consortiumName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAntChainConsortiumRequest create() {
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

    public static final class Builder extends Request.Builder<CreateAntChainConsortiumRequest, Builder> {
        private String consortiumDescription; 
        private String consortiumName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAntChainConsortiumRequest response) {
            super(response);
            this.consortiumDescription = response.consortiumDescription;
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
        public CreateAntChainConsortiumRequest build() {
            return new CreateAntChainConsortiumRequest(this);
        } 

    } 

}
