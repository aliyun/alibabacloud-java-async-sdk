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
 * {@link ListVariableDefineRequest} extends {@link RequestModel}
 *
 * <p>ListVariableDefineRequest</p>
 */
public class ListVariableDefineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("allowBind")
    private String allowBind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("chargingMode")
    private String chargingMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("paging")
    private String paging;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("queryContent")
    private String queryContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("roleType")
    private String roleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scenesStr")
    private String scenesStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("typesStr")
    private String typesStr;

    private ListVariableDefineRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.allowBind = builder.allowBind;
        this.chargingMode = builder.chargingMode;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.paging = builder.paging;
        this.queryContent = builder.queryContent;
        this.regId = builder.regId;
        this.roleType = builder.roleType;
        this.scenesStr = builder.scenesStr;
        this.source = builder.source;
        this.status = builder.status;
        this.title = builder.title;
        this.typesStr = builder.typesStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVariableDefineRequest create() {
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
     * @return allowBind
     */
    public String getAllowBind() {
        return this.allowBind;
    }

    /**
     * @return chargingMode
     */
    public String getChargingMode() {
        return this.chargingMode;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return paging
     */
    public String getPaging() {
        return this.paging;
    }

    /**
     * @return queryContent
     */
    public String getQueryContent() {
        return this.queryContent;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return roleType
     */
    public String getRoleType() {
        return this.roleType;
    }

    /**
     * @return scenesStr
     */
    public String getScenesStr() {
        return this.scenesStr;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return typesStr
     */
    public String getTypesStr() {
        return this.typesStr;
    }

    public static final class Builder extends Request.Builder<ListVariableDefineRequest, Builder> {
        private String lang; 
        private String allowBind; 
        private String chargingMode; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String paging; 
        private String queryContent; 
        private String regId; 
        private String roleType; 
        private String scenesStr; 
        private String source; 
        private String status; 
        private String title; 
        private String typesStr; 

        private Builder() {
            super();
        } 

        private Builder(ListVariableDefineRequest request) {
            super(request);
            this.lang = request.lang;
            this.allowBind = request.allowBind;
            this.chargingMode = request.chargingMode;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.paging = request.paging;
            this.queryContent = request.queryContent;
            this.regId = request.regId;
            this.roleType = request.roleType;
            this.scenesStr = request.scenesStr;
            this.source = request.source;
            this.status = request.status;
            this.title = request.title;
            this.typesStr = request.typesStr;
        } 

        /**
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
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
         * <p>Whether binding is allowed, default is ENABLE</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        public Builder allowBind(String allowBind) {
            this.putQueryParameter("allowBind", allowBind);
            this.allowBind = allowBind;
            return this;
        }

        /**
         * <p>Charging mode</p>
         * 
         * <strong>example:</strong>
         * <p>FREE</p>
         */
        public Builder chargingMode(String chargingMode) {
            this.putQueryParameter("chargingMode", chargingMode);
            this.chargingMode = chargingMode;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Page size, default value is 10</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Paging identifier</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder paging(String paging) {
            this.putQueryParameter("paging", paging);
            this.paging = paging;
            return this;
        }

        /**
         * <p>Query content</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        public Builder queryContent(String queryContent) {
            this.putQueryParameter("queryContent", queryContent);
            this.queryContent = queryContent;
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
         * <p>Authorization type</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roleType(String roleType) {
            this.putQueryParameter("roleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * <p>Scenario</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;EVENT_ACTION&quot;]</p>
         */
        public Builder scenesStr(String scenesStr) {
            this.putQueryParameter("scenesStr", scenesStr);
            this.scenesStr = scenesStr;
            return this;
        }

        /**
         * <p>Source</p>
         * 
         * <strong>example:</strong>
         * <p>SAF</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>Status.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>变量的title</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>Type</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;IDENTIFY_SERVICE&quot;]</p>
         */
        public Builder typesStr(String typesStr) {
            this.putQueryParameter("typesStr", typesStr);
            this.typesStr = typesStr;
            return this;
        }

        @Override
        public ListVariableDefineRequest build() {
            return new ListVariableDefineRequest(this);
        } 

    } 

}
