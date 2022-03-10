// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelReportShareRequest} extends {@link RequestModel}
 *
 * <p>CancelReportShareRequest</p>
 */
public class CancelReportShareRequest extends Request {
    @Query
    @NameInMap("ReportId")
    @Validation(required = true)
    private String reportId;

    @Query
    @NameInMap("ShareToIds")
    @Validation(required = true)
    private String shareToIds;

    @Query
    @NameInMap("ShareToType")
    @Validation(required = true)
    private Integer shareToType;

    private CancelReportShareRequest(Builder builder) {
        super(builder);
        this.reportId = builder.reportId;
        this.shareToIds = builder.shareToIds;
        this.shareToType = builder.shareToType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelReportShareRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return shareToIds
     */
    public String getShareToIds() {
        return this.shareToIds;
    }

    /**
     * @return shareToType
     */
    public Integer getShareToType() {
        return this.shareToType;
    }

    public static final class Builder extends Request.Builder<CancelReportShareRequest, Builder> {
        private String reportId; 
        private String shareToIds; 
        private Integer shareToType; 

        private Builder() {
            super();
        } 

        private Builder(CancelReportShareRequest request) {
            super(request);
            this.reportId = request.reportId;
            this.shareToIds = request.shareToIds;
            this.shareToType = request.shareToType;
        } 

        /**
         * ReportId.
         */
        public Builder reportId(String reportId) {
            this.putQueryParameter("ReportId", reportId);
            this.reportId = reportId;
            return this;
        }

        /**
         * ShareToIds.
         */
        public Builder shareToIds(String shareToIds) {
            this.putQueryParameter("ShareToIds", shareToIds);
            this.shareToIds = shareToIds;
            return this;
        }

        /**
         * ShareToType.
         */
        public Builder shareToType(Integer shareToType) {
            this.putQueryParameter("ShareToType", shareToType);
            this.shareToType = shareToType;
            return this;
        }

        @Override
        public CancelReportShareRequest build() {
            return new CancelReportShareRequest(this);
        } 

    } 

}
