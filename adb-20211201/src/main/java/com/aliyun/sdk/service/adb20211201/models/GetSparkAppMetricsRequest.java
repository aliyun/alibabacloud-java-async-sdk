// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkAppMetricsRequest} extends {@link RequestModel}
 *
 * <p>GetSparkAppMetricsRequest</p>
 */
public class GetSparkAppMetricsRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true, maxLength = 64)
    private String appId;

    private GetSparkAppMetricsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkAppMetricsRequest create() {
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

    public static final class Builder extends Request.Builder<GetSparkAppMetricsRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(GetSparkAppMetricsRequest request) {
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
        public GetSparkAppMetricsRequest build() {
            return new GetSparkAppMetricsRequest(this);
        } 

    } 

}
