// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataSourceParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataSourceParametersResponseBody</p>
 */
public class DescribeDataSourceParametersResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDataSourceParametersResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataSourceParametersResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDataSourceParametersResponseBody build() {
            return new DescribeDataSourceParametersResponseBody(this);
        } 

    } 

    public static class ParamValue extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Value")
        private String value;

        private ParamValue(Builder builder) {
            this.label = builder.label;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamValue create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String label; 
            private String value; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ParamValue build() {
                return new ParamValue(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CanEditted")
        private Integer canEditted;

        @NameInMap("CloudCode")
        private String cloudCode;

        @NameInMap("DataSourceType")
        private String dataSourceType;

        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("Disabled")
        private Boolean disabled;

        @NameInMap("FormatCheck")
        private String formatCheck;

        @NameInMap("Hit")
        private String hit;

        @NameInMap("ParaCode")
        private String paraCode;

        @NameInMap("ParaLevel")
        private Integer paraLevel;

        @NameInMap("ParaName")
        private String paraName;

        @NameInMap("ParaType")
        private String paraType;

        @NameInMap("ParamValue")
        private java.util.List < ParamValue> paramValue;

        @NameInMap("Required")
        private Integer required;

        @NameInMap("Title")
        private String title;

        private Data(Builder builder) {
            this.canEditted = builder.canEditted;
            this.cloudCode = builder.cloudCode;
            this.dataSourceType = builder.dataSourceType;
            this.defaultValue = builder.defaultValue;
            this.disabled = builder.disabled;
            this.formatCheck = builder.formatCheck;
            this.hit = builder.hit;
            this.paraCode = builder.paraCode;
            this.paraLevel = builder.paraLevel;
            this.paraName = builder.paraName;
            this.paraType = builder.paraType;
            this.paramValue = builder.paramValue;
            this.required = builder.required;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return canEditted
         */
        public Integer getCanEditted() {
            return this.canEditted;
        }

        /**
         * @return cloudCode
         */
        public String getCloudCode() {
            return this.cloudCode;
        }

        /**
         * @return dataSourceType
         */
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return formatCheck
         */
        public String getFormatCheck() {
            return this.formatCheck;
        }

        /**
         * @return hit
         */
        public String getHit() {
            return this.hit;
        }

        /**
         * @return paraCode
         */
        public String getParaCode() {
            return this.paraCode;
        }

        /**
         * @return paraLevel
         */
        public Integer getParaLevel() {
            return this.paraLevel;
        }

        /**
         * @return paraName
         */
        public String getParaName() {
            return this.paraName;
        }

        /**
         * @return paraType
         */
        public String getParaType() {
            return this.paraType;
        }

        /**
         * @return paramValue
         */
        public java.util.List < ParamValue> getParamValue() {
            return this.paramValue;
        }

        /**
         * @return required
         */
        public Integer getRequired() {
            return this.required;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Integer canEditted; 
            private String cloudCode; 
            private String dataSourceType; 
            private String defaultValue; 
            private Boolean disabled; 
            private String formatCheck; 
            private String hit; 
            private String paraCode; 
            private Integer paraLevel; 
            private String paraName; 
            private String paraType; 
            private java.util.List < ParamValue> paramValue; 
            private Integer required; 
            private String title; 

            /**
             * CanEditted.
             */
            public Builder canEditted(Integer canEditted) {
                this.canEditted = canEditted;
                return this;
            }

            /**
             * CloudCode.
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * DataSourceType.
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Disabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * FormatCheck.
             */
            public Builder formatCheck(String formatCheck) {
                this.formatCheck = formatCheck;
                return this;
            }

            /**
             * Hit.
             */
            public Builder hit(String hit) {
                this.hit = hit;
                return this;
            }

            /**
             * ParaCode.
             */
            public Builder paraCode(String paraCode) {
                this.paraCode = paraCode;
                return this;
            }

            /**
             * ParaLevel.
             */
            public Builder paraLevel(Integer paraLevel) {
                this.paraLevel = paraLevel;
                return this;
            }

            /**
             * ParaName.
             */
            public Builder paraName(String paraName) {
                this.paraName = paraName;
                return this;
            }

            /**
             * ParaType.
             */
            public Builder paraType(String paraType) {
                this.paraType = paraType;
                return this;
            }

            /**
             * ParamValue.
             */
            public Builder paramValue(java.util.List < ParamValue> paramValue) {
                this.paramValue = paramValue;
                return this;
            }

            /**
             * Required.
             */
            public Builder required(Integer required) {
                this.required = required;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
