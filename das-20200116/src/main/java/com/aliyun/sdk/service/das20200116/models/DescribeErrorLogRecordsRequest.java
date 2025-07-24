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
 * {@link DescribeErrorLogRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeErrorLogRecordsRequest</p>
 */
public class DescribeErrorLogRecordsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Body
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
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeErrorLogRecordsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.filters = builder.filters;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.role = builder.role;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeErrorLogRecordsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeErrorLogRecordsRequest, Builder> {
        private Long endTime; 
        private java.util.List<Filters> filters; 
        private String instanceId; 
        private String nodeId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String role; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeErrorLogRecordsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.filters = request.filters;
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.role = request.role;
            this.startTime = request.startTime;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1732069466000</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Filters.
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putBodyParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1u5mas9exx7****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.putBodyParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1731983066000</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeErrorLogRecordsRequest build() {
            return new DescribeErrorLogRecordsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeErrorLogRecordsRequest} extends {@link TeaModel}
     *
     * <p>DescribeErrorLogRecordsRequest</p>
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
