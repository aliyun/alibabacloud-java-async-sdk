// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

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
 * {@link CreateUploadPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadPolicyRequest</p>
 */
public class CreateUploadPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Option")
    @com.aliyun.core.annotation.Validation(required = true)
    private String option;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateUploadPolicyRequest(Builder builder) {
        super(builder);
        this.option = builder.option;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return option
     */
    public String getOption() {
        return this.option;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateUploadPolicyRequest, Builder> {
        private String option; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateUploadPolicyRequest request) {
            super(request);
            this.option = request.option;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder option(String option) {
            this.putQueryParameter("Option", option);
            this.option = option;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>scene</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateUploadPolicyRequest build() {
            return new CreateUploadPolicyRequest(this);
        } 

    } 

}
