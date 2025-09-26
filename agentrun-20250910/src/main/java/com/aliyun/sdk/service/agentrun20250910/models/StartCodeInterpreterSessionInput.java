// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link StartCodeInterpreterSessionInput} extends {@link TeaModel}
 *
 * <p>StartCodeInterpreterSessionInput</p>
 */
public class StartCodeInterpreterSessionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private StartCodeInterpreterSessionInput(Builder builder) {
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartCodeInterpreterSessionInput create() {
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

    public static final class Builder {
        private String name; 

        private Builder() {
        } 

        private Builder(StartCodeInterpreterSessionInput model) {
            this.name = model.name;
        } 

        /**
         * <p>代码解释器会话的名称，用于标识和区分不同的会话实例</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public StartCodeInterpreterSessionInput build() {
            return new StartCodeInterpreterSessionInput(this);
        } 

    } 

}
