// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainSpecialBizInfoByDomainRequest} extends {@link RequestModel}
 *
 * <p>QueryDomainSpecialBizInfoByDomainRequest</p>
 */
public class QueryDomainSpecialBizInfoByDomainRequest extends Request {
    @Body
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Body
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private QueryDomainSpecialBizInfoByDomainRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.domainName = builder.domainName;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainSpecialBizInfoByDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryDomainSpecialBizInfoByDomainRequest, Builder> {
        private String bizType; 
        private String domainName; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryDomainSpecialBizInfoByDomainRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.domainName = request.domainName;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * The business type.
         */
        public Builder bizType(String bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * The domain name.
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The IP address of the client.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public QueryDomainSpecialBizInfoByDomainRequest build() {
            return new QueryDomainSpecialBizInfoByDomainRequest(this);
        } 

    } 

}
