// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSnapshotFilesRequest} extends {@link RequestModel}
 *
 * <p>DeleteSnapshotFilesRequest</p>
 */
public class DeleteSnapshotFilesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("CreateTimestampList")
    @Validation(required = true)
    private java.util.List < Long > createTimestampList;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RemoveFile")
    @Validation(required = true)
    private Boolean removeFile;

    @Query
    @NameInMap("StreamName")
    @Validation(required = true)
    private String streamName;

    private DeleteSnapshotFilesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.createTimestampList = builder.createTimestampList;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.removeFile = builder.removeFile;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSnapshotFilesRequest create() {
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return createTimestampList
     */
    public java.util.List < Long > getCreateTimestampList() {
        return this.createTimestampList;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return removeFile
     */
    public Boolean getRemoveFile() {
        return this.removeFile;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<DeleteSnapshotFilesRequest, Builder> {
        private String regionId; 
        private String appName; 
        private java.util.List < Long > createTimestampList; 
        private String domainName; 
        private Long ownerId; 
        private Boolean removeFile; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSnapshotFilesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.createTimestampList = request.createTimestampList;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.removeFile = request.removeFile;
            this.streamName = request.streamName;
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
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * CreateTimestampList.
         */
        public Builder createTimestampList(java.util.List < Long > createTimestampList) {
            this.putQueryParameter("CreateTimestampList", createTimestampList);
            this.createTimestampList = createTimestampList;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RemoveFile.
         */
        public Builder removeFile(Boolean removeFile) {
            this.putQueryParameter("RemoveFile", removeFile);
            this.removeFile = removeFile;
            return this;
        }

        /**
         * StreamName.
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        @Override
        public DeleteSnapshotFilesRequest build() {
            return new DeleteSnapshotFilesRequest(this);
        } 

    } 

}
