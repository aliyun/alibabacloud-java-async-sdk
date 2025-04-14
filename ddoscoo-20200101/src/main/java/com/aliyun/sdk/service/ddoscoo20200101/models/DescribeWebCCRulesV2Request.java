// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeWebCCRulesV2Request} extends {@link RequestModel}
 *
 * <p>DescribeWebCCRulesV2Request</p>
 */
public class DescribeWebCCRulesV2Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offset")
    private String offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    private DescribeWebCCRulesV2Request(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.offset = builder.offset;
        this.owner = builder.owner;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebCCRulesV2Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return offset
     */
    public String getOffset() {
        return this.offset;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeWebCCRulesV2Request, Builder> {
        private String domain; 
        private String offset; 
        private String owner; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWebCCRulesV2Request request) {
            super(request);
            this.domain = request.domain;
            this.offset = request.offset;
            this.owner = request.owner;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The domain name of the website that you want to add to the Anti-DDoS Proxy instance for protection.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The number of entries that you want the system to skip before the system returns entries. Default value: <strong>0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(String offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>The method used to create the rule. Valid values:</p>
         * <ul>
         * <li><strong>manual</strong> (default): manually created.</li>
         * <li><strong>clover</strong>: automatically created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: <strong>20</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeWebCCRulesV2Request build() {
            return new DescribeWebCCRulesV2Request(this);
        } 

    } 

}
