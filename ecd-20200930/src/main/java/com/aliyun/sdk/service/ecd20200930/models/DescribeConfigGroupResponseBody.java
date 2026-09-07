// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeConfigGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfigGroupResponseBody</p>
 */
public class DescribeConfigGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeConfigGroupResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeConfigGroupResponseBody model) {
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The configuration group information.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of query results.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeConfigGroupResponseBody build() {
            return new DescribeConfigGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeConfigGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindCount")
        private Integer bindCount;

        @com.aliyun.core.annotation.NameInMap("BindCountMap")
        private java.util.Map<String, Integer> bindCountMap;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("InnerTimerDesc")
        private String innerTimerDesc;

        @com.aliyun.core.annotation.NameInMap("InnerTimerName")
        private String innerTimerName;

        @com.aliyun.core.annotation.NameInMap("IsBind")
        private Boolean isBind;

        @com.aliyun.core.annotation.NameInMap("IsUpdate")
        private Boolean isUpdate;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.bindCount = builder.bindCount;
            this.bindCountMap = builder.bindCountMap;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.innerTimerDesc = builder.innerTimerDesc;
            this.innerTimerName = builder.innerTimerName;
            this.isBind = builder.isBind;
            this.isUpdate = builder.isUpdate;
            this.name = builder.name;
            this.productType = builder.productType;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bindCount
         */
        public Integer getBindCount() {
            return this.bindCount;
        }

        /**
         * @return bindCountMap
         */
        public java.util.Map<String, Integer> getBindCountMap() {
            return this.bindCountMap;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return innerTimerDesc
         */
        public String getInnerTimerDesc() {
            return this.innerTimerDesc;
        }

        /**
         * @return innerTimerName
         */
        public String getInnerTimerName() {
            return this.innerTimerName;
        }

        /**
         * @return isBind
         */
        public Boolean getIsBind() {
            return this.isBind;
        }

        /**
         * @return isUpdate
         */
        public Boolean getIsUpdate() {
            return this.isUpdate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer bindCount; 
            private java.util.Map<String, Integer> bindCountMap; 
            private String description; 
            private String groupId; 
            private String innerTimerDesc; 
            private String innerTimerName; 
            private Boolean isBind; 
            private Boolean isUpdate; 
            private String name; 
            private String productType; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bindCount = model.bindCount;
                this.bindCountMap = model.bindCountMap;
                this.description = model.description;
                this.groupId = model.groupId;
                this.innerTimerDesc = model.innerTimerDesc;
                this.innerTimerName = model.innerTimerName;
                this.isBind = model.isBind;
                this.isUpdate = model.isUpdate;
                this.name = model.name;
                this.productType = model.productType;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The number of resources bound to the configuration group.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder bindCount(Integer bindCount) {
                this.bindCount = bindCount;
                return this;
            }

            /**
             * <p>The quantity information of resources bound to the configuration group.</p>
             */
            public Builder bindCountMap(java.util.Map<String, Integer> bindCountMap) {
                this.bindCountMap = bindCountMap;
                return this;
            }

            /**
             * <p>The description of the configuration group.</p>
             * 
             * <strong>example:</strong>
             * <p>Scheduled task information</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The configuration group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccg-0cid8v30an12****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Used for frontend display. The code for the system scheduled task description.</p>
             * 
             * <strong>example:</strong>
             * <p>INNER_TIMER_10_MINUTES_HIBERNATE_NO_UPDATE_DESC</p>
             */
            public Builder innerTimerDesc(String innerTimerDesc) {
                this.innerTimerDesc = innerTimerDesc;
                return this;
            }

            /**
             * <p>Used for frontend display. The mapping code for the system scheduled task name.</p>
             * 
             * <strong>example:</strong>
             * <p>INNER_TIMER_10_MINUTES_HIBERNATE_NO_UPDATE</p>
             */
            public Builder innerTimerName(String innerTimerName) {
                this.innerTimerName = innerTimerName;
                return this;
            }

            /**
             * <p>Used by system scheduled task check. The current scheduled task does not support unbinding or binding.</p>
             */
            public Builder isBind(Boolean isBind) {
                this.isBind = isBind;
                return this;
            }

            /**
             * <p>Used by system scheduled task check. The current scheduled task does not support modification.</p>
             */
            public Builder isUpdate(Boolean isUpdate) {
                this.isUpdate = isUpdate;
                return this;
            }

            /**
             * <p>The configuration group name.</p>
             * 
             * <strong>example:</strong>
             * <p>Scheduled task</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The product type used by the configuration group.</p>
             * 
             * <strong>example:</strong>
             * <p>CLOUD_DESKTOP</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The configuration group status.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The configuration group type.</p>
             * 
             * <strong>example:</strong>
             * <p>Timer</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
