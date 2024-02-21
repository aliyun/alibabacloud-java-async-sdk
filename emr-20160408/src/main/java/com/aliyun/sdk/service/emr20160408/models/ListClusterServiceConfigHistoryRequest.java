// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterServiceConfigHistoryRequest} extends {@link RequestModel}
 *
 * <p>ListClusterServiceConfigHistoryRequest</p>
 */
public class ListClusterServiceConfigHistoryRequest extends Request {
    @Query
    @NameInMap("Author")
    private String author;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("ConfigFileName")
    private String configFileName;

    @Query
    @NameInMap("ConfigItemKey")
    private String configItemKey;

    @Query
    @NameInMap("ConfigVersion")
    private String configVersion;

    @Query
    @NameInMap("HostGroupId")
    private String hostGroupId;

    @Query
    @NameInMap("HostInstanceId")
    private String hostInstanceId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    private ListClusterServiceConfigHistoryRequest(Builder builder) {
        super(builder);
        this.author = builder.author;
        this.clusterId = builder.clusterId;
        this.comment = builder.comment;
        this.configFileName = builder.configFileName;
        this.configItemKey = builder.configItemKey;
        this.configVersion = builder.configVersion;
        this.hostGroupId = builder.hostGroupId;
        this.hostInstanceId = builder.hostInstanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterServiceConfigHistoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return author
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return configFileName
     */
    public String getConfigFileName() {
        return this.configFileName;
    }

    /**
     * @return configItemKey
     */
    public String getConfigItemKey() {
        return this.configItemKey;
    }

    /**
     * @return configVersion
     */
    public String getConfigVersion() {
        return this.configVersion;
    }

    /**
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    /**
     * @return hostInstanceId
     */
    public String getHostInstanceId() {
        return this.hostInstanceId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<ListClusterServiceConfigHistoryRequest, Builder> {
        private String author; 
        private String clusterId; 
        private String comment; 
        private String configFileName; 
        private String configItemKey; 
        private String configVersion; 
        private String hostGroupId; 
        private String hostInstanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterServiceConfigHistoryRequest request) {
            super(request);
            this.author = request.author;
            this.clusterId = request.clusterId;
            this.comment = request.comment;
            this.configFileName = request.configFileName;
            this.configItemKey = request.configItemKey;
            this.configVersion = request.configVersion;
            this.hostGroupId = request.hostGroupId;
            this.hostInstanceId = request.hostInstanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.serviceName = request.serviceName;
        } 

        /**
         * Author.
         */
        public Builder author(String author) {
            this.putQueryParameter("Author", author);
            this.author = author;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * ConfigFileName.
         */
        public Builder configFileName(String configFileName) {
            this.putQueryParameter("ConfigFileName", configFileName);
            this.configFileName = configFileName;
            return this;
        }

        /**
         * ConfigItemKey.
         */
        public Builder configItemKey(String configItemKey) {
            this.putQueryParameter("ConfigItemKey", configItemKey);
            this.configItemKey = configItemKey;
            return this;
        }

        /**
         * ConfigVersion.
         */
        public Builder configVersion(String configVersion) {
            this.putQueryParameter("ConfigVersion", configVersion);
            this.configVersion = configVersion;
            return this;
        }

        /**
         * HostGroupId.
         */
        public Builder hostGroupId(String hostGroupId) {
            this.putQueryParameter("HostGroupId", hostGroupId);
            this.hostGroupId = hostGroupId;
            return this;
        }

        /**
         * HostInstanceId.
         */
        public Builder hostInstanceId(String hostInstanceId) {
            this.putQueryParameter("HostInstanceId", hostInstanceId);
            this.hostInstanceId = hostInstanceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public ListClusterServiceConfigHistoryRequest build() {
            return new ListClusterServiceConfigHistoryRequest(this);
        } 

    } 

}
