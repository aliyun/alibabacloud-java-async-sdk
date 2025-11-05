// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateOriginProtectionRequest} extends {@link RequestModel}
 *
 * <p>UpdateOriginProtectionRequest</p>
 */
public class UpdateOriginProtectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoConfirmIPList")
    private String autoConfirmIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginConverge")
    @com.aliyun.core.annotation.Validation(required = true)
    private String originConverge;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private UpdateOriginProtectionRequest(Builder builder) {
        super(builder);
        this.autoConfirmIPList = builder.autoConfirmIPList;
        this.originConverge = builder.originConverge;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOriginProtectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoConfirmIPList
     */
    public String getAutoConfirmIPList() {
        return this.autoConfirmIPList;
    }

    /**
     * @return originConverge
     */
    public String getOriginConverge() {
        return this.originConverge;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<UpdateOriginProtectionRequest, Builder> {
        private String autoConfirmIPList; 
        private String originConverge; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOriginProtectionRequest request) {
            super(request);
            this.autoConfirmIPList = request.autoConfirmIPList;
            this.originConverge = request.originConverge;
            this.siteId = request.siteId;
        } 

        /**
         * AutoConfirmIPList.
         */
        public Builder autoConfirmIPList(String autoConfirmIPList) {
            this.putQueryParameter("AutoConfirmIPList", autoConfirmIPList);
            this.autoConfirmIPList = autoConfirmIPList;
            return this;
        }

        /**
         * <p>The IP convergence status.</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder originConverge(String originConverge) {
            this.putQueryParameter("OriginConverge", originConverge);
            this.originConverge = originConverge;
            return this;
        }

        /**
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public UpdateOriginProtectionRequest build() {
            return new UpdateOriginProtectionRequest(this);
        } 

    } 

}
