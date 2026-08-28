// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link RewriteChannelTitleRequest} extends {@link RequestModel}
 *
 * <p>RewriteChannelTitleRequest</p>
 */
public class RewriteChannelTitleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DraftId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String draftId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserRequirement")
    private String userRequirement;

    private RewriteChannelTitleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.draftId = builder.draftId;
        this.userRequirement = builder.userRequirement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RewriteChannelTitleRequest create() {
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
     * @return draftId
     */
    public String getDraftId() {
        return this.draftId;
    }

    /**
     * @return userRequirement
     */
    public String getUserRequirement() {
        return this.userRequirement;
    }

    public static final class Builder extends Request.Builder<RewriteChannelTitleRequest, Builder> {
        private String regionId; 
        private String draftId; 
        private String userRequirement; 

        private Builder() {
            super();
        } 

        private Builder(RewriteChannelTitleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.draftId = request.draftId;
            this.userRequirement = request.userRequirement;
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
         * <p>7c80359e-835d-4871-a971-8400d008828b</p>
         */
        public Builder draftId(String draftId) {
            this.putQueryParameter("DraftId", draftId);
            this.draftId = draftId;
            return this;
        }

        /**
         * UserRequirement.
         */
        public Builder userRequirement(String userRequirement) {
            this.putQueryParameter("UserRequirement", userRequirement);
            this.userRequirement = userRequirement;
            return this;
        }

        @Override
        public RewriteChannelTitleRequest build() {
            return new RewriteChannelTitleRequest(this);
        } 

    } 

}
