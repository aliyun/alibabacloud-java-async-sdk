// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeSqlLogRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSqlLogRecordsRequest</p>
 */
public class DescribeSqlLogRecordsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List<Filters> filters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeSqlLogRecordsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.filters = builder.filters;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.role = builder.role;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlLogRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return filters
     */
    public java.util.List<Filters> getFilters() {
        return this.filters;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeSqlLogRecordsRequest, Builder> {
        private Long endTime; 
        private java.util.List<Filters> filters; 
        private String instanceId; 
        private String nodeId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String role; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSqlLogRecordsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.filters = request.filters;
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.role = request.role;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end of the time range to query. This value is a UNIX timestamp. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>1608888296000</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The filter conditions.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The database instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze8g2am97624****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <ul>
         * <li>For ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters, this parameter is valid only for instances of the Cluster Edition. If you do not specify this parameter, the log details of the primary node is queried by default.</li>
         * <li>For PolarDB-X 2.0 instances, set this parameter to <strong>polarx_cn</strong> if the node is a compute node, or <strong>polarx_dn</strong> if the node is a data node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pi-uf6k5f6g3912i****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The role of the node of the PolarDB-X 2.0 instance. Valid values:</p>
         * <ul>
         * <li>**polarx_cn**: compute node</li>
         * <li>**polarx_dn**: data node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>polarx_cn</p>
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. This value is a UNIX timestamp. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>1596177993000</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeSqlLogRecordsRequest build() {
            return new DescribeSqlLogRecordsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSqlLogRecordsRequest} extends {@link TeaModel}
     *
     * <p>DescribeSqlLogRecordsRequest</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Filters(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Filters model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The filter parameter.</p>
             * <blockquote>
             * <p> For more information about the supported filter parameters and their valid values, see the <strong>Supported parameters and values for Key</strong> section of this topic.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>keyWords</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the filter parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>select</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
}
