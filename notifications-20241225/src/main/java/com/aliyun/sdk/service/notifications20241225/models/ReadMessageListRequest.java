// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.notifications20241225.models;

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
 * {@link ReadMessageListRequest} extends {@link RequestModel}
 *
 * <p>ReadMessageListRequest</p>
 */
public class ReadMessageListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizName")
    private String bizName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallerProtocol")
    private String callerProtocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClassId")
    private Long classId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientSource")
    private String clientSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cookies")
    private String cookies;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupCode")
    private String groupCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("History")
    private String history;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Loc")
    private String loc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SrcUrl")
    private String srcUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantCode")
    private String tenantCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UidType")
    private String uidType;

    private ReadMessageListRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appName = builder.appName;
        this.bizName = builder.bizName;
        this.callerProtocol = builder.callerProtocol;
        this.classId = builder.classId;
        this.clientSource = builder.clientSource;
        this.content = builder.content;
        this.cookies = builder.cookies;
        this.groupCode = builder.groupCode;
        this.history = builder.history;
        this.loc = builder.loc;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.srcUrl = builder.srcUrl;
        this.status = builder.status;
        this.tenantCode = builder.tenantCode;
        this.title = builder.title;
        this.uidType = builder.uidType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadMessageListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return bizName
     */
    public String getBizName() {
        return this.bizName;
    }

    /**
     * @return callerProtocol
     */
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    /**
     * @return classId
     */
    public Long getClassId() {
        return this.classId;
    }

    /**
     * @return clientSource
     */
    public String getClientSource() {
        return this.clientSource;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return cookies
     */
    public String getCookies() {
        return this.cookies;
    }

    /**
     * @return groupCode
     */
    public String getGroupCode() {
        return this.groupCode;
    }

    /**
     * @return history
     */
    public String getHistory() {
        return this.history;
    }

    /**
     * @return loc
     */
    public String getLoc() {
        return this.loc;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return srcUrl
     */
    public String getSrcUrl() {
        return this.srcUrl;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return tenantCode
     */
    public String getTenantCode() {
        return this.tenantCode;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return uidType
     */
    public String getUidType() {
        return this.uidType;
    }

    public static final class Builder extends Request.Builder<ReadMessageListRequest, Builder> {
        private String acceptLanguage; 
        private String appName; 
        private String bizName; 
        private String callerProtocol; 
        private Long classId; 
        private String clientSource; 
        private String content; 
        private String cookies; 
        private String groupCode; 
        private String history; 
        private String loc; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer page; 
        private Integer pageSize; 
        private String srcUrl; 
        private Integer status; 
        private String tenantCode; 
        private String title; 
        private String uidType; 

        private Builder() {
            super();
        } 

        private Builder(ReadMessageListRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appName = request.appName;
            this.bizName = request.bizName;
            this.callerProtocol = request.callerProtocol;
            this.classId = request.classId;
            this.clientSource = request.clientSource;
            this.content = request.content;
            this.cookies = request.cookies;
            this.groupCode = request.groupCode;
            this.history = request.history;
            this.loc = request.loc;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.srcUrl = request.srcUrl;
            this.status = request.status;
            this.tenantCode = request.tenantCode;
            this.title = request.title;
            this.uidType = request.uidType;
        } 

        /**
         * <p>语言，默认为简体中文</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putBodyParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>系统参数，无需填写</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>系统参数，无需填写</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder bizName(String bizName) {
            this.putBodyParameter("BizName", bizName);
            this.bizName = bizName;
            return this;
        }

        /**
         * <p>系统参数，无需填写</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder callerProtocol(String callerProtocol) {
            this.putBodyParameter("CallerProtocol", callerProtocol);
            this.callerProtocol = callerProtocol;
            return this;
        }

        /**
         * <p>消息类目ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder classId(Long classId) {
            this.putBodyParameter("ClassId", classId);
            this.classId = classId;
            return this;
        }

        /**
         * <p>系统参数，无需填写</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder clientSource(String clientSource) {
            this.putBodyParameter("ClientSource", clientSource);
            this.clientSource = clientSource;
            return this;
        }

        /**
         * <p>消息内容，用于模糊搜索</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;消息内容示例“</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>系统参数，无需填写</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder cookies(String cookies) {
            this.putBodyParameter("Cookies", cookies);
            this.cookies = cookies;
            return this;
        }

        /**
         * GroupCode.
         */
        public Builder groupCode(String groupCode) {
            this.putBodyParameter("GroupCode", groupCode);
            this.groupCode = groupCode;
            return this;
        }

        /**
         * History.
         */
        public Builder history(String history) {
            this.putBodyParameter("History", history);
            this.history = history;
            return this;
        }

        /**
         * <p>栏位 nav代表控制台topbar</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder loc(String loc) {
            this.putBodyParameter("Loc", loc);
            this.loc = loc;
            return this;
        }

        /**
         * <p>系统参数，无需填写</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>系统参数，无需填写</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>分页查询页码</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder page(Integer page) {
            this.putBodyParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>分页查询大小</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>系统参数，无需填写</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder srcUrl(String srcUrl) {
            this.putBodyParameter("SrcUrl", srcUrl);
            this.srcUrl = srcUrl;
            return this;
        }

        /**
         * <p>消息状态，已读为1，未读为0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>系统参数，无需填写</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder tenantCode(String tenantCode) {
            this.putBodyParameter("TenantCode", tenantCode);
            this.tenantCode = tenantCode;
            return this;
        }

        /**
         * <p>消息标题，用于模糊搜索</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;标题示例“</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>系统参数，无需填写</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder uidType(String uidType) {
            this.putBodyParameter("UidType", uidType);
            this.uidType = uidType;
            return this;
        }

        @Override
        public ReadMessageListRequest build() {
            return new ReadMessageListRequest(this);
        } 

    } 

}
