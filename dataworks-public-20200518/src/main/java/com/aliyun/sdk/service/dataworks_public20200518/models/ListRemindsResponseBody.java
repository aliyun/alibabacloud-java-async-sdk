// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRemindsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRemindsResponseBody</p>
 */
public class ListRemindsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListRemindsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRemindsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRemindsResponseBody build() {
            return new ListRemindsResponseBody(this);
        } 

    } 

    public static class Reminds extends TeaModel {
        @NameInMap("AlertMethods")
        private java.util.List < String > alertMethods;

        @NameInMap("AlertTargets")
        private java.util.List < String > alertTargets;

        @NameInMap("AlertUnit")
        private String alertUnit;

        @NameInMap("BaselineIds")
        private java.util.List < Long > baselineIds;

        @NameInMap("BizProcessIds")
        private java.util.List < Long > bizProcessIds;

        @NameInMap("DndEnd")
        private String dndEnd;

        @NameInMap("DndStart")
        private String dndStart;

        @NameInMap("Founder")
        private String founder;

        @NameInMap("NodeIds")
        private java.util.List < Long > nodeIds;

        @NameInMap("ProjectIds")
        private java.util.List < Long > projectIds;

        @NameInMap("RemindId")
        private Long remindId;

        @NameInMap("RemindName")
        private String remindName;

        @NameInMap("RemindType")
        private String remindType;

        @NameInMap("RemindUnit")
        private String remindUnit;

        @NameInMap("Useflag")
        private Boolean useflag;

        private Reminds(Builder builder) {
            this.alertMethods = builder.alertMethods;
            this.alertTargets = builder.alertTargets;
            this.alertUnit = builder.alertUnit;
            this.baselineIds = builder.baselineIds;
            this.bizProcessIds = builder.bizProcessIds;
            this.dndEnd = builder.dndEnd;
            this.dndStart = builder.dndStart;
            this.founder = builder.founder;
            this.nodeIds = builder.nodeIds;
            this.projectIds = builder.projectIds;
            this.remindId = builder.remindId;
            this.remindName = builder.remindName;
            this.remindType = builder.remindType;
            this.remindUnit = builder.remindUnit;
            this.useflag = builder.useflag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reminds create() {
            return builder().build();
        }

        /**
         * @return alertMethods
         */
        public java.util.List < String > getAlertMethods() {
            return this.alertMethods;
        }

        /**
         * @return alertTargets
         */
        public java.util.List < String > getAlertTargets() {
            return this.alertTargets;
        }

        /**
         * @return alertUnit
         */
        public String getAlertUnit() {
            return this.alertUnit;
        }

        /**
         * @return baselineIds
         */
        public java.util.List < Long > getBaselineIds() {
            return this.baselineIds;
        }

        /**
         * @return bizProcessIds
         */
        public java.util.List < Long > getBizProcessIds() {
            return this.bizProcessIds;
        }

        /**
         * @return dndEnd
         */
        public String getDndEnd() {
            return this.dndEnd;
        }

        /**
         * @return dndStart
         */
        public String getDndStart() {
            return this.dndStart;
        }

        /**
         * @return founder
         */
        public String getFounder() {
            return this.founder;
        }

        /**
         * @return nodeIds
         */
        public java.util.List < Long > getNodeIds() {
            return this.nodeIds;
        }

        /**
         * @return projectIds
         */
        public java.util.List < Long > getProjectIds() {
            return this.projectIds;
        }

        /**
         * @return remindId
         */
        public Long getRemindId() {
            return this.remindId;
        }

        /**
         * @return remindName
         */
        public String getRemindName() {
            return this.remindName;
        }

        /**
         * @return remindType
         */
        public String getRemindType() {
            return this.remindType;
        }

        /**
         * @return remindUnit
         */
        public String getRemindUnit() {
            return this.remindUnit;
        }

        /**
         * @return useflag
         */
        public Boolean getUseflag() {
            return this.useflag;
        }

        public static final class Builder {
            private java.util.List < String > alertMethods; 
            private java.util.List < String > alertTargets; 
            private String alertUnit; 
            private java.util.List < Long > baselineIds; 
            private java.util.List < Long > bizProcessIds; 
            private String dndEnd; 
            private String dndStart; 
            private String founder; 
            private java.util.List < Long > nodeIds; 
            private java.util.List < Long > projectIds; 
            private Long remindId; 
            private String remindName; 
            private String remindType; 
            private String remindUnit; 
            private Boolean useflag; 

            /**
             * AlertMethods.
             */
            public Builder alertMethods(java.util.List < String > alertMethods) {
                this.alertMethods = alertMethods;
                return this;
            }

            /**
             * AlertTargets.
             */
            public Builder alertTargets(java.util.List < String > alertTargets) {
                this.alertTargets = alertTargets;
                return this;
            }

            /**
             * AlertUnit.
             */
            public Builder alertUnit(String alertUnit) {
                this.alertUnit = alertUnit;
                return this;
            }

            /**
             * BaselineIds.
             */
            public Builder baselineIds(java.util.List < Long > baselineIds) {
                this.baselineIds = baselineIds;
                return this;
            }

            /**
             * BizProcessIds.
             */
            public Builder bizProcessIds(java.util.List < Long > bizProcessIds) {
                this.bizProcessIds = bizProcessIds;
                return this;
            }

            /**
             * DndEnd.
             */
            public Builder dndEnd(String dndEnd) {
                this.dndEnd = dndEnd;
                return this;
            }

            /**
             * DndStart.
             */
            public Builder dndStart(String dndStart) {
                this.dndStart = dndStart;
                return this;
            }

            /**
             * Founder.
             */
            public Builder founder(String founder) {
                this.founder = founder;
                return this;
            }

            /**
             * NodeIds.
             */
            public Builder nodeIds(java.util.List < Long > nodeIds) {
                this.nodeIds = nodeIds;
                return this;
            }

            /**
             * ProjectIds.
             */
            public Builder projectIds(java.util.List < Long > projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * RemindId.
             */
            public Builder remindId(Long remindId) {
                this.remindId = remindId;
                return this;
            }

            /**
             * RemindName.
             */
            public Builder remindName(String remindName) {
                this.remindName = remindName;
                return this;
            }

            /**
             * RemindType.
             */
            public Builder remindType(String remindType) {
                this.remindType = remindType;
                return this;
            }

            /**
             * RemindUnit.
             */
            public Builder remindUnit(String remindUnit) {
                this.remindUnit = remindUnit;
                return this;
            }

            /**
             * Useflag.
             */
            public Builder useflag(Boolean useflag) {
                this.useflag = useflag;
                return this;
            }

            public Reminds build() {
                return new Reminds(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Reminds")
        private java.util.List < Reminds> reminds;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.reminds = builder.reminds;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return reminds
         */
        public java.util.List < Reminds> getReminds() {
            return this.reminds;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < Reminds> reminds; 
            private Integer totalCount; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Reminds.
             */
            public Builder reminds(java.util.List < Reminds> reminds) {
                this.reminds = reminds;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
