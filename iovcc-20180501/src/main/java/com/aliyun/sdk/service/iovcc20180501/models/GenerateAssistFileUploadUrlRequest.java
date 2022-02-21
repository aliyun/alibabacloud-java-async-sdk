// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAssistFileUploadUrlRequest} extends {@link RequestModel}
 *
 * <p>GenerateAssistFileUploadUrlRequest</p>
 */
public class GenerateAssistFileUploadUrlRequest extends Request {
    @Body
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Body
    @NameInMap("Filename")
    @Validation(required = true)
    private String filename;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GenerateAssistFileUploadUrlRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.filename = builder.filename;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAssistFileUploadUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return filename
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GenerateAssistFileUploadUrlRequest, Builder> {
        private String deviceId; 
        private String filename; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateAssistFileUploadUrlRequest response) {
            super(response);
            this.deviceId = response.deviceId;
            this.filename = response.filename;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
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
         * Filename.
         */
        public Builder filename(String filename) {
            this.putBodyParameter("Filename", filename);
            this.filename = filename;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GenerateAssistFileUploadUrlRequest build() {
            return new GenerateAssistFileUploadUrlRequest(this);
        } 

    } 

}
