// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DeleteContextsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteContextsResponseBody</p>
 */
public class DeleteContextsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deletedCount")
    private Integer deletedCount;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DeleteContextsResponseBody(Builder builder) {
        this.deletedCount = builder.deletedCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContextsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deletedCount
     */
    public Integer getDeletedCount() {
        return this.deletedCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer deletedCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteContextsResponseBody model) {
            this.deletedCount = model.deletedCount;
            this.requestId = model.requestId;
        } 

        /**
         * deletedCount.
         */
        public Builder deletedCount(Integer deletedCount) {
            this.deletedCount = deletedCount;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteContextsResponseBody build() {
            return new DeleteContextsResponseBody(this);
        } 

    } 

}
