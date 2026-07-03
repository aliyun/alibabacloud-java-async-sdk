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
 * {@link AttachCcnInstanceToCenResponseBody} extends {@link TeaModel}
 *
 * <p>AttachCcnInstanceToCenResponseBody</p>
 */
public class AttachCcnInstanceToCenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AttachCcnInstanceToCenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachCcnInstanceToCenResponseBody create() {
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

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(AttachCcnInstanceToCenResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>551CD836-9E46-4F2C-A167-B4363180A647</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AttachCcnInstanceToCenResponseBody build() {
            return new AttachCcnInstanceToCenResponseBody(this);
        } 

    } 

}
