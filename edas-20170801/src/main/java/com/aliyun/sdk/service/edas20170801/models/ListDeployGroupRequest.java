// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeployGroupRequest} extends {@link RequestModel}
 *
 * <p>ListDeployGroupRequest</p>
 */
public class ListDeployGroupRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    private ListDeployGroupRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeployGroupRequest create() {
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

    public static final class Builder extends Request.Builder<ListDeployGroupRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(ListDeployGroupRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public ListDeployGroupRequest build() {
            return new ListDeployGroupRequest(this);
        } 

    } 

}
