// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddSasContainerWebDefenseRuleResponseBody} extends {@link TeaModel}
 *
 * <p>AddSasContainerWebDefenseRuleResponseBody</p>
 */
public class AddSasContainerWebDefenseRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Long data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddSasContainerWebDefenseRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSasContainerWebDefenseRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Long getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long data; 
        private String requestId; 

        /**
         * <p>The unique value of the created rule.</p>
         * 
         * <strong>example:</strong>
         * <p>200634</p>
         */
        public Builder data(Long data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8B4B6E6D-B0B0-5F05-A14E-82917D9648EE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddSasContainerWebDefenseRuleResponseBody build() {
            return new AddSasContainerWebDefenseRuleResponseBody(this);
        } 

    } 

}
