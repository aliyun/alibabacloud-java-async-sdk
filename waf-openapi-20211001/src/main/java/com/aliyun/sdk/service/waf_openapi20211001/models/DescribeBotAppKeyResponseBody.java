// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeBotAppKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBotAppKeyResponseBody</p>
 */
public class DescribeBotAppKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBotAppKeyResponseBody(Builder builder) {
        this.appKey = builder.appKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBotAppKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String appKey; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeBotAppKeyResponseBody model) {
            this.appKey = model.appKey;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The AppKey for bot management.</p>
         * 
         * <strong>example:</strong>
         * <p>N1Kiv3AGZm******</p>
         */
        public Builder appKey(String appKey) {
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0C4ADFD4-5B7D-591D-A607-A45C*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBotAppKeyResponseBody build() {
            return new DescribeBotAppKeyResponseBody(this);
        } 

    } 

}
