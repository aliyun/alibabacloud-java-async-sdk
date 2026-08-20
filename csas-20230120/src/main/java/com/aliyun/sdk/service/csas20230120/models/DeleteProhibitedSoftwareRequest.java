// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link DeleteProhibitedSoftwareRequest} extends {@link RequestModel}
 *
 * <p>DeleteProhibitedSoftwareRequest</p>
 */
public class DeleteProhibitedSoftwareRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SoftwareIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> softwareIds;

    private DeleteProhibitedSoftwareRequest(Builder builder) {
        super(builder);
        this.softwareIds = builder.softwareIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProhibitedSoftwareRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return softwareIds
     */
    public java.util.List<String> getSoftwareIds() {
        return this.softwareIds;
    }

    public static final class Builder extends Request.Builder<DeleteProhibitedSoftwareRequest, Builder> {
        private java.util.List<String> softwareIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProhibitedSoftwareRequest request) {
            super(request);
            this.softwareIds = request.softwareIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder softwareIds(java.util.List<String> softwareIds) {
            this.putBodyParameter("SoftwareIds", softwareIds);
            this.softwareIds = softwareIds;
            return this;
        }

        @Override
        public DeleteProhibitedSoftwareRequest build() {
            return new DeleteProhibitedSoftwareRequest(this);
        } 

    } 

}
