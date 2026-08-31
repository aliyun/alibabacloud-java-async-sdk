// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetQualityArchiveTableProgressRequest} extends {@link RequestModel}
 *
 * <p>GetQualityArchiveTableProgressRequest</p>
 */
public class GetQualityArchiveTableProgressRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProgressId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String progressId;

    private GetQualityArchiveTableProgressRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.progressId = builder.progressId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityArchiveTableProgressRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return progressId
     */
    public String getProgressId() {
        return this.progressId;
    }

    public static final class Builder extends Request.Builder<GetQualityArchiveTableProgressRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private String progressId; 

        private Builder() {
            super();
        } 

        private Builder(GetQualityArchiveTableProgressRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.progressId = request.progressId;
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
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d78f0b5c9a1e4f2ab3c6d5e4f7a8b9c0</p>
         */
        public Builder progressId(String progressId) {
            this.putQueryParameter("ProgressId", progressId);
            this.progressId = progressId;
            return this;
        }

        @Override
        public GetQualityArchiveTableProgressRequest build() {
            return new GetQualityArchiveTableProgressRequest(this);
        } 

    } 

}
