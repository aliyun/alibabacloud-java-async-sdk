// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListAppVersionsRequest</p>
 */
public class ListAppVersionsRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    private ListAppVersionsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppVersionsRequest create() {
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

    public static final class Builder extends Request.Builder<ListAppVersionsRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(ListAppVersionsRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public ListAppVersionsRequest build() {
            return new ListAppVersionsRequest(this);
        } 

    } 

}
