// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link QueryApplicationAccessIdRequest} extends {@link RequestModel}
 *
 * <p>QueryApplicationAccessIdRequest</p>
 */
public class QueryApplicationAccessIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("applicationAccessId")
    private String applicationAccessId;

    private QueryApplicationAccessIdRequest(Builder builder) {
        super(builder);
        this.applicationAccessId = builder.applicationAccessId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryApplicationAccessIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationAccessId
     */
    public String getApplicationAccessId() {
        return this.applicationAccessId;
    }

    public static final class Builder extends Request.Builder<QueryApplicationAccessIdRequest, Builder> {
        private String applicationAccessId; 

        private Builder() {
            super();
        } 

        private Builder(QueryApplicationAccessIdRequest request) {
            super(request);
            this.applicationAccessId = request.applicationAccessId;
        } 

        /**
         * applicationAccessId.
         */
        public Builder applicationAccessId(String applicationAccessId) {
            this.putQueryParameter("applicationAccessId", applicationAccessId);
            this.applicationAccessId = applicationAccessId;
            return this;
        }

        @Override
        public QueryApplicationAccessIdRequest build() {
            return new QueryApplicationAccessIdRequest(this);
        } 

    } 

}
