// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTemplateMaterialsResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateMaterialsResponseBody</p>
 */
public class GetTemplateMaterialsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaterialUrls")
    private String materialUrls;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTemplateMaterialsResponseBody(Builder builder) {
        this.materialUrls = builder.materialUrls;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateMaterialsResponseBody create() {
        return builder().build();
    }

    /**
     * @return materialUrls
     */
    public String getMaterialUrls() {
        return this.materialUrls;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String materialUrls; 
        private String requestId; 

        /**
         * MaterialUrls.
         */
        public Builder materialUrls(String materialUrls) {
            this.materialUrls = materialUrls;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTemplateMaterialsResponseBody build() {
            return new GetTemplateMaterialsResponseBody(this);
        } 

    } 

}
