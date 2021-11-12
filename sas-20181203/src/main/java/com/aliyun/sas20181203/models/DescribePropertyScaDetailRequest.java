// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribePropertyScaDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyScaDetailRequest</p>
 */
public class DescribePropertyScaDetailRequest extends Request {
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
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("ScaName")
    private String scaName;

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
    @NameInMap("Uuid")
    private String uuid;


    private DescribePropertyScaDetailRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.scaName = builder.scaName;
        this.searchInfo = builder.searchInfo;
        this.searchInfoSub = builder.searchInfoSub;
        this.searchItem = builder.searchItem;
        this.searchItemSub = builder.searchItemSub;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyScaDetailRequest create() {
        return builder().build();
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
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder {
        private String bizType; 
        private Integer currentPage; 
        private String lang; 
        private Long name; 
        private Integer pageSize; 
        private String remark; 
        private String scaName; 
        private String searchInfo; 
        private String searchInfoSub; 
        private String searchItem; 
        private String searchItemSub; 
        private String uuid; 

        /**
         * <p>BizType.</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>CurrentPage.</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Lang.</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Name.</p>
         */
        public Builder name(Long name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Remark.</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>ScaName.</p>
         */
        public Builder scaName(String scaName) {
            this.putQueryParameter("ScaName", scaName);
            this.scaName = scaName;
            return this;
        }

        /**
         * <p>SearchInfo.</p>
         */
        public Builder searchInfo(String searchInfo) {
            this.putQueryParameter("SearchInfo", searchInfo);
            this.searchInfo = searchInfo;
            return this;
        }

        /**
         * <p>SearchInfoSub.</p>
         */
        public Builder searchInfoSub(String searchInfoSub) {
            this.putQueryParameter("SearchInfoSub", searchInfoSub);
            this.searchInfoSub = searchInfoSub;
            return this;
        }

        /**
         * <p>SearchItem.</p>
         */
        public Builder searchItem(String searchItem) {
            this.putQueryParameter("SearchItem", searchItem);
            this.searchItem = searchItem;
            return this;
        }

        /**
         * <p>SearchItemSub.</p>
         */
        public Builder searchItemSub(String searchItemSub) {
            this.putQueryParameter("SearchItemSub", searchItemSub);
            this.searchItemSub = searchItemSub;
            return this;
        }

        /**
         * <p>Uuid.</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        public DescribePropertyScaDetailRequest build() {
            return new DescribePropertyScaDetailRequest(this);
        } 

    } 

}
