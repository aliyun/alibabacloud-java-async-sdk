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
 * {@link RetryChannelPublishRequest} extends {@link RequestModel}
 *
 * <p>RetryChannelPublishRequest</p>
 */
public class RetryChannelPublishRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DraftId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String draftId;

    private RetryChannelPublishRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.draftId = builder.draftId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryChannelPublishRequest create() {
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

    public static final class Builder extends Request.Builder<RetryChannelPublishRequest, Builder> {
        private String regionId; 
        private String draftId; 

        private Builder() {
            super();
        } 

        private Builder(RetryChannelPublishRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.draftId = request.draftId;
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
         * <p>draft-789</p>
         */
        public Builder draftId(String draftId) {
            this.putQueryParameter("DraftId", draftId);
            this.draftId = draftId;
            return this;
        }

        @Override
        public RetryChannelPublishRequest build() {
            return new RetryChannelPublishRequest(this);
        } 

    } 

}
