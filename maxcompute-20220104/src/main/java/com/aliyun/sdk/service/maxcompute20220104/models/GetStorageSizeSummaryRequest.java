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
 * {@link GetStorageSizeSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetStorageSizeSummaryRequest</p>
 */
public class GetStorageSizeSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("date")
    private String date;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GetStorageSizeSummaryRequest(Builder builder) {
        super(builder);
        this.date = builder.date;
        this.region = builder.region;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageSizeSummaryRequest create() {
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

    public static final class Builder extends Request.Builder<GetStorageSizeSummaryRequest, Builder> {
        private String date; 
        private String region; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetStorageSizeSummaryRequest request) {
            super(request);
            this.date = request.date;
            this.region = request.region;
            this.tenantId = request.tenantId;
        } 

        /**
         * date.
         */
        public Builder date(String date) {
            this.putQueryParameter("date", date);
            this.date = date;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * tenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetStorageSizeSummaryRequest build() {
            return new GetStorageSizeSummaryRequest(this);
        } 

    } 

}
