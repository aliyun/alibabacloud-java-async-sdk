// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link DeleteStackRequest} extends {@link RequestModel}
 *
 * <p>DeleteStackRequest</p>
 */
public class DeleteStackRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("stackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cleanResources")
    private Boolean cleanResources;

    private DeleteStackRequest(Builder builder) {
        super(builder);
        this.stackId = builder.stackId;
        this.cleanResources = builder.cleanResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteStackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return cleanResources
     */
    public Boolean getCleanResources() {
        return this.cleanResources;
    }

    public static final class Builder extends Request.Builder<DeleteStackRequest, Builder> {
        private String stackId; 
        private Boolean cleanResources; 

        private Builder() {
            super();
        } 

        private Builder(DeleteStackRequest request) {
            super(request);
            this.stackId = request.stackId;
            this.cleanResources = request.cleanResources;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>stack-as1d4vld898ppnqbxxxxx</p>
         */
        public Builder stackId(String stackId) {
            this.putPathParameter("stackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * cleanResources.
         */
        public Builder cleanResources(Boolean cleanResources) {
            this.putQueryParameter("cleanResources", cleanResources);
            this.cleanResources = cleanResources;
            return this;
        }

        @Override
        public DeleteStackRequest build() {
            return new DeleteStackRequest(this);
        } 

    } 

}
