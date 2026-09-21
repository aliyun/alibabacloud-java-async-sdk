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
 * {@link GetCheckScopeConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckScopeConfigResponseBody</p>
 */
public class GetCheckScopeConfigResponseBody extends TeaModel {
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

    private GetCheckScopeConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckScopeConfigResponseBody create() {
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

        private Builder(GetCheckScopeConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The result code. A value of <strong>200</strong> indicates success. Any other value indicates failure. You can use this field to determine the cause of the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
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
         * <p>7BC55C8F-226E-5AF5-9A2C-2EC43864****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCheckScopeConfigResponseBody build() {
            return new GetCheckScopeConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCheckScopeConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckScopeConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoConfig")
        private String autoConfig;

        @com.aliyun.core.annotation.NameInMap("AutoType")
        private Integer autoType;

        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private Data(Builder builder) {
            this.autoConfig = builder.autoConfig;
            this.autoType = builder.autoType;
            this.configId = builder.configId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoConfig
         */
        public String getAutoConfig() {
            return this.autoConfig;
        }

        /**
         * @return autoType
         */
        public Integer getAutoType() {
            return this.autoType;
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String autoConfig; 
            private Integer autoType; 
            private String configId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.autoConfig = model.autoConfig;
                this.autoType = model.autoType;
                this.configId = model.configId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.type = model.type;
            } 

            /**
             * <p>The automatic scan configuration as a JSON string. The fields are described as follows:</p>
             * <ul>
             * <li><strong>autoInclude</strong>: specifies whether to enable automatic scan. Valid values: <strong>true</strong>: enabled. <strong>false</strong>: disabled.</li>
             * <li><strong>autoRule</strong>: the enablement configuration.</li>
             * <li><strong>ruleOperator</strong>: the enablement configuration rule. The value is <strong>include</strong>.</li>
             * <li><strong>operator</strong>: the logical operator. The value is <strong>or</strong>.</li>
             * <li><strong>rule</strong>: the rule.</li>
             * <li><strong>condition</strong>: the rule condition. Valid values: <strong>vendor</strong>: vendor. <strong>assetType</strong>: level-1 asset type. <strong>assetSubType</strong>: level-2 asset type.<blockquote>
             * <p>For specific meanings, refer to the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>&quot;{\&quot;autoInclude\&quot;:true,\&quot;autoRule\&quot;:{\&quot;ruleOperator\&quot;:\&quot;include\&quot;,\&quot;operator\&quot;:\&quot;or\&quot;,\&quot;rule\&quot;:[{\&quot;condition\&quot;:\&quot;assetSubType\&quot;,\&quot;ruleOperator\&quot;:\&quot;include\&quot;,\&quot;value\&quot;:[{\&quot;vendor\&quot;:\&quot;0\&quot;,\&quot;assetType\&quot;:\&quot;0\&quot;,\&quot;assetSubType\&quot;:\&quot;100\&quot;}]}]}}&quot;</p>
             */
            public Builder autoConfig(String autoConfig) {
                this.autoConfig = autoConfig;
                return this;
            }

            /**
             * <p>The automatic scan configuration type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Automatic scan is disabled.</li>
             * <li><strong>1</strong>: Automatically scan newly added cloud assets.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoType(Integer autoType) {
                this.autoType = autoType;
                return this;
            }

            /**
             * <p>The ID of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>97a1fed216908e417407344e1505xxxx</p>
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-16 18:17:16</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-09 10:19:57</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The scan scope configuration type. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: scan by instance.</li>
             * <li><strong>3</strong>: scan all.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
