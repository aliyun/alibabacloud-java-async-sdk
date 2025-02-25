// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

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
 * {@link CreateServiceLinkedRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceLinkedRoleResponseBody</p>
 */
public class CreateServiceLinkedRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateServiceLinkedRoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceLinkedRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>592B80F0-7674-56A4-9027-8A0A9ACDBD56</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateServiceLinkedRoleResponseBody build() {
            return new CreateServiceLinkedRoleResponseBody(this);
        } 

    } 

}
