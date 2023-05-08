// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupedContainerInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupedContainerInstancesRequest</p>
 */
public class DescribeGroupedContainerInstancesRequest extends Request {
    @Query
    @NameInMap("Criteria")
    private String criteria;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("FieldValue")
    private String fieldValue;

    @Query
    @NameInMap("GroupField")
    @Validation(required = true)
    private String groupField;

    @Query
    @NameInMap("LogicalExp")
    private String logicalExp;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private DescribeGroupedContainerInstancesRequest(Builder builder) {
        super(builder);
        this.criteria = builder.criteria;
        this.currentPage = builder.currentPage;
        this.fieldValue = builder.fieldValue;
        this.groupField = builder.groupField;
        this.logicalExp = builder.logicalExp;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupedContainerInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return criteria
     */
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return fieldValue
     */
    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * @return groupField
     */
    public String getGroupField() {
        return this.groupField;
    }

    /**
     * @return logicalExp
     */
    public String getLogicalExp() {
        return this.logicalExp;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeGroupedContainerInstancesRequest, Builder> {
        private String criteria; 
        private Integer currentPage; 
        private String fieldValue; 
        private String groupField; 
        private String logicalExp; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGroupedContainerInstancesRequest request) {
            super(request);
            this.criteria = request.criteria;
            this.currentPage = request.currentPage;
            this.fieldValue = request.fieldValue;
            this.groupField = request.groupField;
            this.logicalExp = request.logicalExp;
            this.pageSize = request.pageSize;
        } 

        /**
         * Criteria.
         */
        public Builder criteria(String criteria) {
            this.putQueryParameter("Criteria", criteria);
            this.criteria = criteria;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * FieldValue.
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("FieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * GroupField.
         */
        public Builder groupField(String groupField) {
            this.putQueryParameter("GroupField", groupField);
            this.groupField = groupField;
            return this;
        }

        /**
         * LogicalExp.
         */
        public Builder logicalExp(String logicalExp) {
            this.putQueryParameter("LogicalExp", logicalExp);
            this.logicalExp = logicalExp;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeGroupedContainerInstancesRequest build() {
            return new DescribeGroupedContainerInstancesRequest(this);
        } 

    } 

}
