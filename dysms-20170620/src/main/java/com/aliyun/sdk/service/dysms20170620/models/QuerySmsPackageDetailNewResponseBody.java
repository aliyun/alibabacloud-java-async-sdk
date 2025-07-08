// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QuerySmsPackageDetailNewResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsPackageDetailNewResponseBody</p>
 */
public class QuerySmsPackageDetailNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private List list;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RemainSmsCount")
    private Long remainSmsCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    @com.aliyun.core.annotation.NameInMap("TotalSmsCount")
    private Long totalSmsCount;

    private QuerySmsPackageDetailNewResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.remainSmsCount = builder.remainSmsCount;
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.totalSmsCount = builder.totalSmsCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsPackageDetailNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public List getList() {
        return this.list;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remainSmsCount
     */
    public Long getRemainSmsCount() {
        return this.remainSmsCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    /**
     * @return totalSmsCount
     */
    public Long getTotalSmsCount() {
        return this.totalSmsCount;
    }

    public static final class Builder {
        private List list; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Long remainSmsCount; 
        private String requestId; 
        private Long total; 
        private Long totalSmsCount; 

        private Builder() {
        } 

        private Builder(QuerySmsPackageDetailNewResponseBody model) {
            this.list = model.list;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.remainSmsCount = model.remainSmsCount;
            this.requestId = model.requestId;
            this.total = model.total;
            this.totalSmsCount = model.totalSmsCount;
        } 

        /**
         * List.
         */
        public Builder list(List list) {
            this.list = list;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * RemainSmsCount.
         */
        public Builder remainSmsCount(Long remainSmsCount) {
            this.remainSmsCount = remainSmsCount;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * TotalSmsCount.
         */
        public Builder totalSmsCount(Long totalSmsCount) {
            this.totalSmsCount = totalSmsCount;
            return this;
        }

        public QuerySmsPackageDetailNewResponseBody build() {
            return new QuerySmsPackageDetailNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmsPackageDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsPackageDetailNewResponseBody</p>
     */
    public static class SmsPackageDetailDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvalidTime")
        private Long invalidTime;

        @com.aliyun.core.annotation.NameInMap("OrderTime")
        private Long orderTime;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("RemainCount")
        private Long remainCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private SmsPackageDetailDTO(Builder builder) {
            this.invalidTime = builder.invalidTime;
            this.orderTime = builder.orderTime;
            this.packageType = builder.packageType;
            this.remainCount = builder.remainCount;
            this.status = builder.status;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsPackageDetailDTO create() {
            return builder().build();
        }

        /**
         * @return invalidTime
         */
        public Long getInvalidTime() {
            return this.invalidTime;
        }

        /**
         * @return orderTime
         */
        public Long getOrderTime() {
            return this.orderTime;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return remainCount
         */
        public Long getRemainCount() {
            return this.remainCount;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long invalidTime; 
            private Long orderTime; 
            private String packageType; 
            private Long remainCount; 
            private Integer status; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(SmsPackageDetailDTO model) {
                this.invalidTime = model.invalidTime;
                this.orderTime = model.orderTime;
                this.packageType = model.packageType;
                this.remainCount = model.remainCount;
                this.status = model.status;
                this.totalCount = model.totalCount;
            } 

            /**
             * InvalidTime.
             */
            public Builder invalidTime(Long invalidTime) {
                this.invalidTime = invalidTime;
                return this;
            }

            /**
             * OrderTime.
             */
            public Builder orderTime(Long orderTime) {
                this.orderTime = orderTime;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * RemainCount.
             */
            public Builder remainCount(Long remainCount) {
                this.remainCount = remainCount;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public SmsPackageDetailDTO build() {
                return new SmsPackageDetailDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsPackageDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsPackageDetailNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SmsPackageDetailDTO")
        private java.util.List<SmsPackageDetailDTO> smsPackageDetailDTO;

        private List(Builder builder) {
            this.smsPackageDetailDTO = builder.smsPackageDetailDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return smsPackageDetailDTO
         */
        public java.util.List<SmsPackageDetailDTO> getSmsPackageDetailDTO() {
            return this.smsPackageDetailDTO;
        }

        public static final class Builder {
            private java.util.List<SmsPackageDetailDTO> smsPackageDetailDTO; 

            private Builder() {
            } 

            private Builder(List model) {
                this.smsPackageDetailDTO = model.smsPackageDetailDTO;
            } 

            /**
             * SmsPackageDetailDTO.
             */
            public Builder smsPackageDetailDTO(java.util.List<SmsPackageDetailDTO> smsPackageDetailDTO) {
                this.smsPackageDetailDTO = smsPackageDetailDTO;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
