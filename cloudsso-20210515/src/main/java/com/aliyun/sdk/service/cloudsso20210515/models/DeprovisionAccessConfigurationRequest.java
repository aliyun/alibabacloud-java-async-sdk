// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeprovisionAccessConfigurationRequest} extends {@link RequestModel}
 *
 * <p>DeprovisionAccessConfigurationRequest</p>
 */
public class DeprovisionAccessConfigurationRequest extends Request {
    @Query
    @NameInMap("AccessConfigurationId")
    private String accessConfigurationId;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("TargetId")
    private String targetId;

    @Query
    @NameInMap("TargetType")
    private String targetType;

    private DeprovisionAccessConfigurationRequest(Builder builder) {
        super(builder);
        this.accessConfigurationId = builder.accessConfigurationId;
        this.directoryId = builder.directoryId;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeprovisionAccessConfigurationRequest create() {
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

    public static final class Builder extends Request.Builder<DeprovisionAccessConfigurationRequest, Builder> {
        private String accessConfigurationId; 
        private String directoryId; 
        private String targetId; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(DeprovisionAccessConfigurationRequest request) {
            super(request);
            this.accessConfigurationId = request.accessConfigurationId;
            this.directoryId = request.directoryId;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
        } 

        /**
         * The ID of the access configuration.
         */
        public Builder accessConfigurationId(String accessConfigurationId) {
            this.putQueryParameter("AccessConfigurationId", accessConfigurationId);
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }

        /**
         * The directory ID.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The ID of the task object.
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * The type of the task object. Set the value to RD-Account, which specifies the accounts in the resource directory.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public DeprovisionAccessConfigurationRequest build() {
            return new DeprovisionAccessConfigurationRequest(this);
        } 

    } 

}
