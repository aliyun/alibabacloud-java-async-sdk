// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIncidentSubNodesCountResponseBody} extends {@link TeaModel}
 *
 * <p>QueryIncidentSubNodesCountResponseBody</p>
 */
public class QueryIncidentSubNodesCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubNodesCount")
    private java.util.Map < String, Integer > subNodesCount;

    @NameInMap("Success")
    private Boolean success;

    private QueryIncidentSubNodesCountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.subNodesCount = builder.subNodesCount;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIncidentSubNodesCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subNodesCount
     */
    public java.util.Map < String, Integer > getSubNodesCount() {
        return this.subNodesCount;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, Integer > subNodesCount; 
        private Boolean success; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The child nodes.
         */
        public Builder subNodesCount(java.util.Map < String, Integer > subNodesCount) {
            this.subNodesCount = subNodesCount;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryIncidentSubNodesCountResponseBody build() {
            return new QueryIncidentSubNodesCountResponseBody(this);
        } 

    } 

}
