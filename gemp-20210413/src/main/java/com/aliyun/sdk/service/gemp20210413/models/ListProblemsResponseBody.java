// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProblemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProblemsResponseBody</p>
 */
public class ListProblemsResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("pageNumber")
    private Long pageNumber;

    @NameInMap("pageSize")
    private Long pageSize;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("totalCount")
    private Long totalCount;

    private ListProblemsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProblemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProblemsResponseBody build() {
            return new ListProblemsResponseBody(this);
        } 

    } 

    public static class AffectServices extends TeaModel {
        @NameInMap("serviceDescription")
        private String serviceDescription;

        @NameInMap("serviceId")
        private Long serviceId;

        @NameInMap("serviceName")
        private String serviceName;

        @NameInMap("updateTime")
        private String updateTime;

        private AffectServices(Builder builder) {
            this.serviceDescription = builder.serviceDescription;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AffectServices create() {
            return builder().build();
        }

        /**
         * @return serviceDescription
         */
        public String getServiceDescription() {
            return this.serviceDescription;
        }

        /**
         * @return serviceId
         */
        public Long getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String serviceDescription; 
            private Long serviceId; 
            private String serviceName; 
            private String updateTime; 

            /**
             * serviceDescription.
             */
            public Builder serviceDescription(String serviceDescription) {
                this.serviceDescription = serviceDescription;
                return this;
            }

            /**
             * serviceId.
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * serviceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public AffectServices build() {
                return new AffectServices(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("affectServices")
        private java.util.List < AffectServices> affectServices;

        @NameInMap("cancelTime")
        private String cancelTime;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("discoverTime")
        private String discoverTime;

        @NameInMap("finishTime")
        private String finishTime;

        @NameInMap("incidentId")
        private Long incidentId;

        @NameInMap("isManual")
        private Boolean isManual;

        @NameInMap("isUpgrade")
        private Boolean isUpgrade;

        @NameInMap("mainHandlerId")
        private Long mainHandlerId;

        @NameInMap("mainHandlerIsValid")
        private Long mainHandlerIsValid;

        @NameInMap("mainHandlerName")
        private String mainHandlerName;

        @NameInMap("problemId")
        private Long problemId;

        @NameInMap("problemLevel")
        private String problemLevel;

        @NameInMap("problemName")
        private String problemName;

        @NameInMap("problemNumber")
        private String problemNumber;

        @NameInMap("problemStatus")
        private String problemStatus;

        @NameInMap("recoveryTime")
        private String recoveryTime;

        @NameInMap("relatedServiceId")
        private String relatedServiceId;

        @NameInMap("replayTime")
        private String replayTime;

        @NameInMap("serviceDeletedType")
        private Integer serviceDeletedType;

        @NameInMap("serviceName")
        private String serviceName;

        @NameInMap("updateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.affectServices = builder.affectServices;
            this.cancelTime = builder.cancelTime;
            this.createTime = builder.createTime;
            this.discoverTime = builder.discoverTime;
            this.finishTime = builder.finishTime;
            this.incidentId = builder.incidentId;
            this.isManual = builder.isManual;
            this.isUpgrade = builder.isUpgrade;
            this.mainHandlerId = builder.mainHandlerId;
            this.mainHandlerIsValid = builder.mainHandlerIsValid;
            this.mainHandlerName = builder.mainHandlerName;
            this.problemId = builder.problemId;
            this.problemLevel = builder.problemLevel;
            this.problemName = builder.problemName;
            this.problemNumber = builder.problemNumber;
            this.problemStatus = builder.problemStatus;
            this.recoveryTime = builder.recoveryTime;
            this.relatedServiceId = builder.relatedServiceId;
            this.replayTime = builder.replayTime;
            this.serviceDeletedType = builder.serviceDeletedType;
            this.serviceName = builder.serviceName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return affectServices
         */
        public java.util.List < AffectServices> getAffectServices() {
            return this.affectServices;
        }

        /**
         * @return cancelTime
         */
        public String getCancelTime() {
            return this.cancelTime;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return discoverTime
         */
        public String getDiscoverTime() {
            return this.discoverTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return incidentId
         */
        public Long getIncidentId() {
            return this.incidentId;
        }

        /**
         * @return isManual
         */
        public Boolean getIsManual() {
            return this.isManual;
        }

        /**
         * @return isUpgrade
         */
        public Boolean getIsUpgrade() {
            return this.isUpgrade;
        }

        /**
         * @return mainHandlerId
         */
        public Long getMainHandlerId() {
            return this.mainHandlerId;
        }

        /**
         * @return mainHandlerIsValid
         */
        public Long getMainHandlerIsValid() {
            return this.mainHandlerIsValid;
        }

        /**
         * @return mainHandlerName
         */
        public String getMainHandlerName() {
            return this.mainHandlerName;
        }

        /**
         * @return problemId
         */
        public Long getProblemId() {
            return this.problemId;
        }

        /**
         * @return problemLevel
         */
        public String getProblemLevel() {
            return this.problemLevel;
        }

        /**
         * @return problemName
         */
        public String getProblemName() {
            return this.problemName;
        }

        /**
         * @return problemNumber
         */
        public String getProblemNumber() {
            return this.problemNumber;
        }

        /**
         * @return problemStatus
         */
        public String getProblemStatus() {
            return this.problemStatus;
        }

        /**
         * @return recoveryTime
         */
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        /**
         * @return relatedServiceId
         */
        public String getRelatedServiceId() {
            return this.relatedServiceId;
        }

        /**
         * @return replayTime
         */
        public String getReplayTime() {
            return this.replayTime;
        }

        /**
         * @return serviceDeletedType
         */
        public Integer getServiceDeletedType() {
            return this.serviceDeletedType;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List < AffectServices> affectServices; 
            private String cancelTime; 
            private String createTime; 
            private String discoverTime; 
            private String finishTime; 
            private Long incidentId; 
            private Boolean isManual; 
            private Boolean isUpgrade; 
            private Long mainHandlerId; 
            private Long mainHandlerIsValid; 
            private String mainHandlerName; 
            private Long problemId; 
            private String problemLevel; 
            private String problemName; 
            private String problemNumber; 
            private String problemStatus; 
            private String recoveryTime; 
            private String relatedServiceId; 
            private String replayTime; 
            private Integer serviceDeletedType; 
            private String serviceName; 
            private String updateTime; 

            /**
             * affectServices.
             */
            public Builder affectServices(java.util.List < AffectServices> affectServices) {
                this.affectServices = affectServices;
                return this;
            }

            /**
             * cancelTime.
             */
            public Builder cancelTime(String cancelTime) {
                this.cancelTime = cancelTime;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * discoverTime.
             */
            public Builder discoverTime(String discoverTime) {
                this.discoverTime = discoverTime;
                return this;
            }

            /**
             * finishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * incidentId.
             */
            public Builder incidentId(Long incidentId) {
                this.incidentId = incidentId;
                return this;
            }

            /**
             * isManual.
             */
            public Builder isManual(Boolean isManual) {
                this.isManual = isManual;
                return this;
            }

            /**
             * isUpgrade.
             */
            public Builder isUpgrade(Boolean isUpgrade) {
                this.isUpgrade = isUpgrade;
                return this;
            }

            /**
             * mainHandlerId.
             */
            public Builder mainHandlerId(Long mainHandlerId) {
                this.mainHandlerId = mainHandlerId;
                return this;
            }

            /**
             * mainHandlerIsValid.
             */
            public Builder mainHandlerIsValid(Long mainHandlerIsValid) {
                this.mainHandlerIsValid = mainHandlerIsValid;
                return this;
            }

            /**
             * mainHandlerName.
             */
            public Builder mainHandlerName(String mainHandlerName) {
                this.mainHandlerName = mainHandlerName;
                return this;
            }

            /**
             * problemId.
             */
            public Builder problemId(Long problemId) {
                this.problemId = problemId;
                return this;
            }

            /**
             * problemLevel.
             */
            public Builder problemLevel(String problemLevel) {
                this.problemLevel = problemLevel;
                return this;
            }

            /**
             * problemName.
             */
            public Builder problemName(String problemName) {
                this.problemName = problemName;
                return this;
            }

            /**
             * problemNumber.
             */
            public Builder problemNumber(String problemNumber) {
                this.problemNumber = problemNumber;
                return this;
            }

            /**
             * problemStatus.
             */
            public Builder problemStatus(String problemStatus) {
                this.problemStatus = problemStatus;
                return this;
            }

            /**
             * recoveryTime.
             */
            public Builder recoveryTime(String recoveryTime) {
                this.recoveryTime = recoveryTime;
                return this;
            }

            /**
             * relatedServiceId.
             */
            public Builder relatedServiceId(String relatedServiceId) {
                this.relatedServiceId = relatedServiceId;
                return this;
            }

            /**
             * replayTime.
             */
            public Builder replayTime(String replayTime) {
                this.replayTime = replayTime;
                return this;
            }

            /**
             * serviceDeletedType.
             */
            public Builder serviceDeletedType(Integer serviceDeletedType) {
                this.serviceDeletedType = serviceDeletedType;
                return this;
            }

            /**
             * serviceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
