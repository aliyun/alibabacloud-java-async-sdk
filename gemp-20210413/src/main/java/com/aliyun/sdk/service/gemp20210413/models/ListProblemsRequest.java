// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProblemsRequest} extends {@link RequestModel}
 *
 * <p>ListProblemsRequest</p>
 */
public class ListProblemsRequest extends Request {
    @Body
    @NameInMap("affectServiceId")
    private Long affectServiceId;

    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("discoveryEndTime")
    private String discoveryEndTime;

    @Body
    @NameInMap("discoveryStartTime")
    private String discoveryStartTime;

    @Body
    @NameInMap("mainHandlerId")
    private Long mainHandlerId;

    @Body
    @NameInMap("pageNumber")
    private Long pageNumber;

    @Body
    @NameInMap("pageSize")
    private Long pageSize;

    @Body
    @NameInMap("problemLevel")
    private String problemLevel;

    @Body
    @NameInMap("problemStatus")
    private String problemStatus;

    @Body
    @NameInMap("queryType")
    private String queryType;

    @Body
    @NameInMap("repeaterId")
    private Long repeaterId;

    @Body
    @NameInMap("restoreEndTime")
    private String restoreEndTime;

    @Body
    @NameInMap("restoreStartTime")
    private String restoreStartTime;

    @Body
    @NameInMap("serviceGroupId")
    private Long serviceGroupId;

    private ListProblemsRequest(Builder builder) {
        super(builder);
        this.affectServiceId = builder.affectServiceId;
        this.clientToken = builder.clientToken;
        this.discoveryEndTime = builder.discoveryEndTime;
        this.discoveryStartTime = builder.discoveryStartTime;
        this.mainHandlerId = builder.mainHandlerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.problemLevel = builder.problemLevel;
        this.problemStatus = builder.problemStatus;
        this.queryType = builder.queryType;
        this.repeaterId = builder.repeaterId;
        this.restoreEndTime = builder.restoreEndTime;
        this.restoreStartTime = builder.restoreStartTime;
        this.serviceGroupId = builder.serviceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProblemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return affectServiceId
     */
    public Long getAffectServiceId() {
        return this.affectServiceId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return discoveryEndTime
     */
    public String getDiscoveryEndTime() {
        return this.discoveryEndTime;
    }

    /**
     * @return discoveryStartTime
     */
    public String getDiscoveryStartTime() {
        return this.discoveryStartTime;
    }

    /**
     * @return mainHandlerId
     */
    public Long getMainHandlerId() {
        return this.mainHandlerId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return problemLevel
     */
    public String getProblemLevel() {
        return this.problemLevel;
    }

    /**
     * @return problemStatus
     */
    public String getProblemStatus() {
        return this.problemStatus;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return repeaterId
     */
    public Long getRepeaterId() {
        return this.repeaterId;
    }

    /**
     * @return restoreEndTime
     */
    public String getRestoreEndTime() {
        return this.restoreEndTime;
    }

    /**
     * @return restoreStartTime
     */
    public String getRestoreStartTime() {
        return this.restoreStartTime;
    }

    /**
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public static final class Builder extends Request.Builder<ListProblemsRequest, Builder> {
        private Long affectServiceId; 
        private String clientToken; 
        private String discoveryEndTime; 
        private String discoveryStartTime; 
        private Long mainHandlerId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String problemLevel; 
        private String problemStatus; 
        private String queryType; 
        private Long repeaterId; 
        private String restoreEndTime; 
        private String restoreStartTime; 
        private Long serviceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListProblemsRequest response) {
            super(response);
            this.affectServiceId = response.affectServiceId;
            this.clientToken = response.clientToken;
            this.discoveryEndTime = response.discoveryEndTime;
            this.discoveryStartTime = response.discoveryStartTime;
            this.mainHandlerId = response.mainHandlerId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.problemLevel = response.problemLevel;
            this.problemStatus = response.problemStatus;
            this.queryType = response.queryType;
            this.repeaterId = response.repeaterId;
            this.restoreEndTime = response.restoreEndTime;
            this.restoreStartTime = response.restoreStartTime;
            this.serviceGroupId = response.serviceGroupId;
        } 

        /**
         * 影响服务ID
         */
        public Builder affectServiceId(Long affectServiceId) {
            this.putBodyParameter("affectServiceId", affectServiceId);
            this.affectServiceId = affectServiceId;
            return this;
        }

        /**
         * 幂等号
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 发现结束时间
         */
        public Builder discoveryEndTime(String discoveryEndTime) {
            this.putBodyParameter("discoveryEndTime", discoveryEndTime);
            this.discoveryEndTime = discoveryEndTime;
            return this;
        }

        /**
         * 发现开始时间
         */
        public Builder discoveryStartTime(String discoveryStartTime) {
            this.putBodyParameter("discoveryStartTime", discoveryStartTime);
            this.discoveryStartTime = discoveryStartTime;
            return this;
        }

        /**
         * 主要处理人
         */
        public Builder mainHandlerId(Long mainHandlerId) {
            this.putBodyParameter("mainHandlerId", mainHandlerId);
            this.mainHandlerId = mainHandlerId;
            return this;
        }

        /**
         * 当前页
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 页大小
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 故障等级 1=P1 2=P2 3=P3 4=P4
         */
        public Builder problemLevel(String problemLevel) {
            this.putBodyParameter("problemLevel", problemLevel);
            this.problemLevel = problemLevel;
            return this;
        }

        /**
         * 故障状态  HANDLING   处理中 RECOVERED 已恢复  REPLAYING   复盘中  REPLAYED     已复盘 CANCEL        已取消
         */
        public Builder problemStatus(String problemStatus) {
            this.putBodyParameter("problemStatus", problemStatus);
            this.problemStatus = problemStatus;
            return this;
        }

        /**
         * RESPONSIBLE 我负责的       PARTICIPATED 我参与的  ALL 全部
         */
        public Builder queryType(String queryType) {
            this.putBodyParameter("queryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * 复盘负责人
         */
        public Builder repeaterId(Long repeaterId) {
            this.putBodyParameter("repeaterId", repeaterId);
            this.repeaterId = repeaterId;
            return this;
        }

        /**
         * 恢复结束时间
         */
        public Builder restoreEndTime(String restoreEndTime) {
            this.putBodyParameter("restoreEndTime", restoreEndTime);
            this.restoreEndTime = restoreEndTime;
            return this;
        }

        /**
         * 恢复开始时间
         */
        public Builder restoreStartTime(String restoreStartTime) {
            this.putBodyParameter("restoreStartTime", restoreStartTime);
            this.restoreStartTime = restoreStartTime;
            return this;
        }

        /**
         * 应急协同组
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.putBodyParameter("serviceGroupId", serviceGroupId);
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        @Override
        public ListProblemsRequest build() {
            return new ListProblemsRequest(this);
        } 

    } 

}
