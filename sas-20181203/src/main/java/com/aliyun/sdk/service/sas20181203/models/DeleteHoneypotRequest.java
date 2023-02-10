// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHoneypotRequest} extends {@link RequestModel}
 *
 * <p>DeleteHoneypotRequest</p>
 */
public class DeleteHoneypotRequest extends Request {
    @Query
    @NameInMap("HoneypotId")
    @Validation(required = true)
    private String honeypotId;

    private DeleteHoneypotRequest(Builder builder) {
        super(builder);
        this.honeypotId = builder.honeypotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHoneypotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return honeypotId
     */
    public String getHoneypotId() {
        return this.honeypotId;
    }

    public static final class Builder extends Request.Builder<DeleteHoneypotRequest, Builder> {
        private String honeypotId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHoneypotRequest request) {
            super(request);
            this.honeypotId = request.honeypotId;
        } 

        /**
         * The ID of the honeypot.
         * <p>
         * 
         * >  You can call the [ListHoneypot](~~ListHoneypot~~) operation to query the IDs of honeypots.
         */
        public Builder honeypotId(String honeypotId) {
            this.putQueryParameter("HoneypotId", honeypotId);
            this.honeypotId = honeypotId;
            return this;
        }

        @Override
        public DeleteHoneypotRequest build() {
            return new DeleteHoneypotRequest(this);
        } 

    } 

}
