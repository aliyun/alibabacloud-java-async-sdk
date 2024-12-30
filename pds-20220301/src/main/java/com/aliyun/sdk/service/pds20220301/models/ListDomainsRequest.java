// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link ListDomainsRequest} extends {@link RequestModel}
 *
 * <p>ListDomainsRequest</p>
 */
public class ListDomainsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Long limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parent_domain_id")
    private String parentDomainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("service_code")
    private String serviceCode;

    private ListDomainsRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.marker = builder.marker;
        this.parentDomainId = builder.parentDomainId;
        this.serviceCode = builder.serviceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return parentDomainId
     */
    public String getParentDomainId() {
        return this.parentDomainId;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    public static final class Builder extends Request.Builder<ListDomainsRequest, Builder> {
        private Long limit; 
        private String marker; 
        private String parentDomainId; 
        private String serviceCode; 

        private Builder() {
            super();
        } 

        private Builder(ListDomainsRequest request) {
            super(request);
            this.limit = request.limit;
            this.marker = request.marker;
            this.parentDomainId = request.parentDomainId;
            this.serviceCode = request.serviceCode;
        } 

        /**
         * <p>The maximum number of results to return. Valid values: 1 to 100. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder limit(Long limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.</p>
         * 
         * <strong>example:</strong>
         * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
         */
        public Builder marker(String marker) {
            this.putBodyParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * <p>The ID of the parent domain.</p>
         * 
         * <strong>example:</strong>
         * <p>bj1</p>
         */
        public Builder parentDomainId(String parentDomainId) {
            this.putBodyParameter("parent_domain_id", parentDomainId);
            this.parentDomainId = parentDomainId;
            return this;
        }

        /**
         * service_code.
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("service_code", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        @Override
        public ListDomainsRequest build() {
            return new ListDomainsRequest(this);
        } 

    } 

}
