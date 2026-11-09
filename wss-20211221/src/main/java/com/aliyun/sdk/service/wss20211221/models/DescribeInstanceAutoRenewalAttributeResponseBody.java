// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link DescribeInstanceAutoRenewalAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAutoRenewalAttributeResponseBody</p>
 */
public class DescribeInstanceAutoRenewalAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("InstanceAttribute")
    private java.util.List<InstanceAttribute> instanceAttribute;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceAutoRenewalAttributeResponseBody(Builder builder) {
        this.count = builder.count;
        this.instanceAttribute = builder.instanceAttribute;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAutoRenewalAttributeResponseBody create() {
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
     * @return instanceAttribute
     */
    public java.util.List<InstanceAttribute> getInstanceAttribute() {
        return this.instanceAttribute;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<InstanceAttribute> instanceAttribute; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceAutoRenewalAttributeResponseBody model) {
            this.count = model.count;
            this.instanceAttribute = model.instanceAttribute;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The total number of entries that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The list of instances and their auto-renewal status.</p>
         */
        public Builder instanceAttribute(java.util.List<InstanceAttribute> instanceAttribute) {
            this.instanceAttribute = instanceAttribute;
            return this;
        }

        /**
         * <p>The maximum number of entries to return per query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The mark for paging. Leave this parameter empty for the first query. For subsequent paging, pass the NextToken value returned in the previous response as is. Do not construct or decode the value.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6k=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number of the paging query, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique identifier of the request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>72481C12-69AB-5CE1-8A35-A8EFA921****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceAutoRenewalAttributeResponseBody build() {
            return new DescribeInstanceAutoRenewalAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceAutoRenewalAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAutoRenewalAttributeResponseBody</p>
     */
    public static class InstanceAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("AutoRenewal")
        private Boolean autoRenewal;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private InstanceAttribute(Builder builder) {
            this.aliUid = builder.aliUid;
            this.autoRenewal = builder.autoRenewal;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceAttribute create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return autoRenewal
         */
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Long aliUid; 
            private Boolean autoRenewal; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(InstanceAttribute model) {
                this.aliUid = model.aliUid;
                this.autoRenewal = model.autoRenewal;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789012****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The auto-renewal status. Valid values:</p>
             * <ul>
             * <li>true: Auto-renewal is enabled.</li>
             * <li>false: Auto-renewal is disabled.</li>
             * </ul>
             */
            public Builder autoRenewal(Boolean autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * <p>The instance ID, which identifies the purchased instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cp-0bw2ew49****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceAttribute build() {
                return new InstanceAttribute(this);
            } 

        } 

    }
}
