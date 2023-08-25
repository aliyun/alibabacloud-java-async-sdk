// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkAppInfoRequest} extends {@link RequestModel}
 *
 * <p>GetSparkAppInfoRequest</p>
 */
public class GetSparkAppInfoRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true, maxLength = 64)
    private String appId;

    private GetSparkAppInfoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkAppInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetSparkAppInfoRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(GetSparkAppInfoRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * The ID of the application. 
         * <p>
         * 
         * >  You can call the [ListSparkApps](/help/en/analyticdb-for-mysql/latest/listsparkapps) operation to query the Spark application ID.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public GetSparkAppInfoRequest build() {
            return new GetSparkAppInfoRequest(this);
        } 

    } 

}
