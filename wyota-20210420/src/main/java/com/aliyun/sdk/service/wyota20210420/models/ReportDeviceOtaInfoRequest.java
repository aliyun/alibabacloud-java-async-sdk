// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReportDeviceOtaInfoRequest} extends {@link RequestModel}
 *
 * <p>ReportDeviceOtaInfoRequest</p>
 */
public class ReportDeviceOtaInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaseVersion")
    private String baseVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Note")
    private String note;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetVersion")
    private String targetVersion;

    private ReportDeviceOtaInfoRequest(Builder builder) {
        super(builder);
        this.baseVersion = builder.baseVersion;
        this.deviceId = builder.deviceId;
        this.model = builder.model;
        this.note = builder.note;
        this.status = builder.status;
        this.targetVersion = builder.targetVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportDeviceOtaInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseVersion
     */
    public String getBaseVersion() {
        return this.baseVersion;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return targetVersion
     */
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public static final class Builder extends Request.Builder<ReportDeviceOtaInfoRequest, Builder> {
        private String baseVersion; 
        private String deviceId; 
        private String model; 
        private String note; 
        private Integer status; 
        private String targetVersion; 

        private Builder() {
            super();
        } 

        private Builder(ReportDeviceOtaInfoRequest request) {
            super(request);
            this.baseVersion = request.baseVersion;
            this.deviceId = request.deviceId;
            this.model = request.model;
            this.note = request.note;
            this.status = request.status;
            this.targetVersion = request.targetVersion;
        } 

        /**
         * BaseVersion.
         */
        public Builder baseVersion(String baseVersion) {
            this.putBodyParameter("BaseVersion", baseVersion);
            this.baseVersion = baseVersion;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * Note.
         */
        public Builder note(String note) {
            this.putBodyParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TargetVersion.
         */
        public Builder targetVersion(String targetVersion) {
            this.putBodyParameter("TargetVersion", targetVersion);
            this.targetVersion = targetVersion;
            return this;
        }

        @Override
        public ReportDeviceOtaInfoRequest build() {
            return new ReportDeviceOtaInfoRequest(this);
        } 

    } 

}
