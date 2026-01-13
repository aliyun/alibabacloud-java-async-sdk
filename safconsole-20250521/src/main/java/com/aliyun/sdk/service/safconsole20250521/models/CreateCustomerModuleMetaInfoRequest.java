// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link CreateCustomerModuleMetaInfoRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomerModuleMetaInfoRequest</p>
 */
public class CreateCustomerModuleMetaInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerModuleId")
    private Integer customerModuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureString")
    private String featureString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureTemplate")
    private String featureTemplate;

    private CreateCustomerModuleMetaInfoRequest(Builder builder) {
        super(builder);
        this.customerModuleId = builder.customerModuleId;
        this.featureString = builder.featureString;
        this.featureTemplate = builder.featureTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomerModuleMetaInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerModuleId
     */
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

    /**
     * @return featureString
     */
    public String getFeatureString() {
        return this.featureString;
    }

    /**
     * @return featureTemplate
     */
    public String getFeatureTemplate() {
        return this.featureTemplate;
    }

    public static final class Builder extends Request.Builder<CreateCustomerModuleMetaInfoRequest, Builder> {
        private Integer customerModuleId; 
        private String featureString; 
        private String featureTemplate; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomerModuleMetaInfoRequest request) {
            super(request);
            this.customerModuleId = request.customerModuleId;
            this.featureString = request.featureString;
            this.featureTemplate = request.featureTemplate;
        } 

        /**
         * <p>Customer model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder customerModuleId(Integer customerModuleId) {
            this.putQueryParameter("CustomerModuleId", customerModuleId);
            this.customerModuleId = customerModuleId;
            return this;
        }

        /**
         * <p>A string representation of List<Object>, where Object has the following structure:
         * {
         * &quot;mappingName&quot;: &quot;xxx&quot;
         * }</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;mappingName&quot;:&quot;f1&quot;,&quot;fieldName&quot;:&quot;saf_shanghai_new.f1&quot;,&quot;valueType&quot;:&quot;DOUBLE&quot;,&quot;defaultValue&quot;:&quot;&quot;}</p>
         */
        public Builder featureString(String featureString) {
            this.putQueryParameter("FeatureString", featureString);
            this.featureString = featureString;
            return this;
        }

        /**
         * <p>Version of the feature adopted.</p>
         * 
         * <strong>example:</strong>
         * <p>FINANCE_51</p>
         */
        public Builder featureTemplate(String featureTemplate) {
            this.putQueryParameter("FeatureTemplate", featureTemplate);
            this.featureTemplate = featureTemplate;
            return this;
        }

        @Override
        public CreateCustomerModuleMetaInfoRequest build() {
            return new CreateCustomerModuleMetaInfoRequest(this);
        } 

    } 

}
