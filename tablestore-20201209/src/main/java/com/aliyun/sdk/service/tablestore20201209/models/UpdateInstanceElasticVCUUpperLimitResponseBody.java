// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
 * {@link UpdateInstanceElasticVCUUpperLimitResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateInstanceElasticVCUUpperLimitResponseBody</p>
 */
public class UpdateInstanceElasticVCUUpperLimitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateInstanceElasticVCUUpperLimitResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceElasticVCUUpperLimitResponseBody create() {
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
         * <p>The request ID, which can be used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>B37BBA04-D827-55C8-B901-5264B904E8C6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateInstanceElasticVCUUpperLimitResponseBody build() {
            return new UpdateInstanceElasticVCUUpperLimitResponseBody(this);
        } 

    } 

}
