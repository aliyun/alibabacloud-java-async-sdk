// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListServiceTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceTaskResponseBody</p>
 */
public class ListServiceTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("serviceTasks")
    private java.util.List<java.util.Map<String, ?>> serviceTasks;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListServiceTaskResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.serviceTasks = builder.serviceTasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceTasks
     */
    public java.util.List<java.util.Map<String, ?>> getServiceTasks() {
        return this.serviceTasks;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<java.util.Map<String, ?>> serviceTasks; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListServiceTaskResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.serviceTasks = model.serviceTasks;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maxResults value of the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page. An encrypted hexadecimal string is returned when a next page exists. An empty value or absence of this field indicates no more data. Pass this value as-is in the nextToken parameter for the next page request.</p>
         * 
         * <strong>example:</strong>
         * <p>d23d8f3f0f0cd1984566b1986c9343122fa0385a05c09694c17fe87709f3eb56d1a7ead56b4a2536</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;taskId&quot;:&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890&quot;,&quot;taskType&quot;:&quot;live_debug_log_probe&quot;}]</p>
         */
        public Builder serviceTasks(java.util.List<java.util.Map<String, ?>> serviceTasks) {
            this.serviceTasks = serviceTasks;
            return this;
        }

        /**
         * <p>The total number of entries that match the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServiceTaskResponseBody build() {
            return new ListServiceTaskResponseBody(this);
        } 

    } 

}
