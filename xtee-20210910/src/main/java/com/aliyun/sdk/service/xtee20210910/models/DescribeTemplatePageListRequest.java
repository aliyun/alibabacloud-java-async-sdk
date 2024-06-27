// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplatePageListRequest} extends {@link RequestModel}
 *
 * <p>DescribeTemplatePageListRequest</p>
 */
public class DescribeTemplatePageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCodes")
    private String eventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateSearchItem")
    private String templateSearchItem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateStatus")
    private String templateStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateType")
    private String templateType;

    private DescribeTemplatePageListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.currentPage = builder.currentPage;
        this.eventCodes = builder.eventCodes;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
        this.templateName = builder.templateName;
        this.templateSearchItem = builder.templateSearchItem;
        this.templateStatus = builder.templateStatus;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplatePageListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return eventCodes
     */
    public String getEventCodes() {
        return this.eventCodes;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateSearchItem
     */
    public String getTemplateSearchItem() {
        return this.templateSearchItem;
    }

    /**
     * @return templateStatus
     */
    public String getTemplateStatus() {
        return this.templateStatus;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<DescribeTemplatePageListRequest, Builder> {
        private String lang; 
        private String currentPage; 
        private String eventCodes; 
        private String pageSize; 
        private String regId; 
        private String templateName; 
        private String templateSearchItem; 
        private String templateStatus; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTemplatePageListRequest request) {
            super(request);
            this.lang = request.lang;
            this.currentPage = request.currentPage;
            this.eventCodes = request.eventCodes;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
            this.templateName = request.templateName;
            this.templateSearchItem = request.templateSearchItem;
            this.templateStatus = request.templateStatus;
            this.templateType = request.templateType;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * eventCodes.
         */
        public Builder eventCodes(String eventCodes) {
            this.putQueryParameter("eventCodes", eventCodes);
            this.eventCodes = eventCodes;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * templateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("templateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * templateSearchItem.
         */
        public Builder templateSearchItem(String templateSearchItem) {
            this.putQueryParameter("templateSearchItem", templateSearchItem);
            this.templateSearchItem = templateSearchItem;
            return this;
        }

        /**
         * templateStatus.
         */
        public Builder templateStatus(String templateStatus) {
            this.putQueryParameter("templateStatus", templateStatus);
            this.templateStatus = templateStatus;
            return this;
        }

        /**
         * templateType.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("templateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public DescribeTemplatePageListRequest build() {
            return new DescribeTemplatePageListRequest(this);
        } 

    } 

}
