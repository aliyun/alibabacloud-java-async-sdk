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
 * {@link StartBrowserSessionInput} extends {@link TeaModel}
 *
 * <p>StartBrowserSessionInput</p>
 */
public class StartBrowserSessionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private StartBrowserSessionInput(Builder builder) {
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartBrowserSessionInput create() {
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

        private Builder(StartBrowserSessionInput model) {
            this.name = model.name;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public StartBrowserSessionInput build() {
            return new StartBrowserSessionInput(this);
        } 

    } 

}
