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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tip.
         */
        public Builder tip(String tip) {
            this.tip = tip;
            return this;
        }

        /**
         * Url.
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
