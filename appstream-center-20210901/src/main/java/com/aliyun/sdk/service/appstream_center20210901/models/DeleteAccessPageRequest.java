// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAccessPageRequest} extends {@link RequestModel}
 *
 * <p>DeleteAccessPageRequest</p>
 */
public class DeleteAccessPageRequest extends Request {
    @Query
    @NameInMap("AccessPageId")
    private String accessPageId;

    private DeleteAccessPageRequest(Builder builder) {
        super(builder);
        this.accessPageId = builder.accessPageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAccessPageRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAccessPageRequest, Builder> {
        private String accessPageId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAccessPageRequest request) {
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
        public DeleteAccessPageRequest build() {
            return new DeleteAccessPageRequest(this);
        } 

    } 

}
