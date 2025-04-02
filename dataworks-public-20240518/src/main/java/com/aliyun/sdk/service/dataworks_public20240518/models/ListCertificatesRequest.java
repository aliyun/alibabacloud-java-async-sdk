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
 * {@link ListCertificatesRequest} extends {@link RequestModel}
 *
 * <p>ListCertificatesRequest</p>
 */
public class ListCertificatesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateUser")
    private String createUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndCreateTime")
    private Long endCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartCreateTime")
    private Long startCreateTime;

    private ListCertificatesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createUser = builder.createUser;
        this.endCreateTime = builder.endCreateTime;
        this.name = builder.name;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.sortBy = builder.sortBy;
        this.startCreateTime = builder.startCreateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCertificatesRequest create() {
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
     * @return createUser
     */
    public String getCreateUser() {
        return this.createUser;
    }

    /**
     * @return endCreateTime
     */
    public Long getEndCreateTime() {
        return this.endCreateTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return startCreateTime
     */
    public Long getStartCreateTime() {
        return this.startCreateTime;
    }

    public static final class Builder extends Request.Builder<ListCertificatesRequest, Builder> {
        private String regionId; 
        private String createUser; 
        private Long endCreateTime; 
        private String name; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String sortBy; 
        private Long startCreateTime; 

        private Builder() {
            super();
        } 

        private Builder(ListCertificatesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createUser = request.createUser;
            this.endCreateTime = request.endCreateTime;
            this.name = request.name;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.sortBy = request.sortBy;
            this.startCreateTime = request.startCreateTime;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the user who created the certificate files.</p>
         * 
         * <strong>example:</strong>
         * <p>1107550004253538</p>
         */
        public Builder createUser(String createUser) {
            this.putQueryParameter("CreateUser", createUser);
            this.createUser = createUser;
            return this;
        }

        /**
         * <p>The time when the certificate file was created. You can call this operation to query the files that are created before the time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1593877765000</p>
         */
        public Builder endCreateTime(Long endCreateTime) {
            this.putQueryParameter("EndCreateTime", endCreateTime);
            this.endCreateTime = endCreateTime;
            return this;
        }

        /**
         * <p>The name of the certificate file. Fuzzy match by file name is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>xm_create_test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The order in which you want to sort the certificate files. Valid values: Desc: descending order ASC: ascending order Default value: Asc</p>
         * 
         * <strong>example:</strong>
         * <p>Asc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the workspace to which the certificate file belongs.</p>
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

        /**
         * <p>The field used to sort the certificate files. Valid values: CreateTime Id Name Default value: Id</p>
         * 
         * <strong>example:</strong>
         * <p>Id</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The time when the certificate file was created. You can call this operation to query the files that are created after the time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1730217600000</p>
         */
        public Builder startCreateTime(Long startCreateTime) {
            this.putQueryParameter("StartCreateTime", startCreateTime);
            this.startCreateTime = startCreateTime;
            return this;
        }

        @Override
        public ListCertificatesRequest build() {
            return new ListCertificatesRequest(this);
        } 

    } 

}
