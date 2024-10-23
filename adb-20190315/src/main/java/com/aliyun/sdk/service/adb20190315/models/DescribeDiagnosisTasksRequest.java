// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDiagnosisTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnosisTasksRequest</p>
 */
public class DescribeDiagnosisTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

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
    @com.aliyun.core.annotation.NameInMap("ProcessId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private DescribeDiagnosisTasksRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.host = builder.host;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.processId = builder.processId;
        this.regionId = builder.regionId;
        this.stageId = builder.stageId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosisTasksRequest create() {
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
     * @return host
     */
    public String getHost() {
        return this.host;
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
     * @return processId
     */
    public String getProcessId() {
        return this.processId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stageId
     */
    public String getStageId() {
        return this.stageId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<DescribeDiagnosisTasksRequest, Builder> {
        private String DBClusterId; 
        private String host; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String processId; 
        private String regionId; 
        private String stageId; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiagnosisTasksRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.host = request.host;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.processId = request.processId;
            this.regionId = request.regionId;
            this.stageId = request.stageId;
            this.state = request.state;
        } 

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1r053byu48p****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The IP address from which the query was initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * <p>The order in which to sort the tasks by field. Specify the value in the JSON format. Example: <code>[{&quot;Field&quot;:&quot;CreateTime&quot;, &quot;Type&quot;:&quot;desc&quot;}]</code>.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p><code>Field</code> specifies the field that is used to sort the tasks. Valid values of Field: <code>State</code>, <code>CreateTime</code>, <code>DBName</code>, <code>ProcessID</code>, <code>UpdateTime</code>, <code>JobName</code>, and <code>ProcessRows</code>.</p>
         * </li>
         * <li><p><code>Type</code> specifies the sort order. Valid values of Type: <code>Desc</code> and <code>Asc</code>. The values are case-insensitive.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Field&quot;:&quot;StartTime&quot;, &quot;Type&quot;: &quot;desc&quot; }]</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li>30 (default)</li>
         * <li>50</li>
         * <li>100</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The query ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/190092.html">DescribeProcessList</a> operation to query the IDs of queries that are being executed.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>202011191048151921681492420315100****</p>
         */
        public Builder processId(String processId) {
            this.putQueryParameter("ProcessId", processId);
            this.processId = processId;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
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
         * <p>The ID of a stage in the query that is specified by the <code>ProcessId</code> parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Stage[26]</p>
         */
        public Builder stageId(String stageId) {
            this.putQueryParameter("StageId", stageId);
            this.stageId = stageId;
            return this;
        }

        /**
         * <p>The state of the asynchronous import or export task to be queried. Valid values:</p>
         * <ul>
         * <li><strong>RUNNING</strong></li>
         * <li><strong>FINISHED</strong></li>
         * <li><strong>FAILED</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public DescribeDiagnosisTasksRequest build() {
            return new DescribeDiagnosisTasksRequest(this);
        } 

    } 

}
