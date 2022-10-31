// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveStreamRecordIndexFilesRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveStreamRecordIndexFilesRequest</p>
 */
public class DeleteLiveStreamRecordIndexFilesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RecordId")
    @Validation(required = true)
    private java.util.List < String > recordId;

    @Query
    @NameInMap("RemoveFile")
    @Validation(required = true)
    private String removeFile;

    @Query
    @NameInMap("StreamName")
    @Validation(required = true)
    private String streamName;

    private DeleteLiveStreamRecordIndexFilesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.recordId = builder.recordId;
        this.removeFile = builder.removeFile;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveStreamRecordIndexFilesRequest create() {
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
     * @return recordId
     */
    public java.util.List < String > getRecordId() {
        return this.recordId;
    }

    /**
     * @return removeFile
     */
    public String getRemoveFile() {
        return this.removeFile;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<DeleteLiveStreamRecordIndexFilesRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String domainName; 
        private Long ownerId; 
        private java.util.List < String > recordId; 
        private String removeFile; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveStreamRecordIndexFilesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.recordId = request.recordId;
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
         * RecordId.
         */
        public Builder recordId(java.util.List < String > recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * RemoveFile.
         */
        public Builder removeFile(String removeFile) {
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
        public DeleteLiveStreamRecordIndexFilesRequest build() {
            return new DeleteLiveStreamRecordIndexFilesRequest(this);
        } 

    } 

}
