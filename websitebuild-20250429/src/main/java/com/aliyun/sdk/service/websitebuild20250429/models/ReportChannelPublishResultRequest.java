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
 * {@link ReportChannelPublishResultRequest} extends {@link RequestModel}
 *
 * <p>ReportChannelPublishResultRequest</p>
 */
public class ReportChannelPublishResultRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DraftId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String draftId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalId")
    private String externalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalUrl")
    private String externalUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailReason")
    private String failReason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Success")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean success;

    private ReportChannelPublishResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.draftId = builder.draftId;
        this.externalId = builder.externalId;
        this.externalUrl = builder.externalUrl;
        this.failReason = builder.failReason;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportChannelPublishResultRequest create() {
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
     * @return externalId
     */
    public String getExternalId() {
        return this.externalId;
    }

    /**
     * @return externalUrl
     */
    public String getExternalUrl() {
        return this.externalUrl;
    }

    /**
     * @return failReason
     */
    public String getFailReason() {
        return this.failReason;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder extends Request.Builder<ReportChannelPublishResultRequest, Builder> {
        private String regionId; 
        private String draftId; 
        private String externalId; 
        private String externalUrl; 
        private String failReason; 
        private Boolean success; 

        private Builder() {
            super();
        } 

        private Builder(ReportChannelPublishResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.draftId = request.draftId;
            this.externalId = request.externalId;
            this.externalUrl = request.externalUrl;
            this.failReason = request.failReason;
            this.success = request.success;
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

        /**
         * ExternalId.
         */
        public Builder externalId(String externalId) {
            this.putQueryParameter("ExternalId", externalId);
            this.externalId = externalId;
            return this;
        }

        /**
         * ExternalUrl.
         */
        public Builder externalUrl(String externalUrl) {
            this.putQueryParameter("ExternalUrl", externalUrl);
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * FailReason.
         */
        public Builder failReason(String failReason) {
            this.putQueryParameter("FailReason", failReason);
            this.failReason = failReason;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.putQueryParameter("Success", success);
            this.success = success;
            return this;
        }

        @Override
        public ReportChannelPublishResultRequest build() {
            return new ReportChannelPublishResultRequest(this);
        } 

    } 

}
