// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserBusinessStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserBusinessStatusResponseBody</p>
 */
public class DescribeUserBusinessStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsEnabled")
    private Boolean isEnabled;

    @NameInMap("IsIndebted")
    private Boolean isIndebted;

    @NameInMap("IsIndebtedOverdue")
    private Boolean isIndebtedOverdue;

    @NameInMap("IsRiskControl")
    private Boolean isRiskControl;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeUserBusinessStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.isEnabled = builder.isEnabled;
        this.isIndebted = builder.isIndebted;
        this.isIndebtedOverdue = builder.isIndebtedOverdue;
        this.isRiskControl = builder.isRiskControl;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserBusinessStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isEnabled
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * @return isIndebted
     */
    public Boolean getIsIndebted() {
        return this.isIndebted;
    }

    /**
     * @return isIndebtedOverdue
     */
    public Boolean getIsIndebtedOverdue() {
        return this.isIndebtedOverdue;
    }

    /**
     * @return isRiskControl
     */
    public Boolean getIsRiskControl() {
        return this.isRiskControl;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Boolean isEnabled; 
        private Boolean isIndebted; 
        private Boolean isIndebtedOverdue; 
        private Boolean isRiskControl; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsEnabled.
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        /**
         * IsIndebted.
         */
        public Builder isIndebted(Boolean isIndebted) {
            this.isIndebted = isIndebted;
            return this;
        }

        /**
         * IsIndebtedOverdue.
         */
        public Builder isIndebtedOverdue(Boolean isIndebtedOverdue) {
            this.isIndebtedOverdue = isIndebtedOverdue;
            return this;
        }

        /**
         * IsRiskControl.
         */
        public Builder isRiskControl(Boolean isRiskControl) {
            this.isRiskControl = isRiskControl;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public DescribeUserBusinessStatusResponseBody build() {
            return new DescribeUserBusinessStatusResponseBody(this);
        } 

    } 

}
