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
 * {@link OperationModelFileAction} extends {@link TeaModel}
 *
 * <p>OperationModelFileAction</p>
 */
public class OperationModelFileAction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action")
    @com.aliyun.core.annotation.Validation(required = true)
    private String action;

    @com.aliyun.core.annotation.NameInMap("destination")
    private String destination;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("target")
    private String target;

    private OperationModelFileAction(Builder builder) {
        this.action = builder.action;
        this.destination = builder.destination;
        this.source = builder.source;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperationModelFileAction create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return destination
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder {
        private String action; 
        private String destination; 
        private String source; 
        private String target; 

        private Builder() {
        } 

        private Builder(OperationModelFileAction model) {
            this.action = model.action;
            this.destination = model.destination;
            this.source = model.source;
            this.target = model.target;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * destination.
         */
        public Builder destination(String destination) {
            this.destination = destination;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * target.
         */
        public Builder target(String target) {
            this.target = target;
            return this;
        }

        public OperationModelFileAction build() {
            return new OperationModelFileAction(this);
        } 

    } 

}
