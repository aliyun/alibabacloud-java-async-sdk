// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetStorageAmountSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetStorageAmountSummaryRequest</p>
 */
public class GetStorageAmountSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("date")
    private String date;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GetStorageAmountSummaryRequest(Builder builder) {
        super(builder);
        this.date = builder.date;
        this.region = builder.region;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageAmountSummaryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetStorageAmountSummaryRequest, Builder> {
        private String date; 
        private String region; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetStorageAmountSummaryRequest request) {
            super(request);
            this.date = request.date;
            this.region = request.region;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The date for which the statistics are collected. The statistics are collected on a daily basis. Specify the date in the YYYYMMDD format.</p>
         * 
         * <strong>example:</strong>
         * <p>20241205</p>
         */
        public Builder date(String date) {
            this.putQueryParameter("date", date);
            this.date = date;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The tenant ID. You can log on to the MaxCompute console and choose <strong>Tenant Management</strong> &gt; <strong>Tenant Properties</strong> in the navigation pane on the left to view the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>478403690625249</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetStorageAmountSummaryRequest build() {
            return new GetStorageAmountSummaryRequest(this);
        } 

    } 

}
