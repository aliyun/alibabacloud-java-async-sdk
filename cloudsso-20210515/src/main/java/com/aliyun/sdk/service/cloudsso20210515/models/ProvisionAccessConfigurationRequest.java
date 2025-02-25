// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ProvisionAccessConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ProvisionAccessConfigurationRequest</p>
 */
public class ProvisionAccessConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    private ProvisionAccessConfigurationRequest(Builder builder) {
        super(builder);
        this.accessConfigurationId = builder.accessConfigurationId;
        this.directoryId = builder.directoryId;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProvisionAccessConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessConfigurationId
     */
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<ProvisionAccessConfigurationRequest, Builder> {
        private String accessConfigurationId; 
        private String directoryId; 
        private String targetId; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(ProvisionAccessConfigurationRequest request) {
            super(request);
            this.accessConfigurationId = request.accessConfigurationId;
            this.directoryId = request.directoryId;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The ID of the access configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-00jhtfl8thteu6uj****</p>
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * <p>The directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The ID of the task object.</p>
         * 
         * <strong>example:</strong>
         * <p>114240524784****</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>The type of the task object. Set the value to RD-Account, which specifies the accounts in the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>RD-Account</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public ProvisionAccessConfigurationRequest build() {
            return new ProvisionAccessConfigurationRequest(this);
        } 

    } 

}
