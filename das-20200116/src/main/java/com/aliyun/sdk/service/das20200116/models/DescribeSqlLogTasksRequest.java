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
 * {@link DescribeSqlLogTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeSqlLogTasksRequest</p>
 */
public class DescribeSqlLogTasksRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List<Filters> filters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeSqlLogTasksRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.filters = builder.filters;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlLogTasksRequest create() {
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeSqlLogTasksRequest, Builder> {
        private Long endTime; 
        private java.util.List<Filters> filters; 
        private String instanceId; 
        private String nodeId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSqlLogTasksRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.filters = request.filters;
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
         * <p>The filter parameters.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putBodyParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The ID of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1nti25tc7bq5****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p> This parameter is available only for instances that are deployed in the cluster architecture. You can specify this parameter to query the tasks of a specific node. If this parameter is not specified, the tasks of the primary node are returned by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-bp1o58x3ib7e6z496</p>
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
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
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
         * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
        public DescribeSqlLogTasksRequest build() {
            return new DescribeSqlLogTasksRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSqlLogTasksRequest} extends {@link TeaModel}
     *
     * <p>DescribeSqlLogTasksRequest</p>
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
             * <p>The name of the filter parameter.</p>
             * <blockquote>
             * <p> For more information about the filter parameters, see the <strong>Valid values of Key</strong> section of this topic.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>delimiter</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the filter parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>,</p>
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
