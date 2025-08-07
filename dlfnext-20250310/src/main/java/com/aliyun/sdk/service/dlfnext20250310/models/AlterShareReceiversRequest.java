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
 * {@link AlterShareReceiversRequest} extends {@link RequestModel}
 *
 * <p>AlterShareReceiversRequest</p>
 */
public class AlterShareReceiversRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("share")
    private String share;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("addedReceivers")
    private java.util.List<String> addedReceivers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("removedReceivers")
    private java.util.List<String> removedReceivers;

    private AlterShareReceiversRequest(Builder builder) {
        super(builder);
        this.share = builder.share;
        this.addedReceivers = builder.addedReceivers;
        this.removedReceivers = builder.removedReceivers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlterShareReceiversRequest create() {
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
     * @return addedReceivers
     */
    public java.util.List<String> getAddedReceivers() {
        return this.addedReceivers;
    }

    /**
     * @return removedReceivers
     */
    public java.util.List<String> getRemovedReceivers() {
        return this.removedReceivers;
    }

    public static final class Builder extends Request.Builder<AlterShareReceiversRequest, Builder> {
        private String share; 
        private java.util.List<String> addedReceivers; 
        private java.util.List<String> removedReceivers; 

        private Builder() {
            super();
        } 

        private Builder(AlterShareReceiversRequest request) {
            super(request);
            this.share = request.share;
            this.addedReceivers = request.addedReceivers;
            this.removedReceivers = request.removedReceivers;
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
         * addedReceivers.
         */
        public Builder addedReceivers(java.util.List<String> addedReceivers) {
            this.putBodyParameter("addedReceivers", addedReceivers);
            this.addedReceivers = addedReceivers;
            return this;
        }

        /**
         * removedReceivers.
         */
        public Builder removedReceivers(java.util.List<String> removedReceivers) {
            this.putBodyParameter("removedReceivers", removedReceivers);
            this.removedReceivers = removedReceivers;
            return this;
        }

        @Override
        public AlterShareReceiversRequest build() {
            return new AlterShareReceiversRequest(this);
        } 

    } 

}
