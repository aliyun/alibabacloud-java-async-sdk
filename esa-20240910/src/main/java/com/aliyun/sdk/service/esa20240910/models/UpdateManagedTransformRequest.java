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
 * {@link UpdateManagedTransformRequest} extends {@link RequestModel}
 *
 * <p>UpdateManagedTransformRequest</p>
 */
public class UpdateManagedTransformRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddClientGeolocationHeader")
    private String addClientGeolocationHeader;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddRealClientIpHeader")
    private String addRealClientIpHeader;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealClientIpHeaderName")
    private String realClientIpHeaderName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    private UpdateManagedTransformRequest(Builder builder) {
        super(builder);
        this.addClientGeolocationHeader = builder.addClientGeolocationHeader;
        this.addRealClientIpHeader = builder.addRealClientIpHeader;
        this.realClientIpHeaderName = builder.realClientIpHeaderName;
        this.siteId = builder.siteId;
        this.siteVersion = builder.siteVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateManagedTransformRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addClientGeolocationHeader
     */
    public String getAddClientGeolocationHeader() {
        return this.addClientGeolocationHeader;
    }

    /**
     * @return addRealClientIpHeader
     */
    public String getAddRealClientIpHeader() {
        return this.addRealClientIpHeader;
    }

    /**
     * @return realClientIpHeaderName
     */
    public String getRealClientIpHeaderName() {
        return this.realClientIpHeaderName;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return siteVersion
     */
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static final class Builder extends Request.Builder<UpdateManagedTransformRequest, Builder> {
        private String addClientGeolocationHeader; 
        private String addRealClientIpHeader; 
        private String realClientIpHeaderName; 
        private Long siteId; 
        private Integer siteVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpdateManagedTransformRequest request) {
            super(request);
            this.addClientGeolocationHeader = request.addClientGeolocationHeader;
            this.addRealClientIpHeader = request.addRealClientIpHeader;
            this.realClientIpHeaderName = request.realClientIpHeaderName;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
        } 

        /**
         * <p>Specifies whether to add a header that contains visitor geolocation information. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Add the header.</p>
         * </li>
         * <li><p><code>off</code>: Do not add the header.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder addClientGeolocationHeader(String addClientGeolocationHeader) {
            this.putQueryParameter("AddClientGeolocationHeader", addClientGeolocationHeader);
            this.addClientGeolocationHeader = addClientGeolocationHeader;
            return this;
        }

        /**
         * <p>Specifies whether to add the <code>ali-real-client-ip</code> header, which contains the real client IP. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Add the header.</p>
         * </li>
         * <li><p><code>off</code>: Do not add the header.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder addRealClientIpHeader(String addRealClientIpHeader) {
            this.putQueryParameter("AddRealClientIpHeader", addRealClientIpHeader);
            this.addRealClientIpHeader = addRealClientIpHeader;
            return this;
        }

        /**
         * <p>The name of the header that contains the real client IP. The name must start with a letter and can contain letters, digits (0-9), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>test-header</p>
         */
        public Builder realClientIpHeaderName(String realClientIpHeaderName) {
            this.putQueryParameter("RealClientIpHeaderName", realClientIpHeaderName);
            this.realClientIpHeaderName = realClientIpHeaderName;
            return this;
        }

        /**
         * <p>The ID of the site. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain this ID.</p>
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

        /**
         * <p>The version of the site. For sites with version management enabled, this parameter specifies the version to which the configuration applies. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        @Override
        public UpdateManagedTransformRequest build() {
            return new UpdateManagedTransformRequest(this);
        } 

    } 

}
