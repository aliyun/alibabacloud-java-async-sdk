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
 * {@link AlterShareRequest} extends {@link RequestModel}
 *
 * <p>AlterShareRequest</p>
 */
public class AlterShareRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("share")
    private String share;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shareName")
    private String shareName;

    private AlterShareRequest(Builder builder) {
        super(builder);
        this.share = builder.share;
        this.comment = builder.comment;
        this.shareName = builder.shareName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlterShareRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return share
     */
    public String getShare() {
        return this.share;
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

    public static final class Builder extends Request.Builder<AlterShareRequest, Builder> {
        private String share; 
        private String comment; 
        private String shareName; 

        private Builder() {
            super();
        } 

        private Builder(AlterShareRequest request) {
            super(request);
            this.share = request.share;
            this.comment = request.comment;
            this.shareName = request.shareName;
        } 

        /**
         * share.
         */
        public Builder share(String share) {
            this.putPathParameter("share", share);
            this.share = share;
            return this;
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
         * shareName.
         */
        public Builder shareName(String shareName) {
            this.putBodyParameter("shareName", shareName);
            this.shareName = shareName;
            return this;
        }

        @Override
        public AlterShareRequest build() {
            return new AlterShareRequest(this);
        } 

    } 

}
