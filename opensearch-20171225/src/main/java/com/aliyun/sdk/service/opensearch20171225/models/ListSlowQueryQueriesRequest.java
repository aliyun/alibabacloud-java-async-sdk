// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSlowQueryQueriesRequest} extends {@link RequestModel}
 *
 * <p>ListSlowQueryQueriesRequest</p>
 */
public class ListSlowQueryQueriesRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("categoryIndex")
    @Validation(required = true)
    private String categoryIndex;

    private ListSlowQueryQueriesRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.categoryIndex = builder.categoryIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSlowQueryQueriesRequest create() {
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

    /**
     * @return categoryIndex
     */
    public String getCategoryIndex() {
        return this.categoryIndex;
    }

    public static final class Builder extends Request.Builder<ListSlowQueryQueriesRequest, Builder> {
        private String appGroupIdentity; 
        private String categoryIndex; 

        private Builder() {
            super();
        } 

        private Builder(ListSlowQueryQueriesRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.categoryIndex = request.categoryIndex;
        } 

        /**
         * my_app_group_name
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * 0
         */
        public Builder categoryIndex(String categoryIndex) {
            this.putPathParameter("categoryIndex", categoryIndex);
            this.categoryIndex = categoryIndex;
            return this;
        }

        @Override
        public ListSlowQueryQueriesRequest build() {
            return new ListSlowQueryQueriesRequest(this);
        } 

    } 

}
