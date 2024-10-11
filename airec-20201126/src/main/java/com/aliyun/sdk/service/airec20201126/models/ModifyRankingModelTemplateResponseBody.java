// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyRankingModelTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyRankingModelTemplateResponseBody</p>
 */
public class ModifyRankingModelTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private RankingModelTemplate result;

    private ModifyRankingModelTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRankingModelTemplateResponseBody create() {
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
         * <p>The information about the ranking model.</p>
         */
        public Builder result(RankingModelTemplate result) {
            this.result = result;
            return this;
        }

        public ModifyRankingModelTemplateResponseBody build() {
            return new ModifyRankingModelTemplateResponseBody(this);
        } 

    } 

}
