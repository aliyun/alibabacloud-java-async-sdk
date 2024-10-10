// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>B7A2000F-497E-5DA0-B14D-615CD410DD7E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array consisting of the operations that you can perform to handle the alert event.</p>
         */
        public Builder securityEventOperationsResponse(java.util.List < SecurityEventOperationsResponse> securityEventOperationsResponse) {
            this.securityEventOperationsResponse = securityEventOperationsResponse;
            return this;
        }

        public DescribeSecurityEventOperationsResponseBody build() {
            return new DescribeSecurityEventOperationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityEventOperationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventOperationsResponseBody</p>
     */
    public static class MappingMarkFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FillType")
        private String fillType;

        @com.aliyun.core.annotation.NameInMap("MaxLength")
        private Integer maxLength;

        @com.aliyun.core.annotation.NameInMap("MinLength")
        private Integer minLength;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("ShowValue")
        private String showValue;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private MappingMarkFields(Builder builder) {
            this.description = builder.description;
            this.fillType = builder.fillType;
            this.maxLength = builder.maxLength;
            this.minLength = builder.minLength;
            this.name = builder.name;
            this.required = builder.required;
            this.showName = builder.showName;
            this.showValue = builder.showValue;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MappingMarkFields create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fillType
         */
        public String getFillType() {
            return this.fillType;
        }

        /**
         * @return maxLength
         */
        public Integer getMaxLength() {
            return this.maxLength;
        }

        /**
         * @return minLength
         */
        public Integer getMinLength() {
            return this.minLength;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return showValue
         */
        public String getShowValue() {
            return this.showValue;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String fillType; 
            private Integer maxLength; 
            private Integer minLength; 
            private String name; 
            private Boolean required; 
            private String showName; 
            private String showValue; 
            private String value; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FillType.
             */
            public Builder fillType(String fillType) {
                this.fillType = fillType;
                return this;
            }

            /**
             * MaxLength.
             */
            public Builder maxLength(Integer maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * MinLength.
             */
            public Builder minLength(Integer minLength) {
                this.minLength = minLength;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * ShowName.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * ShowValue.
             */
            public Builder showValue(String showValue) {
                this.showValue = showValue;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MappingMarkFields build() {
                return new MappingMarkFields(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityEventOperationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventOperationsResponseBody</p>
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
             * <p>gmtModified</p>
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
             * <p>An array consisting of the operations that are supported by the method to add the alert event to the whitelist.</p>
             */
            public Builder supportedMisType(java.util.List < String > supportedMisType) {
                this.supportedMisType = supportedMisType;
                return this;
            }

            /**
             * <p>The UUID of the server on which the alert event is detected.</p>
             * 
             * <strong>example:</strong>
             * <p>3d6b4a75-c28f-447b-9142-38f6252c****</p>
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
    /**
     * 
     * {@link DescribeSecurityEventOperationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventOperationsResponseBody</p>
     */
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
             * <p>gmtModified</p>
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
             * <p>An array consisting of the operations that are supported by the method to add the alert event to the whitelist.</p>
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
    /**
     * 
     * {@link DescribeSecurityEventOperationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventOperationsResponseBody</p>
     */
    public static class SecurityEventOperationsResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MappingMarkFields")
        private java.util.List < MappingMarkFields> mappingMarkFields;

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
            this.mappingMarkFields = builder.mappingMarkFields;
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
         * @return mappingMarkFields
         */
        public java.util.List < MappingMarkFields> getMappingMarkFields() {
            return this.mappingMarkFields;
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
            private java.util.List < MappingMarkFields> mappingMarkFields; 
            private java.util.List < MarkField> markField; 
            private java.util.List < MarkFieldsSource> markFieldsSource; 
            private String operationCode; 
            private String operationParams; 
            private Boolean userCanOperate; 

            /**
             * MappingMarkFields.
             */
            public Builder mappingMarkFields(java.util.List < MappingMarkFields> mappingMarkFields) {
                this.mappingMarkFields = mappingMarkFields;
                return this;
            }

            /**
             * <p>An array consisting of the configuration information that is used when the value of the OperationCode parameter is <strong>advance_mark_mis_info</strong>.</p>
             */
            public Builder markField(java.util.List < MarkField> markField) {
                this.markField = markField;
                return this;
            }

            /**
             * <p>An array consisting of the configuration items that can be used when the value of the OperationCode parameter is advance_mark_mis_info.</p>
             */
            public Builder markFieldsSource(java.util.List < MarkFieldsSource> markFieldsSource) {
                this.markFieldsSource = markFieldsSource;
                return this;
            }

            /**
             * <p>The operation that you can perform to handle the alert. Valid values:</p>
             * <ul>
             * <li><strong>block_ip</strong>: blocks the source IP address.</li>
             * <li><strong>advance_mark_mis_info</strong>: adds the alert to the whitelist.</li>
             * <li><strong>ignore</strong>: ignores the alert.</li>
             * <li><strong>manual_handled</strong>: marks the alert as manually handled.</li>
             * <li><strong>kill_process</strong>: terminates the malicious process.</li>
             * <li><strong>cleanup</strong>: performs in-depth virus detection and removal.</li>
             * <li><strong>kill_and_quara</strong>: terminates the malicious process and quarantines the source file.</li>
             * <li><strong>disable_malicious_defense</strong>: stops the container on which the alerting files or processes exist.</li>
             * <li><strong>client_problem_check</strong>: performs troubleshooting.</li>
             * <li><strong>quara</strong>: quarantines the source file of the malicious process.</li>
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
             * <p>The configuration of the operation that you can perform to handle the alert event.</p>
             * <blockquote>
             * <p> If the value of the OperationCode parameter is <code>kill_and_quara</code> or <code>block_ip</code>, the OperationParams parameter is required. If the value of the OperationCode parameter is a different value, the OperationParams parameter can be left empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;expireTime&quot;:1641566807783}</p>
             */
            public Builder operationParams(String operationParams) {
                this.operationParams = operationParams;
                return this;
            }

            /**
             * <p>Indicates whether you can handle the alert event in the current edition of Security Center. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
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
