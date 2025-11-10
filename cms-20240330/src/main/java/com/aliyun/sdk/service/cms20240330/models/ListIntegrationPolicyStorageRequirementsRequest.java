// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListIntegrationPolicyStorageRequirementsRequest} extends {@link RequestModel}
 *
 * <p>ListIntegrationPolicyStorageRequirementsRequest</p>
 */
public class ListIntegrationPolicyStorageRequirementsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("addonName")
    private String addonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("addonReleaseName")
    private String addonReleaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("storageType")
    private String storageType;

    private ListIntegrationPolicyStorageRequirementsRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.addonName = builder.addonName;
        this.addonReleaseName = builder.addonReleaseName;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationPolicyStorageRequirementsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return addonName
     */
    public String getAddonName() {
        return this.addonName;
    }

    /**
     * @return addonReleaseName
     */
    public String getAddonReleaseName() {
        return this.addonReleaseName;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<ListIntegrationPolicyStorageRequirementsRequest, Builder> {
        private String policyId; 
        private String addonName; 
        private String addonReleaseName; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(ListIntegrationPolicyStorageRequirementsRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.addonName = request.addonName;
            this.addonReleaseName = request.addonReleaseName;
            this.storageType = request.storageType;
        } 

        /**
         * <p>Access Center Policy ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-ac38a7cb02d14ff48bc9f97d0a75063e</p>
         */
        public Builder policyId(String policyId) {
            this.putPathParameter("policyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>Addon Release Name</p>
         * 
         * <strong>example:</strong>
         * <p>release-1234357</p>
         */
        public Builder addonName(String addonName) {
            this.putQueryParameter("addonName", addonName);
            this.addonName = addonName;
            return this;
        }

        /**
         * <p>Name of AddonRelease.</p>
         * 
         * <strong>example:</strong>
         * <p>kafka-17201012937917</p>
         */
        public Builder addonReleaseName(String addonReleaseName) {
            this.putQueryParameter("addonReleaseName", addonReleaseName);
            this.addonReleaseName = addonReleaseName;
            return this;
        }

        /**
         * <p>Storage Type, LogStore/Prometheus/TraceStore/EventStore/EntityStore.</p>
         * 
         * <strong>example:</strong>
         * <p>LogStore</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("storageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public ListIntegrationPolicyStorageRequirementsRequest build() {
            return new ListIntegrationPolicyStorageRequirementsRequest(this);
        } 

    } 

}
