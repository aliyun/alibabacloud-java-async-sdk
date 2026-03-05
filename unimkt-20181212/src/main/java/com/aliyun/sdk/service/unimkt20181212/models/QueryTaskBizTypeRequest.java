// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.unimkt20181212.models;

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
 * {@link QueryTaskBizTypeRequest} extends {@link RequestModel}
 *
 * <p>QueryTaskBizTypeRequest</p>
 */
public class QueryTaskBizTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    private QueryTaskBizTypeRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTaskBizTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    public static final class Builder extends Request.Builder<QueryTaskBizTypeRequest, Builder> {
        private String channelId; 

        private Builder() {
            super();
        } 

        private Builder(QueryTaskBizTypeRequest request) {
            super(request);
            this.channelId = request.channelId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        @Override
        public QueryTaskBizTypeRequest build() {
            return new QueryTaskBizTypeRequest(this);
        } 

    } 

}
