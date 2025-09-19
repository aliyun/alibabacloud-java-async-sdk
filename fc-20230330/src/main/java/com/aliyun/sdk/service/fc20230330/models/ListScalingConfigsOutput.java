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
 * {@link ListScalingConfigsOutput} extends {@link TeaModel}
 *
 * <p>ListScalingConfigsOutput</p>
 */
public class ListScalingConfigsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("scalingConfigs")
    private java.util.List<ScalingConfigStatus> scalingConfigs;

    private ListScalingConfigsOutput(Builder builder) {
        this.nextToken = builder.nextToken;
        this.scalingConfigs = builder.scalingConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScalingConfigsOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return scalingConfigs
     */
    public java.util.List<ScalingConfigStatus> getScalingConfigs() {
        return this.scalingConfigs;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<ScalingConfigStatus> scalingConfigs; 

        private Builder() {
        } 

        private Builder(ListScalingConfigsOutput model) {
            this.nextToken = model.nextToken;
            this.scalingConfigs = model.scalingConfigs;
        } 

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * scalingConfigs.
         */
        public Builder scalingConfigs(java.util.List<ScalingConfigStatus> scalingConfigs) {
            this.scalingConfigs = scalingConfigs;
            return this;
        }

        public ListScalingConfigsOutput build() {
            return new ListScalingConfigsOutput(this);
        } 

    } 

}
