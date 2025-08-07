// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link CreateShareRequest} extends {@link RequestModel}
 *
 * <p>CreateShareRequest</p>
 */
public class CreateShareRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shareName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shareName;

    private CreateShareRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.shareName = builder.shareName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateShareRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return shareName
     */
    public String getShareName() {
        return this.shareName;
    }

    public static final class Builder extends Request.Builder<CreateShareRequest, Builder> {
        private String comment; 
        private String shareName; 

        private Builder() {
            super();
        } 

        private Builder(CreateShareRequest request) {
            super(request);
            this.comment = request.comment;
            this.shareName = request.shareName;
        } 

        /**
         * comment.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>share_name</p>
         */
        public Builder shareName(String shareName) {
            this.putBodyParameter("shareName", shareName);
            this.shareName = shareName;
            return this;
        }

        @Override
        public CreateShareRequest build() {
            return new CreateShareRequest(this);
        } 

    } 

}
