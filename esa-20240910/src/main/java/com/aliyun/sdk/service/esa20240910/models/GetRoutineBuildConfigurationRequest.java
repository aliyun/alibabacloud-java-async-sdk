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
 * {@link GetRoutineBuildConfigurationRequest} extends {@link RequestModel}
 *
 * <p>GetRoutineBuildConfigurationRequest</p>
 */
public class GetRoutineBuildConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoutineName")
    private String routineName;

    private GetRoutineBuildConfigurationRequest(Builder builder) {
        super(builder);
        this.routineName = builder.routineName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoutineBuildConfigurationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return routineName
     */
    public String getRoutineName() {
        return this.routineName;
    }

    public static final class Builder extends Request.Builder<GetRoutineBuildConfigurationRequest, Builder> {
        private String routineName; 

        private Builder() {
            super();
        } 

        private Builder(GetRoutineBuildConfigurationRequest request) {
            super(request);
            this.routineName = request.routineName;
        } 

        /**
         * RoutineName.
         */
        public Builder routineName(String routineName) {
            this.putQueryParameter("RoutineName", routineName);
            this.routineName = routineName;
            return this;
        }

        @Override
        public GetRoutineBuildConfigurationRequest build() {
            return new GetRoutineBuildConfigurationRequest(this);
        } 

    } 

}
