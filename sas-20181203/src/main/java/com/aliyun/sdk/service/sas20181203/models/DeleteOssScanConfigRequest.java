// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DeleteOssScanConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteOssScanConfigRequest</p>
 */
public class DeleteOssScanConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    private DeleteOssScanConfigRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOssScanConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteOssScanConfigRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOssScanConfigRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>The configuration ID.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListOssScanConfig~~">ListOssScanConfig</a> operation to query configuration IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1589</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteOssScanConfigRequest build() {
            return new DeleteOssScanConfigRequest(this);
        } 

    } 

}
