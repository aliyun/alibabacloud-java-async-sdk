// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTicketsRequest} extends {@link RequestModel}
 *
 * <p>ListTicketsRequest</p>
 */
public class ListTicketsRequest extends Request {
    @Body
    @NameInMap("EndTime")
    private String endTime;

    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("IsDesc")
    private Boolean isDesc;

    @Body
    @NameInMap("IsNeedCallback")
    private Boolean isNeedCallback;

    @Body
    @NameInMap("IsNeedCharges")
    private Boolean isNeedCharges;

    @Body
    @NameInMap("Page")
    private Page page;

    @Body
    @NameInMap("RoomNo")
    private String roomNo;

    @Body
    @NameInMap("SortField")
    private String sortField;

    @Body
    @NameInMap("StartTime")
    private String startTime;

    @Body
    @NameInMap("Status")
    private String status;

    @Body
    @NameInMap("Type")
    private String type;

    private ListTicketsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.hotelId = builder.hotelId;
        this.isDesc = builder.isDesc;
        this.isNeedCallback = builder.isNeedCallback;
        this.isNeedCharges = builder.isNeedCharges;
        this.page = builder.page;
        this.roomNo = builder.roomNo;
        this.sortField = builder.sortField;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTicketsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return isDesc
     */
    public Boolean getIsDesc() {
        return this.isDesc;
    }

    /**
     * @return isNeedCallback
     */
    public Boolean getIsNeedCallback() {
        return this.isNeedCallback;
    }

    /**
     * @return isNeedCharges
     */
    public Boolean getIsNeedCharges() {
        return this.isNeedCharges;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return roomNo
     */
    public String getRoomNo() {
        return this.roomNo;
    }

    /**
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListTicketsRequest, Builder> {
        private String endTime; 
        private String hotelId; 
        private Boolean isDesc; 
        private Boolean isNeedCallback; 
        private Boolean isNeedCharges; 
        private Page page; 
        private String roomNo; 
        private String sortField; 
        private String startTime; 
        private String status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListTicketsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.hotelId = request.hotelId;
            this.isDesc = request.isDesc;
            this.isNeedCallback = request.isNeedCallback;
            this.isNeedCharges = request.isNeedCharges;
            this.page = request.page;
            this.roomNo = request.roomNo;
            this.sortField = request.sortField;
            this.startTime = request.startTime;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * HotelId.
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * IsDesc.
         */
        public Builder isDesc(Boolean isDesc) {
            this.putBodyParameter("IsDesc", isDesc);
            this.isDesc = isDesc;
            return this;
        }

        /**
         * IsNeedCallback.
         */
        public Builder isNeedCallback(Boolean isNeedCallback) {
            this.putBodyParameter("IsNeedCallback", isNeedCallback);
            this.isNeedCallback = isNeedCallback;
            return this;
        }

        /**
         * IsNeedCharges.
         */
        public Builder isNeedCharges(Boolean isNeedCharges) {
            this.putBodyParameter("IsNeedCharges", isNeedCharges);
            this.isNeedCharges = isNeedCharges;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Page page) {
            String pageShrink = shrink(page, "Page", "json");
            this.putBodyParameter("Page", pageShrink);
            this.page = page;
            return this;
        }

        /**
         * RoomNo.
         */
        public Builder roomNo(String roomNo) {
            this.putBodyParameter("RoomNo", roomNo);
            this.roomNo = roomNo;
            return this;
        }

        /**
         * SortField.
         */
        public Builder sortField(String sortField) {
            this.putBodyParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListTicketsRequest build() {
            return new ListTicketsRequest(this);
        } 

    } 

    public static class Page extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        private Page(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
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

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 

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

            public Page build() {
                return new Page(this);
            } 

        } 

    }
}
