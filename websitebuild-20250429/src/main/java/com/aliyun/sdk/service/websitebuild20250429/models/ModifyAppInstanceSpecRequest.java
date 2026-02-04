// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link ModifyAppInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppInstanceSpecRequest</p>
 */
public class ModifyAppInstanceSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    private String applicationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployArea")
    private String deployArea;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private String siteVersion;

    private ModifyAppInstanceSpecRequest(Builder builder) {
        super(builder);
        this.applicationType = builder.applicationType;
        this.bizId = builder.bizId;
        this.clientToken = builder.clientToken;
        this.deployArea = builder.deployArea;
        this.extend = builder.extend;
        this.paymentType = builder.paymentType;
        this.siteVersion = builder.siteVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppInstanceSpecRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationType
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deployArea
     */
    public String getDeployArea() {
        return this.deployArea;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return siteVersion
     */
    public String getSiteVersion() {
        return this.siteVersion;
    }

    public static final class Builder extends Request.Builder<ModifyAppInstanceSpecRequest, Builder> {
        private String applicationType; 
        private String bizId; 
        private String clientToken; 
        private String deployArea; 
        private String extend; 
        private String paymentType; 
        private String siteVersion; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAppInstanceSpecRequest request) {
            super(request);
            this.applicationType = request.applicationType;
            this.bizId = request.bizId;
            this.clientToken = request.clientToken;
            this.deployArea = request.deployArea;
            this.extend = request.extend;
            this.paymentType = request.paymentType;
            this.siteVersion = request.siteVersion;
        } 

        /**
         * <p>Application type</p>
         * 
         * <strong>example:</strong>
         * <p>Application</p>
         */
        public Builder applicationType(String applicationType) {
            this.putQueryParameter("ApplicationType", applicationType);
            this.applicationType = applicationType;
            return this;
        }

        /**
         * <p>Business ID</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>Ensures idempotence of requests. Generate a unique value from your client to ensure it is unique across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>2108341e17661121129745384e79f9</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Deployment area</p>
         * 
         * <strong>example:</strong>
         * <p>HongKong</p>
         */
        public Builder deployArea(String deployArea) {
            this.putQueryParameter("DeployArea", deployArea);
            this.deployArea = deployArea;
            return this;
        }

        /**
         * <p>Extended information</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;deliveryNodeName&quot;:&quot;网站验收&quot;,&quot;deliveryNodeStatus&quot;:&quot;Reject&quot;,&quot;deliveryOperatorRole&quot;:&quot;Customer&quot;}</p>
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * <p>Payment type</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>Site version</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder siteVersion(String siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        @Override
        public ModifyAppInstanceSpecRequest build() {
            return new ModifyAppInstanceSpecRequest(this);
        } 

    } 

}
