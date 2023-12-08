// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPolicyEnableStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolicyEnableStatusResponseBody</p>
 */
public class GetPolicyEnableStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StatusModels")
    private java.util.List < StatusModels> statusModels;

    private GetPolicyEnableStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statusModels = builder.statusModels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolicyEnableStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statusModels
     */
    public java.util.List < StatusModels> getStatusModels() {
        return this.statusModels;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < StatusModels> statusModels; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information of the Tag Policy feature.
         */
        public Builder statusModels(java.util.List < StatusModels> statusModels) {
            this.statusModels = statusModels;
            return this;
        }

        public GetPolicyEnableStatusResponseBody build() {
            return new GetPolicyEnableStatusResponseBody(this);
        } 

    } 

    public static class StatusModels extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("UserType")
        private String userType;

        private StatusModels(Builder builder) {
            this.status = builder.status;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusModels create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String status; 
            private String userType; 

            /**
             * The status of the Tag Policy feature. Valid values:
             * <p>
             * 
             * *   PendingEnable: The feature is being enabled.
             * *   Enabled: The feature is enabled.
             * *   Closing: The feature is being disabled.
             * *   Disabled: The feature is disabled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The mode of the Tag Policy feature. Valid values:
             * <p>
             * 
             * *   USER: single-account mode
             * *   RD: multi-account mode
             * 
             * For more information about the modes of the Tag Policy feature, see [Modes of the Tag Policy feature](~~417434~~).
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public StatusModels build() {
                return new StatusModels(this);
            } 

        } 

    }
}
