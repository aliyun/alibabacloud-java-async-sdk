// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddDeviceSeatsAndLabelsRequest} extends {@link RequestModel}
 *
 * <p>AddDeviceSeatsAndLabelsRequest</p>
 */
public class AddDeviceSeatsAndLabelsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsUnique")
    private Boolean isUnique;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelList")
    private java.util.List < String > labelList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SeatName")
    private String seatName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNo")
    private String serialNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private AddDeviceSeatsAndLabelsRequest(Builder builder) {
        super(builder);
        this.isUnique = builder.isUnique;
        this.label = builder.label;
        this.labelList = builder.labelList;
        this.seatName = builder.seatName;
        this.serialNo = builder.serialNo;
        this.tenantId = builder.tenantId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDeviceSeatsAndLabelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isUnique
     */
    public Boolean getIsUnique() {
        return this.isUnique;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return labelList
     */
    public java.util.List < String > getLabelList() {
        return this.labelList;
    }

    /**
     * @return seatName
     */
    public String getSeatName() {
        return this.seatName;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
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

    public static final class Builder extends Request.Builder<AddDeviceSeatsAndLabelsRequest, Builder> {
        private Boolean isUnique; 
        private String label; 
        private java.util.List < String > labelList; 
        private String seatName; 
        private String serialNo; 
        private String tenantId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(AddDeviceSeatsAndLabelsRequest request) {
            super(request);
            this.isUnique = request.isUnique;
            this.label = request.label;
            this.labelList = request.labelList;
            this.seatName = request.seatName;
            this.serialNo = request.serialNo;
            this.tenantId = request.tenantId;
            this.zoneId = request.zoneId;
        } 

        /**
         * IsUnique.
         */
        public Builder isUnique(Boolean isUnique) {
            this.putBodyParameter("IsUnique", isUnique);
            this.isUnique = isUnique;
            return this;
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
         * LabelList.
         */
        public Builder labelList(java.util.List < String > labelList) {
            this.putBodyParameter("LabelList", labelList);
            this.labelList = labelList;
            return this;
        }

        /**
         * SeatName.
         */
        public Builder seatName(String seatName) {
            this.putBodyParameter("SeatName", seatName);
            this.seatName = seatName;
            return this;
        }

        /**
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putBodyParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
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
        public AddDeviceSeatsAndLabelsRequest build() {
            return new AddDeviceSeatsAndLabelsRequest(this);
        } 

    } 

}
