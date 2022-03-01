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

        private Builder(DescribePropertyScaDetailRequest response) {
            super(response);
            this.biz = response.biz;
            this.bizType = response.bizType;
            this.currentPage = response.currentPage;
            this.lang = response.lang;
            this.name = response.name;
            this.pageSize = response.pageSize;
            this.pid = response.pid;
            this.port = response.port;
            this.processStartedEnd = response.processStartedEnd;
            this.processStartedStart = response.processStartedStart;
            this.remark = response.remark;
            this.scaName = response.scaName;
            this.scaNamePattern = response.scaNamePattern;
            this.scaVersion = response.scaVersion;
            this.searchInfo = response.searchInfo;
            this.searchInfoSub = response.searchInfoSub;
            this.searchItem = response.searchItem;
            this.searchItemSub = response.searchItemSub;
            this.user = response.user;
            this.uuid = response.uuid;
        } 

        /**
         * Biz.
         */
        public Builder biz(String biz) {
            this.putQueryParameter("Biz", biz);
            this.biz = biz;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
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
         * Name.
         */
        public Builder name(Long name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Pid.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * ProcessStartedEnd.
         */
        public Builder processStartedEnd(Long processStartedEnd) {
            this.putQueryParameter("ProcessStartedEnd", processStartedEnd);
            this.processStartedEnd = processStartedEnd;
            return this;
        }

        /**
         * ProcessStartedStart.
         */
        public Builder processStartedStart(Long processStartedStart) {
            this.putQueryParameter("ProcessStartedStart", processStartedStart);
            this.processStartedStart = processStartedStart;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * ScaName.
         */
        public Builder scaName(String scaName) {
            this.putQueryParameter("ScaName", scaName);
            this.scaName = scaName;
            return this;
        }

        /**
         * ScaNamePattern.
         */
        public Builder scaNamePattern(String scaNamePattern) {
            this.putQueryParameter("ScaNamePattern", scaNamePattern);
            this.scaNamePattern = scaNamePattern;
            return this;
        }

        /**
         * ScaVersion.
         */
        public Builder scaVersion(String scaVersion) {
            this.putQueryParameter("ScaVersion", scaVersion);
            this.scaVersion = scaVersion;
            return this;
        }

        /**
         * SearchInfo.
         */
        public Builder searchInfo(String searchInfo) {
            this.putQueryParameter("SearchInfo", searchInfo);
            this.searchInfo = searchInfo;
            return this;
        }

        /**
         * SearchInfoSub.
         */
        public Builder searchInfoSub(String searchInfoSub) {
            this.putQueryParameter("SearchInfoSub", searchInfoSub);
            this.searchInfoSub = searchInfoSub;
            return this;
        }

        /**
         * SearchItem.
         */
        public Builder searchItem(String searchItem) {
            this.putQueryParameter("SearchItem", searchItem);
            this.searchItem = searchItem;
            return this;
        }

        /**
         * SearchItemSub.
         */
        public Builder searchItemSub(String searchItemSub) {
            this.putQueryParameter("SearchItemSub", searchItemSub);
            this.searchItemSub = searchItemSub;
            return this;
        }

        /**
         * User.
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        /**
         * Uuid.
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
