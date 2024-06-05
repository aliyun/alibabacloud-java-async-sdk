// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DomainSeniorConfig} extends {@link TeaModel}
 *
 * <p>DomainSeniorConfig</p>
 */
public class DomainSeniorConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("client_download_enable")
    private Boolean clientDownloadEnable;

    @com.aliyun.core.annotation.NameInMap("csp_frame_ancestors")
    private String cspFrameAncestors;

    @com.aliyun.core.annotation.NameInMap("custom_login_appid")
    private String customLoginAppid;

    @com.aliyun.core.annotation.NameInMap("custom_login_url")
    private String customLoginUrl;

    @com.aliyun.core.annotation.NameInMap("custom_logout_url")
    private String customLogoutUrl;

    @com.aliyun.core.annotation.NameInMap("custom_side_link_list")
    private java.util.List < CustomSideLinkConfig > customSideLinkList;

    @com.aliyun.core.annotation.NameInMap("home_page_bg_image_url")
    private String homePageBgImageUrl;

    @com.aliyun.core.annotation.NameInMap("home_page_footer")
    private String homePageFooter;

    @com.aliyun.core.annotation.NameInMap("home_page_footer2")
    private String homePageFooter2;

    @com.aliyun.core.annotation.NameInMap("home_page_slogan")
    private String homePageSlogan;

    @com.aliyun.core.annotation.NameInMap("referer_enable")
    private Boolean refererEnable;

    @com.aliyun.core.annotation.NameInMap("wx_txt_list")
    private WxTrustedDomainConfig wxTxtList;

    private DomainSeniorConfig(Builder builder) {
        this.clientDownloadEnable = builder.clientDownloadEnable;
        this.cspFrameAncestors = builder.cspFrameAncestors;
        this.customLoginAppid = builder.customLoginAppid;
        this.customLoginUrl = builder.customLoginUrl;
        this.customLogoutUrl = builder.customLogoutUrl;
        this.customSideLinkList = builder.customSideLinkList;
        this.homePageBgImageUrl = builder.homePageBgImageUrl;
        this.homePageFooter = builder.homePageFooter;
        this.homePageFooter2 = builder.homePageFooter2;
        this.homePageSlogan = builder.homePageSlogan;
        this.refererEnable = builder.refererEnable;
        this.wxTxtList = builder.wxTxtList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DomainSeniorConfig create() {
        return builder().build();
    }

    /**
     * @return clientDownloadEnable
     */
    public Boolean getClientDownloadEnable() {
        return this.clientDownloadEnable;
    }

    /**
     * @return cspFrameAncestors
     */
    public String getCspFrameAncestors() {
        return this.cspFrameAncestors;
    }

    /**
     * @return customLoginAppid
     */
    public String getCustomLoginAppid() {
        return this.customLoginAppid;
    }

    /**
     * @return customLoginUrl
     */
    public String getCustomLoginUrl() {
        return this.customLoginUrl;
    }

    /**
     * @return customLogoutUrl
     */
    public String getCustomLogoutUrl() {
        return this.customLogoutUrl;
    }

    /**
     * @return customSideLinkList
     */
    public java.util.List < CustomSideLinkConfig > getCustomSideLinkList() {
        return this.customSideLinkList;
    }

    /**
     * @return homePageBgImageUrl
     */
    public String getHomePageBgImageUrl() {
        return this.homePageBgImageUrl;
    }

    /**
     * @return homePageFooter
     */
    public String getHomePageFooter() {
        return this.homePageFooter;
    }

    /**
     * @return homePageFooter2
     */
    public String getHomePageFooter2() {
        return this.homePageFooter2;
    }

    /**
     * @return homePageSlogan
     */
    public String getHomePageSlogan() {
        return this.homePageSlogan;
    }

    /**
     * @return refererEnable
     */
    public Boolean getRefererEnable() {
        return this.refererEnable;
    }

    /**
     * @return wxTxtList
     */
    public WxTrustedDomainConfig getWxTxtList() {
        return this.wxTxtList;
    }

    public static final class Builder {
        private Boolean clientDownloadEnable; 
        private String cspFrameAncestors; 
        private String customLoginAppid; 
        private String customLoginUrl; 
        private String customLogoutUrl; 
        private java.util.List < CustomSideLinkConfig > customSideLinkList; 
        private String homePageBgImageUrl; 
        private String homePageFooter; 
        private String homePageFooter2; 
        private String homePageSlogan; 
        private Boolean refererEnable; 
        private WxTrustedDomainConfig wxTxtList; 

        /**
         * client_download_enable.
         */
        public Builder clientDownloadEnable(Boolean clientDownloadEnable) {
            this.clientDownloadEnable = clientDownloadEnable;
            return this;
        }

        /**
         * csp_frame_ancestors.
         */
        public Builder cspFrameAncestors(String cspFrameAncestors) {
            this.cspFrameAncestors = cspFrameAncestors;
            return this;
        }

        /**
         * custom_login_appid.
         */
        public Builder customLoginAppid(String customLoginAppid) {
            this.customLoginAppid = customLoginAppid;
            return this;
        }

        /**
         * custom_login_url.
         */
        public Builder customLoginUrl(String customLoginUrl) {
            this.customLoginUrl = customLoginUrl;
            return this;
        }

        /**
         * custom_logout_url.
         */
        public Builder customLogoutUrl(String customLogoutUrl) {
            this.customLogoutUrl = customLogoutUrl;
            return this;
        }

        /**
         * custom_side_link_list.
         */
        public Builder customSideLinkList(java.util.List < CustomSideLinkConfig > customSideLinkList) {
            this.customSideLinkList = customSideLinkList;
            return this;
        }

        /**
         * home_page_bg_image_url.
         */
        public Builder homePageBgImageUrl(String homePageBgImageUrl) {
            this.homePageBgImageUrl = homePageBgImageUrl;
            return this;
        }

        /**
         * home_page_footer.
         */
        public Builder homePageFooter(String homePageFooter) {
            this.homePageFooter = homePageFooter;
            return this;
        }

        /**
         * home_page_footer2.
         */
        public Builder homePageFooter2(String homePageFooter2) {
            this.homePageFooter2 = homePageFooter2;
            return this;
        }

        /**
         * home_page_slogan.
         */
        public Builder homePageSlogan(String homePageSlogan) {
            this.homePageSlogan = homePageSlogan;
            return this;
        }

        /**
         * referer_enable.
         */
        public Builder refererEnable(Boolean refererEnable) {
            this.refererEnable = refererEnable;
            return this;
        }

        /**
         * wx_txt_list.
         */
        public Builder wxTxtList(WxTrustedDomainConfig wxTxtList) {
            this.wxTxtList = wxTxtList;
            return this;
        }

        public DomainSeniorConfig build() {
            return new DomainSeniorConfig(this);
        } 

    } 

}
