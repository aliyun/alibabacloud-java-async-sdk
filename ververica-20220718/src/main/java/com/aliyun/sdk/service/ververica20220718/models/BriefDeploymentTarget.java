// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BriefDeploymentTarget} extends {@link TeaModel}
 *
 * <p>BriefDeploymentTarget</p>
 */
public class BriefDeploymentTarget extends TeaModel {
    @NameInMap("mode")
    private String mode;

    @NameInMap("name")
    private String name;

    private BriefDeploymentTarget(Builder builder) {
        this.mode = builder.mode;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BriefDeploymentTarget create() {
        return builder().build();
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String mode; 
        private String name; 

        /**
         * mode.
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public BriefDeploymentTarget build() {
            return new BriefDeploymentTarget(this);
        } 

    } 

}
