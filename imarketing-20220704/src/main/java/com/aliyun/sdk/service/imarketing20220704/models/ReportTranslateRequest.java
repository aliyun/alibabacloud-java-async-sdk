// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportTranslateRequest} extends {@link RequestModel}
 *
 * <p>ReportTranslateRequest</p>
 */
public class ReportTranslateRequest extends Request {
    @Query
    @NameInMap("Impressionlink")
    private String impressionlink;

    private ReportTranslateRequest(Builder builder) {
        super(builder);
        this.impressionlink = builder.impressionlink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportTranslateRequest create() {
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

    public static final class Builder extends Request.Builder<ReportTranslateRequest, Builder> {
        private String impressionlink; 

        private Builder() {
            super();
        } 

        private Builder(ReportTranslateRequest request) {
            super(request);
            this.impressionlink = request.impressionlink;
        } 

        /**
         * Impressionlink.
         */
        public Builder impressionlink(String impressionlink) {
            this.putQueryParameter("Impressionlink", impressionlink);
            this.impressionlink = impressionlink;
            return this;
        }

        @Override
        public ReportTranslateRequest build() {
            return new ReportTranslateRequest(this);
        } 

    } 

}
