// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAlgorithmVersionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAlgorithmVersionResponseBody</p>
 */
public class UpdateAlgorithmVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlgorithmId")
    private String algorithmId;

    @com.aliyun.core.annotation.NameInMap("AlgorithmVersion")
    private String algorithmVersion;

    private UpdateAlgorithmVersionResponseBody(Builder builder) {
        this.algorithmId = builder.algorithmId;
        this.algorithmVersion = builder.algorithmVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlgorithmVersionResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String algorithmId; 
        private String algorithmVersion; 

        /**
         * AlgorithmId.
         */
        public Builder algorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }

        /**
         * AlgorithmVersion.
         */
        public Builder algorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
        }

        public UpdateAlgorithmVersionResponseBody build() {
            return new UpdateAlgorithmVersionResponseBody(this);
        } 

    } 

}
