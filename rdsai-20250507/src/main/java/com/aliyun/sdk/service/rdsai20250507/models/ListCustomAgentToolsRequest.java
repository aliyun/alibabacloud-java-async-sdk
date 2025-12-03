// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ListCustomAgentToolsRequest} extends {@link RequestModel}
 *
 * <p>ListCustomAgentToolsRequest</p>
 */
public class ListCustomAgentToolsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    private String apiId;

    private ListCustomAgentToolsRequest(Builder builder) {
        super(builder);
        this.apiId = builder.apiId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomAgentToolsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    public static final class Builder extends Request.Builder<ListCustomAgentToolsRequest, Builder> {
        private String apiId; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomAgentToolsRequest request) {
            super(request);
            this.apiId = request.apiId;
        } 

        /**
         * ApiId.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        @Override
        public ListCustomAgentToolsRequest build() {
            return new ListCustomAgentToolsRequest(this);
        } 

    } 

}
