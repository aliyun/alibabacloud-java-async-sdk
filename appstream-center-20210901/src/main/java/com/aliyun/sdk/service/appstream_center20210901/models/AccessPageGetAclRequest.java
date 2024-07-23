// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AccessPageGetAclRequest} extends {@link RequestModel}
 *
 * <p>AccessPageGetAclRequest</p>
 */
public class AccessPageGetAclRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPageId")
    private String accessPageId;

    private AccessPageGetAclRequest(Builder builder) {
        super(builder);
        this.accessPageId = builder.accessPageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccessPageGetAclRequest create() {
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

    public static final class Builder extends Request.Builder<AccessPageGetAclRequest, Builder> {
        private String accessPageId; 

        private Builder() {
            super();
        } 

        private Builder(AccessPageGetAclRequest request) {
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
        public AccessPageGetAclRequest build() {
            return new AccessPageGetAclRequest(this);
        } 

    } 

}
