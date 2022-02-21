// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmsSignResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsSignResponseBody</p>
 */
public class QuerySmsSignResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CreateDate")
    private String createDate;

    @NameInMap("Message")
    private String message;

    @NameInMap("Reason")
    private String reason;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SignName")
    private String signName;

    @NameInMap("SignStatus")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CreateDate.
         */
        public Builder createDate(String createDate) {
            this.createDate = createDate;
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
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
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
         * SignName.
         */
        public Builder signName(String signName) {
            this.signName = signName;
            return this;
        }

        /**
         * SignStatus.
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
