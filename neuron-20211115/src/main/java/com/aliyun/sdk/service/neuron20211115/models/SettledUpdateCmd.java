// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link SettledUpdateCmd} extends {@link TeaModel}
 *
 * <p>SettledUpdateCmd</p>
 */
public class SettledUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private SettledUpdateCmd(Builder builder) {
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SettledUpdateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String status; 

        private Builder() {
        } 

        private Builder(SettledUpdateCmd model) {
            this.status = model.status;
        } 

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public SettledUpdateCmd build() {
            return new SettledUpdateCmd(this);
        } 

    } 

}
