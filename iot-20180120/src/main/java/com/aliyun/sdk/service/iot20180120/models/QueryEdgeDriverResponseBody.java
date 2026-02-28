// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryEdgeDriverResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEdgeDriverResponseBody</p>
 */
public class QueryEdgeDriverResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryEdgeDriverResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see <a href="https://help.aliyun.com/document_detail/135200.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned if the call was successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>request parameter error</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E0BD540E-DCFE-4602-B6D1-D208E8594BF7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. true indicates that the call was successful. false indicates that the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryEdgeDriverResponseBody build() {
            return new QueryEdgeDriverResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryEdgeDriverResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeDriverResponseBody</p>
     */
    public static class DriverList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuArch")
        private String cpuArch;

        @com.aliyun.core.annotation.NameInMap("DriverId")
        private String driverId;

        @com.aliyun.core.annotation.NameInMap("DriverName")
        private String driverName;

        @com.aliyun.core.annotation.NameInMap("DriverProtocol")
        private String driverProtocol;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTimestamp")
        private Long gmtModifiedTimestamp;

        @com.aliyun.core.annotation.NameInMap("IsApply")
        private Boolean isApply;

        @com.aliyun.core.annotation.NameInMap("IsBuiltIn")
        private Boolean isBuiltIn;

        @com.aliyun.core.annotation.NameInMap("Runtime")
        private String runtime;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(DriverList model) {
                this.cpuArch = model.cpuArch;
                this.driverId = model.driverId;
                this.driverName = model.driverName;
                this.driverProtocol = model.driverProtocol;
                this.gmtCreateTimestamp = model.gmtCreateTimestamp;
                this.gmtModifiedTimestamp = model.gmtModifiedTimestamp;
                this.isApply = model.isApply;
                this.isBuiltIn = model.isBuiltIn;
                this.runtime = model.runtime;
                this.type = model.type;
            } 

            /**
             * <p>The CPU architecture that the driver supports. Valid values:</p>
             * <ul>
             * <li>ARMv7</li>
             * <li>ARMv7-HF</li>
             * <li>AArch64</li>
             * <li>x86-64</li>
             * <li>x86</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>x86-64</p>
             */
            public Builder cpuArch(String cpuArch) {
                this.cpuArch = cpuArch;
                return this;
            }

            /**
             * <p>The ID of the driver.</p>
             * 
             * <strong>example:</strong>
             * <p>fec565038d7544978d9aed5c1a******</p>
             */
            public Builder driverId(String driverId) {
                this.driverId = driverId;
                return this;
            }

            /**
             * <p>The name of the driver.</p>
             * 
             * <strong>example:</strong>
             * <p>MyLedDriver</p>
             */
            public Builder driverName(String driverName) {
                this.driverName = driverName;
                return this;
            }

            /**
             * <p>The communications protocol that the driver uses. Valid values:</p>
             * <ul>
             * <li>modbus: Modbus protocol</li>
             * <li>opc-ua: OPC UA protocol</li>
             * <li>customize: custom protocol</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>customize</p>
             */
            public Builder driverProtocol(String driverProtocol) {
                this.driverProtocol = driverProtocol;
                return this;
            }

            /**
             * <p>The time when the driver was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1581912859713</p>
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * <p>The time when the driver was last modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1581912859713</p>
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
             * <p>Indicates whether the driver is a built-in driver.</p>
             * <ul>
             * <li>true: indicates that the driver is a built-in driver, that is, the driver code is pre-configured on the gateway device.</li>
             * <li>false: indicates that the driver is not a built-in driver.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isBuiltIn(Boolean isBuiltIn) {
                this.isBuiltIn = isBuiltIn;
                return this;
            }

            /**
             * <p>The language in which the driver is programmed. Valid values:</p>
             * <ul>
             * <li>nodejs8: Node.js v8</li>
             * <li>python3: Python v3.5</li>
             * <li>c: C</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>c</p>
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * <p>The type of the driver. Valid values:</p>
             * <ul>
             * <li>0: official driver</li>
             * <li>1: custom driver</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link QueryEdgeDriverResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeDriverResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("DriverList")
        private java.util.List<DriverList> driverList;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
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
        public java.util.List<DriverList> getDriverList() {
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
            private java.util.List<DriverList> driverList; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.driverList = model.driverList;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The information about each driver.</p>
             */
            public Builder driverList(java.util.List<DriverList> driverList) {
                this.driverList = driverList;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of official or custom drivers found.</p>
             * <ul>
             * <li>If the value of Type is 0, the value of this parameter is the total number of official drivers found.</li>
             * <li>If the value of Type is 1, the value of this parameter is the total number of custom drivers found.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
