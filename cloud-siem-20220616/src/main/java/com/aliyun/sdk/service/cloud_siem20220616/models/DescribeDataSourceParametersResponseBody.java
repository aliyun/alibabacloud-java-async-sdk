// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link DescribeDataSourceParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataSourceParametersResponseBody</p>
 */
public class DescribeDataSourceParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDataSourceParametersResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDataSourceParametersResponseBody build() {
            return new DescribeDataSourceParametersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataSourceParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataSourceParametersResponseBody</p>
     */
    public static class ParamValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(ParamValue model) {
                this.label = model.label;
                this.value = model.value;
            } 

            /**
             * <p>The displayed content.</p>
             * 
             * <strong>example:</strong>
             * <p>guangzhou</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The actual value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-guangzhou</p>
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
    /**
     * 
     * {@link DescribeDataSourceParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataSourceParametersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanEditted")
        private Integer canEditted;

        @com.aliyun.core.annotation.NameInMap("CloudCode")
        private String cloudCode;

        @com.aliyun.core.annotation.NameInMap("DataSourceType")
        private String dataSourceType;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("FormatCheck")
        private String formatCheck;

        @com.aliyun.core.annotation.NameInMap("Hit")
        private String hit;

        @com.aliyun.core.annotation.NameInMap("ParaCode")
        private String paraCode;

        @com.aliyun.core.annotation.NameInMap("ParaLevel")
        private Integer paraLevel;

        @com.aliyun.core.annotation.NameInMap("ParaName")
        private String paraName;

        @com.aliyun.core.annotation.NameInMap("ParaType")
        private String paraType;

        @com.aliyun.core.annotation.NameInMap("ParamValue")
        private java.util.List<ParamValue> paramValue;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Integer required;

        @com.aliyun.core.annotation.NameInMap("Title")
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
        public java.util.List<ParamValue> getParamValue() {
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
            private java.util.List<ParamValue> paramValue; 
            private Integer required; 
            private String title; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.canEditted = model.canEditted;
                this.cloudCode = model.cloudCode;
                this.dataSourceType = model.dataSourceType;
                this.defaultValue = model.defaultValue;
                this.disabled = model.disabled;
                this.formatCheck = model.formatCheck;
                this.hit = model.hit;
                this.paraCode = model.paraCode;
                this.paraLevel = model.paraLevel;
                this.paraName = model.paraName;
                this.paraType = model.paraType;
                this.paramValue = model.paramValue;
                this.required = model.required;
                this.title = model.title;
            } 

            /**
             * <p>Indicates whether the parameter is editable. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: The parameter cannot be modified.</p>
             * </li>
             * <li><p><strong>1</strong>: The parameter can be modified.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>wafApi</p>
             */
            public Builder canEditted(Integer canEditted) {
                this.canEditted = canEditted;
                return this;
            }

            /**
             * <p>The code for the multicloud environment. Valid values:</p>
             * <ul>
             * <li><p><strong>qcloud</strong>: Tencent Cloud.</p>
             * </li>
             * <li><p><strong>aliyun</strong>: Alibaba Cloud.</p>
             * </li>
             * <li><p><strong>hcloud</strong>: Huawei Cloud.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>hcloud</p>
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li><p><strong>obs</strong>: Huawei Cloud OBS.</p>
             * </li>
             * <li><p><strong>wafApi</strong>: Tencent Cloud WAF download API.</p>
             * </li>
             * <li><p><strong>ckafka</strong>: Tencent Cloud CKafka.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>obs</p>
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * <p>The default value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>wafApi</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>Indicates whether the parameter can be modified. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: The parameter cannot be modified.</p>
             * </li>
             * <li><p><strong>false</strong>: The parameter can be modified.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>wafApi</p>
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>The format check method.</p>
             * 
             * <strong>example:</strong>
             * <p>email</p>
             */
            public Builder formatCheck(String formatCheck) {
                this.formatCheck = formatCheck;
                return this;
            }

            /**
             * <p>Additional information.</p>
             * 
             * <strong>example:</strong>
             * <p>obs docment</p>
             */
            public Builder hit(String hit) {
                this.hit = hit;
                return this;
            }

            /**
             * <p>The code of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>region_code</p>
             */
            public Builder paraCode(String paraCode) {
                this.paraCode = paraCode;
                return this;
            }

            /**
             * <p>The level of the parameter. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: data source parameter.</p>
             * </li>
             * <li><p><strong>2</strong>: log parameter.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder paraLevel(Integer paraLevel) {
                this.paraLevel = paraLevel;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>region local</p>
             */
            public Builder paraName(String paraName) {
                this.paraName = paraName;
                return this;
            }

            /**
             * <p>The type of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder paraType(String paraType) {
                this.paraType = paraType;
                return this;
            }

            /**
             * <p>The list of parameters.</p>
             */
            public Builder paramValue(java.util.List<ParamValue> paramValue) {
                this.paramValue = paramValue;
                return this;
            }

            /**
             * <p>Indicates whether the parameter is required. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: The parameter is required.</p>
             * </li>
             * <li><p><strong>0</strong>: The parameter is optional.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder required(Integer required) {
                this.required = required;
                return this;
            }

            /**
             * <p>The prompt for the parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>obs bucket name</p>
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
