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
 * {@link DependLibraryRequest} extends {@link RequestModel}
 *
 * <p>DependLibraryRequest</p>
 */
public class DependLibraryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    private DependLibraryRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.companyId = builder.companyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DependLibraryRequest create() {
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

    public static final class Builder extends Request.Builder<DependLibraryRequest, Builder> {
        private Long id; 
        private Long companyId; 

        private Builder() {
            super();
        } 

        private Builder(DependLibraryRequest request) {
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
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.putQueryParameter("companyId", companyId);
            this.companyId = companyId;
            return this;
        }

        @Override
        public DependLibraryRequest build() {
            return new DependLibraryRequest(this);
        } 

    } 

}
