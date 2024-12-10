// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAlgorithmVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlgorithmVersionRequest</p>
 */
public class UpdateAlgorithmVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("AlgorithmId")
    private String algorithmId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("AlgorithmVersion")
    private String algorithmVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlgorithmSpec")
    private AlgorithmSpec algorithmSpec;

    private UpdateAlgorithmVersionRequest(Builder builder) {
        super(builder);
        this.algorithmId = builder.algorithmId;
        this.algorithmVersion = builder.algorithmVersion;
        this.algorithmSpec = builder.algorithmSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlgorithmVersionRequest create() {
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

    /**
     * @return algorithmSpec
     */
    public AlgorithmSpec getAlgorithmSpec() {
        return this.algorithmSpec;
    }

    public static final class Builder extends Request.Builder<UpdateAlgorithmVersionRequest, Builder> {
        private String algorithmId; 
        private String algorithmVersion; 
        private AlgorithmSpec algorithmSpec; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlgorithmVersionRequest request) {
            super(request);
            this.algorithmId = request.algorithmId;
            this.algorithmVersion = request.algorithmVersion;
            this.algorithmSpec = request.algorithmSpec;
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

        /**
         * AlgorithmSpec.
         */
        public Builder algorithmSpec(AlgorithmSpec algorithmSpec) {
            String algorithmSpecShrink = shrink(algorithmSpec, "AlgorithmSpec", "json");
            this.putBodyParameter("AlgorithmSpec", algorithmSpecShrink);
            this.algorithmSpec = algorithmSpec;
            return this;
        }

        @Override
        public UpdateAlgorithmVersionRequest build() {
            return new UpdateAlgorithmVersionRequest(this);
        } 

    } 

}
