// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link AdvanceSecurityEventOperationsResponseBody} extends {@link TeaModel}
 *
 * <p>AdvanceSecurityEventOperationsResponseBody</p>
 */
public class AdvanceSecurityEventOperationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityEventOperationsResponse")
    private java.util.List<SecurityEventOperationsResponse> securityEventOperationsResponse;

    private AdvanceSecurityEventOperationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityEventOperationsResponse = builder.securityEventOperationsResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AdvanceSecurityEventOperationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityEventOperationsResponse
     */
    public java.util.List<SecurityEventOperationsResponse> getSecurityEventOperationsResponse() {
        return this.securityEventOperationsResponse;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SecurityEventOperationsResponse> securityEventOperationsResponse; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A4EB8B1C-1DEC-5E18-BCD0-XXXXXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The operation performed on the alert event.</p>
         */
        public Builder securityEventOperationsResponse(java.util.List<SecurityEventOperationsResponse> securityEventOperationsResponse) {
            this.securityEventOperationsResponse = securityEventOperationsResponse;
            return this;
        }

        public AdvanceSecurityEventOperationsResponseBody build() {
            return new AdvanceSecurityEventOperationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AdvanceSecurityEventOperationsResponseBody} extends {@link TeaModel}
     *
     * <p>AdvanceSecurityEventOperationsResponseBody</p>
     */
    public static class MarkField extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FiledAliasName")
        private String filedAliasName;

        @com.aliyun.core.annotation.NameInMap("FiledName")
        private String filedName;

        @com.aliyun.core.annotation.NameInMap("MarkMisType")
        private String markMisType;

        @com.aliyun.core.annotation.NameInMap("MarkMisValue")
        private String markMisValue;

        @com.aliyun.core.annotation.NameInMap("SupportedMisType")
        private java.util.List<String> supportedMisType;

        private MarkField(Builder builder) {
            this.filedAliasName = builder.filedAliasName;
            this.filedName = builder.filedName;
            this.markMisType = builder.markMisType;
            this.markMisValue = builder.markMisValue;
            this.supportedMisType = builder.supportedMisType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MarkField create() {
            return builder().build();
        }

        /**
         * @return filedAliasName
         */
        public String getFiledAliasName() {
            return this.filedAliasName;
        }

        /**
         * @return filedName
         */
        public String getFiledName() {
            return this.filedName;
        }

        /**
         * @return markMisType
         */
        public String getMarkMisType() {
            return this.markMisType;
        }

        /**
         * @return markMisValue
         */
        public String getMarkMisValue() {
            return this.markMisValue;
        }

        /**
         * @return supportedMisType
         */
        public java.util.List<String> getSupportedMisType() {
            return this.supportedMisType;
        }

        public static final class Builder {
            private String filedAliasName; 
            private String filedName; 
            private String markMisType; 
            private String markMisValue; 
            private java.util.List<String> supportedMisType; 

            /**
             * <p>The alias of the field that is used in the whitelist rule.</p>
             * 
             * <strong>example:</strong>
             * <p>file path</p>
             */
            public Builder filedAliasName(String filedAliasName) {
                this.filedAliasName = filedAliasName;
                return this;
            }

            /**
             * <p>The field that is used in the whitelist rule.</p>
             * 
             * <strong>example:</strong>
             * <p>filePath</p>
             */
            public Builder filedName(String filedName) {
                this.filedName = filedName;
                return this;
            }

            /**
             * <p>The operation that is used in the whitelist rule. Valid values:</p>
             * <ul>
             * <li><strong>contains</strong>: contains</li>
             * <li><strong>notContains</strong>: does not contain</li>
             * <li><strong>regex</strong>: regular expression</li>
             * <li><strong>strEqual</strong>: equals</li>
             * <li><strong>strNotEqual</strong>: does not equal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>contains</p>
             */
            public Builder markMisType(String markMisType) {
                this.markMisType = markMisType;
                return this;
            }

            /**
             * <p>The value of the field that is used in the whitelist rule.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-25 10:11:04</p>
             */
            public Builder markMisValue(String markMisValue) {
                this.markMisValue = markMisValue;
                return this;
            }

            /**
             * <p>The operation that is used and can be modified in the whitelist rule. Valid values:</p>
             * <ul>
             * <li><strong>contains</strong>: contains</li>
             * <li><strong>notContains</strong>: does not contain</li>
             * <li><strong>regex</strong>: regular expression</li>
             * <li><strong>strEqual</strong>: equals</li>
             * <li><strong>strNotEqual</strong>: does not equal</li>
             * </ul>
             */
            public Builder supportedMisType(java.util.List<String> supportedMisType) {
                this.supportedMisType = supportedMisType;
                return this;
            }

            public MarkField build() {
                return new MarkField(this);
            } 

        } 

    }
    /**
     * 
     * {@link AdvanceSecurityEventOperationsResponseBody} extends {@link TeaModel}
     *
     * <p>AdvanceSecurityEventOperationsResponseBody</p>
     */
    public static class MarkFieldsSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FiledAliasName")
        private String filedAliasName;

        @com.aliyun.core.annotation.NameInMap("FiledName")
        private String filedName;

        @com.aliyun.core.annotation.NameInMap("MarkMisValue")
        private String markMisValue;

        @com.aliyun.core.annotation.NameInMap("SupportedMisType")
        private java.util.List<String> supportedMisType;

        private MarkFieldsSource(Builder builder) {
            this.filedAliasName = builder.filedAliasName;
            this.filedName = builder.filedName;
            this.markMisValue = builder.markMisValue;
            this.supportedMisType = builder.supportedMisType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MarkFieldsSource create() {
            return builder().build();
        }

        /**
         * @return filedAliasName
         */
        public String getFiledAliasName() {
            return this.filedAliasName;
        }

        /**
         * @return filedName
         */
        public String getFiledName() {
            return this.filedName;
        }

        /**
         * @return markMisValue
         */
        public String getMarkMisValue() {
            return this.markMisValue;
        }

        /**
         * @return supportedMisType
         */
        public java.util.List<String> getSupportedMisType() {
            return this.supportedMisType;
        }

        public static final class Builder {
            private String filedAliasName; 
            private String filedName; 
            private String markMisValue; 
            private java.util.List<String> supportedMisType; 

            /**
             * <p>The alias of the field that can be used in the whitelist rule.</p>
             * 
             * <strong>example:</strong>
             * <p>file path</p>
             */
            public Builder filedAliasName(String filedAliasName) {
                this.filedAliasName = filedAliasName;
                return this;
            }

            /**
             * <p>The field that can be used in the whitelist rule.</p>
             * 
             * <strong>example:</strong>
             * <p>filePath</p>
             */
            public Builder filedName(String filedName) {
                this.filedName = filedName;
                return this;
            }

            /**
             * <p>The value of the field that can be used in the whitelist rule.</p>
             * 
             * <strong>example:</strong>
             * <p>contains</p>
             */
            public Builder markMisValue(String markMisValue) {
                this.markMisValue = markMisValue;
                return this;
            }

            /**
             * <p>The operation that is supported in the whitelist rule. Valid values:</p>
             * <ul>
             * <li><strong>contains</strong>: contains</li>
             * <li><strong>notContains</strong>: does not contain</li>
             * <li><strong>regex</strong>: regular expression</li>
             * <li><strong>strEqual</strong>: equals</li>
             * <li><strong>strNotEqual</strong>: does not equal</li>
             * </ul>
             */
            public Builder supportedMisType(java.util.List<String> supportedMisType) {
                this.supportedMisType = supportedMisType;
                return this;
            }

            public MarkFieldsSource build() {
                return new MarkFieldsSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link AdvanceSecurityEventOperationsResponseBody} extends {@link TeaModel}
     *
     * <p>AdvanceSecurityEventOperationsResponseBody</p>
     */
    public static class SecurityEventOperationsResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MarkField")
        private java.util.List<MarkField> markField;

        @com.aliyun.core.annotation.NameInMap("MarkFieldsSource")
        private java.util.List<MarkFieldsSource> markFieldsSource;

        @com.aliyun.core.annotation.NameInMap("OperationCode")
        private String operationCode;

        @com.aliyun.core.annotation.NameInMap("OperationParams")
        private String operationParams;

        @com.aliyun.core.annotation.NameInMap("UserCanOperate")
        private Boolean userCanOperate;

        private SecurityEventOperationsResponse(Builder builder) {
            this.markField = builder.markField;
            this.markFieldsSource = builder.markFieldsSource;
            this.operationCode = builder.operationCode;
            this.operationParams = builder.operationParams;
            this.userCanOperate = builder.userCanOperate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityEventOperationsResponse create() {
            return builder().build();
        }

        /**
         * @return markField
         */
        public java.util.List<MarkField> getMarkField() {
            return this.markField;
        }

        /**
         * @return markFieldsSource
         */
        public java.util.List<MarkFieldsSource> getMarkFieldsSource() {
            return this.markFieldsSource;
        }

        /**
         * @return operationCode
         */
        public String getOperationCode() {
            return this.operationCode;
        }

        /**
         * @return operationParams
         */
        public String getOperationParams() {
            return this.operationParams;
        }

        /**
         * @return userCanOperate
         */
        public Boolean getUserCanOperate() {
            return this.userCanOperate;
        }

        public static final class Builder {
            private java.util.List<MarkField> markField; 
            private java.util.List<MarkFieldsSource> markFieldsSource; 
            private String operationCode; 
            private String operationParams; 
            private Boolean userCanOperate; 

            /**
             * <p>The object on which the operation is performed. This parameter is required when you set the OperationCode parameter to <strong>advance_mark_mis_info</strong>.</p>
             */
            public Builder markField(java.util.List<MarkField> markField) {
                this.markField = markField;
                return this;
            }

            /**
             * <p>The metadata configuration returned by the advanced whitelist rule.</p>
             */
            public Builder markFieldsSource(java.util.List<MarkFieldsSource> markFieldsSource) {
                this.markFieldsSource = markFieldsSource;
                return this;
            }

            /**
             * <p>The operation performed to handle the alert. Valid values:</p>
             * <ul>
             * <li><strong>block_ip</strong>: blocks the alert.</li>
             * <li><strong>advance_mark_mis_info</strong>: adds the alert to the whitelist.</li>
             * <li><strong>ignore</strong>: ignores the alert.</li>
             * <li><strong>manual_handled</strong>: marks the alert as manually handled.</li>
             * <li><strong>kill_process</strong>: terminates the malicious process.</li>
             * <li><strong>cleanup</strong>: performs in-depth virus detection and removal.</li>
             * <li><strong>kill_and_quara</strong>: performs virus detection and removal.</li>
             * <li><strong>disable_malicious_defense</strong>: turns off malicious defense behavior.</li>
             * <li><strong>client_problem_check</strong>: performs troubleshooting.</li>
             * <li><strong>quara</strong>: performs quarantine operations.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>advance_mark_mis_info</p>
             */
            public Builder operationCode(String operationCode) {
                this.operationCode = operationCode;
                return this;
            }

            /**
             * <p>The configuration of the operation performed to handle the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;subOperation&quot;:&quot;killByMd5andPath&quot;}</p>
             */
            public Builder operationParams(String operationParams) {
                this.operationParams = operationParams;
                return this;
            }

            /**
             * <p>Indicates whether the operation can be performed.</p>
             * <ul>
             * <li><strong>true</strong>: The operation can be performed.</li>
             * <li><strong>false</strong>: The operation cannot be performed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder userCanOperate(Boolean userCanOperate) {
                this.userCanOperate = userCanOperate;
                return this;
            }

            public SecurityEventOperationsResponse build() {
                return new SecurityEventOperationsResponse(this);
            } 

        } 

    }
}
