// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DataAgentApplicationAgreement} extends {@link TeaModel}
 *
 * <p>DataAgentApplicationAgreement</p>
 */
public class DataAgentApplicationAgreement extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExpiresAt")
    private String expiresAt;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("SignedAt")
    private String signedAt;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private DataAgentApplicationAgreement(Builder builder) {
        this.expiresAt = builder.expiresAt;
        this.regionId = builder.regionId;
        this.signedAt = builder.signedAt;
        this.status = builder.status;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataAgentApplicationAgreement create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expiresAt
     */
    public String getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return signedAt
     */
    public String getSignedAt() {
        return this.signedAt;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String expiresAt; 
        private String regionId; 
        private String signedAt; 
        private String status; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(DataAgentApplicationAgreement model) {
            this.expiresAt = model.expiresAt;
            this.regionId = model.regionId;
            this.signedAt = model.signedAt;
            this.status = model.status;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The expiration time of the agreement in ISO 8601 UTC string format. This field is omitted if the agreement is unsigned. The agreement expires when this time is reached. The default validity period is 10 calendar years from the signing date.</p>
         * 
         * <strong>example:</strong>
         * <p>2036-11-23T08:00:00Z</p>
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * <p>The region of the workspace to which the agreement belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The signing time in ISO 8601 UTC string format. This field is omitted if the agreement is unsigned. Repeated signing within the validity period retains the original time, and re-signing after expiration updates the time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-23T08:00:00Z</p>
         */
        public Builder signedAt(String signedAt) {
            this.signedAt = signedAt;
            return this;
        }

        /**
         * <p>The agreement status. Valid values: NOT_SIGNED (unsigned), EXPIRED (expired), and SIGNED (signed and valid). Both NOT_SIGNED and EXPIRED are business statuses returned upon a successful query.</p>
         * 
         * <strong>example:</strong>
         * <p>SIGNED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The stable identifier of the workspace to which the agreement belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>62q1xxxxxxxxxxxxxxxxxxx0</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public DataAgentApplicationAgreement build() {
            return new DataAgentApplicationAgreement(this);
        } 

    } 

}
