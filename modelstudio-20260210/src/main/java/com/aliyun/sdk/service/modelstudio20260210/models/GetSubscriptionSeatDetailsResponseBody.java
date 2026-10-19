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
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
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
             * <p>The end time of the current cycle, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1755273600</p>
             */
            public Builder cycleEndTime(Long cycleEndTime) {
                this.cycleEndTime = cycleEndTime;
                return this;
            }

            /**
             * <p>The equity code (subscription code). This does not need to be consumed in CREDITS scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder cycleInstanceId(String cycleInstanceId) {
                this.cycleInstanceId = cycleInstanceId;
                return this;
            }

            /**
             * <p>The start time of the current cycle, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1775232000</p>
             */
            public Builder cycleStartTime(Long cycleStartTime) {
                this.cycleStartTime = cycleStartTime;
                return this;
            }

            /**
             * <p>The remaining quota of the current cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>40.00000000</p>
             */
            public Builder cycleSurplusValue(Double cycleSurplusValue) {
                this.cycleSurplusValue = cycleSurplusValue;
                return this;
            }

            /**
             * <p>The total quota of the current cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>100.00000000</p>
             */
            public Builder cycleTotalValue(Double cycleTotalValue) {
                this.cycleTotalValue = cycleTotalValue;
                return this;
            }

            /**
             * <p>The time-series version of the current cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cycleVersion(Long cycleVersion) {
                this.cycleVersion = cycleVersion;
                return this;
            }

            /**
             * <p>The equity type, such as CREDITS, SPN, or resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>CREDITS</p>
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
             * <p>The mailbox of the member accounts.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@email.com">test@email.com</a></p>
             */
            public Builder accountEmail(String accountEmail) {
                this.accountEmail = accountEmail;
                return this;
            }

            /**
             * <p>The ID of the attached member accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>acc_123456789</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The name of the member accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>ExampleName</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The assignment status. Valid values:</p>
             * <ul>
             * <li>ASSIGNED</li>
             * <li>UNASSIGNED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ASSIGNED</p>
             */
            public Builder assignedStatus(String assignedStatus) {
                this.assignedStatus = assignedStatus;
                return this;
            }

            /**
             * <p>The expiration time of the seat.</p>
             * 
             * <strong>example:</strong>
             * <p>1781422733</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The currently active equity instances. For TokenPlan products, this list contains only one active equity instance.</p>
             */
            public Builder equityList(java.util.List<EquityList> equityList) {
                this.equityList = equityList;
                return this;
            }

            /**
             * <p>The instance code of the seat.</p>
             * 
             * <strong>example:</strong>
             * <p>subs-1234567</p>
             */
            public Builder instanceCode(String instanceCode) {
                this.instanceCode = instanceCode;
                return this;
            }

            /**
             * <p>The seat ID.</p>
             * 
             * <strong>example:</strong>
             * <p>seat_123456</p>
             */
            public Builder seatId(String seatId) {
                this.seatId = seatId;
                return this;
            }

            /**
             * <p>The seat type. Valid values: </p>
             * <ul>
             * <li>standard: standard seat.</li>
             * <li>pro: pro seat.</li>
             * <li>max: premium seat.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * <p>The start time of the seat.</p>
             * 
             * <strong>example:</strong>
             * <p>1781422733</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The seat status. Valid values:</p>
             * <ul>
             * <li>CREATING: being created.</li>
             * <li>NORMAL: active.</li>
             * <li>LIMIT: restricted due to overdue payment.</li>
             * <li>RELEASE: released upon expiration.</li>
             * <li>STOP: stopped upon expiration.</li>
             * <li>REFUNDED: refunded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
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
             * <p>The data items.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The page number. The value is greater than 0 and does not exceed the maximum value of the Integer data type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of seats.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
