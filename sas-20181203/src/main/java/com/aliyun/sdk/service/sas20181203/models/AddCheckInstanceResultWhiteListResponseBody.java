// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link AddCheckInstanceResultWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>AddCheckInstanceResultWhiteListResponseBody</p>
 */
public class AddCheckInstanceResultWhiteListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.Map<String, ?> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    private AddCheckInstanceResultWhiteListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCheckInstanceResultWhiteListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder {
        private java.util.Map<String, ?> data; 
        private String requestId; 
        private String ruleId; 

        /**
         * <p>The data returned. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder data(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ADE57832-9666-511C-9A80-B87DE2E8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>381049</p>
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        public AddCheckInstanceResultWhiteListResponseBody build() {
            return new AddCheckInstanceResultWhiteListResponseBody(this);
        } 

    } 

}
