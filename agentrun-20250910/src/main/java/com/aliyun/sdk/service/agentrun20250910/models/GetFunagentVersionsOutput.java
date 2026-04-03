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
 * {@link GetFunagentVersionsOutput} extends {@link TeaModel}
 *
 * <p>GetFunagentVersionsOutput</p>
 */
public class GetFunagentVersionsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<FunagentVersionItem> items;

    private GetFunagentVersionsOutput(Builder builder) {
        this.items = builder.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunagentVersionsOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<FunagentVersionItem> getItems() {
        return this.items;
    }

    public static final class Builder {
        private java.util.List<FunagentVersionItem> items; 

        private Builder() {
        } 

        private Builder(GetFunagentVersionsOutput model) {
            this.items = model.items;
        } 

        /**
         * items.
         */
        public Builder items(java.util.List<FunagentVersionItem> items) {
            this.items = items;
            return this;
        }

        public GetFunagentVersionsOutput build() {
            return new GetFunagentVersionsOutput(this);
        } 

    } 

}
