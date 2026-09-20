// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link GenerateAlgorithmCustomizationScriptResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateAlgorithmCustomizationScriptResponseBody</p>
 */
public class GenerateAlgorithmCustomizationScriptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogId")
    private String logId;

    @com.aliyun.core.annotation.NameInMap("OssAddress")
    private String ossAddress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateAlgorithmCustomizationScriptResponseBody(Builder builder) {
        this.logId = builder.logId;
        this.ossAddress = builder.ossAddress;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAlgorithmCustomizationScriptResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logId
     */
    public String getLogId() {
        return this.logId;
    }

    /**
     * @return ossAddress
     */
    public String getOssAddress() {
        return this.ossAddress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String logId; 
        private String ossAddress; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenerateAlgorithmCustomizationScriptResponseBody model) {
            this.logId = model.logId;
            this.ossAddress = model.ossAddress;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The log ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder logId(String logId) {
            this.logId = logId;
            return this;
        }

        /**
         * <p>The OSS address of the generated package.</p>
         * 
         * <strong>example:</strong>
         * <p>oss:xxxx</p>
         */
        public Builder ossAddress(String ossAddress) {
            this.ossAddress = ossAddress;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6CF1E160-3F36-5E73-A170-C75504F05BBC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateAlgorithmCustomizationScriptResponseBody build() {
            return new GenerateAlgorithmCustomizationScriptResponseBody(this);
        } 

    } 

}
