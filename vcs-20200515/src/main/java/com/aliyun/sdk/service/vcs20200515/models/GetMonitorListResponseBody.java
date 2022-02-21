// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMonitorListResponseBody} extends {@link TeaModel}
 *
 * <p>GetMonitorListResponseBody</p>
 */
public class GetMonitorListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetMonitorListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMonitorListResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMonitorListResponseBody build() {
            return new GetMonitorListResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("AlgorithmVendor")
        private String algorithmVendor;

        @NameInMap("Attributes")
        private String attributes;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("Description")
        private String description;

        @NameInMap("DeviceList")
        private String deviceList;

        @NameInMap("Expression")
        private String expression;

        @NameInMap("ImageMatch")
        private String imageMatch;

        @NameInMap("ModifiedDate")
        private String modifiedDate;

        @NameInMap("MonitorType")
        private String monitorType;

        @NameInMap("NotifierExtendValues")
        private String notifierExtendValues;

        @NameInMap("NotifierType")
        private String notifierType;

        @NameInMap("RuleExpression")
        private String ruleExpression;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private String taskId;

        private Records(Builder builder) {
            this.algorithmVendor = builder.algorithmVendor;
            this.attributes = builder.attributes;
            this.createDate = builder.createDate;
            this.description = builder.description;
            this.deviceList = builder.deviceList;
            this.expression = builder.expression;
            this.imageMatch = builder.imageMatch;
            this.modifiedDate = builder.modifiedDate;
            this.monitorType = builder.monitorType;
            this.notifierExtendValues = builder.notifierExtendValues;
            this.notifierType = builder.notifierType;
            this.ruleExpression = builder.ruleExpression;
            this.ruleName = builder.ruleName;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return algorithmVendor
         */
        public String getAlgorithmVendor() {
            return this.algorithmVendor;
        }

        /**
         * @return attributes
         */
        public String getAttributes() {
            return this.attributes;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return deviceList
         */
        public String getDeviceList() {
            return this.deviceList;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return imageMatch
         */
        public String getImageMatch() {
            return this.imageMatch;
        }

        /**
         * @return modifiedDate
         */
        public String getModifiedDate() {
            return this.modifiedDate;
        }

        /**
         * @return monitorType
         */
        public String getMonitorType() {
            return this.monitorType;
        }

        /**
         * @return notifierExtendValues
         */
        public String getNotifierExtendValues() {
            return this.notifierExtendValues;
        }

        /**
         * @return notifierType
         */
        public String getNotifierType() {
            return this.notifierType;
        }

        /**
         * @return ruleExpression
         */
        public String getRuleExpression() {
            return this.ruleExpression;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String algorithmVendor; 
            private String attributes; 
            private String createDate; 
            private String description; 
            private String deviceList; 
            private String expression; 
            private String imageMatch; 
            private String modifiedDate; 
            private String monitorType; 
            private String notifierExtendValues; 
            private String notifierType; 
            private String ruleExpression; 
            private String ruleName; 
            private String status; 
            private String taskId; 

            /**
             * AlgorithmVendor.
             */
            public Builder algorithmVendor(String algorithmVendor) {
                this.algorithmVendor = algorithmVendor;
                return this;
            }

            /**
             * Attributes.
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DeviceList.
             */
            public Builder deviceList(String deviceList) {
                this.deviceList = deviceList;
                return this;
            }

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * ImageMatch.
             */
            public Builder imageMatch(String imageMatch) {
                this.imageMatch = imageMatch;
                return this;
            }

            /**
             * ModifiedDate.
             */
            public Builder modifiedDate(String modifiedDate) {
                this.modifiedDate = modifiedDate;
                return this;
            }

            /**
             * MonitorType.
             */
            public Builder monitorType(String monitorType) {
                this.monitorType = monitorType;
                return this;
            }

            /**
             * NotifierExtendValues.
             */
            public Builder notifierExtendValues(String notifierExtendValues) {
                this.notifierExtendValues = notifierExtendValues;
                return this;
            }

            /**
             * NotifierType.
             */
            public Builder notifierType(String notifierType) {
                this.notifierType = notifierType;
                return this;
            }

            /**
             * RuleExpression.
             */
            public Builder ruleExpression(String ruleExpression) {
                this.ruleExpression = ruleExpression;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Records")
        private java.util.List < Records> records;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("TotalPage")
        private Integer totalPage;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalCount = builder.totalCount;
            this.totalPage = builder.totalPage;
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
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < Records> records; 
            private Integer totalCount; 
            private Integer totalPage; 

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
             * Records.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
