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
 * {@link CreateSqlLogTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateSqlLogTaskRequest</p>
 */
public class CreateSqlLogTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List<Filters> filters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreateSqlLogTaskRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.filters = builder.filters;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.nodeId = builder.nodeId;
        this.role = builder.role;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSqlLogTaskRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateSqlLogTaskRequest, Builder> {
        private Long endTime; 
        private java.util.List<Filters> filters; 
        private String instanceId; 
        private String name; 
        private String nodeId; 
        private String role; 
        private Long startTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateSqlLogTaskRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.filters = request.filters;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.nodeId = request.nodeId;
            this.role = request.role;
            this.startTime = request.startTime;
            this.type = request.type;
        } 

        /**
         * <p>The end of the time range to query. Specify the time in the UNIX timestamp format. Unit: milliseconds.</p>
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
         * <p>The ID of the database instance.</p>
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
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p> This parameter is available only for instances that run in a cluster architecture. You can specify this parameter to query the offline tasks of a specific node. By default, if this parameter is not specified, the information about the offline tasks of the primary node is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-uf6k5f6g3912i0dqz</p>
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The role of the node of the PolarDB-X 2.0 database instance. Valid values:</p>
         * <ul>
         * <li><strong>polarx_cn</strong>: compute node</li>
         * <li><strong>polarx_dn</strong>: data node</li>
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
         * <p>The beginning of the time range to query. Specify the time in the UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1596177993000</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The type of the task. Valid values:</p>
         * <ul>
         * <li><strong>Export</strong></li>
         * <li><strong>Query</strong></li>
         * <li><strong>Insight</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Export</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateSqlLogTaskRequest build() {
            return new CreateSqlLogTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSqlLogTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateSqlLogTaskRequest</p>
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
             * <p> For more information about the supported filter parameters and their valid values, see the following <strong>supplement about the Key parameter</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>KeyWords</p>
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
