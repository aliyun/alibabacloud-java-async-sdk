// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link ReleaseKmsInstanceRequest} extends {@link RequestModel}
 *
 * <p>ReleaseKmsInstanceRequest</p>
 */
public class ReleaseKmsInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceDeleteWithoutBackup")
    private String forceDeleteWithoutBackup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kmsInstanceId;

    private ReleaseKmsInstanceRequest(Builder builder) {
        super(builder);
        this.forceDeleteWithoutBackup = builder.forceDeleteWithoutBackup;
        this.kmsInstanceId = builder.kmsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseKmsInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forceDeleteWithoutBackup
     */
    public String getForceDeleteWithoutBackup() {
        return this.forceDeleteWithoutBackup;
    }

    /**
     * @return kmsInstanceId
     */
    public String getKmsInstanceId() {
        return this.kmsInstanceId;
    }

    public static final class Builder extends Request.Builder<ReleaseKmsInstanceRequest, Builder> {
        private String forceDeleteWithoutBackup; 
        private String kmsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseKmsInstanceRequest request) {
            super(request);
            this.forceDeleteWithoutBackup = request.forceDeleteWithoutBackup;
            this.kmsInstanceId = request.kmsInstanceId;
        } 

        /**
         * <p>Specifies whether to forcibly release the KMS instance if it has not been backed up.</p>
         * <ul>
         * <li><p>true: forcibly releases the instance.</p>
         * </li>
         * <li><p>false (default): does not release the instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceDeleteWithoutBackup(String forceDeleteWithoutBackup) {
            this.putQueryParameter("ForceDeleteWithoutBackup", forceDeleteWithoutBackup);
            this.forceDeleteWithoutBackup = forceDeleteWithoutBackup;
            return this;
        }

        /**
         * <p>The ID of the KMS instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kst-hzz6****</p>
         */
        public Builder kmsInstanceId(String kmsInstanceId) {
            this.putQueryParameter("KmsInstanceId", kmsInstanceId);
            this.kmsInstanceId = kmsInstanceId;
            return this;
        }

        @Override
        public ReleaseKmsInstanceRequest build() {
            return new ReleaseKmsInstanceRequest(this);
        } 

    } 

}
