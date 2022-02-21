// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIncidentsRequest} extends {@link RequestModel}
 *
 * <p>ListIncidentsRequest</p>
 */
public class ListIncidentsRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("createEndTime")
    private String createEndTime;

    @Body
    @NameInMap("createStartTime")
    private String createStartTime;

    @Body
    @NameInMap("effect")
    private String effect;

    @Body
    @NameInMap("incidentLevel")
    private String incidentLevel;

    @Body
    @NameInMap("incidentStatus")
    private String incidentStatus;

    @Body
    @NameInMap("me")
    private Integer me;

    @Body
    @NameInMap("pageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("pageSize")
    private Integer pageSize;

    @Body
    @NameInMap("relationServiceId")
    private Long relationServiceId;

    @Body
    @NameInMap("ruleName")
    private String ruleName;

    private ListIncidentsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.createEndTime = builder.createEndTime;
        this.createStartTime = builder.createStartTime;
        this.effect = builder.effect;
        this.incidentLevel = builder.incidentLevel;
        this.incidentStatus = builder.incidentStatus;
        this.me = builder.me;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.relationServiceId = builder.relationServiceId;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIncidentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return createEndTime
     */
    public String getCreateEndTime() {
        return this.createEndTime;
    }

    /**
     * @return createStartTime
     */
    public String getCreateStartTime() {
        return this.createStartTime;
    }

    /**
     * @return effect
     */
    public String getEffect() {
        return this.effect;
    }

    /**
     * @return incidentLevel
     */
    public String getIncidentLevel() {
        return this.incidentLevel;
    }

    /**
     * @return incidentStatus
     */
    public String getIncidentStatus() {
        return this.incidentStatus;
    }

    /**
     * @return me
     */
    public Integer getMe() {
        return this.me;
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
     * @return relationServiceId
     */
    public Long getRelationServiceId() {
        return this.relationServiceId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<ListIncidentsRequest, Builder> {
        private String clientToken; 
        private String createEndTime; 
        private String createStartTime; 
        private String effect; 
        private String incidentLevel; 
        private String incidentStatus; 
        private Integer me; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long relationServiceId; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(ListIncidentsRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.createEndTime = response.createEndTime;
            this.createStartTime = response.createStartTime;
            this.effect = response.effect;
            this.incidentLevel = response.incidentLevel;
            this.incidentStatus = response.incidentStatus;
            this.me = response.me;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.relationServiceId = response.relationServiceId;
            this.ruleName = response.ruleName;
        } 

        /**
         * 幂等校验id
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 创建结束时间
         */
        public Builder createEndTime(String createEndTime) {
            this.putBodyParameter("createEndTime", createEndTime);
            this.createEndTime = createEndTime;
            return this;
        }

        /**
         * 创建开始时间
         */
        public Builder createStartTime(String createStartTime) {
            this.putBodyParameter("createStartTime", createStartTime);
            this.createStartTime = createStartTime;
            return this;
        }

        /**
         * 影响等级 高：HIGH 低 LOW
         */
        public Builder effect(String effect) {
            this.putBodyParameter("effect", effect);
            this.effect = effect;
            return this;
        }

        /**
         * 事件级别 P1 P2 P3 P4
         */
        public Builder incidentLevel(String incidentLevel) {
            this.putBodyParameter("incidentLevel", incidentLevel);
            this.incidentLevel = incidentLevel;
            return this;
        }

        /**
         * 事件状态 ASSIGNED已分派 RESPONDED已响应  FINISHED已完结
         */
        public Builder incidentStatus(String incidentStatus) {
            this.putBodyParameter("incidentStatus", incidentStatus);
            this.incidentStatus = incidentStatus;
            return this;
        }

        /**
         * 是否自己 1是 0不是
         */
        public Builder me(Integer me) {
            this.putBodyParameter("me", me);
            this.me = me;
            return this;
        }

        /**
         * 页
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 行
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 关联服务ID
         */
        public Builder relationServiceId(Long relationServiceId) {
            this.putBodyParameter("relationServiceId", relationServiceId);
            this.relationServiceId = relationServiceId;
            return this;
        }

        /**
         * 流转规则名字
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("ruleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public ListIncidentsRequest build() {
            return new ListIncidentsRequest(this);
        } 

    } 

}
