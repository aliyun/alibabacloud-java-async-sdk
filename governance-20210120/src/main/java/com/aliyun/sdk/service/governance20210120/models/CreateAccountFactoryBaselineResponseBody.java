// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

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
 * {@link CreateAccountFactoryBaselineResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAccountFactoryBaselineResponseBody</p>
 */
public class CreateAccountFactoryBaselineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BaselineId")
    private String baselineId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAccountFactoryBaselineResponseBody(Builder builder) {
        this.baselineId = builder.baselineId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccountFactoryBaselineResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baselineId
     */
    public String getBaselineId() {
        return this.baselineId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String baselineId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAccountFactoryBaselineResponseBody model) {
            this.baselineId = model.baselineId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The baseline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>afb-bp1e6ixtiwupap8m****</p>
         */
        public Builder baselineId(String baselineId) {
            this.baselineId = baselineId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A5592E2E-0FC4-557C-B989-DF229B5EBE13</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAccountFactoryBaselineResponseBody build() {
            return new CreateAccountFactoryBaselineResponseBody(this);
        } 

    } 

}
