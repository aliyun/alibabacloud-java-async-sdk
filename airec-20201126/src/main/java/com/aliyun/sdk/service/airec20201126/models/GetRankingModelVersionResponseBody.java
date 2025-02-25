// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRankingModelVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetRankingModelVersionResponseBody</p>
 */
public class GetRankingModelVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private RankingModelVersion result;

    private GetRankingModelVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRankingModelVersionResponseBody create() {
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
    public RankingModelVersion getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private RankingModelVersion result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(RankingModelVersion result) {
            this.result = result;
            return this;
        }

        public GetRankingModelVersionResponseBody build() {
            return new GetRankingModelVersionResponseBody(this);
        } 

    } 

}
