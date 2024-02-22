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
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The code of the cloud service.
         */
        public Builder sourceLogProd(String sourceLogProd) {
            this.putBodyParameter("SourceLogProd", sourceLogProd);
            this.sourceLogProd = sourceLogProd;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account.
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
