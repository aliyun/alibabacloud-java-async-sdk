// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

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
 * {@link AddAgendaSumRecordFlowPopRequest} extends {@link RequestModel}
 *
 * <p>AddAgendaSumRecordFlowPopRequest</p>
 */
public class AddAgendaSumRecordFlowPopRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActiveNum")
    private Integer activeNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgendaId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long agendaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttendancePercent")
    private String attendancePercent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowTime")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long flowTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalPv")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer totalPv;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalUv")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer totalUv;

    private AddAgendaSumRecordFlowPopRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.activeNum = builder.activeNum;
        this.agendaId = builder.agendaId;
        this.attendancePercent = builder.attendancePercent;
        this.flowTime = builder.flowTime;
        this.sessionName = builder.sessionName;
        this.totalPv = builder.totalPv;
        this.totalUv = builder.totalUv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAgendaSumRecordFlowPopRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return activeNum
     */
    public Integer getActiveNum() {
        return this.activeNum;
    }

    /**
     * @return agendaId
     */
    public Long getAgendaId() {
        return this.agendaId;
    }

    /**
     * @return attendancePercent
     */
    public String getAttendancePercent() {
        return this.attendancePercent;
    }

    /**
     * @return flowTime
     */
    public Long getFlowTime() {
        return this.flowTime;
    }

    /**
     * @return sessionName
     */
    public String getSessionName() {
        return this.sessionName;
    }

    /**
     * @return totalPv
     */
    public Integer getTotalPv() {
        return this.totalPv;
    }

    /**
     * @return totalUv
     */
    public Integer getTotalUv() {
        return this.totalUv;
    }

    public static final class Builder extends Request.Builder<AddAgendaSumRecordFlowPopRequest, Builder> {
        private String regionId; 
        private Integer activeNum; 
        private Long agendaId; 
        private String attendancePercent; 
        private Long flowTime; 
        private String sessionName; 
        private Integer totalPv; 
        private Integer totalUv; 

        private Builder() {
            super();
        } 

        private Builder(AddAgendaSumRecordFlowPopRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.activeNum = request.activeNum;
            this.agendaId = request.agendaId;
            this.attendancePercent = request.attendancePercent;
            this.flowTime = request.flowTime;
            this.sessionName = request.sessionName;
            this.totalPv = request.totalPv;
            this.totalUv = request.totalUv;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ActiveNum.
         */
        public Builder activeNum(Integer activeNum) {
            this.putQueryParameter("ActiveNum", activeNum);
            this.activeNum = activeNum;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder agendaId(Long agendaId) {
            this.putQueryParameter("AgendaId", agendaId);
            this.agendaId = agendaId;
            return this;
        }

        /**
         * AttendancePercent.
         */
        public Builder attendancePercent(String attendancePercent) {
            this.putQueryParameter("AttendancePercent", attendancePercent);
            this.attendancePercent = attendancePercent;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1784443333333</p>
         */
        public Builder flowTime(Long flowTime) {
            this.putQueryParameter("FlowTime", flowTime);
            this.flowTime = flowTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>云栖大会主论坛</p>
         */
        public Builder sessionName(String sessionName) {
            this.putQueryParameter("SessionName", sessionName);
            this.sessionName = sessionName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalPv(Integer totalPv) {
            this.putQueryParameter("TotalPv", totalPv);
            this.totalPv = totalPv;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder totalUv(Integer totalUv) {
            this.putQueryParameter("TotalUv", totalUv);
            this.totalUv = totalUv;
            return this;
        }

        @Override
        public AddAgendaSumRecordFlowPopRequest build() {
            return new AddAgendaSumRecordFlowPopRequest(this);
        } 

    } 

}
