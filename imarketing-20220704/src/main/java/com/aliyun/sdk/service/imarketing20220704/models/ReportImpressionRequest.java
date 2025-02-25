// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportImpressionRequest} extends {@link RequestModel}
 *
 * <p>ReportImpressionRequest</p>
 */
public class ReportImpressionRequest extends Request {
    @Query
    @NameInMap("Impressionlink")
    private String impressionlink;

    private ReportImpressionRequest(Builder builder) {
        super(builder);
        this.impressionlink = builder.impressionlink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportImpressionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return impressionlink
     */
    public String getImpressionlink() {
        return this.impressionlink;
    }

    public static final class Builder extends Request.Builder<ReportImpressionRequest, Builder> {
        private String impressionlink; 

        private Builder() {
            super();
        } 

        private Builder(ReportImpressionRequest request) {
            super(request);
            this.impressionlink = request.impressionlink;
        } 

        /**
         * impressionlink
         */
        public Builder impressionlink(String impressionlink) {
            this.putQueryParameter("Impressionlink", impressionlink);
            this.impressionlink = impressionlink;
            return this;
        }

        @Override
        public ReportImpressionRequest build() {
            return new ReportImpressionRequest(this);
        } 

    } 

}
