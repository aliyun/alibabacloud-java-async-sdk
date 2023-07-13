// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHybridMonitorSLSGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteHybridMonitorSLSGroupRequest</p>
 */
public class DeleteHybridMonitorSLSGroupRequest extends Request {
    @Query
    @NameInMap("SLSGroupName")
    @Validation(required = true)
    private String SLSGroupName;

    private DeleteHybridMonitorSLSGroupRequest(Builder builder) {
        super(builder);
        this.SLSGroupName = builder.SLSGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHybridMonitorSLSGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return SLSGroupName
     */
    public String getSLSGroupName() {
        return this.SLSGroupName;
    }

    public static final class Builder extends Request.Builder<DeleteHybridMonitorSLSGroupRequest, Builder> {
        private String SLSGroupName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHybridMonitorSLSGroupRequest request) {
            super(request);
            this.SLSGroupName = request.SLSGroupName;
        } 

        /**
         * The ID of the request.
         */
        public Builder SLSGroupName(String SLSGroupName) {
            this.putQueryParameter("SLSGroupName", SLSGroupName);
            this.SLSGroupName = SLSGroupName;
            return this;
        }

        @Override
        public DeleteHybridMonitorSLSGroupRequest build() {
            return new DeleteHybridMonitorSLSGroupRequest(this);
        } 

    } 

}
