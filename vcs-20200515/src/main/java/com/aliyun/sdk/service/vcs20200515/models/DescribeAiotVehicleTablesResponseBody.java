// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAiotVehicleTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAiotVehicleTablesResponseBody</p>
 */
public class DescribeAiotVehicleTablesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VehicleTableList")
    private java.util.List < VehicleTableList> vehicleTableList;

    private DescribeAiotVehicleTablesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.vehicleTableList = builder.vehicleTableList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiotVehicleTablesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return vehicleTableList
     */
    public java.util.List < VehicleTableList> getVehicleTableList() {
        return this.vehicleTableList;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List < VehicleTableList> vehicleTableList; 

        /**
         * Code.
         */
        public Builder code(String code) {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VehicleTableList.
         */
        public Builder vehicleTableList(java.util.List < VehicleTableList> vehicleTableList) {
            this.vehicleTableList = vehicleTableList;
            return this;
        }

        public DescribeAiotVehicleTablesResponseBody build() {
            return new DescribeAiotVehicleTablesResponseBody(this);
        } 

    } 

    public static class VehicleTableList extends TeaModel {
        @NameInMap("VehicleTableId")
        private String vehicleTableId;

        @NameInMap("VehicleTableName")
        private String vehicleTableName;

        private VehicleTableList(Builder builder) {
            this.vehicleTableId = builder.vehicleTableId;
            this.vehicleTableName = builder.vehicleTableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VehicleTableList create() {
            return builder().build();
        }

        /**
         * @return vehicleTableId
         */
        public String getVehicleTableId() {
            return this.vehicleTableId;
        }

        /**
         * @return vehicleTableName
         */
        public String getVehicleTableName() {
            return this.vehicleTableName;
        }

        public static final class Builder {
            private String vehicleTableId; 
            private String vehicleTableName; 

            /**
             * VehicleTableId.
             */
            public Builder vehicleTableId(String vehicleTableId) {
                this.vehicleTableId = vehicleTableId;
                return this;
            }

            /**
             * VehicleTableName.
             */
            public Builder vehicleTableName(String vehicleTableName) {
                this.vehicleTableName = vehicleTableName;
                return this;
            }

            public VehicleTableList build() {
                return new VehicleTableList(this);
            } 

        } 

    }
}
