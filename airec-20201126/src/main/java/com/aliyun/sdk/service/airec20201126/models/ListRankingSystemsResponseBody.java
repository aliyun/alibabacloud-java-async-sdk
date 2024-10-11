// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRankingSystemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRankingSystemsResponseBody</p>
 */
public class ListRankingSystemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < RankingSystem > result;

    private ListRankingSystemsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRankingSystemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < RankingSystem > getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RankingSystem > result; 

        /**
         * <p>The schema of the response parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         */
        public Builder result(java.util.List < RankingSystem > result) {
            this.result = result;
            return this;
        }

        public ListRankingSystemsResponseBody build() {
            return new ListRankingSystemsResponseBody(this);
        } 

    } 

}
