// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuditItemDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuditItemDetailResponseBody</p>
 */
public class GetAuditItemDetailResponseBody extends TeaModel {
    @NameInMap("ApiResult")
    private String apiResult;

    @NameInMap("ApiRiskType")
    private String apiRiskType;

    @NameInMap("ApiTs")
    private String apiTs;

    @NameInMap("NewUrl")
    private String newUrl;

    @NameInMap("RequestId")
    private String requestId;

    private GetAuditItemDetailResponseBody(Builder builder) {
        this.apiResult = builder.apiResult;
        this.apiRiskType = builder.apiRiskType;
        this.apiTs = builder.apiTs;
        this.newUrl = builder.newUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuditItemDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiResult
     */
    public String getApiResult() {
        return this.apiResult;
    }

    /**
     * @return apiRiskType
     */
    public String getApiRiskType() {
        return this.apiRiskType;
    }

    /**
     * @return apiTs
     */
    public String getApiTs() {
        return this.apiTs;
    }

    /**
     * @return newUrl
     */
    public String getNewUrl() {
        return this.newUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String apiResult; 
        private String apiRiskType; 
        private String apiTs; 
        private String newUrl; 
        private String requestId; 

        /**
         * ApiResult.
         */
        public Builder apiResult(String apiResult) {
            this.apiResult = apiResult;
            return this;
        }

        /**
         * ApiRiskType.
         */
        public Builder apiRiskType(String apiRiskType) {
            this.apiRiskType = apiRiskType;
            return this;
        }

        /**
         * ApiTs.
         */
        public Builder apiTs(String apiTs) {
            this.apiTs = apiTs;
            return this;
        }

        /**
         * NewUrl.
         */
        public Builder newUrl(String newUrl) {
            this.newUrl = newUrl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAuditItemDetailResponseBody build() {
            return new GetAuditItemDetailResponseBody(this);
        } 

    } 

}
