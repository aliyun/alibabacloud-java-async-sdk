// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAiotVehicleTableItemRequest} extends {@link RequestModel}
 *
 * <p>UpdateAiotVehicleTableItemRequest</p>
 */
public class UpdateAiotVehicleTableItemRequest extends Request {
    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Body
    @NameInMap("VehicleTableId")
    @Validation(required = true)
    private String vehicleTableId;

    @Body
    @NameInMap("VehicleTableItem")
    @Validation(required = true)
    private VehicleTableItem vehicleTableItem;

    private UpdateAiotVehicleTableItemRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.vehicleTableId = builder.vehicleTableId;
        this.vehicleTableItem = builder.vehicleTableItem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAiotVehicleTableItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return vehicleTableId
     */
    public String getVehicleTableId() {
        return this.vehicleTableId;
    }

    /**
     * @return vehicleTableItem
     */
    public VehicleTableItem getVehicleTableItem() {
        return this.vehicleTableItem;
    }

    public static final class Builder extends Request.Builder<UpdateAiotVehicleTableItemRequest, Builder> {
        private String id; 
        private String vehicleTableId; 
        private VehicleTableItem vehicleTableItem; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAiotVehicleTableItemRequest response) {
            super(response);
            this.id = response.id;
            this.vehicleTableId = response.vehicleTableId;
            this.vehicleTableItem = response.vehicleTableItem;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * VehicleTableId.
         */
        public Builder vehicleTableId(String vehicleTableId) {
            this.putBodyParameter("VehicleTableId", vehicleTableId);
            this.vehicleTableId = vehicleTableId;
            return this;
        }

        /**
         * VehicleTableItem.
         */
        public Builder vehicleTableItem(VehicleTableItem vehicleTableItem) {
            this.putBodyParameter("VehicleTableItem", vehicleTableItem);
            this.vehicleTableItem = vehicleTableItem;
            return this;
        }

        @Override
        public UpdateAiotVehicleTableItemRequest build() {
            return new UpdateAiotVehicleTableItemRequest(this);
        } 

    } 

    public static class VehicleTableItem extends TeaModel {
        @NameInMap("BeginTime")
        private String beginTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("OwnerName")
        private String ownerName;

        @NameInMap("PhoneNo")
        private String phoneNo;

        @NameInMap("PlateNo")
        @Validation(required = true)
        private String plateNo;

        @NameInMap("Remarks")
        private String remarks;

        @NameInMap("VehicleTableItemId")
        @Validation(required = true)
        private String vehicleTableItemId;

        private VehicleTableItem(Builder builder) {
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
            this.ownerName = builder.ownerName;
            this.phoneNo = builder.phoneNo;
            this.plateNo = builder.plateNo;
            this.remarks = builder.remarks;
            this.vehicleTableItemId = builder.vehicleTableItemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VehicleTableItem create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return phoneNo
         */
        public String getPhoneNo() {
            return this.phoneNo;
        }

        /**
         * @return plateNo
         */
        public String getPlateNo() {
            return this.plateNo;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        /**
         * @return vehicleTableItemId
         */
        public String getVehicleTableItemId() {
            return this.vehicleTableItemId;
        }

        public static final class Builder {
            private String beginTime; 
            private String endTime; 
            private String ownerName; 
            private String phoneNo; 
            private String plateNo; 
            private String remarks; 
            private String vehicleTableItemId; 

            /**
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * PhoneNo.
             */
            public Builder phoneNo(String phoneNo) {
                this.phoneNo = phoneNo;
                return this;
            }

            /**
             * PlateNo.
             */
            public Builder plateNo(String plateNo) {
                this.plateNo = plateNo;
                return this;
            }

            /**
             * Remarks.
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * VehicleTableItemId.
             */
            public Builder vehicleTableItemId(String vehicleTableItemId) {
                this.vehicleTableItemId = vehicleTableItemId;
                return this;
            }

            public VehicleTableItem build() {
                return new VehicleTableItem(this);
            } 

        } 

    }
}
