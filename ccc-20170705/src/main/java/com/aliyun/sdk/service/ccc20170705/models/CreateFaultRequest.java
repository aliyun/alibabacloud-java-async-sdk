// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFaultRequest} extends {@link RequestModel}
 *
 * <p>CreateFaultRequest</p>
 */
public class CreateFaultRequest extends Request {
    @Query
    @NameInMap("AgentFilePath")
    private String agentFilePath;

    @Query
    @NameInMap("AgentId")
    @Validation(required = true)
    private Long agentId;

    @Query
    @NameInMap("AgentOssFileName")
    private String agentOssFileName;

    @Query
    @NameInMap("BrowserVersion")
    private String browserVersion;

    @Query
    @NameInMap("ClientIp")
    private String clientIp;

    @Query
    @NameInMap("ClientPort")
    private String clientPort;

    @Query
    @NameInMap("ConnectId")
    @Validation(required = true)
    private String connectId;

    @Query
    @NameInMap("CustomFilePath")
    private String customFilePath;

    @Query
    @NameInMap("CustomOssFileName")
    private String customOssFileName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MicrophoneEquipment")
    private String microphoneEquipment;

    @Query
    @NameInMap("MicrophoneList")
    private String microphoneList;

    @Query
    @NameInMap("OperatingSystemVersion")
    private String operatingSystemVersion;

    @Query
    @NameInMap("ServiceIp")
    private String serviceIp;

    @Query
    @NameInMap("ServicePort")
    private String servicePort;

    @Query
    @NameInMap("SpeakerEquipment")
    private String speakerEquipment;

    @Query
    @NameInMap("SpeakerList")
    private String speakerList;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private CreateFaultRequest(Builder builder) {
        super(builder);
        this.agentFilePath = builder.agentFilePath;
        this.agentId = builder.agentId;
        this.agentOssFileName = builder.agentOssFileName;
        this.browserVersion = builder.browserVersion;
        this.clientIp = builder.clientIp;
        this.clientPort = builder.clientPort;
        this.connectId = builder.connectId;
        this.customFilePath = builder.customFilePath;
        this.customOssFileName = builder.customOssFileName;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.microphoneEquipment = builder.microphoneEquipment;
        this.microphoneList = builder.microphoneList;
        this.operatingSystemVersion = builder.operatingSystemVersion;
        this.serviceIp = builder.serviceIp;
        this.servicePort = builder.servicePort;
        this.speakerEquipment = builder.speakerEquipment;
        this.speakerList = builder.speakerList;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFaultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentFilePath
     */
    public String getAgentFilePath() {
        return this.agentFilePath;
    }

    /**
     * @return agentId
     */
    public Long getAgentId() {
        return this.agentId;
    }

    /**
     * @return agentOssFileName
     */
    public String getAgentOssFileName() {
        return this.agentOssFileName;
    }

    /**
     * @return browserVersion
     */
    public String getBrowserVersion() {
        return this.browserVersion;
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return clientPort
     */
    public String getClientPort() {
        return this.clientPort;
    }

    /**
     * @return connectId
     */
    public String getConnectId() {
        return this.connectId;
    }

    /**
     * @return customFilePath
     */
    public String getCustomFilePath() {
        return this.customFilePath;
    }

    /**
     * @return customOssFileName
     */
    public String getCustomOssFileName() {
        return this.customOssFileName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return microphoneEquipment
     */
    public String getMicrophoneEquipment() {
        return this.microphoneEquipment;
    }

    /**
     * @return microphoneList
     */
    public String getMicrophoneList() {
        return this.microphoneList;
    }

    /**
     * @return operatingSystemVersion
     */
    public String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }

    /**
     * @return serviceIp
     */
    public String getServiceIp() {
        return this.serviceIp;
    }

    /**
     * @return servicePort
     */
    public String getServicePort() {
        return this.servicePort;
    }

    /**
     * @return speakerEquipment
     */
    public String getSpeakerEquipment() {
        return this.speakerEquipment;
    }

    /**
     * @return speakerList
     */
    public String getSpeakerList() {
        return this.speakerList;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateFaultRequest, Builder> {
        private String agentFilePath; 
        private Long agentId; 
        private String agentOssFileName; 
        private String browserVersion; 
        private String clientIp; 
        private String clientPort; 
        private String connectId; 
        private String customFilePath; 
        private String customOssFileName; 
        private String description; 
        private Long endTime; 
        private String instanceId; 
        private String microphoneEquipment; 
        private String microphoneList; 
        private String operatingSystemVersion; 
        private String serviceIp; 
        private String servicePort; 
        private String speakerEquipment; 
        private String speakerList; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateFaultRequest response) {
            super(response);
            this.agentFilePath = response.agentFilePath;
            this.agentId = response.agentId;
            this.agentOssFileName = response.agentOssFileName;
            this.browserVersion = response.browserVersion;
            this.clientIp = response.clientIp;
            this.clientPort = response.clientPort;
            this.connectId = response.connectId;
            this.customFilePath = response.customFilePath;
            this.customOssFileName = response.customOssFileName;
            this.description = response.description;
            this.endTime = response.endTime;
            this.instanceId = response.instanceId;
            this.microphoneEquipment = response.microphoneEquipment;
            this.microphoneList = response.microphoneList;
            this.operatingSystemVersion = response.operatingSystemVersion;
            this.serviceIp = response.serviceIp;
            this.servicePort = response.servicePort;
            this.speakerEquipment = response.speakerEquipment;
            this.speakerList = response.speakerList;
            this.startTime = response.startTime;
        } 

        /**
         * AgentFilePath.
         */
        public Builder agentFilePath(String agentFilePath) {
            this.putQueryParameter("AgentFilePath", agentFilePath);
            this.agentFilePath = agentFilePath;
            return this;
        }

        /**
         * AgentId.
         */
        public Builder agentId(Long agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * AgentOssFileName.
         */
        public Builder agentOssFileName(String agentOssFileName) {
            this.putQueryParameter("AgentOssFileName", agentOssFileName);
            this.agentOssFileName = agentOssFileName;
            return this;
        }

        /**
         * BrowserVersion.
         */
        public Builder browserVersion(String browserVersion) {
            this.putQueryParameter("BrowserVersion", browserVersion);
            this.browserVersion = browserVersion;
            return this;
        }

        /**
         * ClientIp.
         */
        public Builder clientIp(String clientIp) {
            this.putQueryParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * ClientPort.
         */
        public Builder clientPort(String clientPort) {
            this.putQueryParameter("ClientPort", clientPort);
            this.clientPort = clientPort;
            return this;
        }

        /**
         * ConnectId.
         */
        public Builder connectId(String connectId) {
            this.putQueryParameter("ConnectId", connectId);
            this.connectId = connectId;
            return this;
        }

        /**
         * CustomFilePath.
         */
        public Builder customFilePath(String customFilePath) {
            this.putQueryParameter("CustomFilePath", customFilePath);
            this.customFilePath = customFilePath;
            return this;
        }

        /**
         * CustomOssFileName.
         */
        public Builder customOssFileName(String customOssFileName) {
            this.putQueryParameter("CustomOssFileName", customOssFileName);
            this.customOssFileName = customOssFileName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MicrophoneEquipment.
         */
        public Builder microphoneEquipment(String microphoneEquipment) {
            this.putQueryParameter("MicrophoneEquipment", microphoneEquipment);
            this.microphoneEquipment = microphoneEquipment;
            return this;
        }

        /**
         * MicrophoneList.
         */
        public Builder microphoneList(String microphoneList) {
            this.putQueryParameter("MicrophoneList", microphoneList);
            this.microphoneList = microphoneList;
            return this;
        }

        /**
         * OperatingSystemVersion.
         */
        public Builder operatingSystemVersion(String operatingSystemVersion) {
            this.putQueryParameter("OperatingSystemVersion", operatingSystemVersion);
            this.operatingSystemVersion = operatingSystemVersion;
            return this;
        }

        /**
         * ServiceIp.
         */
        public Builder serviceIp(String serviceIp) {
            this.putQueryParameter("ServiceIp", serviceIp);
            this.serviceIp = serviceIp;
            return this;
        }

        /**
         * ServicePort.
         */
        public Builder servicePort(String servicePort) {
            this.putQueryParameter("ServicePort", servicePort);
            this.servicePort = servicePort;
            return this;
        }

        /**
         * SpeakerEquipment.
         */
        public Builder speakerEquipment(String speakerEquipment) {
            this.putQueryParameter("SpeakerEquipment", speakerEquipment);
            this.speakerEquipment = speakerEquipment;
            return this;
        }

        /**
         * SpeakerList.
         */
        public Builder speakerList(String speakerList) {
            this.putQueryParameter("SpeakerList", speakerList);
            this.speakerList = speakerList;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateFaultRequest build() {
            return new CreateFaultRequest(this);
        } 

    } 

}
