// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelOrderResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotelOrderResponseBody</p>
 */
public class ListHotelOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Page")
    private Page page;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private Page page; 
        private String requestId; 
        private java.util.List < Result> result; 

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
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListHotelOrderResponseBody build() {
            return new ListHotelOrderResponseBody(this);
        } 

    } 

    public static class Page extends TeaModel {
        @NameInMap("HasNext")
        private Boolean hasNext;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        @NameInMap("TotalPage")
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
    public static class Result extends TeaModel {
        @NameInMap("ApplyAmt")
        private Long applyAmt;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("OrderNo")
        private String orderNo;

        @NameInMap("Quantity")
        private Long quantity;

        @NameInMap("RoomNo")
        private String roomNo;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("TypeIconUrl")
        private String typeIconUrl;

        @NameInMap("TypeName")
        private String typeName;

        private Result(Builder builder) {
            this.applyAmt = builder.applyAmt;
            this.gmtCreate = builder.gmtCreate;
            this.orderNo = builder.orderNo;
            this.quantity = builder.quantity;
            this.roomNo = builder.roomNo;
            this.status = builder.status;
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
         * @return applyAmt
         */
        public Long getApplyAmt() {
            return this.applyAmt;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return orderNo
         */
        public String getOrderNo() {
            return this.orderNo;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private Long applyAmt; 
            private Long gmtCreate; 
            private String orderNo; 
            private Long quantity; 
            private String roomNo; 
            private String status; 
            private String type; 
            private String typeIconUrl; 
            private String typeName; 

            /**
             * ApplyAmt.
             */
            public Builder applyAmt(Long applyAmt) {
                this.applyAmt = applyAmt;
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
             * OrderNo.
             */
            public Builder orderNo(String orderNo) {
                this.orderNo = orderNo;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
