// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

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
 * {@link GetPolicyEnableStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolicyEnableStatusResponseBody</p>
 */
public class GetPolicyEnableStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatusModels")
    private java.util.List<StatusModels> statusModels;

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
    public java.util.List<StatusModels> getStatusModels() {
        return this.statusModels;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<StatusModels> statusModels; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6C8DF1B1-C65F-5D3A-9FDA-26A4683BB36B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information of the Tag Policy feature.</p>
         */
        public Builder statusModels(java.util.List<StatusModels> statusModels) {
            this.statusModels = statusModels;
            return this;
        }

        public GetPolicyEnableStatusResponseBody build() {
            return new GetPolicyEnableStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPolicyEnableStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyEnableStatusResponseBody</p>
     */
    public static class StatusModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserType")
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
             * <p>The status of the Tag Policy feature. Valid values:</p>
             * <ul>
             * <li>PendingEnable: The feature is being enabled.</li>
             * <li>Enabled: The feature is enabled.</li>
             * <li>Closing: The feature is being disabled.</li>
             * <li>Disabled: The feature is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The mode of the Tag Policy feature. Valid values:</p>
             * <ul>
             * <li>USER: single-account mode</li>
             * <li>RD: multi-account mode</li>
             * </ul>
             * <p>For more information about the modes of the Tag Policy feature, see <a href="https://help.aliyun.com/document_detail/417434.html">Modes of the Tag Policy feature</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>RD</p>
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
