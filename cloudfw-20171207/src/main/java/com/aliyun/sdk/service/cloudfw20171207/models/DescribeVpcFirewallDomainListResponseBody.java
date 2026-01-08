// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeVpcFirewallDomainListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallDomainListResponseBody</p>
 */
public class DescribeVpcFirewallDomainListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeVpcFirewallDomainListResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallDomainListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
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
        private java.util.List<DataList> dataList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeVpcFirewallDomainListResponseBody model) {
            this.dataList = model.dataList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * DataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
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

        public DescribeVpcFirewallDomainListResponseBody build() {
            return new DescribeVpcFirewallDomainListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcFirewallDomainListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallDomainListResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationNameList")
        private java.util.List<String> applicationNameList;

        @com.aliyun.core.annotation.NameInMap("Business")
        private String business;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("RequestBytes")
        private Long requestBytes;

        @com.aliyun.core.annotation.NameInMap("ResponseBytes")
        private Long responseBytes;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Long sessionCount;

        @com.aliyun.core.annotation.NameInMap("SrcIpCount")
        private Long srcIpCount;

        @com.aliyun.core.annotation.NameInMap("SrcVpcCount")
        private Long srcVpcCount;

        @com.aliyun.core.annotation.NameInMap("TotalBytes")
        private Long totalBytes;

        private DataList(Builder builder) {
            this.applicationNameList = builder.applicationNameList;
            this.business = builder.business;
            this.domain = builder.domain;
            this.groupName = builder.groupName;
            this.requestBytes = builder.requestBytes;
            this.responseBytes = builder.responseBytes;
            this.sessionCount = builder.sessionCount;
            this.srcIpCount = builder.srcIpCount;
            this.srcVpcCount = builder.srcVpcCount;
            this.totalBytes = builder.totalBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return applicationNameList
         */
        public java.util.List<String> getApplicationNameList() {
            return this.applicationNameList;
        }

        /**
         * @return business
         */
        public String getBusiness() {
            return this.business;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return requestBytes
         */
        public Long getRequestBytes() {
            return this.requestBytes;
        }

        /**
         * @return responseBytes
         */
        public Long getResponseBytes() {
            return this.responseBytes;
        }

        /**
         * @return sessionCount
         */
        public Long getSessionCount() {
            return this.sessionCount;
        }

        /**
         * @return srcIpCount
         */
        public Long getSrcIpCount() {
            return this.srcIpCount;
        }

        /**
         * @return srcVpcCount
         */
        public Long getSrcVpcCount() {
            return this.srcVpcCount;
        }

        /**
         * @return totalBytes
         */
        public Long getTotalBytes() {
            return this.totalBytes;
        }

        public static final class Builder {
            private java.util.List<String> applicationNameList; 
            private String business; 
            private String domain; 
            private String groupName; 
            private Long requestBytes; 
            private Long responseBytes; 
            private Long sessionCount; 
            private Long srcIpCount; 
            private Long srcVpcCount; 
            private Long totalBytes; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.applicationNameList = model.applicationNameList;
                this.business = model.business;
                this.domain = model.domain;
                this.groupName = model.groupName;
                this.requestBytes = model.requestBytes;
                this.responseBytes = model.responseBytes;
                this.sessionCount = model.sessionCount;
                this.srcIpCount = model.srcIpCount;
                this.srcVpcCount = model.srcVpcCount;
                this.totalBytes = model.totalBytes;
            } 

            /**
             * ApplicationNameList.
             */
            public Builder applicationNameList(java.util.List<String> applicationNameList) {
                this.applicationNameList = applicationNameList;
                return this;
            }

            /**
             * Business.
             */
            public Builder business(String business) {
                this.business = business;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * RequestBytes.
             */
            public Builder requestBytes(Long requestBytes) {
                this.requestBytes = requestBytes;
                return this;
            }

            /**
             * ResponseBytes.
             */
            public Builder responseBytes(Long responseBytes) {
                this.responseBytes = responseBytes;
                return this;
            }

            /**
             * SessionCount.
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * SrcIpCount.
             */
            public Builder srcIpCount(Long srcIpCount) {
                this.srcIpCount = srcIpCount;
                return this;
            }

            /**
             * SrcVpcCount.
             */
            public Builder srcVpcCount(Long srcVpcCount) {
                this.srcVpcCount = srcVpcCount;
                return this;
            }

            /**
             * TotalBytes.
             */
            public Builder totalBytes(Long totalBytes) {
                this.totalBytes = totalBytes;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
