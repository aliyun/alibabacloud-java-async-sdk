// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link GenerateDefaultServiceTestConfigRequest} extends {@link RequestModel}
 *
 * <p>GenerateDefaultServiceTestConfigRequest</p>
 */
public class GenerateDefaultServiceTestConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    private GenerateDefaultServiceTestConfigRequest(Builder builder) {
        super(builder);
        this.serviceId = builder.serviceId;
        this.serviceVersion = builder.serviceVersion;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDefaultServiceTestConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<GenerateDefaultServiceTestConfigRequest, Builder> {
        private String serviceId; 
        private String serviceVersion; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(GenerateDefaultServiceTestConfigRequest request) {
            super(request);
            this.serviceId = request.serviceId;
            this.serviceVersion = request.serviceVersion;
            this.templateName = request.templateName;
        } 

        /**
         * <p>The service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service-41ad58439b4b4bf8ae73</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The service version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>draft</p>
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-1</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public GenerateDefaultServiceTestConfigRequest build() {
            return new GenerateDefaultServiceTestConfigRequest(this);
        } 

    } 

}
