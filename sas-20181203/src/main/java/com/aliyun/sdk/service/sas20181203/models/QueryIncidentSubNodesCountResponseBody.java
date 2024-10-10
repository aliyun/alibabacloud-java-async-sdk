// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryIncidentSubNodesCountResponseBody} extends {@link TeaModel}
 *
 * <p>QueryIncidentSubNodesCountResponseBody</p>
 */
public class QueryIncidentSubNodesCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubNodesCount")
    private java.util.Map < String, Integer > subNodesCount;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CE500770-42D3-442E-9DDD-156E0F9F3B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The child nodes.</p>
         */
        public Builder subNodesCount(java.util.Map < String, Integer > subNodesCount) {
            this.subNodesCount = subNodesCount;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
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
