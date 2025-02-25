// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link DeleteAlgorithmRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlgorithmRequest</p>
 */
public class DeleteAlgorithmRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("AlgorithmId")
    private String algorithmId;

    private DeleteAlgorithmRequest(Builder builder) {
        super(builder);
        this.algorithmId = builder.algorithmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlgorithmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmId
     */
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public static final class Builder extends Request.Builder<DeleteAlgorithmRequest, Builder> {
        private String algorithmId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlgorithmRequest request) {
            super(request);
            this.algorithmId = request.algorithmId;
        } 

        /**
         * AlgorithmId.
         */
        public Builder algorithmId(String algorithmId) {
            this.putPathParameter("AlgorithmId", algorithmId);
            this.algorithmId = algorithmId;
            return this;
        }

        @Override
        public DeleteAlgorithmRequest build() {
            return new DeleteAlgorithmRequest(this);
        } 

    } 

}
