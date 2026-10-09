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
 * {@link DescribeVpcFirewallSummaryInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallSummaryInfoRequest</p>
 */
public class DescribeVpcFirewallSummaryInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserType")
    private String userType;

    private DescribeVpcFirewallSummaryInfoRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallSummaryInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<DescribeVpcFirewallSummaryInfoRequest, Builder> {
        private String lang; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcFirewallSummaryInfoRequest request) {
            super(request);
            this.lang = request.lang;
            this.userType = request.userType;
        } 

        /**
         * <p>The language type. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The user type. Valid values:</p>
         * <p><strong>buy</strong>: paid user.</p>
         * <p><strong>free</strong>: free user.</p>
         * 
         * <strong>example:</strong>
         * <p>buy</p>
         */
        public Builder userType(String userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public DescribeVpcFirewallSummaryInfoRequest build() {
            return new DescribeVpcFirewallSummaryInfoRequest(this);
        } 

    } 

}
