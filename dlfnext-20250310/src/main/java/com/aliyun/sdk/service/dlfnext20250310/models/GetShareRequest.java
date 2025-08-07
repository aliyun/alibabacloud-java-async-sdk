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
 * {@link GetShareRequest} extends {@link RequestModel}
 *
 * <p>GetShareRequest</p>
 */
public class GetShareRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("share")
    private String share;

    private GetShareRequest(Builder builder) {
        super(builder);
        this.share = builder.share;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetShareRequest create() {
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

    public static final class Builder extends Request.Builder<GetShareRequest, Builder> {
        private String share; 

        private Builder() {
            super();
        } 

        private Builder(GetShareRequest request) {
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
        public GetShareRequest build() {
            return new GetShareRequest(this);
        } 

    } 

}
