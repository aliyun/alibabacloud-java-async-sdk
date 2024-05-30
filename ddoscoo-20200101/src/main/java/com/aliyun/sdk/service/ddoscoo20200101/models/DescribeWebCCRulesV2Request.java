// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(String offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * PageSize.
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
