// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessPagesRequest} extends {@link RequestModel}
 *
 * <p>ListAccessPagesRequest</p>
 */
public class ListAccessPagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPageId")
    private String accessPageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPageName")
    private String accessPageName;

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
    @com.aliyun.core.annotation.NameInMap("SortType")
    private String sortType;

    private ListAccessPagesRequest(Builder builder) {
        super(builder);
        this.accessPageId = builder.accessPageId;
        this.accessPageName = builder.accessPageName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.sortType = builder.sortType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessPagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPageId
     */
    public String getAccessPageId() {
        return this.accessPageId;
    }

    /**
     * @return accessPageName
     */
    public String getAccessPageName() {
        return this.accessPageName;
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
     * @return sortType
     */
    public String getSortType() {
        return this.sortType;
    }

    public static final class Builder extends Request.Builder<ListAccessPagesRequest, Builder> {
        private String accessPageId; 
        private String accessPageName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectId; 
        private String sortType; 

        private Builder() {
            super();
        } 

        private Builder(ListAccessPagesRequest request) {
            super(request);
            this.accessPageId = request.accessPageId;
            this.accessPageName = request.accessPageName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.sortType = request.sortType;
        } 

        /**
         * AccessPageId.
         */
        public Builder accessPageId(String accessPageId) {
            this.putQueryParameter("AccessPageId", accessPageId);
            this.accessPageId = accessPageId;
            return this;
        }

        /**
         * AccessPageName.
         */
        public Builder accessPageName(String accessPageName) {
            this.putQueryParameter("AccessPageName", accessPageName);
            this.accessPageName = accessPageName;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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

        @Override
        public ListAccessPagesRequest build() {
            return new ListAccessPagesRequest(this);
        } 

    } 

}
