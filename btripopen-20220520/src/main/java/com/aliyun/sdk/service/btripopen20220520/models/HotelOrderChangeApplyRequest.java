// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link HotelOrderChangeApplyRequest} extends {@link RequestModel}
 *
 * <p>HotelOrderChangeApplyRequest</p>
 */
public class HotelOrderChangeApplyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("btrip_user_id")
    private String btripUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dis_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String disOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reason")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("room_info_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RoomInfoList> roomInfoList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sale_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String saleOrderId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private HotelOrderChangeApplyRequest(Builder builder) {
        super(builder);
        this.btripUserId = builder.btripUserId;
        this.disOrderId = builder.disOrderId;
        this.reason = builder.reason;
        this.roomInfoList = builder.roomInfoList;
        this.saleOrderId = builder.saleOrderId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelOrderChangeApplyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return btripUserId
     */
    public String getBtripUserId() {
        return this.btripUserId;
    }

    /**
     * @return disOrderId
     */
    public String getDisOrderId() {
        return this.disOrderId;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return roomInfoList
     */
    public java.util.List<RoomInfoList> getRoomInfoList() {
        return this.roomInfoList;
    }

    /**
     * @return saleOrderId
     */
    public String getSaleOrderId() {
        return this.saleOrderId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<HotelOrderChangeApplyRequest, Builder> {
        private String btripUserId; 
        private String disOrderId; 
        private String reason; 
        private java.util.List<RoomInfoList> roomInfoList; 
        private String saleOrderId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(HotelOrderChangeApplyRequest request) {
            super(request);
            this.btripUserId = request.btripUserId;
            this.disOrderId = request.disOrderId;
            this.reason = request.reason;
            this.roomInfoList = request.roomInfoList;
            this.saleOrderId = request.saleOrderId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * btrip_user_id.
         */
        public Builder btripUserId(String btripUserId) {
            this.putBodyParameter("btrip_user_id", btripUserId);
            this.btripUserId = btripUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3685792244476194816</p>
         */
        public Builder disOrderId(String disOrderId) {
            this.putBodyParameter("dis_order_id", disOrderId);
            this.disOrderId = disOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder reason(String reason) {
            this.putBodyParameter("reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder roomInfoList(java.util.List<RoomInfoList> roomInfoList) {
            String roomInfoListShrink = shrink(roomInfoList, "room_info_list", "json");
            this.putBodyParameter("room_info_list", roomInfoListShrink);
            this.roomInfoList = roomInfoList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1402002197440511306</p>
         */
        public Builder saleOrderId(String saleOrderId) {
            this.putBodyParameter("sale_order_id", saleOrderId);
            this.saleOrderId = saleOrderId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public HotelOrderChangeApplyRequest build() {
            return new HotelOrderChangeApplyRequest(this);
        } 

    } 

    /**
     * 
     * {@link HotelOrderChangeApplyRequest} extends {@link TeaModel}
     *
     * <p>HotelOrderChangeApplyRequest</p>
     */
    public static class RoomInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cancel_date")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> cancelDate;

        @com.aliyun.core.annotation.NameInMap("room_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer roomNo;

        private RoomInfoList(Builder builder) {
            this.cancelDate = builder.cancelDate;
            this.roomNo = builder.roomNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomInfoList create() {
            return builder().build();
        }

        /**
         * @return cancelDate
         */
        public java.util.List<String> getCancelDate() {
            return this.cancelDate;
        }

        /**
         * @return roomNo
         */
        public Integer getRoomNo() {
            return this.roomNo;
        }

        public static final class Builder {
            private java.util.List<String> cancelDate; 
            private Integer roomNo; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder cancelDate(java.util.List<String> cancelDate) {
                this.cancelDate = cancelDate;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>112</p>
             */
            public Builder roomNo(Integer roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            public RoomInfoList build() {
                return new RoomInfoList(this);
            } 

        } 

    }
}
