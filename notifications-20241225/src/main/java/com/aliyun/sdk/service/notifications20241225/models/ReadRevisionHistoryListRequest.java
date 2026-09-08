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
 * {@link ReadRevisionHistoryListRequest} extends {@link RequestModel}
 *
 * <p>ReadRevisionHistoryListRequest</p>
 */
public class ReadRevisionHistoryListRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("CategoryCode")
    private String categoryCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelGroupCode")
    private String channelGroupCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientSource")
    private String clientSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cookies")
    private String cookies;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SrcUrl")
    private String srcUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantCode")
    private String tenantCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UidType")
    private String uidType;

    private ReadRevisionHistoryListRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appName = builder.appName;
        this.bizName = builder.bizName;
        this.callerProtocol = builder.callerProtocol;
        this.categoryCode = builder.categoryCode;
        this.channelGroupCode = builder.channelGroupCode;
        this.clientSource = builder.clientSource;
        this.cookies = builder.cookies;
        this.pageInfo = builder.pageInfo;
        this.srcUrl = builder.srcUrl;
        this.tenantCode = builder.tenantCode;
        this.uidType = builder.uidType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadRevisionHistoryListRequest create() {
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
     * @return categoryCode
     */
    public String getCategoryCode() {
        return this.categoryCode;
    }

    /**
     * @return channelGroupCode
     */
    public String getChannelGroupCode() {
        return this.channelGroupCode;
    }

    /**
     * @return clientSource
     */
    public String getClientSource() {
        return this.clientSource;
    }

    /**
     * @return cookies
     */
    public String getCookies() {
        return this.cookies;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return srcUrl
     */
    public String getSrcUrl() {
        return this.srcUrl;
    }

    /**
     * @return tenantCode
     */
    public String getTenantCode() {
        return this.tenantCode;
    }

    /**
     * @return uidType
     */
    public String getUidType() {
        return this.uidType;
    }

    public static final class Builder extends Request.Builder<ReadRevisionHistoryListRequest, Builder> {
        private String acceptLanguage; 
        private String appName; 
        private String bizName; 
        private String callerProtocol; 
        private String categoryCode; 
        private String channelGroupCode; 
        private String clientSource; 
        private String cookies; 
        private PageInfo pageInfo; 
        private String srcUrl; 
        private String tenantCode; 
        private String uidType; 

        private Builder() {
            super();
        } 

        private Builder(ReadRevisionHistoryListRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appName = request.appName;
            this.bizName = request.bizName;
            this.callerProtocol = request.callerProtocol;
            this.categoryCode = request.categoryCode;
            this.channelGroupCode = request.channelGroupCode;
            this.clientSource = request.clientSource;
            this.cookies = request.cookies;
            this.pageInfo = request.pageInfo;
            this.srcUrl = request.srcUrl;
            this.tenantCode = request.tenantCode;
            this.uidType = request.uidType;
        } 

        /**
         * <p>The language. Automatically passed through by the browser. You can manually override this value.</p>
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
         * <p>Ignored. No need to pass this parameter. The application name of the caller.</p>
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
         * <p>Ignored. No need to pass this parameter. The business line of the caller.</p>
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
         * <p>Ignored. No need to pass this parameter. The request protocol type.</p>
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
         * <p>The category code.</p>
         * 
         * <strong>example:</strong>
         * <p>prod_edu_content</p>
         */
        public Builder categoryCode(String categoryCode) {
            this.putBodyParameter("CategoryCode", categoryCode);
            this.categoryCode = categoryCode;
            return this;
        }

        /**
         * <p>The channel group.</p>
         * 
         * <strong>example:</strong>
         * <p>base</p>
         */
        public Builder channelGroupCode(String channelGroupCode) {
            this.putBodyParameter("ChannelGroupCode", channelGroupCode);
            this.channelGroupCode = channelGroupCode;
            return this;
        }

        /**
         * <p>Ignored. No need to pass this parameter. The source of the operation terminal.</p>
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
         * <p>Ignored. No need to pass this parameter. The user cookies.</p>
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
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            String pageInfoShrink = shrink(pageInfo, "PageInfo", "json");
            this.putBodyParameter("PageInfo", pageInfoShrink);
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>Ignored. No need to pass this parameter. The source page URL.</p>
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
         * <p>Ignored. No need to pass this parameter. The tenant information.</p>
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
         * <p>Ignored. No need to pass this parameter. The user type.</p>
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
        public ReadRevisionHistoryListRequest build() {
            return new ReadRevisionHistoryListRequest(this);
        } 

    } 

    /**
     * 
     * {@link ReadRevisionHistoryListRequest} extends {@link TeaModel}
     *
     * <p>ReadRevisionHistoryListRequest</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("ReturnTotalCount")
        private Boolean returnTotalCount;

        private PageInfo(Builder builder) {
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.returnTotalCount = builder.returnTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
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
         * @return returnTotalCount
         */
        public Boolean getReturnTotalCount() {
            return this.returnTotalCount;
        }

        public static final class Builder {
            private Integer maxResults; 
            private String nextToken; 
            private Boolean returnTotalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.returnTotalCount = model.returnTotalCount;
            } 

            /**
             * <p>The maximum number of entries to return.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The token for the next page of data.</p>
             * 
             * <strong>example:</strong>
             * <p>e2b5170336162251e0b5e8707e68181f</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>Specifies whether to return the total count.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder returnTotalCount(Boolean returnTotalCount) {
                this.returnTotalCount = returnTotalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
