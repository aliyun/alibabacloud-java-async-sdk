// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteRankingSystemResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteRankingSystemResponseBody</p>
 */
public class DeleteRankingSystemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private RankingSystem result;

    private DeleteRankingSystemResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRankingSystemResponseBody create() {
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
    public RankingSystem getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private RankingSystem result; 

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
        public Builder result(RankingSystem result) {
            this.result = result;
            return this;
        }

        public DeleteRankingSystemResponseBody build() {
            return new DeleteRankingSystemResponseBody(this);
        } 

    } 

}
