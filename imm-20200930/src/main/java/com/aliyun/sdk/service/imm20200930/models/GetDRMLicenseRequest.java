// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDRMLicenseRequest} extends {@link RequestModel}
 *
 * <p>GetDRMLicenseRequest</p>
 */
public class GetDRMLicenseRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyEndpoint")
    private String notifyEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyTopicName")
    private String notifyTopicName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtectionSystem")
    private String protectionSystem;

    private GetDRMLicenseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.keyId = builder.keyId;
        this.notifyEndpoint = builder.notifyEndpoint;
        this.notifyTopicName = builder.notifyTopicName;
        this.projectName = builder.projectName;
        this.protectionSystem = builder.protectionSystem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDRMLicenseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return notifyEndpoint
     */
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    /**
     * @return notifyTopicName
     */
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return protectionSystem
     */
    public String getProtectionSystem() {
        return this.protectionSystem;
    }

    public static final class Builder extends Request.Builder<GetDRMLicenseRequest, Builder> {
        private String regionId; 
        private String keyId; 
        private String notifyEndpoint; 
        private String notifyTopicName; 
        private String projectName; 
        private String protectionSystem; 

        private Builder() {
            super();
        } 

        private Builder(GetDRMLicenseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.keyId = request.keyId;
            this.notifyEndpoint = request.notifyEndpoint;
            this.notifyTopicName = request.notifyTopicName;
            this.projectName = request.projectName;
            this.protectionSystem = request.protectionSystem;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * KeyId.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * NotifyEndpoint.
         */
        public Builder notifyEndpoint(String notifyEndpoint) {
            this.putQueryParameter("NotifyEndpoint", notifyEndpoint);
            this.notifyEndpoint = notifyEndpoint;
            return this;
        }

        /**
         * NotifyTopicName.
         */
        public Builder notifyTopicName(String notifyTopicName) {
            this.putQueryParameter("NotifyTopicName", notifyTopicName);
            this.notifyTopicName = notifyTopicName;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * ProtectionSystem.
         */
        public Builder protectionSystem(String protectionSystem) {
            this.putQueryParameter("ProtectionSystem", protectionSystem);
            this.protectionSystem = protectionSystem;
            return this;
        }

        @Override
        public GetDRMLicenseRequest build() {
            return new GetDRMLicenseRequest(this);
        } 

    } 

}
