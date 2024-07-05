// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppInfosRequest} extends {@link RequestModel}
 *
 * <p>GetAppInfosRequest</p>
 */
public class GetAppInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appIds;

    private GetAppInfosRequest(Builder builder) {
        super(builder);
        this.appIds = builder.appIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppInfosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appIds
     */
    public String getAppIds() {
        return this.appIds;
    }

    public static final class Builder extends Request.Builder<GetAppInfosRequest, Builder> {
        private String appIds; 

        private Builder() {
            super();
        } 

        private Builder(GetAppInfosRequest request) {
            super(request);
            this.appIds = request.appIds;
        } 

        /**
         * The IDs of applications. You can obtain application IDs from the response to the [CreateAppInfo](~~113266~~) or [ListAppInfo](~~114000~~) operation.
         * <p>
         * 
         * *   You can specify a maximum of 10 application IDs.
         * *   Separate application IDs with commas (,).
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        @Override
        public GetAppInfosRequest build() {
            return new GetAppInfosRequest(this);
        } 

    } 

}
