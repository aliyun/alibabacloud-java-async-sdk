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
 * {@link DropShareRequest} extends {@link RequestModel}
 *
 * <p>DropShareRequest</p>
 */
public class DropShareRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("share")
    private String share;

    private DropShareRequest(Builder builder) {
        super(builder);
        this.share = builder.share;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DropShareRequest create() {
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

    public static final class Builder extends Request.Builder<DropShareRequest, Builder> {
        private String share; 

        private Builder() {
            super();
        } 

        private Builder(DropShareRequest request) {
            super(request);
            this.share = request.share;
        } 

        /**
         * share.
         */
        public Builder share(String share) {
            this.putPathParameter("share", share);
            this.share = share;
            return this;
        }

        @Override
        public DropShareRequest build() {
            return new DropShareRequest(this);
        } 

    } 

}
