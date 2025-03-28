// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link EnvironmentSpec} extends {@link TeaModel}
 *
 * <p>EnvironmentSpec</p>
 */
public class EnvironmentSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("roleArn")
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("stagedConfigs")
    private EnvironmentStagedConfigs stagedConfigs;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private EnvironmentSpec(Builder builder) {
        this.roleArn = builder.roleArn;
        this.stagedConfigs = builder.stagedConfigs;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnvironmentSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return stagedConfigs
     */
    public EnvironmentStagedConfigs getStagedConfigs() {
        return this.stagedConfigs;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String roleArn; 
        private EnvironmentStagedConfigs stagedConfigs; 
        private String type; 

        private Builder() {
        } 

        private Builder(EnvironmentSpec model) {
            this.roleArn = model.roleArn;
            this.stagedConfigs = model.stagedConfigs;
            this.type = model.type;
        } 

        /**
         * roleArn.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * stagedConfigs.
         */
        public Builder stagedConfigs(EnvironmentStagedConfigs stagedConfigs) {
            this.stagedConfigs = stagedConfigs;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public EnvironmentSpec build() {
            return new EnvironmentSpec(this);
        } 

    } 

}
