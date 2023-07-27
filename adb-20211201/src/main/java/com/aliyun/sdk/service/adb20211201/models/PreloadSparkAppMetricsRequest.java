// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreloadSparkAppMetricsRequest} extends {@link RequestModel}
 *
 * <p>PreloadSparkAppMetricsRequest</p>
 */
public class PreloadSparkAppMetricsRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true, maxLength = 64)
    private String appId;

    private PreloadSparkAppMetricsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreloadSparkAppMetricsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<PreloadSparkAppMetricsRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(PreloadSparkAppMetricsRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * The ID of the Spark application.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public PreloadSparkAppMetricsRequest build() {
            return new PreloadSparkAppMetricsRequest(this);
        } 

    } 

}
