// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppInfosRequest} extends {@link RequestModel}
 *
 * <p>GetAppInfosRequest</p>
 */
public class GetAppInfosRequest extends Request {
    @Query
    @NameInMap("AppIds")
    @Validation(required = true)
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
         * The type of the application. Valid values:
         * <p>
         * 
         * - **System**
         * - **Custom**
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
