// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20250630.models;

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
 * {@link ListJobPlansRequest} extends {@link RequestModel}
 *
 * <p>ListJobPlansRequest</p>
 */
public class ListJobPlansRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasTemplate")
    private Boolean hasTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobPlanName")
    private String jobPlanName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobPlanType")
    private String jobPlanType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListJobPlansRequest(Builder builder) {
        super(builder);
        this.hasTemplate = builder.hasTemplate;
        this.jobPlanName = builder.jobPlanName;
        this.jobPlanType = builder.jobPlanType;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.tag = builder.tag;
        this.templateId = builder.templateId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobPlansRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hasTemplate
     */
    public Boolean getHasTemplate() {
        return this.hasTemplate;
    }

    /**
     * @return jobPlanName
     */
    public String getJobPlanName() {
        return this.jobPlanName;
    }

    /**
     * @return jobPlanType
     */
    public String getJobPlanType() {
        return this.jobPlanType;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListJobPlansRequest, Builder> {
        private Boolean hasTemplate; 
        private String jobPlanName; 
        private String jobPlanType; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sortBy; 
        private java.util.List<Tag> tag; 
        private String templateId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListJobPlansRequest request) {
            super(request);
            this.hasTemplate = request.hasTemplate;
            this.jobPlanName = request.jobPlanName;
            this.jobPlanType = request.jobPlanType;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.tag = request.tag;
            this.templateId = request.templateId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>Specifies whether to filter by template association. Valid values:</p>
         * <ul>
         * <li>true: Returns only scenario-specific job plans that have a template.</li>
         * <li>false: Returns only general-purpose job plans that do not have a template.</li>
         * </ul>
         * <p>If this parameter is not specified, no filtering is applied. If both this parameter and TemplateId are specified, the value of TemplateId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasTemplate(Boolean hasTemplate) {
            this.putQueryParameter("HasTemplate", hasTemplate);
            this.hasTemplate = hasTemplate;
            return this;
        }

        /**
         * <p>The name of the job plan.</p>
         * 
         * <strong>example:</strong>
         * <p>JobPlan1</p>
         */
        public Builder jobPlanName(String jobPlanName) {
            this.putQueryParameter("JobPlanName", jobPlanName);
            this.jobPlanName = jobPlanName;
            return this;
        }

        /**
         * <p>The type of the job plan.</p>
         * 
         * <strong>example:</strong>
         * <p>Distillation</p>
         */
        public Builder jobPlanType(String jobPlanType) {
            this.putQueryParameter("JobPlanType", jobPlanType);
            this.jobPlanType = jobPlanType;
            return this;
        }

        /**
         * <p>The sort order.</p>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The field by which to sort the results.</p>
         * 
         * <strong>example:</strong>
         * <p>GmtCreateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            String tagShrink = shrink(tag, "Tag", "json");
            this.putQueryParameter("Tag", tagShrink);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The distillation template ID. Filters results to return only scenario-specific tasks that use the specified template.</p>
         * 
         * <strong>example:</strong>
         * <p>advanced_cot_distill</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32495</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListJobPlansRequest build() {
            return new ListJobPlansRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListJobPlansRequest} extends {@link TeaModel}
     *
     * <p>ListJobPlansRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
