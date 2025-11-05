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
 * {@link CreateOriginProtectionRequest} extends {@link RequestModel}
 *
 * <p>CreateOriginProtectionRequest</p>
 */
public class CreateOriginProtectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoConfirmIPList")
    private String autoConfirmIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private CreateOriginProtectionRequest(Builder builder) {
        super(builder);
        this.autoConfirmIPList = builder.autoConfirmIPList;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOriginProtectionRequest create() {
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
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<CreateOriginProtectionRequest, Builder> {
        private String autoConfirmIPList; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOriginProtectionRequest request) {
            super(request);
            this.autoConfirmIPList = request.autoConfirmIPList;
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
        public CreateOriginProtectionRequest build() {
            return new CreateOriginProtectionRequest(this);
        } 

    } 

}
