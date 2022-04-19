// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityEventOperationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityEventOperationsResponseBody</p>
 */
public class DescribeSecurityEventOperationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityEventOperationsResponse")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityEventOperationsResponse.
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
        @NameInMap("FiledAliasName")
        private String filedAliasName;

        @NameInMap("FiledName")
        private String filedName;

        @NameInMap("MarkMisType")
        private String markMisType;

        @NameInMap("MarkMisValue")
        private String markMisValue;

        @NameInMap("SupportedMisType")
        private java.util.List < String > supportedMisType;

        @NameInMap("Uuid")
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
             * FiledAliasName.
             */
            public Builder filedAliasName(String filedAliasName) {
                this.filedAliasName = filedAliasName;
                return this;
            }

            /**
             * FiledName.
             */
            public Builder filedName(String filedName) {
                this.filedName = filedName;
                return this;
            }

            /**
             * MarkMisType.
             */
            public Builder markMisType(String markMisType) {
                this.markMisType = markMisType;
                return this;
            }

            /**
             * MarkMisValue.
             */
            public Builder markMisValue(String markMisValue) {
                this.markMisValue = markMisValue;
                return this;
            }

            /**
             * SupportedMisType.
             */
            public Builder supportedMisType(java.util.List < String > supportedMisType) {
                this.supportedMisType = supportedMisType;
                return this;
            }

            /**
             * 资产uuid
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
        @NameInMap("FiledAliasName")
        private String filedAliasName;

        @NameInMap("FiledName")
        private String filedName;

        @NameInMap("MarkMisValue")
        private String markMisValue;

        @NameInMap("SupportedMisType")
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
             * FiledAliasName.
             */
            public Builder filedAliasName(String filedAliasName) {
                this.filedAliasName = filedAliasName;
                return this;
            }

            /**
             * FiledName.
             */
            public Builder filedName(String filedName) {
                this.filedName = filedName;
                return this;
            }

            /**
             * MarkMisValue.
             */
            public Builder markMisValue(String markMisValue) {
                this.markMisValue = markMisValue;
                return this;
            }

            /**
             * SupportedMisType.
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
        @NameInMap("MarkField")
        private java.util.List < MarkField> markField;

        @NameInMap("MarkFieldsSource")
        private java.util.List < MarkFieldsSource> markFieldsSource;

        @NameInMap("OperationCode")
        private String operationCode;

        @NameInMap("OperationParams")
        private String operationParams;

        @NameInMap("UserCanOperate")
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
             * MarkField.
             */
            public Builder markField(java.util.List < MarkField> markField) {
                this.markField = markField;
                return this;
            }

            /**
             * MarkFieldsSource.
             */
            public Builder markFieldsSource(java.util.List < MarkFieldsSource> markFieldsSource) {
                this.markFieldsSource = markFieldsSource;
                return this;
            }

            /**
             * OperationCode.
             */
            public Builder operationCode(String operationCode) {
                this.operationCode = operationCode;
                return this;
            }

            /**
             * OperationParams.
             */
            public Builder operationParams(String operationParams) {
                this.operationParams = operationParams;
                return this;
            }

            /**
             * UserCanOperate.
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
