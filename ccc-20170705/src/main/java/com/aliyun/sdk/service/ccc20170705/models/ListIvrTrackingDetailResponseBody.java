// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link ListIvrTrackingDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListIvrTrackingDetailResponseBody</p>
 */
public class ListIvrTrackingDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("IvrTrackingDetails")
    private IvrTrackingDetails ivrTrackingDetails;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListIvrTrackingDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.ivrTrackingDetails = builder.ivrTrackingDetails;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIvrTrackingDetailResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return ivrTrackingDetails
     */
    public IvrTrackingDetails getIvrTrackingDetails() {
        return this.ivrTrackingDetails;
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
        private String code; 
        private Integer httpStatusCode; 
        private IvrTrackingDetails ivrTrackingDetails; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListIvrTrackingDetailResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.ivrTrackingDetails = model.ivrTrackingDetails;
            this.message = model.message;
            this.requestId = model.requestId;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * IvrTrackingDetails.
         */
        public Builder ivrTrackingDetails(IvrTrackingDetails ivrTrackingDetails) {
            this.ivrTrackingDetails = ivrTrackingDetails;
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

        public ListIvrTrackingDetailResponseBody build() {
            return new ListIvrTrackingDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIvrTrackingDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListIvrTrackingDetailResponseBody</p>
     */
    public static class IvrTrackingDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CallingNumber")
        private String callingNumber;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DeviceID")
        private String deviceID;

        @com.aliyun.core.annotation.NameInMap("FlowName")
        private String flowName;

        @com.aliyun.core.annotation.NameInMap("InputData")
        private String inputData;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("OutputData")
        private String outputData;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StopTime")
        private Long stopTime;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private IvrTrackingDetail(Builder builder) {
            this.calledNumber = builder.calledNumber;
            this.callingNumber = builder.callingNumber;
            this.contactId = builder.contactId;
            this.description = builder.description;
            this.deviceID = builder.deviceID;
            this.flowName = builder.flowName;
            this.inputData = builder.inputData;
            this.nodeName = builder.nodeName;
            this.nodeType = builder.nodeType;
            this.outputData = builder.outputData;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.stopTime = builder.stopTime;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IvrTrackingDetail create() {
            return builder().build();
        }

        /**
         * @return calledNumber
         */
        public String getCalledNumber() {
            return this.calledNumber;
        }

        /**
         * @return callingNumber
         */
        public String getCallingNumber() {
            return this.callingNumber;
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return deviceID
         */
        public String getDeviceID() {
            return this.deviceID;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        /**
         * @return inputData
         */
        public String getInputData() {
            return this.inputData;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return outputData
         */
        public String getOutputData() {
            return this.outputData;
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

        /**
         * @return stopTime
         */
        public Long getStopTime() {
            return this.stopTime;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String calledNumber; 
            private String callingNumber; 
            private String contactId; 
            private String description; 
            private String deviceID; 
            private String flowName; 
            private String inputData; 
            private String nodeName; 
            private String nodeType; 
            private String outputData; 
            private Long startTime; 
            private String status; 
            private Long stopTime; 
            private String tenantId; 

            private Builder() {
            } 

            private Builder(IvrTrackingDetail model) {
                this.calledNumber = model.calledNumber;
                this.callingNumber = model.callingNumber;
                this.contactId = model.contactId;
                this.description = model.description;
                this.deviceID = model.deviceID;
                this.flowName = model.flowName;
                this.inputData = model.inputData;
                this.nodeName = model.nodeName;
                this.nodeType = model.nodeType;
                this.outputData = model.outputData;
                this.startTime = model.startTime;
                this.status = model.status;
                this.stopTime = model.stopTime;
                this.tenantId = model.tenantId;
            } 

            /**
             * CalledNumber.
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * CallingNumber.
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * ContactId.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
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
             * DeviceID.
             */
            public Builder deviceID(String deviceID) {
                this.deviceID = deviceID;
                return this;
            }

            /**
             * FlowName.
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * InputData.
             */
            public Builder inputData(String inputData) {
                this.inputData = inputData;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * OutputData.
             */
            public Builder outputData(String outputData) {
                this.outputData = outputData;
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

            /**
             * StopTime.
             */
            public Builder stopTime(Long stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public IvrTrackingDetail build() {
                return new IvrTrackingDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIvrTrackingDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListIvrTrackingDetailResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IvrTrackingDetail")
        private java.util.List<IvrTrackingDetail> ivrTrackingDetail;

        private List(Builder builder) {
            this.ivrTrackingDetail = builder.ivrTrackingDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return ivrTrackingDetail
         */
        public java.util.List<IvrTrackingDetail> getIvrTrackingDetail() {
            return this.ivrTrackingDetail;
        }

        public static final class Builder {
            private java.util.List<IvrTrackingDetail> ivrTrackingDetail; 

            private Builder() {
            } 

            private Builder(List model) {
                this.ivrTrackingDetail = model.ivrTrackingDetail;
            } 

            /**
             * IvrTrackingDetail.
             */
            public Builder ivrTrackingDetail(java.util.List<IvrTrackingDetail> ivrTrackingDetail) {
                this.ivrTrackingDetail = ivrTrackingDetail;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIvrTrackingDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListIvrTrackingDetailResponseBody</p>
     */
    public static class IvrTrackingDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private IvrTrackingDetails(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IvrTrackingDetails create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private List list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(IvrTrackingDetails model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * List.
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public IvrTrackingDetails build() {
                return new IvrTrackingDetails(this);
            } 

        } 

    }
}
