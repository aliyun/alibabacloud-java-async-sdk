// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPublishedServicesRequest} extends {@link RequestModel}
 *
 * <p>ListPublishedServicesRequest</p>
 */
public class ListPublishedServicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    private ListPublishedServicesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublishedServicesRequest create() {
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

    public static final class Builder extends Request.Builder<ListPublishedServicesRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(ListPublishedServicesRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * The ID of the request.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public ListPublishedServicesRequest build() {
            return new ListPublishedServicesRequest(this);
        } 

    } 

}
