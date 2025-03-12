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
 * {@link DescribeBackSourceCidrResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackSourceCidrResponseBody</p>
 */
public class DescribeBackSourceCidrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CidrList")
    private java.util.List<String> cidrList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBackSourceCidrResponseBody(Builder builder) {
        this.cidrList = builder.cidrList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackSourceCidrResponseBody create() {
        return builder().build();
    }

    /**
     * @return cidrList
     */
    public java.util.List<String> getCidrList() {
        return this.cidrList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> cidrList; 
        private String requestId; 

        /**
         * CidrList.
         */
        public Builder cidrList(java.util.List<String> cidrList) {
            this.cidrList = cidrList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackSourceCidrResponseBody build() {
            return new DescribeBackSourceCidrResponseBody(this);
        } 

    } 

}
