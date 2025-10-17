// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link AttachApplicationPolarFSRequest} extends {@link RequestModel}
 *
 * <p>AttachApplicationPolarFSRequest</p>
 */
public class AttachApplicationPolarFSRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFSAccessKeyId")
    private String polarFSAccessKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFSAccessKeySecret")
    private String polarFSAccessKeySecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFSInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polarFSInstanceId;

    private AttachApplicationPolarFSRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.polarFSAccessKeyId = builder.polarFSAccessKeyId;
        this.polarFSAccessKeySecret = builder.polarFSAccessKeySecret;
        this.polarFSInstanceId = builder.polarFSInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachApplicationPolarFSRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return polarFSAccessKeyId
     */
    public String getPolarFSAccessKeyId() {
        return this.polarFSAccessKeyId;
    }

    /**
     * @return polarFSAccessKeySecret
     */
    public String getPolarFSAccessKeySecret() {
        return this.polarFSAccessKeySecret;
    }

    /**
     * @return polarFSInstanceId
     */
    public String getPolarFSInstanceId() {
        return this.polarFSInstanceId;
    }

    public static final class Builder extends Request.Builder<AttachApplicationPolarFSRequest, Builder> {
        private String applicationId; 
        private String polarFSAccessKeyId; 
        private String polarFSAccessKeySecret; 
        private String polarFSInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(AttachApplicationPolarFSRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.polarFSAccessKeyId = request.polarFSAccessKeyId;
            this.polarFSAccessKeySecret = request.polarFSAccessKeySecret;
            this.polarFSInstanceId = request.polarFSInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * PolarFSAccessKeyId.
         */
        public Builder polarFSAccessKeyId(String polarFSAccessKeyId) {
            this.putQueryParameter("PolarFSAccessKeyId", polarFSAccessKeyId);
            this.polarFSAccessKeyId = polarFSAccessKeyId;
            return this;
        }

        /**
         * PolarFSAccessKeySecret.
         */
        public Builder polarFSAccessKeySecret(String polarFSAccessKeySecret) {
            this.putQueryParameter("PolarFSAccessKeySecret", polarFSAccessKeySecret);
            this.polarFSAccessKeySecret = polarFSAccessKeySecret;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pcs-**************</p>
         */
        public Builder polarFSInstanceId(String polarFSInstanceId) {
            this.putQueryParameter("PolarFSInstanceId", polarFSInstanceId);
            this.polarFSInstanceId = polarFSInstanceId;
            return this;
        }

        @Override
        public AttachApplicationPolarFSRequest build() {
            return new AttachApplicationPolarFSRequest(this);
        } 

    } 

}
