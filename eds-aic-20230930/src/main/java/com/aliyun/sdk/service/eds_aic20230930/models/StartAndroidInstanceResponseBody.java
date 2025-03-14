// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link StartAndroidInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>StartAndroidInstanceResponseBody</p>
 */
public class StartAndroidInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private StartAndroidInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAndroidInstanceResponseBody create() {
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

        private Builder(StartAndroidInstanceResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17C731AB-AAEE-5844-A352-D8D0352D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartAndroidInstanceResponseBody build() {
            return new StartAndroidInstanceResponseBody(this);
        } 

    } 

}
