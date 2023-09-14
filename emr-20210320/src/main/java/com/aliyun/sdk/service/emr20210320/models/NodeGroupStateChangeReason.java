// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NodeGroupStateChangeReason} extends {@link TeaModel}
 *
 * <p>NodeGroupStateChangeReason</p>
 */
public class NodeGroupStateChangeReason extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    private NodeGroupStateChangeReason(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeGroupStateChangeReason create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private String code; 
        private String message; 

        /**
         * 状态码。
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 描述信息。
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public NodeGroupStateChangeReason build() {
            return new NodeGroupStateChangeReason(this);
        } 

    } 

}
