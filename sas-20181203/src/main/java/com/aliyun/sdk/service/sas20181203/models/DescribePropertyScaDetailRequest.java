// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    @com.aliyun.core.annotation.NameInMap("ScaName")
    private String scaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaNamePattern")
    private String scaNamePattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaVersion")
    private String scaVersion;

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
        this.pageSize = builder.pageSize;
        this.pid = builder.pid;
        this.port = builder.port;
        this.processStartedEnd = builder.processStartedEnd;
        this.processStartedStart = builder.processStartedStart;
        this.remark = builder.remark;
        this.scaName = builder.scaName;
        this.scaNamePattern = builder.scaNamePattern;
        this.scaVersion = builder.scaVersion;
        this.searchInfo = builder.searchInfo;
        this.searchInfoSub = builder.searchInfoSub;
        this.searchItem = builder.searchItem;
        this.searchItemSub = builder.searchItemSub;
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
        private Integer pageSize; 
        private String pid; 
        private String port; 
        private Long processStartedEnd; 
        private Long processStartedStart; 
        private String remark; 
        private String scaName; 
        private String scaNamePattern; 
        private String scaVersion; 
        private String searchInfo; 
        private String searchInfoSub; 
        private String searchItem; 
        private String searchItemSub; 
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
            this.pageSize = request.pageSize;
            this.pid = request.pid;
            this.port = request.port;
            this.processStartedEnd = request.processStartedEnd;
            this.processStartedStart = request.processStartedStart;
            this.remark = request.remark;
            this.scaName = request.scaName;
            this.scaNamePattern = request.scaNamePattern;
            this.scaVersion = request.scaVersion;
            this.searchInfo = request.searchInfo;
            this.searchInfoSub = request.searchInfoSub;
            this.searchItem = request.searchItem;
            this.searchItemSub = request.searchItemSub;
            this.user = request.user;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The type of the asset fingerprint that you want to query. Default value: <strong>sca</strong>. Valid values:</p>
         * <ul>
         * <li><strong>sca</strong>: middleware</li>
         * <li><strong>sca_database</strong>: database</li>
         * <li><strong>sca_web</strong>: web service</li>
         * </ul>
         * <blockquote>
         * <p> If you do not specify this parameter, the default value <strong>sca</strong> is used, which indicates that middleware fingerprints are queried.</p>
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
         * <p>The type of the middleware, database, or web service that you want to query. Valid values:</p>
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
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p> This parameter is deprecated. You can ignore it.</p>
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
         * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
         * <blockquote>
         * <p> We recommend that you do not leave this parameter empty.</p>
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
         * <p>The PID.</p>
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
         * <p>The port that the process monitors.</p>
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
         * <p>The timestamp when the process ends. Unit: milliseconds.</p>
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
         * <p>The timestamp when the process starts. Unit: milliseconds.</p>
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
         * <p>The search condition, such as a server name or a server IP address.</p>
         * <blockquote>
         * <p> Fuzzy match is supported.</p>
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
         * <p>The name of the asset fingerprint that you want to query.</p>
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
         * <p>The name of the process.</p>
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
         * <p>The search keyword. You must specify this parameter based on the value of the <strong>SearchItem</strong> parameter.</p>
         * <ul>
         * <li><p>If the <strong>SearchItem</strong> parameter is set to <strong>name</strong>, you must enter the name of an asset fingerprint.</p>
         * </li>
         * <li><p>If the <strong>SearchItem</strong> parameter is set to <strong>type</strong>, you must enter the type of an asset fingerprint. Valid values:</p>
         * <ul>
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
         * <p> You must specify both the <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters before you can query the asset fingerprints based on the specified name or type.</p>
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
         * <p>The keyword of the subquery. You must specify this parameter based on the value of the <strong>SearchItemSub</strong> parameter.</p>
         * <ul>
         * <li>If the <strong>SearchItemSub</strong> parameter is set to <strong>port</strong>, you must enter a port number.</li>
         * <li>If the <strong>SearchItemSub</strong> parameter is set to <strong>pid</strong>, you must enter a process ID (PID).</li>
         * <li>If the <strong>SearchItemSub</strong> parameter is set to <strong>version</strong>, you must enter the version of a database, middleware, or web service.</li>
         * <li>If the <strong>SearchItemSub</strong> parameter is set to <strong>user</strong>, you must enter a username.</li>
         * </ul>
         * <blockquote>
         * <p> The subquery is used to search for data of a specified database, middleware, or web service.</p>
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
         * <li><strong>name</strong>: the name of a database, middleware, or web service</li>
         * <li><strong>type</strong>: the type of a database, middleware, or web service</li>
         * </ul>
         * <blockquote>
         * <p> You must specify both the <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters before you can query the asset fingerprints based on the specified name or type.</p>
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
         * <p>The type of the subquery. Valid values:</p>
         * <ul>
         * <li><strong>port</strong></li>
         * <li><strong>pid</strong></li>
         * <li><strong>version</strong></li>
         * <li><strong>user</strong></li>
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
         * <p>The user who runs the process.</p>
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
         * <p>The UUID of the server on which the middleware, database, or web service is run.</p>
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

}
