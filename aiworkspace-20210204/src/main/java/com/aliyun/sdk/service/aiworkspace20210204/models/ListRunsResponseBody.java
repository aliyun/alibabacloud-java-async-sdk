// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ListRunsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRunsResponseBody</p>
 */
public class ListRunsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private Long nextPageToken;

    @com.aliyun.core.annotation.NameInMap("Runs")
    private java.util.List<Run> runs;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListRunsResponseBody(Builder builder) {
        this.nextPageToken = builder.nextPageToken;
        this.runs = builder.runs;
        this.totalCount = builder.totalCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRunsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextPageToken
     */
    public Long getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return runs
     */
    public java.util.List<Run> getRuns() {
        return this.runs;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long nextPageToken; 
        private java.util.List<Run> runs; 
        private Long totalCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListRunsResponseBody model) {
            this.nextPageToken = model.nextPageToken;
            this.runs = model.runs;
            this.totalCount = model.totalCount;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination token that is used to retrieve the next page. You do not need to specify this parameter for the first request. You must specify the pagination token in the result of the previous query. If the pagination token is 0, no next page exists. You can obtain the pagination token that is used to retrieve the next page in the value of the <strong>NextPageToken</strong> field.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder nextPageToken(Long nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The runs.</p>
         */
        public Builder runs(java.util.List<Run> runs) {
            this.runs = runs;
            return this;
        }

        /**
         * <p>The total number of entries returned. By default, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ADF6D849-*****-7E7030F0CE53</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRunsResponseBody build() {
            return new ListRunsResponseBody(this);
        } 

    } 

}
