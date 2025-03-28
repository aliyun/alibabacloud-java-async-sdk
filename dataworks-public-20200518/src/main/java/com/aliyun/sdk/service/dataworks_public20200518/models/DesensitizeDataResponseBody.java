// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link DesensitizeDataResponseBody} extends {@link TeaModel}
 *
 * <p>DesensitizeDataResponseBody</p>
 */
public class DesensitizeDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DesensitizeData")
    private String desensitizeData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DesensitizeDataResponseBody(Builder builder) {
        this.desensitizeData = builder.desensitizeData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DesensitizeDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desensitizeData
     */
    public String getDesensitizeData() {
        return this.desensitizeData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String desensitizeData; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DesensitizeDataResponseBody model) {
            this.desensitizeData = model.desensitizeData;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned after masking.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;desensData&quot;: &quot;<strong>198807120510</strong>&quot;   }</p>
         */
        public Builder desensitizeData(String desensitizeData) {
            this.desensitizeData = desensitizeData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BCA321BA-46C5-40E9-8A08-6******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DesensitizeDataResponseBody build() {
            return new DesensitizeDataResponseBody(this);
        } 

    } 

}
