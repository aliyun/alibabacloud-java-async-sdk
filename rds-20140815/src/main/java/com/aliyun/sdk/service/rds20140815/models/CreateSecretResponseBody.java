// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSecretResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSecretResponseBody</p>
 */
public class CreateSecretResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretArn")
    private String secretArn;

    @com.aliyun.core.annotation.NameInMap("SecretName")
    private String secretName;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateSecretResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.secretArn = builder.secretArn;
        this.secretName = builder.secretName;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecretResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secretArn
     */
    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private String secretArn; 
        private String secretName; 
        private Boolean success; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DF4961DD-16F5-5B24-BD4C-0C7788F7ADAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the credential for the created Data API account.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:rds:cn-hangzhou:1335786***:dbInstance/rm-bp1m7l3j63****</p>
         */
        public Builder secretArn(String secretArn) {
            this.secretArn = secretArn;
            return this;
        }

        /**
         * <p>The name of the credential.</p>
         * 
         * <strong>example:</strong>
         * <p>Foo</p>
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateSecretResponseBody build() {
            return new CreateSecretResponseBody(this);
        } 

    } 

}
