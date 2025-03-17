// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link RegisterCustomViewResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterCustomViewResponseBody</p>
 */
public class RegisterCustomViewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomViewId")
    private String customViewId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RegisterCustomViewResponseBody(Builder builder) {
        this.customViewId = builder.customViewId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterCustomViewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customViewId
     */
    public String getCustomViewId() {
        return this.customViewId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String customViewId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RegisterCustomViewResponseBody model) {
            this.customViewId = model.customViewId;
            this.requestId = model.requestId;
        } 

        /**
         * CustomViewId.
         */
        public Builder customViewId(String customViewId) {
            this.customViewId = customViewId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterCustomViewResponseBody build() {
            return new RegisterCustomViewResponseBody(this);
        } 

    } 

}
