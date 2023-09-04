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

        private Builder(ListProblemsRequest request) {
            super(request);
            this.affectServiceId = request.affectServiceId;
            this.clientToken = request.clientToken;
            this.discoveryEndTime = request.discoveryEndTime;
            this.discoveryStartTime = request.discoveryStartTime;
            this.mainHandlerId = request.mainHandlerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.problemLevel = request.problemLevel;
            this.problemStatus = request.problemStatus;
            this.queryType = request.queryType;
            this.repeaterId = request.repeaterId;
            this.restoreEndTime = request.restoreEndTime;
            this.restoreStartTime = request.restoreStartTime;
            this.serviceGroupId = request.serviceGroupId;
        } 

        /**
         * affectServiceId.
         */
        public Builder affectServiceId(Long affectServiceId) {
            this.putBodyParameter("affectServiceId", affectServiceId);
            this.affectServiceId = affectServiceId;
            return this;
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
         * discoveryEndTime.
         */
        public Builder discoveryEndTime(String discoveryEndTime) {
            this.putBodyParameter("discoveryEndTime", discoveryEndTime);
            this.discoveryEndTime = discoveryEndTime;
            return this;
        }

        /**
         * discoveryStartTime.
         */
        public Builder discoveryStartTime(String discoveryStartTime) {
            this.putBodyParameter("discoveryStartTime", discoveryStartTime);
            this.discoveryStartTime = discoveryStartTime;
            return this;
        }

        /**
         * mainHandlerId.
         */
        public Builder mainHandlerId(Long mainHandlerId) {
            this.putBodyParameter("mainHandlerId", mainHandlerId);
            this.mainHandlerId = mainHandlerId;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * problemLevel.
         */
        public Builder problemLevel(String problemLevel) {
            this.putBodyParameter("problemLevel", problemLevel);
            this.problemLevel = problemLevel;
            return this;
        }

        /**
         * problemStatus.
         */
        public Builder problemStatus(String problemStatus) {
            this.putBodyParameter("problemStatus", problemStatus);
            this.problemStatus = problemStatus;
            return this;
        }

        /**
         * queryType.
         */
        public Builder queryType(String queryType) {
            this.putBodyParameter("queryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * repeaterId.
         */
        public Builder repeaterId(Long repeaterId) {
            this.putBodyParameter("repeaterId", repeaterId);
            this.repeaterId = repeaterId;
            return this;
        }

        /**
         * restoreEndTime.
         */
        public Builder restoreEndTime(String restoreEndTime) {
            this.putBodyParameter("restoreEndTime", restoreEndTime);
            this.restoreEndTime = restoreEndTime;
            return this;
        }

        /**
         * restoreStartTime.
         */
        public Builder restoreStartTime(String restoreStartTime) {
            this.putBodyParameter("restoreStartTime", restoreStartTime);
            this.restoreStartTime = restoreStartTime;
            return this;
        }

        /**
         * serviceGroupId.
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
