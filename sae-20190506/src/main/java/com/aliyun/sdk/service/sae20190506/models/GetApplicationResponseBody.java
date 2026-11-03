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
         * <p>The response message.</p>
         * <ul>
         * <li><p>If the request is successful, the value is <strong>success</strong>.</p>
         * </li>
         * <li><p>If the request fails, the value is a specific error code.</p>
         * </li>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01CF26C7-00A3-4AA6-BA76-7E95F2A3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The trace ID used to query the details of the request.</p>
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

        @com.aliyun.core.annotation.NameInMap("IsStateful")
        private Boolean isStateful;

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
            this.isStateful = builder.isStateful;
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
         * @return isStateful
         */
        public Boolean getIsStateful() {
            return this.isStateful;
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
            private Boolean isStateful; 
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
                this.isStateful = model.isStateful;
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
             * <p>The application description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
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
             * <p>The base application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ee99cce6-1c8e-4bfa-96c3-3e2fa9******</p>
             */
            public Builder baseAppId(String baseAppId) {
                this.baseAppId = baseAppId;
                return this;
            }

            /**
             * <p>The CPU required for each instance, in millicores. This value cannot be 0. Valid values:</p>
             * <ul>
             * <li><p><strong>500</strong></p>
             * </li>
             * <li><p><strong>1000</strong></p>
             * </li>
             * <li><p><strong>2000</strong></p>
             * </li>
             * <li><p><strong>4000</strong></p>
             * </li>
             * <li><p><strong>8000</strong></p>
             * </li>
             * <li><p><strong>12000</strong></p>
             * </li>
             * <li><p><strong>16000</strong></p>
             * </li>
             * <li><p><strong>32000</strong></p>
             * </li>
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
             * <p>The total number of application instances.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder instances(Integer instances) {
                this.instances = instances;
                return this;
            }

            /**
             * <p>Indicates whether the application is stateful.</p>
             */
            public Builder isStateful(Boolean isStateful) {
                this.isStateful = isStateful;
                return this;
            }

            /**
             * <p>The memory required for each instance, in MB. This value cannot be 0. The memory specification is coupled with the CPU specification. The following configurations are supported:</p>
             * <ul>
             * <li><p><strong>1024</strong>: corresponds to 500 or 1,000 millicores of CPU.</p>
             * </li>
             * <li><p><strong>2048</strong>: corresponds to 500, 1,000, or 2,000 millicores of CPU.</p>
             * </li>
             * <li><p><strong>4096</strong>: corresponds to 1,000, 2,000, or 4,000 millicores of CPU.</p>
             * </li>
             * <li><p><strong>8192</strong>: corresponds to 2,000, 4,000, or 8,000 millicores of CPU.</p>
             * </li>
             * <li><p><strong>12288</strong>: corresponds to 12,000 millicores of CPU.</p>
             * </li>
             * <li><p><strong>16384</strong>: corresponds to 4,000, 8,000, or 16,000 millicores of CPU.</p>
             * </li>
             * <li><p><strong>24576</strong>: corresponds to 12,000 millicores of CPU.</p>
             * </li>
             * <li><p><strong>32768</strong>: corresponds to 16,000 millicores of CPU.</p>
             * </li>
             * <li><p><strong>65536</strong>: corresponds to 8,000, 16,000, or 32,000 millicores of CPU.</p>
             * </li>
             * <li><p><strong>131072</strong>: corresponds to 32,000 millicores of CPU.</p>
             * </li>
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
             * <p>Indicates whether WebAssemblyFilter is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: disabled.</p>
             * </li>
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
             * <p>The namespace ID of the MSE instance.</p>
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
             * <p>The programming language of the application. Valid values:</p>
             * <ul>
             * <li><p><strong>java</strong>: Java.</p>
             * </li>
             * <li><p><strong>php</strong>: PHP.</p>
             * </li>
             * <li><p><strong>other</strong>: other languages, such as Python, C++, Go, .NET, and Node.js.</p>
             * </li>
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
             * <p>The number of running instances.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder runningInstances(Integer runningInstances) {
                this.runningInstances = runningInstances;
                return this;
            }

            /**
             * <p>Indicates whether the auto scaling policy is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: The policy is enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: The policy is disabled.</p>
             * </li>
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
             * <li><p><strong>timing</strong>: scheduled auto scaling.</p>
             * </li>
             * <li><p><strong>metric</strong>: metric-based auto scaling.</p>
             * </li>
             * <li><p><strong>mix</strong>: hybrid auto scaling.</p>
             * </li>
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
