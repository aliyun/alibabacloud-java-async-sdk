// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyScaDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyScaDetailRequest</p>
 */
public class DescribePropertyScaDetailRequest extends Request {
    @Query
    @NameInMap("Biz")
    private String biz;

    @Query
    @NameInMap("BizType")
    private String bizType;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Name")
    private Long name;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Pid")
    private String pid;

    @Query
    @NameInMap("Port")
    private String port;

    @Query
    @NameInMap("ProcessStartedEnd")
    private Long processStartedEnd;

    @Query
    @NameInMap("ProcessStartedStart")
    private Long processStartedStart;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("ScaName")
    private String scaName;

    @Query
    @NameInMap("ScaNamePattern")
    private String scaNamePattern;

    @Query
    @NameInMap("ScaVersion")
    private String scaVersion;

    @Query
    @NameInMap("SearchInfo")
    private String searchInfo;

    @Query
    @NameInMap("SearchInfoSub")
    private String searchInfoSub;

    @Query
    @NameInMap("SearchItem")
    private String searchItem;

    @Query
    @NameInMap("SearchItemSub")
    private String searchItemSub;

    @Query
    @NameInMap("User")
    private String user;

    @Query
    @NameInMap("Uuid")
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
         * The type of the asset fingerprint that you want to query. Default value: **sca**. Valid values:
         * <p>
         * 
         * *   **sca**: middleware
         * *   **sca_database**: database
         * *   **sca_web**: web service
         * 
         * >  If you do not specify this parameter, the default value **sca** is used, which indicates that middleware fingerprints are queried.
         */
        public Builder biz(String biz) {
            this.putQueryParameter("Biz", biz);
            this.biz = biz;
            return this;
        }

        /**
         * The type of the middleware, database, or web service that you want to query. Valid values:
         * <p>
         * 
         * *   **system_service**: system service
         * *   **software_library**: software library
         * *   **docker_component**: container component
         * *   **database**: database
         * *   **web_container**: web container
         * *   **jar**: JAR package
         * *   **web_framework**: web framework
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The name of the middleware, database, or web service.
         * <p>
         * 
         * >  This parameter is deprecated. You can ignore it.
         */
        public Builder name(Long name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **10**.
         * <p>
         * 
         * >  We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The PID.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * The port that the process monitors.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The timestamp when the process ends. Unit: milliseconds.
         */
        public Builder processStartedEnd(Long processStartedEnd) {
            this.putQueryParameter("ProcessStartedEnd", processStartedEnd);
            this.processStartedEnd = processStartedEnd;
            return this;
        }

        /**
         * The timestamp generated when the process starts. Unit: milliseconds.
         */
        public Builder processStartedStart(Long processStartedStart) {
            this.putQueryParameter("ProcessStartedStart", processStartedStart);
            this.processStartedStart = processStartedStart;
            return this;
        }

        /**
         * The search condition, such as a server name or a server IP address.
         * <p>
         * 
         * >  Fuzzy match is supported.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The name of the asset fingerprint that you want to query.
         */
        public Builder scaName(String scaName) {
            this.putQueryParameter("ScaName", scaName);
            this.scaName = scaName;
            return this;
        }

        /**
         * The name of the process.
         */
        public Builder scaNamePattern(String scaNamePattern) {
            this.putQueryParameter("ScaNamePattern", scaNamePattern);
            this.scaNamePattern = scaNamePattern;
            return this;
        }

        /**
         * The version of the middleware, database, or web service.
         */
        public Builder scaVersion(String scaVersion) {
            this.putQueryParameter("ScaVersion", scaVersion);
            this.scaVersion = scaVersion;
            return this;
        }

        /**
         * The search keyword. You must specify this parameter based on the value of the **SearchItem** parameter.
         * <p>
         * 
         * *   If the **SearchItem** parameter is set to **name**, you must enter the name of an asset fingerprint.
         * 
         * *   If the **SearchItem** parameter is set to **type**, you must enter the type of an asset fingerprint. Valid values:
         * 
         *     *   **system_service**: system service
         *     *   **software_library**: software library
         *     *   **docker_component**: container component
         *     *   **database**: database
         *     *   **web_container**: web container
         *     *   **jar**: JAR package
         *     *   **web_framework**: web framework
         * 
         * >  You must specify both the **SearchItem** and **SearchInfo** parameters before you can query the asset fingerprints based on the specified name or type.
         */
        public Builder searchInfo(String searchInfo) {
            this.putQueryParameter("SearchInfo", searchInfo);
            this.searchInfo = searchInfo;
            return this;
        }

        /**
         * The keyword of the subquery. You must specify this parameter based on the value of the **SearchItemSub** parameter.
         * <p>
         * 
         * *   If the **SearchItemSub** parameter is set to **port**, you must enter a port number.
         * *   If the **SearchItemSub** parameter is set to **pid**, you must enter a process ID (PID).
         * *   If the **SearchItemSub** parameter is set to **version**, you must enter the version of a database, middleware, or web service.
         * *   If the **SearchItemSub** parameter is set to **user**, you must enter a username.
         * 
         * >  The subquery is used to search for data of a specified database, middleware, or web service.
         */
        public Builder searchInfoSub(String searchInfoSub) {
            this.putQueryParameter("SearchInfoSub", searchInfoSub);
            this.searchInfoSub = searchInfoSub;
            return this;
        }

        /**
         * The type of the search condition. Valid values:
         * <p>
         * 
         * *   **name**: the name of a database, middleware, or web service
         * *   **type**: the type of a database, middleware, or web service
         * 
         * >  You must specify both the **SearchItem** and **SearchInfo** parameters before you can query the asset fingerprints based on the specified name or type.
         */
        public Builder searchItem(String searchItem) {
            this.putQueryParameter("SearchItem", searchItem);
            this.searchItem = searchItem;
            return this;
        }

        /**
         * The type of the subquery. Valid values:
         * <p>
         * 
         * *   **port**
         * *   **pid**
         * *   **version**
         * *   **user**
         */
        public Builder searchItemSub(String searchItemSub) {
            this.putQueryParameter("SearchItemSub", searchItemSub);
            this.searchItemSub = searchItemSub;
            return this;
        }

        /**
         * The user who runs the process.
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        /**
         * The UUID of the server on which the middleware, database, or web service is run.
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
