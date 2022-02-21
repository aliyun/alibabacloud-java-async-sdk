// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowJobsRequest} extends {@link RequestModel}
 *
 * <p>ListFlowJobsRequest</p>
 */
public class ListFlowJobsRequest extends Request {
    @Query
    @NameInMap("Adhoc")
    private Boolean adhoc;

    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 10000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Type")
    private String type;

    private ListFlowJobsRequest(Builder builder) {
        super(builder);
        this.adhoc = builder.adhoc;
        this.id = builder.id;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adhoc
     */
    public Boolean getAdhoc() {
        return this.adhoc;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListFlowJobsRequest, Builder> {
        private Boolean adhoc; 
        private String id; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectId; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListFlowJobsRequest response) {
            super(response);
            this.adhoc = response.adhoc;
            this.id = response.id;
            this.name = response.name;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.type = response.type;
        } 

        /**
         * 是否为临时查询。用于过滤作业。
         */
        public Builder adhoc(Boolean adhoc) {
            this.putQueryParameter("Adhoc", adhoc);
            this.adhoc = adhoc;
            return this;
        }

        /**
         * 作业ID。您可以调用ListFlowJob查看作业ID。
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * 作业名称。
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 当前页数。
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 每页的作业数量。
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 项目ID。您可以调用ListFlowProject查看项目的ID。
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * 地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 作业类型。用于过滤作业，支持的类型有：SPARK，SPARK_STREAMING，ZEPPELIN。
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListFlowJobsRequest build() {
            return new ListFlowJobsRequest(this);
        } 

    } 

}
