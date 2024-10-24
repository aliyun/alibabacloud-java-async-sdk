// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The response code.</p>
         * <ul>
         * <li>If OK is returned, the request is successful.</li>
         * <li>Other values indicate that the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The date and time when the signature was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-08 16:44:13</p>
         */
        public Builder createDate(String createDate) {
            this.createDate = createDate;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The remarks of the review. Valid values:</p>
         * <ul>
         * <li>If the signature is in the <strong>Approved</strong> or <strong>Pending Approval</strong> state, No Remarks is returned.</li>
         * <li>If the signature is in the <strong>Not Approved</strong> state, the reason why the signature is rejected is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>The document cannot verify the authenticity of the information. Please upload it again.</p>
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CC89A90C-978F-46AC-B80D-54738371E7CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The signature.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        public Builder signName(String signName) {
            this.signName = signName;
            return this;
        }

        /**
         * <p>The status of the signature. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The signature is pending approval.</li>
         * <li><strong>1</strong>: The signature is approved.</li>
         * <li><strong>2</strong>: The signature is rejected. The Reason parameter indicates the reason why the signature is rejected.</li>
         * <li><strong>10</strong>: The signature is cancelled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
