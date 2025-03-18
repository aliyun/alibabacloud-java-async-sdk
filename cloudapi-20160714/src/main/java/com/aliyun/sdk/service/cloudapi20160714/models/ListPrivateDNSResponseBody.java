// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
    private java.util.List<PrivateDNSList> privateDNSList;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<PrivateDNSList> getPrivateDNSList() {
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
        private java.util.List<PrivateDNSList> privateDNSList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListPrivateDNSResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.privateDNSList = model.privateDNSList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
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
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The internal domain name resolutions.</p>
         */
        public Builder privateDNSList(java.util.List<PrivateDNSList> privateDNSList) {
            this.privateDNSList = privateDNSList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ016</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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

            private Builder() {
            } 

            private Builder(Records model) {
                this.record = model.record;
                this.weight = model.weight;
            } 

            /**
             * <p>The resolution record.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.1</p>
             */
            public Builder record(String record) {
                this.record = record;
                return this;
            }

            /**
             * <p>The weight of the record.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
        private java.util.List<String> bindInstances;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("IntranetDomain")
        private String intranetDomain;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

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
        public java.util.List<String> getBindInstances() {
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
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> bindInstances; 
            private String createdTime; 
            private String intranetDomain; 
            private java.util.List<Records> records; 
            private String type; 

            private Builder() {
            } 

            private Builder(PrivateDNSList model) {
                this.bindInstances = model.bindInstances;
                this.createdTime = model.createdTime;
                this.intranetDomain = model.intranetDomain;
                this.records = model.records;
                this.type = model.type;
            } 

            /**
             * <p>The instances that are associated with the resolution.</p>
             */
            public Builder bindInstances(java.util.List<String> bindInstances) {
                this.bindInstances = bindInstances;
                return this;
            }

            /**
             * <p>The time when the resolution was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-10T08:17:00Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The internal domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>api.demo.com</p>
             */
            public Builder intranetDomain(String intranetDomain) {
                this.intranetDomain = intranetDomain;
                return this;
            }

            /**
             * <p>The resolution records.</p>
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * <p>The internal domain name resolution type. Valid values:</p>
             * <ul>
             * <li>VPC: resolution for VPC access authorizations. A resolution of this type can be bound only to traditional dedicated instances.</li>
             * <li>A: resolution that supports A records. A resolution of this type can be bound only to VPC integration dedicated instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>A</p>
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
