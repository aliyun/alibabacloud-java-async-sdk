// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link AddCloudAccessRequest} extends {@link RequestModel}
 *
 * <p>AddCloudAccessRequest</p>
 */
public class AddCloudAccessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudName")
    private String cloudName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretId")
    private String secretId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretKey")
    private String secretKey;

    private AddCloudAccessRequest(Builder builder) {
        super(builder);
        this.cloudName = builder.cloudName;
        this.secretId = builder.secretId;
        this.secretKey = builder.secretKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCloudAccessRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudName
     */
    public String getCloudName() {
        return this.cloudName;
    }

    /**
     * @return secretId
     */
    public String getSecretId() {
        return this.secretId;
    }

    /**
     * @return secretKey
     */
    public String getSecretKey() {
        return this.secretKey;
    }

    public static final class Builder extends Request.Builder<AddCloudAccessRequest, Builder> {
        private String cloudName; 
        private String secretId; 
        private String secretKey; 

        private Builder() {
            super();
        } 

        private Builder(AddCloudAccessRequest request) {
            super(request);
            this.cloudName = request.cloudName;
            this.secretId = request.secretId;
            this.secretKey = request.secretKey;
        } 

        /**
         * <p>The cloud service provider. Currently, only Tencent Cloud (<strong>Tencent</strong>) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Tencent</p>
         */
        public Builder cloudName(String cloudName) {
            this.putQueryParameter("CloudName", cloudName);
            this.cloudName = cloudName;
            return this;
        }

        /**
         * <p>The secret ID for cloud resource access.</p>
         * 
         * <strong>example:</strong>
         * <p>xcxx</p>
         */
        public Builder secretId(String secretId) {
            this.putQueryParameter("SecretId", secretId);
            this.secretId = secretId;
            return this;
        }

        /**
         * <p>The secret of the access key. Valid values:</p>
         * <ol>
         * <li>If AkType is set to primary:</li>
         * </ol>
         * <ul>
         * <li><strong>Tencent</strong>: the SecretAccessKey of the primary account.</li>
         * <li><strong>HUAWEICLOUD</strong>: the SecretAccessKey of the primary account.</li>
         * <li><strong>Azure</strong>: the ClientSecret.</li>
         * <li><strong>AWS</strong>: the SecretAccessKey of the primary account.</li>
         * </ul>
         * <ol start="2">
         * <li>If AkType is set to sub:</li>
         * </ol>
         * <ul>
         * <li><strong>Tencent</strong>: the SecretAccessKey of the sub-account.</li>
         * <li><strong>HUAWEICLOUD</strong>: the SecretAccessKey of the sub-account.</li>
         * <li><strong>Azure</strong>: the ClientSecret.</li>
         * <li><strong>AWS</strong>: the SecretAccessKey of the sub-account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder secretKey(String secretKey) {
            this.putQueryParameter("SecretKey", secretKey);
            this.secretKey = secretKey;
            return this;
        }

        @Override
        public AddCloudAccessRequest build() {
            return new AddCloudAccessRequest(this);
        } 

    } 

}
