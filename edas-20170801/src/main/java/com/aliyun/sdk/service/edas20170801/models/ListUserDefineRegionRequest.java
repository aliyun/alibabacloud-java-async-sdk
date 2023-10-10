// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserDefineRegionRequest} extends {@link RequestModel}
 *
 * <p>ListUserDefineRegionRequest</p>
 */
public class ListUserDefineRegionRequest extends Request {
    @Query
    @NameInMap("DebugEnable")
    private Boolean debugEnable;

    private ListUserDefineRegionRequest(Builder builder) {
        super(builder);
        this.debugEnable = builder.debugEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserDefineRegionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return debugEnable
     */
    public Boolean getDebugEnable() {
        return this.debugEnable;
    }

    public static final class Builder extends Request.Builder<ListUserDefineRegionRequest, Builder> {
        private Boolean debugEnable; 

        private Builder() {
            super();
        } 

        private Builder(ListUserDefineRegionRequest request) {
            super(request);
            this.debugEnable = request.debugEnable;
        } 

        /**
         * Specifies whether remote debugging is allowed.
         */
        public Builder debugEnable(Boolean debugEnable) {
            this.putQueryParameter("DebugEnable", debugEnable);
            this.debugEnable = debugEnable;
            return this;
        }

        @Override
        public ListUserDefineRegionRequest build() {
            return new ListUserDefineRegionRequest(this);
        } 

    } 

}
