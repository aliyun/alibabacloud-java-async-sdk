// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link BatchQueryReceivedPushStatusRequest} extends {@link RequestModel}
 *
 * <p>BatchQueryReceivedPushStatusRequest</p>
 */
public class BatchQueryReceivedPushStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushNos")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> pushNos;

    private BatchQueryReceivedPushStatusRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pushNos = builder.pushNos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchQueryReceivedPushStatusRequest create() {
        return builder().build();
    }

@Override
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
     * @return pushNos
     */
    public java.util.List<String> getPushNos() {
        return this.pushNos;
    }

    public static final class Builder extends Request.Builder<BatchQueryReceivedPushStatusRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<String> pushNos; 

        private Builder() {
            super();
        } 

        private Builder(BatchQueryReceivedPushStatusRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pushNos = request.pushNos;
        } 

        /**
         * <p>本次请求最多返回的记录条数</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>标记当前开始读取的位置，置空表示从头开始</p>
         * 
         * <strong>example:</strong>
         * <p>12jkeb1</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Push编号列表，最多50个</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;push_20250101_abc123&quot;,&quot;push_20250101_def456&quot;]</p>
         */
        public Builder pushNos(java.util.List<String> pushNos) {
            String pushNosShrink = shrink(pushNos, "PushNos", "json");
            this.putQueryParameter("PushNos", pushNosShrink);
            this.pushNos = pushNos;
            return this;
        }

        @Override
        public BatchQueryReceivedPushStatusRequest build() {
            return new BatchQueryReceivedPushStatusRequest(this);
        } 

    } 

}
