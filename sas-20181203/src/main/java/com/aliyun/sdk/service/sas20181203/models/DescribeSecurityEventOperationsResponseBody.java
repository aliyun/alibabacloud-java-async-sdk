// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityEventOperationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityEventOperationsResponseBody</p>
 */
public class DescribeSecurityEventOperationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityEventOperationsResponse")
    private java.util.List < SecurityEventOperationsResponse> securityEventOperationsResponse;

    private DescribeSecurityEventOperationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityEventOperationsResponse = builder.securityEventOperationsResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityEventOperationsResponseBody create() {
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
    public java.util.List < SecurityEventOperationsResponse> getSecurityEventOperationsResponse() {
        return this.securityEventOperationsResponse;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SecurityEventOperationsResponse> securityEventOperationsResponse; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array consisting of the operations that you can perform to handle the alert event.
         */
        public Builder securityEventOperationsResponse(java.util.List < SecurityEventOperationsResponse> securityEventOperationsResponse) {
            this.securityEventOperationsResponse = securityEventOperationsResponse;
            return this;
        }

        public DescribeSecurityEventOperationsResponseBody build() {
            return new DescribeSecurityEventOperationsResponseBody(this);
        } 

    } 

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
        private java.util.List < String > supportedMisType;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private MarkField(Builder builder) {
            this.filedAliasName = builder.filedAliasName;
            this.filedName = builder.filedName;
            this.markMisType = builder.markMisType;
            this.markMisValue = builder.markMisValue;
            this.supportedMisType = builder.supportedMisType;
            this.uuid = builder.uuid;
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
        public java.util.List < String > getSupportedMisType() {
            return this.supportedMisType;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String filedAliasName; 
            private String filedName; 
            private String markMisType; 
            private String markMisValue; 
            private java.util.List < String > supportedMisType; 
            private String uuid; 

            /**
             * The alias of the field that is used in the whitelist rule.
             */
            public Builder filedAliasName(String filedAliasName) {
                this.filedAliasName = filedAliasName;
                return this;
            }

            /**
             * The field that is used in the whitelist rule.
             */
            public Builder filedName(String filedName) {
                this.filedName = filedName;
                return this;
            }

            /**
             * The operation that is used in the whitelist rule. Valid values:
             * <p>
             * 
             * *   **contains**: contains
             * *   **notContains**: does not contain
             * *   **regex**: regular expression
             * *   **strEqual**: equals
             * *   **strNotEqual**: does not equal
             */
            public Builder markMisType(String markMisType) {
                this.markMisType = markMisType;
                return this;
            }

            /**
             * The value of the field that is used in the whitelist rule.
             */
            public Builder markMisValue(String markMisValue) {
                this.markMisValue = markMisValue;
                return this;
            }

            /**
             * An array consisting of the operations that are supported by the method to add the alert event to the whitelist.
             */
            public Builder supportedMisType(java.util.List < String > supportedMisType) {
                this.supportedMisType = supportedMisType;
                return this;
            }

            /**
             * The UUID of the server on which the alert event is detected.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public MarkField build() {
                return new MarkField(this);
            } 

        } 

    }
    public static class MarkFieldsSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FiledAliasName")
        private String filedAliasName;

        @com.aliyun.core.annotation.NameInMap("FiledName")
        private String filedName;

        @com.aliyun.core.annotation.NameInMap("MarkMisValue")
        private String markMisValue;

        @com.aliyun.core.annotation.NameInMap("SupportedMisType")
        private java.util.List < String > supportedMisType;

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
        public java.util.List < String > getSupportedMisType() {
            return this.supportedMisType;
        }

        public static final class Builder {
            private String filedAliasName; 
            private String filedName; 
            private String markMisValue; 
            private java.util.List < String > supportedMisType; 

            /**
             * The alias of the field that can be used in the whitelist rule.
             */
            public Builder filedAliasName(String filedAliasName) {
                this.filedAliasName = filedAliasName;
                return this;
            }

            /**
             * The field that can be used in the whitelist rule.
             */
            public Builder filedName(String filedName) {
                this.filedName = filedName;
                return this;
            }

            /**
             * The value of the field that can be used in the whitelist rule.
             */
            public Builder markMisValue(String markMisValue) {
                this.markMisValue = markMisValue;
                return this;
            }

            /**
             * An array consisting of the operations that are supported by the method to add the alert event to the whitelist.
             */
            public Builder supportedMisType(java.util.List < String > supportedMisType) {
                this.supportedMisType = supportedMisType;
                return this;
            }

            public MarkFieldsSource build() {
                return new MarkFieldsSource(this);
            } 

        } 

    }
    public static class SecurityEventOperationsResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MarkField")
        private java.util.List < MarkField> markField;

        @com.aliyun.core.annotation.NameInMap("MarkFieldsSource")
        private java.util.List < MarkFieldsSource> markFieldsSource;

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
        public java.util.List < MarkField> getMarkField() {
            return this.markField;
        }

        /**
         * @return markFieldsSource
         */
        public java.util.List < MarkFieldsSource> getMarkFieldsSource() {
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
            private java.util.List < MarkField> markField; 
            private java.util.List < MarkFieldsSource> markFieldsSource; 
            private String operationCode; 
            private String operationParams; 
            private Boolean userCanOperate; 

            /**
             * An array consisting of the configuration information that is used when the value of the OperationCode parameter is **advance\_mark\_mis_info**.
             */
            public Builder markField(java.util.List < MarkField> markField) {
                this.markField = markField;
                return this;
            }

            /**
             * An array consisting of the configuration items that can be used when the value of the OperationCode parameter is advance_mark_mis_info.
             */
            public Builder markFieldsSource(java.util.List < MarkFieldsSource> markFieldsSource) {
                this.markFieldsSource = markFieldsSource;
                return this;
            }

            /**
             * The operation that you can perform to handle the alert. Valid values:
             * <p>
             * 
             * *   **block_ip**: blocks the source IP address.
             * *   **advance\_mark\_mis_info**: adds the alert to the whitelist.
             * *   **ignore**: ignores the alert.
             * *   **manual_handled**: marks the alert as manually handled.
             * *   **kill_process**: terminates the malicious process.
             * *   **cleanup**: performs in-depth virus detection and removal.
             * *   **kill\_and_quara**: terminates the malicious process and quarantines the source file.
             * *   **disable\_malicious_defense**: stops the container on which the alerting files or processes exist.
             * *   **client\_problem_check**: performs troubleshooting.
             * *   **quara**: quarantines the source file of the malicious process.
             */
            public Builder operationCode(String operationCode) {
                this.operationCode = operationCode;
                return this;
            }

            /**
             * The configuration of the operation that you can perform to handle the alert event.
             * <p>
             * 
             * >  If the value of the OperationCode parameter is `kill_and_quara` or `block_ip`, the OperationParams parameter is required. If the value of the OperationCode parameter is a different value, the OperationParams parameter can be left empty.
             */
            public Builder operationParams(String operationParams) {
                this.operationParams = operationParams;
                return this;
            }

            /**
             * Indicates whether you can handle the alert event in the current edition of Security Center. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
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
