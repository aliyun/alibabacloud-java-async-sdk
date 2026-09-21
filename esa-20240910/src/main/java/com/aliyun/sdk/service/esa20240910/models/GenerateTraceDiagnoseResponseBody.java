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
 * {@link GenerateTraceDiagnoseResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateTraceDiagnoseResponseBody</p>
 */
public class GenerateTraceDiagnoseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tip")
    private String tip;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private GenerateTraceDiagnoseResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tip = builder.tip;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTraceDiagnoseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tip
     */
    public String getTip() {
        return this.tip;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String requestId; 
        private String tip; 
        private String url; 

        private Builder() {
        } 

        private Builder(GenerateTraceDiagnoseResponseBody model) {
            this.requestId = model.requestId;
            this.tip = model.tip;
            this.url = model.url;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>64D28B53-5902-409B-94F6-FD46680144FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The tip.</p>
         * 
         * <strong>example:</strong>
         * <p>Origin IP x.x.x.x: Test URL returned HTTP 404 (non-2xx status).
         * Origin IP x.x.x.x: DNS A record does not point to an ESA service IP.</p>
         */
        public Builder tip(String tip) {
            this.tip = tip;
            return this;
        }

        /**
         * <p>The diagnostic link URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cdn.dns-detect.alicdn.com/diagnose_v2?id=5d97ac9b&token=WFji65gy2mGNM11bD929%2BCMoyI6mbk2deRR9hOC6INH%2FoYbccQZQcvEn4wc%2FDPHlTshxRSAa5HokX%2BabItBpJ0FdnteROssomXqgIdjHpM46L%2BbaIeweZfsWG6QnbXT5n7O5APMyc%2Fe8d1o9PwwB429Ccks1FU1AfjNZfvBcLeo%3D">http://cdn.dns-detect.alicdn.com/diagnose_v2?id=5d97ac9b&amp;token=WFji65gy2mGNM11bD929%2BCMoyI6mbk2deRR9hOC6INH%2FoYbccQZQcvEn4wc%2FDPHlTshxRSAa5HokX%2BabItBpJ0FdnteROssomXqgIdjHpM46L%2BbaIeweZfsWG6QnbXT5n7O5APMyc%2Fe8d1o9PwwB429Ccks1FU1AfjNZfvBcLeo%3D</a></p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public GenerateTraceDiagnoseResponseBody build() {
            return new GenerateTraceDiagnoseResponseBody(this);
        } 

    } 

}
