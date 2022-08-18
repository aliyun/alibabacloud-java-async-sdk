// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableApplicationClientSecretResponseBody} extends {@link TeaModel}
 *
 * <p>EnableApplicationClientSecretResponseBody</p>
 */
public class EnableApplicationClientSecretResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private EnableApplicationClientSecretResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableApplicationClientSecretResponseBody create() {
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
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableApplicationClientSecretResponseBody build() {
            return new EnableApplicationClientSecretResponseBody(this);
        } 

    } 

}
