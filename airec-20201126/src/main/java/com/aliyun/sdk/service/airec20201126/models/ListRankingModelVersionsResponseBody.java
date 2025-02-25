// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRankingModelVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRankingModelVersionsResponseBody</p>
 */
public class ListRankingModelVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < RankingModelVersion > result;

    private ListRankingModelVersionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRankingModelVersionsResponseBody create() {
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
    public java.util.List < RankingModelVersion > getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RankingModelVersion > result; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(java.util.List < RankingModelVersion > result) {
            this.result = result;
            return this;
        }

        public ListRankingModelVersionsResponseBody build() {
            return new ListRankingModelVersionsResponseBody(this);
        } 

    } 

}
