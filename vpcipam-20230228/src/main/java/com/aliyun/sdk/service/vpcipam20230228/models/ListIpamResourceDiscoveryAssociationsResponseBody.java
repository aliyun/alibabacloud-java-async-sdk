// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

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
 * {@link ListIpamResourceDiscoveryAssociationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpamResourceDiscoveryAssociationsResponseBody</p>
 */
public class ListIpamResourceDiscoveryAssociationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryAssociations")
    private java.util.List<IpamResourceDiscoveryAssociations> ipamResourceDiscoveryAssociations;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListIpamResourceDiscoveryAssociationsResponseBody(Builder builder) {
        this.count = builder.count;
        this.ipamResourceDiscoveryAssociations = builder.ipamResourceDiscoveryAssociations;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpamResourceDiscoveryAssociationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return ipamResourceDiscoveryAssociations
     */
    public java.util.List<IpamResourceDiscoveryAssociations> getIpamResourceDiscoveryAssociations() {
        return this.ipamResourceDiscoveryAssociations;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<IpamResourceDiscoveryAssociations> ipamResourceDiscoveryAssociations; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListIpamResourceDiscoveryAssociationsResponseBody model) {
            this.count = model.count;
            this.ipamResourceDiscoveryAssociations = model.ipamResourceDiscoveryAssociations;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The list of associations.</p>
         */
        public Builder ipamResourceDiscoveryAssociations(java.util.List<IpamResourceDiscoveryAssociations> ipamResourceDiscoveryAssociations) {
            this.ipamResourceDiscoveryAssociations = ipamResourceDiscoveryAssociations;
            return this;
        }

        /**
         * <p>The maximum number of entries on each page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, there is no next page.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, it indicates the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F28A239E-F88D-500E-ADE7-FA5E8CA3A170</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIpamResourceDiscoveryAssociationsResponseBody build() {
            return new ListIpamResourceDiscoveryAssociationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIpamResourceDiscoveryAssociationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpamResourceDiscoveryAssociationsResponseBody</p>
     */
    public static class IpamResourceDiscoveryAssociations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpamId")
        private String ipamId;

        @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryId")
        private String ipamResourceDiscoveryId;

        @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryOwnerId")
        private String ipamResourceDiscoveryOwnerId;

        @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryStatus")
        private String ipamResourceDiscoveryStatus;

        @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryType")
        private String ipamResourceDiscoveryType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private IpamResourceDiscoveryAssociations(Builder builder) {
            this.ipamId = builder.ipamId;
            this.ipamResourceDiscoveryId = builder.ipamResourceDiscoveryId;
            this.ipamResourceDiscoveryOwnerId = builder.ipamResourceDiscoveryOwnerId;
            this.ipamResourceDiscoveryStatus = builder.ipamResourceDiscoveryStatus;
            this.ipamResourceDiscoveryType = builder.ipamResourceDiscoveryType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpamResourceDiscoveryAssociations create() {
            return builder().build();
        }

        /**
         * @return ipamId
         */
        public String getIpamId() {
            return this.ipamId;
        }

        /**
         * @return ipamResourceDiscoveryId
         */
        public String getIpamResourceDiscoveryId() {
            return this.ipamResourceDiscoveryId;
        }

        /**
         * @return ipamResourceDiscoveryOwnerId
         */
        public String getIpamResourceDiscoveryOwnerId() {
            return this.ipamResourceDiscoveryOwnerId;
        }

        /**
         * @return ipamResourceDiscoveryStatus
         */
        public String getIpamResourceDiscoveryStatus() {
            return this.ipamResourceDiscoveryStatus;
        }

        /**
         * @return ipamResourceDiscoveryType
         */
        public String getIpamResourceDiscoveryType() {
            return this.ipamResourceDiscoveryType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String ipamId; 
            private String ipamResourceDiscoveryId; 
            private String ipamResourceDiscoveryOwnerId; 
            private String ipamResourceDiscoveryStatus; 
            private String ipamResourceDiscoveryType; 
            private String status; 

            private Builder() {
            } 

            private Builder(IpamResourceDiscoveryAssociations model) {
                this.ipamId = model.ipamId;
                this.ipamResourceDiscoveryId = model.ipamResourceDiscoveryId;
                this.ipamResourceDiscoveryOwnerId = model.ipamResourceDiscoveryOwnerId;
                this.ipamResourceDiscoveryStatus = model.ipamResourceDiscoveryStatus;
                this.ipamResourceDiscoveryType = model.ipamResourceDiscoveryType;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the IPAM.</p>
             * 
             * <strong>example:</strong>
             * <p>ipam-ccxbnsbhew0d6t****</p>
             */
            public Builder ipamId(String ipamId) {
                this.ipamId = ipamId;
                return this;
            }

            /**
             * <p>The ID of resource discovery instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ipam-res-disco-jt5f2af2u6nk2z321****</p>
             */
            public Builder ipamResourceDiscoveryId(String ipamResourceDiscoveryId) {
                this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource discovery belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1210123456******</p>
             */
            public Builder ipamResourceDiscoveryOwnerId(String ipamResourceDiscoveryOwnerId) {
                this.ipamResourceDiscoveryOwnerId = ipamResourceDiscoveryOwnerId;
                return this;
            }

            /**
             * <p>The status of the resource discovery instance. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Created</strong></li>
             * <li><strong>Modifying</strong></li>
             * <li><strong>Deleting</strong></li>
             * <li><strong>Deleted</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder ipamResourceDiscoveryStatus(String ipamResourceDiscoveryStatus) {
                this.ipamResourceDiscoveryStatus = ipamResourceDiscoveryStatus;
                return this;
            }

            /**
             * <p>The type of resource discovery. Valid values:</p>
             * <ul>
             * <li><strong>system</strong>: default resource discovery created by the system.</li>
             * <li><strong>custom</strong>: custom resource discovery created by users.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder ipamResourceDiscoveryType(String ipamResourceDiscoveryType) {
                this.ipamResourceDiscoveryType = ipamResourceDiscoveryType;
                return this;
            }

            /**
             * <p>The status of the associations. Valid values:</p>
             * <ul>
             * <li><strong>Created</strong></li>
             * <li><strong>Deleted</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public IpamResourceDiscoveryAssociations build() {
                return new IpamResourceDiscoveryAssociations(this);
            } 

        } 

    }
}
