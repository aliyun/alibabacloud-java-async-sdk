// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateMaterialsResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateMaterialsResponseBody</p>
 */
public class GetTemplateMaterialsResponseBody extends TeaModel {
    @NameInMap("MaterialUrls")
    private String materialUrls;

    @NameInMap("RequestId")
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
         * Id of the request
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
