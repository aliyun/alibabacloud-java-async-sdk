// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link CreatePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePolicyResponseBody</p>
 */
public class CreatePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private Long policyId;

    @com.aliyun.core.annotation.NameInMap("PolicyIdentifier")
    private String policyIdentifier;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreatePolicyResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.policyId = builder.policyId;
        this.policyIdentifier = builder.policyIdentifier;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    /**
     * @return policyIdentifier
     */
    public String getPolicyIdentifier() {
        return this.policyIdentifier;
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
        private Integer httpStatusCode; 
        private String message; 
        private Long policyId; 
        private String policyIdentifier; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreatePolicyResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.policyId = model.policyId;
            this.policyIdentifier = model.policyIdentifier;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Status code, 00000 indicates success; others indicate failure.</p>
         * 
         * <strong>example:</strong>
         * <p>00000</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>If there is an error, returns the error message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder policyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>Policy identifier</p>
         * 
         * <strong>example:</strong>
         * <p>2tehcwesh4xx</p>
         */
        public Builder policyIdentifier(String policyIdentifier) {
            this.policyIdentifier = policyIdentifier;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>74D2A967-2CE0-519B-B623-38D851734EC5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the operation was successful. true indicates success, false indicates failure.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreatePolicyResponseBody build() {
            return new CreatePolicyResponseBody(this);
        } 

    } 

}
