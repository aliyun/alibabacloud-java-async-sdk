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
 * {@link MCPMatch} extends {@link TeaModel}
 *
 * <p>MCPMatch</p>
 */
public class MCPMatch extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("path")
    private MCPPathMatch path;

    private MCPMatch(Builder builder) {
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MCPMatch create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return path
     */
    public MCPPathMatch getPath() {
        return this.path;
    }

    public static final class Builder {
        private MCPPathMatch path; 

        private Builder() {
        } 

        private Builder(MCPMatch model) {
            this.path = model.path;
        } 

        /**
         * path.
         */
        public Builder path(MCPPathMatch path) {
            this.path = path;
            return this;
        }

        public MCPMatch build() {
            return new MCPMatch(this);
        } 

    } 

}
