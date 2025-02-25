// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link CreateSavedQueryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSavedQueryResponseBody</p>
 */
public class CreateSavedQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QueryId")
    private String queryId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sq-GeAck****</p>
         */
        public Builder queryId(String queryId) {
            this.queryId = queryId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EFA806B9-7F36-55AB-8B7A-D680C2C5EE57</p>
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
