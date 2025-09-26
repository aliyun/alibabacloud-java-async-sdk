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
 * {@link MCPPathMatch} extends {@link TeaModel}
 *
 * <p>MCPPathMatch</p>
 */
public class MCPPathMatch extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private MCPPathMatch(Builder builder) {
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MCPPathMatch create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String type; 
        private String value; 

        private Builder() {
        } 

        private Builder(MCPPathMatch model) {
            this.type = model.type;
            this.value = model.value;
        } 

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public MCPPathMatch build() {
            return new MCPPathMatch(this);
        } 

    } 

}
