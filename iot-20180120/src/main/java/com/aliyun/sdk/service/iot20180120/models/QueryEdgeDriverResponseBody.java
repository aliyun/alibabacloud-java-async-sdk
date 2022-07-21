// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEdgeDriverResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEdgeDriverResponseBody</p>
 */
public class QueryEdgeDriverResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryEdgeDriverResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEdgeDriverResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public QueryEdgeDriverResponseBody build() {
            return new QueryEdgeDriverResponseBody(this);
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

        @NameInMap("IsApply")
        private Boolean isApply;

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
            this.isApply = builder.isApply;
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
         * @return isApply
         */
        public Boolean getIsApply() {
            return this.isApply;
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
            private Boolean isApply; 
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
             * IsApply.
             */
            public Builder isApply(Boolean isApply) {
                this.isApply = isApply;
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
    public static class Data extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("DriverList")
        private java.util.List < DriverList> driverList;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.driverList = builder.driverList;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return driverList
         */
        public java.util.List < DriverList> getDriverList() {
            return this.driverList;
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

        public static final class Builder {
            private Integer currentPage; 
            private java.util.List < DriverList> driverList; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
