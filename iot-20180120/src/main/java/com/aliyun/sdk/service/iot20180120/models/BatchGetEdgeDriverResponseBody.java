// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetEdgeDriverResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetEdgeDriverResponseBody</p>
 */
public class BatchGetEdgeDriverResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DriverList")
    private java.util.List < DriverList> driverList;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private BatchGetEdgeDriverResponseBody(Builder builder) {
        this.code = builder.code;
        this.driverList = builder.driverList;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetEdgeDriverResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return driverList
     */
    public java.util.List < DriverList> getDriverList() {
        return this.driverList;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < DriverList> driverList; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DriverList.
         */
        public Builder driverList(java.util.List < DriverList> driverList) {
            this.driverList = driverList;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BatchGetEdgeDriverResponseBody build() {
            return new BatchGetEdgeDriverResponseBody(this);
        } 

    } 

    public static class DriverList extends TeaModel {
        @NameInMap("CpuArch")
        private String cpuArch;

        @NameInMap("DriverId")
        private String driverId;

        @NameInMap("DriverName")
        private String driverName;

        @NameInMap("DriverProtocol")
        private String driverProtocol;

        @NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @NameInMap("GmtModifiedTimestamp")
        private Long gmtModifiedTimestamp;

        @NameInMap("IsBuiltIn")
        private Boolean isBuiltIn;

        @NameInMap("Runtime")
        private String runtime;

        @NameInMap("Type")
        private Integer type;

        private DriverList(Builder builder) {
            this.cpuArch = builder.cpuArch;
            this.driverId = builder.driverId;
            this.driverName = builder.driverName;
            this.driverProtocol = builder.driverProtocol;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModifiedTimestamp = builder.gmtModifiedTimestamp;
            this.isBuiltIn = builder.isBuiltIn;
            this.runtime = builder.runtime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DriverList create() {
            return builder().build();
        }

        /**
         * @return cpuArch
         */
        public String getCpuArch() {
            return this.cpuArch;
        }

        /**
         * @return driverId
         */
        public String getDriverId() {
            return this.driverId;
        }

        /**
         * @return driverName
         */
        public String getDriverName() {
            return this.driverName;
        }

        /**
         * @return driverProtocol
         */
        public String getDriverProtocol() {
            return this.driverProtocol;
        }

        /**
         * @return gmtCreateTimestamp
         */
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        /**
         * @return gmtModifiedTimestamp
         */
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        /**
         * @return isBuiltIn
         */
        public Boolean getIsBuiltIn() {
            return this.isBuiltIn;
        }

        /**
         * @return runtime
         */
        public String getRuntime() {
            return this.runtime;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String cpuArch; 
            private String driverId; 
            private String driverName; 
            private String driverProtocol; 
            private Long gmtCreateTimestamp; 
            private Long gmtModifiedTimestamp; 
            private Boolean isBuiltIn; 
            private String runtime; 
            private Integer type; 

            /**
             * CpuArch.
             */
            public Builder cpuArch(String cpuArch) {
                this.cpuArch = cpuArch;
                return this;
            }

            /**
             * DriverId.
             */
            public Builder driverId(String driverId) {
                this.driverId = driverId;
                return this;
            }

            /**
             * DriverName.
             */
            public Builder driverName(String driverName) {
                this.driverName = driverName;
                return this;
            }

            /**
             * DriverProtocol.
             */
            public Builder driverProtocol(String driverProtocol) {
                this.driverProtocol = driverProtocol;
                return this;
            }

            /**
             * GmtCreateTimestamp.
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * GmtModifiedTimestamp.
             */
            public Builder gmtModifiedTimestamp(Long gmtModifiedTimestamp) {
                this.gmtModifiedTimestamp = gmtModifiedTimestamp;
                return this;
            }

            /**
             * IsBuiltIn.
             */
            public Builder isBuiltIn(Boolean isBuiltIn) {
                this.isBuiltIn = isBuiltIn;
                return this;
            }

            /**
             * Runtime.
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public DriverList build() {
                return new DriverList(this);
            } 

        } 

    }
}
