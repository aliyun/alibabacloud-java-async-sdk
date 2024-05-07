// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPredefinedScopesRequest} extends {@link RequestModel}
 *
 * <p>ListPredefinedScopesRequest</p>
 */
public class ListPredefinedScopesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    private ListPredefinedScopesRequest(Builder builder) {
        super(builder);
        this.appType = builder.appType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPredefinedScopesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    public static final class Builder extends Request.Builder<ListPredefinedScopesRequest, Builder> {
        private String appType; 

        private Builder() {
            super();
        } 

        private Builder(ListPredefinedScopesRequest request) {
            super(request);
            this.appType = request.appType;
        } 

        /**
         * The type of the application. Valid values:
         * <p>
         * 
         * *   WebApp
         * *   NativeApp
         * *   ServerApp
         * 
         * If this parameter is empty, the permissions on all types of applications are queried.
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        @Override
        public ListPredefinedScopesRequest build() {
            return new ListPredefinedScopesRequest(this);
        } 

    } 

}
