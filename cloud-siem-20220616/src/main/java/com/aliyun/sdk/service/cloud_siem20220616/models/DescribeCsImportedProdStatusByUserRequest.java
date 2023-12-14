// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCsImportedProdStatusByUserRequest} extends {@link RequestModel}
 *
 * <p>DescribeCsImportedProdStatusByUserRequest</p>
 */
public class DescribeCsImportedProdStatusByUserRequest extends Request {
    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SourceLogProd")
    private String sourceLogProd;

    @Body
    @NameInMap("UserId")
    private Long userId;

    private DescribeCsImportedProdStatusByUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sourceLogProd = builder.sourceLogProd;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCsImportedProdStatusByUserRequest create() {
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
     * @return sourceLogProd
     */
    public String getSourceLogProd() {
        return this.sourceLogProd;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DescribeCsImportedProdStatusByUserRequest, Builder> {
        private String regionId; 
        private String sourceLogProd; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCsImportedProdStatusByUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sourceLogProd = request.sourceLogProd;
            this.userId = request.userId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SourceLogProd.
         */
        public Builder sourceLogProd(String sourceLogProd) {
            this.putBodyParameter("SourceLogProd", sourceLogProd);
            this.sourceLogProd = sourceLogProd;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DescribeCsImportedProdStatusByUserRequest build() {
            return new DescribeCsImportedProdStatusByUserRequest(this);
        } 

    } 

}
