// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

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
 * {@link QueryProductInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryProductInstanceListResponseBody</p>
 */
public class QueryProductInstanceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("instanceList")
    private java.util.List<ProductInstance> instanceList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private QueryProductInstanceListResponseBody(Builder builder) {
        this.instanceList = builder.instanceList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryProductInstanceListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceList
     */
    public java.util.List<ProductInstance> getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ProductInstance> instanceList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryProductInstanceListResponseBody model) {
            this.instanceList = model.instanceList;
            this.requestId = model.requestId;
        } 

        /**
         * instanceList.
         */
        public Builder instanceList(java.util.List<ProductInstance> instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryProductInstanceListResponseBody build() {
            return new QueryProductInstanceListResponseBody(this);
        } 

    } 

}
