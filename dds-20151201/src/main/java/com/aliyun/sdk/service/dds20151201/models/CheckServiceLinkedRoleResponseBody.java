// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link CheckServiceLinkedRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CheckServiceLinkedRoleResponseBody</p>
 */
public class CheckServiceLinkedRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceLinkedRoleExists")
    private Boolean serviceLinkedRoleExists;

    private CheckServiceLinkedRoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceLinkedRoleExists = builder.serviceLinkedRoleExists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceLinkedRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceLinkedRoleExists
     */
    public Boolean getServiceLinkedRoleExists() {
        return this.serviceLinkedRoleExists;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean serviceLinkedRoleExists; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7BE0D8D2-6702-5639-A9C2-xxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether an SLR is created.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder serviceLinkedRoleExists(Boolean serviceLinkedRoleExists) {
            this.serviceLinkedRoleExists = serviceLinkedRoleExists;
            return this;
        }

        public CheckServiceLinkedRoleResponseBody build() {
            return new CheckServiceLinkedRoleResponseBody(this);
        } 

    } 

}
