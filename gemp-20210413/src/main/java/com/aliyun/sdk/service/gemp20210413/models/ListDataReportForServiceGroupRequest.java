// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataReportForServiceGroupRequest} extends {@link RequestModel}
 *
 * <p>ListDataReportForServiceGroupRequest</p>
 */
public class ListDataReportForServiceGroupRequest extends Request {
    @Body
    @NameInMap("endTime")
    private String endTime;

    @Body
    @NameInMap("serviceGroupName")
    private String serviceGroupName;

    @Body
    @NameInMap("startTime")
    private String startTime;

    private ListDataReportForServiceGroupRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.serviceGroupName = builder.serviceGroupName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataReportForServiceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return serviceGroupName
     */
    public String getServiceGroupName() {
        return this.serviceGroupName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListDataReportForServiceGroupRequest, Builder> {
        private String endTime; 
        private String serviceGroupName; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListDataReportForServiceGroupRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.serviceGroupName = response.serviceGroupName;
            this.startTime = response.startTime;
        } 

        /**
         * 结束时间
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 服务组名称
         */
        public Builder serviceGroupName(String serviceGroupName) {
            this.putBodyParameter("serviceGroupName", serviceGroupName);
            this.serviceGroupName = serviceGroupName;
            return this;
        }

        /**
         * 开始时间
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListDataReportForServiceGroupRequest build() {
            return new ListDataReportForServiceGroupRequest(this);
        } 

    } 

}
