// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

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
 * {@link EndpointStatus} extends {@link TeaModel}
 *
 * <p>EndpointStatus</p>
 */
public class EndpointStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private EndpointStatusDetail detail;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    private EndpointStatus(Builder builder) {
        this.code = builder.code;
        this.detail = builder.detail;
        this.message = builder.message;
        this.phase = builder.phase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EndpointStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return detail
     */
    public EndpointStatusDetail getDetail() {
        return this.detail;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    public static final class Builder {
        private String code; 
        private EndpointStatusDetail detail; 
        private String message; 
        private String phase; 

        private Builder() {
        } 

        private Builder(EndpointStatus model) {
            this.code = model.code;
            this.detail = model.detail;
            this.message = model.message;
            this.phase = model.phase;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(EndpointStatusDetail detail) {
            this.detail = detail;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        public EndpointStatus build() {
            return new EndpointStatus(this);
        } 

    } 

}
