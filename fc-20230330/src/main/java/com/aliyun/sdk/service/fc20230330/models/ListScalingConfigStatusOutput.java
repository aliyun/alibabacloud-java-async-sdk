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
 * {@link ListScalingConfigStatusOutput} extends {@link TeaModel}
 *
 * <p>ListScalingConfigStatusOutput</p>
 */
public class ListScalingConfigStatusOutput extends TeaModel {
    private ListScalingConfigStatusOutput(Builder builder) {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScalingConfigStatusOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder {

        private Builder() {
        } 

        private Builder(ListScalingConfigStatusOutput model) {
        } 

        public ListScalingConfigStatusOutput build() {
            return new ListScalingConfigStatusOutput(this);
        } 

    } 

}
