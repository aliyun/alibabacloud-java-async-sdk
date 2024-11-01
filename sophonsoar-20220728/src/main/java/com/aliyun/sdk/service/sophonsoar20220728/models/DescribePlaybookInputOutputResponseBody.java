// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePlaybookInputOutputResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlaybookInputOutputResponseBody</p>
 */
public class DescribePlaybookInputOutputResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private Config config;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePlaybookInputOutputResponseBody(Builder builder) {
        this.config = builder.config;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlaybookInputOutputResponseBody create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Config config; 
        private String requestId; 

        /**
         * <p>The configurations.</p>
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>688B4CCD-5272-5DCF-9D76-FE5EFEF545F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePlaybookInputOutputResponseBody build() {
            return new DescribePlaybookInputOutputResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePlaybookInputOutputResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlaybookInputOutputResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExeConfig")
        private String exeConfig;

        @com.aliyun.core.annotation.NameInMap("InputParams")
        private String inputParams;

        @com.aliyun.core.annotation.NameInMap("OutputParams")
        private String outputParams;

        @com.aliyun.core.annotation.NameInMap("ParamType")
        private String paramType;

        @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
        private String playbookUuid;

        private Config(Builder builder) {
            this.exeConfig = builder.exeConfig;
            this.inputParams = builder.inputParams;
            this.outputParams = builder.outputParams;
            this.paramType = builder.paramType;
            this.playbookUuid = builder.playbookUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return exeConfig
         */
        public String getExeConfig() {
            return this.exeConfig;
        }

        /**
         * @return inputParams
         */
        public String getInputParams() {
            return this.inputParams;
        }

        /**
         * @return outputParams
         */
        public String getOutputParams() {
            return this.outputParams;
        }

        /**
         * @return paramType
         */
        public String getParamType() {
            return this.paramType;
        }

        /**
         * @return playbookUuid
         */
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

        public static final class Builder {
            private String exeConfig; 
            private String inputParams; 
            private String outputParams; 
            private String paramType; 
            private String playbookUuid; 

            /**
             * <p>The execution method of the playbook is in JSONObject format.</p>
             */
            public Builder exeConfig(String exeConfig) {
                this.exeConfig = exeConfig;
                return this;
            }

            /**
             * <p>The input parameter configuration of the playbook. The value is a JSON array.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;typeName&quot;: &quot;String&quot;,
             *         &quot;dataClass&quot;: &quot;normal&quot;,
             *         &quot;dataType&quot;: &quot;String&quot;,
             *         &quot;description&quot;: &quot;period&quot;,
             *         &quot;example&quot;: &quot;&quot;,
             *         &quot;name&quot;: &quot;period&quot;,
             *         &quot;required&quot;: false
             *     }
             * ]</p>
             */
            public Builder inputParams(String inputParams) {
                this.inputParams = inputParams;
                return this;
            }

            /**
             * <p>The output parameter configuration. This parameter is unavailable and is always left empty.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder outputParams(String outputParams) {
                this.outputParams = outputParams;
                return this;
            }

            /**
             * <p>The input parameter type of the playbook. Valid values:</p>
             * <ul>
             * <li><strong>template-ip</strong></li>
             * <li><strong>template-file</strong></li>
             * <li><strong>template-process</strong></li>
             * <li><strong>custom</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * <p>The UUID of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>9030076b-6733-4842-b05a-xxxxxx</p>
             */
            public Builder playbookUuid(String playbookUuid) {
                this.playbookUuid = playbookUuid;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
