// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportDevConfigRequest} extends {@link RequestModel}
 *
 * <p>ReportDevConfigRequest</p>
 */
public class ReportDevConfigRequest extends Request {
    @Query
    @NameInMap("Configs")
    private String configs;

    private ReportDevConfigRequest(Builder builder) {
        super(builder);
        this.configs = builder.configs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportDevConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public String getConfigs() {
        return this.configs;
    }

    public static final class Builder extends Request.Builder<ReportDevConfigRequest, Builder> {
        private String configs; 

        private Builder() {
            super();
        } 

        private Builder(ReportDevConfigRequest request) {
            super(request);
            this.configs = request.configs;
        } 

        /**
         * Configs.
         */
        public Builder configs(String configs) {
            this.putQueryParameter("Configs", configs);
            this.configs = configs;
            return this;
        }

        @Override
        public ReportDevConfigRequest build() {
            return new ReportDevConfigRequest(this);
        } 

    } 

}
