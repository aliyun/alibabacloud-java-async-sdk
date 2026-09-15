// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribePropertyScaDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyScaDetailRequest</p>
 */
public class DescribePropertyScaDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Biz")
    private String biz;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private Long name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessStartedEnd")
    private Long processStartedEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessStartedStart")
    private Long processStartedStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaName")
    private String scaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaNamePattern")
    private String scaNamePattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaVersion")
    private String scaVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchCriteriaList")
    private java.util.List<SearchCriteriaList> searchCriteriaList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchInfo")
    private String searchInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchInfoSub")
    private String searchInfoSub;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchItem")
    private String searchItem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchItemSub")
    private String searchItemSub;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseNextToken")
    private Boolean useNextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private DescribePropertyScaDetailRequest(Builder builder) {
        super(builder);
        this.biz = builder.biz;
        this.bizType = builder.bizType;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.pid = builder.pid;
        this.port = builder.port;
        this.processStartedEnd = builder.processStartedEnd;
        this.processStartedStart = builder.processStartedStart;
        this.remark = builder.remark;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.scaName = builder.scaName;
        this.scaNamePattern = builder.scaNamePattern;
        this.scaVersion = builder.scaVersion;
        this.searchCriteriaList = builder.searchCriteriaList;
        this.searchInfo = builder.searchInfo;
        this.searchInfoSub = builder.searchInfoSub;
        this.searchItem = builder.searchItem;
        this.searchItemSub = builder.searchItemSub;
        this.useNextToken = builder.useNextToken;
        this.user = builder.user;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyScaDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return biz
     */
    public String getBiz() {
        return this.biz;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public Long getName() {
        return this.name;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return processStartedEnd
     */
    public Long getProcessStartedEnd() {
        return this.processStartedEnd;
    }

    /**
     * @return processStartedStart
     */
    public Long getProcessStartedStart() {
        return this.processStartedStart;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return scaName
     */
    public String getScaName() {
        return this.scaName;
    }

    /**
     * @return scaNamePattern
     */
    public String getScaNamePattern() {
        return this.scaNamePattern;
    }

    /**
     * @return scaVersion
     */
    public String getScaVersion() {
        return this.scaVersion;
    }

    /**
     * @return searchCriteriaList
     */
    public java.util.List<SearchCriteriaList> getSearchCriteriaList() {
        return this.searchCriteriaList;
    }

    /**
     * @return searchInfo
     */
    public String getSearchInfo() {
        return this.searchInfo;
    }

    /**
     * @return searchInfoSub
     */
    public String getSearchInfoSub() {
        return this.searchInfoSub;
    }

    /**
     * @return searchItem
     */
    public String getSearchItem() {
        return this.searchItem;
    }

    /**
     * @return searchItemSub
     */
    public String getSearchItemSub() {
        return this.searchItemSub;
    }

    /**
     * @return useNextToken
     */
    public Boolean getUseNextToken() {
        return this.useNextToken;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribePropertyScaDetailRequest, Builder> {
        private String biz; 
        private String bizType; 
        private Integer currentPage; 
        private String lang; 
        private Long name; 
        private String nextToken; 
        private Integer pageSize; 
        private String pid; 
        private String port; 
        private Long processStartedEnd; 
        private Long processStartedStart; 
        private String remark; 
        private Long resourceDirectoryAccountId; 
        private String scaName; 
        private String scaNamePattern; 
        private String scaVersion; 
        private java.util.List<SearchCriteriaList> searchCriteriaList; 
        private String searchInfo; 
        private String searchInfoSub; 
        private String searchItem; 
        private String searchItemSub; 
        private Boolean useNextToken; 
        private String user; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertyScaDetailRequest request) {
            super(request);
            this.biz = request.biz;
            this.bizType = request.bizType;
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.pid = request.pid;
            this.port = request.port;
            this.processStartedEnd = request.processStartedEnd;
            this.processStartedStart = request.processStartedStart;
            this.remark = request.remark;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.scaName = request.scaName;
            this.scaNamePattern = request.scaNamePattern;
            this.scaVersion = request.scaVersion;
            this.searchCriteriaList = request.searchCriteriaList;
            this.searchInfo = request.searchInfo;
            this.searchInfoSub = request.searchInfoSub;
            this.searchItem = request.searchItem;
            this.searchItemSub = request.searchItemSub;
            this.useNextToken = request.useNextToken;
            this.user = request.user;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The type of Asset Fingerprints to query. Default value: <strong>sca</strong>. Valid values:</p>
         * <ul>
         * <li><strong>sca</strong>: middleware</li>
         * <li><strong>sca_database</strong>: database</li>
         * <li><strong>sca_web</strong>: web service</li>
         * </ul>
         * <blockquote>
         * <p>If you do not set this parameter, the default value <strong>sca</strong> is used, which indicates that the Asset Fingerprints information of the middleware type is queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sca</p>
         */
        public Builder biz(String biz) {
            this.putQueryParameter("Biz", biz);
            this.biz = biz;
            return this;
        }

        /**
         * <p>The type of the middleware, database, or web service to query. Valid values:  </p>
         * <ul>
         * <li><strong>system_service</strong>: system service</li>
         * <li><strong>software_library</strong>: software library</li>
         * <li><strong>docker_component</strong>: container component</li>
         * <li><strong>database</strong>: database</li>
         * <li><strong>web_container</strong>: web container</li>
         * <li><strong>jar</strong>: JAR package</li>
         * <li><strong>web_framework</strong>: web framework</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system_service</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The page number of the page to return in the query results. Default value: <strong>1</strong>, which indicates that the query results are displayed from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>The name of the middleware, database, or web service.</p>
         * <blockquote>
         * <p>This parameter is deprecated and does not need to be specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder name(Long name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The token that marks the current position from which to start reading. Leave this parameter empty to start reading from the beginning.</p>
         * <blockquote>
         * <p>You do not need to set this parameter for the first call. The response includes the NextToken value for the second call. Each subsequent response includes the NextToken value for the next call.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6k+AtdhNE3kgQEK36GujZ5on+tWdc+4WoaoMP/kUNxxxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. Default value: <strong>10</strong>, which indicates that 10 entries of Asset Fingerprints information are displayed per page.</p>
         * <blockquote>
         * <p>We recommend that you do not leave PageSize empty.</p>
         * </blockquote>
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
         * <p>The process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>756</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>The port on which the process listens.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The end of the time range to query the process start timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1641110965</p>
         */
        public Builder processStartedEnd(Long processStartedEnd) {
            this.putQueryParameter("ProcessStartedEnd", processStartedEnd);
            this.processStartedEnd = processStartedEnd;
            return this;
        }

        /**
         * <p>The start of the time range to query the process start timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1641024565</p>
         */
        public Builder processStartedStart(Long processStartedStart) {
            this.putQueryParameter("ProcessStartedStart", processStartedStart);
            this.processStartedStart = processStartedStart;
            return this;
        }

        /**
         * <p>The search condition (server name or IP address).</p>
         * <blockquote>
         * <p>Fuzzy search is supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the member account in the resource directory.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The name of the Asset Fingerprints to query.</p>
         * 
         * <strong>example:</strong>
         * <p>openssl</p>
         */
        public Builder scaName(String scaName) {
            this.putQueryParameter("ScaName", scaName);
            this.scaName = scaName;
            return this;
        }

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder scaNamePattern(String scaNamePattern) {
            this.putQueryParameter("ScaNamePattern", scaNamePattern);
            this.scaNamePattern = scaNamePattern;
            return this;
        }

        /**
         * <p>The version of the middleware, database, or web service.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.2k</p>
         */
        public Builder scaVersion(String scaVersion) {
            this.putQueryParameter("ScaVersion", scaVersion);
            this.scaVersion = scaVersion;
            return this;
        }

        /**
         * <p>The list of search criteria.</p>
         */
        public Builder searchCriteriaList(java.util.List<SearchCriteriaList> searchCriteriaList) {
            this.putQueryParameter("SearchCriteriaList", searchCriteriaList);
            this.searchCriteriaList = searchCriteriaList;
            return this;
        }

        /**
         * <p>The content to query. You must enter different content based on the value of <strong>SearchItem</strong>:</p>
         * <ul>
         * <li>If <strong>SearchItem</strong> is set to <strong>name</strong>, enter the name of the Asset Fingerprints.</li>
         * <li>If <strong>SearchItem</strong> is set to <strong>type</strong>, select the type of the Asset Fingerprints to query. Valid values:   <ul>
         * <li><strong>system_service</strong>: system service</li>
         * <li><strong>software_library</strong>: software library</li>
         * <li><strong>docker_component</strong>: container component</li>
         * <li><strong>database</strong>: database</li>
         * <li><strong>web_container</strong>: web container</li>
         * <li><strong>jar</strong>: JAR package</li>
         * <li><strong>web_framework</strong>: web framework</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters are used together. You must set both parameters at the same time (setting only one parameter does not take effect). This allows you to view all data of the specified Asset Fingerprints by name or type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>openssl</p>
         */
        public Builder searchInfo(String searchInfo) {
            this.putQueryParameter("SearchInfo", searchInfo);
            this.searchInfo = searchInfo;
            return this;
        }

        /**
         * <p>The content of the sub-query condition. You must enter different content based on the value of <strong>SearchItemSub</strong>:</p>
         * <ul>
         * <li>If <strong>SearchItemSub</strong> is set to <strong>port</strong>, enter the port as the sub-query condition.</li>
         * <li>If <strong>SearchItemSub</strong> is set to <strong>pid</strong>, enter the process ID as the sub-query condition.</li>
         * <li>If <strong>SearchItemSub</strong> is set to <strong>version</strong>, enter the version of the middleware, database, or web service as the sub-query condition.</li>
         * <li>If <strong>SearchItemSub</strong> is set to <strong>user</strong>, enter the username as the sub-query condition.</li>
         * </ul>
         * <blockquote>
         * <p>Sub-query conditions help you search for the data list of a specific middleware, database, or web service.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.0.2k</p>
         */
        public Builder searchInfoSub(String searchInfoSub) {
            this.putQueryParameter("SearchInfoSub", searchInfoSub);
            this.searchInfoSub = searchInfoSub;
            return this;
        }

        /**
         * <p>The type of the search condition. Valid values:</p>
         * <ul>
         * <li><strong>name</strong>: the name of the middleware, database, or web service.</li>
         * <li><strong>type</strong>: the type of the middleware, database, or web service.</li>
         * </ul>
         * <blockquote>
         * <p>The <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters are used together. You must set both parameters at the same time (setting only one parameter does not take effect). This allows you to view all data of the specified Asset Fingerprints by name or type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder searchItem(String searchItem) {
            this.putQueryParameter("SearchItem", searchItem);
            this.searchItem = searchItem;
            return this;
        }

        /**
         * <p>The type of the sub-query condition. Valid values:</p>
         * <ul>
         * <li><strong>port</strong>: port</li>
         * <li><strong>pid</strong>: process ID</li>
         * <li><strong>version</strong>: version</li>
         * <li><strong>user</strong>: user</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>version</p>
         */
        public Builder searchItemSub(String searchItemSub) {
            this.putQueryParameter("SearchItemSub", searchItemSub);
            this.searchItemSub = searchItemSub;
            return this;
        }

        /**
         * <p>Specifies whether to use the NextToken method to retrieve asset list data. If this parameter is used, TotalCount is no longer returned. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Use the NextToken method.</li>
         * <li><strong>false</strong>: Do not use the NextToken method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder useNextToken(Boolean useNextToken) {
            this.putQueryParameter("UseNextToken", useNextToken);
            this.useNextToken = useNextToken;
            return this;
        }

        /**
         * <p>The user that runs the process.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        /**
         * <p>The UUID of the server on which the middleware, database, or web service is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>uuid-02ebabe7-1c19-ab****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribePropertyScaDetailRequest build() {
            return new DescribePropertyScaDetailRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribePropertyScaDetailRequest} extends {@link TeaModel}
     *
     * <p>DescribePropertyScaDetailRequest</p>
     */
    public static class SearchCriteriaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SearchCriteriaList(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchCriteriaList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(SearchCriteriaList model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the search criterion.</p>
             * 
             * <strong>example:</strong>
             * <p>Name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The filter value of the search criterion.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SearchCriteriaList build() {
                return new SearchCriteriaList(this);
            } 

        } 

    }
}
