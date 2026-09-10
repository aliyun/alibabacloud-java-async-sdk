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
 * {@link ListNotifyPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNotifyPoliciesResponseBody</p>
 */
public class ListNotifyPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("notifyPolicyList")
    private java.util.List<NotifyPolicySummary> notifyPolicyList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListNotifyPoliciesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.notifyPolicyList = builder.notifyPolicyList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNotifyPoliciesResponseBody create() {
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
     * @return notifyPolicyList
     */
    public java.util.List<NotifyPolicySummary> getNotifyPolicyList() {
        return this.notifyPolicyList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<NotifyPolicySummary> notifyPolicyList; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListNotifyPoliciesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.notifyPolicyList = model.notifyPolicyList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries returned in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page. This parameter is empty if no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJjdXJzb3IiOjEwfQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of notify policies. Each entry is of the NotifyPolicySummary type (lightweight view).</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;uuid&quot;:&quot;np-12345678-1234-1234-1234-123456789012&quot;,&quot;name&quot;:&quot;prod-alert&quot;,&quot;description&quot;:&quot;生产环境告警策略&quot;,&quot;enabled&quot;:true,&quot;version&quot;:1,&quot;workspace&quot;:&quot;default-cms-xxxx-cn-hangzhou&quot;,&quot;userId&quot;:&quot;107640&quot;,&quot;createTime&quot;:&quot;1711792800000&quot;,&quot;updateTime&quot;:&quot;1711792800000&quot;}]</p>
         */
        public Builder notifyPolicyList(java.util.List<NotifyPolicySummary> notifyPolicyList) {
            this.notifyPolicyList = notifyPolicyList;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID for troubleshooting and ticket submission.</p>
         * 
         * <strong>example:</strong>
         * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries. The actual total is returned on the first page. A fixed value of -1 is returned on subsequent pages.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNotifyPoliciesResponseBody build() {
            return new ListNotifyPoliciesResponseBody(this);
        } 

    } 

}
