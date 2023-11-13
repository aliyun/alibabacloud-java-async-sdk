// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSavedQueryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSavedQueryResponseBody</p>
 */
public class CreateSavedQueryResponseBody extends TeaModel {
    @NameInMap("QueryId")
    private String queryId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateSavedQueryResponseBody(Builder builder) {
        this.queryId = builder.queryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSavedQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String queryId; 
        private String requestId; 

        /**
         * QueryId.
         */
        public Builder queryId(String queryId) {
            this.queryId = queryId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSavedQueryResponseBody build() {
            return new CreateSavedQueryResponseBody(this);
        } 

    } 

}
