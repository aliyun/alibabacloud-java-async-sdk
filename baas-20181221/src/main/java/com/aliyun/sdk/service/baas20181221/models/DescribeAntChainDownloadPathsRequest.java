// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainDownloadPathsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainDownloadPathsRequest</p>
 */
public class DescribeAntChainDownloadPathsRequest extends Request {
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeAntChainDownloadPathsRequest(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainDownloadPathsRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainDownloadPathsRequest, Builder> {
        private String antChainId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainDownloadPathsRequest response) {
            super(response);
            this.antChainId = response.antChainId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeAntChainDownloadPathsRequest build() {
            return new DescribeAntChainDownloadPathsRequest(this);
        } 

    } 

}
