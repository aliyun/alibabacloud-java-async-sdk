// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIncidentsRequest} extends {@link RequestModel}
 *
 * <p>ListIncidentsRequest</p>
 */
public class ListIncidentsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("createEndTime")
    private String createEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("createStartTime")
    private String createStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("effect")
    private String effect;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("incidentLevel")
    private String incidentLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("incidentStatus")
    private String incidentStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("me")
    private Integer me;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("relationServiceId")
    private Long relationServiceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ruleName")
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

        private Builder(ListIncidentsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.createEndTime = request.createEndTime;
            this.createStartTime = request.createStartTime;
            this.effect = request.effect;
            this.incidentLevel = request.incidentLevel;
            this.incidentStatus = request.incidentStatus;
            this.me = request.me;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.relationServiceId = request.relationServiceId;
            this.ruleName = request.ruleName;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * createEndTime.
         */
        public Builder createEndTime(String createEndTime) {
            this.putBodyParameter("createEndTime", createEndTime);
            this.createEndTime = createEndTime;
            return this;
        }

        /**
         * createStartTime.
         */
        public Builder createStartTime(String createStartTime) {
            this.putBodyParameter("createStartTime", createStartTime);
            this.createStartTime = createStartTime;
            return this;
        }

        /**
         * effect.
         */
        public Builder effect(String effect) {
            this.putBodyParameter("effect", effect);
            this.effect = effect;
            return this;
        }

        /**
         * incidentLevel.
         */
        public Builder incidentLevel(String incidentLevel) {
            this.putBodyParameter("incidentLevel", incidentLevel);
            this.incidentLevel = incidentLevel;
            return this;
        }

        /**
         * incidentStatus.
         */
        public Builder incidentStatus(String incidentStatus) {
            this.putBodyParameter("incidentStatus", incidentStatus);
            this.incidentStatus = incidentStatus;
            return this;
        }

        /**
         * me.
         */
        public Builder me(Integer me) {
            this.putBodyParameter("me", me);
            this.me = me;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * relationServiceId.
         */
        public Builder relationServiceId(Long relationServiceId) {
            this.putBodyParameter("relationServiceId", relationServiceId);
            this.relationServiceId = relationServiceId;
            return this;
        }

        /**
         * ruleName.
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
