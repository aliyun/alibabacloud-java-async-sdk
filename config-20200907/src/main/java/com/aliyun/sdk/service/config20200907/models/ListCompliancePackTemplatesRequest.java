// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCompliancePackTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListCompliancePackTemplatesRequest</p>
 */
public class ListCompliancePackTemplatesRequest extends Request {
    @Query
    @NameInMap("CompliancePackTemplateId")
    private String compliancePackTemplateId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ResourceTypes")
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
         * <p>
         * 
         * For more information about how to obtain the ID of a compliance package template, see [ListCompliancePackTemplates](~~261176~~).
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
         * The type of the resource evaluated by the rule.
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
