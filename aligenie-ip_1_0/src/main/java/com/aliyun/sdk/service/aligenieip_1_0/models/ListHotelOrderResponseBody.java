// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link ListHotelOrderResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotelOrderResponseBody</p>
 */
public class ListHotelOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Page page;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private ListHotelOrderResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.page = builder.page;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotelOrderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private Page page; 
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListHotelOrderResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.page = model.page;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * Page.
         */
        public Builder page(Page page) {
            this.page = page;
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
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListHotelOrderResponseBody build() {
            return new ListHotelOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHotelOrderResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotelOrderResponseBody</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasNext")
        private Boolean hasNext;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Integer totalPage;

        private Page(Builder builder) {
            this.hasNext = builder.hasNext;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return hasNext
         */
        public Boolean getHasNext() {
            return this.hasNext;
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
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Boolean hasNext; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer total; 
            private Integer totalPage; 

            private Builder() {
            } 

            private Builder(Page model) {
                this.hasNext = model.hasNext;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.total = model.total;
                this.totalPage = model.totalPage;
            } 

            /**
             * HasNext.
             */
            public Builder hasNext(Boolean hasNext) {
                this.hasNext = hasNext;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHotelOrderResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotelOrderResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amt")
        private Long amt;

        @com.aliyun.core.annotation.NameInMap("ApplyAmt")
        private Long applyAmt;

        @com.aliyun.core.annotation.NameInMap("DeliveryMethod")
        private String deliveryMethod;

        @com.aliyun.core.annotation.NameInMap("DeliveryRoomName")
        private String deliveryRoomName;

        @com.aliyun.core.annotation.NameInMap("DeliveryTime")
        private Long deliveryTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemType")
        private String itemType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OrderNo")
        private String orderNo;

        @com.aliyun.core.annotation.NameInMap("OrderStatus")
        private String orderStatus;

        @com.aliyun.core.annotation.NameInMap("PaymentMethod")
        private String paymentMethod;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Long quantity;

        @com.aliyun.core.annotation.NameInMap("RoomNo")
        private String roomNo;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SumAmt")
        private Long sumAmt;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("TypeIconUrl")
        private String typeIconUrl;

        @com.aliyun.core.annotation.NameInMap("TypeName")
        private String typeName;

        private Result(Builder builder) {
            this.amt = builder.amt;
            this.applyAmt = builder.applyAmt;
            this.deliveryMethod = builder.deliveryMethod;
            this.deliveryRoomName = builder.deliveryRoomName;
            this.deliveryTime = builder.deliveryTime;
            this.gmtCreate = builder.gmtCreate;
            this.icon = builder.icon;
            this.itemId = builder.itemId;
            this.itemType = builder.itemType;
            this.name = builder.name;
            this.orderNo = builder.orderNo;
            this.orderStatus = builder.orderStatus;
            this.paymentMethod = builder.paymentMethod;
            this.quantity = builder.quantity;
            this.roomNo = builder.roomNo;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.sumAmt = builder.sumAmt;
            this.type = builder.type;
            this.typeIconUrl = builder.typeIconUrl;
            this.typeName = builder.typeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return amt
         */
        public Long getAmt() {
            return this.amt;
        }

        /**
         * @return applyAmt
         */
        public Long getApplyAmt() {
            return this.applyAmt;
        }

        /**
         * @return deliveryMethod
         */
        public String getDeliveryMethod() {
            return this.deliveryMethod;
        }

        /**
         * @return deliveryRoomName
         */
        public String getDeliveryRoomName() {
            return this.deliveryRoomName;
        }

        /**
         * @return deliveryTime
         */
        public Long getDeliveryTime() {
            return this.deliveryTime;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return itemType
         */
        public String getItemType() {
            return this.itemType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return orderNo
         */
        public String getOrderNo() {
            return this.orderNo;
        }

        /**
         * @return orderStatus
         */
        public String getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return paymentMethod
         */
        public String getPaymentMethod() {
            return this.paymentMethod;
        }

        /**
         * @return quantity
         */
        public Long getQuantity() {
            return this.quantity;
        }

        /**
         * @return roomNo
         */
        public String getRoomNo() {
            return this.roomNo;
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
         * @return sumAmt
         */
        public Long getSumAmt() {
            return this.sumAmt;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return typeIconUrl
         */
        public String getTypeIconUrl() {
            return this.typeIconUrl;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private Long amt; 
            private Long applyAmt; 
            private String deliveryMethod; 
            private String deliveryRoomName; 
            private Long deliveryTime; 
            private Long gmtCreate; 
            private String icon; 
            private Long itemId; 
            private String itemType; 
            private String name; 
            private String orderNo; 
            private String orderStatus; 
            private String paymentMethod; 
            private Long quantity; 
            private String roomNo; 
            private Long startTime; 
            private String status; 
            private Long sumAmt; 
            private String type; 
            private String typeIconUrl; 
            private String typeName; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.amt = model.amt;
                this.applyAmt = model.applyAmt;
                this.deliveryMethod = model.deliveryMethod;
                this.deliveryRoomName = model.deliveryRoomName;
                this.deliveryTime = model.deliveryTime;
                this.gmtCreate = model.gmtCreate;
                this.icon = model.icon;
                this.itemId = model.itemId;
                this.itemType = model.itemType;
                this.name = model.name;
                this.orderNo = model.orderNo;
                this.orderStatus = model.orderStatus;
                this.paymentMethod = model.paymentMethod;
                this.quantity = model.quantity;
                this.roomNo = model.roomNo;
                this.startTime = model.startTime;
                this.status = model.status;
                this.sumAmt = model.sumAmt;
                this.type = model.type;
                this.typeIconUrl = model.typeIconUrl;
                this.typeName = model.typeName;
            } 

            /**
             * Amt.
             */
            public Builder amt(Long amt) {
                this.amt = amt;
                return this;
            }

            /**
             * ApplyAmt.
             */
            public Builder applyAmt(Long applyAmt) {
                this.applyAmt = applyAmt;
                return this;
            }

            /**
             * DeliveryMethod.
             */
            public Builder deliveryMethod(String deliveryMethod) {
                this.deliveryMethod = deliveryMethod;
                return this;
            }

            /**
             * DeliveryRoomName.
             */
            public Builder deliveryRoomName(String deliveryRoomName) {
                this.deliveryRoomName = deliveryRoomName;
                return this;
            }

            /**
             * DeliveryTime.
             */
            public Builder deliveryTime(Long deliveryTime) {
                this.deliveryTime = deliveryTime;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemType.
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OrderNo.
             */
            public Builder orderNo(String orderNo) {
                this.orderNo = orderNo;
                return this;
            }

            /**
             * OrderStatus.
             */
            public Builder orderStatus(String orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * PaymentMethod.
             */
            public Builder paymentMethod(String paymentMethod) {
                this.paymentMethod = paymentMethod;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Long quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * RoomNo.
             */
            public Builder roomNo(String roomNo) {
                this.roomNo = roomNo;
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
             * SumAmt.
             */
            public Builder sumAmt(Long sumAmt) {
                this.sumAmt = sumAmt;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * TypeIconUrl.
             */
            public Builder typeIconUrl(String typeIconUrl) {
                this.typeIconUrl = typeIconUrl;
                return this;
            }

            /**
             * TypeName.
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
