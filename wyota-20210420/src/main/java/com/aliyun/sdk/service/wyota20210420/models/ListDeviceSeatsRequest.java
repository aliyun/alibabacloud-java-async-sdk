// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceSeatsRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceSeatsRequest</p>
 */
public class ListDeviceSeatsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SeatNo")
    private String seatNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNoList")
    private java.util.List < String > serialNoList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private ListDeviceSeatsRequest(Builder builder) {
        super(builder);
        this.label = builder.label;
        this.seatNo = builder.seatNo;
        this.serialNoList = builder.serialNoList;
        this.tenantId = builder.tenantId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceSeatsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return seatNo
     */
    public String getSeatNo() {
        return this.seatNo;
    }

    /**
     * @return serialNoList
     */
    public java.util.List < String > getSerialNoList() {
        return this.serialNoList;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ListDeviceSeatsRequest, Builder> {
        private String label; 
        private String seatNo; 
        private java.util.List < String > serialNoList; 
        private String tenantId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceSeatsRequest request) {
            super(request);
            this.label = request.label;
            this.seatNo = request.seatNo;
            this.serialNoList = request.serialNoList;
            this.tenantId = request.tenantId;
            this.zoneId = request.zoneId;
        } 

        /**
         * Label.
         */
        public Builder label(String label) {
            this.putBodyParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * SeatNo.
         */
        public Builder seatNo(String seatNo) {
            this.putBodyParameter("SeatNo", seatNo);
            this.seatNo = seatNo;
            return this;
        }

        /**
         * SerialNoList.
         */
        public Builder serialNoList(java.util.List < String > serialNoList) {
            this.putBodyParameter("SerialNoList", serialNoList);
            this.serialNoList = serialNoList;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ListDeviceSeatsRequest build() {
            return new ListDeviceSeatsRequest(this);
        } 

    } 

}
