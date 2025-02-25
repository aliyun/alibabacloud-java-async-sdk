// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link DeleteIntegrationsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteIntegrationsResponseBody</p>
 */
public class DeleteIntegrationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteIntegrationsResponseBody(Builder builder) {
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIntegrationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean isSuccess; 
        private String requestId; 

        /**
         * <p>Indicates whether the alert integration is deleted. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>34ED024E-9E31-434A-9E4E-D9D15C3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteIntegrationsResponseBody build() {
            return new DeleteIntegrationsResponseBody(this);
        } 

    } 

}
