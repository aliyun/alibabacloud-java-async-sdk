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
 * {@link CreatePADiagnosisTaskRequest} extends {@link RequestModel}
 *
 * <p>CreatePADiagnosisTaskRequest</p>
 */
public class CreatePADiagnosisTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DevTag")
    private String devTag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiagnoseType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diagnoseType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Host")
    @com.aliyun.core.annotation.Validation(required = true)
    private String host;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PopId")
    private String popId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PopMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String popMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Port")
    @com.aliyun.core.annotation.Validation(required = true)
    private String port;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UdpExtraConfigs")
    private UdpExtraConfigs udpExtraConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    private String userGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private CreatePADiagnosisTaskRequest(Builder builder) {
        super(builder);
        this.devTag = builder.devTag;
        this.diagnoseType = builder.diagnoseType;
        this.host = builder.host;
        this.popId = builder.popId;
        this.popMode = builder.popMode;
        this.port = builder.port;
        this.protocol = builder.protocol;
        this.udpExtraConfigs = builder.udpExtraConfigs;
        this.userGroupId = builder.userGroupId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePADiagnosisTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return devTag
     */
    public String getDevTag() {
        return this.devTag;
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
     * @return udpExtraConfigs
     */
    public UdpExtraConfigs getUdpExtraConfigs() {
        return this.udpExtraConfigs;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<CreatePADiagnosisTaskRequest, Builder> {
        private String devTag; 
        private String diagnoseType; 
        private String host; 
        private String popId; 
        private String popMode; 
        private String port; 
        private String protocol; 
        private UdpExtraConfigs udpExtraConfigs; 
        private String userGroupId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(CreatePADiagnosisTaskRequest request) {
            super(request);
            this.devTag = request.devTag;
            this.diagnoseType = request.diagnoseType;
            this.host = request.host;
            this.popId = request.popId;
            this.popMode = request.popMode;
            this.port = request.port;
            this.protocol = request.protocol;
            this.udpExtraConfigs = request.udpExtraConfigs;
            this.userGroupId = request.userGroupId;
            this.username = request.username;
        } 

        /**
         * DevTag.
         */
        public Builder devTag(String devTag) {
            this.putBodyParameter("DevTag", devTag);
            this.devTag = devTag;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FullLink</p>
         */
        public Builder diagnoseType(String diagnoseType) {
            this.putBodyParameter("DiagnoseType", diagnoseType);
            this.diagnoseType = diagnoseType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>socialapp-gateway.client9.me</p>
         */
        public Builder host(String host) {
            this.putBodyParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * PopId.
         */
        public Builder popId(String popId) {
            this.putBodyParameter("PopId", popId);
            this.popId = popId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ManualSelect</p>
         */
        public Builder popMode(String popMode) {
            this.putBodyParameter("PopMode", popMode);
            this.popMode = popMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder port(String port) {
            this.putBodyParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * UdpExtraConfigs.
         */
        public Builder udpExtraConfigs(UdpExtraConfigs udpExtraConfigs) {
            String udpExtraConfigsShrink = shrink(udpExtraConfigs, "UdpExtraConfigs", "json");
            this.putBodyParameter("UdpExtraConfigs", udpExtraConfigsShrink);
            this.udpExtraConfigs = udpExtraConfigs;
            return this;
        }

        /**
         * UserGroupId.
         */
        public Builder userGroupId(String userGroupId) {
            this.putBodyParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putBodyParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public CreatePADiagnosisTaskRequest build() {
            return new CreatePADiagnosisTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePADiagnosisTaskRequest} extends {@link TeaModel}
     *
     * <p>CreatePADiagnosisTaskRequest</p>
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
             * ExpectedResponse.
             */
            public Builder expectedResponse(String expectedResponse) {
                this.expectedResponse = expectedResponse;
                return this;
            }

            /**
             * RequestContent.
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
}
