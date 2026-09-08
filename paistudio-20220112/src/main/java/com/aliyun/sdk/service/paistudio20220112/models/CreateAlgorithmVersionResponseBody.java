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
 * {@link CreateAlgorithmVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAlgorithmVersionResponseBody</p>
 */
public class CreateAlgorithmVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlgorithmId")
    private String algorithmId;

    @com.aliyun.core.annotation.NameInMap("AlgorithmVersion")
    private String algorithmVersion;

    private CreateAlgorithmVersionResponseBody(Builder builder) {
        this.algorithmId = builder.algorithmId;
        this.algorithmVersion = builder.algorithmVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlgorithmVersionResponseBody create() {
        return builder().build();
    }

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

    public static final class Builder {
        private String algorithmId; 
        private String algorithmVersion; 

        private Builder() {
        } 

        private Builder(CreateAlgorithmVersionResponseBody model) {
            this.algorithmId = model.algorithmId;
            this.algorithmVersion = model.algorithmVersion;
        } 

        /**
         * <p>ID of the training algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>algo-xsldfvu1334</p>
         */
        public Builder algorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }

        /**
         * <p>Algorithm version.</p>
         * 
         * <strong>example:</strong>
         * <p>v0.0.1</p>
         */
        public Builder algorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
        }

        public CreateAlgorithmVersionResponseBody build() {
            return new CreateAlgorithmVersionResponseBody(this);
        } 

    } 

}
