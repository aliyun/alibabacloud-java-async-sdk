// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link GetSmartAccessGatewayUseLimitResponseBody} extends {@link TeaModel}
 *
 * <p>GetSmartAccessGatewayUseLimitResponseBody</p>
 */
public class GetSmartAccessGatewayUseLimitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalAmount")
    private Integer totalAmount;

    @com.aliyun.core.annotation.NameInMap("UsedAmount")
    private Integer usedAmount;

    private GetSmartAccessGatewayUseLimitResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalAmount = builder.totalAmount;
        this.usedAmount = builder.usedAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSmartAccessGatewayUseLimitResponseBody create() {
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
     * @return totalAmount
     */
    public Integer getTotalAmount() {
        return this.totalAmount;
    }

    /**
     * @return usedAmount
     */
    public Integer getUsedAmount() {
        return this.usedAmount;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalAmount; 
        private Integer usedAmount; 

        private Builder() {
        } 

        private Builder(GetSmartAccessGatewayUseLimitResponseBody model) {
            this.requestId = model.requestId;
            this.totalAmount = model.totalAmount;
            this.usedAmount = model.usedAmount;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2265DB11-F5CC-496E-ADE7-D043AC37926A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of SAG instances that you can purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder totalAmount(Integer totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        /**
         * <p>The number of SAG instances that you have purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>47</p>
         */
        public Builder usedAmount(Integer usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }

        public GetSmartAccessGatewayUseLimitResponseBody build() {
            return new GetSmartAccessGatewayUseLimitResponseBody(this);
        } 

    } 

}
