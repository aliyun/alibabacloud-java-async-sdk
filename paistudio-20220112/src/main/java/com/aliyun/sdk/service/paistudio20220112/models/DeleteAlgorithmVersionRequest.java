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
 * {@link DeleteAlgorithmVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlgorithmVersionRequest</p>
 */
public class DeleteAlgorithmVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("AlgorithmId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithmId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("AlgorithmVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithmVersion;

    private DeleteAlgorithmVersionRequest(Builder builder) {
        super(builder);
        this.algorithmId = builder.algorithmId;
        this.algorithmVersion = builder.algorithmVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlgorithmVersionRequest create() {
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

    /**
     * @return algorithmVersion
     */
    public String getAlgorithmVersion() {
        return this.algorithmVersion;
    }

    public static final class Builder extends Request.Builder<DeleteAlgorithmVersionRequest, Builder> {
        private String algorithmId; 
        private String algorithmVersion; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlgorithmVersionRequest request) {
            super(request);
            this.algorithmId = request.algorithmId;
            this.algorithmVersion = request.algorithmVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>algo-xsldfvu1334</p>
         */
        public Builder algorithmId(String algorithmId) {
            this.putPathParameter("AlgorithmId", algorithmId);
            this.algorithmId = algorithmId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v0.0.1</p>
         */
        public Builder algorithmVersion(String algorithmVersion) {
            this.putPathParameter("AlgorithmVersion", algorithmVersion);
            this.algorithmVersion = algorithmVersion;
            return this;
        }

        @Override
        public DeleteAlgorithmVersionRequest build() {
            return new DeleteAlgorithmVersionRequest(this);
        } 

    } 

}
