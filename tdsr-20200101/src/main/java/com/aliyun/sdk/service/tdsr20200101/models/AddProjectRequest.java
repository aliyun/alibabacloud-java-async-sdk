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
 * {@link AddProjectRequest} extends {@link RequestModel}
 *
 * <p>AddProjectRequest</p>
 */
public class AddProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessId")
    private Long businessId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private AddProjectRequest(Builder builder) {
        super(builder);
        this.businessId = builder.businessId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessId
     */
    public Long getBusinessId() {
        return this.businessId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<AddProjectRequest, Builder> {
        private Long businessId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(AddProjectRequest request) {
            super(request);
            this.businessId = request.businessId;
            this.name = request.name;
        } 

        /**
         * BusinessId.
         */
        public Builder businessId(Long businessId) {
            this.putQueryParameter("BusinessId", businessId);
            this.businessId = businessId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public AddProjectRequest build() {
            return new AddProjectRequest(this);
        } 

    } 

}
