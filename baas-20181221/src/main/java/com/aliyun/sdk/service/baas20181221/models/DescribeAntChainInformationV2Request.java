// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainInformationV2Request} extends {@link RequestModel}
 *
 * <p>DescribeAntChainInformationV2Request</p>
 */
public class DescribeAntChainInformationV2Request extends Request {
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("ConsortiumId")
    private String consortiumId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeAntChainInformationV2Request(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.consortiumId = builder.consortiumId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainInformationV2Request create() {
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
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainInformationV2Request, Builder> {
        private String antChainId; 
        private String consortiumId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainInformationV2Request response) {
            super(response);
            this.antChainId = response.antChainId;
            this.consortiumId = response.consortiumId;
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
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putBodyParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
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
        public DescribeAntChainInformationV2Request build() {
            return new DescribeAntChainInformationV2Request(this);
        } 

    } 

}
