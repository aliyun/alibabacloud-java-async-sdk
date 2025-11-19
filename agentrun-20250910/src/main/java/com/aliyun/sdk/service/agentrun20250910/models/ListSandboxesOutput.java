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
 * {@link ListSandboxesOutput} extends {@link TeaModel}
 *
 * <p>ListSandboxesOutput</p>
 */
public class ListSandboxesOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Sandbox> items;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListSandboxesOutput(Builder builder) {
        this.items = builder.items;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSandboxesOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Sandbox> getItems() {
        return this.items;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List<Sandbox> items; 
        private String nextToken; 

        private Builder() {
        } 

        private Builder(ListSandboxesOutput model) {
            this.items = model.items;
            this.nextToken = model.nextToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder items(java.util.List<Sandbox> items) {
            this.items = items;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListSandboxesOutput build() {
            return new ListSandboxesOutput(this);
        } 

    } 

}
