// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
 * {@link ListInstancesV2ResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesV2ResponseBody</p>
 */
public class ListInstancesV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("instances")
    private java.util.List<InstanceDetail> instances;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListInstancesV2ResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.instances = builder.instances;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesV2ResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return instances
     */
    public java.util.List<InstanceDetail> getInstances() {
        return this.instances;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<InstanceDetail> instances; 
        private Integer maxResults; 
        private String nextToken; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListInstancesV2ResponseBody model) {
            this.requestId = model.requestId;
            this.instances = model.instances;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * instances.
         */
        public Builder instances(java.util.List<InstanceDetail> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListInstancesV2ResponseBody build() {
            return new ListInstancesV2ResponseBody(this);
        } 

    } 

}
