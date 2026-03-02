// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SettledPageResult} extends {@link TeaModel}
 *
 * <p>SettledPageResult</p>
 */
public class SettledPageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("settleds")
    private java.util.List<Settled> settleds;

    private SettledPageResult(Builder builder) {
        this.requestId = builder.requestId;
        this.settleds = builder.settleds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SettledPageResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return settleds
     */
    public java.util.List<Settled> getSettleds() {
        return this.settleds;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Settled> settleds; 

        private Builder() {
        } 

        private Builder(SettledPageResult model) {
            this.requestId = model.requestId;
            this.settleds = model.settleds;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * settleds.
         */
        public Builder settleds(java.util.List<Settled> settleds) {
            this.settleds = settleds;
            return this;
        }

        public SettledPageResult build() {
            return new SettledPageResult(this);
        } 

    } 

}
