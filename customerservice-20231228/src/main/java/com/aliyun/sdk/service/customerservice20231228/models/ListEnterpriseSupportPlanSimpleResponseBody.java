// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.customerservice20231228.models;

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
 * {@link ListEnterpriseSupportPlanSimpleResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnterpriseSupportPlanSimpleResponseBody</p>
 */
public class ListEnterpriseSupportPlanSimpleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListEnterpriseSupportPlanSimpleResponseBody(Builder builder) {
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

    public static ListEnterpriseSupportPlanSimpleResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListEnterpriseSupportPlanSimpleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
        public Builder data(java.util.List<Data> data) {
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

        public ListEnterpriseSupportPlanSimpleResponseBody build() {
            return new ListEnterpriseSupportPlanSimpleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEnterpriseSupportPlanSimpleResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnterpriseSupportPlanSimpleResponseBody</p>
     */
    public static class Docs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("docId")
        private Long docId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("freeOrderApplyCode")
        private String freeOrderApplyCode;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("orderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("uploadTime")
        private String uploadTime;

        @com.aliyun.core.annotation.NameInMap("url")
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

            private Builder() {
            } 

            private Builder(Docs model) {
                this.docId = model.docId;
                this.fileName = model.fileName;
                this.freeOrderApplyCode = model.freeOrderApplyCode;
                this.name = model.name;
                this.orderId = model.orderId;
                this.uploadTime = model.uploadTime;
                this.url = model.url;
            } 

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
    /**
     * 
     * {@link ListEnterpriseSupportPlanSimpleResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnterpriseSupportPlanSimpleResponseBody</p>
     */
    public static class DocNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("docId")
        private Long docId;

        @com.aliyun.core.annotation.NameInMap("docName")
        private String docName;

        @com.aliyun.core.annotation.NameInMap("docSubmitTime")
        private String docSubmitTime;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("freeOrderApplyCode")
        private String freeOrderApplyCode;

        @com.aliyun.core.annotation.NameInMap("orderId")
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

            private Builder() {
            } 

            private Builder(DocNode model) {
                this.docId = model.docId;
                this.docName = model.docName;
                this.docSubmitTime = model.docSubmitTime;
                this.fileName = model.fileName;
                this.freeOrderApplyCode = model.freeOrderApplyCode;
                this.orderId = model.orderId;
            } 

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
    /**
     * 
     * {@link ListEnterpriseSupportPlanSimpleResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnterpriseSupportPlanSimpleResponseBody</p>
     */
    public static class FinishNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("finishTime")
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

            private Builder() {
            } 

            private Builder(FinishNode model) {
                this.finishTime = model.finishTime;
            } 

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
    /**
     * 
     * {@link ListEnterpriseSupportPlanSimpleResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnterpriseSupportPlanSimpleResponseBody</p>
     */
    public static class FreeOrderAuditNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("auditTime")
        private String auditTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusName")
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

            private Builder() {
            } 

            private Builder(FreeOrderAuditNode model) {
                this.auditTime = model.auditTime;
                this.status = model.status;
                this.statusName = model.statusName;
            } 

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
    /**
     * 
     * {@link ListEnterpriseSupportPlanSimpleResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnterpriseSupportPlanSimpleResponseBody</p>
     */
    public static class FreeOrderNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applyTime")
        private String applyTime;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

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
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String applyTime; 
            private String uid; 

            private Builder() {
            } 

            private Builder(FreeOrderNode model) {
                this.applyTime = model.applyTime;
                this.uid = model.uid;
            } 

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
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public FreeOrderNode build() {
                return new FreeOrderNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEnterpriseSupportPlanSimpleResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnterpriseSupportPlanSimpleResponseBody</p>
     */
    public static class OrderNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("payTime")
        private String payTime;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

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
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String payTime; 
            private String uid; 

            private Builder() {
            } 

            private Builder(OrderNode model) {
                this.payTime = model.payTime;
                this.uid = model.uid;
            } 

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
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public OrderNode build() {
                return new OrderNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEnterpriseSupportPlanSimpleResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnterpriseSupportPlanSimpleResponseBody</p>
     */
    public static class ServiceImplementation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
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

            private Builder() {
            } 

            private Builder(ServiceImplementation model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

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
    /**
     * 
     * {@link ListEnterpriseSupportPlanSimpleResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnterpriseSupportPlanSimpleResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("docNode")
        private DocNode docNode;

        @com.aliyun.core.annotation.NameInMap("finishNode")
        private FinishNode finishNode;

        @com.aliyun.core.annotation.NameInMap("freeOrderAuditNode")
        private FreeOrderAuditNode freeOrderAuditNode;

        @com.aliyun.core.annotation.NameInMap("freeOrderNode")
        private FreeOrderNode freeOrderNode;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("orderDate")
        private Long orderDate;

        @com.aliyun.core.annotation.NameInMap("orderNode")
        private OrderNode orderNode;

        @com.aliyun.core.annotation.NameInMap("serviceImplementation")
        private ServiceImplementation serviceImplementation;

        @com.aliyun.core.annotation.NameInMap("status")
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

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.docNode = model.docNode;
                this.finishNode = model.finishNode;
                this.freeOrderAuditNode = model.freeOrderAuditNode;
                this.freeOrderNode = model.freeOrderNode;
                this.name = model.name;
                this.orderDate = model.orderDate;
                this.orderNode = model.orderNode;
                this.serviceImplementation = model.serviceImplementation;
                this.status = model.status;
            } 

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
    /**
     * 
     * {@link ListEnterpriseSupportPlanSimpleResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnterpriseSupportPlanSimpleResponseBody</p>
     */
    public static class OperateInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("canClick")
        private Boolean canClick;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private OperateInfos(Builder builder) {
            this.canClick = builder.canClick;
            this.text = builder.text;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperateInfos create() {
            return builder().build();
        }

        /**
         * @return canClick
         */
        public Boolean getCanClick() {
            return this.canClick;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Boolean canClick; 
            private String text; 
            private String url; 

            private Builder() {
            } 

            private Builder(OperateInfos model) {
                this.canClick = model.canClick;
                this.text = model.text;
                this.url = model.url;
            } 

            /**
             * canClick.
             */
            public Builder canClick(Boolean canClick) {
                this.canClick = canClick;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public OperateInfos build() {
                return new OperateInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEnterpriseSupportPlanSimpleResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnterpriseSupportPlanSimpleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("canApplyFreeOrder")
        private Boolean canApplyFreeOrder;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("docs")
        private java.util.List<Docs> docs;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("firstPayTime")
        private String firstPayTime;

        @com.aliyun.core.annotation.NameInMap("freeOrderApplyCode")
        private String freeOrderApplyCode;

        @com.aliyun.core.annotation.NameInMap("freeOrderApplyId")
        private Long freeOrderApplyId;

        @com.aliyun.core.annotation.NameInMap("freeOrderApplyTime")
        private String freeOrderApplyTime;

        @com.aliyun.core.annotation.NameInMap("freeOrderApprovedTime")
        private String freeOrderApprovedTime;

        @com.aliyun.core.annotation.NameInMap("freeOrderExpectStartTime")
        private String freeOrderExpectStartTime;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("nodes")
        private java.util.List<Nodes> nodes;

        @com.aliyun.core.annotation.NameInMap("operateInfos")
        private java.util.List<OperateInfos> operateInfos;

        @com.aliyun.core.annotation.NameInMap("orderIds")
        private java.util.List<Long> orderIds;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("serviceStatus")
        private String serviceStatus;

        @com.aliyun.core.annotation.NameInMap("serviceStatusName")
        private String serviceStatusName;

        @com.aliyun.core.annotation.NameInMap("serviceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("sortTime")
        private String sortTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("taskNum")
        private Long taskNum;

        private Data(Builder builder) {
            this.canApplyFreeOrder = builder.canApplyFreeOrder;
            this.customerId = builder.customerId;
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
            this.operateInfos = builder.operateInfos;
            this.orderIds = builder.orderIds;
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
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return docs
         */
        public java.util.List<Docs> getDocs() {
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
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return operateInfos
         */
        public java.util.List<OperateInfos> getOperateInfos() {
            return this.operateInfos;
        }

        /**
         * @return orderIds
         */
        public java.util.List<Long> getOrderIds() {
            return this.orderIds;
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
            private String customerId; 
            private java.util.List<Docs> docs; 
            private String endTime; 
            private String firstPayTime; 
            private String freeOrderApplyCode; 
            private Long freeOrderApplyId; 
            private String freeOrderApplyTime; 
            private String freeOrderApprovedTime; 
            private String freeOrderExpectStartTime; 
            private String instanceId; 
            private java.util.List<Nodes> nodes; 
            private java.util.List<OperateInfos> operateInfos; 
            private java.util.List<Long> orderIds; 
            private String serviceName; 
            private String serviceStatus; 
            private String serviceStatusName; 
            private String serviceType; 
            private String sortTime; 
            private String startTime; 
            private Long taskNum; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.canApplyFreeOrder = model.canApplyFreeOrder;
                this.customerId = model.customerId;
                this.docs = model.docs;
                this.endTime = model.endTime;
                this.firstPayTime = model.firstPayTime;
                this.freeOrderApplyCode = model.freeOrderApplyCode;
                this.freeOrderApplyId = model.freeOrderApplyId;
                this.freeOrderApplyTime = model.freeOrderApplyTime;
                this.freeOrderApprovedTime = model.freeOrderApprovedTime;
                this.freeOrderExpectStartTime = model.freeOrderExpectStartTime;
                this.instanceId = model.instanceId;
                this.nodes = model.nodes;
                this.operateInfos = model.operateInfos;
                this.orderIds = model.orderIds;
                this.serviceName = model.serviceName;
                this.serviceStatus = model.serviceStatus;
                this.serviceStatusName = model.serviceStatusName;
                this.serviceType = model.serviceType;
                this.sortTime = model.sortTime;
                this.startTime = model.startTime;
                this.taskNum = model.taskNum;
            } 

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
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * docs.
             */
            public Builder docs(java.util.List<Docs> docs) {
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
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * operateInfos.
             */
            public Builder operateInfos(java.util.List<OperateInfos> operateInfos) {
                this.operateInfos = operateInfos;
                return this;
            }

            /**
             * orderIds.
             */
            public Builder orderIds(java.util.List<Long> orderIds) {
                this.orderIds = orderIds;
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
