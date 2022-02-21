// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePolicyVersionRequest} extends {@link RequestModel}
 *
 * <p>CreatePolicyVersionRequest</p>
 */
public class CreatePolicyVersionRequest extends Request {
    @Query
    @NameInMap("PolicyDocument")
    private String policyDocument;

    @Query
    @NameInMap("PolicyName")
    private String policyName;

    @Query
    @NameInMap("RotateStrategy")
    private String rotateStrategy;

    @Query
    @NameInMap("SetAsDefault")
    private Boolean setAsDefault;

    private CreatePolicyVersionRequest(Builder builder) {
        super(builder);
        this.policyDocument = builder.policyDocument;
        this.policyName = builder.policyName;
        this.rotateStrategy = builder.rotateStrategy;
        this.setAsDefault = builder.setAsDefault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyDocument
     */
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return rotateStrategy
     */
    public String getRotateStrategy() {
        return this.rotateStrategy;
    }

    /**
     * @return setAsDefault
     */
    public Boolean getSetAsDefault() {
        return this.setAsDefault;
    }

    public static final class Builder extends Request.Builder<CreatePolicyVersionRequest, Builder> {
        private String policyDocument; 
        private String policyName; 
        private String rotateStrategy; 
        private Boolean setAsDefault; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolicyVersionRequest response) {
            super(response);
            this.policyDocument = response.policyDocument;
            this.policyName = response.policyName;
            this.rotateStrategy = response.rotateStrategy;
            this.setAsDefault = response.setAsDefault;
        } 

        /**
         * PolicyDocument.
         */
        public Builder policyDocument(String policyDocument) {
            this.putQueryParameter("PolicyDocument", policyDocument);
            this.policyDocument = policyDocument;
            return this;
        }

        /**
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * RotateStrategy.
         */
        public Builder rotateStrategy(String rotateStrategy) {
            this.putQueryParameter("RotateStrategy", rotateStrategy);
            this.rotateStrategy = rotateStrategy;
            return this;
        }

        /**
         * SetAsDefault.
         */
        public Builder setAsDefault(Boolean setAsDefault) {
            this.putQueryParameter("SetAsDefault", setAsDefault);
            this.setAsDefault = setAsDefault;
            return this;
        }

        @Override
        public CreatePolicyVersionRequest build() {
            return new CreatePolicyVersionRequest(this);
        } 

    } 

}
