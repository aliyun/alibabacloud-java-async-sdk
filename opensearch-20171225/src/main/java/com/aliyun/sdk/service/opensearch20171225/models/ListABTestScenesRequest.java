// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListABTestScenesRequest} extends {@link RequestModel}
 *
 * <p>ListABTestScenesRequest</p>
 */
public class ListABTestScenesRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    private ListABTestScenesRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListABTestScenesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    public static final class Builder extends Request.Builder<ListABTestScenesRequest, Builder> {
        private String appGroupIdentity; 

        private Builder() {
            super();
        } 

        private Builder(ListABTestScenesRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
        } 

        /**
         * my_app_group_name
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        @Override
        public ListABTestScenesRequest build() {
            return new ListABTestScenesRequest(this);
        } 

    } 

}
