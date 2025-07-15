// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DeleteSnapshotFilesRequest} extends {@link RequestModel}
 *
 * <p>DeleteSnapshotFilesRequest</p>
 */
public class DeleteSnapshotFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimestampList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> createTimestampList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoveFile")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean removeFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamName;

    private DeleteSnapshotFilesRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.createTimestampList = builder.createTimestampList;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return createTimestampList
     */
    public java.util.List<Long> getCreateTimestampList() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String appName; 
        private java.util.List<Long> createTimestampList; 
        private String domainName; 
        private Long ownerId; 
        private String regionId; 
        private Boolean removeFile; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSnapshotFilesRequest request) {
            super(request);
            this.appName = request.appName;
            this.createTimestampList = request.createTimestampList;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.removeFile = request.removeFile;
            this.streamName = request.streamName;
        } 

        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The timestamps when the snapshots that you want to delete were captured.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1653641526637</p>
         */
        public Builder createTimestampList(java.util.List<Long> createTimestampList) {
            this.putQueryParameter("CreateTimestampList", createTimestampList);
            this.createTimestampList = createTimestampList;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to also delete the corresponding file in Object Storage Service (OSS) at the same time. Value values:</p>
         * <ul>
         * <li><strong>true</strong>: deletes the corresponding file in OSS.</li>
         * <li><strong>false</strong>: does not delete the corresponding file in OSS.</li>
         * </ul>
         * <blockquote>
         * <p> To delete the corresponding file in OSS, you must have the permissions on the OSS bucket.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder removeFile(Boolean removeFile) {
            this.putQueryParameter("RemoveFile", removeFile);
            this.removeFile = removeFile;
            return this;
        }

        /**
         * <p>The name of the live stream.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
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
