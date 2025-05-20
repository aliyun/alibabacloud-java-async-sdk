// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link ListAutoScalingRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAutoScalingRecordsResponseBody</p>
 */
public class ListAutoScalingRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAutoScalingRecordsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAutoScalingRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAutoScalingRecordsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
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
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAutoScalingRecordsResponseBody build() {
            return new ListAutoScalingRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAutoScalingRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoScalingRecordsResponseBody</p>
     */
    public static class ScaleRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OldValue")
        private String oldValue;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SpecGroupId")
        private String specGroupId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private String strategy;

        @com.aliyun.core.annotation.NameInMap("TargetValue")
        private String targetValue;

        private ScaleRecords(Builder builder) {
            this.detail = builder.detail;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.oldValue = builder.oldValue;
            this.resourceType = builder.resourceType;
            this.specGroupId = builder.specGroupId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.strategy = builder.strategy;
            this.targetValue = builder.targetValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleRecords create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return oldValue
         */
        public String getOldValue() {
            return this.oldValue;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return specGroupId
         */
        public String getSpecGroupId() {
            return this.specGroupId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategy
         */
        public String getStrategy() {
            return this.strategy;
        }

        /**
         * @return targetValue
         */
        public String getTargetValue() {
            return this.targetValue;
        }

        public static final class Builder {
            private String detail; 
            private String endTime; 
            private String id; 
            private String instanceId; 
            private String oldValue; 
            private String resourceType; 
            private String specGroupId; 
            private String startTime; 
            private String status; 
            private String strategy; 
            private String targetValue; 

            private Builder() {
            } 

            private Builder(ScaleRecords model) {
                this.detail = model.detail;
                this.endTime = model.endTime;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.oldValue = model.oldValue;
                this.resourceType = model.resourceType;
                this.specGroupId = model.specGroupId;
                this.startTime = model.startTime;
                this.status = model.status;
                this.strategy = model.strategy;
                this.targetValue = model.targetValue;
            } 

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * OldValue.
             */
            public Builder oldValue(String oldValue) {
                this.oldValue = oldValue;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * SpecGroupId.
             */
            public Builder specGroupId(String specGroupId) {
                this.specGroupId = specGroupId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
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

            /**
             * Strategy.
             */
            public Builder strategy(String strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * TargetValue.
             */
            public Builder targetValue(String targetValue) {
                this.targetValue = targetValue;
                return this;
            }

            public ScaleRecords build() {
                return new ScaleRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAutoScalingRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoScalingRecordsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ScaleRecords")
        private java.util.List<ScaleRecords> scaleRecords;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Integer totalNum;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Integer totalPage;

        private Data(Builder builder) {
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.scaleRecords = builder.scaleRecords;
            this.totalNum = builder.totalNum;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return scaleRecords
         */
        public java.util.List<ScaleRecords> getScaleRecords() {
            return this.scaleRecords;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Integer pageNum; 
            private Integer pageSize; 
            private java.util.List<ScaleRecords> scaleRecords; 
            private Integer totalNum; 
            private Integer totalPage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.scaleRecords = model.scaleRecords;
                this.totalNum = model.totalNum;
                this.totalPage = model.totalPage;
            } 

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
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
             * ScaleRecords.
             */
            public Builder scaleRecords(java.util.List<ScaleRecords> scaleRecords) {
                this.scaleRecords = scaleRecords;
                return this;
            }

            /**
             * TotalNum.
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
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
