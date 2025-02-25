// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSlowQueryCategoriesRequest} extends {@link RequestModel}
 *
 * <p>ListSlowQueryCategoriesRequest</p>
 */
public class ListSlowQueryCategoriesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    private ListSlowQueryCategoriesRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSlowQueryCategoriesRequest create() {
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

    public static final class Builder extends Request.Builder<ListSlowQueryCategoriesRequest, Builder> {
        private String appGroupIdentity; 

        private Builder() {
            super();
        } 

        private Builder(ListSlowQueryCategoriesRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
        } 

        /**
         * The name of the application
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        @Override
        public ListSlowQueryCategoriesRequest build() {
            return new ListSlowQueryCategoriesRequest(this);
        } 

    } 

}
