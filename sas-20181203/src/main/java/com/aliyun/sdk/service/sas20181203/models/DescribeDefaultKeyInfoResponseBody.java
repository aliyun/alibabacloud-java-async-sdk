// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeDefaultKeyInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefaultKeyInfoResponseBody</p>
 */
public class DescribeDefaultKeyInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainList")
    private java.util.List<String> domainList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainList
     */
    public java.util.List<String> getDomainList() {
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
        private java.util.List<String> domainList; 
        private String names; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDefaultKeyInfoResponseBody model) {
            this.domainList = model.domainList;
            this.names = model.names;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of domain names.</p>
         */
        public Builder domainList(java.util.List<String> domainList) {
            this.domainList = domainList;
            return this;
        }

        /**
         * <p>The company names.</p>
         * 
         * <strong>example:</strong>
         * <p>****技术股份有限公司</p>
         */
        public Builder names(String names) {
            this.names = names;
            return this;
        }

        /**
         * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>BE120DAB-F4E7-4C53-ADC3-A97578A****</p>
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
