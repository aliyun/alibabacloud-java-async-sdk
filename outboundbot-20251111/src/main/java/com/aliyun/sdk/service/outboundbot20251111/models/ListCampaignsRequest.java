// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link ListCampaignsRequest} extends {@link RequestModel}
 *
 * <p>ListCampaignsRequest</p>
 */
public class ListCampaignsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActualStartTimeFrom")
    private String actualStartTimeFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActualStartTimeTo")
    private String actualStartTimeTo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlannedStartTimeFrom")
    private String plannedStartTimeFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlannedStartTimeTo")
    private String plannedStartTimeTo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private ListCampaignsRequest(Builder builder) {
        super(builder);
        this.actualStartTimeFrom = builder.actualStartTimeFrom;
        this.actualStartTimeTo = builder.actualStartTimeTo;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.plannedStartTimeFrom = builder.plannedStartTimeFrom;
        this.plannedStartTimeTo = builder.plannedStartTimeTo;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCampaignsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actualStartTimeFrom
     */
    public String getActualStartTimeFrom() {
        return this.actualStartTimeFrom;
    }

    /**
     * @return actualStartTimeTo
     */
    public String getActualStartTimeTo() {
        return this.actualStartTimeTo;
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
     * @return plannedStartTimeFrom
     */
    public String getPlannedStartTimeFrom() {
        return this.plannedStartTimeFrom;
    }

    /**
     * @return plannedStartTimeTo
     */
    public String getPlannedStartTimeTo() {
        return this.plannedStartTimeTo;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<ListCampaignsRequest, Builder> {
        private String actualStartTimeFrom; 
        private String actualStartTimeTo; 
        private String instanceId; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String plannedStartTimeFrom; 
        private String plannedStartTimeTo; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(ListCampaignsRequest request) {
            super(request);
            this.actualStartTimeFrom = request.actualStartTimeFrom;
            this.actualStartTimeTo = request.actualStartTimeTo;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.plannedStartTimeFrom = request.plannedStartTimeFrom;
            this.plannedStartTimeTo = request.plannedStartTimeTo;
            this.state = request.state;
        } 

        /**
         * <p>最早实际开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1634054400000</p>
         */
        public Builder actualStartTimeFrom(String actualStartTimeFrom) {
            this.putQueryParameter("ActualStartTimeFrom", actualStartTimeFrom);
            this.actualStartTimeFrom = actualStartTimeFrom;
            return this;
        }

        /**
         * <p>最晚实际开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1634054400000</p>
         */
        public Builder actualStartTimeTo(String actualStartTimeTo) {
            this.putQueryParameter("ActualStartTimeTo", actualStartTimeTo);
            this.actualStartTimeTo = actualStartTimeTo;
            return this;
        }

        /**
         * <p>外呼实例ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a4274627-265f-4e14-b2d6-4ee7d4f8593e</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>活动名称</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>页码</p>
         * <p>This parameter is required.</p>
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
         * <p>每页数量</p>
         * <p>This parameter is required.</p>
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
         * <p>最早计划开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1634054400000</p>
         */
        public Builder plannedStartTimeFrom(String plannedStartTimeFrom) {
            this.putQueryParameter("PlannedStartTimeFrom", plannedStartTimeFrom);
            this.plannedStartTimeFrom = plannedStartTimeFrom;
            return this;
        }

        /**
         * <p>最晚计划开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1634054400000</p>
         */
        public Builder plannedStartTimeTo(String plannedStartTimeTo) {
            this.putQueryParameter("PlannedStartTimeTo", plannedStartTimeTo);
            this.plannedStartTimeTo = plannedStartTimeTo;
            return this;
        }

        /**
         * <p>活动状态</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public ListCampaignsRequest build() {
            return new ListCampaignsRequest(this);
        } 

    } 

}
