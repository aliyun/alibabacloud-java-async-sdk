// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link GetApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationResponseBody</p>
 */
public class GetApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Application")
    private Application application;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private GetApplicationResponseBody(Builder builder) {
        this.application = builder.application;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return application
     */
    public Application getApplication() {
        return this.application;
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
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private Application application; 
        private String message; 
        private String requestId; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(GetApplicationResponseBody model) {
            this.application = model.application;
            this.message = model.message;
            this.requestId = model.requestId;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The details of the application.</p>
         */
        public Builder application(Application application) {
            this.application = application;
            return this;
        }

        /**
         * <p>The additional information returned. Valid values:</p>
         * <ul>
         * <li>When a request is successful, <strong>success</strong>is returned.</li>
         * <li>An error code is returned when a request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>01CF26C7-00A3-4AA6-BA76-7E95F2A3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the trace. The ID is used to query the details of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>ac1a0b2215622920113732501e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public GetApplicationResponseBody build() {
            return new GetApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
    public static class Application extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppDescription")
        private String appDescription;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BaseAppId")
        private String baseAppId;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private Integer instances;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private Integer mem;

        @com.aliyun.core.annotation.NameInMap("MseEnabled")
        private Boolean mseEnabled;

        @com.aliyun.core.annotation.NameInMap("MseNamespaceId")
        private String mseNamespaceId;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("ProgrammingLanguage")
        private String programmingLanguage;

        @com.aliyun.core.annotation.NameInMap("RunningInstances")
        private Integer runningInstances;

        @com.aliyun.core.annotation.NameInMap("ScaleRuleEnabled")
        private String scaleRuleEnabled;

        @com.aliyun.core.annotation.NameInMap("ScaleRuleType")
        private String scaleRuleType;

        private Application(Builder builder) {
            this.appDescription = builder.appDescription;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.baseAppId = builder.baseAppId;
            this.cpu = builder.cpu;
            this.instances = builder.instances;
            this.mem = builder.mem;
            this.mseEnabled = builder.mseEnabled;
            this.mseNamespaceId = builder.mseNamespaceId;
            this.namespaceId = builder.namespaceId;
            this.programmingLanguage = builder.programmingLanguage;
            this.runningInstances = builder.runningInstances;
            this.scaleRuleEnabled = builder.scaleRuleEnabled;
            this.scaleRuleType = builder.scaleRuleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
            return builder().build();
        }

        /**
         * @return appDescription
         */
        public String getAppDescription() {
            return this.appDescription;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return baseAppId
         */
        public String getBaseAppId() {
            return this.baseAppId;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return instances
         */
        public Integer getInstances() {
            return this.instances;
        }

        /**
         * @return mem
         */
        public Integer getMem() {
            return this.mem;
        }

        /**
         * @return mseEnabled
         */
        public Boolean getMseEnabled() {
            return this.mseEnabled;
        }

        /**
         * @return mseNamespaceId
         */
        public String getMseNamespaceId() {
            return this.mseNamespaceId;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return programmingLanguage
         */
        public String getProgrammingLanguage() {
            return this.programmingLanguage;
        }

        /**
         * @return runningInstances
         */
        public Integer getRunningInstances() {
            return this.runningInstances;
        }

        /**
         * @return scaleRuleEnabled
         */
        public String getScaleRuleEnabled() {
            return this.scaleRuleEnabled;
        }

        /**
         * @return scaleRuleType
         */
        public String getScaleRuleType() {
            return this.scaleRuleType;
        }

        public static final class Builder {
            private String appDescription; 
            private String appId; 
            private String appName; 
            private String baseAppId; 
            private Integer cpu; 
            private Integer instances; 
            private Integer mem; 
            private Boolean mseEnabled; 
            private String mseNamespaceId; 
            private String namespaceId; 
            private String programmingLanguage; 
            private Integer runningInstances; 
            private String scaleRuleEnabled; 
            private String scaleRuleType; 

            private Builder() {
            } 

            private Builder(Application model) {
                this.appDescription = model.appDescription;
                this.appId = model.appId;
                this.appName = model.appName;
                this.baseAppId = model.baseAppId;
                this.cpu = model.cpu;
                this.instances = model.instances;
                this.mem = model.mem;
                this.mseEnabled = model.mseEnabled;
                this.mseNamespaceId = model.mseNamespaceId;
                this.namespaceId = model.namespaceId;
                this.programmingLanguage = model.programmingLanguage;
                this.runningInstances = model.runningInstances;
                this.scaleRuleEnabled = model.scaleRuleEnabled;
                this.scaleRuleType = model.scaleRuleType;
            } 

            /**
             * <p>The description of the application.</p>
             */
            public Builder appDescription(String appDescription) {
                this.appDescription = appDescription;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>443d638a-ef76-47c4-b707-61197d******</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The ID of the basic application.</p>
             * 
             * <strong>example:</strong>
             * <p>ee99cce6-1c8e-4bfa-96c3-3e2fa9******</p>
             */
            public Builder baseAppId(String baseAppId) {
                this.baseAppId = baseAppId;
                return this;
            }

            /**
             * <p>The CPU specifications that are required for each instance. Unit: millicores. This parameter cannot be set to 0. Valid values:</p>
             * <ul>
             * <li><strong>500</strong></li>
             * <li><strong>1000</strong></li>
             * <li><strong>2000</strong></li>
             * <li><strong>4000</strong></li>
             * <li><strong>8000</strong></li>
             * <li><strong>12000</strong></li>
             * <li><strong>16000</strong></li>
             * <li><strong>32000</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The number of application instances.</p>
             * 
             * <strong>example:</strong>
             * <p>i-8ps2o182102o1jv05bys</p>
             */
            public Builder instances(Integer instances) {
                this.instances = instances;
                return this;
            }

            /**
             * <p>The memory size that is required by each instance. Unit: MB. This parameter cannot be set to 0. The values of this parameter correspond to the values of the Cpu parameter:</p>
             * <ul>
             * <li>This parameter is set to <strong>1024</strong> if the Cpu parameter is set to 500 or 1000.</li>
             * <li>This parameter is set to <strong>2048</strong> if the Cpu parameter is set to 500, 1000, or 2000.</li>
             * <li>This parameter is set to <strong>4096</strong> if the Cpu parameter is set to 1000, 2000, or 4000.</li>
             * <li>This parameter is set to <strong>8192</strong> if the Cpu parameter is set to 2000, 4000, or 8000.</li>
             * <li>This parameter is set to <strong>12288</strong> if the Cpu parameter is set to 12000.</li>
             * <li>This parameter is set to <strong>16384</strong> if the Cpu parameter is set to 4000, 8000, or 16000.</li>
             * <li>This parameter is set to <strong>24576</strong> if the Cpu parameter is set to 12000.</li>
             * <li>This parameter is set to <strong>32768</strong> if the Cpu parameter is set to 16000.</li>
             * <li>This parameter is set to <strong>65536</strong> if the Cpu parameter is set to 8000, 16000, or 32000.</li>
             * <li>This parameter is set to <strong>131072</strong> if the Cpu parameter is set to 32000.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>Specifies whether to enable WebAssembly Filter. Valid values:</p>
             * <ul>
             * <li>true: enables this parameter.</li>
             * <li>false: disables this parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder mseEnabled(Boolean mseEnabled) {
                this.mseEnabled = mseEnabled;
                return this;
            }

            /**
             * <p>The ID of the namespace to which the MSE instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder mseNamespaceId(String mseNamespaceId) {
                this.mseNamespaceId = mseNamespaceId;
                return this;
            }

            /**
             * <p>The namespace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The programming language that is used to create the application. Valid values:</p>
             * <ul>
             * <li><strong>java</strong> :Java.</li>
             * <li><strong>php</strong>: PHP.</li>
             * <li><strong>other</strong>: other programming languages, such as Python, C++, Go, .NET, and Node.js</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>java</p>
             */
            public Builder programmingLanguage(String programmingLanguage) {
                this.programmingLanguage = programmingLanguage;
                return this;
            }

            /**
             * <p>The number of application instances that are running.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runningInstances(Integer runningInstances) {
                this.runningInstances = runningInstances;
                return this;
            }

            /**
             * <p>Indicates whether the auto scaling policy is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The auto scaling policy is enabled.</li>
             * <li><strong>false</strong>: The auto scaling policy is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder scaleRuleEnabled(String scaleRuleEnabled) {
                this.scaleRuleEnabled = scaleRuleEnabled;
                return this;
            }

            /**
             * <p>The type of the auto scaling policy. Valid values:</p>
             * <ul>
             * <li><strong>timing</strong>: a scheduled auto scaling policy.</li>
             * <li><strong>metric</strong>: a metric-based auto scaling policy.</li>
             * <li><strong>mix</strong>: a hybrid auto scaling policy.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>timing</p>
             */
            public Builder scaleRuleType(String scaleRuleType) {
                this.scaleRuleType = scaleRuleType;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
}
