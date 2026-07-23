// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetRoutineBuildRequest} extends {@link RequestModel}
 *
 * <p>GetRoutineBuildRequest</p>
 */
public class GetRoutineBuildRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoutineBuildId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long routineBuildId;

    private GetRoutineBuildRequest(Builder builder) {
        super(builder);
        this.routineBuildId = builder.routineBuildId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoutineBuildRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return routineBuildId
     */
    public Long getRoutineBuildId() {
        return this.routineBuildId;
    }

    public static final class Builder extends Request.Builder<GetRoutineBuildRequest, Builder> {
        private Long routineBuildId; 

        private Builder() {
            super();
        } 

        private Builder(GetRoutineBuildRequest request) {
            super(request);
            this.routineBuildId = request.routineBuildId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4354306271619136</p>
         */
        public Builder routineBuildId(Long routineBuildId) {
            this.putQueryParameter("RoutineBuildId", routineBuildId);
            this.routineBuildId = routineBuildId;
            return this;
        }

        @Override
        public GetRoutineBuildRequest build() {
            return new GetRoutineBuildRequest(this);
        } 

    } 

}
