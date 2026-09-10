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
 * {@link ListIntegrationPolicyCollectorsRequest} extends {@link RequestModel}
 *
 * <p>ListIntegrationPolicyCollectorsRequest</p>
 */
public class ListIntegrationPolicyCollectorsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("addonReleaseName")
    private String addonReleaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("collectorType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collectorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    private ListIntegrationPolicyCollectorsRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.addonReleaseName = builder.addonReleaseName;
        this.collectorType = builder.collectorType;
        this.language = builder.language;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationPolicyCollectorsRequest create() {
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
     * @return addonReleaseName
     */
    public String getAddonReleaseName() {
        return this.addonReleaseName;
    }

    /**
     * @return collectorType
     */
    public String getCollectorType() {
        return this.collectorType;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    public static final class Builder extends Request.Builder<ListIntegrationPolicyCollectorsRequest, Builder> {
        private String policyId; 
        private String addonReleaseName; 
        private String collectorType; 
        private String language; 

        private Builder() {
            super();
        } 

        private Builder(ListIntegrationPolicyCollectorsRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.addonReleaseName = request.addonReleaseName;
            this.collectorType = request.collectorType;
            this.language = request.language;
        } 

        /**
         * <p>The ID of the Integration Center policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>env-d95435164593aece55f9999ce45c</p>
         */
        public Builder policyId(String policyId) {
            this.putPathParameter("policyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The name of the add-on release.</p>
         * 
         * <strong>example:</strong>
         * <p>release-1234567</p>
         */
        public Builder addonReleaseName(String addonReleaseName) {
            this.putQueryParameter("addonReleaseName", addonReleaseName);
            this.addonReleaseName = addonReleaseName;
            return this;
        }

        /**
         * <p>The collector type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Exporter</p>
         */
        public Builder collectorType(String collectorType) {
            this.putQueryParameter("collectorType", collectorType);
            this.collectorType = collectorType;
            return this;
        }

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("language", language);
            this.language = language;
            return this;
        }

        @Override
        public ListIntegrationPolicyCollectorsRequest build() {
            return new ListIntegrationPolicyCollectorsRequest(this);
        } 

    } 

}
