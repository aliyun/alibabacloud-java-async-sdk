// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPrivateDNSResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrivateDNSResponseBody</p>
 */
public class ListPrivateDNSResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PrivateDNSList")
    private java.util.List < PrivateDNSList> privateDNSList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListPrivateDNSResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.privateDNSList = builder.privateDNSList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateDNSResponseBody create() {
        return builder().build();
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
     * @return privateDNSList
     */
    public java.util.List < PrivateDNSList> getPrivateDNSList() {
        return this.privateDNSList;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < PrivateDNSList> privateDNSList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * PrivateDNSList.
         */
        public Builder privateDNSList(java.util.List < PrivateDNSList> privateDNSList) {
            this.privateDNSList = privateDNSList;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPrivateDNSResponseBody build() {
            return new ListPrivateDNSResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrivateDNSResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateDNSResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Record")
        private String record;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private Records(Builder builder) {
            this.record = builder.record;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return record
         */
        public String getRecord() {
            return this.record;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String record; 
            private Integer weight; 

            /**
             * Record.
             */
            public Builder record(String record) {
                this.record = record;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPrivateDNSResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateDNSResponseBody</p>
     */
    public static class PrivateDNSList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindInstances")
        private java.util.List < String > bindInstances;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("IntranetDomain")
        private String intranetDomain;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List < Records> records;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private PrivateDNSList(Builder builder) {
            this.bindInstances = builder.bindInstances;
            this.createdTime = builder.createdTime;
            this.intranetDomain = builder.intranetDomain;
            this.records = builder.records;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateDNSList create() {
            return builder().build();
        }

        /**
         * @return bindInstances
         */
        public java.util.List < String > getBindInstances() {
            return this.bindInstances;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return intranetDomain
         */
        public String getIntranetDomain() {
            return this.intranetDomain;
        }

        /**
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < String > bindInstances; 
            private String createdTime; 
            private String intranetDomain; 
            private java.util.List < Records> records; 
            private String type; 

            /**
             * BindInstances.
             */
            public Builder bindInstances(java.util.List < String > bindInstances) {
                this.bindInstances = bindInstances;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * IntranetDomain.
             */
            public Builder intranetDomain(String intranetDomain) {
                this.intranetDomain = intranetDomain;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PrivateDNSList build() {
                return new PrivateDNSList(this);
            } 

        } 

    }
}
