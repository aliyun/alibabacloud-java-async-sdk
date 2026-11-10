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
 * {@link GetManagedTransformResponseBody} extends {@link TeaModel}
 *
 * <p>GetManagedTransformResponseBody</p>
 */
public class GetManagedTransformResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddClientGeolocationHeader")
    private String addClientGeolocationHeader;

    @com.aliyun.core.annotation.NameInMap("AddRealClientIpHeader")
    private String addRealClientIpHeader;

    @com.aliyun.core.annotation.NameInMap("RealClientIpHeaderName")
    private String realClientIpHeaderName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    private GetManagedTransformResponseBody(Builder builder) {
        this.addClientGeolocationHeader = builder.addClientGeolocationHeader;
        this.addRealClientIpHeader = builder.addRealClientIpHeader;
        this.realClientIpHeaderName = builder.realClientIpHeaderName;
        this.requestId = builder.requestId;
        this.siteVersion = builder.siteVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetManagedTransformResponseBody create() {
        return builder().build();
    }

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteVersion
     */
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static final class Builder {
        private String addClientGeolocationHeader; 
        private String addRealClientIpHeader; 
        private String realClientIpHeaderName; 
        private String requestId; 
        private Integer siteVersion; 

        private Builder() {
        } 

        private Builder(GetManagedTransformResponseBody model) {
            this.addClientGeolocationHeader = model.addClientGeolocationHeader;
            this.addRealClientIpHeader = model.addRealClientIpHeader;
            this.realClientIpHeaderName = model.realClientIpHeaderName;
            this.requestId = model.requestId;
            this.siteVersion = model.siteVersion;
        } 

        /**
         * <p>Indicates whether the visitor geolocation header is added. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder addClientGeolocationHeader(String addClientGeolocationHeader) {
            this.addClientGeolocationHeader = addClientGeolocationHeader;
            return this;
        }

        /**
         * <p>Indicates whether the ali-real-client-ip header containing the real client IP address is added. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder addRealClientIpHeader(String addRealClientIpHeader) {
            this.addRealClientIpHeader = addRealClientIpHeader;
            return this;
        }

        /**
         * <p>The name of the real client IP address header.</p>
         * 
         * <strong>example:</strong>
         * <p>test-header</p>
         */
        public Builder realClientIpHeaderName(String realClientIpHeaderName) {
            this.realClientIpHeaderName = realClientIpHeaderName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The site version number. For sites with version management enabled, you can use this parameter to specify the site version to which the configuration applies. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }

        public GetManagedTransformResponseBody build() {
            return new GetManagedTransformResponseBody(this);
        } 

    } 

}
