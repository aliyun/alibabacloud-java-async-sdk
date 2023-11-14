// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteContainerPluginRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteContainerPluginRuleResponseBody</p>
 */
public class DeleteContainerPluginRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    private Boolean data;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteContainerPluginRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContainerPluginRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean data; 
        private String requestId; 

        /**
         * Indicates whether the container plug-in is manually deleted. Valid values: **true** and **false**.
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteContainerPluginRuleResponseBody build() {
            return new DeleteContainerPluginRuleResponseBody(this);
        } 

    } 

}
