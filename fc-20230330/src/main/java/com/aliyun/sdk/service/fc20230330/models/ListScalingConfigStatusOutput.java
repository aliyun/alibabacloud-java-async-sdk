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
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<ScalingConfigStatus> result;

    private ListScalingConfigStatusOutput(Builder builder) {
        this.nextToken = builder.nextToken;
        this.result = builder.result;
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

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return result
     */
    public java.util.List<ScalingConfigStatus> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<ScalingConfigStatus> result; 

        private Builder() {
        } 

        private Builder(ListScalingConfigStatusOutput model) {
            this.nextToken = model.nextToken;
            this.result = model.result;
        } 

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List<ScalingConfigStatus> result) {
            this.result = result;
            return this;
        }

        public ListScalingConfigStatusOutput build() {
            return new ListScalingConfigStatusOutput(this);
        } 

    } 

}
