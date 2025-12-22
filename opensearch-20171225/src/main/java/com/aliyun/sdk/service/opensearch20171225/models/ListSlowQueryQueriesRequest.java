// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSlowQueryQueriesRequest} extends {@link RequestModel}
 *
 * <p>ListSlowQueryQueriesRequest</p>
 */
public class ListSlowQueryQueriesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("categoryIndex")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>my_app_group_name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_app_group_name</p>
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * <p>0</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
