// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link UserAPICountInfo} extends {@link TeaModel}
 *
 * <p>UserAPICountInfo</p>
 */
public class UserAPICountInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiType")
    private String apiType;

    @com.aliyun.core.annotation.NameInMap("scope")
    private String scope;

    @com.aliyun.core.annotation.NameInMap("usedCount")
    private Integer usedCount;

    private UserAPICountInfo(Builder builder) {
        this.apiType = builder.apiType;
        this.scope = builder.scope;
        this.usedCount = builder.usedCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserAPICountInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiType
     */
    public String getApiType() {
        return this.apiType;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return usedCount
     */
    public Integer getUsedCount() {
        return this.usedCount;
    }

    public static final class Builder {
        private String apiType; 
        private String scope; 
        private Integer usedCount; 

        private Builder() {
        } 

        private Builder(UserAPICountInfo model) {
            this.apiType = model.apiType;
            this.scope = model.scope;
            this.usedCount = model.usedCount;
        } 

        /**
         * apiType.
         */
        public Builder apiType(String apiType) {
            this.apiType = apiType;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * usedCount.
         */
        public Builder usedCount(Integer usedCount) {
            this.usedCount = usedCount;
            return this;
        }

        public UserAPICountInfo build() {
            return new UserAPICountInfo(this);
        } 

    } 

}
