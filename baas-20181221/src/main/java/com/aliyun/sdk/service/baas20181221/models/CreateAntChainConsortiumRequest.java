// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntChainConsortiumRequest} extends {@link RequestModel}
 *
 * <p>CreateAntChainConsortiumRequest</p>
 */
public class CreateAntChainConsortiumRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConsortiumDescription")
    private String consortiumDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConsortiumName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consortiumName;

    private CreateAntChainConsortiumRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.consortiumDescription = builder.consortiumDescription;
        this.consortiumName = builder.consortiumName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreateAntChainConsortiumRequest, Builder> {
        private String regionId; 
        private String consortiumDescription; 
        private String consortiumName; 

        private Builder() {
            super();
        } 

        private Builder(CreateAntChainConsortiumRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.consortiumDescription = request.consortiumDescription;
            this.consortiumName = request.consortiumName;
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

        @Override
        public CreateAntChainConsortiumRequest build() {
            return new CreateAntChainConsortiumRequest(this);
        } 

    } 

}
