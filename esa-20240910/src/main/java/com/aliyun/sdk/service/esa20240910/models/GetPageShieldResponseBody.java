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
 * {@link GetPageShieldResponseBody} extends {@link TeaModel}
 *
 * <p>GetPageShieldResponseBody</p>
 */
public class GetPageShieldResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    @com.aliyun.core.annotation.NameInMap("ReportUri")
    private String reportUri;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    private GetPageShieldResponseBody(Builder builder) {
        this.enable = builder.enable;
        this.reportUri = builder.reportUri;
        this.requestId = builder.requestId;
        this.siteVersion = builder.siteVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPageShieldResponseBody create() {
        return builder().build();
    }

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
     * @return reportUri
     */
    public String getReportUri() {
        return this.reportUri;
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
        private String enable; 
        private String reportUri; 
        private String requestId; 
        private Integer siteVersion; 

        private Builder() {
        } 

        private Builder(GetPageShieldResponseBody model) {
            this.enable = model.enable;
            this.reportUri = model.reportUri;
            this.requestId = model.requestId;
            this.siteVersion = model.siteVersion;
        } 

        /**
         * Enable.
         */
        public Builder enable(String enable) {
            this.enable = enable;
            return this;
        }

        /**
         * ReportUri.
         */
        public Builder reportUri(String reportUri) {
            this.reportUri = reportUri;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SiteVersion.
         */
        public Builder siteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }

        public GetPageShieldResponseBody build() {
            return new GetPageShieldResponseBody(this);
        } 

    } 

}
