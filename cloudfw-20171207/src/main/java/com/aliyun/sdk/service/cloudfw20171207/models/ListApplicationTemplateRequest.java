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
 * {@link ListApplicationTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationTemplateRequest</p>
 */
public class ListApplicationTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationTemplateIds")
    private java.util.List<String> applicationTemplateIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationTemplateName")
    private String applicationTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuiltInApplicationStatus")
    private String builtInApplicationStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomRuleStatus")
    private String customRuleStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateStatus")
    private String templateStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnknownAction")
    private String unknownAction;

    private ListApplicationTemplateRequest(Builder builder) {
        super(builder);
        this.applicationTemplateIds = builder.applicationTemplateIds;
        this.applicationTemplateName = builder.applicationTemplateName;
        this.builtInApplicationStatus = builder.builtInApplicationStatus;
        this.customRuleStatus = builder.customRuleStatus;
        this.description = builder.description;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.templateStatus = builder.templateStatus;
        this.unknownAction = builder.unknownAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationTemplateIds
     */
    public java.util.List<String> getApplicationTemplateIds() {
        return this.applicationTemplateIds;
    }

    /**
     * @return applicationTemplateName
     */
    public String getApplicationTemplateName() {
        return this.applicationTemplateName;
    }

    /**
     * @return builtInApplicationStatus
     */
    public String getBuiltInApplicationStatus() {
        return this.builtInApplicationStatus;
    }

    /**
     * @return customRuleStatus
     */
    public String getCustomRuleStatus() {
        return this.customRuleStatus;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return templateStatus
     */
    public String getTemplateStatus() {
        return this.templateStatus;
    }

    /**
     * @return unknownAction
     */
    public String getUnknownAction() {
        return this.unknownAction;
    }

    public static final class Builder extends Request.Builder<ListApplicationTemplateRequest, Builder> {
        private java.util.List<String> applicationTemplateIds; 
        private String applicationTemplateName; 
        private String builtInApplicationStatus; 
        private String customRuleStatus; 
        private String description; 
        private Long pageNo; 
        private Long pageSize; 
        private String templateStatus; 
        private String unknownAction; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationTemplateRequest request) {
            super(request);
            this.applicationTemplateIds = request.applicationTemplateIds;
            this.applicationTemplateName = request.applicationTemplateName;
            this.builtInApplicationStatus = request.builtInApplicationStatus;
            this.customRuleStatus = request.customRuleStatus;
            this.description = request.description;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.templateStatus = request.templateStatus;
            this.unknownAction = request.unknownAction;
        } 

        /**
         * <p>The list of application template IDs for batch exact matching.</p>
         */
        public Builder applicationTemplateIds(java.util.List<String> applicationTemplateIds) {
            this.putQueryParameter("ApplicationTemplateIds", applicationTemplateIds);
            this.applicationTemplateIds = applicationTemplateIds;
            return this;
        }

        /**
         * <p>The application template name for fuzzy matching.</p>
         * 
         * <strong>example:</strong>
         * <p>Application template</p>
         */
        public Builder applicationTemplateName(String applicationTemplateName) {
            this.putQueryParameter("ApplicationTemplateName", applicationTemplateName);
            this.applicationTemplateName = applicationTemplateName;
            return this;
        }

        /**
         * <p>The switch status of built-in application control for exact matching. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: enabled</li>
         * <li><strong>Disable</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder builtInApplicationStatus(String builtInApplicationStatus) {
            this.putQueryParameter("BuiltInApplicationStatus", builtInApplicationStatus);
            this.builtInApplicationStatus = builtInApplicationStatus;
            return this;
        }

        /**
         * <p>The switch status of custom application rules for exact matching. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: enabled</li>
         * <li><strong>Disable</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder customRuleStatus(String customRuleStatus) {
            this.putQueryParameter("CustomRuleStatus", customRuleStatus);
            this.customRuleStatus = customRuleStatus;
            return this;
        }

        /**
         * <p>The description of the application template for fuzzy matching.</p>
         * 
         * <strong>example:</strong>
         * <p>Office network application control</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. The value must be greater than or equal to 1. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The master switch status of the application template for exact matching. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: enabled</li>
         * <li><strong>Disable</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder templateStatus(String templateStatus) {
            this.putQueryParameter("TemplateStatus", templateStatus);
            this.templateStatus = templateStatus;
            return this;
        }

        /**
         * <p>The action for unrecognized applications for exact matching. Valid values:</p>
         * <ul>
         * <li><strong>Allow</strong>: allow</li>
         * <li><strong>Alert</strong>: monitor</li>
         * <li><strong>Deny</strong>: block</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Alert</p>
         */
        public Builder unknownAction(String unknownAction) {
            this.putQueryParameter("UnknownAction", unknownAction);
            this.unknownAction = unknownAction;
            return this;
        }

        @Override
        public ListApplicationTemplateRequest build() {
            return new ListApplicationTemplateRequest(this);
        } 

    } 

}
