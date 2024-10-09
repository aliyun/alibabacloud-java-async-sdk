// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BindGuestRfidPopRequest} extends {@link RequestModel}
 *
 * <p>BindGuestRfidPopRequest</p>
 */
public class BindGuestRfidPopRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long activityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GuestTicketRecordId")
    private Long guestTicketRecordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rfid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rfid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ticketCode;

    private BindGuestRfidPopRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.activityId = builder.activityId;
        this.deviceId = builder.deviceId;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.guestTicketRecordId = builder.guestTicketRecordId;
        this.id = builder.id;
        this.rfid = builder.rfid;
        this.ticketCode = builder.ticketCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindGuestRfidPopRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return activityId
     */
    public Long getActivityId() {
        return this.activityId;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
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
     * @return guestTicketRecordId
     */
    public Long getGuestTicketRecordId() {
        return this.guestTicketRecordId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return rfid
     */
    public String getRfid() {
        return this.rfid;
    }

    /**
     * @return ticketCode
     */
    public String getTicketCode() {
        return this.ticketCode;
    }

    public static final class Builder extends Request.Builder<BindGuestRfidPopRequest, Builder> {
        private String regionId; 
        private Long activityId; 
        private String deviceId; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long guestTicketRecordId; 
        private Long id; 
        private String rfid; 
        private String ticketCode; 

        private Builder() {
            super();
        } 

        private Builder(BindGuestRfidPopRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.activityId = request.activityId;
            this.deviceId = request.deviceId;
            this.gmtCreate = request.gmtCreate;
            this.gmtModified = request.gmtModified;
            this.guestTicketRecordId = request.guestTicketRecordId;
            this.id = request.id;
            this.rfid = request.rfid;
            this.ticketCode = request.ticketCode;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4546</p>
         */
        public Builder activityId(Long activityId) {
            this.putQueryParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Z10</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.putQueryParameter("GmtCreate", gmtCreate);
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.putQueryParameter("GmtModified", gmtModified);
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * GuestTicketRecordId.
         */
        public Builder guestTicketRecordId(Long guestTicketRecordId) {
            this.putQueryParameter("GuestTicketRecordId", guestTicketRecordId);
            this.guestTicketRecordId = guestTicketRecordId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asdojzopf</p>
         */
        public Builder rfid(String rfid) {
            this.putQueryParameter("Rfid", rfid);
            this.rfid = rfid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4546-100000</p>
         */
        public Builder ticketCode(String ticketCode) {
            this.putQueryParameter("TicketCode", ticketCode);
            this.ticketCode = ticketCode;
            return this;
        }

        @Override
        public BindGuestRfidPopRequest build() {
            return new BindGuestRfidPopRequest(this);
        } 

    } 

}
