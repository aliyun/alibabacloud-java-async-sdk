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
 * {@link ListProvisionConfigsOutput} extends {@link TeaModel}
 *
 * <p>ListProvisionConfigsOutput</p>
 */
public class ListProvisionConfigsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("provisionConfigs")
    private java.util.List<ProvisionConfig> provisionConfigs;

    private ListProvisionConfigsOutput(Builder builder) {
        this.nextToken = builder.nextToken;
        this.provisionConfigs = builder.provisionConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProvisionConfigsOutput create() {
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
     * @return provisionConfigs
     */
    public java.util.List<ProvisionConfig> getProvisionConfigs() {
        return this.provisionConfigs;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<ProvisionConfig> provisionConfigs; 

        private Builder() {
        } 

        private Builder(ListProvisionConfigsOutput model) {
            this.nextToken = model.nextToken;
            this.provisionConfigs = model.provisionConfigs;
        } 

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * provisionConfigs.
         */
        public Builder provisionConfigs(java.util.List<ProvisionConfig> provisionConfigs) {
            this.provisionConfigs = provisionConfigs;
            return this;
        }

        public ListProvisionConfigsOutput build() {
            return new ListProvisionConfigsOutput(this);
        } 

    } 

}
