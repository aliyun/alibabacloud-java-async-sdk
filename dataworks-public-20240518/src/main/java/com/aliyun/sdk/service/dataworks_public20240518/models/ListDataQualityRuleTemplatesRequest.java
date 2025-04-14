// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListDataQualityRuleTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListDataQualityRuleTemplatesRequest</p>
 */
public class ListDataQualityRuleTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreationSource")
    private String creationSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryPath")
    private String directoryPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private ListDataQualityRuleTemplatesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.creationSource = builder.creationSource;
        this.directoryPath = builder.directoryPath;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataQualityRuleTemplatesRequest create() {
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
     * @return creationSource
     */
    public String getCreationSource() {
        return this.creationSource;
    }

    /**
     * @return directoryPath
     */
    public String getDirectoryPath() {
        return this.directoryPath;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ListDataQualityRuleTemplatesRequest, Builder> {
        private String regionId; 
        private String creationSource; 
        private String directoryPath; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataQualityRuleTemplatesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.creationSource = request.creationSource;
            this.directoryPath = request.directoryPath;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
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
         * <p>The source of the template. This parameter is required. Valid values:</p>
         * <ul>
         * <li>System</li>
         * <li>UserDefined</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        public Builder creationSource(String creationSource) {
            this.putQueryParameter("CreationSource", creationSource);
            this.creationSource = creationSource;
            return this;
        }

        /**
         * <p>The directory in which the template is stored. Slashes (/) are used to separate directory levels. The name of each directory level can be up to 1,024 characters in length. It cannot contain whitespace characters or slashes (/).</p>
         * 
         * <strong>example:</strong>
         * <p>/ods/order_data</p>
         */
        public Builder directoryPath(String directoryPath) {
            this.putQueryParameter("DirectoryPath", directoryPath);
            this.directoryPath = directoryPath;
            return this;
        }

        /**
         * <p>The name of the template. If you want to query a system template, set this parameter to the name of the system template. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Table rows</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ListDataQualityRuleTemplatesRequest build() {
            return new ListDataQualityRuleTemplatesRequest(this);
        } 

    } 

}
