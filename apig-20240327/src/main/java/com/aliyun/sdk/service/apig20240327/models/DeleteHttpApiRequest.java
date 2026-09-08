// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link DeleteHttpApiRequest} extends {@link RequestModel}
 *
 * <p>DeleteHttpApiRequest</p>
 */
public class DeleteHttpApiRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpApiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private DeleteHttpApiRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHttpApiRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<DeleteHttpApiRequest, Builder> {
        private String httpApiId; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHttpApiRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.dryRun = request.dryRun;
        } 

        /**
         * <p>The ID of the HTTP API to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run. If set to true, all synchronous validations identical to an actual deletion are executed (including admission checks such as whether a published API cannot be deleted), but the API is not deleted, no associated configurations are cleaned up, and no side effects are produced. If this parameter is not specified or is set to false, the behavior is the same as the existing version.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public DeleteHttpApiRequest build() {
            return new DeleteHttpApiRequest(this);
        } 

    } 

}
