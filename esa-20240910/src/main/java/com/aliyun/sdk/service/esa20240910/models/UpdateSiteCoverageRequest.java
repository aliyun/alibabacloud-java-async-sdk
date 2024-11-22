// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateSiteCoverageRequest} extends {@link RequestModel}
 *
 * <p>UpdateSiteCoverageRequest</p>
 */
public class UpdateSiteCoverageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Coverage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String coverage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private UpdateSiteCoverageRequest(Builder builder) {
        super(builder);
        this.coverage = builder.coverage;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSiteCoverageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coverage
     */
    public String getCoverage() {
        return this.coverage;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<UpdateSiteCoverageRequest, Builder> {
        private String coverage; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSiteCoverageRequest request) {
            super(request);
            this.coverage = request.coverage;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The desired service location. Valid values:</p>
         * <ul>
         * <li><strong>domestic</strong>: the Chinese mainland</li>
         * <li><strong>global</strong>: global</li>
         * <li><strong>overseas</strong>: outside the Chinese mainland</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        public Builder coverage(String coverage) {
            this.putQueryParameter("Coverage", coverage);
            this.coverage = coverage;
            return this;
        }

        /**
         * <p>The website ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public UpdateSiteCoverageRequest build() {
            return new UpdateSiteCoverageRequest(this);
        } 

    } 

}
