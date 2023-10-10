// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecentChangeOrderRequest} extends {@link RequestModel}
 *
 * <p>ListRecentChangeOrderRequest</p>
 */
public class ListRecentChangeOrderRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    private ListRecentChangeOrderRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecentChangeOrderRequest create() {
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

    public static final class Builder extends Request.Builder<ListRecentChangeOrderRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(ListRecentChangeOrderRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public ListRecentChangeOrderRequest build() {
            return new ListRecentChangeOrderRequest(this);
        } 

    } 

}
