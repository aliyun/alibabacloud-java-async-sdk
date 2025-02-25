// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWebsiteInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateWebsiteInstanceRequest</p>
 */
public class UpdateWebsiteInstanceRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("IndexPage")
    @Validation(required = true)
    private String indexPage;

    @Query
    @NameInMap("IndexPageScanInterval")
    @Validation(required = true)
    private Integer indexPageScanInterval;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SiteProtocol")
    @Validation(required = true)
    private String siteProtocol;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("WebsiteScanInterval")
    @Validation(required = true)
    private Integer websiteScanInterval;

    private UpdateWebsiteInstanceRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.indexPage = builder.indexPage;
        this.indexPageScanInterval = builder.indexPageScanInterval;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.siteProtocol = builder.siteProtocol;
        this.sourceIp = builder.sourceIp;
        this.websiteScanInterval = builder.websiteScanInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWebsiteInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return indexPage
     */
    public String getIndexPage() {
        return this.indexPage;
    }

    /**
     * @return indexPageScanInterval
     */
    public Integer getIndexPageScanInterval() {
        return this.indexPageScanInterval;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return siteProtocol
     */
    public String getSiteProtocol() {
        return this.siteProtocol;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return websiteScanInterval
     */
    public Integer getWebsiteScanInterval() {
        return this.websiteScanInterval;
    }

    public static final class Builder extends Request.Builder<UpdateWebsiteInstanceRequest, Builder> {
        private String domain; 
        private String indexPage; 
        private Integer indexPageScanInterval; 
        private String instanceId; 
        private String lang; 
        private String siteProtocol; 
        private String sourceIp; 
        private Integer websiteScanInterval; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWebsiteInstanceRequest request) {
            super(request);
            this.domain = request.domain;
            this.indexPage = request.indexPage;
            this.indexPageScanInterval = request.indexPageScanInterval;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.siteProtocol = request.siteProtocol;
            this.sourceIp = request.sourceIp;
            this.websiteScanInterval = request.websiteScanInterval;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * IndexPage.
         */
        public Builder indexPage(String indexPage) {
            this.putQueryParameter("IndexPage", indexPage);
            this.indexPage = indexPage;
            return this;
        }

        /**
         * IndexPageScanInterval.
         */
        public Builder indexPageScanInterval(Integer indexPageScanInterval) {
            this.putQueryParameter("IndexPageScanInterval", indexPageScanInterval);
            this.indexPageScanInterval = indexPageScanInterval;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * SiteProtocol.
         */
        public Builder siteProtocol(String siteProtocol) {
            this.putQueryParameter("SiteProtocol", siteProtocol);
            this.siteProtocol = siteProtocol;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * WebsiteScanInterval.
         */
        public Builder websiteScanInterval(Integer websiteScanInterval) {
            this.putQueryParameter("WebsiteScanInterval", websiteScanInterval);
            this.websiteScanInterval = websiteScanInterval;
            return this;
        }

        @Override
        public UpdateWebsiteInstanceRequest build() {
            return new UpdateWebsiteInstanceRequest(this);
        } 

    } 

}
