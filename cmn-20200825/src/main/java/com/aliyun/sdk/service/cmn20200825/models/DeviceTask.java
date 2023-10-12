// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeviceTask} extends {@link TeaModel}
 *
 * <p>DeviceTask</p>
 */
public class DeviceTask extends TeaModel {
    @NameInMap("DeviceId")
    private String deviceId;

    @NameInMap("DeviceIp")
    private String deviceIp;

    @NameInMap("DeviceName")
    private String deviceName;

    @NameInMap("DeviceTaskId")
    private String deviceTaskId;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModify")
    private String gmtModify;

    @NameInMap("Output")
    private String output;

    @NameInMap("Params")
    private String params;

    @NameInMap("ResponseCode")
    private String responseCode;

    @NameInMap("Result")
    private String result;

    @NameInMap("ScriptId")
    private String scriptId;

    @NameInMap("ScriptVersion")
    private String scriptVersion;

    @NameInMap("Status")
    private String status;

    @NameInMap("TemplateId")
    private String templateId;

    @NameInMap("TemplateName")
    private String templateName;

    private DeviceTask(Builder builder) {
        this.deviceId = builder.deviceId;
        this.deviceIp = builder.deviceIp;
        this.deviceName = builder.deviceName;
        this.deviceTaskId = builder.deviceTaskId;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModify = builder.gmtModify;
        this.output = builder.output;
        this.params = builder.params;
        this.responseCode = builder.responseCode;
        this.result = builder.result;
        this.scriptId = builder.scriptId;
        this.scriptVersion = builder.scriptVersion;
        this.status = builder.status;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeviceTask create() {
        return builder().build();
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return deviceIp
     */
    public String getDeviceIp() {
        return this.deviceIp;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return deviceTaskId
     */
    public String getDeviceTaskId() {
        return this.deviceTaskId;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModify
     */
    public String getGmtModify() {
        return this.gmtModify;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return responseCode
     */
    public String getResponseCode() {
        return this.responseCode;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return scriptVersion
     */
    public String getScriptVersion() {
        return this.scriptVersion;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder {
        private String deviceId; 
        private String deviceIp; 
        private String deviceName; 
        private String deviceTaskId; 
        private String gmtCreate; 
        private String gmtModify; 
        private String output; 
        private String params; 
        private String responseCode; 
        private String result; 
        private String scriptId; 
        private String scriptVersion; 
        private String status; 
        private String templateId; 
        private String templateName; 

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * DeviceIp.
         */
        public Builder deviceIp(String deviceIp) {
            this.deviceIp = deviceIp;
            return this;
        }

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        /**
         * DeviceTaskId.
         */
        public Builder deviceTaskId(String deviceTaskId) {
            this.deviceTaskId = deviceTaskId;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModify.
         */
        public Builder gmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }

        /**
         * Output.
         */
        public Builder output(String output) {
            this.output = output;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.params = params;
            return this;
        }

        /**
         * ResponseCode.
         */
        public Builder responseCode(String responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }

        /**
         * ScriptVersion.
         */
        public Builder scriptVersion(String scriptVersion) {
            this.scriptVersion = scriptVersion;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        public DeviceTask build() {
            return new DeviceTask(this);
        } 

    } 

}
