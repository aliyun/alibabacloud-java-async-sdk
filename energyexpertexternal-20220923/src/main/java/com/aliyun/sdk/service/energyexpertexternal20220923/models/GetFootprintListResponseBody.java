// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetFootprintListResponseBody} extends {@link TeaModel}
 *
 * <p>GetFootprintListResponseBody</p>
 */
public class GetFootprintListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetFootprintListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFootprintListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>06DA2909-7736-5738-AA31-ACD617D828F1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFootprintListResponseBody build() {
            return new GetFootprintListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFootprintListResponseBody} extends {@link TeaModel}
     *
     * <p>GetFootprintListResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private Double amount;

        @com.aliyun.core.annotation.NameInMap("authStatus")
        private Long authStatus;

        @com.aliyun.core.annotation.NameInMap("checkEndTime")
        private String checkEndTime;

        @com.aliyun.core.annotation.NameInMap("checkStartTime")
        private String checkStartTime;

        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("createdBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("isDemoModel")
        private Long isDemoModel;

        @com.aliyun.core.annotation.NameInMap("lifeCycle")
        private String lifeCycle;

        @com.aliyun.core.annotation.NameInMap("lifeCycleType")
        private Long lifeCycleType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        private Records(Builder builder) {
            this.amount = builder.amount;
            this.authStatus = builder.authStatus;
            this.checkEndTime = builder.checkEndTime;
            this.checkStartTime = builder.checkStartTime;
            this.code = builder.code;
            this.createdBy = builder.createdBy;
            this.id = builder.id;
            this.isDemoModel = builder.isDemoModel;
            this.lifeCycle = builder.lifeCycle;
            this.lifeCycleType = builder.lifeCycleType;
            this.name = builder.name;
            this.type = builder.type;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Double getAmount() {
            return this.amount;
        }

        /**
         * @return authStatus
         */
        public Long getAuthStatus() {
            return this.authStatus;
        }

        /**
         * @return checkEndTime
         */
        public String getCheckEndTime() {
            return this.checkEndTime;
        }

        /**
         * @return checkStartTime
         */
        public String getCheckStartTime() {
            return this.checkStartTime;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isDemoModel
         */
        public Long getIsDemoModel() {
            return this.isDemoModel;
        }

        /**
         * @return lifeCycle
         */
        public String getLifeCycle() {
            return this.lifeCycle;
        }

        /**
         * @return lifeCycleType
         */
        public Long getLifeCycleType() {
            return this.lifeCycleType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private Double amount; 
            private Long authStatus; 
            private String checkEndTime; 
            private String checkStartTime; 
            private String code; 
            private String createdBy; 
            private Long id; 
            private Long isDemoModel; 
            private String lifeCycle; 
            private Long lifeCycleType; 
            private String name; 
            private String type; 
            private String unit; 

            /**
             * <p>The amount of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>100.0000000000000000000000000</p>
             */
            public Builder amount(Double amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>Authentication status enumeration value, please refer to <a href="https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/CarbonFootprintAppendices-en.pdf">link</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder authStatus(Long authStatus) {
                this.authStatus = authStatus;
                return this;
            }

            /**
             * <p>Calculation end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024/01/31</p>
             */
            public Builder checkEndTime(String checkEndTime) {
                this.checkEndTime = checkEndTime;
                return this;
            }

            /**
             * <p>Calculation start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024/01/01</p>
             */
            public Builder checkStartTime(String checkStartTime) {
                this.checkStartTime = checkStartTime;
                return this;
            }

            /**
             * <p>The enterprise code.</p>
             * 
             * <strong>example:</strong>
             * <p>C-20080808-1</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The user who created it.</p>
             * 
             * <strong>example:</strong>
             * <p>Energy Expert</p>
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>The product ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the demo model is a built-in model. A value of 1 indicates a true value and a value of 0 indicates a false value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isDemoModel(Long isDemoModel) {
                this.isDemoModel = isDemoModel;
                return this;
            }

            /**
             * <p>The literal expression corresponding to lifeCycleType, <code>From Cradle to Gate</code> and <code>From Cradle to Grave</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>From Cradle to Gate</p>
             */
            public Builder lifeCycle(String lifeCycle) {
                this.lifeCycle = lifeCycle;
                return this;
            }

            /**
             * <p>1 is <code>From Cradle to Gate</code>, and 2 is <code>From Cradle to Grave</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lifeCycleType(Long lifeCycleType) {
                this.lifeCycleType = lifeCycleType;
                return this;
            }

            /**
             * <p>The product name.</p>
             * 
             * <strong>example:</strong>
             * <p>Carbon-footprint-demo</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Product category enumeration value, please refer to <a href="https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/CarbonFootprintAppendices-en.pdf">Carbon Footprint Appendices</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>158-159</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Unit enumeration value. Please refer to <a href="https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/CarbonFootprintAppendices-en.pdf">Carbon Footprint Appendices</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>1-4</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFootprintListResponseBody} extends {@link TeaModel}
     *
     * <p>GetFootprintListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currentPage")
        private Long currentPage;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("records")
        private java.util.List < Records> records;

        @com.aliyun.core.annotation.NameInMap("total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("totalPage")
        private Long totalPage;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.total = builder.total;
            this.totalPage = builder.totalPage;
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
        public Long getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return totalPage
         */
        public Long getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Long currentPage; 
            private Long pageSize; 
            private java.util.List < Records> records; 
            private Long total; 
            private Long totalPage; 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Product Detail List.</p>
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * <p>Total Pages</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalPage(Long totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
