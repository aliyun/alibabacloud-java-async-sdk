// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link DescribeInstanceConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceConfigsResponseBody</p>
 */
public class DescribeInstanceConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeInstanceConfigsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeInstanceConfigsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The details of the access denied error.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParams</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid params: [instance not exists].</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP request status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32A44F0D-BFF6-5664-999A-218BBDE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of query results.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeInstanceConfigsResponseBody build() {
            return new DescribeInstanceConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceConfigsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowModify")
        private String allowModify;

        @com.aliyun.core.annotation.NameInMap("ConfigKey")
        private String configKey;

        @com.aliyun.core.annotation.NameInMap("ConfigType")
        private String configType;

        @com.aliyun.core.annotation.NameInMap("ConfigValue")
        private String configValue;

        @com.aliyun.core.annotation.NameInMap("Custom")
        private Boolean custom;

        @com.aliyun.core.annotation.NameInMap("DefaultNodeGroup")
        private Boolean defaultNodeGroup;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DescriptionEn")
        private String descriptionEn;

        @com.aliyun.core.annotation.NameInMap("NodeGroupId")
        private String nodeGroupId;

        @com.aliyun.core.annotation.NameInMap("NodeGroupName")
        private String nodeGroupName;

        @com.aliyun.core.annotation.NameInMap("Restart")
        private Boolean restart;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("ValueRange")
        private String valueRange;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        private String valueType;

        private Data(Builder builder) {
            this.allowModify = builder.allowModify;
            this.configKey = builder.configKey;
            this.configType = builder.configType;
            this.configValue = builder.configValue;
            this.custom = builder.custom;
            this.defaultNodeGroup = builder.defaultNodeGroup;
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.descriptionEn = builder.descriptionEn;
            this.nodeGroupId = builder.nodeGroupId;
            this.nodeGroupName = builder.nodeGroupName;
            this.restart = builder.restart;
            this.unit = builder.unit;
            this.valueRange = builder.valueRange;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allowModify
         */
        public String getAllowModify() {
            return this.allowModify;
        }

        /**
         * @return configKey
         */
        public String getConfigKey() {
            return this.configKey;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return configValue
         */
        public String getConfigValue() {
            return this.configValue;
        }

        /**
         * @return custom
         */
        public Boolean getCustom() {
            return this.custom;
        }

        /**
         * @return defaultNodeGroup
         */
        public Boolean getDefaultNodeGroup() {
            return this.defaultNodeGroup;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return descriptionEn
         */
        public String getDescriptionEn() {
            return this.descriptionEn;
        }

        /**
         * @return nodeGroupId
         */
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        /**
         * @return nodeGroupName
         */
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        /**
         * @return restart
         */
        public Boolean getRestart() {
            return this.restart;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return valueRange
         */
        public String getValueRange() {
            return this.valueRange;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String allowModify; 
            private String configKey; 
            private String configType; 
            private String configValue; 
            private Boolean custom; 
            private Boolean defaultNodeGroup; 
            private String defaultValue; 
            private String description; 
            private String descriptionEn; 
            private String nodeGroupId; 
            private String nodeGroupName; 
            private Boolean restart; 
            private String unit; 
            private String valueRange; 
            private String valueType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.allowModify = model.allowModify;
                this.configKey = model.configKey;
                this.configType = model.configType;
                this.configValue = model.configValue;
                this.custom = model.custom;
                this.defaultNodeGroup = model.defaultNodeGroup;
                this.defaultValue = model.defaultValue;
                this.description = model.description;
                this.descriptionEn = model.descriptionEn;
                this.nodeGroupId = model.nodeGroupId;
                this.nodeGroupName = model.nodeGroupName;
                this.restart = model.restart;
                this.unit = model.unit;
                this.valueRange = model.valueRange;
                this.valueType = model.valueType;
            } 

            /**
             * <p>Indicates whether the configuration item can be modified.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowModify(String allowModify) {
                this.allowModify = allowModify;
                return this;
            }

            /**
             * <p>The key of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>enable_udf</p>
             */
            public Builder configKey(String configKey) {
                this.configKey = configKey;
                return this;
            }

            /**
             * <p>The type of the configuration item. Valid values:</p>
             * <ul>
             * <li><p>FE</p>
             * </li>
             * <li><p>BE</p>
             * </li>
             * <li><p>CORE</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FE</p>
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * <p>The value of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
                return this;
            }

            /**
             * <p>Indicates whether the item is a custom configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder custom(Boolean custom) {
                this.custom = custom;
                return this;
            }

            /**
             * <p>Indicates whether it is the default compute group.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder defaultNodeGroup(Boolean defaultNodeGroup) {
                this.defaultNodeGroup = defaultNodeGroup;
                return this;
            }

            /**
             * <p>The default value of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The description of the configuration item\&quot;s feature.</p>
             * 
             * <strong>example:</strong>
             * <p>Whether to enable UDF.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The English description of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>A boolean value to control whether to enable the synchronization of the tablet metadata. true indicates enabling synchronization, and false indicates disabling it.</p>
             */
            public Builder descriptionEn(String descriptionEn) {
                this.descriptionEn = descriptionEn;
                return this;
            }

            /**
             * <p>The compute group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ng-3d5ce6454354****</p>
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * <p>The name of the compute group.</p>
             * 
             * <strong>example:</strong>
             * <p>ng_1</p>
             */
            public Builder nodeGroupName(String nodeGroupName) {
                this.nodeGroupName = nodeGroupName;
                return this;
            }

            /**
             * <p>Indicates whether the instance needs to be restarted after the configuration item is changed. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Restart.</p>
             * </li>
             * <li><p><strong>false</strong>: Do not restart.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder restart(Boolean restart) {
                this.restart = restart;
                return this;
            }

            /**
             * <p>The unit of the configuration item. An empty string is returned if no unit is available.</p>
             * 
             * <strong>example:</strong>
             * <p>s</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value range of the configuration item. An empty string is returned if no value range is available.</p>
             * 
             * <strong>example:</strong>
             * <p>true,false</p>
             */
            public Builder valueRange(String valueRange) {
                this.valueRange = valueRange;
                return this;
            }

            /**
             * <p>The data type of the configuration item\&quot;s value.</p>
             * 
             * <strong>example:</strong>
             * <p>INT</p>
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
