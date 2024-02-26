// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EndpointStatus} extends {@link TeaModel}
 *
 * <p>EndpointStatus</p>
 */
public class EndpointStatus extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Detail")
    private EndpointStatusDetail detail;

    @NameInMap("Message")
    private String message;

    @NameInMap("Phase")
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
