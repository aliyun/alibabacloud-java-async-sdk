// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20250301.models;

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
 * {@link GetLabelTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetLabelTaskResultResponseBody</p>
 */
public class GetLabelTaskResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultDataUrl")
    private String resultDataUrl;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tokens")
    private String tokens;

    private GetLabelTaskResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultDataUrl = builder.resultDataUrl;
        this.status = builder.status;
        this.tokens = builder.tokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLabelTaskResultResponseBody create() {
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
     * @return resultDataUrl
     */
    public String getResultDataUrl() {
        return this.resultDataUrl;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tokens
     */
    public String getTokens() {
        return this.tokens;
    }

    public static final class Builder {
        private String requestId; 
        private String resultDataUrl; 
        private String status; 
        private String tokens; 

        private Builder() {
        } 

        private Builder(GetLabelTaskResultResponseBody model) {
            this.requestId = model.requestId;
            this.resultDataUrl = model.resultDataUrl;
            this.status = model.status;
            this.tokens = model.tokens;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultDataUrl.
         */
        public Builder resultDataUrl(String resultDataUrl) {
            this.resultDataUrl = resultDataUrl;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Tokens.
         */
        public Builder tokens(String tokens) {
            this.tokens = tokens;
            return this;
        }

        public GetLabelTaskResultResponseBody build() {
            return new GetLabelTaskResultResponseBody(this);
        } 

    } 

}
