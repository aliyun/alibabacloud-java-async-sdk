// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperationSuspEventsResponseBody} extends {@link TeaModel}
 *
 * <p>OperationSuspEventsResponseBody</p>
 */
public class OperationSuspEventsResponseBody extends TeaModel {
    @NameInMap("AccessCode")
    private String accessCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private OperationSuspEventsResponseBody(Builder builder) {
        this.accessCode = builder.accessCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperationSuspEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessCode
     */
    public String getAccessCode() {
        return this.accessCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * AccessCode.
         */
        public Builder accessCode(String accessCode) {
            this.accessCode = accessCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public OperationSuspEventsResponseBody build() {
            return new OperationSuspEventsResponseBody(this);
        } 

    } 

}
