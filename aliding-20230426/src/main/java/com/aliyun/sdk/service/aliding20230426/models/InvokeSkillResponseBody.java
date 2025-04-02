// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link InvokeSkillResponseBody} extends {@link TeaModel}
 *
 * <p>InvokeSkillResponseBody</p>
 */
public class InvokeSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.Map<String, ?> data;

    private InvokeSkillResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeSkillResponseBody create() {
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
     * @return data
     */
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map<String, ?> data; 

        private Builder() {
        } 

        private Builder(InvokeSkillResponseBody model) {
            this.requestId = model.requestId;
            this.data = model.data;
        } 

        /**
         * <p>RequestId</p>
         * 
         * <strong>example:</strong>
         * <p>2715B4D3-A3FB-5FC7-AFA0-4471687B1EC6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }

        public InvokeSkillResponseBody build() {
            return new InvokeSkillResponseBody(this);
        } 

    } 

}
