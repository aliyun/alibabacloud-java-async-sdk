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
 * {@link ListResidentResourcePoolsOutput} extends {@link TeaModel}
 *
 * <p>ListResidentResourcePoolsOutput</p>
 */
public class ListResidentResourcePoolsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("residentResourcePools")
    private java.util.List<ResidentResourcePool> residentResourcePools;

    private ListResidentResourcePoolsOutput(Builder builder) {
        this.nextToken = builder.nextToken;
        this.residentResourcePools = builder.residentResourcePools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResidentResourcePoolsOutput create() {
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
     * @return residentResourcePools
     */
    public java.util.List<ResidentResourcePool> getResidentResourcePools() {
        return this.residentResourcePools;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<ResidentResourcePool> residentResourcePools; 

        private Builder() {
        } 

        private Builder(ListResidentResourcePoolsOutput model) {
            this.nextToken = model.nextToken;
            this.residentResourcePools = model.residentResourcePools;
        } 

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * residentResourcePools.
         */
        public Builder residentResourcePools(java.util.List<ResidentResourcePool> residentResourcePools) {
            this.residentResourcePools = residentResourcePools;
            return this;
        }

        public ListResidentResourcePoolsOutput build() {
            return new ListResidentResourcePoolsOutput(this);
        } 

    } 

}
