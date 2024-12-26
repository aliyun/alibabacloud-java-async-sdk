// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link UnRegisterDeviceCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>UnRegisterDeviceCredentialResponseBody</p>
 */
public class UnRegisterDeviceCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UnRegisterDeviceCredentialResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnRegisterDeviceCredentialResponseBody create() {
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
         * <p>The unique ID that the system generates for the request. This parameter is a common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>E4581CCD-62AF-44D9-B5B4-D1DBDC0E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UnRegisterDeviceCredentialResponseBody build() {
            return new UnRegisterDeviceCredentialResponseBody(this);
        } 

    } 

}
