// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyRankingSystemResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyRankingSystemResponseBody</p>
 */
public class ModifyRankingSystemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private RankingSystem result;

    private ModifyRankingSystemResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRankingSystemResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ranking service that was modified.</p>
         */
        public Builder result(RankingSystem result) {
            this.result = result;
            return this;
        }

        public ModifyRankingSystemResponseBody build() {
            return new ModifyRankingSystemResponseBody(this);
        } 

    } 

}
