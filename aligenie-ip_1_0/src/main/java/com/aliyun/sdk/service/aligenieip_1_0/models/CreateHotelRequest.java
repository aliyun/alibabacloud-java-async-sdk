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
 * {@link CreateHotelRequest} extends {@link RequestModel}
 *
 * <p>CreateHotelRequest</p>
 */
public class CreateHotelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EstOpenTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String estOpenTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelAddress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelEmail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelEmail;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RelatedPk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String relatedPk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RelatedPks")
    private java.util.List<String> relatedPks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer roomNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TbOpenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tbOpenId;

    private CreateHotelRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.estOpenTime = builder.estOpenTime;
        this.hotelAddress = builder.hotelAddress;
        this.hotelEmail = builder.hotelEmail;
        this.hotelName = builder.hotelName;
        this.phoneNumber = builder.phoneNumber;
        this.relatedPk = builder.relatedPk;
        this.relatedPks = builder.relatedPks;
        this.remark = builder.remark;
        this.roomNum = builder.roomNum;
        this.tbOpenId = builder.tbOpenId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHotelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return estOpenTime
     */
    public String getEstOpenTime() {
        return this.estOpenTime;
    }

    /**
     * @return hotelAddress
     */
    public String getHotelAddress() {
        return this.hotelAddress;
    }

    /**
     * @return hotelEmail
     */
    public String getHotelEmail() {
        return this.hotelEmail;
    }

    /**
     * @return hotelName
     */
    public String getHotelName() {
        return this.hotelName;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return relatedPk
     */
    public String getRelatedPk() {
        return this.relatedPk;
    }

    /**
     * @return relatedPks
     */
    public java.util.List<String> getRelatedPks() {
        return this.relatedPks;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return roomNum
     */
    public Integer getRoomNum() {
        return this.roomNum;
    }

    /**
     * @return tbOpenId
     */
    public String getTbOpenId() {
        return this.tbOpenId;
    }

    public static final class Builder extends Request.Builder<CreateHotelRequest, Builder> {
        private String appKey; 
        private String estOpenTime; 
        private String hotelAddress; 
        private String hotelEmail; 
        private String hotelName; 
        private String phoneNumber; 
        private String relatedPk; 
        private java.util.List<String> relatedPks; 
        private String remark; 
        private Integer roomNum; 
        private String tbOpenId; 

        private Builder() {
            super();
        } 

        private Builder(CreateHotelRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.estOpenTime = request.estOpenTime;
            this.hotelAddress = request.hotelAddress;
            this.hotelEmail = request.hotelEmail;
            this.hotelName = request.hotelName;
            this.phoneNumber = request.phoneNumber;
            this.relatedPk = request.relatedPk;
            this.relatedPks = request.relatedPks;
            this.remark = request.remark;
            this.roomNum = request.roomNum;
            this.tbOpenId = request.tbOpenId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>333566791</p>
         */
        public Builder appKey(String appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-1 00:00:00</p>
         */
        public Builder estOpenTime(String estOpenTime) {
            this.putBodyParameter("EstOpenTime", estOpenTime);
            this.estOpenTime = estOpenTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder hotelAddress(String hotelAddress) {
            this.putBodyParameter("HotelAddress", hotelAddress);
            this.hotelAddress = hotelAddress;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@hotel.com">test@hotel.com</a></p>
         */
        public Builder hotelEmail(String hotelEmail) {
            this.putBodyParameter("HotelEmail", hotelEmail);
            this.hotelEmail = hotelEmail;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder hotelName(String hotelName) {
            this.putBodyParameter("HotelName", hotelName);
            this.hotelName = hotelName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13xxxxxxxx</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putBodyParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jTO****Rw</p>
         */
        public Builder relatedPk(String relatedPk) {
            this.putBodyParameter("RelatedPk", relatedPk);
            this.relatedPk = relatedPk;
            return this;
        }

        /**
         * <p>酒店关联产品列表</p>
         */
        public Builder relatedPks(java.util.List<String> relatedPks) {
            String relatedPksShrink = shrink(relatedPks, "RelatedPks", "json");
            this.putBodyParameter("RelatedPks", relatedPksShrink);
            this.relatedPks = relatedPks;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder roomNum(Integer roomNum) {
            this.putBodyParameter("RoomNum", roomNum);
            this.roomNum = roomNum;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AAEV***E3d3Z2ETwh</p>
         */
        public Builder tbOpenId(String tbOpenId) {
            this.putBodyParameter("TbOpenId", tbOpenId);
            this.tbOpenId = tbOpenId;
            return this;
        }

        @Override
        public CreateHotelRequest build() {
            return new CreateHotelRequest(this);
        } 

    } 

}
