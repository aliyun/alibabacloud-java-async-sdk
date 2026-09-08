// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ChangeVisibilityResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeVisibilityResponseBody</p>
 */
public class ChangeVisibilityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ChangeVisibilityResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeVisibilityResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ChangeVisibilityResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
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
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal service issue. Detail:.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>24BE19E8-BF7D-4992-A35E-15EBA874F2E5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ChangeVisibilityResponseBody build() {
            return new ChangeVisibilityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ChangeVisibilityResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeVisibilityResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BreakCode")
        private String breakCode;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("OutboundScenario")
        private Boolean outboundScenario;

        @com.aliyun.core.annotation.NameInMap("SignedSkillGroupIdList")
        private java.util.List<String> signedSkillGroupIdList;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserState")
        private String userState;

        @com.aliyun.core.annotation.NameInMap("WorkMode")
        private String workMode;

        private Data(Builder builder) {
            this.breakCode = builder.breakCode;
            this.deviceId = builder.deviceId;
            this.extension = builder.extension;
            this.instanceId = builder.instanceId;
            this.jobId = builder.jobId;
            this.outboundScenario = builder.outboundScenario;
            this.signedSkillGroupIdList = builder.signedSkillGroupIdList;
            this.userId = builder.userId;
            this.userState = builder.userState;
            this.workMode = builder.workMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return breakCode
         */
        public String getBreakCode() {
            return this.breakCode;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return outboundScenario
         */
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        /**
         * @return signedSkillGroupIdList
         */
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userState
         */
        public String getUserState() {
            return this.userState;
        }

        /**
         * @return workMode
         */
        public String getWorkMode() {
            return this.workMode;
        }

        public static final class Builder {
            private String breakCode; 
            private String deviceId; 
            private String extension; 
            private String instanceId; 
            private String jobId; 
            private Boolean outboundScenario; 
            private java.util.List<String> signedSkillGroupIdList; 
            private String userId; 
            private String userState; 
            private String workMode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.breakCode = model.breakCode;
                this.deviceId = model.deviceId;
                this.extension = model.extension;
                this.instanceId = model.instanceId;
                this.jobId = model.jobId;
                this.outboundScenario = model.outboundScenario;
                this.signedSkillGroupIdList = model.signedSkillGroupIdList;
                this.userId = model.userId;
                this.userState = model.userState;
                this.workMode = model.workMode;
            } 

            /**
             * <p>The break code.</p>
             * 
             * <strong>example:</strong>
             * <p>会议</p>
             */
            public Builder breakCode(String breakCode) {
                this.breakCode = breakCode;
                return this;
            }

            /**
             * <p>The device ID. This can be the ID of a browser-based WebRTC softphone or a physical phone. Only one device can be registered at a time.</p>
             * 
             * <strong>example:</strong>
             * <p>Yealink SIP-T23G 44.84.203.6</p>
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * <p>The agent\&quot;s extension number.</p>
             * 
             * <strong>example:</strong>
             * <p>8001****</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>szpczf</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The call ID. If populated, this field indicates that the agent is in a call.</p>
             * 
             * <strong>example:</strong>
             * <p>job-330557290544431104</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>Indicates whether the agent is in outbound-only mode.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder outboundScenario(Boolean outboundScenario) {
                this.outboundScenario = outboundScenario;
                return this;
            }

            /**
             * <p>The IDs of the skill groups to which the agent is signed in.</p>
             */
            public Builder signedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
                this.signedSkillGroupIdList = signedSkillGroupIdList;
                return this;
            }

            /**
             * <p>The agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sam@szpczf</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The agent state.</p>
             * 
             * <strong>example:</strong>
             * <p>Ready</p>
             */
            public Builder userState(String userState) {
                this.userState = userState;
                return this;
            }

            /**
             * <p>The work mode.</p>
             * 
             * <strong>example:</strong>
             * <p>ON_SITE</p>
             */
            public Builder workMode(String workMode) {
                this.workMode = workMode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
