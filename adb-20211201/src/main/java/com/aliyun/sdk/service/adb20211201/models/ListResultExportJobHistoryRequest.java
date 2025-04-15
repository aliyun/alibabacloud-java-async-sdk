// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ListResultExportJobHistoryRequest} extends {@link RequestModel}
 *
 * <p>ListResultExportJobHistoryRequest</p>
 */
public class ListResultExportJobHistoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatabaseUser")
    private String databaseUser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Order")
    private Order order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroup")
    private String resourceGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private java.util.List<String> statusList;

    private ListResultExportJobHistoryRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.databaseUser = builder.databaseUser;
        this.endTime = builder.endTime;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroup = builder.resourceGroup;
        this.startTime = builder.startTime;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResultExportJobHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return databaseUser
     */
    public String getDatabaseUser() {
        return this.databaseUser;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return order
     */
    public Order getOrder() {
        return this.order;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroup
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return statusList
     */
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<ListResultExportJobHistoryRequest, Builder> {
        private String DBClusterId; 
        private String databaseUser; 
        private String endTime; 
        private Order order; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String resourceGroup; 
        private String startTime; 
        private java.util.List<String> statusList; 

        private Builder() {
            super();
        } 

        private Builder(ListResultExportJobHistoryRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.databaseUser = request.databaseUser;
            this.endTime = request.endTime;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroup = request.resourceGroup;
            this.startTime = request.startTime;
            this.statusList = request.statusList;
        } 

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition clusters within a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-7xv5ty5m9o4v****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder databaseUser(String databaseUser) {
            this.putBodyParameter("DatabaseUser", databaseUser);
            this.databaseUser = databaseUser;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p> The end time must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2023-05-25T06:54:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The order in which to sort the SQL statements by field, which contains the <code>Field</code> and <code>Type</code> fields. Specify the order in the JSON format. Example: <code>[{&quot;Field&quot;:&quot;CreateTimee&quot;, &quot;Type&quot;: &quot;desc&quot; }]</code>.</p>
         * <ul>
         * <li><p><code>Field</code> specifies the field that is used to sort the SQL statements. Valid values:</p>
         * <ul>
         * <li><code>CreateTime</code>: the time when the result set export job was created.</li>
         * <li><code>Status</code>: the execution status.</li>
         * <li><code>DatabaseUser</code>: the name of the database account.</li>
         * <li><code>TimeCost</code>: the execution duration.</li>
         * <li><code>ResourceGroup</code>: the name of the resource group.</li>
         * <li><code>ExportRows</code>: the number of exported rows.</li>
         * <li><code>Progress</code>: the export progress.</li>
         * </ul>
         * </li>
         * <li><p><code>Type</code> specifies the sorting order. Valid values (case-insensitive):</p>
         * <ul>
         * <li><code>Desc</code>: descending order.</li>
         * <li><code>Asc</code>: ascending order.</li>
         * </ul>
         * </li>
         * </ul>
         */
        public Builder order(Order order) {
            String orderShrink = shrink(order, "Order", "json");
            this.putBodyParameter("Order", orderShrink);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong> (default)</li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the resource group that runs the result set export jobs. You can use this parameter to query the execution records of export jobs that are run in a specific resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>user_default</p>
         */
        public Builder resourceGroup(String resourceGroup) {
            this.putBodyParameter("ResourceGroup", resourceGroup);
            this.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01T12:01:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The execution status of result set export jobs. You can use this parameter to query the execution records of export jobs that are in a specific state.</p>
         */
        public Builder statusList(java.util.List<String> statusList) {
            String statusListShrink = shrink(statusList, "StatusList", "json");
            this.putBodyParameter("StatusList", statusListShrink);
            this.statusList = statusList;
            return this;
        }

        @Override
        public ListResultExportJobHistoryRequest build() {
            return new ListResultExportJobHistoryRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListResultExportJobHistoryRequest} extends {@link TeaModel}
     *
     * <p>ListResultExportJobHistoryRequest</p>
     */
    public static class Order extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Order(Builder builder) {
            this.field = builder.field;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Order create() {
            return builder().build();
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String field; 
            private String type; 

            private Builder() {
            } 

            private Builder(Order model) {
                this.field = model.field;
                this.type = model.type;
            } 

            /**
             * <p>The field that is used to sort the SQL statements. Valid values:</p>
             * <ul>
             * <li>CreateTime</li>
             * <li>DatabaseUser</li>
             * <li>TimeCost</li>
             * <li>ResourceGroup</li>
             * <li>Status</li>
             * <li>Progress</li>
             * <li>ExportRows</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DatabaseUser</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The sorting order. Valid values (case-insensitive):</p>
             * <ul>
             * <li><strong>Desc</strong>: descending order.</li>
             * <li><strong>Asc</strong>: ascending order.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Desc</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Order build() {
                return new Order(this);
            } 

        } 

    }
}
