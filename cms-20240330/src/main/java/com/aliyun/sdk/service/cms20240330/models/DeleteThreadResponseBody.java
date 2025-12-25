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
 * {@link DeleteThreadResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteThreadResponseBody</p>
 */
public class DeleteThreadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deleted")
    private Boolean deleted;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DeleteThreadResponseBody(Builder builder) {
        this.deleted = builder.deleted;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteThreadResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleted
     */
    public Boolean getDeleted() {
        return this.deleted;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean deleted; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteThreadResponseBody model) {
            this.deleted = model.deleted;
            this.requestId = model.requestId;
        } 

        /**
         * deleted.
         */
        public Builder deleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>123-0F43-23423-AC43-34234</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteThreadResponseBody build() {
            return new DeleteThreadResponseBody(this);
        } 

    } 

}
