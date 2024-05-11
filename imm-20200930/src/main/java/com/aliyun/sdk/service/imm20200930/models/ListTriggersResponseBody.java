// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTriggersResponseBody} extends {@link TeaModel}
 *
 * <p>ListTriggersResponseBody</p>
 */
public class ListTriggersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Triggers")
    private java.util.List < DataIngestion > triggers;

    private ListTriggersResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.triggers = builder.triggers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTriggersResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return triggers
     */
    public java.util.List < DataIngestion > getTriggers() {
        return this.triggers;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < DataIngestion > triggers; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Triggers.
         */
        public Builder triggers(java.util.List < DataIngestion > triggers) {
            this.triggers = triggers;
            return this;
        }

        public ListTriggersResponseBody build() {
            return new ListTriggersResponseBody(this);
        } 

    } 

}
