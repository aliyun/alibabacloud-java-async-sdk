// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link QuerySyncStatusByAliUidRequest} extends {@link RequestModel}
 *
 * <p>QuerySyncStatusByAliUidRequest</p>
 */
public class QuerySyncStatusByAliUidRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    private QuerySyncStatusByAliUidRequest(Builder builder) {
        super(builder);
        this.businessChannel = builder.businessChannel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySyncStatusByAliUidRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public static final class Builder extends Request.Builder<QuerySyncStatusByAliUidRequest, Builder> {
        private String businessChannel; 

        private Builder() {
            super();
        } 

        private Builder(QuerySyncStatusByAliUidRequest request) {
            super(request);
            this.businessChannel = request.businessChannel;
        } 

        /**
         * BusinessChannel.
         */
        public Builder businessChannel(String businessChannel) {
            this.putQueryParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        @Override
        public QuerySyncStatusByAliUidRequest build() {
            return new QuerySyncStatusByAliUidRequest(this);
        } 

    } 

}
