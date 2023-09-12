// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetAppQuotaRequest</p>
 */
public class GetAppQuotaRequest extends Request {
    @Path
    @NameInMap("appName")
    @Validation(required = true)
    private String appName;

    private GetAppQuotaRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    public static final class Builder extends Request.Builder<GetAppQuotaRequest, Builder> {
        private String appName; 

        private Builder() {
            super();
        } 

        private Builder(GetAppQuotaRequest request) {
            super(request);
            this.appName = request.appName;
        } 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        @Override
        public GetAppQuotaRequest build() {
            return new GetAppQuotaRequest(this);
        } 

    } 

}
