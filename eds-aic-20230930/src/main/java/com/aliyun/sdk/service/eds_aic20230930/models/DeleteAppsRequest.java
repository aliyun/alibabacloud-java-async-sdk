// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DeleteAppsRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppsRequest</p>
 */
public class DeleteAppsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIdList")
    private java.util.List<String> appIdList;

    private DeleteAppsRequest(Builder builder) {
        super(builder);
        this.appIdList = builder.appIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appIdList
     */
    public java.util.List<String> getAppIdList() {
        return this.appIdList;
    }

    public static final class Builder extends Request.Builder<DeleteAppsRequest, Builder> {
        private java.util.List<String> appIdList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppsRequest request) {
            super(request);
            this.appIdList = request.appIdList;
        } 

        /**
         * <p>The IDs of the applications.</p>
         */
        public Builder appIdList(java.util.List<String> appIdList) {
            this.putQueryParameter("AppIdList", appIdList);
            this.appIdList = appIdList;
            return this;
        }

        @Override
        public DeleteAppsRequest build() {
            return new DeleteAppsRequest(this);
        } 

    } 

}
