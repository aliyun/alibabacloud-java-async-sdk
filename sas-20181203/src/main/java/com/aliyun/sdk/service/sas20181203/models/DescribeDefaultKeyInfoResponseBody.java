// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefaultKeyInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefaultKeyInfoResponseBody</p>
 */
public class DescribeDefaultKeyInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainList")
    private java.util.List < String > domainList;

    @com.aliyun.core.annotation.NameInMap("Names")
    private String names;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDefaultKeyInfoResponseBody(Builder builder) {
        this.domainList = builder.domainList;
        this.names = builder.names;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefaultKeyInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainList
     */
    public java.util.List < String > getDomainList() {
        return this.domainList;
    }

    /**
     * @return names
     */
    public String getNames() {
        return this.names;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > domainList; 
        private String names; 
        private String requestId; 

        /**
         * The domain names.
         */
        public Builder domainList(java.util.List < String > domainList) {
            this.domainList = domainList;
            return this;
        }

        /**
         * The company name.
         */
        public Builder names(String names) {
            this.names = names;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDefaultKeyInfoResponseBody build() {
            return new DescribeDefaultKeyInfoResponseBody(this);
        } 

    } 

}
