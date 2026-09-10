// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link QuerySecurityCheckReportResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySecurityCheckReportResponseBody</p>
 */
public class QuerySecurityCheckReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QuerySecurityCheckReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySecurityCheckReportResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QuerySecurityCheckReportResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p> 200: The request was successful. Other codes (such as 500 or 400): An error occurred.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The query result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2FBDD713-00A5-5C98-B661-3FD31A349B6E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySecurityCheckReportResponseBody build() {
            return new QuerySecurityCheckReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySecurityCheckReportResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySecurityCheckReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudSecurityGuide")
        private Integer cloudSecurityGuide;

        @com.aliyun.core.annotation.NameInMap("ConfigCheckNumber")
        private Integer configCheckNumber;

        @com.aliyun.core.annotation.NameInMap("ContactCheckNumber")
        private Integer contactCheckNumber;

        @com.aliyun.core.annotation.NameInMap("RiskEventNumber")
        private Integer riskEventNumber;

        @com.aliyun.core.annotation.NameInMap("SasCheckNumber")
        private Integer sasCheckNumber;

        @com.aliyun.core.annotation.NameInMap("SecurityStatus")
        private Integer securityStatus;

        @com.aliyun.core.annotation.NameInMap("SuggestionText")
        private String suggestionText;

        private Data(Builder builder) {
            this.cloudSecurityGuide = builder.cloudSecurityGuide;
            this.configCheckNumber = builder.configCheckNumber;
            this.contactCheckNumber = builder.contactCheckNumber;
            this.riskEventNumber = builder.riskEventNumber;
            this.sasCheckNumber = builder.sasCheckNumber;
            this.securityStatus = builder.securityStatus;
            this.suggestionText = builder.suggestionText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cloudSecurityGuide
         */
        public Integer getCloudSecurityGuide() {
            return this.cloudSecurityGuide;
        }

        /**
         * @return configCheckNumber
         */
        public Integer getConfigCheckNumber() {
            return this.configCheckNumber;
        }

        /**
         * @return contactCheckNumber
         */
        public Integer getContactCheckNumber() {
            return this.contactCheckNumber;
        }

        /**
         * @return riskEventNumber
         */
        public Integer getRiskEventNumber() {
            return this.riskEventNumber;
        }

        /**
         * @return sasCheckNumber
         */
        public Integer getSasCheckNumber() {
            return this.sasCheckNumber;
        }

        /**
         * @return securityStatus
         */
        public Integer getSecurityStatus() {
            return this.securityStatus;
        }

        /**
         * @return suggestionText
         */
        public String getSuggestionText() {
            return this.suggestionText;
        }

        public static final class Builder {
            private Integer cloudSecurityGuide; 
            private Integer configCheckNumber; 
            private Integer contactCheckNumber; 
            private Integer riskEventNumber; 
            private Integer sasCheckNumber; 
            private Integer securityStatus; 
            private String suggestionText; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cloudSecurityGuide = model.cloudSecurityGuide;
                this.configCheckNumber = model.configCheckNumber;
                this.contactCheckNumber = model.contactCheckNumber;
                this.riskEventNumber = model.riskEventNumber;
                this.sasCheckNumber = model.sasCheckNumber;
                this.securityStatus = model.securityStatus;
                this.suggestionText = model.suggestionText;
            } 

            /**
             * <p>The subscription status of the cloud security guide. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: not subscribed </li>
             * <li><strong>1</strong>: subscribed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cloudSecurityGuide(Integer cloudSecurityGuide) {
                this.cloudSecurityGuide = cloudSecurityGuide;
                return this;
            }

            /**
             * <p>The number of pending items for configuration audit.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder configCheckNumber(Integer configCheckNumber) {
                this.configCheckNumber = configCheckNumber;
                return this;
            }

            /**
             * <p>The number of pending items for security contacts.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder contactCheckNumber(Integer contactCheckNumber) {
                this.contactCheckNumber = contactCheckNumber;
                return this;
            }

            /**
             * <p>The number of risk events.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder riskEventNumber(Integer riskEventNumber) {
                this.riskEventNumber = riskEventNumber;
                return this;
            }

            /**
             * <p>The number of pending items for Elastic Compute Service.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sasCheckNumber(Integer sasCheckNumber) {
                this.sasCheckNumber = sasCheckNumber;
                return this;
            }

            /**
             * <p>The security check result status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no risk</li>
             * <li><strong>1</strong>: risks exist </li>
             * <li><strong>2</strong>: items to be optimized exist</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder securityStatus(Integer securityStatus) {
                this.securityStatus = securityStatus;
                return this;
            }

            /**
             * <p>The suggestion text.</p>
             * 
             * <strong>example:</strong>
             * <p>exist risk event。</p>
             */
            public Builder suggestionText(String suggestionText) {
                this.suggestionText = suggestionText;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
