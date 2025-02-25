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
 * {@link GetCacheTagResponseBody} extends {@link TeaModel}
 *
 * <p>GetCacheTagResponseBody</p>
 */
public class GetCacheTagResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CaseInsensitive")
    private String caseInsensitive;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    @com.aliyun.core.annotation.NameInMap("TagName")
    private String tagName;

    private GetCacheTagResponseBody(Builder builder) {
        this.caseInsensitive = builder.caseInsensitive;
        this.requestId = builder.requestId;
        this.siteVersion = builder.siteVersion;
        this.tagName = builder.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCacheTagResponseBody create() {
        return builder().build();
    }

    /**
     * @return caseInsensitive
     */
    public String getCaseInsensitive() {
        return this.caseInsensitive;
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

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    public static final class Builder {
        private String caseInsensitive; 
        private String requestId; 
        private Integer siteVersion; 
        private String tagName; 

        /**
         * <p>Indicates whether the matching is not case-sensitive. Valid values:</p>
         * <ul>
         * <li>on: The matching is not case-sensitive.</li>
         * <li>off: The matching is case-sensitive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder caseInsensitive(String caseInsensitive) {
            this.caseInsensitive = caseInsensitive;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The version number of the website.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }

        /**
         * <p>The name of the custom cache tag.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder tagName(String tagName) {
            this.tagName = tagName;
            return this;
        }

        public GetCacheTagResponseBody build() {
            return new GetCacheTagResponseBody(this);
        } 

    } 

}
