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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeNatAclPageStatusResponseBody model) {
            this.detail = model.detail;
            this.natAclPageEnable = model.natAclPageEnable;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Extra error information.</p>
         * 
         * <strong>example:</strong>
         * <p>proxy_not_exist</p>
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * <p>Indicates whether pagination for access control policies for NAT firewalls is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder natAclPageEnable(Boolean natAclPageEnable) {
            this.natAclPageEnable = natAclPageEnable;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B97F9AD7-A2DB-5F8F-9206-DF89DE0AC9E8</p>
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
