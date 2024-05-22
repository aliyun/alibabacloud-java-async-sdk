// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDeviceInternetPortResponseBody} extends {@link TeaModel}
 *
 * <p>AddDeviceInternetPortResponseBody</p>
 */
public class AddDeviceInternetPortResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleIds")
    private java.util.List < String > ruleIds;

    private AddDeviceInternetPortResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleIds = builder.ruleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDeviceInternetPortResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleIds
     */
    public java.util.List < String > getRuleIds() {
        return this.ruleIds;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > ruleIds; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of rules.
         */
        public Builder ruleIds(java.util.List < String > ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }

        public AddDeviceInternetPortResponseBody build() {
            return new AddDeviceInternetPortResponseBody(this);
        } 

    } 

}
