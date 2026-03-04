// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SubmitYikeAIAppJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitYikeAIAppJobRequest</p>
 */
public class SubmitYikeAIAppJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppParams")
    private String appParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FolderId")
    private String folderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductionId")
    private String productionId;

    private SubmitYikeAIAppJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.appParams = builder.appParams;
        this.folderId = builder.folderId;
        this.productionId = builder.productionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitYikeAIAppJobRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appParams
     */
    public String getAppParams() {
        return this.appParams;
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return productionId
     */
    public String getProductionId() {
        return this.productionId;
    }

    public static final class Builder extends Request.Builder<SubmitYikeAIAppJobRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String appParams; 
        private String folderId; 
        private String productionId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitYikeAIAppJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.appParams = request.appParams;
            this.folderId = request.folderId;
            this.productionId = request.productionId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sys-ao-smith-1</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppParams.
         */
        public Builder appParams(String appParams) {
            this.putBodyParameter("AppParams", appParams);
            this.appParams = appParams;
            return this;
        }

        /**
         * FolderId.
         */
        public Builder folderId(String folderId) {
            this.putBodyParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * ProductionId.
         */
        public Builder productionId(String productionId) {
            this.putBodyParameter("ProductionId", productionId);
            this.productionId = productionId;
            return this;
        }

        @Override
        public SubmitYikeAIAppJobRequest build() {
            return new SubmitYikeAIAppJobRequest(this);
        } 

    } 

}
