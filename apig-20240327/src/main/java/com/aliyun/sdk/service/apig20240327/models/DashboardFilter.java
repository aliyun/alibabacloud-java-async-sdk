// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DashboardFilter} extends {@link TeaModel}
 *
 * <p>DashboardFilter</p>
 */
public class DashboardFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("routeName")
    private String routeName;

    private DashboardFilter(Builder builder) {
        this.routeName = builder.routeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DashboardFilter create() {
        return builder().build();
    }

    /**
     * @return routeName
     */
    public String getRouteName() {
        return this.routeName;
    }

    public static final class Builder {
        private String routeName; 

        /**
         * routeName.
         */
        public Builder routeName(String routeName) {
            this.routeName = routeName;
            return this;
        }

        public DashboardFilter build() {
            return new DashboardFilter(this);
        } 

    } 

}
