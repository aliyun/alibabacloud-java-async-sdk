// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link GetSceneResponseBody} extends {@link TeaModel}
 *
 * <p>GetSceneResponseBody</p>
 */
public class GetSceneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Flows")
    private java.util.List<Flows> flows;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSceneResponseBody(Builder builder) {
        this.description = builder.description;
        this.flows = builder.flows;
        this.name = builder.name;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSceneResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return flows
     */
    public java.util.List<Flows> getFlows() {
        return this.flows;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String description; 
        private java.util.List<Flows> flows; 
        private String name; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSceneResponseBody model) {
            this.description = model.description;
            this.flows = model.flows;
            this.name = model.name;
            this.requestId = model.requestId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Flows.
         */
        public Builder flows(java.util.List<Flows> flows) {
            this.flows = flows;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B8987BF7-6028-5B17-80E0-251B7BD67BBA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSceneResponseBody build() {
            return new GetSceneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSceneResponseBody} extends {@link TeaModel}
     *
     * <p>GetSceneResponseBody</p>
     */
    public static class Flows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowCode")
        private String flowCode;

        @com.aliyun.core.annotation.NameInMap("FlowName")
        private String flowName;

        private Flows(Builder builder) {
            this.flowCode = builder.flowCode;
            this.flowName = builder.flowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Flows create() {
            return builder().build();
        }

        /**
         * @return flowCode
         */
        public String getFlowCode() {
            return this.flowCode;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        public static final class Builder {
            private String flowCode; 
            private String flowName; 

            private Builder() {
            } 

            private Builder(Flows model) {
                this.flowCode = model.flowCode;
                this.flowName = model.flowName;
            } 

            /**
             * FlowCode.
             */
            public Builder flowCode(String flowCode) {
                this.flowCode = flowCode;
                return this;
            }

            /**
             * FlowName.
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            public Flows build() {
                return new Flows(this);
            } 

        } 

    }
}
