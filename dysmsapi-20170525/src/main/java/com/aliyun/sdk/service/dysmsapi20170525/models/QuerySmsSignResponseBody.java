// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmsSignResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsSignResponseBody</p>
 */
public class QuerySmsSignResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateDate")
    private String createDate;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    @com.aliyun.core.annotation.NameInMap("SignStatus")
    private Integer signStatus;

    private QuerySmsSignResponseBody(Builder builder) {
        this.code = builder.code;
        this.createDate = builder.createDate;
        this.message = builder.message;
        this.reason = builder.reason;
        this.requestId = builder.requestId;
        this.signName = builder.signName;
        this.signStatus = builder.signStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsSignResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createDate
     */
    public String getCreateDate() {
        return this.createDate;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return signStatus
     */
    public Integer getSignStatus() {
        return this.signStatus;
    }

    public static final class Builder {
        private String code; 
        private String createDate; 
        private String message; 
        private String reason; 
        private String requestId; 
        private String signName; 
        private Integer signStatus; 

        /**
         * The response code.
         * <p>
         * 
         * *   If OK is returned, the request is successful.
         * *   Other values indicate that the request fails. For more information, see [Error codes](~~101346~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The date and time when the signature was created.
         */
        public Builder createDate(String createDate) {
            this.createDate = createDate;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The remarks of the review. Valid values:
         * <p>
         * 
         * *   If the signature is in the **Approved** or **Pending Approval** state, No Remarks is returned.
         * *   If the signature is in the **Not Approved** state, the reason why the signature is rejected is returned.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The signature.
         */
        public Builder signName(String signName) {
            this.signName = signName;
            return this;
        }

        /**
         * The status of the signature. Valid values:
         * <p>
         * 
         * *   **0**: The signature is pending approval.
         * *   **1**: The signature is approved.
         * *   **2**: The signature is rejected. The Reason parameter indicates the reason why the signature is rejected.
         * *   **10**: The signature is cancelled.
         */
        public Builder signStatus(Integer signStatus) {
            this.signStatus = signStatus;
            return this;
        }

        public QuerySmsSignResponseBody build() {
            return new QuerySmsSignResponseBody(this);
        } 

    } 

}
