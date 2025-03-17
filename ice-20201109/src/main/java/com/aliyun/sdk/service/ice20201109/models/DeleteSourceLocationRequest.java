// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link DeleteSourceLocationRequest} extends {@link RequestModel}
 *
 * <p>DeleteSourceLocationRequest</p>
 */
public class DeleteSourceLocationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SoftDelete")
    private Boolean softDelete;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceLocationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceLocationName;

    private DeleteSourceLocationRequest(Builder builder) {
        super(builder);
        this.softDelete = builder.softDelete;
        this.sourceLocationName = builder.sourceLocationName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSourceLocationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return softDelete
     */
    public Boolean getSoftDelete() {
        return this.softDelete;
    }

    /**
     * @return sourceLocationName
     */
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public static final class Builder extends Request.Builder<DeleteSourceLocationRequest, Builder> {
        private Boolean softDelete; 
        private String sourceLocationName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSourceLocationRequest request) {
            super(request);
            this.softDelete = request.softDelete;
            this.sourceLocationName = request.sourceLocationName;
        } 

        /**
         * <p>Specifies whether to use delete markers.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder softDelete(Boolean softDelete) {
            this.putQueryParameter("SoftDelete", softDelete);
            this.softDelete = softDelete;
            return this;
        }

        /**
         * <p>The name of the source location.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySourceLocation</p>
         */
        public Builder sourceLocationName(String sourceLocationName) {
            this.putQueryParameter("SourceLocationName", sourceLocationName);
            this.sourceLocationName = sourceLocationName;
            return this;
        }

        @Override
        public DeleteSourceLocationRequest build() {
            return new DeleteSourceLocationRequest(this);
        } 

    } 

}
