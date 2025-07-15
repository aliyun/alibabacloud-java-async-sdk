// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link AddLiveAIProduceRulesResponseBody} extends {@link TeaModel}
 *
 * <p>AddLiveAIProduceRulesResponseBody</p>
 */
public class AddLiveAIProduceRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RulesId")
    private String rulesId;

    private AddLiveAIProduceRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rulesId = builder.rulesId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveAIProduceRulesResponseBody create() {
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
     * @return rulesId
     */
    public String getRulesId() {
        return this.rulesId;
    }

    public static final class Builder {
        private String requestId; 
        private String rulesId; 

        private Builder() {
        } 

        private Builder(AddLiveAIProduceRulesResponseBody model) {
            this.requestId = model.requestId;
            this.rulesId = model.rulesId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0df228-4a64-af62-20e91b96****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the subtitle rule.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder rulesId(String rulesId) {
            this.rulesId = rulesId;
            return this;
        }

        public AddLiveAIProduceRulesResponseBody build() {
            return new AddLiveAIProduceRulesResponseBody(this);
        } 

    } 

}
