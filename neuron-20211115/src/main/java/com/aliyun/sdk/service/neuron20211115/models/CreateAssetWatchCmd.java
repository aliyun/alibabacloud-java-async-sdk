// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAssetWatchCmd} extends {@link TeaModel}
 *
 * <p>CreateAssetWatchCmd</p>
 */
public class CreateAssetWatchCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("assetId")
    private Long assetId;

    @com.aliyun.core.annotation.NameInMap("assetType")
    private String assetType;

    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    private CreateAssetWatchCmd(Builder builder) {
        this.assetId = builder.assetId;
        this.assetType = builder.assetType;
        this.companyId = builder.companyId;
        this.marketId = builder.marketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAssetWatchCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetId
     */
    public Long getAssetId() {
        return this.assetId;
    }

    /**
     * @return assetType
     */
    public String getAssetType() {
        return this.assetType;
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    public static final class Builder {
        private Long assetId; 
        private String assetType; 
        private Long companyId; 
        private Long marketId; 

        private Builder() {
        } 

        private Builder(CreateAssetWatchCmd model) {
            this.assetId = model.assetId;
            this.assetType = model.assetType;
            this.companyId = model.companyId;
            this.marketId = model.marketId;
        } 

        /**
         * assetId.
         */
        public Builder assetId(Long assetId) {
            this.assetId = assetId;
            return this;
        }

        /**
         * assetType.
         */
        public Builder assetType(String assetType) {
            this.assetType = assetType;
            return this;
        }

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * marketId.
         */
        public Builder marketId(Long marketId) {
            this.marketId = marketId;
            return this;
        }

        public CreateAssetWatchCmd build() {
            return new CreateAssetWatchCmd(this);
        } 

    } 

}
