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
         * AddClientGeolocationHeader.
         */
        public Builder addClientGeolocationHeader(String addClientGeolocationHeader) {
            this.putQueryParameter("AddClientGeolocationHeader", addClientGeolocationHeader);
            this.addClientGeolocationHeader = addClientGeolocationHeader;
            return this;
        }

        /**
         * AddRealClientIpHeader.
         */
        public Builder addRealClientIpHeader(String addRealClientIpHeader) {
            this.putQueryParameter("AddRealClientIpHeader", addRealClientIpHeader);
            this.addRealClientIpHeader = addRealClientIpHeader;
            return this;
        }

        /**
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
         * SiteVersion.
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
