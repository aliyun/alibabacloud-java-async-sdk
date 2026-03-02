// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link RevokeReviewCmd} extends {@link TeaModel}
 *
 * <p>RevokeReviewCmd</p>
 */
public class RevokeReviewCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pbcVersionId")
    private Long pbcVersionId;

    private RevokeReviewCmd(Builder builder) {
        this.pbcVersionId = builder.pbcVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeReviewCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pbcVersionId
     */
    public Long getPbcVersionId() {
        return this.pbcVersionId;
    }

    public static final class Builder {
        private Long pbcVersionId; 

        private Builder() {
        } 

        private Builder(RevokeReviewCmd model) {
            this.pbcVersionId = model.pbcVersionId;
        } 

        /**
         * pbcVersionId.
         */
        public Builder pbcVersionId(Long pbcVersionId) {
            this.pbcVersionId = pbcVersionId;
            return this;
        }

        public RevokeReviewCmd build() {
            return new RevokeReviewCmd(this);
        } 

    } 

}
