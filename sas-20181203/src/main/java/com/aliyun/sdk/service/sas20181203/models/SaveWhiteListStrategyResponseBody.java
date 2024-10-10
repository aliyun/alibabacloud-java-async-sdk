// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SaveWhiteListStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>SaveWhiteListStrategyResponseBody</p>
 */
public class SaveWhiteListStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private Long strategyId;

    private SaveWhiteListStrategyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveWhiteListStrategyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return strategyId
     */
    public Long getStrategyId() {
        return this.strategyId;
    }

    public static final class Builder {
        private String requestId; 
        private Long strategyId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5DFD6277-CC36-57F7-ACE6-F5952XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the application whitelist policy.</p>
         * 
         * <strong>example:</strong>
         * <p>8634</p>
         */
        public Builder strategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }

        public SaveWhiteListStrategyResponseBody build() {
            return new SaveWhiteListStrategyResponseBody(this);
        } 

    } 

}
