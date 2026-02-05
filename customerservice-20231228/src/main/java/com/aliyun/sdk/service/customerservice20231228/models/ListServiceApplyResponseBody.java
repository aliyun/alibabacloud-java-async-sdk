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
 * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceApplyResponseBody</p>
 */
public class ListServiceApplyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListServiceApplyResponseBody(Builder builder) {
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

    public static ListServiceApplyResponseBody create() {
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

        private Builder() {
        } 

        private Builder(ListServiceApplyResponseBody model) {
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

        public ListServiceApplyResponseBody build() {
            return new ListServiceApplyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class Appointments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("huhangId")
        private Long huhangId;

        @com.aliyun.core.annotation.NameInMap("purchaseCode")
        private Integer purchaseCode;

        @com.aliyun.core.annotation.NameInMap("purchaseDesc")
        private String purchaseDesc;

        @com.aliyun.core.annotation.NameInMap("supportDays")
        private Integer supportDays;

        @com.aliyun.core.annotation.NameInMap("travelDays")
        private Integer travelDays;

        private Appointments(Builder builder) {
            this.huhangId = builder.huhangId;
            this.purchaseCode = builder.purchaseCode;
            this.purchaseDesc = builder.purchaseDesc;
            this.supportDays = builder.supportDays;
            this.travelDays = builder.travelDays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Appointments create() {
            return builder().build();
        }

        /**
         * @return huhangId
         */
        public Long getHuhangId() {
            return this.huhangId;
        }

        /**
         * @return purchaseCode
         */
        public Integer getPurchaseCode() {
            return this.purchaseCode;
        }

        /**
         * @return purchaseDesc
         */
        public String getPurchaseDesc() {
            return this.purchaseDesc;
        }

        /**
         * @return supportDays
         */
        public Integer getSupportDays() {
            return this.supportDays;
        }

        /**
         * @return travelDays
         */
        public Integer getTravelDays() {
            return this.travelDays;
        }

        public static final class Builder {
            private Long huhangId; 
            private Integer purchaseCode; 
            private String purchaseDesc; 
            private Integer supportDays; 
            private Integer travelDays; 

            private Builder() {
            } 

            private Builder(Appointments model) {
                this.huhangId = model.huhangId;
                this.purchaseCode = model.purchaseCode;
                this.purchaseDesc = model.purchaseDesc;
                this.supportDays = model.supportDays;
                this.travelDays = model.travelDays;
            } 

            /**
             * huhangId.
             */
            public Builder huhangId(Long huhangId) {
                this.huhangId = huhangId;
                return this;
            }

            /**
             * purchaseCode.
             */
            public Builder purchaseCode(Integer purchaseCode) {
                this.purchaseCode = purchaseCode;
                return this;
            }

            /**
             * purchaseDesc.
             */
            public Builder purchaseDesc(String purchaseDesc) {
                this.purchaseDesc = purchaseDesc;
                return this;
            }

            /**
             * supportDays.
             */
            public Builder supportDays(Integer supportDays) {
                this.supportDays = supportDays;
                return this;
            }

            /**
             * travelDays.
             */
            public Builder travelDays(Integer travelDays) {
                this.travelDays = travelDays;
                return this;
            }

            public Appointments build() {
                return new Appointments(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class PayOrders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("compassCommodityCode")
        private String compassCommodityCode;

        @com.aliyun.core.annotation.NameInMap("compassCommodityName")
        private String compassCommodityName;

        @com.aliyun.core.annotation.NameInMap("creatorEmpId")
        private String creatorEmpId;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("modifierEmpId")
        private String modifierEmpId;

        @com.aliyun.core.annotation.NameInMap("operate")
        private java.util.Map<String, ?> operate;

        @com.aliyun.core.annotation.NameInMap("orderDetail")
        private Object orderDetail;

        @com.aliyun.core.annotation.NameInMap("orderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("originalPrice")
        private Double originalPrice;

        @com.aliyun.core.annotation.NameInMap("payAmount")
        private Double payAmount;

        @com.aliyun.core.annotation.NameInMap("payTime")
        private String payTime;

        @com.aliyun.core.annotation.NameInMap("productName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("reneWalUrl")
        private String reneWalUrl;

        @com.aliyun.core.annotation.NameInMap("serviceContentMap")
        private java.util.Map<String, ?> serviceContentMap;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("statusStr")
        private String statusStr;

        @com.aliyun.core.annotation.NameInMap("supportDays")
        private Integer supportDays;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private PayOrders(Builder builder) {
            this.amount = builder.amount;
            this.compassCommodityCode = builder.compassCommodityCode;
            this.compassCommodityName = builder.compassCommodityName;
            this.creatorEmpId = builder.creatorEmpId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.modifierEmpId = builder.modifierEmpId;
            this.operate = builder.operate;
            this.orderDetail = builder.orderDetail;
            this.orderId = builder.orderId;
            this.originalPrice = builder.originalPrice;
            this.payAmount = builder.payAmount;
            this.payTime = builder.payTime;
            this.productName = builder.productName;
            this.reneWalUrl = builder.reneWalUrl;
            this.serviceContentMap = builder.serviceContentMap;
            this.status = builder.status;
            this.statusStr = builder.statusStr;
            this.supportDays = builder.supportDays;
            this.uid = builder.uid;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PayOrders create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return compassCommodityCode
         */
        public String getCompassCommodityCode() {
            return this.compassCommodityCode;
        }

        /**
         * @return compassCommodityName
         */
        public String getCompassCommodityName() {
            return this.compassCommodityName;
        }

        /**
         * @return creatorEmpId
         */
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifierEmpId
         */
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        /**
         * @return operate
         */
        public java.util.Map<String, ?> getOperate() {
            return this.operate;
        }

        /**
         * @return orderDetail
         */
        public Object getOrderDetail() {
            return this.orderDetail;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return originalPrice
         */
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return payAmount
         */
        public Double getPayAmount() {
            return this.payAmount;
        }

        /**
         * @return payTime
         */
        public String getPayTime() {
            return this.payTime;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return reneWalUrl
         */
        public String getReneWalUrl() {
            return this.reneWalUrl;
        }

        /**
         * @return serviceContentMap
         */
        public java.util.Map<String, ?> getServiceContentMap() {
            return this.serviceContentMap;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return statusStr
         */
        public String getStatusStr() {
            return this.statusStr;
        }

        /**
         * @return supportDays
         */
        public Integer getSupportDays() {
            return this.supportDays;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String amount; 
            private String compassCommodityCode; 
            private String compassCommodityName; 
            private String creatorEmpId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String modifierEmpId; 
            private java.util.Map<String, ?> operate; 
            private Object orderDetail; 
            private Long orderId; 
            private Double originalPrice; 
            private Double payAmount; 
            private String payTime; 
            private String productName; 
            private String reneWalUrl; 
            private java.util.Map<String, ?> serviceContentMap; 
            private Integer status; 
            private String statusStr; 
            private Integer supportDays; 
            private String uid; 
            private String url; 

            private Builder() {
            } 

            private Builder(PayOrders model) {
                this.amount = model.amount;
                this.compassCommodityCode = model.compassCommodityCode;
                this.compassCommodityName = model.compassCommodityName;
                this.creatorEmpId = model.creatorEmpId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.modifierEmpId = model.modifierEmpId;
                this.operate = model.operate;
                this.orderDetail = model.orderDetail;
                this.orderId = model.orderId;
                this.originalPrice = model.originalPrice;
                this.payAmount = model.payAmount;
                this.payTime = model.payTime;
                this.productName = model.productName;
                this.reneWalUrl = model.reneWalUrl;
                this.serviceContentMap = model.serviceContentMap;
                this.status = model.status;
                this.statusStr = model.statusStr;
                this.supportDays = model.supportDays;
                this.uid = model.uid;
                this.url = model.url;
            } 

            /**
             * amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * compassCommodityCode.
             */
            public Builder compassCommodityCode(String compassCommodityCode) {
                this.compassCommodityCode = compassCommodityCode;
                return this;
            }

            /**
             * compassCommodityName.
             */
            public Builder compassCommodityName(String compassCommodityName) {
                this.compassCommodityName = compassCommodityName;
                return this;
            }

            /**
             * creatorEmpId.
             */
            public Builder creatorEmpId(String creatorEmpId) {
                this.creatorEmpId = creatorEmpId;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * modifierEmpId.
             */
            public Builder modifierEmpId(String modifierEmpId) {
                this.modifierEmpId = modifierEmpId;
                return this;
            }

            /**
             * operate.
             */
            public Builder operate(java.util.Map<String, ?> operate) {
                this.operate = operate;
                return this;
            }

            /**
             * orderDetail.
             */
            public Builder orderDetail(Object orderDetail) {
                this.orderDetail = orderDetail;
                return this;
            }

            /**
             * orderId.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * originalPrice.
             */
            public Builder originalPrice(Double originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * payAmount.
             */
            public Builder payAmount(Double payAmount) {
                this.payAmount = payAmount;
                return this;
            }

            /**
             * payTime.
             */
            public Builder payTime(String payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * productName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * reneWalUrl.
             */
            public Builder reneWalUrl(String reneWalUrl) {
                this.reneWalUrl = reneWalUrl;
                return this;
            }

            /**
             * serviceContentMap.
             */
            public Builder serviceContentMap(java.util.Map<String, ?> serviceContentMap) {
                this.serviceContentMap = serviceContentMap;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * statusStr.
             */
            public Builder statusStr(String statusStr) {
                this.statusStr = statusStr;
                return this;
            }

            /**
             * supportDays.
             */
            public Builder supportDays(Integer supportDays) {
                this.supportDays = supportDays;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public PayOrders build() {
                return new PayOrders(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class ApplyFileVOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appointmentId")
        private String appointmentId;

        @com.aliyun.core.annotation.NameInMap("batchGroup")
        private String batchGroup;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("remarke")
        private String remarke;

        @com.aliyun.core.annotation.NameInMap("serviceApplyId")
        private Long serviceApplyId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private ApplyFileVOList(Builder builder) {
            this.appointmentId = builder.appointmentId;
            this.batchGroup = builder.batchGroup;
            this.customerId = builder.customerId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.remarke = builder.remarke;
            this.serviceApplyId = builder.serviceApplyId;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyFileVOList create() {
            return builder().build();
        }

        /**
         * @return appointmentId
         */
        public String getAppointmentId() {
            return this.appointmentId;
        }

        /**
         * @return batchGroup
         */
        public String getBatchGroup() {
            return this.batchGroup;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return remarke
         */
        public String getRemarke() {
            return this.remarke;
        }

        /**
         * @return serviceApplyId
         */
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String appointmentId; 
            private String batchGroup; 
            private String customerId; 
            private String fileName; 
            private Integer fileType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String remarke; 
            private Long serviceApplyId; 
            private Integer status; 
            private String url; 

            private Builder() {
            } 

            private Builder(ApplyFileVOList model) {
                this.appointmentId = model.appointmentId;
                this.batchGroup = model.batchGroup;
                this.customerId = model.customerId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.remarke = model.remarke;
                this.serviceApplyId = model.serviceApplyId;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * appointmentId.
             */
            public Builder appointmentId(String appointmentId) {
                this.appointmentId = appointmentId;
                return this;
            }

            /**
             * batchGroup.
             */
            public Builder batchGroup(String batchGroup) {
                this.batchGroup = batchGroup;
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
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileType.
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * remarke.
             */
            public Builder remarke(String remarke) {
                this.remarke = remarke;
                return this;
            }

            /**
             * serviceApplyId.
             */
            public Builder serviceApplyId(Long serviceApplyId) {
                this.serviceApplyId = serviceApplyId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ApplyFileVOList build() {
                return new ApplyFileVOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class ExtList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("keyCode")
        private String keyCode;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private Object value;

        @com.aliyun.core.annotation.NameInMap("view")
        private String view;

        private ExtList(Builder builder) {
            this.keyCode = builder.keyCode;
            this.name = builder.name;
            this.value = builder.value;
            this.view = builder.view;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtList create() {
            return builder().build();
        }

        /**
         * @return keyCode
         */
        public String getKeyCode() {
            return this.keyCode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        /**
         * @return view
         */
        public String getView() {
            return this.view;
        }

        public static final class Builder {
            private String keyCode; 
            private String name; 
            private Object value; 
            private String view; 

            private Builder() {
            } 

            private Builder(ExtList model) {
                this.keyCode = model.keyCode;
                this.name = model.name;
                this.value = model.value;
                this.view = model.view;
            } 

            /**
             * keyCode.
             */
            public Builder keyCode(String keyCode) {
                this.keyCode = keyCode;
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
             * value.
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            /**
             * view.
             */
            public Builder view(String view) {
                this.view = view;
                return this;
            }

            public ExtList build() {
                return new ExtList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class PerformanceNodeDTOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("display")
        private Boolean display;

        @com.aliyun.core.annotation.NameInMap("extendInfo")
        private Object extendInfo;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("nodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        private PerformanceNodeDTOS(Builder builder) {
            this.display = builder.display;
            this.extendInfo = builder.extendInfo;
            this.index = builder.index;
            this.nodeName = builder.nodeName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceNodeDTOS create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return extendInfo
         */
        public Object getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean display; 
            private Object extendInfo; 
            private Integer index; 
            private String nodeName; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(PerformanceNodeDTOS model) {
                this.display = model.display;
                this.extendInfo = model.extendInfo;
                this.index = model.index;
                this.nodeName = model.nodeName;
                this.status = model.status;
            } 

            /**
             * display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * extendInfo.
             */
            public Builder extendInfo(Object extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * nodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public PerformanceNodeDTOS build() {
                return new PerformanceNodeDTOS(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class PerformancePacksApplyFileVOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appointmentId")
        private String appointmentId;

        @com.aliyun.core.annotation.NameInMap("batchGroup")
        private String batchGroup;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("remarke")
        private String remarke;

        @com.aliyun.core.annotation.NameInMap("serviceApplyId")
        private Long serviceApplyId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private PerformancePacksApplyFileVOList(Builder builder) {
            this.appointmentId = builder.appointmentId;
            this.batchGroup = builder.batchGroup;
            this.customerId = builder.customerId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.remarke = builder.remarke;
            this.serviceApplyId = builder.serviceApplyId;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformancePacksApplyFileVOList create() {
            return builder().build();
        }

        /**
         * @return appointmentId
         */
        public String getAppointmentId() {
            return this.appointmentId;
        }

        /**
         * @return batchGroup
         */
        public String getBatchGroup() {
            return this.batchGroup;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return remarke
         */
        public String getRemarke() {
            return this.remarke;
        }

        /**
         * @return serviceApplyId
         */
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String appointmentId; 
            private String batchGroup; 
            private String customerId; 
            private String fileName; 
            private Integer fileType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String remarke; 
            private Long serviceApplyId; 
            private Integer status; 
            private String url; 

            private Builder() {
            } 

            private Builder(PerformancePacksApplyFileVOList model) {
                this.appointmentId = model.appointmentId;
                this.batchGroup = model.batchGroup;
                this.customerId = model.customerId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.remarke = model.remarke;
                this.serviceApplyId = model.serviceApplyId;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * appointmentId.
             */
            public Builder appointmentId(String appointmentId) {
                this.appointmentId = appointmentId;
                return this;
            }

            /**
             * batchGroup.
             */
            public Builder batchGroup(String batchGroup) {
                this.batchGroup = batchGroup;
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
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileType.
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * remarke.
             */
            public Builder remarke(String remarke) {
                this.remarke = remarke;
                return this;
            }

            /**
             * serviceApplyId.
             */
            public Builder serviceApplyId(Long serviceApplyId) {
                this.serviceApplyId = serviceApplyId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public PerformancePacksApplyFileVOList build() {
                return new PerformancePacksApplyFileVOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class PerformancePacksExtList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("keyCode")
        private String keyCode;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private Object value;

        @com.aliyun.core.annotation.NameInMap("view")
        private String view;

        private PerformancePacksExtList(Builder builder) {
            this.keyCode = builder.keyCode;
            this.name = builder.name;
            this.value = builder.value;
            this.view = builder.view;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformancePacksExtList create() {
            return builder().build();
        }

        /**
         * @return keyCode
         */
        public String getKeyCode() {
            return this.keyCode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        /**
         * @return view
         */
        public String getView() {
            return this.view;
        }

        public static final class Builder {
            private String keyCode; 
            private String name; 
            private Object value; 
            private String view; 

            private Builder() {
            } 

            private Builder(PerformancePacksExtList model) {
                this.keyCode = model.keyCode;
                this.name = model.name;
                this.value = model.value;
                this.view = model.view;
            } 

            /**
             * keyCode.
             */
            public Builder keyCode(String keyCode) {
                this.keyCode = keyCode;
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
             * value.
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            /**
             * view.
             */
            public Builder view(String view) {
                this.view = view;
                return this;
            }

            public PerformancePacksExtList build() {
                return new PerformancePacksExtList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class PerformancePacksPerformanceNodeDTOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("display")
        private Boolean display;

        @com.aliyun.core.annotation.NameInMap("extendInfo")
        private Object extendInfo;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("nodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        private PerformancePacksPerformanceNodeDTOS(Builder builder) {
            this.display = builder.display;
            this.extendInfo = builder.extendInfo;
            this.index = builder.index;
            this.nodeName = builder.nodeName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformancePacksPerformanceNodeDTOS create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return extendInfo
         */
        public Object getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean display; 
            private Object extendInfo; 
            private Integer index; 
            private String nodeName; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(PerformancePacksPerformanceNodeDTOS model) {
                this.display = model.display;
                this.extendInfo = model.extendInfo;
                this.index = model.index;
                this.nodeName = model.nodeName;
                this.status = model.status;
            } 

            /**
             * display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * extendInfo.
             */
            public Builder extendInfo(Object extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * nodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public PerformancePacksPerformanceNodeDTOS build() {
                return new PerformancePacksPerformanceNodeDTOS(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class ServiceMonthReports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appointmentId")
        private String appointmentId;

        @com.aliyun.core.annotation.NameInMap("batchGroup")
        private String batchGroup;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("remarke")
        private String remarke;

        @com.aliyun.core.annotation.NameInMap("serviceApplyId")
        private Long serviceApplyId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private ServiceMonthReports(Builder builder) {
            this.appointmentId = builder.appointmentId;
            this.batchGroup = builder.batchGroup;
            this.customerId = builder.customerId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.remarke = builder.remarke;
            this.serviceApplyId = builder.serviceApplyId;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceMonthReports create() {
            return builder().build();
        }

        /**
         * @return appointmentId
         */
        public String getAppointmentId() {
            return this.appointmentId;
        }

        /**
         * @return batchGroup
         */
        public String getBatchGroup() {
            return this.batchGroup;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return remarke
         */
        public String getRemarke() {
            return this.remarke;
        }

        /**
         * @return serviceApplyId
         */
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String appointmentId; 
            private String batchGroup; 
            private String customerId; 
            private String fileName; 
            private Integer fileType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String remarke; 
            private Long serviceApplyId; 
            private Integer status; 
            private String url; 

            private Builder() {
            } 

            private Builder(ServiceMonthReports model) {
                this.appointmentId = model.appointmentId;
                this.batchGroup = model.batchGroup;
                this.customerId = model.customerId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.remarke = model.remarke;
                this.serviceApplyId = model.serviceApplyId;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * appointmentId.
             */
            public Builder appointmentId(String appointmentId) {
                this.appointmentId = appointmentId;
                return this;
            }

            /**
             * batchGroup.
             */
            public Builder batchGroup(String batchGroup) {
                this.batchGroup = batchGroup;
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
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileType.
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * remarke.
             */
            public Builder remarke(String remarke) {
                this.remarke = remarke;
                return this;
            }

            /**
             * serviceApplyId.
             */
            public Builder serviceApplyId(Long serviceApplyId) {
                this.serviceApplyId = serviceApplyId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ServiceMonthReports build() {
                return new ServiceMonthReports(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class ServiceReports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appointmentId")
        private String appointmentId;

        @com.aliyun.core.annotation.NameInMap("batchGroup")
        private String batchGroup;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("remarke")
        private String remarke;

        @com.aliyun.core.annotation.NameInMap("serviceApplyId")
        private Long serviceApplyId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private ServiceReports(Builder builder) {
            this.appointmentId = builder.appointmentId;
            this.batchGroup = builder.batchGroup;
            this.customerId = builder.customerId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.remarke = builder.remarke;
            this.serviceApplyId = builder.serviceApplyId;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceReports create() {
            return builder().build();
        }

        /**
         * @return appointmentId
         */
        public String getAppointmentId() {
            return this.appointmentId;
        }

        /**
         * @return batchGroup
         */
        public String getBatchGroup() {
            return this.batchGroup;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return remarke
         */
        public String getRemarke() {
            return this.remarke;
        }

        /**
         * @return serviceApplyId
         */
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String appointmentId; 
            private String batchGroup; 
            private String customerId; 
            private String fileName; 
            private Integer fileType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String remarke; 
            private Long serviceApplyId; 
            private Integer status; 
            private String url; 

            private Builder() {
            } 

            private Builder(ServiceReports model) {
                this.appointmentId = model.appointmentId;
                this.batchGroup = model.batchGroup;
                this.customerId = model.customerId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.remarke = model.remarke;
                this.serviceApplyId = model.serviceApplyId;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * appointmentId.
             */
            public Builder appointmentId(String appointmentId) {
                this.appointmentId = appointmentId;
                return this;
            }

            /**
             * batchGroup.
             */
            public Builder batchGroup(String batchGroup) {
                this.batchGroup = batchGroup;
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
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileType.
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * remarke.
             */
            public Builder remarke(String remarke) {
                this.remarke = remarke;
                return this;
            }

            /**
             * serviceApplyId.
             */
            public Builder serviceApplyId(Long serviceApplyId) {
                this.serviceApplyId = serviceApplyId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ServiceReports build() {
                return new ServiceReports(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class ServiceSchemes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appointmentId")
        private String appointmentId;

        @com.aliyun.core.annotation.NameInMap("batchGroup")
        private String batchGroup;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("remarke")
        private String remarke;

        @com.aliyun.core.annotation.NameInMap("serviceApplyId")
        private Long serviceApplyId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private ServiceSchemes(Builder builder) {
            this.appointmentId = builder.appointmentId;
            this.batchGroup = builder.batchGroup;
            this.customerId = builder.customerId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.remarke = builder.remarke;
            this.serviceApplyId = builder.serviceApplyId;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceSchemes create() {
            return builder().build();
        }

        /**
         * @return appointmentId
         */
        public String getAppointmentId() {
            return this.appointmentId;
        }

        /**
         * @return batchGroup
         */
        public String getBatchGroup() {
            return this.batchGroup;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return remarke
         */
        public String getRemarke() {
            return this.remarke;
        }

        /**
         * @return serviceApplyId
         */
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String appointmentId; 
            private String batchGroup; 
            private String customerId; 
            private String fileName; 
            private Integer fileType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String remarke; 
            private Long serviceApplyId; 
            private Integer status; 
            private String url; 

            private Builder() {
            } 

            private Builder(ServiceSchemes model) {
                this.appointmentId = model.appointmentId;
                this.batchGroup = model.batchGroup;
                this.customerId = model.customerId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.remarke = model.remarke;
                this.serviceApplyId = model.serviceApplyId;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * appointmentId.
             */
            public Builder appointmentId(String appointmentId) {
                this.appointmentId = appointmentId;
                return this;
            }

            /**
             * batchGroup.
             */
            public Builder batchGroup(String batchGroup) {
                this.batchGroup = batchGroup;
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
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileType.
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * remarke.
             */
            public Builder remarke(String remarke) {
                this.remarke = remarke;
                return this;
            }

            /**
             * serviceApplyId.
             */
            public Builder serviceApplyId(Long serviceApplyId) {
                this.serviceApplyId = serviceApplyId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ServiceSchemes build() {
                return new ServiceSchemes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class TamEngineers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creatorEmpId")
        private String creatorEmpId;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("hrStatus")
        private String hrStatus;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("lastName")
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("modifierEmpId")
        private String modifierEmpId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nickNameEn")
        private String nickNameEn;

        @com.aliyun.core.annotation.NameInMap("realmId")
        private Long realmId;

        @com.aliyun.core.annotation.NameInMap("workid")
        private String workid;

        private TamEngineers(Builder builder) {
            this.creatorEmpId = builder.creatorEmpId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hrStatus = builder.hrStatus;
            this.id = builder.id;
            this.lastName = builder.lastName;
            this.modifierEmpId = builder.modifierEmpId;
            this.name = builder.name;
            this.nickNameEn = builder.nickNameEn;
            this.realmId = builder.realmId;
            this.workid = builder.workid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TamEngineers create() {
            return builder().build();
        }

        /**
         * @return creatorEmpId
         */
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return hrStatus
         */
        public String getHrStatus() {
            return this.hrStatus;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastName
         */
        public String getLastName() {
            return this.lastName;
        }

        /**
         * @return modifierEmpId
         */
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nickNameEn
         */
        public String getNickNameEn() {
            return this.nickNameEn;
        }

        /**
         * @return realmId
         */
        public Long getRealmId() {
            return this.realmId;
        }

        /**
         * @return workid
         */
        public String getWorkid() {
            return this.workid;
        }

        public static final class Builder {
            private String creatorEmpId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String hrStatus; 
            private Long id; 
            private String lastName; 
            private String modifierEmpId; 
            private String name; 
            private String nickNameEn; 
            private Long realmId; 
            private String workid; 

            private Builder() {
            } 

            private Builder(TamEngineers model) {
                this.creatorEmpId = model.creatorEmpId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.hrStatus = model.hrStatus;
                this.id = model.id;
                this.lastName = model.lastName;
                this.modifierEmpId = model.modifierEmpId;
                this.name = model.name;
                this.nickNameEn = model.nickNameEn;
                this.realmId = model.realmId;
                this.workid = model.workid;
            } 

            /**
             * creatorEmpId.
             */
            public Builder creatorEmpId(String creatorEmpId) {
                this.creatorEmpId = creatorEmpId;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * hrStatus.
             */
            public Builder hrStatus(String hrStatus) {
                this.hrStatus = hrStatus;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * lastName.
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            /**
             * modifierEmpId.
             */
            public Builder modifierEmpId(String modifierEmpId) {
                this.modifierEmpId = modifierEmpId;
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
             * nickNameEn.
             */
            public Builder nickNameEn(String nickNameEn) {
                this.nickNameEn = nickNameEn;
                return this;
            }

            /**
             * realmId.
             */
            public Builder realmId(Long realmId) {
                this.realmId = realmId;
                return this;
            }

            /**
             * workid.
             */
            public Builder workid(String workid) {
                this.workid = workid;
                return this;
            }

            public TamEngineers build() {
                return new TamEngineers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class PerformancePacks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applyFileVOList")
        private java.util.List<PerformancePacksApplyFileVOList> applyFileVOList;

        @com.aliyun.core.annotation.NameInMap("appointmentCode")
        private String appointmentCode;

        @com.aliyun.core.annotation.NameInMap("appointmentEndTime")
        private Long appointmentEndTime;

        @com.aliyun.core.annotation.NameInMap("appointmentId")
        private String appointmentId;

        @com.aliyun.core.annotation.NameInMap("appointmentPassTime")
        private Long appointmentPassTime;

        @com.aliyun.core.annotation.NameInMap("appointmentTime")
        private Long appointmentTime;

        @com.aliyun.core.annotation.NameInMap("commodityDesc")
        private String commodityDesc;

        @com.aliyun.core.annotation.NameInMap("creatorEmpId")
        private String creatorEmpId;

        @com.aliyun.core.annotation.NameInMap("cycleService")
        private Boolean cycleService;

        @com.aliyun.core.annotation.NameInMap("extList")
        private java.util.List<PerformancePacksExtList> extList;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("mergeSolutionAndReporterOneStep")
        private Boolean mergeSolutionAndReporterOneStep;

        @com.aliyun.core.annotation.NameInMap("modifierEmpId")
        private String modifierEmpId;

        @com.aliyun.core.annotation.NameInMap("ntmCommodityCode")
        private String ntmCommodityCode;

        @com.aliyun.core.annotation.NameInMap("orderDetail")
        private Object orderDetail;

        @com.aliyun.core.annotation.NameInMap("orderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("performanceNodeDTOS")
        private java.util.List<PerformancePacksPerformanceNodeDTOS> performanceNodeDTOS;

        @com.aliyun.core.annotation.NameInMap("purchasePackCode")
        private Integer purchasePackCode;

        @com.aliyun.core.annotation.NameInMap("serviceApplyId")
        private Long serviceApplyId;

        @com.aliyun.core.annotation.NameInMap("serviceMonthReports")
        private java.util.List<ServiceMonthReports> serviceMonthReports;

        @com.aliyun.core.annotation.NameInMap("serviceReports")
        private java.util.List<ServiceReports> serviceReports;

        @com.aliyun.core.annotation.NameInMap("serviceSchemes")
        private java.util.List<ServiceSchemes> serviceSchemes;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("statusStr")
        private String statusStr;

        @com.aliyun.core.annotation.NameInMap("supportTime")
        private java.util.List<Long> supportTime;

        @com.aliyun.core.annotation.NameInMap("tamEngineers")
        private java.util.List<TamEngineers> tamEngineers;

        private PerformancePacks(Builder builder) {
            this.applyFileVOList = builder.applyFileVOList;
            this.appointmentCode = builder.appointmentCode;
            this.appointmentEndTime = builder.appointmentEndTime;
            this.appointmentId = builder.appointmentId;
            this.appointmentPassTime = builder.appointmentPassTime;
            this.appointmentTime = builder.appointmentTime;
            this.commodityDesc = builder.commodityDesc;
            this.creatorEmpId = builder.creatorEmpId;
            this.cycleService = builder.cycleService;
            this.extList = builder.extList;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.mergeSolutionAndReporterOneStep = builder.mergeSolutionAndReporterOneStep;
            this.modifierEmpId = builder.modifierEmpId;
            this.ntmCommodityCode = builder.ntmCommodityCode;
            this.orderDetail = builder.orderDetail;
            this.orderId = builder.orderId;
            this.performanceNodeDTOS = builder.performanceNodeDTOS;
            this.purchasePackCode = builder.purchasePackCode;
            this.serviceApplyId = builder.serviceApplyId;
            this.serviceMonthReports = builder.serviceMonthReports;
            this.serviceReports = builder.serviceReports;
            this.serviceSchemes = builder.serviceSchemes;
            this.status = builder.status;
            this.statusStr = builder.statusStr;
            this.supportTime = builder.supportTime;
            this.tamEngineers = builder.tamEngineers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformancePacks create() {
            return builder().build();
        }

        /**
         * @return applyFileVOList
         */
        public java.util.List<PerformancePacksApplyFileVOList> getApplyFileVOList() {
            return this.applyFileVOList;
        }

        /**
         * @return appointmentCode
         */
        public String getAppointmentCode() {
            return this.appointmentCode;
        }

        /**
         * @return appointmentEndTime
         */
        public Long getAppointmentEndTime() {
            return this.appointmentEndTime;
        }

        /**
         * @return appointmentId
         */
        public String getAppointmentId() {
            return this.appointmentId;
        }

        /**
         * @return appointmentPassTime
         */
        public Long getAppointmentPassTime() {
            return this.appointmentPassTime;
        }

        /**
         * @return appointmentTime
         */
        public Long getAppointmentTime() {
            return this.appointmentTime;
        }

        /**
         * @return commodityDesc
         */
        public String getCommodityDesc() {
            return this.commodityDesc;
        }

        /**
         * @return creatorEmpId
         */
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        /**
         * @return cycleService
         */
        public Boolean getCycleService() {
            return this.cycleService;
        }

        /**
         * @return extList
         */
        public java.util.List<PerformancePacksExtList> getExtList() {
            return this.extList;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return mergeSolutionAndReporterOneStep
         */
        public Boolean getMergeSolutionAndReporterOneStep() {
            return this.mergeSolutionAndReporterOneStep;
        }

        /**
         * @return modifierEmpId
         */
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        /**
         * @return ntmCommodityCode
         */
        public String getNtmCommodityCode() {
            return this.ntmCommodityCode;
        }

        /**
         * @return orderDetail
         */
        public Object getOrderDetail() {
            return this.orderDetail;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return performanceNodeDTOS
         */
        public java.util.List<PerformancePacksPerformanceNodeDTOS> getPerformanceNodeDTOS() {
            return this.performanceNodeDTOS;
        }

        /**
         * @return purchasePackCode
         */
        public Integer getPurchasePackCode() {
            return this.purchasePackCode;
        }

        /**
         * @return serviceApplyId
         */
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        /**
         * @return serviceMonthReports
         */
        public java.util.List<ServiceMonthReports> getServiceMonthReports() {
            return this.serviceMonthReports;
        }

        /**
         * @return serviceReports
         */
        public java.util.List<ServiceReports> getServiceReports() {
            return this.serviceReports;
        }

        /**
         * @return serviceSchemes
         */
        public java.util.List<ServiceSchemes> getServiceSchemes() {
            return this.serviceSchemes;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return statusStr
         */
        public String getStatusStr() {
            return this.statusStr;
        }

        /**
         * @return supportTime
         */
        public java.util.List<Long> getSupportTime() {
            return this.supportTime;
        }

        /**
         * @return tamEngineers
         */
        public java.util.List<TamEngineers> getTamEngineers() {
            return this.tamEngineers;
        }

        public static final class Builder {
            private java.util.List<PerformancePacksApplyFileVOList> applyFileVOList; 
            private String appointmentCode; 
            private Long appointmentEndTime; 
            private String appointmentId; 
            private Long appointmentPassTime; 
            private Long appointmentTime; 
            private String commodityDesc; 
            private String creatorEmpId; 
            private Boolean cycleService; 
            private java.util.List<PerformancePacksExtList> extList; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Boolean mergeSolutionAndReporterOneStep; 
            private String modifierEmpId; 
            private String ntmCommodityCode; 
            private Object orderDetail; 
            private Long orderId; 
            private java.util.List<PerformancePacksPerformanceNodeDTOS> performanceNodeDTOS; 
            private Integer purchasePackCode; 
            private Long serviceApplyId; 
            private java.util.List<ServiceMonthReports> serviceMonthReports; 
            private java.util.List<ServiceReports> serviceReports; 
            private java.util.List<ServiceSchemes> serviceSchemes; 
            private Integer status; 
            private String statusStr; 
            private java.util.List<Long> supportTime; 
            private java.util.List<TamEngineers> tamEngineers; 

            private Builder() {
            } 

            private Builder(PerformancePacks model) {
                this.applyFileVOList = model.applyFileVOList;
                this.appointmentCode = model.appointmentCode;
                this.appointmentEndTime = model.appointmentEndTime;
                this.appointmentId = model.appointmentId;
                this.appointmentPassTime = model.appointmentPassTime;
                this.appointmentTime = model.appointmentTime;
                this.commodityDesc = model.commodityDesc;
                this.creatorEmpId = model.creatorEmpId;
                this.cycleService = model.cycleService;
                this.extList = model.extList;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.mergeSolutionAndReporterOneStep = model.mergeSolutionAndReporterOneStep;
                this.modifierEmpId = model.modifierEmpId;
                this.ntmCommodityCode = model.ntmCommodityCode;
                this.orderDetail = model.orderDetail;
                this.orderId = model.orderId;
                this.performanceNodeDTOS = model.performanceNodeDTOS;
                this.purchasePackCode = model.purchasePackCode;
                this.serviceApplyId = model.serviceApplyId;
                this.serviceMonthReports = model.serviceMonthReports;
                this.serviceReports = model.serviceReports;
                this.serviceSchemes = model.serviceSchemes;
                this.status = model.status;
                this.statusStr = model.statusStr;
                this.supportTime = model.supportTime;
                this.tamEngineers = model.tamEngineers;
            } 

            /**
             * applyFileVOList.
             */
            public Builder applyFileVOList(java.util.List<PerformancePacksApplyFileVOList> applyFileVOList) {
                this.applyFileVOList = applyFileVOList;
                return this;
            }

            /**
             * appointmentCode.
             */
            public Builder appointmentCode(String appointmentCode) {
                this.appointmentCode = appointmentCode;
                return this;
            }

            /**
             * appointmentEndTime.
             */
            public Builder appointmentEndTime(Long appointmentEndTime) {
                this.appointmentEndTime = appointmentEndTime;
                return this;
            }

            /**
             * appointmentId.
             */
            public Builder appointmentId(String appointmentId) {
                this.appointmentId = appointmentId;
                return this;
            }

            /**
             * appointmentPassTime.
             */
            public Builder appointmentPassTime(Long appointmentPassTime) {
                this.appointmentPassTime = appointmentPassTime;
                return this;
            }

            /**
             * appointmentTime.
             */
            public Builder appointmentTime(Long appointmentTime) {
                this.appointmentTime = appointmentTime;
                return this;
            }

            /**
             * commodityDesc.
             */
            public Builder commodityDesc(String commodityDesc) {
                this.commodityDesc = commodityDesc;
                return this;
            }

            /**
             * creatorEmpId.
             */
            public Builder creatorEmpId(String creatorEmpId) {
                this.creatorEmpId = creatorEmpId;
                return this;
            }

            /**
             * cycleService.
             */
            public Builder cycleService(Boolean cycleService) {
                this.cycleService = cycleService;
                return this;
            }

            /**
             * extList.
             */
            public Builder extList(java.util.List<PerformancePacksExtList> extList) {
                this.extList = extList;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * mergeSolutionAndReporterOneStep.
             */
            public Builder mergeSolutionAndReporterOneStep(Boolean mergeSolutionAndReporterOneStep) {
                this.mergeSolutionAndReporterOneStep = mergeSolutionAndReporterOneStep;
                return this;
            }

            /**
             * modifierEmpId.
             */
            public Builder modifierEmpId(String modifierEmpId) {
                this.modifierEmpId = modifierEmpId;
                return this;
            }

            /**
             * ntmCommodityCode.
             */
            public Builder ntmCommodityCode(String ntmCommodityCode) {
                this.ntmCommodityCode = ntmCommodityCode;
                return this;
            }

            /**
             * orderDetail.
             */
            public Builder orderDetail(Object orderDetail) {
                this.orderDetail = orderDetail;
                return this;
            }

            /**
             * orderId.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * performanceNodeDTOS.
             */
            public Builder performanceNodeDTOS(java.util.List<PerformancePacksPerformanceNodeDTOS> performanceNodeDTOS) {
                this.performanceNodeDTOS = performanceNodeDTOS;
                return this;
            }

            /**
             * purchasePackCode.
             */
            public Builder purchasePackCode(Integer purchasePackCode) {
                this.purchasePackCode = purchasePackCode;
                return this;
            }

            /**
             * serviceApplyId.
             */
            public Builder serviceApplyId(Long serviceApplyId) {
                this.serviceApplyId = serviceApplyId;
                return this;
            }

            /**
             * serviceMonthReports.
             */
            public Builder serviceMonthReports(java.util.List<ServiceMonthReports> serviceMonthReports) {
                this.serviceMonthReports = serviceMonthReports;
                return this;
            }

            /**
             * serviceReports.
             */
            public Builder serviceReports(java.util.List<ServiceReports> serviceReports) {
                this.serviceReports = serviceReports;
                return this;
            }

            /**
             * serviceSchemes.
             */
            public Builder serviceSchemes(java.util.List<ServiceSchemes> serviceSchemes) {
                this.serviceSchemes = serviceSchemes;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * statusStr.
             */
            public Builder statusStr(String statusStr) {
                this.statusStr = statusStr;
                return this;
            }

            /**
             * supportTime.
             */
            public Builder supportTime(java.util.List<Long> supportTime) {
                this.supportTime = supportTime;
                return this;
            }

            /**
             * tamEngineers.
             */
            public Builder tamEngineers(java.util.List<TamEngineers> tamEngineers) {
                this.tamEngineers = tamEngineers;
                return this;
            }

            public PerformancePacks build() {
                return new PerformancePacks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class PerformanceOrdersServiceMonthReports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appointmentId")
        private String appointmentId;

        @com.aliyun.core.annotation.NameInMap("batchGroup")
        private String batchGroup;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("remarke")
        private String remarke;

        @com.aliyun.core.annotation.NameInMap("serviceApplyId")
        private Long serviceApplyId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private PerformanceOrdersServiceMonthReports(Builder builder) {
            this.appointmentId = builder.appointmentId;
            this.batchGroup = builder.batchGroup;
            this.customerId = builder.customerId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.remarke = builder.remarke;
            this.serviceApplyId = builder.serviceApplyId;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceOrdersServiceMonthReports create() {
            return builder().build();
        }

        /**
         * @return appointmentId
         */
        public String getAppointmentId() {
            return this.appointmentId;
        }

        /**
         * @return batchGroup
         */
        public String getBatchGroup() {
            return this.batchGroup;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return remarke
         */
        public String getRemarke() {
            return this.remarke;
        }

        /**
         * @return serviceApplyId
         */
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String appointmentId; 
            private String batchGroup; 
            private String customerId; 
            private String fileName; 
            private Integer fileType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String remarke; 
            private Long serviceApplyId; 
            private Integer status; 
            private String url; 

            private Builder() {
            } 

            private Builder(PerformanceOrdersServiceMonthReports model) {
                this.appointmentId = model.appointmentId;
                this.batchGroup = model.batchGroup;
                this.customerId = model.customerId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.remarke = model.remarke;
                this.serviceApplyId = model.serviceApplyId;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * appointmentId.
             */
            public Builder appointmentId(String appointmentId) {
                this.appointmentId = appointmentId;
                return this;
            }

            /**
             * batchGroup.
             */
            public Builder batchGroup(String batchGroup) {
                this.batchGroup = batchGroup;
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
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileType.
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * remarke.
             */
            public Builder remarke(String remarke) {
                this.remarke = remarke;
                return this;
            }

            /**
             * serviceApplyId.
             */
            public Builder serviceApplyId(Long serviceApplyId) {
                this.serviceApplyId = serviceApplyId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public PerformanceOrdersServiceMonthReports build() {
                return new PerformanceOrdersServiceMonthReports(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class PerformanceOrdersServiceReports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appointmentId")
        private String appointmentId;

        @com.aliyun.core.annotation.NameInMap("batchGroup")
        private String batchGroup;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("remarke")
        private String remarke;

        @com.aliyun.core.annotation.NameInMap("serviceApplyId")
        private Long serviceApplyId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private PerformanceOrdersServiceReports(Builder builder) {
            this.appointmentId = builder.appointmentId;
            this.batchGroup = builder.batchGroup;
            this.customerId = builder.customerId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.remarke = builder.remarke;
            this.serviceApplyId = builder.serviceApplyId;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceOrdersServiceReports create() {
            return builder().build();
        }

        /**
         * @return appointmentId
         */
        public String getAppointmentId() {
            return this.appointmentId;
        }

        /**
         * @return batchGroup
         */
        public String getBatchGroup() {
            return this.batchGroup;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return remarke
         */
        public String getRemarke() {
            return this.remarke;
        }

        /**
         * @return serviceApplyId
         */
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String appointmentId; 
            private String batchGroup; 
            private String customerId; 
            private String fileName; 
            private Integer fileType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String remarke; 
            private Long serviceApplyId; 
            private Integer status; 
            private String url; 

            private Builder() {
            } 

            private Builder(PerformanceOrdersServiceReports model) {
                this.appointmentId = model.appointmentId;
                this.batchGroup = model.batchGroup;
                this.customerId = model.customerId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.remarke = model.remarke;
                this.serviceApplyId = model.serviceApplyId;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * appointmentId.
             */
            public Builder appointmentId(String appointmentId) {
                this.appointmentId = appointmentId;
                return this;
            }

            /**
             * batchGroup.
             */
            public Builder batchGroup(String batchGroup) {
                this.batchGroup = batchGroup;
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
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileType.
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * remarke.
             */
            public Builder remarke(String remarke) {
                this.remarke = remarke;
                return this;
            }

            /**
             * serviceApplyId.
             */
            public Builder serviceApplyId(Long serviceApplyId) {
                this.serviceApplyId = serviceApplyId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public PerformanceOrdersServiceReports build() {
                return new PerformanceOrdersServiceReports(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class PerformanceOrdersServiceSchemes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appointmentId")
        private String appointmentId;

        @com.aliyun.core.annotation.NameInMap("batchGroup")
        private String batchGroup;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("remarke")
        private String remarke;

        @com.aliyun.core.annotation.NameInMap("serviceApplyId")
        private Long serviceApplyId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private PerformanceOrdersServiceSchemes(Builder builder) {
            this.appointmentId = builder.appointmentId;
            this.batchGroup = builder.batchGroup;
            this.customerId = builder.customerId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.remarke = builder.remarke;
            this.serviceApplyId = builder.serviceApplyId;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceOrdersServiceSchemes create() {
            return builder().build();
        }

        /**
         * @return appointmentId
         */
        public String getAppointmentId() {
            return this.appointmentId;
        }

        /**
         * @return batchGroup
         */
        public String getBatchGroup() {
            return this.batchGroup;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return remarke
         */
        public String getRemarke() {
            return this.remarke;
        }

        /**
         * @return serviceApplyId
         */
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String appointmentId; 
            private String batchGroup; 
            private String customerId; 
            private String fileName; 
            private Integer fileType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String remarke; 
            private Long serviceApplyId; 
            private Integer status; 
            private String url; 

            private Builder() {
            } 

            private Builder(PerformanceOrdersServiceSchemes model) {
                this.appointmentId = model.appointmentId;
                this.batchGroup = model.batchGroup;
                this.customerId = model.customerId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.remarke = model.remarke;
                this.serviceApplyId = model.serviceApplyId;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * appointmentId.
             */
            public Builder appointmentId(String appointmentId) {
                this.appointmentId = appointmentId;
                return this;
            }

            /**
             * batchGroup.
             */
            public Builder batchGroup(String batchGroup) {
                this.batchGroup = batchGroup;
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
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileType.
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * remarke.
             */
            public Builder remarke(String remarke) {
                this.remarke = remarke;
                return this;
            }

            /**
             * serviceApplyId.
             */
            public Builder serviceApplyId(Long serviceApplyId) {
                this.serviceApplyId = serviceApplyId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public PerformanceOrdersServiceSchemes build() {
                return new PerformanceOrdersServiceSchemes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class PerformanceOrdersTamEngineers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creatorEmpId")
        private String creatorEmpId;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("hrStatus")
        private String hrStatus;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("lastName")
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("modifierEmpId")
        private String modifierEmpId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nickNameEn")
        private String nickNameEn;

        @com.aliyun.core.annotation.NameInMap("realmId")
        private Long realmId;

        @com.aliyun.core.annotation.NameInMap("workid")
        private String workid;

        private PerformanceOrdersTamEngineers(Builder builder) {
            this.creatorEmpId = builder.creatorEmpId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hrStatus = builder.hrStatus;
            this.id = builder.id;
            this.lastName = builder.lastName;
            this.modifierEmpId = builder.modifierEmpId;
            this.name = builder.name;
            this.nickNameEn = builder.nickNameEn;
            this.realmId = builder.realmId;
            this.workid = builder.workid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceOrdersTamEngineers create() {
            return builder().build();
        }

        /**
         * @return creatorEmpId
         */
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return hrStatus
         */
        public String getHrStatus() {
            return this.hrStatus;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastName
         */
        public String getLastName() {
            return this.lastName;
        }

        /**
         * @return modifierEmpId
         */
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nickNameEn
         */
        public String getNickNameEn() {
            return this.nickNameEn;
        }

        /**
         * @return realmId
         */
        public Long getRealmId() {
            return this.realmId;
        }

        /**
         * @return workid
         */
        public String getWorkid() {
            return this.workid;
        }

        public static final class Builder {
            private String creatorEmpId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String hrStatus; 
            private Long id; 
            private String lastName; 
            private String modifierEmpId; 
            private String name; 
            private String nickNameEn; 
            private Long realmId; 
            private String workid; 

            private Builder() {
            } 

            private Builder(PerformanceOrdersTamEngineers model) {
                this.creatorEmpId = model.creatorEmpId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.hrStatus = model.hrStatus;
                this.id = model.id;
                this.lastName = model.lastName;
                this.modifierEmpId = model.modifierEmpId;
                this.name = model.name;
                this.nickNameEn = model.nickNameEn;
                this.realmId = model.realmId;
                this.workid = model.workid;
            } 

            /**
             * creatorEmpId.
             */
            public Builder creatorEmpId(String creatorEmpId) {
                this.creatorEmpId = creatorEmpId;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * hrStatus.
             */
            public Builder hrStatus(String hrStatus) {
                this.hrStatus = hrStatus;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * lastName.
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            /**
             * modifierEmpId.
             */
            public Builder modifierEmpId(String modifierEmpId) {
                this.modifierEmpId = modifierEmpId;
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
             * nickNameEn.
             */
            public Builder nickNameEn(String nickNameEn) {
                this.nickNameEn = nickNameEn;
                return this;
            }

            /**
             * realmId.
             */
            public Builder realmId(Long realmId) {
                this.realmId = realmId;
                return this;
            }

            /**
             * workid.
             */
            public Builder workid(String workid) {
                this.workid = workid;
                return this;
            }

            public PerformanceOrdersTamEngineers build() {
                return new PerformanceOrdersTamEngineers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class PerformanceOrders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applyFileVOList")
        private java.util.List<ApplyFileVOList> applyFileVOList;

        @com.aliyun.core.annotation.NameInMap("appointmentCode")
        private String appointmentCode;

        @com.aliyun.core.annotation.NameInMap("appointmentEndTime")
        private Long appointmentEndTime;

        @com.aliyun.core.annotation.NameInMap("appointmentId")
        private String appointmentId;

        @com.aliyun.core.annotation.NameInMap("appointmentPassTime")
        private Long appointmentPassTime;

        @com.aliyun.core.annotation.NameInMap("appointmentTime")
        private Long appointmentTime;

        @com.aliyun.core.annotation.NameInMap("commodityDesc")
        private String commodityDesc;

        @com.aliyun.core.annotation.NameInMap("creatorEmpId")
        private String creatorEmpId;

        @com.aliyun.core.annotation.NameInMap("cycleService")
        private Boolean cycleService;

        @com.aliyun.core.annotation.NameInMap("extList")
        private java.util.List<ExtList> extList;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("mergeSolutionAndReporterOneStep")
        private Boolean mergeSolutionAndReporterOneStep;

        @com.aliyun.core.annotation.NameInMap("modifierEmpId")
        private String modifierEmpId;

        @com.aliyun.core.annotation.NameInMap("ntmCommodityCode")
        private String ntmCommodityCode;

        @com.aliyun.core.annotation.NameInMap("orderDetail")
        private Object orderDetail;

        @com.aliyun.core.annotation.NameInMap("orderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("packCount")
        private Integer packCount;

        @com.aliyun.core.annotation.NameInMap("packDetails")
        private java.util.List<java.util.Map<String, ?>> packDetails;

        @com.aliyun.core.annotation.NameInMap("performanceNodeDTOS")
        private java.util.List<PerformanceNodeDTOS> performanceNodeDTOS;

        @com.aliyun.core.annotation.NameInMap("performancePacks")
        private java.util.List<PerformancePacks> performancePacks;

        @com.aliyun.core.annotation.NameInMap("purchasePackCode")
        private Integer purchasePackCode;

        @com.aliyun.core.annotation.NameInMap("serviceApplyId")
        private Long serviceApplyId;

        @com.aliyun.core.annotation.NameInMap("serviceMonthReports")
        private java.util.List<PerformanceOrdersServiceMonthReports> serviceMonthReports;

        @com.aliyun.core.annotation.NameInMap("serviceReports")
        private java.util.List<PerformanceOrdersServiceReports> serviceReports;

        @com.aliyun.core.annotation.NameInMap("serviceSchemes")
        private java.util.List<PerformanceOrdersServiceSchemes> serviceSchemes;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("statusStr")
        private String statusStr;

        @com.aliyun.core.annotation.NameInMap("supportTime")
        private java.util.List<Long> supportTime;

        @com.aliyun.core.annotation.NameInMap("tamEngineers")
        private java.util.List<PerformanceOrdersTamEngineers> tamEngineers;

        private PerformanceOrders(Builder builder) {
            this.applyFileVOList = builder.applyFileVOList;
            this.appointmentCode = builder.appointmentCode;
            this.appointmentEndTime = builder.appointmentEndTime;
            this.appointmentId = builder.appointmentId;
            this.appointmentPassTime = builder.appointmentPassTime;
            this.appointmentTime = builder.appointmentTime;
            this.commodityDesc = builder.commodityDesc;
            this.creatorEmpId = builder.creatorEmpId;
            this.cycleService = builder.cycleService;
            this.extList = builder.extList;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.mergeSolutionAndReporterOneStep = builder.mergeSolutionAndReporterOneStep;
            this.modifierEmpId = builder.modifierEmpId;
            this.ntmCommodityCode = builder.ntmCommodityCode;
            this.orderDetail = builder.orderDetail;
            this.orderId = builder.orderId;
            this.packCount = builder.packCount;
            this.packDetails = builder.packDetails;
            this.performanceNodeDTOS = builder.performanceNodeDTOS;
            this.performancePacks = builder.performancePacks;
            this.purchasePackCode = builder.purchasePackCode;
            this.serviceApplyId = builder.serviceApplyId;
            this.serviceMonthReports = builder.serviceMonthReports;
            this.serviceReports = builder.serviceReports;
            this.serviceSchemes = builder.serviceSchemes;
            this.status = builder.status;
            this.statusStr = builder.statusStr;
            this.supportTime = builder.supportTime;
            this.tamEngineers = builder.tamEngineers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformanceOrders create() {
            return builder().build();
        }

        /**
         * @return applyFileVOList
         */
        public java.util.List<ApplyFileVOList> getApplyFileVOList() {
            return this.applyFileVOList;
        }

        /**
         * @return appointmentCode
         */
        public String getAppointmentCode() {
            return this.appointmentCode;
        }

        /**
         * @return appointmentEndTime
         */
        public Long getAppointmentEndTime() {
            return this.appointmentEndTime;
        }

        /**
         * @return appointmentId
         */
        public String getAppointmentId() {
            return this.appointmentId;
        }

        /**
         * @return appointmentPassTime
         */
        public Long getAppointmentPassTime() {
            return this.appointmentPassTime;
        }

        /**
         * @return appointmentTime
         */
        public Long getAppointmentTime() {
            return this.appointmentTime;
        }

        /**
         * @return commodityDesc
         */
        public String getCommodityDesc() {
            return this.commodityDesc;
        }

        /**
         * @return creatorEmpId
         */
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        /**
         * @return cycleService
         */
        public Boolean getCycleService() {
            return this.cycleService;
        }

        /**
         * @return extList
         */
        public java.util.List<ExtList> getExtList() {
            return this.extList;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return mergeSolutionAndReporterOneStep
         */
        public Boolean getMergeSolutionAndReporterOneStep() {
            return this.mergeSolutionAndReporterOneStep;
        }

        /**
         * @return modifierEmpId
         */
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        /**
         * @return ntmCommodityCode
         */
        public String getNtmCommodityCode() {
            return this.ntmCommodityCode;
        }

        /**
         * @return orderDetail
         */
        public Object getOrderDetail() {
            return this.orderDetail;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return packCount
         */
        public Integer getPackCount() {
            return this.packCount;
        }

        /**
         * @return packDetails
         */
        public java.util.List<java.util.Map<String, ?>> getPackDetails() {
            return this.packDetails;
        }

        /**
         * @return performanceNodeDTOS
         */
        public java.util.List<PerformanceNodeDTOS> getPerformanceNodeDTOS() {
            return this.performanceNodeDTOS;
        }

        /**
         * @return performancePacks
         */
        public java.util.List<PerformancePacks> getPerformancePacks() {
            return this.performancePacks;
        }

        /**
         * @return purchasePackCode
         */
        public Integer getPurchasePackCode() {
            return this.purchasePackCode;
        }

        /**
         * @return serviceApplyId
         */
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        /**
         * @return serviceMonthReports
         */
        public java.util.List<PerformanceOrdersServiceMonthReports> getServiceMonthReports() {
            return this.serviceMonthReports;
        }

        /**
         * @return serviceReports
         */
        public java.util.List<PerformanceOrdersServiceReports> getServiceReports() {
            return this.serviceReports;
        }

        /**
         * @return serviceSchemes
         */
        public java.util.List<PerformanceOrdersServiceSchemes> getServiceSchemes() {
            return this.serviceSchemes;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return statusStr
         */
        public String getStatusStr() {
            return this.statusStr;
        }

        /**
         * @return supportTime
         */
        public java.util.List<Long> getSupportTime() {
            return this.supportTime;
        }

        /**
         * @return tamEngineers
         */
        public java.util.List<PerformanceOrdersTamEngineers> getTamEngineers() {
            return this.tamEngineers;
        }

        public static final class Builder {
            private java.util.List<ApplyFileVOList> applyFileVOList; 
            private String appointmentCode; 
            private Long appointmentEndTime; 
            private String appointmentId; 
            private Long appointmentPassTime; 
            private Long appointmentTime; 
            private String commodityDesc; 
            private String creatorEmpId; 
            private Boolean cycleService; 
            private java.util.List<ExtList> extList; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Boolean mergeSolutionAndReporterOneStep; 
            private String modifierEmpId; 
            private String ntmCommodityCode; 
            private Object orderDetail; 
            private Long orderId; 
            private Integer packCount; 
            private java.util.List<java.util.Map<String, ?>> packDetails; 
            private java.util.List<PerformanceNodeDTOS> performanceNodeDTOS; 
            private java.util.List<PerformancePacks> performancePacks; 
            private Integer purchasePackCode; 
            private Long serviceApplyId; 
            private java.util.List<PerformanceOrdersServiceMonthReports> serviceMonthReports; 
            private java.util.List<PerformanceOrdersServiceReports> serviceReports; 
            private java.util.List<PerformanceOrdersServiceSchemes> serviceSchemes; 
            private Integer status; 
            private String statusStr; 
            private java.util.List<Long> supportTime; 
            private java.util.List<PerformanceOrdersTamEngineers> tamEngineers; 

            private Builder() {
            } 

            private Builder(PerformanceOrders model) {
                this.applyFileVOList = model.applyFileVOList;
                this.appointmentCode = model.appointmentCode;
                this.appointmentEndTime = model.appointmentEndTime;
                this.appointmentId = model.appointmentId;
                this.appointmentPassTime = model.appointmentPassTime;
                this.appointmentTime = model.appointmentTime;
                this.commodityDesc = model.commodityDesc;
                this.creatorEmpId = model.creatorEmpId;
                this.cycleService = model.cycleService;
                this.extList = model.extList;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.mergeSolutionAndReporterOneStep = model.mergeSolutionAndReporterOneStep;
                this.modifierEmpId = model.modifierEmpId;
                this.ntmCommodityCode = model.ntmCommodityCode;
                this.orderDetail = model.orderDetail;
                this.orderId = model.orderId;
                this.packCount = model.packCount;
                this.packDetails = model.packDetails;
                this.performanceNodeDTOS = model.performanceNodeDTOS;
                this.performancePacks = model.performancePacks;
                this.purchasePackCode = model.purchasePackCode;
                this.serviceApplyId = model.serviceApplyId;
                this.serviceMonthReports = model.serviceMonthReports;
                this.serviceReports = model.serviceReports;
                this.serviceSchemes = model.serviceSchemes;
                this.status = model.status;
                this.statusStr = model.statusStr;
                this.supportTime = model.supportTime;
                this.tamEngineers = model.tamEngineers;
            } 

            /**
             * applyFileVOList.
             */
            public Builder applyFileVOList(java.util.List<ApplyFileVOList> applyFileVOList) {
                this.applyFileVOList = applyFileVOList;
                return this;
            }

            /**
             * appointmentCode.
             */
            public Builder appointmentCode(String appointmentCode) {
                this.appointmentCode = appointmentCode;
                return this;
            }

            /**
             * appointmentEndTime.
             */
            public Builder appointmentEndTime(Long appointmentEndTime) {
                this.appointmentEndTime = appointmentEndTime;
                return this;
            }

            /**
             * appointmentId.
             */
            public Builder appointmentId(String appointmentId) {
                this.appointmentId = appointmentId;
                return this;
            }

            /**
             * appointmentPassTime.
             */
            public Builder appointmentPassTime(Long appointmentPassTime) {
                this.appointmentPassTime = appointmentPassTime;
                return this;
            }

            /**
             * appointmentTime.
             */
            public Builder appointmentTime(Long appointmentTime) {
                this.appointmentTime = appointmentTime;
                return this;
            }

            /**
             * commodityDesc.
             */
            public Builder commodityDesc(String commodityDesc) {
                this.commodityDesc = commodityDesc;
                return this;
            }

            /**
             * creatorEmpId.
             */
            public Builder creatorEmpId(String creatorEmpId) {
                this.creatorEmpId = creatorEmpId;
                return this;
            }

            /**
             * cycleService.
             */
            public Builder cycleService(Boolean cycleService) {
                this.cycleService = cycleService;
                return this;
            }

            /**
             * extList.
             */
            public Builder extList(java.util.List<ExtList> extList) {
                this.extList = extList;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * mergeSolutionAndReporterOneStep.
             */
            public Builder mergeSolutionAndReporterOneStep(Boolean mergeSolutionAndReporterOneStep) {
                this.mergeSolutionAndReporterOneStep = mergeSolutionAndReporterOneStep;
                return this;
            }

            /**
             * modifierEmpId.
             */
            public Builder modifierEmpId(String modifierEmpId) {
                this.modifierEmpId = modifierEmpId;
                return this;
            }

            /**
             * ntmCommodityCode.
             */
            public Builder ntmCommodityCode(String ntmCommodityCode) {
                this.ntmCommodityCode = ntmCommodityCode;
                return this;
            }

            /**
             * orderDetail.
             */
            public Builder orderDetail(Object orderDetail) {
                this.orderDetail = orderDetail;
                return this;
            }

            /**
             * orderId.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * packCount.
             */
            public Builder packCount(Integer packCount) {
                this.packCount = packCount;
                return this;
            }

            /**
             * packDetails.
             */
            public Builder packDetails(java.util.List<java.util.Map<String, ?>> packDetails) {
                this.packDetails = packDetails;
                return this;
            }

            /**
             * performanceNodeDTOS.
             */
            public Builder performanceNodeDTOS(java.util.List<PerformanceNodeDTOS> performanceNodeDTOS) {
                this.performanceNodeDTOS = performanceNodeDTOS;
                return this;
            }

            /**
             * performancePacks.
             */
            public Builder performancePacks(java.util.List<PerformancePacks> performancePacks) {
                this.performancePacks = performancePacks;
                return this;
            }

            /**
             * purchasePackCode.
             */
            public Builder purchasePackCode(Integer purchasePackCode) {
                this.purchasePackCode = purchasePackCode;
                return this;
            }

            /**
             * serviceApplyId.
             */
            public Builder serviceApplyId(Long serviceApplyId) {
                this.serviceApplyId = serviceApplyId;
                return this;
            }

            /**
             * serviceMonthReports.
             */
            public Builder serviceMonthReports(java.util.List<PerformanceOrdersServiceMonthReports> serviceMonthReports) {
                this.serviceMonthReports = serviceMonthReports;
                return this;
            }

            /**
             * serviceReports.
             */
            public Builder serviceReports(java.util.List<PerformanceOrdersServiceReports> serviceReports) {
                this.serviceReports = serviceReports;
                return this;
            }

            /**
             * serviceSchemes.
             */
            public Builder serviceSchemes(java.util.List<PerformanceOrdersServiceSchemes> serviceSchemes) {
                this.serviceSchemes = serviceSchemes;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * statusStr.
             */
            public Builder statusStr(String statusStr) {
                this.statusStr = statusStr;
                return this;
            }

            /**
             * supportTime.
             */
            public Builder supportTime(java.util.List<Long> supportTime) {
                this.supportTime = supportTime;
                return this;
            }

            /**
             * tamEngineers.
             */
            public Builder tamEngineers(java.util.List<PerformanceOrdersTamEngineers> tamEngineers) {
                this.tamEngineers = tamEngineers;
                return this;
            }

            public PerformanceOrders build() {
                return new PerformanceOrders(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class ListPerformancePacksApplyFileVOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appointmentId")
        private String appointmentId;

        @com.aliyun.core.annotation.NameInMap("batchGroup")
        private String batchGroup;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("remarke")
        private String remarke;

        @com.aliyun.core.annotation.NameInMap("serviceApplyId")
        private Long serviceApplyId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private ListPerformancePacksApplyFileVOList(Builder builder) {
            this.appointmentId = builder.appointmentId;
            this.batchGroup = builder.batchGroup;
            this.customerId = builder.customerId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.remarke = builder.remarke;
            this.serviceApplyId = builder.serviceApplyId;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListPerformancePacksApplyFileVOList create() {
            return builder().build();
        }

        /**
         * @return appointmentId
         */
        public String getAppointmentId() {
            return this.appointmentId;
        }

        /**
         * @return batchGroup
         */
        public String getBatchGroup() {
            return this.batchGroup;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return remarke
         */
        public String getRemarke() {
            return this.remarke;
        }

        /**
         * @return serviceApplyId
         */
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String appointmentId; 
            private String batchGroup; 
            private String customerId; 
            private String fileName; 
            private Integer fileType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String remarke; 
            private Long serviceApplyId; 
            private Integer status; 
            private String url; 

            private Builder() {
            } 

            private Builder(ListPerformancePacksApplyFileVOList model) {
                this.appointmentId = model.appointmentId;
                this.batchGroup = model.batchGroup;
                this.customerId = model.customerId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.remarke = model.remarke;
                this.serviceApplyId = model.serviceApplyId;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * appointmentId.
             */
            public Builder appointmentId(String appointmentId) {
                this.appointmentId = appointmentId;
                return this;
            }

            /**
             * batchGroup.
             */
            public Builder batchGroup(String batchGroup) {
                this.batchGroup = batchGroup;
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
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileType.
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * remarke.
             */
            public Builder remarke(String remarke) {
                this.remarke = remarke;
                return this;
            }

            /**
             * serviceApplyId.
             */
            public Builder serviceApplyId(Long serviceApplyId) {
                this.serviceApplyId = serviceApplyId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ListPerformancePacksApplyFileVOList build() {
                return new ListPerformancePacksApplyFileVOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class ListPerformancePacksExtList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("keyCode")
        private String keyCode;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private Object value;

        @com.aliyun.core.annotation.NameInMap("view")
        private String view;

        private ListPerformancePacksExtList(Builder builder) {
            this.keyCode = builder.keyCode;
            this.name = builder.name;
            this.value = builder.value;
            this.view = builder.view;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListPerformancePacksExtList create() {
            return builder().build();
        }

        /**
         * @return keyCode
         */
        public String getKeyCode() {
            return this.keyCode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        /**
         * @return view
         */
        public String getView() {
            return this.view;
        }

        public static final class Builder {
            private String keyCode; 
            private String name; 
            private Object value; 
            private String view; 

            private Builder() {
            } 

            private Builder(ListPerformancePacksExtList model) {
                this.keyCode = model.keyCode;
                this.name = model.name;
                this.value = model.value;
                this.view = model.view;
            } 

            /**
             * keyCode.
             */
            public Builder keyCode(String keyCode) {
                this.keyCode = keyCode;
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
             * value.
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            /**
             * view.
             */
            public Builder view(String view) {
                this.view = view;
                return this;
            }

            public ListPerformancePacksExtList build() {
                return new ListPerformancePacksExtList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class ListPerformancePacksPerformanceNodeDTOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("display")
        private Boolean display;

        @com.aliyun.core.annotation.NameInMap("extendInfo")
        private Object extendInfo;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("nodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        private ListPerformancePacksPerformanceNodeDTOS(Builder builder) {
            this.display = builder.display;
            this.extendInfo = builder.extendInfo;
            this.index = builder.index;
            this.nodeName = builder.nodeName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListPerformancePacksPerformanceNodeDTOS create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return extendInfo
         */
        public Object getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean display; 
            private Object extendInfo; 
            private Integer index; 
            private String nodeName; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(ListPerformancePacksPerformanceNodeDTOS model) {
                this.display = model.display;
                this.extendInfo = model.extendInfo;
                this.index = model.index;
                this.nodeName = model.nodeName;
                this.status = model.status;
            } 

            /**
             * display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * extendInfo.
             */
            public Builder extendInfo(Object extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * nodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public ListPerformancePacksPerformanceNodeDTOS build() {
                return new ListPerformancePacksPerformanceNodeDTOS(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class PerformancePacksServiceMonthReports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appointmentId")
        private String appointmentId;

        @com.aliyun.core.annotation.NameInMap("batchGroup")
        private String batchGroup;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("remarke")
        private String remarke;

        @com.aliyun.core.annotation.NameInMap("serviceApplyId")
        private Long serviceApplyId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private PerformancePacksServiceMonthReports(Builder builder) {
            this.appointmentId = builder.appointmentId;
            this.batchGroup = builder.batchGroup;
            this.customerId = builder.customerId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.remarke = builder.remarke;
            this.serviceApplyId = builder.serviceApplyId;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformancePacksServiceMonthReports create() {
            return builder().build();
        }

        /**
         * @return appointmentId
         */
        public String getAppointmentId() {
            return this.appointmentId;
        }

        /**
         * @return batchGroup
         */
        public String getBatchGroup() {
            return this.batchGroup;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return remarke
         */
        public String getRemarke() {
            return this.remarke;
        }

        /**
         * @return serviceApplyId
         */
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String appointmentId; 
            private String batchGroup; 
            private String customerId; 
            private String fileName; 
            private Integer fileType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String remarke; 
            private Long serviceApplyId; 
            private Integer status; 
            private String url; 

            private Builder() {
            } 

            private Builder(PerformancePacksServiceMonthReports model) {
                this.appointmentId = model.appointmentId;
                this.batchGroup = model.batchGroup;
                this.customerId = model.customerId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.remarke = model.remarke;
                this.serviceApplyId = model.serviceApplyId;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * appointmentId.
             */
            public Builder appointmentId(String appointmentId) {
                this.appointmentId = appointmentId;
                return this;
            }

            /**
             * batchGroup.
             */
            public Builder batchGroup(String batchGroup) {
                this.batchGroup = batchGroup;
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
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileType.
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * remarke.
             */
            public Builder remarke(String remarke) {
                this.remarke = remarke;
                return this;
            }

            /**
             * serviceApplyId.
             */
            public Builder serviceApplyId(Long serviceApplyId) {
                this.serviceApplyId = serviceApplyId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public PerformancePacksServiceMonthReports build() {
                return new PerformancePacksServiceMonthReports(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class PerformancePacksServiceReports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appointmentId")
        private String appointmentId;

        @com.aliyun.core.annotation.NameInMap("batchGroup")
        private String batchGroup;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("remarke")
        private String remarke;

        @com.aliyun.core.annotation.NameInMap("serviceApplyId")
        private Long serviceApplyId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private PerformancePacksServiceReports(Builder builder) {
            this.appointmentId = builder.appointmentId;
            this.batchGroup = builder.batchGroup;
            this.customerId = builder.customerId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.remarke = builder.remarke;
            this.serviceApplyId = builder.serviceApplyId;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformancePacksServiceReports create() {
            return builder().build();
        }

        /**
         * @return appointmentId
         */
        public String getAppointmentId() {
            return this.appointmentId;
        }

        /**
         * @return batchGroup
         */
        public String getBatchGroup() {
            return this.batchGroup;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return remarke
         */
        public String getRemarke() {
            return this.remarke;
        }

        /**
         * @return serviceApplyId
         */
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String appointmentId; 
            private String batchGroup; 
            private String customerId; 
            private String fileName; 
            private Integer fileType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String remarke; 
            private Long serviceApplyId; 
            private Integer status; 
            private String url; 

            private Builder() {
            } 

            private Builder(PerformancePacksServiceReports model) {
                this.appointmentId = model.appointmentId;
                this.batchGroup = model.batchGroup;
                this.customerId = model.customerId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.remarke = model.remarke;
                this.serviceApplyId = model.serviceApplyId;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * appointmentId.
             */
            public Builder appointmentId(String appointmentId) {
                this.appointmentId = appointmentId;
                return this;
            }

            /**
             * batchGroup.
             */
            public Builder batchGroup(String batchGroup) {
                this.batchGroup = batchGroup;
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
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileType.
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * remarke.
             */
            public Builder remarke(String remarke) {
                this.remarke = remarke;
                return this;
            }

            /**
             * serviceApplyId.
             */
            public Builder serviceApplyId(Long serviceApplyId) {
                this.serviceApplyId = serviceApplyId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public PerformancePacksServiceReports build() {
                return new PerformancePacksServiceReports(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class PerformancePacksServiceSchemes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appointmentId")
        private String appointmentId;

        @com.aliyun.core.annotation.NameInMap("batchGroup")
        private String batchGroup;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("remarke")
        private String remarke;

        @com.aliyun.core.annotation.NameInMap("serviceApplyId")
        private Long serviceApplyId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private PerformancePacksServiceSchemes(Builder builder) {
            this.appointmentId = builder.appointmentId;
            this.batchGroup = builder.batchGroup;
            this.customerId = builder.customerId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.remarke = builder.remarke;
            this.serviceApplyId = builder.serviceApplyId;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformancePacksServiceSchemes create() {
            return builder().build();
        }

        /**
         * @return appointmentId
         */
        public String getAppointmentId() {
            return this.appointmentId;
        }

        /**
         * @return batchGroup
         */
        public String getBatchGroup() {
            return this.batchGroup;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return remarke
         */
        public String getRemarke() {
            return this.remarke;
        }

        /**
         * @return serviceApplyId
         */
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String appointmentId; 
            private String batchGroup; 
            private String customerId; 
            private String fileName; 
            private Integer fileType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String remarke; 
            private Long serviceApplyId; 
            private Integer status; 
            private String url; 

            private Builder() {
            } 

            private Builder(PerformancePacksServiceSchemes model) {
                this.appointmentId = model.appointmentId;
                this.batchGroup = model.batchGroup;
                this.customerId = model.customerId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.remarke = model.remarke;
                this.serviceApplyId = model.serviceApplyId;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * appointmentId.
             */
            public Builder appointmentId(String appointmentId) {
                this.appointmentId = appointmentId;
                return this;
            }

            /**
             * batchGroup.
             */
            public Builder batchGroup(String batchGroup) {
                this.batchGroup = batchGroup;
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
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileType.
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * remarke.
             */
            public Builder remarke(String remarke) {
                this.remarke = remarke;
                return this;
            }

            /**
             * serviceApplyId.
             */
            public Builder serviceApplyId(Long serviceApplyId) {
                this.serviceApplyId = serviceApplyId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public PerformancePacksServiceSchemes build() {
                return new PerformancePacksServiceSchemes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class PerformancePacksTamEngineers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creatorEmpId")
        private String creatorEmpId;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("hrStatus")
        private String hrStatus;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("lastName")
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("modifierEmpId")
        private String modifierEmpId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nickNameEn")
        private String nickNameEn;

        @com.aliyun.core.annotation.NameInMap("realmId")
        private Long realmId;

        @com.aliyun.core.annotation.NameInMap("workid")
        private String workid;

        private PerformancePacksTamEngineers(Builder builder) {
            this.creatorEmpId = builder.creatorEmpId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hrStatus = builder.hrStatus;
            this.id = builder.id;
            this.lastName = builder.lastName;
            this.modifierEmpId = builder.modifierEmpId;
            this.name = builder.name;
            this.nickNameEn = builder.nickNameEn;
            this.realmId = builder.realmId;
            this.workid = builder.workid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerformancePacksTamEngineers create() {
            return builder().build();
        }

        /**
         * @return creatorEmpId
         */
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return hrStatus
         */
        public String getHrStatus() {
            return this.hrStatus;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastName
         */
        public String getLastName() {
            return this.lastName;
        }

        /**
         * @return modifierEmpId
         */
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nickNameEn
         */
        public String getNickNameEn() {
            return this.nickNameEn;
        }

        /**
         * @return realmId
         */
        public Long getRealmId() {
            return this.realmId;
        }

        /**
         * @return workid
         */
        public String getWorkid() {
            return this.workid;
        }

        public static final class Builder {
            private String creatorEmpId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String hrStatus; 
            private Long id; 
            private String lastName; 
            private String modifierEmpId; 
            private String name; 
            private String nickNameEn; 
            private Long realmId; 
            private String workid; 

            private Builder() {
            } 

            private Builder(PerformancePacksTamEngineers model) {
                this.creatorEmpId = model.creatorEmpId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.hrStatus = model.hrStatus;
                this.id = model.id;
                this.lastName = model.lastName;
                this.modifierEmpId = model.modifierEmpId;
                this.name = model.name;
                this.nickNameEn = model.nickNameEn;
                this.realmId = model.realmId;
                this.workid = model.workid;
            } 

            /**
             * creatorEmpId.
             */
            public Builder creatorEmpId(String creatorEmpId) {
                this.creatorEmpId = creatorEmpId;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * hrStatus.
             */
            public Builder hrStatus(String hrStatus) {
                this.hrStatus = hrStatus;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * lastName.
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            /**
             * modifierEmpId.
             */
            public Builder modifierEmpId(String modifierEmpId) {
                this.modifierEmpId = modifierEmpId;
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
             * nickNameEn.
             */
            public Builder nickNameEn(String nickNameEn) {
                this.nickNameEn = nickNameEn;
                return this;
            }

            /**
             * realmId.
             */
            public Builder realmId(Long realmId) {
                this.realmId = realmId;
                return this;
            }

            /**
             * workid.
             */
            public Builder workid(String workid) {
                this.workid = workid;
                return this;
            }

            public PerformancePacksTamEngineers build() {
                return new PerformancePacksTamEngineers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class ListPerformancePacks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applyFileVOList")
        private java.util.List<ListPerformancePacksApplyFileVOList> applyFileVOList;

        @com.aliyun.core.annotation.NameInMap("appointmentCode")
        private String appointmentCode;

        @com.aliyun.core.annotation.NameInMap("appointmentEndTime")
        private Long appointmentEndTime;

        @com.aliyun.core.annotation.NameInMap("appointmentId")
        private String appointmentId;

        @com.aliyun.core.annotation.NameInMap("appointmentPassTime")
        private Long appointmentPassTime;

        @com.aliyun.core.annotation.NameInMap("appointmentTime")
        private Long appointmentTime;

        @com.aliyun.core.annotation.NameInMap("commodityDesc")
        private String commodityDesc;

        @com.aliyun.core.annotation.NameInMap("creatorEmpId")
        private String creatorEmpId;

        @com.aliyun.core.annotation.NameInMap("cycleService")
        private Boolean cycleService;

        @com.aliyun.core.annotation.NameInMap("extList")
        private java.util.List<ListPerformancePacksExtList> extList;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("mergeSolutionAndReporterOneStep")
        private Boolean mergeSolutionAndReporterOneStep;

        @com.aliyun.core.annotation.NameInMap("modifierEmpId")
        private String modifierEmpId;

        @com.aliyun.core.annotation.NameInMap("ntmCommodityCode")
        private String ntmCommodityCode;

        @com.aliyun.core.annotation.NameInMap("orderDetail")
        private Object orderDetail;

        @com.aliyun.core.annotation.NameInMap("orderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("performanceNodeDTOS")
        private java.util.List<ListPerformancePacksPerformanceNodeDTOS> performanceNodeDTOS;

        @com.aliyun.core.annotation.NameInMap("purchasePackCode")
        private Integer purchasePackCode;

        @com.aliyun.core.annotation.NameInMap("serviceApplyId")
        private Long serviceApplyId;

        @com.aliyun.core.annotation.NameInMap("serviceMonthReports")
        private java.util.List<PerformancePacksServiceMonthReports> serviceMonthReports;

        @com.aliyun.core.annotation.NameInMap("serviceReports")
        private java.util.List<PerformancePacksServiceReports> serviceReports;

        @com.aliyun.core.annotation.NameInMap("serviceSchemes")
        private java.util.List<PerformancePacksServiceSchemes> serviceSchemes;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("statusStr")
        private String statusStr;

        @com.aliyun.core.annotation.NameInMap("supportTime")
        private java.util.List<Long> supportTime;

        @com.aliyun.core.annotation.NameInMap("tamEngineers")
        private java.util.List<PerformancePacksTamEngineers> tamEngineers;

        private ListPerformancePacks(Builder builder) {
            this.applyFileVOList = builder.applyFileVOList;
            this.appointmentCode = builder.appointmentCode;
            this.appointmentEndTime = builder.appointmentEndTime;
            this.appointmentId = builder.appointmentId;
            this.appointmentPassTime = builder.appointmentPassTime;
            this.appointmentTime = builder.appointmentTime;
            this.commodityDesc = builder.commodityDesc;
            this.creatorEmpId = builder.creatorEmpId;
            this.cycleService = builder.cycleService;
            this.extList = builder.extList;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.mergeSolutionAndReporterOneStep = builder.mergeSolutionAndReporterOneStep;
            this.modifierEmpId = builder.modifierEmpId;
            this.ntmCommodityCode = builder.ntmCommodityCode;
            this.orderDetail = builder.orderDetail;
            this.orderId = builder.orderId;
            this.performanceNodeDTOS = builder.performanceNodeDTOS;
            this.purchasePackCode = builder.purchasePackCode;
            this.serviceApplyId = builder.serviceApplyId;
            this.serviceMonthReports = builder.serviceMonthReports;
            this.serviceReports = builder.serviceReports;
            this.serviceSchemes = builder.serviceSchemes;
            this.status = builder.status;
            this.statusStr = builder.statusStr;
            this.supportTime = builder.supportTime;
            this.tamEngineers = builder.tamEngineers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListPerformancePacks create() {
            return builder().build();
        }

        /**
         * @return applyFileVOList
         */
        public java.util.List<ListPerformancePacksApplyFileVOList> getApplyFileVOList() {
            return this.applyFileVOList;
        }

        /**
         * @return appointmentCode
         */
        public String getAppointmentCode() {
            return this.appointmentCode;
        }

        /**
         * @return appointmentEndTime
         */
        public Long getAppointmentEndTime() {
            return this.appointmentEndTime;
        }

        /**
         * @return appointmentId
         */
        public String getAppointmentId() {
            return this.appointmentId;
        }

        /**
         * @return appointmentPassTime
         */
        public Long getAppointmentPassTime() {
            return this.appointmentPassTime;
        }

        /**
         * @return appointmentTime
         */
        public Long getAppointmentTime() {
            return this.appointmentTime;
        }

        /**
         * @return commodityDesc
         */
        public String getCommodityDesc() {
            return this.commodityDesc;
        }

        /**
         * @return creatorEmpId
         */
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        /**
         * @return cycleService
         */
        public Boolean getCycleService() {
            return this.cycleService;
        }

        /**
         * @return extList
         */
        public java.util.List<ListPerformancePacksExtList> getExtList() {
            return this.extList;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return mergeSolutionAndReporterOneStep
         */
        public Boolean getMergeSolutionAndReporterOneStep() {
            return this.mergeSolutionAndReporterOneStep;
        }

        /**
         * @return modifierEmpId
         */
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        /**
         * @return ntmCommodityCode
         */
        public String getNtmCommodityCode() {
            return this.ntmCommodityCode;
        }

        /**
         * @return orderDetail
         */
        public Object getOrderDetail() {
            return this.orderDetail;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return performanceNodeDTOS
         */
        public java.util.List<ListPerformancePacksPerformanceNodeDTOS> getPerformanceNodeDTOS() {
            return this.performanceNodeDTOS;
        }

        /**
         * @return purchasePackCode
         */
        public Integer getPurchasePackCode() {
            return this.purchasePackCode;
        }

        /**
         * @return serviceApplyId
         */
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        /**
         * @return serviceMonthReports
         */
        public java.util.List<PerformancePacksServiceMonthReports> getServiceMonthReports() {
            return this.serviceMonthReports;
        }

        /**
         * @return serviceReports
         */
        public java.util.List<PerformancePacksServiceReports> getServiceReports() {
            return this.serviceReports;
        }

        /**
         * @return serviceSchemes
         */
        public java.util.List<PerformancePacksServiceSchemes> getServiceSchemes() {
            return this.serviceSchemes;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return statusStr
         */
        public String getStatusStr() {
            return this.statusStr;
        }

        /**
         * @return supportTime
         */
        public java.util.List<Long> getSupportTime() {
            return this.supportTime;
        }

        /**
         * @return tamEngineers
         */
        public java.util.List<PerformancePacksTamEngineers> getTamEngineers() {
            return this.tamEngineers;
        }

        public static final class Builder {
            private java.util.List<ListPerformancePacksApplyFileVOList> applyFileVOList; 
            private String appointmentCode; 
            private Long appointmentEndTime; 
            private String appointmentId; 
            private Long appointmentPassTime; 
            private Long appointmentTime; 
            private String commodityDesc; 
            private String creatorEmpId; 
            private Boolean cycleService; 
            private java.util.List<ListPerformancePacksExtList> extList; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Boolean mergeSolutionAndReporterOneStep; 
            private String modifierEmpId; 
            private String ntmCommodityCode; 
            private Object orderDetail; 
            private Long orderId; 
            private java.util.List<ListPerformancePacksPerformanceNodeDTOS> performanceNodeDTOS; 
            private Integer purchasePackCode; 
            private Long serviceApplyId; 
            private java.util.List<PerformancePacksServiceMonthReports> serviceMonthReports; 
            private java.util.List<PerformancePacksServiceReports> serviceReports; 
            private java.util.List<PerformancePacksServiceSchemes> serviceSchemes; 
            private Integer status; 
            private String statusStr; 
            private java.util.List<Long> supportTime; 
            private java.util.List<PerformancePacksTamEngineers> tamEngineers; 

            private Builder() {
            } 

            private Builder(ListPerformancePacks model) {
                this.applyFileVOList = model.applyFileVOList;
                this.appointmentCode = model.appointmentCode;
                this.appointmentEndTime = model.appointmentEndTime;
                this.appointmentId = model.appointmentId;
                this.appointmentPassTime = model.appointmentPassTime;
                this.appointmentTime = model.appointmentTime;
                this.commodityDesc = model.commodityDesc;
                this.creatorEmpId = model.creatorEmpId;
                this.cycleService = model.cycleService;
                this.extList = model.extList;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.mergeSolutionAndReporterOneStep = model.mergeSolutionAndReporterOneStep;
                this.modifierEmpId = model.modifierEmpId;
                this.ntmCommodityCode = model.ntmCommodityCode;
                this.orderDetail = model.orderDetail;
                this.orderId = model.orderId;
                this.performanceNodeDTOS = model.performanceNodeDTOS;
                this.purchasePackCode = model.purchasePackCode;
                this.serviceApplyId = model.serviceApplyId;
                this.serviceMonthReports = model.serviceMonthReports;
                this.serviceReports = model.serviceReports;
                this.serviceSchemes = model.serviceSchemes;
                this.status = model.status;
                this.statusStr = model.statusStr;
                this.supportTime = model.supportTime;
                this.tamEngineers = model.tamEngineers;
            } 

            /**
             * applyFileVOList.
             */
            public Builder applyFileVOList(java.util.List<ListPerformancePacksApplyFileVOList> applyFileVOList) {
                this.applyFileVOList = applyFileVOList;
                return this;
            }

            /**
             * appointmentCode.
             */
            public Builder appointmentCode(String appointmentCode) {
                this.appointmentCode = appointmentCode;
                return this;
            }

            /**
             * appointmentEndTime.
             */
            public Builder appointmentEndTime(Long appointmentEndTime) {
                this.appointmentEndTime = appointmentEndTime;
                return this;
            }

            /**
             * appointmentId.
             */
            public Builder appointmentId(String appointmentId) {
                this.appointmentId = appointmentId;
                return this;
            }

            /**
             * appointmentPassTime.
             */
            public Builder appointmentPassTime(Long appointmentPassTime) {
                this.appointmentPassTime = appointmentPassTime;
                return this;
            }

            /**
             * appointmentTime.
             */
            public Builder appointmentTime(Long appointmentTime) {
                this.appointmentTime = appointmentTime;
                return this;
            }

            /**
             * commodityDesc.
             */
            public Builder commodityDesc(String commodityDesc) {
                this.commodityDesc = commodityDesc;
                return this;
            }

            /**
             * creatorEmpId.
             */
            public Builder creatorEmpId(String creatorEmpId) {
                this.creatorEmpId = creatorEmpId;
                return this;
            }

            /**
             * cycleService.
             */
            public Builder cycleService(Boolean cycleService) {
                this.cycleService = cycleService;
                return this;
            }

            /**
             * extList.
             */
            public Builder extList(java.util.List<ListPerformancePacksExtList> extList) {
                this.extList = extList;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * mergeSolutionAndReporterOneStep.
             */
            public Builder mergeSolutionAndReporterOneStep(Boolean mergeSolutionAndReporterOneStep) {
                this.mergeSolutionAndReporterOneStep = mergeSolutionAndReporterOneStep;
                return this;
            }

            /**
             * modifierEmpId.
             */
            public Builder modifierEmpId(String modifierEmpId) {
                this.modifierEmpId = modifierEmpId;
                return this;
            }

            /**
             * ntmCommodityCode.
             */
            public Builder ntmCommodityCode(String ntmCommodityCode) {
                this.ntmCommodityCode = ntmCommodityCode;
                return this;
            }

            /**
             * orderDetail.
             */
            public Builder orderDetail(Object orderDetail) {
                this.orderDetail = orderDetail;
                return this;
            }

            /**
             * orderId.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * performanceNodeDTOS.
             */
            public Builder performanceNodeDTOS(java.util.List<ListPerformancePacksPerformanceNodeDTOS> performanceNodeDTOS) {
                this.performanceNodeDTOS = performanceNodeDTOS;
                return this;
            }

            /**
             * purchasePackCode.
             */
            public Builder purchasePackCode(Integer purchasePackCode) {
                this.purchasePackCode = purchasePackCode;
                return this;
            }

            /**
             * serviceApplyId.
             */
            public Builder serviceApplyId(Long serviceApplyId) {
                this.serviceApplyId = serviceApplyId;
                return this;
            }

            /**
             * serviceMonthReports.
             */
            public Builder serviceMonthReports(java.util.List<PerformancePacksServiceMonthReports> serviceMonthReports) {
                this.serviceMonthReports = serviceMonthReports;
                return this;
            }

            /**
             * serviceReports.
             */
            public Builder serviceReports(java.util.List<PerformancePacksServiceReports> serviceReports) {
                this.serviceReports = serviceReports;
                return this;
            }

            /**
             * serviceSchemes.
             */
            public Builder serviceSchemes(java.util.List<PerformancePacksServiceSchemes> serviceSchemes) {
                this.serviceSchemes = serviceSchemes;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * statusStr.
             */
            public Builder statusStr(String statusStr) {
                this.statusStr = statusStr;
                return this;
            }

            /**
             * supportTime.
             */
            public Builder supportTime(java.util.List<Long> supportTime) {
                this.supportTime = supportTime;
                return this;
            }

            /**
             * tamEngineers.
             */
            public Builder tamEngineers(java.util.List<PerformancePacksTamEngineers> tamEngineers) {
                this.tamEngineers = tamEngineers;
                return this;
            }

            public ListPerformancePacks build() {
                return new ListPerformancePacks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class ListServiceReports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appointmentId")
        private String appointmentId;

        @com.aliyun.core.annotation.NameInMap("batchGroup")
        private String batchGroup;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private Integer fileType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("remarke")
        private String remarke;

        @com.aliyun.core.annotation.NameInMap("serviceApplyId")
        private Long serviceApplyId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private ListServiceReports(Builder builder) {
            this.appointmentId = builder.appointmentId;
            this.batchGroup = builder.batchGroup;
            this.customerId = builder.customerId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.remarke = builder.remarke;
            this.serviceApplyId = builder.serviceApplyId;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListServiceReports create() {
            return builder().build();
        }

        /**
         * @return appointmentId
         */
        public String getAppointmentId() {
            return this.appointmentId;
        }

        /**
         * @return batchGroup
         */
        public String getBatchGroup() {
            return this.batchGroup;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public Integer getFileType() {
            return this.fileType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return remarke
         */
        public String getRemarke() {
            return this.remarke;
        }

        /**
         * @return serviceApplyId
         */
        public Long getServiceApplyId() {
            return this.serviceApplyId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String appointmentId; 
            private String batchGroup; 
            private String customerId; 
            private String fileName; 
            private Integer fileType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String remarke; 
            private Long serviceApplyId; 
            private Integer status; 
            private String url; 

            private Builder() {
            } 

            private Builder(ListServiceReports model) {
                this.appointmentId = model.appointmentId;
                this.batchGroup = model.batchGroup;
                this.customerId = model.customerId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.remarke = model.remarke;
                this.serviceApplyId = model.serviceApplyId;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * appointmentId.
             */
            public Builder appointmentId(String appointmentId) {
                this.appointmentId = appointmentId;
                return this;
            }

            /**
             * batchGroup.
             */
            public Builder batchGroup(String batchGroup) {
                this.batchGroup = batchGroup;
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
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileType.
             */
            public Builder fileType(Integer fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * remarke.
             */
            public Builder remarke(String remarke) {
                this.remarke = remarke;
                return this;
            }

            /**
             * serviceApplyId.
             */
            public Builder serviceApplyId(Long serviceApplyId) {
                this.serviceApplyId = serviceApplyId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ListServiceReports build() {
                return new ListServiceReports(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applierId")
        private String applierId;

        @com.aliyun.core.annotation.NameInMap("applyCode")
        private String applyCode;

        @com.aliyun.core.annotation.NameInMap("applyComponentDetails")
        private java.util.List<java.util.List<String>> applyComponentDetails;

        @com.aliyun.core.annotation.NameInMap("applyTime")
        private Long applyTime;

        @com.aliyun.core.annotation.NameInMap("appointments")
        private java.util.List<Appointments> appointments;

        @com.aliyun.core.annotation.NameInMap("buyUrl")
        private String buyUrl;

        @com.aliyun.core.annotation.NameInMap("creatorEmpId")
        private String creatorEmpId;

        @com.aliyun.core.annotation.NameInMap("customerName")
        private String customerName;

        @com.aliyun.core.annotation.NameInMap("cycleService")
        private Boolean cycleService;

        @com.aliyun.core.annotation.NameInMap("executedCount")
        private Long executedCount;

        @com.aliyun.core.annotation.NameInMap("finishCount")
        private Long finishCount;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("isOneToOneExpertServiceByTime")
        private Boolean isOneToOneExpertServiceByTime;

        @com.aliyun.core.annotation.NameInMap("mergeSolutionAndReporterOneStep")
        private Boolean mergeSolutionAndReporterOneStep;

        @com.aliyun.core.annotation.NameInMap("modifierEmpId")
        private String modifierEmpId;

        @com.aliyun.core.annotation.NameInMap("packDetails")
        private java.util.List<java.util.Map<String, ?>> packDetails;

        @com.aliyun.core.annotation.NameInMap("payOrders")
        private java.util.List<PayOrders> payOrders;

        @com.aliyun.core.annotation.NameInMap("payUrl")
        private String payUrl;

        @com.aliyun.core.annotation.NameInMap("performanceOrders")
        private java.util.List<PerformanceOrders> performanceOrders;

        @com.aliyun.core.annotation.NameInMap("performancePacks")
        private java.util.List<ListPerformancePacks> performancePacks;

        @com.aliyun.core.annotation.NameInMap("reneWalUrl")
        private String reneWalUrl;

        @com.aliyun.core.annotation.NameInMap("serviceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("serviceReports")
        private java.util.List<ListServiceReports> serviceReports;

        @com.aliyun.core.annotation.NameInMap("serviceTimeRange")
        private java.util.List<Long> serviceTimeRange;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusCode")
        private Integer statusCode;

        @com.aliyun.core.annotation.NameInMap("statusStr")
        private String statusStr;

        @com.aliyun.core.annotation.NameInMap("termOfValidity")
        private String termOfValidity;

        @com.aliyun.core.annotation.NameInMap("totalPack")
        private Integer totalPack;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("usePack")
        private Long usePack;

        @com.aliyun.core.annotation.NameInMap("userRights")
        private String userRights;

        private List(Builder builder) {
            this.applierId = builder.applierId;
            this.applyCode = builder.applyCode;
            this.applyComponentDetails = builder.applyComponentDetails;
            this.applyTime = builder.applyTime;
            this.appointments = builder.appointments;
            this.buyUrl = builder.buyUrl;
            this.creatorEmpId = builder.creatorEmpId;
            this.customerName = builder.customerName;
            this.cycleService = builder.cycleService;
            this.executedCount = builder.executedCount;
            this.finishCount = builder.finishCount;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.isOneToOneExpertServiceByTime = builder.isOneToOneExpertServiceByTime;
            this.mergeSolutionAndReporterOneStep = builder.mergeSolutionAndReporterOneStep;
            this.modifierEmpId = builder.modifierEmpId;
            this.packDetails = builder.packDetails;
            this.payOrders = builder.payOrders;
            this.payUrl = builder.payUrl;
            this.performanceOrders = builder.performanceOrders;
            this.performancePacks = builder.performancePacks;
            this.reneWalUrl = builder.reneWalUrl;
            this.serviceCode = builder.serviceCode;
            this.serviceName = builder.serviceName;
            this.serviceReports = builder.serviceReports;
            this.serviceTimeRange = builder.serviceTimeRange;
            this.status = builder.status;
            this.statusCode = builder.statusCode;
            this.statusStr = builder.statusStr;
            this.termOfValidity = builder.termOfValidity;
            this.totalPack = builder.totalPack;
            this.type = builder.type;
            this.usePack = builder.usePack;
            this.userRights = builder.userRights;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return applierId
         */
        public String getApplierId() {
            return this.applierId;
        }

        /**
         * @return applyCode
         */
        public String getApplyCode() {
            return this.applyCode;
        }

        /**
         * @return applyComponentDetails
         */
        public java.util.List<java.util.List<String>> getApplyComponentDetails() {
            return this.applyComponentDetails;
        }

        /**
         * @return applyTime
         */
        public Long getApplyTime() {
            return this.applyTime;
        }

        /**
         * @return appointments
         */
        public java.util.List<Appointments> getAppointments() {
            return this.appointments;
        }

        /**
         * @return buyUrl
         */
        public String getBuyUrl() {
            return this.buyUrl;
        }

        /**
         * @return creatorEmpId
         */
        public String getCreatorEmpId() {
            return this.creatorEmpId;
        }

        /**
         * @return customerName
         */
        public String getCustomerName() {
            return this.customerName;
        }

        /**
         * @return cycleService
         */
        public Boolean getCycleService() {
            return this.cycleService;
        }

        /**
         * @return executedCount
         */
        public Long getExecutedCount() {
            return this.executedCount;
        }

        /**
         * @return finishCount
         */
        public Long getFinishCount() {
            return this.finishCount;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isOneToOneExpertServiceByTime
         */
        public Boolean getIsOneToOneExpertServiceByTime() {
            return this.isOneToOneExpertServiceByTime;
        }

        /**
         * @return mergeSolutionAndReporterOneStep
         */
        public Boolean getMergeSolutionAndReporterOneStep() {
            return this.mergeSolutionAndReporterOneStep;
        }

        /**
         * @return modifierEmpId
         */
        public String getModifierEmpId() {
            return this.modifierEmpId;
        }

        /**
         * @return packDetails
         */
        public java.util.List<java.util.Map<String, ?>> getPackDetails() {
            return this.packDetails;
        }

        /**
         * @return payOrders
         */
        public java.util.List<PayOrders> getPayOrders() {
            return this.payOrders;
        }

        /**
         * @return payUrl
         */
        public String getPayUrl() {
            return this.payUrl;
        }

        /**
         * @return performanceOrders
         */
        public java.util.List<PerformanceOrders> getPerformanceOrders() {
            return this.performanceOrders;
        }

        /**
         * @return performancePacks
         */
        public java.util.List<ListPerformancePacks> getPerformancePacks() {
            return this.performancePacks;
        }

        /**
         * @return reneWalUrl
         */
        public String getReneWalUrl() {
            return this.reneWalUrl;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return serviceReports
         */
        public java.util.List<ListServiceReports> getServiceReports() {
            return this.serviceReports;
        }

        /**
         * @return serviceTimeRange
         */
        public java.util.List<Long> getServiceTimeRange() {
            return this.serviceTimeRange;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusCode
         */
        public Integer getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return statusStr
         */
        public String getStatusStr() {
            return this.statusStr;
        }

        /**
         * @return termOfValidity
         */
        public String getTermOfValidity() {
            return this.termOfValidity;
        }

        /**
         * @return totalPack
         */
        public Integer getTotalPack() {
            return this.totalPack;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return usePack
         */
        public Long getUsePack() {
            return this.usePack;
        }

        /**
         * @return userRights
         */
        public String getUserRights() {
            return this.userRights;
        }

        public static final class Builder {
            private String applierId; 
            private String applyCode; 
            private java.util.List<java.util.List<String>> applyComponentDetails; 
            private Long applyTime; 
            private java.util.List<Appointments> appointments; 
            private String buyUrl; 
            private String creatorEmpId; 
            private String customerName; 
            private Boolean cycleService; 
            private Long executedCount; 
            private Long finishCount; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Boolean isOneToOneExpertServiceByTime; 
            private Boolean mergeSolutionAndReporterOneStep; 
            private String modifierEmpId; 
            private java.util.List<java.util.Map<String, ?>> packDetails; 
            private java.util.List<PayOrders> payOrders; 
            private String payUrl; 
            private java.util.List<PerformanceOrders> performanceOrders; 
            private java.util.List<ListPerformancePacks> performancePacks; 
            private String reneWalUrl; 
            private String serviceCode; 
            private String serviceName; 
            private java.util.List<ListServiceReports> serviceReports; 
            private java.util.List<Long> serviceTimeRange; 
            private String status; 
            private Integer statusCode; 
            private String statusStr; 
            private String termOfValidity; 
            private Integer totalPack; 
            private String type; 
            private Long usePack; 
            private String userRights; 

            private Builder() {
            } 

            private Builder(List model) {
                this.applierId = model.applierId;
                this.applyCode = model.applyCode;
                this.applyComponentDetails = model.applyComponentDetails;
                this.applyTime = model.applyTime;
                this.appointments = model.appointments;
                this.buyUrl = model.buyUrl;
                this.creatorEmpId = model.creatorEmpId;
                this.customerName = model.customerName;
                this.cycleService = model.cycleService;
                this.executedCount = model.executedCount;
                this.finishCount = model.finishCount;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.isOneToOneExpertServiceByTime = model.isOneToOneExpertServiceByTime;
                this.mergeSolutionAndReporterOneStep = model.mergeSolutionAndReporterOneStep;
                this.modifierEmpId = model.modifierEmpId;
                this.packDetails = model.packDetails;
                this.payOrders = model.payOrders;
                this.payUrl = model.payUrl;
                this.performanceOrders = model.performanceOrders;
                this.performancePacks = model.performancePacks;
                this.reneWalUrl = model.reneWalUrl;
                this.serviceCode = model.serviceCode;
                this.serviceName = model.serviceName;
                this.serviceReports = model.serviceReports;
                this.serviceTimeRange = model.serviceTimeRange;
                this.status = model.status;
                this.statusCode = model.statusCode;
                this.statusStr = model.statusStr;
                this.termOfValidity = model.termOfValidity;
                this.totalPack = model.totalPack;
                this.type = model.type;
                this.usePack = model.usePack;
                this.userRights = model.userRights;
            } 

            /**
             * applierId.
             */
            public Builder applierId(String applierId) {
                this.applierId = applierId;
                return this;
            }

            /**
             * applyCode.
             */
            public Builder applyCode(String applyCode) {
                this.applyCode = applyCode;
                return this;
            }

            /**
             * applyComponentDetails.
             */
            public Builder applyComponentDetails(java.util.List<java.util.List<String>> applyComponentDetails) {
                this.applyComponentDetails = applyComponentDetails;
                return this;
            }

            /**
             * applyTime.
             */
            public Builder applyTime(Long applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * appointments.
             */
            public Builder appointments(java.util.List<Appointments> appointments) {
                this.appointments = appointments;
                return this;
            }

            /**
             * buyUrl.
             */
            public Builder buyUrl(String buyUrl) {
                this.buyUrl = buyUrl;
                return this;
            }

            /**
             * creatorEmpId.
             */
            public Builder creatorEmpId(String creatorEmpId) {
                this.creatorEmpId = creatorEmpId;
                return this;
            }

            /**
             * customerName.
             */
            public Builder customerName(String customerName) {
                this.customerName = customerName;
                return this;
            }

            /**
             * cycleService.
             */
            public Builder cycleService(Boolean cycleService) {
                this.cycleService = cycleService;
                return this;
            }

            /**
             * executedCount.
             */
            public Builder executedCount(Long executedCount) {
                this.executedCount = executedCount;
                return this;
            }

            /**
             * finishCount.
             */
            public Builder finishCount(Long finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * isOneToOneExpertServiceByTime.
             */
            public Builder isOneToOneExpertServiceByTime(Boolean isOneToOneExpertServiceByTime) {
                this.isOneToOneExpertServiceByTime = isOneToOneExpertServiceByTime;
                return this;
            }

            /**
             * mergeSolutionAndReporterOneStep.
             */
            public Builder mergeSolutionAndReporterOneStep(Boolean mergeSolutionAndReporterOneStep) {
                this.mergeSolutionAndReporterOneStep = mergeSolutionAndReporterOneStep;
                return this;
            }

            /**
             * modifierEmpId.
             */
            public Builder modifierEmpId(String modifierEmpId) {
                this.modifierEmpId = modifierEmpId;
                return this;
            }

            /**
             * packDetails.
             */
            public Builder packDetails(java.util.List<java.util.Map<String, ?>> packDetails) {
                this.packDetails = packDetails;
                return this;
            }

            /**
             * payOrders.
             */
            public Builder payOrders(java.util.List<PayOrders> payOrders) {
                this.payOrders = payOrders;
                return this;
            }

            /**
             * payUrl.
             */
            public Builder payUrl(String payUrl) {
                this.payUrl = payUrl;
                return this;
            }

            /**
             * performanceOrders.
             */
            public Builder performanceOrders(java.util.List<PerformanceOrders> performanceOrders) {
                this.performanceOrders = performanceOrders;
                return this;
            }

            /**
             * performancePacks.
             */
            public Builder performancePacks(java.util.List<ListPerformancePacks> performancePacks) {
                this.performancePacks = performancePacks;
                return this;
            }

            /**
             * reneWalUrl.
             */
            public Builder reneWalUrl(String reneWalUrl) {
                this.reneWalUrl = reneWalUrl;
                return this;
            }

            /**
             * serviceCode.
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
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
             * serviceReports.
             */
            public Builder serviceReports(java.util.List<ListServiceReports> serviceReports) {
                this.serviceReports = serviceReports;
                return this;
            }

            /**
             * serviceTimeRange.
             */
            public Builder serviceTimeRange(java.util.List<Long> serviceTimeRange) {
                this.serviceTimeRange = serviceTimeRange;
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
             * statusCode.
             */
            public Builder statusCode(Integer statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * statusStr.
             */
            public Builder statusStr(String statusStr) {
                this.statusStr = statusStr;
                return this;
            }

            /**
             * termOfValidity.
             */
            public Builder termOfValidity(String termOfValidity) {
                this.termOfValidity = termOfValidity;
                return this;
            }

            /**
             * totalPack.
             */
            public Builder totalPack(Integer totalPack) {
                this.totalPack = totalPack;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * usePack.
             */
            public Builder usePack(Long usePack) {
                this.usePack = usePack;
                return this;
            }

            /**
             * userRights.
             */
            public Builder userRights(String userRights) {
                this.userRights = userRights;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceApplyResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceApplyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("extend")
        private Object extend;

        @com.aliyun.core.annotation.NameInMap("list")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("pageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Data(Builder builder) {
            this.extend = builder.extend;
            this.list = builder.list;
            this.pageNum = builder.pageNum;
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
         * @return extend
         */
        public Object getExtend() {
            return this.extend;
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
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
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Object extend; 
            private java.util.List<List> list; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.extend = model.extend;
                this.list = model.list;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * extend.
             */
            public Builder extend(Object extend) {
                this.extend = extend;
                return this;
            }

            /**
             * list.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * pageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total.
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
