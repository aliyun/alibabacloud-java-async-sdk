// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateCycleTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCycleTaskResponseBody</p>
 */
public class CreateCycleTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private String configId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCycleTaskResponseBody(Builder builder) {
        this.configId = builder.configId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCycleTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String configId; 
        private String requestId; 

        /**
         * ConfigId.
         */
        public Builder configId(String configId) {
            this.configId = configId;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>86CFF42E-E00A-57A3-8656-22291EFB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCycleTaskResponseBody build() {
            return new CreateCycleTaskResponseBody(this);
        } 

    } 

}
