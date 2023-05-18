// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListControlPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListControlPoliciesRequest</p>
 */
public class ListControlPoliciesRequest extends Request {
    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 200000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("PolicyType")
    private String policyType;

    private ListControlPoliciesRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.policyType = builder.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListControlPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    public static final class Builder extends Request.Builder<ListControlPoliciesRequest, Builder> {
        private String language; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String policyType; 

        private Builder() {
            super();
        } 

        private Builder(ListControlPoliciesRequest request) {
            super(request);
            this.language = request.language;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.policyType = request.policyType;
        } 

        /**
         * The language in which you want to return the descriptions of the access control policies. Valid values:
         * <p>
         * 
         * - zh-CN (default value): Chinese
         * - en: English
         * - ja: Japanese
         * 
         * >  This parameter is valid only for system access control policies.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * The number of the page to return. 
         * <p>
         * 
         * Page start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. 
         * <p>
         * 
         * Valid values: 1 to 100. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of the access control policy. Valid values:
         * <p>
         * 
         * - System: system access control policy
         * - Custom: custom access control policy
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        @Override
        public ListControlPoliciesRequest build() {
            return new ListControlPoliciesRequest(this);
        } 

    } 

}
