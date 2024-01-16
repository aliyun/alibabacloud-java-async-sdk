// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlaybookInputOutputResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlaybookInputOutputResponseBody</p>
 */
public class DescribePlaybookInputOutputResponseBody extends TeaModel {
    @NameInMap("Config")
    private Config config;

    @NameInMap("RequestId")
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
         * The configurations.
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePlaybookInputOutputResponseBody build() {
            return new DescribePlaybookInputOutputResponseBody(this);
        } 

    } 

    public static class Config extends TeaModel {
        @NameInMap("ExeConfig")
        private String exeConfig;

        @NameInMap("InputParams")
        private String inputParams;

        @NameInMap("OutputParams")
        private String outputParams;

        @NameInMap("ParamType")
        private String paramType;

        @NameInMap("PlaybookUuid")
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
             * ExeConfig.
             */
            public Builder exeConfig(String exeConfig) {
                this.exeConfig = exeConfig;
                return this;
            }

            /**
             * The input parameter configuration of the playbook. The value is a JSON array.
             */
            public Builder inputParams(String inputParams) {
                this.inputParams = inputParams;
                return this;
            }

            /**
             * The output parameter configuration. This parameter is unavailable and is always left empty.
             */
            public Builder outputParams(String outputParams) {
                this.outputParams = outputParams;
                return this;
            }

            /**
             * The input parameter type of the playbook. Valid values:
             * <p>
             * 
             * *   **template-ip**
             * *   **template-file**
             * *   **template-process**
             * *   **custom**
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * The UUID of the playbook.
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
