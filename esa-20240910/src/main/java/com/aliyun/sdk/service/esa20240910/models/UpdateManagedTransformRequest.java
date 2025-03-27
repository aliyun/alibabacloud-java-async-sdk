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
        private Long siteId; 
        private Integer siteVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpdateManagedTransformRequest request) {
            super(request);
            this.addClientGeolocationHeader = request.addClientGeolocationHeader;
            this.addRealClientIpHeader = request.addRealClientIpHeader;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
        } 

        /**
         * <p>Specifies whether to include the header that indicates the geographical location of a client in an origin request. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
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
         * <p>Specifies whether to include the &quot;ali-real-client-ip&quot; header that indicates the client&quot;s real IP address in an origin request. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
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

        /**
         * <p>The version number of the website. You can use this parameter to specify a version of your website to apply the feature settings. By default, version 0 is used.</p>
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
