// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreatePADiagnosisTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePADiagnosisTaskResponseBody</p>
 */
public class CreatePADiagnosisTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiagnosisTask")
    private DiagnosisTask diagnosisTask;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePADiagnosisTaskResponseBody(Builder builder) {
        this.diagnosisTask = builder.diagnosisTask;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePADiagnosisTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diagnosisTask
     */
    public DiagnosisTask getDiagnosisTask() {
        return this.diagnosisTask;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DiagnosisTask diagnosisTask; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreatePADiagnosisTaskResponseBody model) {
            this.diagnosisTask = model.diagnosisTask;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The diagnostic task.</p>
         */
        public Builder diagnosisTask(DiagnosisTask diagnosisTask) {
            this.diagnosisTask = diagnosisTask;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5F79AE39-6622-5292-87EF-DE45631DE4D7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePADiagnosisTaskResponseBody build() {
            return new CreatePADiagnosisTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePADiagnosisTaskResponseBody</p>
     */
    public static class UdpExtraConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpectedResponse")
        private String expectedResponse;

        @com.aliyun.core.annotation.NameInMap("RequestContent")
        private String requestContent;

        private UdpExtraConfigs(Builder builder) {
            this.expectedResponse = builder.expectedResponse;
            this.requestContent = builder.requestContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UdpExtraConfigs create() {
            return builder().build();
        }

        /**
         * @return expectedResponse
         */
        public String getExpectedResponse() {
            return this.expectedResponse;
        }

        /**
         * @return requestContent
         */
        public String getRequestContent() {
            return this.requestContent;
        }

        public static final class Builder {
            private String expectedResponse; 
            private String requestContent; 

            private Builder() {
            } 

            private Builder(UdpExtraConfigs model) {
                this.expectedResponse = model.expectedResponse;
                this.requestContent = model.requestContent;
            } 

            /**
             * <p>The expected response from the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder expectedResponse(String expectedResponse) {
                this.expectedResponse = expectedResponse;
                return this;
            }

            /**
             * <p>The UDP request content.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder requestContent(String requestContent) {
                this.requestContent = requestContent;
                return this;
            }

            public UdpExtraConfigs build() {
                return new UdpExtraConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePADiagnosisTaskResponseBody</p>
     */
    public static class UserGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        private String userGroupId;

        @com.aliyun.core.annotation.NameInMap("UserGroupName")
        private String userGroupName;

        private UserGroup(Builder builder) {
            this.userGroupId = builder.userGroupId;
            this.userGroupName = builder.userGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroup create() {
            return builder().build();
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        /**
         * @return userGroupName
         */
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public static final class Builder {
            private String userGroupId; 
            private String userGroupName; 

            private Builder() {
            } 

            private Builder(UserGroup model) {
                this.userGroupId = model.userGroupId;
                this.userGroupName = model.userGroupName;
            } 

            /**
             * <p>The user group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ug-xxxxxxxx</p>
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * <p>The user group name.</p>
             * 
             * <strong>example:</strong>
             * <p>IT</p>
             */
            public Builder userGroupName(String userGroupName) {
                this.userGroupName = userGroupName;
                return this;
            }

            public UserGroup build() {
                return new UserGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePADiagnosisTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePADiagnosisTaskResponseBody</p>
     */
    public static class DiagnosisTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DevTag")
        private String devTag;

        @com.aliyun.core.annotation.NameInMap("DiagnoseId")
        private String diagnoseId;

        @com.aliyun.core.annotation.NameInMap("DiagnoseType")
        private String diagnoseType;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("PopId")
        private String popId;

        @com.aliyun.core.annotation.NameInMap("PopMode")
        private String popMode;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UdpExtraConfigs")
        private UdpExtraConfigs udpExtraConfigs;

        @com.aliyun.core.annotation.NameInMap("UserGroup")
        private UserGroup userGroup;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private DiagnosisTask(Builder builder) {
            this.devTag = builder.devTag;
            this.diagnoseId = builder.diagnoseId;
            this.diagnoseType = builder.diagnoseType;
            this.host = builder.host;
            this.popId = builder.popId;
            this.popMode = builder.popMode;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.status = builder.status;
            this.udpExtraConfigs = builder.udpExtraConfigs;
            this.userGroup = builder.userGroup;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnosisTask create() {
            return builder().build();
        }

        /**
         * @return devTag
         */
        public String getDevTag() {
            return this.devTag;
        }

        /**
         * @return diagnoseId
         */
        public String getDiagnoseId() {
            return this.diagnoseId;
        }

        /**
         * @return diagnoseType
         */
        public String getDiagnoseType() {
            return this.diagnoseType;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return popId
         */
        public String getPopId() {
            return this.popId;
        }

        /**
         * @return popMode
         */
        public String getPopMode() {
            return this.popMode;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return udpExtraConfigs
         */
        public UdpExtraConfigs getUdpExtraConfigs() {
            return this.udpExtraConfigs;
        }

        /**
         * @return userGroup
         */
        public UserGroup getUserGroup() {
            return this.userGroup;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String devTag; 
            private String diagnoseId; 
            private String diagnoseType; 
            private String host; 
            private String popId; 
            private String popMode; 
            private String port; 
            private String protocol; 
            private String status; 
            private UdpExtraConfigs udpExtraConfigs; 
            private UserGroup userGroup; 
            private String username; 

            private Builder() {
            } 

            private Builder(DiagnosisTask model) {
                this.devTag = model.devTag;
                this.diagnoseId = model.diagnoseId;
                this.diagnoseType = model.diagnoseType;
                this.host = model.host;
                this.popId = model.popId;
                this.popMode = model.popMode;
                this.port = model.port;
                this.protocol = model.protocol;
                this.status = model.status;
                this.udpExtraConfigs = model.udpExtraConfigs;
                this.userGroup = model.userGroup;
                this.username = model.username;
            } 

            /**
             * <p>The ID of the terminal device.</p>
             * 
             * <strong>example:</strong>
             * <p>E9EE1CE7-4AA0-521D-B8E1-E13E47F05E94</p>
             */
            public Builder devTag(String devTag) {
                this.devTag = devTag;
                return this;
            }

            /**
             * <p>The diagnostic task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>diag-3e0d36d6c15a0502</p>
             */
            public Builder diagnoseId(String diagnoseId) {
                this.diagnoseId = diagnoseId;
                return this;
            }

            /**
             * <p>The diagnosis type. Valid values:</p>
             * <ul>
             * <li>FullLink: full-link diagnosis.</li>
             * <li>Application: application diagnosis.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FullLink</p>
             */
            public Builder diagnoseType(String diagnoseType) {
                this.diagnoseType = diagnoseType;
                return this;
            }

            /**
             * <p>The address to diagnose.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.6.1</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The POP point ID. This parameter is required when manual selection is used.</p>
             * 
             * <strong>example:</strong>
             * <p>pop-8ded63ce9d3d317e</p>
             */
            public Builder popId(String popId) {
                this.popId = popId;
                return this;
            }

            /**
             * <p>The POP point selection mode. Valid values:</p>
             * <ul>
             * <li><strong>AutoSelect</strong>: automatic selection.</li>
             * <li><strong>ManualSelect</strong>: manual selection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AutoSelect</p>
             */
            public Builder popMode(String popMode) {
                this.popMode = popMode;
                return this;
            }

            /**
             * <p>The port.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol used by the internal network access application. Valid values:</p>
             * <ul>
             * <li><strong>TCP</strong></li>
             * <li><strong>UDP</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The task running status. Valid values:</p>
             * <ul>
             * <li><strong>Running</strong>: The task is running.</li>
             * <li><strong>Finished</strong>: The task is complete.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The extra information for UDP diagnosis.</p>
             */
            public Builder udpExtraConfigs(UdpExtraConfigs udpExtraConfigs) {
                this.udpExtraConfigs = udpExtraConfigs;
                return this;
            }

            /**
             * <p>The user group.</p>
             */
            public Builder userGroup(UserGroup userGroup) {
                this.userGroup = userGroup;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public DiagnosisTask build() {
                return new DiagnosisTask(this);
            } 

        } 

    }
}
