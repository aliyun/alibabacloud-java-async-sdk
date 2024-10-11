// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReadyForServiceResponseBody} extends {@link TeaModel}
 *
 * <p>ReadyForServiceResponseBody</p>
 */
public class ReadyForServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List < String > params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ReadyForServiceResponseBody(Builder builder) {
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

    public static ReadyForServiceResponseBody create() {
        return builder().build();
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
    public java.util.List < String > getParams() {
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
        private java.util.List < String > params; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(java.util.List < String > params) {
            this.params = params;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReadyForServiceResponseBody build() {
            return new ReadyForServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReadyForServiceResponseBody} extends {@link TeaModel}
     *
     * <p>ReadyForServiceResponseBody</p>
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
        private java.util.List < String > signedSkillGroupIdList;

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
        public java.util.List < String > getSignedSkillGroupIdList() {
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
            private java.util.List < String > signedSkillGroupIdList; 
            private String userId; 
            private String userState; 
            private String workMode; 

            /**
             * BreakCode.
             */
            public Builder breakCode(String breakCode) {
                this.breakCode = breakCode;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * OutboundScenario.
             */
            public Builder outboundScenario(Boolean outboundScenario) {
                this.outboundScenario = outboundScenario;
                return this;
            }

            /**
             * SignedSkillGroupIdList.
             */
            public Builder signedSkillGroupIdList(java.util.List < String > signedSkillGroupIdList) {
                this.signedSkillGroupIdList = signedSkillGroupIdList;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserState.
             */
            public Builder userState(String userState) {
                this.userState = userState;
                return this;
            }

            /**
             * WorkMode.
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
