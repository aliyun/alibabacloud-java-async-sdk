// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcDoubleCheckupResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcIcDoubleCheckupResponseBody</p>
 */
public class GetOcIcDoubleCheckupResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageIndex")
    private Integer pageIndex;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalNum")
    private Integer totalNum;

    private GetOcIcDoubleCheckupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageIndex = builder.pageIndex;
        this.pageNum = builder.pageNum;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOcIcDoubleCheckupResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
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

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pageIndex; 
        private Integer pageNum; 
        private String requestId; 
        private Boolean success; 
        private Integer totalNum; 

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
        public Builder data(java.util.List < Data> data) {
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
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
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

        /**
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public GetOcIcDoubleCheckupResponseBody build() {
            return new GetOcIcDoubleCheckupResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("InspectDate")
        private String inspectDate;

        @NameInMap("InspectDepartment")
        private String inspectDepartment;

        @NameInMap("InspectItem")
        private String inspectItem;

        @NameInMap("InspectPlanId")
        private String inspectPlanId;

        @NameInMap("InspectPlanName")
        private String inspectPlanName;

        @NameInMap("InspectResult")
        private String inspectResult;

        @NameInMap("InspectTaskId")
        private String inspectTaskId;

        @NameInMap("InspectTaskName")
        private String inspectTaskName;

        @NameInMap("InspectTypeName")
        private String inspectTypeName;

        private Data(Builder builder) {
            this.inspectDate = builder.inspectDate;
            this.inspectDepartment = builder.inspectDepartment;
            this.inspectItem = builder.inspectItem;
            this.inspectPlanId = builder.inspectPlanId;
            this.inspectPlanName = builder.inspectPlanName;
            this.inspectResult = builder.inspectResult;
            this.inspectTaskId = builder.inspectTaskId;
            this.inspectTaskName = builder.inspectTaskName;
            this.inspectTypeName = builder.inspectTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return inspectDate
         */
        public String getInspectDate() {
            return this.inspectDate;
        }

        /**
         * @return inspectDepartment
         */
        public String getInspectDepartment() {
            return this.inspectDepartment;
        }

        /**
         * @return inspectItem
         */
        public String getInspectItem() {
            return this.inspectItem;
        }

        /**
         * @return inspectPlanId
         */
        public String getInspectPlanId() {
            return this.inspectPlanId;
        }

        /**
         * @return inspectPlanName
         */
        public String getInspectPlanName() {
            return this.inspectPlanName;
        }

        /**
         * @return inspectResult
         */
        public String getInspectResult() {
            return this.inspectResult;
        }

        /**
         * @return inspectTaskId
         */
        public String getInspectTaskId() {
            return this.inspectTaskId;
        }

        /**
         * @return inspectTaskName
         */
        public String getInspectTaskName() {
            return this.inspectTaskName;
        }

        /**
         * @return inspectTypeName
         */
        public String getInspectTypeName() {
            return this.inspectTypeName;
        }

        public static final class Builder {
            private String inspectDate; 
            private String inspectDepartment; 
            private String inspectItem; 
            private String inspectPlanId; 
            private String inspectPlanName; 
            private String inspectResult; 
            private String inspectTaskId; 
            private String inspectTaskName; 
            private String inspectTypeName; 

            /**
             * 抽查完成时间
             */
            public Builder inspectDate(String inspectDate) {
                this.inspectDate = inspectDate;
                return this;
            }

            /**
             * 抽查机关
             */
            public Builder inspectDepartment(String inspectDepartment) {
                this.inspectDepartment = inspectDepartment;
                return this;
            }

            /**
             * 检查事项
             */
            public Builder inspectItem(String inspectItem) {
                this.inspectItem = inspectItem;
                return this;
            }

            /**
             * 抽查计划编号
             */
            public Builder inspectPlanId(String inspectPlanId) {
                this.inspectPlanId = inspectPlanId;
                return this;
            }

            /**
             * 抽查计划名称
             */
            public Builder inspectPlanName(String inspectPlanName) {
                this.inspectPlanName = inspectPlanName;
                return this;
            }

            /**
             * 检查结果
             */
            public Builder inspectResult(String inspectResult) {
                this.inspectResult = inspectResult;
                return this;
            }

            /**
             * 抽查任务编号
             */
            public Builder inspectTaskId(String inspectTaskId) {
                this.inspectTaskId = inspectTaskId;
                return this;
            }

            /**
             * 抽查任务名称
             */
            public Builder inspectTaskName(String inspectTaskName) {
                this.inspectTaskName = inspectTaskName;
                return this;
            }

            /**
             * 抽查类型
             */
            public Builder inspectTypeName(String inspectTypeName) {
                this.inspectTypeName = inspectTypeName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
