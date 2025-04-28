// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeDirectoriesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDirectoriesRequest</p>
 */
public class DescribeDirectoriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private java.util.List<String> directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryStatus")
    private String directoryStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryType")
    private String directoryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
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
    public java.util.List<String> getDirectoryId() {
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
        private java.util.List<String> directoryId; 
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
         * <p>Details of directory IDs. You can specify one or more directory IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-gx2x1dhsmu52rd****</p>
         */
        public Builder directoryId(java.util.List<String> directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The directory status. This parameter is equivalent to <code>Status</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>REGISTERED</p>
         */
        public Builder directoryStatus(String directoryStatus) {
            this.putQueryParameter("DirectoryStatus", directoryStatus);
            this.directoryStatus = directoryStatus;
            return this;
        }

        /**
         * <p>The directory type.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>SIMPLE: the convenience directory.</li>
         * <li>AD_CONNECTOR: the Active Directory (AD) directory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RAM</p>
         */
        public Builder directoryType(String directoryType) {
            this.putQueryParameter("DirectoryType", directoryType);
            this.directoryType = directoryType;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>Maximum value: 100.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that determines the start point of the next query. If this parameter is empty, all results are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The directory status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>REGISTERING: The directory is being registered.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>DEREGISTERING: The directory is being deregistered.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>REGISTERED: The directory is registered.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>NEEDCONFIGTRUST: A trust relationship needs to be configured for the directory.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>CONFIGTRUSTFAILED: A trust relationship fails to be configured for the directory.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>DEREGISTERED: The directory is deregistered.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>ERROR: One or more configurations of the directory are invalid.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>CONFIGTRUSTING: A trust relationship is being configured.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>NEEDCONFIGUSER: Users need to be configured for the directory.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REGISTERED</p>
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
