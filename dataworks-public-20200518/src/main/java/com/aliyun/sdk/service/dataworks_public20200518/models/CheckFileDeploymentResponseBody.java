// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckFileDeploymentResponseBody} extends {@link TeaModel}
 *
 * <p>CheckFileDeploymentResponseBody</p>
 */
public class CheckFileDeploymentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CheckFileDeploymentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckFileDeploymentResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckFileDeploymentResponseBody build() {
            return new CheckFileDeploymentResponseBody(this);
        } 

    } 

}
