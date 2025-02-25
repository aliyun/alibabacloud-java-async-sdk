// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListSessionPackagesRequest} extends {@link RequestModel}
 *
 * <p>ListSessionPackagesRequest</p>
 */
public class ListSessionPackagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionPackageId")
    private String sessionPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionPackageName")
    private String sessionPackageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortType")
    private String sortType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StateList")
    private java.util.List<Integer> stateList;

    private ListSessionPackagesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.sessionPackageId = builder.sessionPackageId;
        this.sessionPackageName = builder.sessionPackageName;
        this.sortType = builder.sortType;
        this.stateList = builder.stateList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSessionPackagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return sessionPackageId
     */
    public String getSessionPackageId() {
        return this.sessionPackageId;
    }

    /**
     * @return sessionPackageName
     */
    public String getSessionPackageName() {
        return this.sessionPackageName;
    }

    /**
     * @return sortType
     */
    public String getSortType() {
        return this.sortType;
    }

    /**
     * @return stateList
     */
    public java.util.List<Integer> getStateList() {
        return this.stateList;
    }

    public static final class Builder extends Request.Builder<ListSessionPackagesRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectId; 
        private String sessionPackageId; 
        private String sessionPackageName; 
        private String sortType; 
        private java.util.List<Integer> stateList; 

        private Builder() {
            super();
        } 

        private Builder(ListSessionPackagesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.sessionPackageId = request.sessionPackageId;
            this.sessionPackageName = request.sessionPackageName;
            this.sortType = request.sortType;
            this.stateList = request.stateList;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * SessionPackageId.
         */
        public Builder sessionPackageId(String sessionPackageId) {
            this.putQueryParameter("SessionPackageId", sessionPackageId);
            this.sessionPackageId = sessionPackageId;
            return this;
        }

        /**
         * SessionPackageName.
         */
        public Builder sessionPackageName(String sessionPackageName) {
            this.putQueryParameter("SessionPackageName", sessionPackageName);
            this.sessionPackageName = sessionPackageName;
            return this;
        }

        /**
         * SortType.
         */
        public Builder sortType(String sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        /**
         * StateList.
         */
        public Builder stateList(java.util.List<Integer> stateList) {
            this.putQueryParameter("StateList", stateList);
            this.stateList = stateList;
            return this;
        }

        @Override
        public ListSessionPackagesRequest build() {
            return new ListSessionPackagesRequest(this);
        } 

    } 

}
