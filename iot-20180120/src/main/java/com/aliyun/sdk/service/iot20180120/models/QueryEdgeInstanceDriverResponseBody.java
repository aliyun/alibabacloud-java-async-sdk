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
 * {@link QueryEdgeInstanceDriverResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEdgeInstanceDriverResponseBody</p>
 */
public class QueryEdgeInstanceDriverResponseBody extends TeaModel {
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

    private QueryEdgeInstanceDriverResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEdgeInstanceDriverResponseBody create() {
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

        private Builder(QueryEdgeInstanceDriverResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The return code of the operation. A value of Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see <a href="https://help.aliyun.com/document_detail/135200.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data that is returned if the call was successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message that is returned if the call failed.</p>
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
         * <p>77F540BC-A0EF-46A4-ABDE-18644C69AAF5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryEdgeInstanceDriverResponseBody build() {
            return new QueryEdgeInstanceDriverResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryEdgeInstanceDriverResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeInstanceDriverResponseBody</p>
     */
    public static class DriverList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DriverId")
        private String driverId;

        @com.aliyun.core.annotation.NameInMap("DriverVersion")
        private String driverVersion;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        private DriverList(Builder builder) {
            this.driverId = builder.driverId;
            this.driverVersion = builder.driverVersion;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DriverList create() {
            return builder().build();
        }

        /**
         * @return driverId
         */
        public String getDriverId() {
            return this.driverId;
        }

        /**
         * @return driverVersion
         */
        public String getDriverVersion() {
            return this.driverVersion;
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
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        public static final class Builder {
            private String driverId; 
            private String driverVersion; 
            private String gmtCreate; 
            private String gmtModified; 
            private String orderId; 

            private Builder() {
            } 

            private Builder(DriverList model) {
                this.driverId = model.driverId;
                this.driverVersion = model.driverVersion;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.orderId = model.orderId;
            } 

            /**
             * <p>The ID of the driver.</p>
             * 
             * <strong>example:</strong>
             * <p>9c1ae7bd59f1469abbdccc959228****</p>
             */
            public Builder driverId(String driverId) {
                this.driverId = driverId;
                return this;
            }

            /**
             * <p>The version number of the driver.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder driverVersion(String driverVersion) {
                this.driverVersion = driverVersion;
                return this;
            }

            /**
             * <p>The time when the driver was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-26 17:22:25</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last time when the driver was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-26 17:22:25</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>11123458765423</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            public DriverList build() {
                return new DriverList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryEdgeInstanceDriverResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEdgeInstanceDriverResponseBody</p>
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
             * <p>The list of drivers.</p>
             */
            public Builder driverList(java.util.List<DriverList> driverList) {
                this.driverList = driverList;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The number of drivers.</p>
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
