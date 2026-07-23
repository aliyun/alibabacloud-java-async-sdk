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
 * {@link ListRoutineBuildConfigurationsRequest} extends {@link RequestModel}
 *
 * <p>ListRoutineBuildConfigurationsRequest</p>
 */
public class ListRoutineBuildConfigurationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoutineNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routineNames;

    private ListRoutineBuildConfigurationsRequest(Builder builder) {
        super(builder);
        this.routineNames = builder.routineNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoutineBuildConfigurationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return routineNames
     */
    public String getRoutineNames() {
        return this.routineNames;
    }

    public static final class Builder extends Request.Builder<ListRoutineBuildConfigurationsRequest, Builder> {
        private String routineNames; 

        private Builder() {
            super();
        } 

        private Builder(ListRoutineBuildConfigurationsRequest request) {
            super(request);
            this.routineNames = request.routineNames;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rwa-test,demo</p>
         */
        public Builder routineNames(String routineNames) {
            this.putQueryParameter("RoutineNames", routineNames);
            this.routineNames = routineNames;
            return this;
        }

        @Override
        public ListRoutineBuildConfigurationsRequest build() {
            return new ListRoutineBuildConfigurationsRequest(this);
        } 

    } 

}
