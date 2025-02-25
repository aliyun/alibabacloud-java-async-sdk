// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartSlowQueryAnalyzerRequest} extends {@link RequestModel}
 *
 * <p>StartSlowQueryAnalyzerRequest</p>
 */
public class StartSlowQueryAnalyzerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    private StartSlowQueryAnalyzerRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartSlowQueryAnalyzerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    public static final class Builder extends Request.Builder<StartSlowQueryAnalyzerRequest, Builder> {
        private String appGroupIdentity; 

        private Builder() {
            super();
        } 

        private Builder(StartSlowQueryAnalyzerRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
        } 

        /**
         * "my_app_group_name"
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        @Override
        public StartSlowQueryAnalyzerRequest build() {
            return new StartSlowQueryAnalyzerRequest(this);
        } 

    } 

}
