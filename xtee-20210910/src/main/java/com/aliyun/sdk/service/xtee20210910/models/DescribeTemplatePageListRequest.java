// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Event code.</p>
         * 
         * <strong>example:</strong>
         * <p>d6_h1fe4cfa1g</p>
         */
        public Builder eventCodes(String eventCodes) {
            this.putQueryParameter("eventCodes", eventCodes);
            this.eventCodes = eventCodes;
            return this;
        }

        /**
         * <p>Page size, default value is 10</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Event name</p>
         * 
         * <strong>example:</strong>
         * <p>注册事件</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("templateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>Event template search field</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        public Builder templateSearchItem(String templateSearchItem) {
            this.putQueryParameter("templateSearchItem", templateSearchItem);
            this.templateSearchItem = templateSearchItem;
            return this;
        }

        /**
         * <p>Event status</p>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        public Builder templateStatus(String templateStatus) {
            this.putQueryParameter("templateStatus", templateStatus);
            this.templateStatus = templateStatus;
            return this;
        }

        /**
         * <p>Template type</p>
         * 
         * <strong>example:</strong>
         * <p>PUB_SERVICE</p>
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
