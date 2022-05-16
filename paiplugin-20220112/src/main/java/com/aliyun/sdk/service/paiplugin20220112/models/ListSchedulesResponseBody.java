// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSchedulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSchedulesResponseBody</p>
 */
public class ListSchedulesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    private ListSchedulesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSchedulesResponseBody create() {
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
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Integer errorCode; 
        private String errorMessage; 
        private String requestId; 

        /**
         * 返回数据。
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误码。
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息。
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSchedulesResponseBody build() {
            return new ListSchedulesResponseBody(this);
        } 

    } 

    public static class Schedules extends TeaModel {
        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("EndTime")
        private Integer endTime;

        @NameInMap("ExecuteTime")
        private String executeTime;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("RepeatCycle")
        private Integer repeatCycle;

        @NameInMap("RepeatCycleUnit")
        private Integer repeatCycleUnit;

        @NameInMap("RepeatTimes")
        private Integer repeatTimes;

        @NameInMap("SignName")
        private String signName;

        @NameInMap("SignatureId")
        private String signatureId;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TemplateCode")
        private String templateCode;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("UpdatedTime")
        private String updatedTime;

        private Schedules(Builder builder) {
            this.createdTime = builder.createdTime;
            this.endTime = builder.endTime;
            this.executeTime = builder.executeTime;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.name = builder.name;
            this.repeatCycle = builder.repeatCycle;
            this.repeatCycleUnit = builder.repeatCycleUnit;
            this.repeatTimes = builder.repeatTimes;
            this.signName = builder.signName;
            this.signatureId = builder.signatureId;
            this.status = builder.status;
            this.templateCode = builder.templateCode;
            this.templateId = builder.templateId;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schedules create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return endTime
         */
        public Integer getEndTime() {
            return this.endTime;
        }

        /**
         * @return executeTime
         */
        public String getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return repeatCycle
         */
        public Integer getRepeatCycle() {
            return this.repeatCycle;
        }

        /**
         * @return repeatCycleUnit
         */
        public Integer getRepeatCycleUnit() {
            return this.repeatCycleUnit;
        }

        /**
         * @return repeatTimes
         */
        public Integer getRepeatTimes() {
            return this.repeatTimes;
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        /**
         * @return signatureId
         */
        public String getSignatureId() {
            return this.signatureId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return updatedTime
         */
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String createdTime; 
            private Integer endTime; 
            private String executeTime; 
            private String groupId; 
            private String id; 
            private String name; 
            private Integer repeatCycle; 
            private Integer repeatCycleUnit; 
            private Integer repeatTimes; 
            private String signName; 
            private String signatureId; 
            private Integer status; 
            private String templateCode; 
            private String templateId; 
            private String updatedTime; 

            /**
             * 创建时间 (UTC+8)。
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * 终止时间（UTC+8）。
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 执行时间 (UTC+8)，为空立即执行。
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * 人群Id。
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * 触达计划Id。
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 触达计划名称。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 重复周期，按重复周期与重复周期单位执行。
             */
            public Builder repeatCycle(Integer repeatCycle) {
                this.repeatCycle = repeatCycle;
                return this;
            }

            /**
             * 重复周期单位，若指定执行时间，则重复周期生效。
             * <p>
             * - 0: 从不（默认）。
             * - 1: 小时。
             * - 2: 天。
             * - 3: 周。
             * - 4: 月。
             */
            public Builder repeatCycleUnit(Integer repeatCycleUnit) {
                this.repeatCycleUnit = repeatCycleUnit;
                return this;
            }

            /**
             * 重复次数。
             * <p>
             * - -1: 不设终止时间（默认）。
             * - 0: 不重复。
             * - N: 重复N次后终止。
             */
            public Builder repeatTimes(Integer repeatTimes) {
                this.repeatTimes = repeatTimes;
                return this;
            }

            /**
             * 签名。
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            /**
             * 签名Id，或指定签名。
             */
            public Builder signatureId(String signatureId) {
                this.signatureId = signatureId;
                return this;
            }

            /**
             * 状态。
             * <p>
             * - 0: 检查中。
             * - 1: 检查成功。
             * - 2: 检查失败。
             * - 3: 发送中。
             * - 4: 发送成功。
             * - 5: 发送失败。
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 模板Code。
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * 模板Id，或指定模板Code。
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * 更新时间 (UTC+8)。
             */
            public Builder updatedTime(String updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public Schedules build() {
                return new Schedules(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Schedules")
        private java.util.List < Schedules> schedules;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.schedules = builder.schedules;
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
         * @return schedules
         */
        public java.util.List < Schedules> getSchedules() {
            return this.schedules;
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
            private java.util.List < Schedules> schedules; 
            private Integer totalCount; 

            /**
             * 分页数，从1开始，默认为1。
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * 分页大小，默认为10。
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * 触达计划列表。
             */
            public Builder schedules(java.util.List < Schedules> schedules) {
                this.schedules = schedules;
                return this;
            }

            /**
             * 触达计划数量。
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
