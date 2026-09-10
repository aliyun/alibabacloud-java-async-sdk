// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ListMetaDataComponentPageRequest} extends {@link RequestModel}
 *
 * <p>ListMetaDataComponentPageRequest</p>
 */
public class ListMetaDataComponentPageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("categoryType")
    private String categoryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("componentType")
    private Integer componentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsName")
    private String dsName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsStatus")
    private java.util.List<Integer> dsStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsType")
    private String dsType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsTypeList")
    private java.util.List<String> dsTypeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupBy")
    private String groupBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("needTotalCount")
    private String needTotalCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("srcComponentId")
    private Long srcComponentId;

    private ListMetaDataComponentPageRequest(Builder builder) {
        super(builder);
        this.categoryType = builder.categoryType;
        this.componentType = builder.componentType;
        this.dsName = builder.dsName;
        this.dsStatus = builder.dsStatus;
        this.dsType = builder.dsType;
        this.dsTypeList = builder.dsTypeList;
        this.groupBy = builder.groupBy;
        this.needTotalCount = builder.needTotalCount;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.srcComponentId = builder.srcComponentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetaDataComponentPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryType
     */
    public String getCategoryType() {
        return this.categoryType;
    }

    /**
     * @return componentType
     */
    public Integer getComponentType() {
        return this.componentType;
    }

    /**
     * @return dsName
     */
    public String getDsName() {
        return this.dsName;
    }

    /**
     * @return dsStatus
     */
    public java.util.List<Integer> getDsStatus() {
        return this.dsStatus;
    }

    /**
     * @return dsType
     */
    public String getDsType() {
        return this.dsType;
    }

    /**
     * @return dsTypeList
     */
    public java.util.List<String> getDsTypeList() {
        return this.dsTypeList;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return needTotalCount
     */
    public String getNeedTotalCount() {
        return this.needTotalCount;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return srcComponentId
     */
    public Long getSrcComponentId() {
        return this.srcComponentId;
    }

    public static final class Builder extends Request.Builder<ListMetaDataComponentPageRequest, Builder> {
        private String categoryType; 
        private Integer componentType; 
        private String dsName; 
        private java.util.List<Integer> dsStatus; 
        private String dsType; 
        private java.util.List<String> dsTypeList; 
        private String groupBy; 
        private String needTotalCount; 
        private String orderBy; 
        private String orderDirection; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private Long srcComponentId; 

        private Builder() {
            super();
        } 

        private Builder(ListMetaDataComponentPageRequest request) {
            super(request);
            this.categoryType = request.categoryType;
            this.componentType = request.componentType;
            this.dsName = request.dsName;
            this.dsStatus = request.dsStatus;
            this.dsType = request.dsType;
            this.dsTypeList = request.dsTypeList;
            this.groupBy = request.groupBy;
            this.needTotalCount = request.needTotalCount;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.srcComponentId = request.srcComponentId;
        } 

        /**
         * <p>The category type of the data source. Valid values: DATASET, WORKFLOW, and ENGINE. For scheduling scenarios, this parameter is set to WORKFLOW.</p>
         * 
         * <strong>example:</strong>
         * <p>WORKFLOW</p>
         */
        public Builder categoryType(String categoryType) {
            this.putBodyParameter("categoryType", categoryType);
            this.categoryType = categoryType;
            return this;
        }

        /**
         * <p>The entry component type. In some operations, this parameter is used as a backward compatible field for version 1.1.0. Valid values:</p>
         * <ul>
         * <li>0: source</li>
         * <li>1: destination</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder componentType(Integer componentType) {
            this.putBodyParameter("componentType", componentType);
            this.componentType = componentType;
            return this;
        }

        /**
         * <p>The data source name. Exact match and fuzzy match are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test_ds318_hangzhou_0428</p>
         */
        public Builder dsName(String dsName) {
            this.putBodyParameter("dsName", dsName);
            this.dsName = dsName;
            return this;
        }

        /**
         * <p>The connectivity status of the data source. Valid values:</p>
         * <ul>
         * <li>0: Not tested.</li>
         * <li>1: Connected.</li>
         * <li>2: Connection failed.</li>
         * <li>-1: Connectivity test not supported.</li>
         * </ul>
         */
        public Builder dsStatus(java.util.List<Integer> dsStatus) {
            this.putBodyParameter("dsStatus", dsStatus);
            this.dsStatus = dsStatus;
            return this;
        }

        /**
         * <p>The data source type, such as Hive or MaxCompute.</p>
         * 
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        public Builder dsType(String dsType) {
            this.putBodyParameter("dsType", dsType);
            this.dsType = dsType;
            return this;
        }

        /**
         * <p>The list of data source types.</p>
         */
        public Builder dsTypeList(java.util.List<String> dsTypeList) {
            this.putBodyParameter("dsTypeList", dsTypeList);
            this.dsTypeList = dsTypeList;
            return this;
        }

        /**
         * <p>The grouping field (GROUP BY condition). Set this parameter as needed.</p>
         * 
         * <strong>example:</strong>
         * <p>order_date</p>
         */
        public Builder groupBy(String groupBy) {
            this.putBodyParameter("groupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * <p>Specifies whether to return the total number of records in the paginated result.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needTotalCount(String needTotalCount) {
            this.putBodyParameter("needTotalCount", needTotalCount);
            this.needTotalCount = needTotalCount;
            return this;
        }

        /**
         * <p>The sort field. Set this parameter as needed.</p>
         * 
         * <strong>example:</strong>
         * <p>gmtCreate</p>
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The sort direction. Valid values:</p>
         * <ul>
         * <li>ASC: ascending order</li>
         * <li>DESC: descending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder orderDirection(String orderDirection) {
            this.putBodyParameter("orderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * <p>The page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putBodyParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The page size, which is the number of records returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The source component ID, which is the primary key of the source data source component.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder srcComponentId(Long srcComponentId) {
            this.putBodyParameter("srcComponentId", srcComponentId);
            this.srcComponentId = srcComponentId;
            return this;
        }

        @Override
        public ListMetaDataComponentPageRequest build() {
            return new ListMetaDataComponentPageRequest(this);
        } 

    } 

}
