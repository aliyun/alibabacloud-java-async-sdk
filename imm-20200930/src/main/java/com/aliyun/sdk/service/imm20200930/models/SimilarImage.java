// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link SimilarImage} extends {@link TeaModel}
 *
 * <p>SimilarImage</p>
 */
public class SimilarImage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageScore")
    private Double imageScore;

    @com.aliyun.core.annotation.NameInMap("URI")
    private String URI;

    private SimilarImage(Builder builder) {
        this.imageScore = builder.imageScore;
        this.URI = builder.URI;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SimilarImage create() {
        return builder().build();
    }

    /**
     * @return imageScore
     */
    public Double getImageScore() {
        return this.imageScore;
    }

    /**
     * @return URI
     */
    public String getURI() {
        return this.URI;
    }

    public static final class Builder {
        private Double imageScore; 
        private String URI; 

        /**
         * ImageScore.
         */
        public Builder imageScore(Double imageScore) {
            this.imageScore = imageScore;
            return this;
        }

        /**
         * URI.
         */
        public Builder URI(String URI) {
            this.URI = URI;
            return this;
        }

        public SimilarImage build() {
            return new SimilarImage(this);
        } 

    } 

}
