// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountSettingsResponseBody</p>
 */
public class GetAccountSettingsResponseBody extends TeaModel {
    @NameInMap("availableAZs")
    private java.util.List < String > availableAZs;

    private GetAccountSettingsResponseBody(Builder builder) {
        this.availableAZs = builder.availableAZs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountSettingsResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableAZs
     */
    public java.util.List < String > getAvailableAZs() {
        return this.availableAZs;
    }

    public static final class Builder {
        private java.util.List < String > availableAZs; 

        /**
         * 可用区列表
         */
        public Builder availableAZs(java.util.List < String > availableAZs) {
            this.availableAZs = availableAZs;
            return this;
        }

        public GetAccountSettingsResponseBody build() {
            return new GetAccountSettingsResponseBody(this);
        } 

    } 

}
