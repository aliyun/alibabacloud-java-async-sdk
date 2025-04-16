// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link NodeOperationResult} extends {@link TeaModel}
 *
 * <p>NodeOperationResult</p>
 */
public class NodeOperationResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private NodeOperationResult(Builder builder) {
        this.message = builder.message;
        this.nodeName = builder.nodeName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeOperationResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String message; 
        private String nodeName; 
        private String status; 

        private Builder() {
        } 

        private Builder(NodeOperationResult model) {
            this.message = model.message;
            this.nodeName = model.nodeName;
            this.status = model.status;
        } 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NodeName.
         */
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public NodeOperationResult build() {
            return new NodeOperationResult(this);
        } 

    } 

}
