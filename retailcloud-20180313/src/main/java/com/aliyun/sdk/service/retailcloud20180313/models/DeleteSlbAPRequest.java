// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSlbAPRequest} extends {@link RequestModel}
 *
 * <p>DeleteSlbAPRequest</p>
 */
public class DeleteSlbAPRequest extends Request {
    @Query
    @NameInMap("SlbAPId")
    @Validation(required = true)
    private Long slbAPId;

    private DeleteSlbAPRequest(Builder builder) {
        super(builder);
        this.slbAPId = builder.slbAPId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSlbAPRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return slbAPId
     */
    public Long getSlbAPId() {
        return this.slbAPId;
    }

    public static final class Builder extends Request.Builder<DeleteSlbAPRequest, Builder> {
        private Long slbAPId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSlbAPRequest request) {
            super(request);
            this.slbAPId = request.slbAPId;
        } 

        /**
         * SlbAPId.
         */
        public Builder slbAPId(Long slbAPId) {
            this.putQueryParameter("SlbAPId", slbAPId);
            this.slbAPId = slbAPId;
            return this;
        }

        @Override
        public DeleteSlbAPRequest build() {
            return new DeleteSlbAPRequest(this);
        } 

    } 

}
