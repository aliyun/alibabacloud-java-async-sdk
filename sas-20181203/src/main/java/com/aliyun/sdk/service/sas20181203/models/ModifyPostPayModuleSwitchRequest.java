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
 * {@link ModifyPostPayModuleSwitchRequest} extends {@link RequestModel}
 *
 * <p>ModifyPostPayModuleSwitchRequest</p>
 */
public class ModifyPostPayModuleSwitchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostPaidHostAutoBind")
    private Integer postPaidHostAutoBind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostPaidHostAutoBindVersion")
    private Integer postPaidHostAutoBindVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostPayInstanceId")
    private String postPayInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostPayModuleSwitch")
    private String postPayModuleSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostPayModuleSwitchObj")
    private PostPayModuleSwitchObj postPayModuleSwitchObj;

    private ModifyPostPayModuleSwitchRequest(Builder builder) {
        super(builder);
        this.postPaidHostAutoBind = builder.postPaidHostAutoBind;
        this.postPaidHostAutoBindVersion = builder.postPaidHostAutoBindVersion;
        this.postPayInstanceId = builder.postPayInstanceId;
        this.postPayModuleSwitch = builder.postPayModuleSwitch;
        this.postPayModuleSwitchObj = builder.postPayModuleSwitchObj;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPostPayModuleSwitchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return postPaidHostAutoBind
     */
    public Integer getPostPaidHostAutoBind() {
        return this.postPaidHostAutoBind;
    }

    /**
     * @return postPaidHostAutoBindVersion
     */
    public Integer getPostPaidHostAutoBindVersion() {
        return this.postPaidHostAutoBindVersion;
    }

    /**
     * @return postPayInstanceId
     */
    public String getPostPayInstanceId() {
        return this.postPayInstanceId;
    }

    /**
     * @return postPayModuleSwitch
     */
    public String getPostPayModuleSwitch() {
        return this.postPayModuleSwitch;
    }

    /**
     * @return postPayModuleSwitchObj
     */
    public PostPayModuleSwitchObj getPostPayModuleSwitchObj() {
        return this.postPayModuleSwitchObj;
    }

    public static final class Builder extends Request.Builder<ModifyPostPayModuleSwitchRequest, Builder> {
        private Integer postPaidHostAutoBind; 
        private Integer postPaidHostAutoBindVersion; 
        private String postPayInstanceId; 
        private String postPayModuleSwitch; 
        private PostPayModuleSwitchObj postPayModuleSwitchObj; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPostPayModuleSwitchRequest request) {
            super(request);
            this.postPaidHostAutoBind = request.postPaidHostAutoBind;
            this.postPaidHostAutoBindVersion = request.postPaidHostAutoBindVersion;
            this.postPayInstanceId = request.postPayInstanceId;
            this.postPayModuleSwitch = request.postPayModuleSwitch;
            this.postPayModuleSwitchObj = request.postPayModuleSwitchObj;
        } 

        /**
         * <p>Automatic binding switch for new assets in host and container protection. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Off</li>
         * <li><strong>1</strong>: On</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder postPaidHostAutoBind(Integer postPaidHostAutoBind) {
            this.putQueryParameter("PostPaidHostAutoBind", postPaidHostAutoBind);
            this.postPaidHostAutoBind = postPaidHostAutoBind;
            return this;
        }

        /**
         * <p>Version for automatic binding of new assets in host and container protection. Values:</p>
         * <ul>
         * <li><strong>1</strong>: Free Edition </li>
         * <li><strong>3</strong>: Enterprise Edition</li>
         * <li><strong>5</strong>: Advanced Edition</li>
         * <li><strong>6</strong>: Antivirus Edition    </li>
         * <li><strong>7</strong>: Flagship Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder postPaidHostAutoBindVersion(Integer postPaidHostAutoBindVersion) {
            this.putQueryParameter("PostPaidHostAutoBindVersion", postPaidHostAutoBindVersion);
            this.postPaidHostAutoBindVersion = postPaidHostAutoBindVersion;
            return this;
        }

        /**
         * <p>Pay-as-you-go instance ID, which must be filled in.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeVersionConfig~~">DescribeVersionConfig</a> interface to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>postpay-sas-**</p>
         */
        public Builder postPayInstanceId(String postPayInstanceId) {
            this.putQueryParameter("PostPayInstanceId", postPayInstanceId);
            this.postPayInstanceId = postPayInstanceId;
            return this;
        }

        /**
         * <p>Status of the pay-as-you-go module switch, in JsonString format. Values:</p>
         * <ul>
         * <li>Key:<ul>
         * <li><strong>VUL</strong>: Vulnerability Repair Module</li>
         * <li><strong>CSPM</strong>: Cloud Security Posture Management Module</li>
         * <li><strong>AGENTLESS</strong>: Agentless Detection Module</li>
         * <li><strong>SERVERLESS</strong>: Serverless Security Module</li>
         * <li><strong>CTDR</strong>: Threat Analysis and Response Module</li>
         * <li><strong>POST_HOST</strong>: Host and Container Security Module</li>
         * <li><strong>SDK</strong>: Malicious File Detection SDK Module</li>
         * <li><strong>RASP</strong>: Application Protection Module</li>
         * <li><strong>CTDR_STORAGE</strong>: Log Management Module</li>
         * <li><strong>ANTI_RANSOMWARE</strong>: Anti-Ransomware Management</li>
         * </ul>
         * </li>
         * <li>Value: 0 means off, 1 means on</li>
         * </ul>
         * <blockquote>
         * <p>The values of modules not passed will not change.</p>
         * </blockquote>
         * <p><notice>The meaning is the same as the PostPayModuleSwitchObj field. When both exist, the value of PostPayModuleSwitch takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VUL&quot;:1,&quot;CSPM&quot;:0}</p>
         */
        public Builder postPayModuleSwitch(String postPayModuleSwitch) {
            this.putQueryParameter("PostPayModuleSwitch", postPayModuleSwitch);
            this.postPayModuleSwitch = postPayModuleSwitch;
            return this;
        }

        /**
         * <p>Pay-as-you-go module switch.</p>
         * <blockquote>
         * <p>Notice:  The meaning is the same as the PostPayModuleSwitch field. When both exist, the value of PostPayModuleSwitch takes precedence.</p>
         * </blockquote>
         */
        public Builder postPayModuleSwitchObj(PostPayModuleSwitchObj postPayModuleSwitchObj) {
            String postPayModuleSwitchObjShrink = shrink(postPayModuleSwitchObj, "PostPayModuleSwitchObj", "json");
            this.putQueryParameter("PostPayModuleSwitchObj", postPayModuleSwitchObjShrink);
            this.postPayModuleSwitchObj = postPayModuleSwitchObj;
            return this;
        }

        @Override
        public ModifyPostPayModuleSwitchRequest build() {
            return new ModifyPostPayModuleSwitchRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyPostPayModuleSwitchRequest} extends {@link TeaModel}
     *
     * <p>ModifyPostPayModuleSwitchRequest</p>
     */
    public static class PostPayModuleSwitchObj extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agentless")
        private Integer agentless;

        @com.aliyun.core.annotation.NameInMap("AntiRansomware")
        private Integer antiRansomware;

        @com.aliyun.core.annotation.NameInMap("BasicService")
        private Integer basicService;

        @com.aliyun.core.annotation.NameInMap("Cspm")
        private Integer cspm;

        @com.aliyun.core.annotation.NameInMap("Ctdr")
        private Integer ctdr;

        @com.aliyun.core.annotation.NameInMap("CtdrStorage")
        private Integer ctdrStorage;

        @com.aliyun.core.annotation.NameInMap("PostHost")
        private Integer postHost;

        @com.aliyun.core.annotation.NameInMap("Rasp")
        private Integer rasp;

        @com.aliyun.core.annotation.NameInMap("Sdk")
        private Integer sdk;

        @com.aliyun.core.annotation.NameInMap("Serverless")
        private Integer serverless;

        @com.aliyun.core.annotation.NameInMap("Vul")
        private Integer vul;

        @com.aliyun.core.annotation.NameInMap("WebLock")
        private Integer webLock;

        private PostPayModuleSwitchObj(Builder builder) {
            this.agentless = builder.agentless;
            this.antiRansomware = builder.antiRansomware;
            this.basicService = builder.basicService;
            this.cspm = builder.cspm;
            this.ctdr = builder.ctdr;
            this.ctdrStorage = builder.ctdrStorage;
            this.postHost = builder.postHost;
            this.rasp = builder.rasp;
            this.sdk = builder.sdk;
            this.serverless = builder.serverless;
            this.vul = builder.vul;
            this.webLock = builder.webLock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PostPayModuleSwitchObj create() {
            return builder().build();
        }

        /**
         * @return agentless
         */
        public Integer getAgentless() {
            return this.agentless;
        }

        /**
         * @return antiRansomware
         */
        public Integer getAntiRansomware() {
            return this.antiRansomware;
        }

        /**
         * @return basicService
         */
        public Integer getBasicService() {
            return this.basicService;
        }

        /**
         * @return cspm
         */
        public Integer getCspm() {
            return this.cspm;
        }

        /**
         * @return ctdr
         */
        public Integer getCtdr() {
            return this.ctdr;
        }

        /**
         * @return ctdrStorage
         */
        public Integer getCtdrStorage() {
            return this.ctdrStorage;
        }

        /**
         * @return postHost
         */
        public Integer getPostHost() {
            return this.postHost;
        }

        /**
         * @return rasp
         */
        public Integer getRasp() {
            return this.rasp;
        }

        /**
         * @return sdk
         */
        public Integer getSdk() {
            return this.sdk;
        }

        /**
         * @return serverless
         */
        public Integer getServerless() {
            return this.serverless;
        }

        /**
         * @return vul
         */
        public Integer getVul() {
            return this.vul;
        }

        /**
         * @return webLock
         */
        public Integer getWebLock() {
            return this.webLock;
        }

        public static final class Builder {
            private Integer agentless; 
            private Integer antiRansomware; 
            private Integer basicService; 
            private Integer cspm; 
            private Integer ctdr; 
            private Integer ctdrStorage; 
            private Integer postHost; 
            private Integer rasp; 
            private Integer sdk; 
            private Integer serverless; 
            private Integer vul; 
            private Integer webLock; 

            private Builder() {
            } 

            private Builder(PostPayModuleSwitchObj model) {
                this.agentless = model.agentless;
                this.antiRansomware = model.antiRansomware;
                this.basicService = model.basicService;
                this.cspm = model.cspm;
                this.ctdr = model.ctdr;
                this.ctdrStorage = model.ctdrStorage;
                this.postHost = model.postHost;
                this.rasp = model.rasp;
                this.sdk = model.sdk;
                this.serverless = model.serverless;
                this.vul = model.vul;
                this.webLock = model.webLock;
            } 

            /**
             * <p>Agentless Detection Module. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Off</li>
             * <li><strong>1</strong>: On</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder agentless(Integer agentless) {
                this.agentless = agentless;
                return this;
            }

            /**
             * <p>Anti-Ransomware Module. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Off</li>
             * <li><strong>1</strong>: On</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder antiRansomware(Integer antiRansomware) {
                this.antiRansomware = antiRansomware;
                return this;
            }

            /**
             * <p>Basic service module. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Off</li>
             * <li><strong>1</strong>: On</li>
             * </ul>
             * <blockquote>
             * <p>Notice: The basic service module switch does not support active modification. When other modules are on, this module is also on. If all other modules are off, then this module is off.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder basicService(Integer basicService) {
                this.basicService = basicService;
                return this;
            }

            /**
             * <p>Cloud Security Configuration Check Module. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Off</li>
             * <li><strong>1</strong>: On</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cspm(Integer cspm) {
                this.cspm = cspm;
                return this;
            }

            /**
             * <p>Threat Analysis and Response Module. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Off</li>
             * <li><strong>1</strong>: On</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ctdr(Integer ctdr) {
                this.ctdr = ctdr;
                return this;
            }

            /**
             * <p>Log Management Module. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Off</li>
             * <li><strong>1</strong>: On</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ctdrStorage(Integer ctdrStorage) {
                this.ctdrStorage = ctdrStorage;
                return this;
            }

            /**
             * <p>Host and Container Security Module. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Off</li>
             * <li><strong>1</strong>: On</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder postHost(Integer postHost) {
                this.postHost = postHost;
                return this;
            }

            /**
             * <p>Application Protection Module. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Off</li>
             * <li><strong>1</strong>: On</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rasp(Integer rasp) {
                this.rasp = rasp;
                return this;
            }

            /**
             * <p>Malicious File Detection SDK Module. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Off</li>
             * <li><strong>1</strong>: On</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sdk(Integer sdk) {
                this.sdk = sdk;
                return this;
            }

            /**
             * <p>Serverless Security Module. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Off</li>
             * <li><strong>1</strong>: On</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serverless(Integer serverless) {
                this.serverless = serverless;
                return this;
            }

            /**
             * <p>Vulnerability Repair Module. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Off</li>
             * <li><strong>1</strong>: On</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder vul(Integer vul) {
                this.vul = vul;
                return this;
            }

            /**
             * <p>File Tamper Protection Module. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Off</li>
             * <li><strong>1</strong>: On</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder webLock(Integer webLock) {
                this.webLock = webLock;
                return this;
            }

            public PostPayModuleSwitchObj build() {
                return new PostPayModuleSwitchObj(this);
            } 

        } 

    }
}
