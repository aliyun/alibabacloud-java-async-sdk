// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ModifyQosEntriesRequest} extends {@link RequestModel}
 *
 * <p>ModifyQosEntriesRequest</p>
 */
public class ModifyQosEntriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthAndroidId")
    private java.util.List<String> authAndroidId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthDesktopGroupId")
    private java.util.List<String> authDesktopGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthDesktopId")
    private java.util.List<String> authDesktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qosRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RevokeAndroidId")
    private java.util.List<String> revokeAndroidId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RevokeDesktopGroupId")
    private java.util.List<String> revokeDesktopGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RevokeDesktopId")
    private java.util.List<String> revokeDesktopId;

    private ModifyQosEntriesRequest(Builder builder) {
        super(builder);
        this.authAndroidId = builder.authAndroidId;
        this.authDesktopGroupId = builder.authDesktopGroupId;
        this.authDesktopId = builder.authDesktopId;
        this.qosRuleId = builder.qosRuleId;
        this.revokeAndroidId = builder.revokeAndroidId;
        this.revokeDesktopGroupId = builder.revokeDesktopGroupId;
        this.revokeDesktopId = builder.revokeDesktopId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyQosEntriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authAndroidId
     */
    public java.util.List<String> getAuthAndroidId() {
        return this.authAndroidId;
    }

    /**
     * @return authDesktopGroupId
     */
    public java.util.List<String> getAuthDesktopGroupId() {
        return this.authDesktopGroupId;
    }

    /**
     * @return authDesktopId
     */
    public java.util.List<String> getAuthDesktopId() {
        return this.authDesktopId;
    }

    /**
     * @return qosRuleId
     */
    public String getQosRuleId() {
        return this.qosRuleId;
    }

    /**
     * @return revokeAndroidId
     */
    public java.util.List<String> getRevokeAndroidId() {
        return this.revokeAndroidId;
    }

    /**
     * @return revokeDesktopGroupId
     */
    public java.util.List<String> getRevokeDesktopGroupId() {
        return this.revokeDesktopGroupId;
    }

    /**
     * @return revokeDesktopId
     */
    public java.util.List<String> getRevokeDesktopId() {
        return this.revokeDesktopId;
    }

    public static final class Builder extends Request.Builder<ModifyQosEntriesRequest, Builder> {
        private java.util.List<String> authAndroidId; 
        private java.util.List<String> authDesktopGroupId; 
        private java.util.List<String> authDesktopId; 
        private String qosRuleId; 
        private java.util.List<String> revokeAndroidId; 
        private java.util.List<String> revokeDesktopGroupId; 
        private java.util.List<String> revokeDesktopId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyQosEntriesRequest request) {
            super(request);
            this.authAndroidId = request.authAndroidId;
            this.authDesktopGroupId = request.authDesktopGroupId;
            this.authDesktopId = request.authDesktopId;
            this.qosRuleId = request.qosRuleId;
            this.revokeAndroidId = request.revokeAndroidId;
            this.revokeDesktopGroupId = request.revokeDesktopGroupId;
            this.revokeDesktopId = request.revokeDesktopId;
        } 

        /**
         * AuthAndroidId.
         */
        public Builder authAndroidId(java.util.List<String> authAndroidId) {
            this.putQueryParameter("AuthAndroidId", authAndroidId);
            this.authAndroidId = authAndroidId;
            return this;
        }

        /**
         * AuthDesktopGroupId.
         */
        public Builder authDesktopGroupId(java.util.List<String> authDesktopGroupId) {
            this.putQueryParameter("AuthDesktopGroupId", authDesktopGroupId);
            this.authDesktopGroupId = authDesktopGroupId;
            return this;
        }

        /**
         * AuthDesktopId.
         */
        public Builder authDesktopId(java.util.List<String> authDesktopId) {
            this.putQueryParameter("AuthDesktopId", authDesktopId);
            this.authDesktopId = authDesktopId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-5605u0gelk200****</p>
         */
        public Builder qosRuleId(String qosRuleId) {
            this.putQueryParameter("QosRuleId", qosRuleId);
            this.qosRuleId = qosRuleId;
            return this;
        }

        /**
         * RevokeAndroidId.
         */
        public Builder revokeAndroidId(java.util.List<String> revokeAndroidId) {
            this.putQueryParameter("RevokeAndroidId", revokeAndroidId);
            this.revokeAndroidId = revokeAndroidId;
            return this;
        }

        /**
         * RevokeDesktopGroupId.
         */
        public Builder revokeDesktopGroupId(java.util.List<String> revokeDesktopGroupId) {
            this.putQueryParameter("RevokeDesktopGroupId", revokeDesktopGroupId);
            this.revokeDesktopGroupId = revokeDesktopGroupId;
            return this;
        }

        /**
         * RevokeDesktopId.
         */
        public Builder revokeDesktopId(java.util.List<String> revokeDesktopId) {
            this.putQueryParameter("RevokeDesktopId", revokeDesktopId);
            this.revokeDesktopId = revokeDesktopId;
            return this;
        }

        @Override
        public ModifyQosEntriesRequest build() {
            return new ModifyQosEntriesRequest(this);
        } 

    } 

}
