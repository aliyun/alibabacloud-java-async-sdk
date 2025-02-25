// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListJobInfosRequest} extends {@link RequestModel}
 *
 * <p>ListJobInfosRequest</p>
 */
public class ListJobInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ascOrder")
    private Boolean ascOrder;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extNodeIdList")
    private java.util.List<String> extNodeIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("from")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long from;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceIdList")
    private java.util.List<String> instanceIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jobOwnerList")
    private java.util.List<String> jobOwnerList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("priorityList")
    private java.util.List<Long> priorityList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectList")
    private java.util.List<String> projectList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("quotaNickname")
    private String quotaNickname;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sceneTagList")
    private java.util.List<String> sceneTagList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("signatureList")
    private java.util.List<String> signatureList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sortByList")
    private java.util.List<String> sortByList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sortOrderList")
    private java.util.List<String> sortOrderList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("statusList")
    private java.util.List<String> statusList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("to")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long to;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("typeList")
    private java.util.List<String> typeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderColumn")
    private String orderColumn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListJobInfosRequest(Builder builder) {
        super(builder);
        this.ascOrder = builder.ascOrder;
        this.extNodeIdList = builder.extNodeIdList;
        this.from = builder.from;
        this.instanceIdList = builder.instanceIdList;
        this.jobOwnerList = builder.jobOwnerList;
        this.priorityList = builder.priorityList;
        this.projectList = builder.projectList;
        this.quotaNickname = builder.quotaNickname;
        this.sceneTagList = builder.sceneTagList;
        this.signatureList = builder.signatureList;
        this.sortByList = builder.sortByList;
        this.sortOrderList = builder.sortOrderList;
        this.statusList = builder.statusList;
        this.to = builder.to;
        this.typeList = builder.typeList;
        this.orderColumn = builder.orderColumn;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.region = builder.region;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobInfosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ascOrder
     */
    public Boolean getAscOrder() {
        return this.ascOrder;
    }

    /**
     * @return extNodeIdList
     */
    public java.util.List<String> getExtNodeIdList() {
        return this.extNodeIdList;
    }

    /**
     * @return from
     */
    public Long getFrom() {
        return this.from;
    }

    /**
     * @return instanceIdList
     */
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    /**
     * @return jobOwnerList
     */
    public java.util.List<String> getJobOwnerList() {
        return this.jobOwnerList;
    }

    /**
     * @return priorityList
     */
    public java.util.List<Long> getPriorityList() {
        return this.priorityList;
    }

    /**
     * @return projectList
     */
    public java.util.List<String> getProjectList() {
        return this.projectList;
    }

    /**
     * @return quotaNickname
     */
    public String getQuotaNickname() {
        return this.quotaNickname;
    }

    /**
     * @return sceneTagList
     */
    public java.util.List<String> getSceneTagList() {
        return this.sceneTagList;
    }

    /**
     * @return signatureList
     */
    public java.util.List<String> getSignatureList() {
        return this.signatureList;
    }

    /**
     * @return sortByList
     */
    public java.util.List<String> getSortByList() {
        return this.sortByList;
    }

    /**
     * @return sortOrderList
     */
    public java.util.List<String> getSortOrderList() {
        return this.sortOrderList;
    }

    /**
     * @return statusList
     */
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    /**
     * @return to
     */
    public Long getTo() {
        return this.to;
    }

    /**
     * @return typeList
     */
    public java.util.List<String> getTypeList() {
        return this.typeList;
    }

    /**
     * @return orderColumn
     */
    public String getOrderColumn() {
        return this.orderColumn;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListJobInfosRequest, Builder> {
        private Boolean ascOrder; 
        private java.util.List<String> extNodeIdList; 
        private Long from; 
        private java.util.List<String> instanceIdList; 
        private java.util.List<String> jobOwnerList; 
        private java.util.List<Long> priorityList; 
        private java.util.List<String> projectList; 
        private String quotaNickname; 
        private java.util.List<String> sceneTagList; 
        private java.util.List<String> signatureList; 
        private java.util.List<String> sortByList; 
        private java.util.List<String> sortOrderList; 
        private java.util.List<String> statusList; 
        private Long to; 
        private java.util.List<String> typeList; 
        private String orderColumn; 
        private Long pageNumber; 
        private Long pageSize; 
        private String region; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListJobInfosRequest request) {
            super(request);
            this.ascOrder = request.ascOrder;
            this.extNodeIdList = request.extNodeIdList;
            this.from = request.from;
            this.instanceIdList = request.instanceIdList;
            this.jobOwnerList = request.jobOwnerList;
            this.priorityList = request.priorityList;
            this.projectList = request.projectList;
            this.quotaNickname = request.quotaNickname;
            this.sceneTagList = request.sceneTagList;
            this.signatureList = request.signatureList;
            this.sortByList = request.sortByList;
            this.sortOrderList = request.sortOrderList;
            this.statusList = request.statusList;
            this.to = request.to;
            this.typeList = request.typeList;
            this.orderColumn = request.orderColumn;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.region = request.region;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>Specifies whether to sort query results in ascending or descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ascOrder(Boolean ascOrder) {
            this.putQueryParameter("ascOrder", ascOrder);
            this.ascOrder = ascOrder;
            return this;
        }

        /**
         * extNodeIdList.
         */
        public Builder extNodeIdList(java.util.List<String> extNodeIdList) {
            this.putBodyParameter("extNodeIdList", extNodeIdList);
            this.extNodeIdList = extNodeIdList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder from(Long from) {
            this.putBodyParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * instanceIdList.
         */
        public Builder instanceIdList(java.util.List<String> instanceIdList) {
            this.putBodyParameter("instanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        /**
         * jobOwnerList.
         */
        public Builder jobOwnerList(java.util.List<String> jobOwnerList) {
            this.putBodyParameter("jobOwnerList", jobOwnerList);
            this.jobOwnerList = jobOwnerList;
            return this;
        }

        /**
         * priorityList.
         */
        public Builder priorityList(java.util.List<Long> priorityList) {
            this.putBodyParameter("priorityList", priorityList);
            this.priorityList = priorityList;
            return this;
        }

        /**
         * projectList.
         */
        public Builder projectList(java.util.List<String> projectList) {
            this.putBodyParameter("projectList", projectList);
            this.projectList = projectList;
            return this;
        }

        /**
         * quotaNickname.
         */
        public Builder quotaNickname(String quotaNickname) {
            this.putBodyParameter("quotaNickname", quotaNickname);
            this.quotaNickname = quotaNickname;
            return this;
        }

        /**
         * sceneTagList.
         */
        public Builder sceneTagList(java.util.List<String> sceneTagList) {
            this.putBodyParameter("sceneTagList", sceneTagList);
            this.sceneTagList = sceneTagList;
            return this;
        }

        /**
         * signatureList.
         */
        public Builder signatureList(java.util.List<String> signatureList) {
            this.putBodyParameter("signatureList", signatureList);
            this.signatureList = signatureList;
            return this;
        }

        /**
         * sortByList.
         */
        public Builder sortByList(java.util.List<String> sortByList) {
            this.putBodyParameter("sortByList", sortByList);
            this.sortByList = sortByList;
            return this;
        }

        /**
         * sortOrderList.
         */
        public Builder sortOrderList(java.util.List<String> sortOrderList) {
            this.putBodyParameter("sortOrderList", sortOrderList);
            this.sortOrderList = sortOrderList;
            return this;
        }

        /**
         * statusList.
         */
        public Builder statusList(java.util.List<String> statusList) {
            this.putBodyParameter("statusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder to(Long to) {
            this.putBodyParameter("to", to);
            this.to = to;
            return this;
        }

        /**
         * typeList.
         */
        public Builder typeList(java.util.List<String> typeList) {
            this.putBodyParameter("typeList", typeList);
            this.typeList = typeList;
            return this;
        }

        /**
         * <p>The column based on which you want to sort query results.</p>
         * 
         * <strong>example:</strong>
         * <p>cuUsage</p>
         */
        public Builder orderColumn(String orderColumn) {
            this.putQueryParameter("orderColumn", orderColumn);
            this.orderColumn = orderColumn;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>478403690625249</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListJobInfosRequest build() {
            return new ListJobInfosRequest(this);
        } 

    } 

}
