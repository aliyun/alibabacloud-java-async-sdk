// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDirectoriesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDirectoriesRequest</p>
 */
public class DescribeDirectoriesRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private java.util.List < String > directoryId;

    @Query
    @NameInMap("DirectoryStatus")
    private String directoryStatus;

    @Query
    @NameInMap("DirectoryType")
    private String directoryType;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 500)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Status")
    private String status;

    private DescribeDirectoriesRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.directoryStatus = builder.directoryStatus;
        this.directoryType = builder.directoryType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDirectoriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public java.util.List < String > getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return directoryStatus
     */
    public String getDirectoryStatus() {
        return this.directoryStatus;
    }

    /**
     * @return directoryType
     */
    public String getDirectoryType() {
        return this.directoryType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeDirectoriesRequest, Builder> {
        private java.util.List < String > directoryId; 
        private String directoryStatus; 
        private String directoryType; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDirectoriesRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.directoryStatus = request.directoryStatus;
            this.directoryType = request.directoryType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.status = request.status;
        } 

        /**
         * Details of directory IDs. You can specify one or more directory IDs.
         */
        public Builder directoryId(java.util.List < String > directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The directory status. This parameter is equivalent to `Status`.
         */
        public Builder directoryStatus(String directoryStatus) {
            this.putQueryParameter("DirectoryStatus", directoryStatus);
            this.directoryStatus = directoryStatus;
            return this;
        }

        /**
         * The directory type.
         * <p>
         * 
         * Valid values:
         * 
         * *   SIMPLE: a directory of the convenience account type
         * *   AD_CONNECTOR: an AD directory
         * *   RAM: a RAM directory
         */
        public Builder directoryType(String directoryType) {
            this.putQueryParameter("DirectoryType", directoryType);
            this.directoryType = directoryType;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum value: 100.
         * 
         * Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the next query. If this parameter is empty, all results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The directory status.
         * <p>
         * 
         * Valid values:
         * 
         * *   REGISTERING: The directory is being registered.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   DEREGISTERING: The directory is being deregistered.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   REGISTERED: The directory is registered.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   NEEDCONFIGTRUST: A trust relationship needs to be configured for the directory.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   CONFIGTRUSTFAILED: A trust relationship fails to be configured for the directory.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   DEREGISTERED: The directory is deregistered.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   ERROR: One or more configurations of the directory are invalid.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   CONFIGTRUSTING: A trust relationship is being configured.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   NEEDCONFIGUSER: Users need to be configured for the directory.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeDirectoriesRequest build() {
            return new DescribeDirectoriesRequest(this);
        } 

    } 

}
