// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlgorithmVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlgorithmVersionRequest</p>
 */
public class DeleteAlgorithmVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("AlgorithmId")
    private String algorithmId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("AlgorithmVersion")
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
         * AlgorithmId.
         */
        public Builder algorithmId(String algorithmId) {
            this.putPathParameter("AlgorithmId", algorithmId);
            this.algorithmId = algorithmId;
            return this;
        }

        /**
         * AlgorithmVersion.
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
