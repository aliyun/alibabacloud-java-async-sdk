// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RollbackRankingSystemResponseBody} extends {@link TeaModel}
 *
 * <p>RollbackRankingSystemResponseBody</p>
 */
public class RollbackRankingSystemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.Map < String, ? > result;

    private RollbackRankingSystemResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackRankingSystemResponseBody create() {
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
    public java.util.Map < String, ? > getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, ? > result; 

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
        public Builder result(java.util.Map < String, ? > result) {
            this.result = result;
            return this;
        }

        public RollbackRankingSystemResponseBody build() {
            return new RollbackRankingSystemResponseBody(this);
        } 

    } 

}
