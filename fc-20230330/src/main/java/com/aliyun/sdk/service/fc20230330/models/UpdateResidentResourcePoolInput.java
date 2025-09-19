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
 * {@link UpdateResidentResourcePoolInput} extends {@link TeaModel}
 *
 * <p>UpdateResidentResourcePoolInput</p>
 */
public class UpdateResidentResourcePoolInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("useScaling")
    private Boolean useScaling;

    private UpdateResidentResourcePoolInput(Builder builder) {
        this.name = builder.name;
        this.useScaling = builder.useScaling;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResidentResourcePoolInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return useScaling
     */
    public Boolean getUseScaling() {
        return this.useScaling;
    }

    public static final class Builder {
        private String name; 
        private Boolean useScaling; 

        private Builder() {
        } 

        private Builder(UpdateResidentResourcePoolInput model) {
            this.name = model.name;
            this.useScaling = model.useScaling;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * useScaling.
         */
        public Builder useScaling(Boolean useScaling) {
            this.useScaling = useScaling;
            return this;
        }

        public UpdateResidentResourcePoolInput build() {
            return new UpdateResidentResourcePoolInput(this);
        } 

    } 

}
