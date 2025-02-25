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
 * {@link UpdateIPv6Request} extends {@link RequestModel}
 *
 * <p>UpdateIPv6Request</p>
 */
public class UpdateIPv6Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private String enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private UpdateIPv6Request(Builder builder) {
        super(builder);
        this.enable = builder.enable;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIPv6Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<UpdateIPv6Request, Builder> {
        private String enable; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIPv6Request request) {
            super(request);
            this.enable = request.enable;
            this.siteId = request.siteId;
        } 

        /**
         * <p>Switch. Values:</p>
         * <ul>
         * <li><strong>on</strong>: Enable.</li>
         * <li><strong>off</strong>: Disable.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>Site ID, which can be obtained by calling <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5407498413****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public UpdateIPv6Request build() {
            return new UpdateIPv6Request(this);
        } 

    } 

}
