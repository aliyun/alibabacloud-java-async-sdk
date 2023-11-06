// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRemediationsRequest} extends {@link RequestModel}
 *
 * <p>DeleteRemediationsRequest</p>
 */
public class DeleteRemediationsRequest extends Request {
    @Body
    @NameInMap("RemediationIds")
    @Validation(required = true)
    private String remediationIds;

    private DeleteRemediationsRequest(Builder builder) {
        super(builder);
        this.remediationIds = builder.remediationIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRemediationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return remediationIds
     */
    public String getRemediationIds() {
        return this.remediationIds;
    }

    public static final class Builder extends Request.Builder<DeleteRemediationsRequest, Builder> {
        private String remediationIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRemediationsRequest request) {
            super(request);
            this.remediationIds = request.remediationIds;
        } 

        /**
         * The ID of the remediation template. Separate multiple remediation template IDs with commas (,).
         * <p>
         * 
         * For more information about how to obtain the ID of a remediation template, see [ListRemediations](~~270772~~).
         */
        public Builder remediationIds(String remediationIds) {
            this.putBodyParameter("RemediationIds", remediationIds);
            this.remediationIds = remediationIds;
            return this;
        }

        @Override
        public DeleteRemediationsRequest build() {
            return new DeleteRemediationsRequest(this);
        } 

    } 

}
