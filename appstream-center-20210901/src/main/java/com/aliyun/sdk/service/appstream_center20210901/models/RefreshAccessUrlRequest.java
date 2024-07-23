// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshAccessUrlRequest} extends {@link RequestModel}
 *
 * <p>RefreshAccessUrlRequest</p>
 */
public class RefreshAccessUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPageId")
    private String accessPageId;

    private RefreshAccessUrlRequest(Builder builder) {
        super(builder);
        this.accessPageId = builder.accessPageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshAccessUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPageId
     */
    public String getAccessPageId() {
        return this.accessPageId;
    }

    public static final class Builder extends Request.Builder<RefreshAccessUrlRequest, Builder> {
        private String accessPageId; 

        private Builder() {
            super();
        } 

        private Builder(RefreshAccessUrlRequest request) {
            super(request);
            this.accessPageId = request.accessPageId;
        } 

        /**
         * AccessPageId.
         */
        public Builder accessPageId(String accessPageId) {
            this.putQueryParameter("AccessPageId", accessPageId);
            this.accessPageId = accessPageId;
            return this;
        }

        @Override
        public RefreshAccessUrlRequest build() {
            return new RefreshAccessUrlRequest(this);
        } 

    } 

}
