// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20251013.models;

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
 * {@link ValidateUserTokenRequest} extends {@link RequestModel}
 *
 * <p>ValidateUserTokenRequest</p>
 */
public class ValidateUserTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthMessage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    private ValidateUserTokenRequest(Builder builder) {
        super(builder);
        this.authMessage = builder.authMessage;
        this.authType = builder.authType;
        this.DBClusterId = builder.DBClusterId;
        this.sourceRegionId = builder.sourceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateUserTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authMessage
     */
    public String getAuthMessage() {
        return this.authMessage;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public static final class Builder extends Request.Builder<ValidateUserTokenRequest, Builder> {
        private String authMessage; 
        private String authType; 
        private String DBClusterId; 
        private String sourceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ValidateUserTokenRequest request) {
            super(request);
            this.authMessage = request.authMessage;
            this.authType = request.authType;
            this.DBClusterId = request.DBClusterId;
            this.sourceRegionId = request.sourceRegionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yEtNjzuM21NVLVJTuL9Trw****</p>
         */
        public Builder authMessage(String authMessage) {
            this.putQueryParameter("AuthMessage", authMessage);
            this.authMessage = authMessage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>token</p>
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze454l20me07****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putQueryParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        @Override
        public ValidateUserTokenRequest build() {
            return new ValidateUserTokenRequest(this);
        } 

    } 

}
