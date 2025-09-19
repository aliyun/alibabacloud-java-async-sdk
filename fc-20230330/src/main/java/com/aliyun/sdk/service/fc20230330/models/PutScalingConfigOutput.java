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
 * {@link PutScalingConfigOutput} extends {@link TeaModel}
 *
 * <p>PutScalingConfigOutput</p>
 */
public class PutScalingConfigOutput extends TeaModel {
    private PutScalingConfigOutput(Builder builder) {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutScalingConfigOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder {

        private Builder() {
        } 

        private Builder(PutScalingConfigOutput model) {
        } 

        public PutScalingConfigOutput build() {
            return new PutScalingConfigOutput(this);
        } 

    } 

}
