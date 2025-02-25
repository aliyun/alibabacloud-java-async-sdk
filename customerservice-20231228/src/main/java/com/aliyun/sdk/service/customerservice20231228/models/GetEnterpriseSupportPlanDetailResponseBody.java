// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.customerservice20231228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnterpriseSupportPlanDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetEnterpriseSupportPlanDetailResponseBody</p>
 */
public class GetEnterpriseSupportPlanDetailResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("message")
    private String message;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private GetEnterpriseSupportPlanDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnterpriseSupportPlanDetailResponseBody create() {
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetEnterpriseSupportPlanDetailResponseBody build() {
            return new GetEnterpriseSupportPlanDetailResponseBody(this);
        } 

    } 

    public static class DingGroups extends TeaModel {
        @NameInMap("mainDingDepartmentId")
        private String mainDingDepartmentId;

        @NameInMap("mainDingGroupId")
        private String mainDingGroupId;

        @NameInMap("mainDingGroupName")
        private String mainDingGroupName;

        @NameInMap("subDingDepartmentId")
        private String subDingDepartmentId;

        @NameInMap("subDingGroupId")
        private String subDingGroupId;

        @NameInMap("subDingGroupName")
        private String subDingGroupName;

        private DingGroups(Builder builder) {
            this.mainDingDepartmentId = builder.mainDingDepartmentId;
            this.mainDingGroupId = builder.mainDingGroupId;
            this.mainDingGroupName = builder.mainDingGroupName;
            this.subDingDepartmentId = builder.subDingDepartmentId;
            this.subDingGroupId = builder.subDingGroupId;
            this.subDingGroupName = builder.subDingGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingGroups create() {
            return builder().build();
        }

        /**
         * @return mainDingDepartmentId
         */
        public String getMainDingDepartmentId() {
            return this.mainDingDepartmentId;
        }

        /**
         * @return mainDingGroupId
         */
        public String getMainDingGroupId() {
            return this.mainDingGroupId;
        }

        /**
         * @return mainDingGroupName
         */
        public String getMainDingGroupName() {
            return this.mainDingGroupName;
        }

        /**
         * @return subDingDepartmentId
         */
        public String getSubDingDepartmentId() {
            return this.subDingDepartmentId;
        }

        /**
         * @return subDingGroupId
         */
        public String getSubDingGroupId() {
            return this.subDingGroupId;
        }

        /**
         * @return subDingGroupName
         */
        public String getSubDingGroupName() {
            return this.subDingGroupName;
        }

        public static final class Builder {
            private String mainDingDepartmentId; 
            private String mainDingGroupId; 
            private String mainDingGroupName; 
            private String subDingDepartmentId; 
            private String subDingGroupId; 
            private String subDingGroupName; 

            /**
             * mainDingDepartmentId.
             */
            public Builder mainDingDepartmentId(String mainDingDepartmentId) {
                this.mainDingDepartmentId = mainDingDepartmentId;
                return this;
            }

            /**
             * mainDingGroupId.
             */
            public Builder mainDingGroupId(String mainDingGroupId) {
                this.mainDingGroupId = mainDingGroupId;
                return this;
            }

            /**
             * mainDingGroupName.
             */
            public Builder mainDingGroupName(String mainDingGroupName) {
                this.mainDingGroupName = mainDingGroupName;
                return this;
            }

            /**
             * subDingDepartmentId.
             */
            public Builder subDingDepartmentId(String subDingDepartmentId) {
                this.subDingDepartmentId = subDingDepartmentId;
                return this;
            }

            /**
             * subDingGroupId.
             */
            public Builder subDingGroupId(String subDingGroupId) {
                this.subDingGroupId = subDingGroupId;
                return this;
            }

            /**
             * subDingGroupName.
             */
            public Builder subDingGroupName(String subDingGroupName) {
                this.subDingGroupName = subDingGroupName;
                return this;
            }

            public DingGroups build() {
                return new DingGroups(this);
            } 

        } 

    }
    public static class Docs extends TeaModel {
        @NameInMap("docId")
        private Long docId;

        @NameInMap("fileName")
        private String fileName;

        @NameInMap("freeOrderApplyCode")
        private String freeOrderApplyCode;

        @NameInMap("name")
        private String name;

        @NameInMap("orderId")
        private String orderId;

        @NameInMap("uploadTime")
        private String uploadTime;

        @NameInMap("url")
        private String url;

        private Docs(Builder builder) {
            this.docId = builder.docId;
            this.fileName = builder.fileName;
            this.freeOrderApplyCode = builder.freeOrderApplyCode;
            this.name = builder.name;
            this.orderId = builder.orderId;
            this.uploadTime = builder.uploadTime;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Docs create() {
            return builder().build();
        }

        /**
         * @return docId
         */
        public Long getDocId() {
            return this.docId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return freeOrderApplyCode
         */
        public String getFreeOrderApplyCode() {
            return this.freeOrderApplyCode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return uploadTime
         */
        public String getUploadTime() {
            return this.uploadTime;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Long docId; 
            private String fileName; 
            private String freeOrderApplyCode; 
            private String name; 
            private String orderId; 
            private String uploadTime; 
            private String url; 

            /**
             * docId.
             */
            public Builder docId(Long docId) {
                this.docId = docId;
                return this;
            }

            /**
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * freeOrderApplyCode.
             */
            public Builder freeOrderApplyCode(String freeOrderApplyCode) {
                this.freeOrderApplyCode = freeOrderApplyCode;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * orderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * uploadTime.
             */
            public Builder uploadTime(String uploadTime) {
                this.uploadTime = uploadTime;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Docs build() {
                return new Docs(this);
            } 

        } 

    }
    public static class DocNode extends TeaModel {
        @NameInMap("docId")
        private Long docId;

        @NameInMap("docName")
        private String docName;

        @NameInMap("docSubmitTime")
        private String docSubmitTime;

        @NameInMap("fileName")
        private String fileName;

        @NameInMap("freeOrderApplyCode")
        private String freeOrderApplyCode;

        @NameInMap("orderId")
        private String orderId;

        private DocNode(Builder builder) {
            this.docId = builder.docId;
            this.docName = builder.docName;
            this.docSubmitTime = builder.docSubmitTime;
            this.fileName = builder.fileName;
            this.freeOrderApplyCode = builder.freeOrderApplyCode;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocNode create() {
            return builder().build();
        }

        /**
         * @return docId
         */
        public Long getDocId() {
            return this.docId;
        }

        /**
         * @return docName
         */
        public String getDocName() {
            return this.docName;
        }

        /**
         * @return docSubmitTime
         */
        public String getDocSubmitTime() {
            return this.docSubmitTime;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return freeOrderApplyCode
         */
        public String getFreeOrderApplyCode() {
            return this.freeOrderApplyCode;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        public static final class Builder {
            private Long docId; 
            private String docName; 
            private String docSubmitTime; 
            private String fileName; 
            private String freeOrderApplyCode; 
            private String orderId; 

            /**
             * docId.
             */
            public Builder docId(Long docId) {
                this.docId = docId;
                return this;
            }

            /**
             * docName.
             */
            public Builder docName(String docName) {
                this.docName = docName;
                return this;
            }

            /**
             * docSubmitTime.
             */
            public Builder docSubmitTime(String docSubmitTime) {
                this.docSubmitTime = docSubmitTime;
                return this;
            }

            /**
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * freeOrderApplyCode.
             */
            public Builder freeOrderApplyCode(String freeOrderApplyCode) {
                this.freeOrderApplyCode = freeOrderApplyCode;
                return this;
            }

            /**
             * orderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            public DocNode build() {
                return new DocNode(this);
            } 

        } 

    }
    public static class FinishNode extends TeaModel {
        @NameInMap("finishTime")
        private String finishTime;

        private FinishNode(Builder builder) {
            this.finishTime = builder.finishTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FinishNode create() {
            return builder().build();
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        public static final class Builder {
            private String finishTime; 

            /**
             * finishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            public FinishNode build() {
                return new FinishNode(this);
            } 

        } 

    }
    public static class FreeOrderAuditNode extends TeaModel {
        @NameInMap("auditTime")
        private String auditTime;

        @NameInMap("status")
        private String status;

        @NameInMap("statusName")
        private String statusName;

        private FreeOrderAuditNode(Builder builder) {
            this.auditTime = builder.auditTime;
            this.status = builder.status;
            this.statusName = builder.statusName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FreeOrderAuditNode create() {
            return builder().build();
        }

        /**
         * @return auditTime
         */
        public String getAuditTime() {
            return this.auditTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusName
         */
        public String getStatusName() {
            return this.statusName;
        }

        public static final class Builder {
            private String auditTime; 
            private String status; 
            private String statusName; 

            /**
             * auditTime.
             */
            public Builder auditTime(String auditTime) {
                this.auditTime = auditTime;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * statusName.
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            public FreeOrderAuditNode build() {
                return new FreeOrderAuditNode(this);
            } 

        } 

    }
    public static class FreeOrderNode extends TeaModel {
        @NameInMap("applyTime")
        private String applyTime;

        @NameInMap("uid")
        private Long uid;

        private FreeOrderNode(Builder builder) {
            this.applyTime = builder.applyTime;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FreeOrderNode create() {
            return builder().build();
        }

        /**
         * @return applyTime
         */
        public String getApplyTime() {
            return this.applyTime;
        }

        /**
         * @return uid
         */
        public Long getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String applyTime; 
            private Long uid; 

            /**
             * applyTime.
             */
            public Builder applyTime(String applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(Long uid) {
                this.uid = uid;
                return this;
            }

            public FreeOrderNode build() {
                return new FreeOrderNode(this);
            } 

        } 

    }
    public static class OrderNode extends TeaModel {
        @NameInMap("payTime")
        private String payTime;

        @NameInMap("uid")
        private Long uid;

        private OrderNode(Builder builder) {
            this.payTime = builder.payTime;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderNode create() {
            return builder().build();
        }

        /**
         * @return payTime
         */
        public String getPayTime() {
            return this.payTime;
        }

        /**
         * @return uid
         */
        public Long getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String payTime; 
            private Long uid; 

            /**
             * payTime.
             */
            public Builder payTime(String payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(Long uid) {
                this.uid = uid;
                return this;
            }

            public OrderNode build() {
                return new OrderNode(this);
            } 

        } 

    }
    public static class ServiceImplementation extends TeaModel {
        @NameInMap("endTime")
        private String endTime;

        @NameInMap("startTime")
        private String startTime;

        private ServiceImplementation(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceImplementation create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public ServiceImplementation build() {
                return new ServiceImplementation(this);
            } 

        } 

    }
    public static class Nodes extends TeaModel {
        @NameInMap("docNode")
        private DocNode docNode;

        @NameInMap("finishNode")
        private FinishNode finishNode;

        @NameInMap("freeOrderAuditNode")
        private FreeOrderAuditNode freeOrderAuditNode;

        @NameInMap("freeOrderNode")
        private FreeOrderNode freeOrderNode;

        @NameInMap("name")
        private String name;

        @NameInMap("orderDate")
        private Long orderDate;

        @NameInMap("orderNode")
        private OrderNode orderNode;

        @NameInMap("serviceImplementation")
        private ServiceImplementation serviceImplementation;

        @NameInMap("status")
        private Integer status;

        private Nodes(Builder builder) {
            this.docNode = builder.docNode;
            this.finishNode = builder.finishNode;
            this.freeOrderAuditNode = builder.freeOrderAuditNode;
            this.freeOrderNode = builder.freeOrderNode;
            this.name = builder.name;
            this.orderDate = builder.orderDate;
            this.orderNode = builder.orderNode;
            this.serviceImplementation = builder.serviceImplementation;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return docNode
         */
        public DocNode getDocNode() {
            return this.docNode;
        }

        /**
         * @return finishNode
         */
        public FinishNode getFinishNode() {
            return this.finishNode;
        }

        /**
         * @return freeOrderAuditNode
         */
        public FreeOrderAuditNode getFreeOrderAuditNode() {
            return this.freeOrderAuditNode;
        }

        /**
         * @return freeOrderNode
         */
        public FreeOrderNode getFreeOrderNode() {
            return this.freeOrderNode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return orderDate
         */
        public Long getOrderDate() {
            return this.orderDate;
        }

        /**
         * @return orderNode
         */
        public OrderNode getOrderNode() {
            return this.orderNode;
        }

        /**
         * @return serviceImplementation
         */
        public ServiceImplementation getServiceImplementation() {
            return this.serviceImplementation;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private DocNode docNode; 
            private FinishNode finishNode; 
            private FreeOrderAuditNode freeOrderAuditNode; 
            private FreeOrderNode freeOrderNode; 
            private String name; 
            private Long orderDate; 
            private OrderNode orderNode; 
            private ServiceImplementation serviceImplementation; 
            private Integer status; 

            /**
             * docNode.
             */
            public Builder docNode(DocNode docNode) {
                this.docNode = docNode;
                return this;
            }

            /**
             * finishNode.
             */
            public Builder finishNode(FinishNode finishNode) {
                this.finishNode = finishNode;
                return this;
            }

            /**
             * freeOrderAuditNode.
             */
            public Builder freeOrderAuditNode(FreeOrderAuditNode freeOrderAuditNode) {
                this.freeOrderAuditNode = freeOrderAuditNode;
                return this;
            }

            /**
             * freeOrderNode.
             */
            public Builder freeOrderNode(FreeOrderNode freeOrderNode) {
                this.freeOrderNode = freeOrderNode;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * orderDate.
             */
            public Builder orderDate(Long orderDate) {
                this.orderDate = orderDate;
                return this;
            }

            /**
             * orderNode.
             */
            public Builder orderNode(OrderNode orderNode) {
                this.orderNode = orderNode;
                return this;
            }

            /**
             * serviceImplementation.
             */
            public Builder serviceImplementation(ServiceImplementation serviceImplementation) {
                this.serviceImplementation = serviceImplementation;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    public static class OperateList extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("name1")
        private String name1;

        private OperateList(Builder builder) {
            this.name = builder.name;
            this.name1 = builder.name1;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperateList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return name1
         */
        public String getName1() {
            return this.name1;
        }

        public static final class Builder {
            private String name; 
            private String name1; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * name1.
             */
            public Builder name1(String name1) {
                this.name1 = name1;
                return this;
            }

            public OperateList build() {
                return new OperateList(this);
            } 

        } 

    }
    public static class ServiceItems extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("desc")
        private String desc;

        @NameInMap("name")
        private String name;

        @NameInMap("operateList")
        private java.util.List < OperateList> operateList;

        private ServiceItems(Builder builder) {
            this.content = builder.content;
            this.desc = builder.desc;
            this.name = builder.name;
            this.operateList = builder.operateList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceItems create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operateList
         */
        public java.util.List < OperateList> getOperateList() {
            return this.operateList;
        }

        public static final class Builder {
            private String content; 
            private String desc; 
            private String name; 
            private java.util.List < OperateList> operateList; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * operateList.
             */
            public Builder operateList(java.util.List < OperateList> operateList) {
                this.operateList = operateList;
                return this;
            }

            public ServiceItems build() {
                return new ServiceItems(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("canApplyFreeOrder")
        private Boolean canApplyFreeOrder;

        @NameInMap("customerId")
        private Long customerId;

        @NameInMap("dingGroups")
        private java.util.List < DingGroups> dingGroups;

        @NameInMap("docs")
        private java.util.List < Docs> docs;

        @NameInMap("endTime")
        private String endTime;

        @NameInMap("firstPayTime")
        private String firstPayTime;

        @NameInMap("freeOrderApplyCode")
        private String freeOrderApplyCode;

        @NameInMap("freeOrderApplyId")
        private Long freeOrderApplyId;

        @NameInMap("freeOrderApplyTime")
        private String freeOrderApplyTime;

        @NameInMap("freeOrderApprovedTime")
        private String freeOrderApprovedTime;

        @NameInMap("freeOrderExpectStartTime")
        private String freeOrderExpectStartTime;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("nodes")
        private java.util.List < Nodes> nodes;

        @NameInMap("orderIds")
        private java.util.List < Long > orderIds;

        @NameInMap("serviceItems")
        private java.util.List < ServiceItems> serviceItems;

        @NameInMap("serviceName")
        private String serviceName;

        @NameInMap("serviceStatus")
        private String serviceStatus;

        @NameInMap("serviceStatusName")
        private String serviceStatusName;

        @NameInMap("serviceType")
        private String serviceType;

        @NameInMap("sortTime")
        private String sortTime;

        @NameInMap("startTime")
        private String startTime;

        @NameInMap("taskNum")
        private Long taskNum;

        private Data(Builder builder) {
            this.canApplyFreeOrder = builder.canApplyFreeOrder;
            this.customerId = builder.customerId;
            this.dingGroups = builder.dingGroups;
            this.docs = builder.docs;
            this.endTime = builder.endTime;
            this.firstPayTime = builder.firstPayTime;
            this.freeOrderApplyCode = builder.freeOrderApplyCode;
            this.freeOrderApplyId = builder.freeOrderApplyId;
            this.freeOrderApplyTime = builder.freeOrderApplyTime;
            this.freeOrderApprovedTime = builder.freeOrderApprovedTime;
            this.freeOrderExpectStartTime = builder.freeOrderExpectStartTime;
            this.instanceId = builder.instanceId;
            this.nodes = builder.nodes;
            this.orderIds = builder.orderIds;
            this.serviceItems = builder.serviceItems;
            this.serviceName = builder.serviceName;
            this.serviceStatus = builder.serviceStatus;
            this.serviceStatusName = builder.serviceStatusName;
            this.serviceType = builder.serviceType;
            this.sortTime = builder.sortTime;
            this.startTime = builder.startTime;
            this.taskNum = builder.taskNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return canApplyFreeOrder
         */
        public Boolean getCanApplyFreeOrder() {
            return this.canApplyFreeOrder;
        }

        /**
         * @return customerId
         */
        public Long getCustomerId() {
            return this.customerId;
        }

        /**
         * @return dingGroups
         */
        public java.util.List < DingGroups> getDingGroups() {
            return this.dingGroups;
        }

        /**
         * @return docs
         */
        public java.util.List < Docs> getDocs() {
            return this.docs;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return firstPayTime
         */
        public String getFirstPayTime() {
            return this.firstPayTime;
        }

        /**
         * @return freeOrderApplyCode
         */
        public String getFreeOrderApplyCode() {
            return this.freeOrderApplyCode;
        }

        /**
         * @return freeOrderApplyId
         */
        public Long getFreeOrderApplyId() {
            return this.freeOrderApplyId;
        }

        /**
         * @return freeOrderApplyTime
         */
        public String getFreeOrderApplyTime() {
            return this.freeOrderApplyTime;
        }

        /**
         * @return freeOrderApprovedTime
         */
        public String getFreeOrderApprovedTime() {
            return this.freeOrderApprovedTime;
        }

        /**
         * @return freeOrderExpectStartTime
         */
        public String getFreeOrderExpectStartTime() {
            return this.freeOrderExpectStartTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return nodes
         */
        public java.util.List < Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return orderIds
         */
        public java.util.List < Long > getOrderIds() {
            return this.orderIds;
        }

        /**
         * @return serviceItems
         */
        public java.util.List < ServiceItems> getServiceItems() {
            return this.serviceItems;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        /**
         * @return serviceStatusName
         */
        public String getServiceStatusName() {
            return this.serviceStatusName;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return sortTime
         */
        public String getSortTime() {
            return this.sortTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return taskNum
         */
        public Long getTaskNum() {
            return this.taskNum;
        }

        public static final class Builder {
            private Boolean canApplyFreeOrder; 
            private Long customerId; 
            private java.util.List < DingGroups> dingGroups; 
            private java.util.List < Docs> docs; 
            private String endTime; 
            private String firstPayTime; 
            private String freeOrderApplyCode; 
            private Long freeOrderApplyId; 
            private String freeOrderApplyTime; 
            private String freeOrderApprovedTime; 
            private String freeOrderExpectStartTime; 
            private String instanceId; 
            private java.util.List < Nodes> nodes; 
            private java.util.List < Long > orderIds; 
            private java.util.List < ServiceItems> serviceItems; 
            private String serviceName; 
            private String serviceStatus; 
            private String serviceStatusName; 
            private String serviceType; 
            private String sortTime; 
            private String startTime; 
            private Long taskNum; 

            /**
             * canApplyFreeOrder.
             */
            public Builder canApplyFreeOrder(Boolean canApplyFreeOrder) {
                this.canApplyFreeOrder = canApplyFreeOrder;
                return this;
            }

            /**
             * customerId.
             */
            public Builder customerId(Long customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * dingGroups.
             */
            public Builder dingGroups(java.util.List < DingGroups> dingGroups) {
                this.dingGroups = dingGroups;
                return this;
            }

            /**
             * docs.
             */
            public Builder docs(java.util.List < Docs> docs) {
                this.docs = docs;
                return this;
            }

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * firstPayTime.
             */
            public Builder firstPayTime(String firstPayTime) {
                this.firstPayTime = firstPayTime;
                return this;
            }

            /**
             * freeOrderApplyCode.
             */
            public Builder freeOrderApplyCode(String freeOrderApplyCode) {
                this.freeOrderApplyCode = freeOrderApplyCode;
                return this;
            }

            /**
             * freeOrderApplyId.
             */
            public Builder freeOrderApplyId(Long freeOrderApplyId) {
                this.freeOrderApplyId = freeOrderApplyId;
                return this;
            }

            /**
             * freeOrderApplyTime.
             */
            public Builder freeOrderApplyTime(String freeOrderApplyTime) {
                this.freeOrderApplyTime = freeOrderApplyTime;
                return this;
            }

            /**
             * freeOrderApprovedTime.
             */
            public Builder freeOrderApprovedTime(String freeOrderApprovedTime) {
                this.freeOrderApprovedTime = freeOrderApprovedTime;
                return this;
            }

            /**
             * freeOrderExpectStartTime.
             */
            public Builder freeOrderExpectStartTime(String freeOrderExpectStartTime) {
                this.freeOrderExpectStartTime = freeOrderExpectStartTime;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * nodes.
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * orderIds.
             */
            public Builder orderIds(java.util.List < Long > orderIds) {
                this.orderIds = orderIds;
                return this;
            }

            /**
             * serviceItems.
             */
            public Builder serviceItems(java.util.List < ServiceItems> serviceItems) {
                this.serviceItems = serviceItems;
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
             * serviceStatus.
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * serviceStatusName.
             */
            public Builder serviceStatusName(String serviceStatusName) {
                this.serviceStatusName = serviceStatusName;
                return this;
            }

            /**
             * serviceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * sortTime.
             */
            public Builder sortTime(String sortTime) {
                this.sortTime = sortTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * taskNum.
             */
            public Builder taskNum(Long taskNum) {
                this.taskNum = taskNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
