// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateScheduledPreloadJobRequest} extends {@link RequestModel}
 *
 * <p>CreateScheduledPreloadJobRequest</p>
 */
public class CreateScheduledPreloadJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InsertWay")
    @com.aliyun.core.annotation.Validation(required = true)
    private String insertWay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssUrl")
    private String ossUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UrlList")
    private String urlList;

    private CreateScheduledPreloadJobRequest(Builder builder) {
        super(builder);
        this.insertWay = builder.insertWay;
        this.name = builder.name;
        this.ossUrl = builder.ossUrl;
        this.siteId = builder.siteId;
        this.urlList = builder.urlList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScheduledPreloadJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return insertWay
     */
    public String getInsertWay() {
        return this.insertWay;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ossUrl
     */
    public String getOssUrl() {
        return this.ossUrl;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return urlList
     */
    public String getUrlList() {
        return this.urlList;
    }

    public static final class Builder extends Request.Builder<CreateScheduledPreloadJobRequest, Builder> {
        private String insertWay; 
        private String name; 
        private String ossUrl; 
        private Long siteId; 
        private String urlList; 

        private Builder() {
            super();
        } 

        private Builder(CreateScheduledPreloadJobRequest request) {
            super(request);
            this.insertWay = request.insertWay;
            this.name = request.name;
            this.ossUrl = request.ossUrl;
            this.siteId = request.siteId;
            this.urlList = request.urlList;
        } 

        /**
         * InsertWay.
         */
        public Builder insertWay(String insertWay) {
            this.putBodyParameter("InsertWay", insertWay);
            this.insertWay = insertWay;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OssUrl.
         */
        public Builder ossUrl(String ossUrl) {
            this.putBodyParameter("OssUrl", ossUrl);
            this.ossUrl = ossUrl;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.putBodyParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * UrlList.
         */
        public Builder urlList(String urlList) {
            this.putBodyParameter("UrlList", urlList);
            this.urlList = urlList;
            return this;
        }

        @Override
        public CreateScheduledPreloadJobRequest build() {
            return new CreateScheduledPreloadJobRequest(this);
        } 

    } 

}
