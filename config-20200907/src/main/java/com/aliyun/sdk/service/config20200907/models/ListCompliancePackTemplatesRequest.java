// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCompliancePackTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListCompliancePackTemplatesRequest</p>
 */
public class ListCompliancePackTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompliancePackTemplateId")
    private String compliancePackTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private String resourceTypes;

    private ListCompliancePackTemplatesRequest(Builder builder) {
        super(builder);
        this.compliancePackTemplateId = builder.compliancePackTemplateId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceTypes = builder.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCompliancePackTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compliancePackTemplateId
     */
    public String getCompliancePackTemplateId() {
        return this.compliancePackTemplateId;
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
     * @return resourceTypes
     */
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public static final class Builder extends Request.Builder<ListCompliancePackTemplatesRequest, Builder> {
        private String compliancePackTemplateId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(ListCompliancePackTemplatesRequest request) {
            super(request);
            this.compliancePackTemplateId = request.compliancePackTemplateId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceTypes = request.resourceTypes;
        } 

        /**
         * The ID of the compliance package template.
         */
        public Builder compliancePackTemplateId(String compliancePackTemplateId) {
            this.putQueryParameter("CompliancePackTemplateId", compliancePackTemplateId);
            this.compliancePackTemplateId = compliancePackTemplateId;
            return this;
        }

        /**
         * The page number.
         * <p>
         * 
         * Pages start from page 1. Default value: 1
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * Valid values: 1 to 100. Minimum value: 1. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The types of the resources evaluated based on the rule. If you configure this parameter, only the rules that include the resource types in the compliance package template are returned.
         */
        public Builder resourceTypes(String resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        @Override
        public ListCompliancePackTemplatesRequest build() {
            return new ListCompliancePackTemplatesRequest(this);
        } 

    } 

}
