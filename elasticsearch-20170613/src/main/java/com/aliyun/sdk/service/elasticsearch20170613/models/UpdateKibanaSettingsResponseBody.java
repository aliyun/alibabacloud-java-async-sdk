// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateKibanaSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateKibanaSettingsResponseBody</p>
 */
public class UpdateKibanaSettingsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Boolean result;

    private UpdateKibanaSettingsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKibanaSettingsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Return results:
         * <p>
         * 
         * *   true: The Kibana language modified successfully
         * *   false: The Kibana language modified failed
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public UpdateKibanaSettingsResponseBody build() {
            return new UpdateKibanaSettingsResponseBody(this);
        } 

    } 

}
