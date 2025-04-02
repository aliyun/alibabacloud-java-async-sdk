// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link CloneSentinelRuleFromAhasResponseBody} extends {@link TeaModel}
 *
 * <p>CloneSentinelRuleFromAhasResponseBody</p>
 */
public class CloneSentinelRuleFromAhasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.Map<String, java.util.List<String>> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloneSentinelRuleFromAhasResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneSentinelRuleFromAhasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.Map<String, java.util.List<String>> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, java.util.List<String>> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloneSentinelRuleFromAhasResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.Map<String, java.util.List<String>> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE5C32A1-BC0E-4B79-817C-103E4EDF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloneSentinelRuleFromAhasResponseBody build() {
            return new CloneSentinelRuleFromAhasResponseBody(this);
        } 

    } 

}
