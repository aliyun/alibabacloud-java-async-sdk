// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRefreshProcessInfoRequest} extends {@link RequestModel}
 *
 * <p>ModifyRefreshProcessInfoRequest</p>
 */
public class ModifyRefreshProcessInfoRequest extends Request {
    @Query
    @NameInMap("Uuid")
    private String uuid;

    private ModifyRefreshProcessInfoRequest(Builder builder) {
        super(builder);
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRefreshProcessInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ModifyRefreshProcessInfoRequest, Builder> {
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRefreshProcessInfoRequest request) {
            super(request);
            this.uuid = request.uuid;
        } 

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ModifyRefreshProcessInfoRequest build() {
            return new ModifyRefreshProcessInfoRequest(this);
        } 

    } 

}
