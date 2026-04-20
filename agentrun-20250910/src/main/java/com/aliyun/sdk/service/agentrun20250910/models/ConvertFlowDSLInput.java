// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ConvertFlowDSLInput} extends {@link TeaModel}
 *
 * <p>ConvertFlowDSLInput</p>
 */
public class ConvertFlowDSLInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dslSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private DslSource dslSource;

    @com.aliyun.core.annotation.NameInMap("options")
    private Options options;

    private ConvertFlowDSLInput(Builder builder) {
        this.dslSource = builder.dslSource;
        this.options = builder.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConvertFlowDSLInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dslSource
     */
    public DslSource getDslSource() {
        return this.dslSource;
    }

    /**
     * @return options
     */
    public Options getOptions() {
        return this.options;
    }

    public static final class Builder {
        private DslSource dslSource; 
        private Options options; 

        private Builder() {
        } 

        private Builder(ConvertFlowDSLInput model) {
            this.dslSource = model.dslSource;
            this.options = model.options;
        } 

        /**
         * <p>工作流DSL的来源配置，支持inline和base64两种格式</p>
         * <p>This parameter is required.</p>
         */
        public Builder dslSource(DslSource dslSource) {
            this.dslSource = dslSource;
            return this;
        }

        /**
         * <p>DSL转换的可选配置参数</p>
         */
        public Builder options(Options options) {
            this.options = options;
            return this;
        }

        public ConvertFlowDSLInput build() {
            return new ConvertFlowDSLInput(this);
        } 

    } 

    /**
     * 
     * {@link ConvertFlowDSLInput} extends {@link TeaModel}
     *
     * <p>ConvertFlowDSLInput</p>
     */
    public static class DslSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("encoding")
        private String encoding;

        @com.aliyun.core.annotation.NameInMap("provider")
        @com.aliyun.core.annotation.Validation(required = true)
        private String provider;

        private DslSource(Builder builder) {
            this.content = builder.content;
            this.encoding = builder.encoding;
            this.provider = builder.provider;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DslSource create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        public static final class Builder {
            private String content; 
            private String encoding; 
            private String provider; 

            private Builder() {
            } 

            private Builder(DslSource model) {
                this.content = model.content;
                this.encoding = model.encoding;
                this.provider = model.provider;
            } 

            /**
             * <p>DSL内容，可以是原始JSON字符串，或根据encoding字段指定的编码格式</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;app&quot;:{&quot;name&quot;:&quot;My Flow&quot;}}</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>DSL内容的编码方式。不填表示内容为原始字符串；base64表示内容经过Base64编码；base64+gzip表示内容经过gzip压缩后再Base64编码</p>
             * 
             * <strong>example:</strong>
             * <p>base64</p>
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * <p>源DSL的提供商类型，如：dify、n8n、zapier等</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>dify</p>
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            public DslSource build() {
                return new DslSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConvertFlowDSLInput} extends {@link TeaModel}
     *
     * <p>ConvertFlowDSLInput</p>
     */
    public static class Options extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("compatibilityCheck")
        private Boolean compatibilityCheck;

        @com.aliyun.core.annotation.NameInMap("credentialName")
        private String credentialName;

        @com.aliyun.core.annotation.NameInMap("flowName")
        private String flowName;

        @com.aliyun.core.annotation.NameInMap("vpcEndpointName")
        private String vpcEndpointName;

        private Options(Builder builder) {
            this.compatibilityCheck = builder.compatibilityCheck;
            this.credentialName = builder.credentialName;
            this.flowName = builder.flowName;
            this.vpcEndpointName = builder.vpcEndpointName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return compatibilityCheck
         */
        public Boolean getCompatibilityCheck() {
            return this.compatibilityCheck;
        }

        /**
         * @return credentialName
         */
        public String getCredentialName() {
            return this.credentialName;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        /**
         * @return vpcEndpointName
         */
        public String getVpcEndpointName() {
            return this.vpcEndpointName;
        }

        public static final class Builder {
            private Boolean compatibilityCheck; 
            private String credentialName; 
            private String flowName; 
            private String vpcEndpointName; 

            private Builder() {
            } 

            private Builder(Options model) {
                this.compatibilityCheck = model.compatibilityCheck;
                this.credentialName = model.credentialName;
                this.flowName = model.flowName;
                this.vpcEndpointName = model.vpcEndpointName;
            } 

            /**
             * <p>是否执行兼容性检查，默认为true</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder compatibilityCheck(Boolean compatibilityCheck) {
                this.compatibilityCheck = compatibilityCheck;
                return this;
            }

            /**
             * credentialName.
             */
            public Builder credentialName(String credentialName) {
                this.credentialName = credentialName;
                return this;
            }

            /**
             * flowName.
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * vpcEndpointName.
             */
            public Builder vpcEndpointName(String vpcEndpointName) {
                this.vpcEndpointName = vpcEndpointName;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
}
