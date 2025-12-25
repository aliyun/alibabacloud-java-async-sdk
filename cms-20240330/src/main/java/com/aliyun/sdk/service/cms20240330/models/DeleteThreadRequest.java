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
 * {@link DeleteThreadRequest} extends {@link RequestModel}
 *
 * <p>DeleteThreadRequest</p>
 */
public class DeleteThreadRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("threadId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String threadId;

    private DeleteThreadRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.threadId = builder.threadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteThreadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return threadId
     */
    public String getThreadId() {
        return this.threadId;
    }

    public static final class Builder extends Request.Builder<DeleteThreadRequest, Builder> {
        private String name; 
        private String threadId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteThreadRequest request) {
            super(request);
            this.name = request.name;
            this.threadId = request.threadId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>thread_id01</p>
         */
        public Builder threadId(String threadId) {
            this.putPathParameter("threadId", threadId);
            this.threadId = threadId;
            return this;
        }

        @Override
        public DeleteThreadRequest build() {
            return new DeleteThreadRequest(this);
        } 

    } 

}
