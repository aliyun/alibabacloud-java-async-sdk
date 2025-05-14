// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateGlobalDataNetworkRequest} extends {@link RequestModel}
 *
 * <p>CreateGlobalDataNetworkRequest</p>
 */
public class CreateGlobalDataNetworkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationFileSystemPath")
    private String destinationFileSystemPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationId")
    private String destinationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationRegion")
    private String destinationRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationType")
    private String destinationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FreezeSourceDuringSync")
    private String freezeSourceDuringSync;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceFileSystemPath")
    private String sourceFileSystemPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegion")
    private String sourceRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private CreateGlobalDataNetworkRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.destinationFileSystemPath = builder.destinationFileSystemPath;
        this.destinationId = builder.destinationId;
        this.destinationRegion = builder.destinationRegion;
        this.destinationType = builder.destinationType;
        this.freezeSourceDuringSync = builder.freezeSourceDuringSync;
        this.sourceFileSystemPath = builder.sourceFileSystemPath;
        this.sourceId = builder.sourceId;
        this.sourceRegion = builder.sourceRegion;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGlobalDataNetworkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destinationFileSystemPath
     */
    public String getDestinationFileSystemPath() {
        return this.destinationFileSystemPath;
    }

    /**
     * @return destinationId
     */
    public String getDestinationId() {
        return this.destinationId;
    }

    /**
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * @return destinationType
     */
    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return freezeSourceDuringSync
     */
    public String getFreezeSourceDuringSync() {
        return this.freezeSourceDuringSync;
    }

    /**
     * @return sourceFileSystemPath
     */
    public String getSourceFileSystemPath() {
        return this.sourceFileSystemPath;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceRegion
     */
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<CreateGlobalDataNetworkRequest, Builder> {
        private String description; 
        private String destinationFileSystemPath; 
        private String destinationId; 
        private String destinationRegion; 
        private String destinationType; 
        private String freezeSourceDuringSync; 
        private String sourceFileSystemPath; 
        private String sourceId; 
        private String sourceRegion; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateGlobalDataNetworkRequest request) {
            super(request);
            this.description = request.description;
            this.destinationFileSystemPath = request.destinationFileSystemPath;
            this.destinationId = request.destinationId;
            this.destinationRegion = request.destinationRegion;
            this.destinationType = request.destinationType;
            this.freezeSourceDuringSync = request.freezeSourceDuringSync;
            this.sourceFileSystemPath = request.sourceFileSystemPath;
            this.sourceId = request.sourceId;
            this.sourceRegion = request.sourceRegion;
            this.sourceType = request.sourceType;
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
         * DestinationFileSystemPath.
         */
        public Builder destinationFileSystemPath(String destinationFileSystemPath) {
            this.putQueryParameter("DestinationFileSystemPath", destinationFileSystemPath);
            this.destinationFileSystemPath = destinationFileSystemPath;
            return this;
        }

        /**
         * DestinationId.
         */
        public Builder destinationId(String destinationId) {
            this.putQueryParameter("DestinationId", destinationId);
            this.destinationId = destinationId;
            return this;
        }

        /**
         * DestinationRegion.
         */
        public Builder destinationRegion(String destinationRegion) {
            this.putQueryParameter("DestinationRegion", destinationRegion);
            this.destinationRegion = destinationRegion;
            return this;
        }

        /**
         * DestinationType.
         */
        public Builder destinationType(String destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * FreezeSourceDuringSync.
         */
        public Builder freezeSourceDuringSync(String freezeSourceDuringSync) {
            this.putQueryParameter("FreezeSourceDuringSync", freezeSourceDuringSync);
            this.freezeSourceDuringSync = freezeSourceDuringSync;
            return this;
        }

        /**
         * SourceFileSystemPath.
         */
        public Builder sourceFileSystemPath(String sourceFileSystemPath) {
            this.putQueryParameter("SourceFileSystemPath", sourceFileSystemPath);
            this.sourceFileSystemPath = sourceFileSystemPath;
            return this;
        }

        /**
         * SourceId.
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * SourceRegion.
         */
        public Builder sourceRegion(String sourceRegion) {
            this.putQueryParameter("SourceRegion", sourceRegion);
            this.sourceRegion = sourceRegion;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public CreateGlobalDataNetworkRequest build() {
            return new CreateGlobalDataNetworkRequest(this);
        } 

    } 

}
