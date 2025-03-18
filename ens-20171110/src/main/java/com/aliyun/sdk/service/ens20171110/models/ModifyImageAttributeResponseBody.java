// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ModifyImageAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyImageAttributeResponseBody</p>
 */
public class ModifyImageAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyImageAttributeResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyImageAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyImageAttributeResponseBody model) {
            this.code = model.code;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The service code. 0 is returned for a successful request. An error code is returned for a failed request.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AC66B8F3-0B0A-5FB1-9EA2-DC03B2CD5B04</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyImageAttributeResponseBody build() {
            return new ModifyImageAttributeResponseBody(this);
        } 

    } 

}
