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
 * {@link RemoveAssetWatchRequest} extends {@link RequestModel}
 *
 * <p>RemoveAssetWatchRequest</p>
 */
public class RemoveAssetWatchRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("assetId")
    private Long assetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("assetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    private RemoveAssetWatchRequest(Builder builder) {
        super(builder);
        this.assetId = builder.assetId;
        this.assetType = builder.assetType;
        this.companyId = builder.companyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveAssetWatchRequest create() {
        return builder().build();
    }

@Override
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

    public static final class Builder extends Request.Builder<RemoveAssetWatchRequest, Builder> {
        private Long assetId; 
        private String assetType; 
        private Long companyId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveAssetWatchRequest request) {
            super(request);
            this.assetId = request.assetId;
            this.assetType = request.assetType;
            this.companyId = request.companyId;
        } 

        /**
         * assetId.
         */
        public Builder assetId(Long assetId) {
            this.putPathParameter("assetId", assetId);
            this.assetId = assetId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("assetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.putQueryParameter("companyId", companyId);
            this.companyId = companyId;
            return this;
        }

        @Override
        public RemoveAssetWatchRequest build() {
            return new RemoveAssetWatchRequest(this);
        } 

    } 

}
