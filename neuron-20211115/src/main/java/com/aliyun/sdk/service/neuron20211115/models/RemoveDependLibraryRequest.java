// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link RemoveDependLibraryRequest} extends {@link RequestModel}
 *
 * <p>RemoveDependLibraryRequest</p>
 */
public class RemoveDependLibraryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("companyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long companyId;

    private RemoveDependLibraryRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.companyId = builder.companyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveDependLibraryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    public static final class Builder extends Request.Builder<RemoveDependLibraryRequest, Builder> {
        private Long id; 
        private Long companyId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveDependLibraryRequest request) {
            super(request);
            this.id = request.id;
            this.companyId = request.companyId;
        } 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder companyId(Long companyId) {
            this.putQueryParameter("companyId", companyId);
            this.companyId = companyId;
            return this;
        }

        @Override
        public RemoveDependLibraryRequest build() {
            return new RemoveDependLibraryRequest(this);
        } 

    } 

}
