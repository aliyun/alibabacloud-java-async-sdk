// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckSiteProjectNameRequest} extends {@link RequestModel}
 *
 * <p>CheckSiteProjectNameRequest</p>
 */
public class CheckSiteProjectNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private CheckSiteProjectNameRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSiteProjectNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<CheckSiteProjectNameRequest, Builder> {
        private String projectName; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(CheckSiteProjectNameRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.siteId = request.siteId;
        } 

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public CheckSiteProjectNameRequest build() {
            return new CheckSiteProjectNameRequest(this);
        } 

    } 

}
