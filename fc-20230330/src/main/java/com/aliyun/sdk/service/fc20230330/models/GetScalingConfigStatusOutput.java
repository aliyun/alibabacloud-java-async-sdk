// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link GetScalingConfigStatusOutput} extends {@link TeaModel}
 *
 * <p>GetScalingConfigStatusOutput</p>
 */
public class GetScalingConfigStatusOutput extends TeaModel {
    private GetScalingConfigStatusOutput(Builder builder) {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScalingConfigStatusOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder {

        private Builder() {
        } 

        private Builder(GetScalingConfigStatusOutput model) {
        } 

        public GetScalingConfigStatusOutput build() {
            return new GetScalingConfigStatusOutput(this);
        } 

    } 

}
