// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNatAclPageStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNatAclPageStatusResponseBody</p>
 */
public class DescribeNatAclPageStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Detail")
    private String detail;

    @com.aliyun.core.annotation.NameInMap("NatAclPageEnable")
    private Boolean natAclPageEnable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNatAclPageStatusResponseBody(Builder builder) {
        this.detail = builder.detail;
        this.natAclPageEnable = builder.natAclPageEnable;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatAclPageStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return natAclPageEnable
     */
    public Boolean getNatAclPageEnable() {
        return this.natAclPageEnable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String detail; 
        private Boolean natAclPageEnable; 
        private String requestId; 

        /**
         * Extra error information.
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * Indicates whether pagination for access control policies for NAT firewalls is supported.
         */
        public Builder natAclPageEnable(Boolean natAclPageEnable) {
            this.natAclPageEnable = natAclPageEnable;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNatAclPageStatusResponseBody build() {
            return new DescribeNatAclPageStatusResponseBody(this);
        } 

    } 

}
