// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRankingModelTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetRankingModelTemplateResponseBody</p>
 */
public class GetRankingModelTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private RankingModelTemplate result;

    private GetRankingModelTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRankingModelTemplateResponseBody create() {
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
    public RankingModelTemplate getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private RankingModelTemplate result; 

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
        public Builder result(RankingModelTemplate result) {
            this.result = result;
            return this;
        }

        public GetRankingModelTemplateResponseBody build() {
            return new GetRankingModelTemplateResponseBody(this);
        } 

    } 

}
