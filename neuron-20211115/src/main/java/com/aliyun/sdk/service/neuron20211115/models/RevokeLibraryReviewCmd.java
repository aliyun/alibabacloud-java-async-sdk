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
 * {@link RevokeLibraryReviewCmd} extends {@link TeaModel}
 *
 * <p>RevokeLibraryReviewCmd</p>
 */
public class RevokeLibraryReviewCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("libraryId")
    private Long libraryId;

    private RevokeLibraryReviewCmd(Builder builder) {
        this.libraryId = builder.libraryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeLibraryReviewCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libraryId
     */
    public Long getLibraryId() {
        return this.libraryId;
    }

    public static final class Builder {
        private Long libraryId; 

        private Builder() {
        } 

        private Builder(RevokeLibraryReviewCmd model) {
            this.libraryId = model.libraryId;
        } 

        /**
         * libraryId.
         */
        public Builder libraryId(Long libraryId) {
            this.libraryId = libraryId;
            return this;
        }

        public RevokeLibraryReviewCmd build() {
            return new RevokeLibraryReviewCmd(this);
        } 

    } 

}
