// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link DescribeSimpleDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSimpleDomainsResponseBody</p>
 */
public class DescribeSimpleDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainList")
    private java.util.List<String> domainList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSimpleDomainsResponseBody(Builder builder) {
        this.domainList = builder.domainList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSimpleDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainList
     */
    public java.util.List<String> getDomainList() {
        return this.domainList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> domainList; 
        private String requestId; 

        /**
         * DomainList.
         */
        public Builder domainList(java.util.List<String> domainList) {
            this.domainList = domainList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSimpleDomainsResponseBody build() {
            return new DescribeSimpleDomainsResponseBody(this);
        } 

    } 

}
