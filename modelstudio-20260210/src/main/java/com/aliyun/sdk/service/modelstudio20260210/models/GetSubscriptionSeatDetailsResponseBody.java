// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link GetSubscriptionSeatDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubscriptionSeatDetailsResponseBody</p>
 */
public class GetSubscriptionSeatDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSubscriptionSeatDetailsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubscriptionSeatDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSubscriptionSeatDetailsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSubscriptionSeatDetailsResponseBody build() {
            return new GetSubscriptionSeatDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSubscriptionSeatDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubscriptionSeatDetailsResponseBody</p>
     */
    public static class EquityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleEndTime")
        private Long cycleEndTime;

        @com.aliyun.core.annotation.NameInMap("CycleInstanceId")
        private String cycleInstanceId;

        @com.aliyun.core.annotation.NameInMap("CycleStartTime")
        private Long cycleStartTime;

        @com.aliyun.core.annotation.NameInMap("CycleSurplusValue")
        private Double cycleSurplusValue;

        @com.aliyun.core.annotation.NameInMap("CycleTotalValue")
        private Double cycleTotalValue;

        @com.aliyun.core.annotation.NameInMap("CycleVersion")
        private Long cycleVersion;

        @com.aliyun.core.annotation.NameInMap("EquityType")
        private String equityType;

        private EquityList(Builder builder) {
            this.cycleEndTime = builder.cycleEndTime;
            this.cycleInstanceId = builder.cycleInstanceId;
            this.cycleStartTime = builder.cycleStartTime;
            this.cycleSurplusValue = builder.cycleSurplusValue;
            this.cycleTotalValue = builder.cycleTotalValue;
            this.cycleVersion = builder.cycleVersion;
            this.equityType = builder.equityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EquityList create() {
            return builder().build();
        }

        /**
         * @return cycleEndTime
         */
        public Long getCycleEndTime() {
            return this.cycleEndTime;
        }

        /**
         * @return cycleInstanceId
         */
        public String getCycleInstanceId() {
            return this.cycleInstanceId;
        }

        /**
         * @return cycleStartTime
         */
        public Long getCycleStartTime() {
            return this.cycleStartTime;
        }

        /**
         * @return cycleSurplusValue
         */
        public Double getCycleSurplusValue() {
            return this.cycleSurplusValue;
        }

        /**
         * @return cycleTotalValue
         */
        public Double getCycleTotalValue() {
            return this.cycleTotalValue;
        }

        /**
         * @return cycleVersion
         */
        public Long getCycleVersion() {
            return this.cycleVersion;
        }

        /**
         * @return equityType
         */
        public String getEquityType() {
            return this.equityType;
        }

        public static final class Builder {
            private Long cycleEndTime; 
            private String cycleInstanceId; 
            private Long cycleStartTime; 
            private Double cycleSurplusValue; 
            private Double cycleTotalValue; 
            private Long cycleVersion; 
            private String equityType; 

            private Builder() {
            } 

            private Builder(EquityList model) {
                this.cycleEndTime = model.cycleEndTime;
                this.cycleInstanceId = model.cycleInstanceId;
                this.cycleStartTime = model.cycleStartTime;
                this.cycleSurplusValue = model.cycleSurplusValue;
                this.cycleTotalValue = model.cycleTotalValue;
                this.cycleVersion = model.cycleVersion;
                this.equityType = model.equityType;
            } 

            /**
             * CycleEndTime.
             */
            public Builder cycleEndTime(Long cycleEndTime) {
                this.cycleEndTime = cycleEndTime;
                return this;
            }

            /**
             * CycleInstanceId.
             */
            public Builder cycleInstanceId(String cycleInstanceId) {
                this.cycleInstanceId = cycleInstanceId;
                return this;
            }

            /**
             * CycleStartTime.
             */
            public Builder cycleStartTime(Long cycleStartTime) {
                this.cycleStartTime = cycleStartTime;
                return this;
            }

            /**
             * CycleSurplusValue.
             */
            public Builder cycleSurplusValue(Double cycleSurplusValue) {
                this.cycleSurplusValue = cycleSurplusValue;
                return this;
            }

            /**
             * CycleTotalValue.
             */
            public Builder cycleTotalValue(Double cycleTotalValue) {
                this.cycleTotalValue = cycleTotalValue;
                return this;
            }

            /**
             * CycleVersion.
             */
            public Builder cycleVersion(Long cycleVersion) {
                this.cycleVersion = cycleVersion;
                return this;
            }

            /**
             * EquityType.
             */
            public Builder equityType(String equityType) {
                this.equityType = equityType;
                return this;
            }

            public EquityList build() {
                return new EquityList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSubscriptionSeatDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubscriptionSeatDetailsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountEmail")
        private String accountEmail;

        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AssignedStatus")
        private String assignedStatus;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EquityList")
        private java.util.List<EquityList> equityList;

        @com.aliyun.core.annotation.NameInMap("InstanceCode")
        private String instanceCode;

        @com.aliyun.core.annotation.NameInMap("SeatId")
        private String seatId;

        @com.aliyun.core.annotation.NameInMap("SpecType")
        private String specType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Items(Builder builder) {
            this.accountEmail = builder.accountEmail;
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.assignedStatus = builder.assignedStatus;
            this.endTime = builder.endTime;
            this.equityList = builder.equityList;
            this.instanceCode = builder.instanceCode;
            this.seatId = builder.seatId;
            this.specType = builder.specType;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return accountEmail
         */
        public String getAccountEmail() {
            return this.accountEmail;
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return assignedStatus
         */
        public String getAssignedStatus() {
            return this.assignedStatus;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return equityList
         */
        public java.util.List<EquityList> getEquityList() {
            return this.equityList;
        }

        /**
         * @return instanceCode
         */
        public String getInstanceCode() {
            return this.instanceCode;
        }

        /**
         * @return seatId
         */
        public String getSeatId() {
            return this.seatId;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String accountEmail; 
            private String accountId; 
            private String accountName; 
            private String assignedStatus; 
            private Long endTime; 
            private java.util.List<EquityList> equityList; 
            private String instanceCode; 
            private String seatId; 
            private String specType; 
            private Long startTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.accountEmail = model.accountEmail;
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.assignedStatus = model.assignedStatus;
                this.endTime = model.endTime;
                this.equityList = model.equityList;
                this.instanceCode = model.instanceCode;
                this.seatId = model.seatId;
                this.specType = model.specType;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * AccountEmail.
             */
            public Builder accountEmail(String accountEmail) {
                this.accountEmail = accountEmail;
                return this;
            }

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * AssignedStatus.
             */
            public Builder assignedStatus(String assignedStatus) {
                this.assignedStatus = assignedStatus;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EquityList.
             */
            public Builder equityList(java.util.List<EquityList> equityList) {
                this.equityList = equityList;
                return this;
            }

            /**
             * InstanceCode.
             */
            public Builder instanceCode(String instanceCode) {
                this.instanceCode = instanceCode;
                return this;
            }

            /**
             * SeatId.
             */
            public Builder seatId(String seatId) {
                this.seatId = seatId;
                return this;
            }

            /**
             * SpecType.
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSubscriptionSeatDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubscriptionSeatDetailsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.items = builder.items;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * Items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
