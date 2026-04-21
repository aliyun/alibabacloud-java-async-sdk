// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CreateAutoDisposeConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateAutoDisposeConfigRequest</p>
 */
public class CreateAutoDisposeConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoDecisionStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String autoDecisionStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    private CreateAutoDisposeConfigRequest(Builder builder) {
        super(builder);
        this.autoDecisionStatus = builder.autoDecisionStatus;
        this.lang = builder.lang;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAutoDisposeConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoDecisionStatus
     */
    public String getAutoDecisionStatus() {
        return this.autoDecisionStatus;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<CreateAutoDisposeConfigRequest, Builder> {
        private String autoDecisionStatus; 
        private String lang; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(CreateAutoDisposeConfigRequest request) {
            super(request);
            this.autoDecisionStatus = request.autoDecisionStatus;
            this.lang = request.lang;
            this.productCode = request.productCode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder autoDecisionStatus(String autoDecisionStatus) {
            this.putBodyParameter("AutoDecisionStatus", autoDecisionStatus);
            this.autoDecisionStatus = autoDecisionStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public CreateAutoDisposeConfigRequest build() {
            return new CreateAutoDisposeConfigRequest(this);
        } 

    } 

}
