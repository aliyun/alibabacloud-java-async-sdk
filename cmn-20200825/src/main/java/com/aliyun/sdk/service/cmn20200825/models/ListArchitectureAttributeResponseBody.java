// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListArchitectureAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ListArchitectureAttributeResponseBody</p>
 */
public class ListArchitectureAttributeResponseBody extends TeaModel {
    @NameInMap("Architecture")
    private java.util.List < Architecture> architecture;

    @NameInMap("RequestId")
    private String requestId;

    private ListArchitectureAttributeResponseBody(Builder builder) {
        this.architecture = builder.architecture;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListArchitectureAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return architecture
     */
    public java.util.List < Architecture> getArchitecture() {
        return this.architecture;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Architecture> architecture; 
        private String requestId; 

        /**
         * Architecture.
         */
        public Builder architecture(java.util.List < Architecture> architecture) {
            this.architecture = architecture;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListArchitectureAttributeResponseBody build() {
            return new ListArchitectureAttributeResponseBody(this);
        } 

    } 

    public static class Architecture extends TeaModel {
        @NameInMap("Model")
        private java.util.List < String > model;

        @NameInMap("Role")
        private java.util.List < String > role;

        @NameInMap("Vendor")
        private java.util.List < String > vendor;

        private Architecture(Builder builder) {
            this.model = builder.model;
            this.role = builder.role;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Architecture create() {
            return builder().build();
        }

        /**
         * @return model
         */
        public java.util.List < String > getModel() {
            return this.model;
        }

        /**
         * @return role
         */
        public java.util.List < String > getRole() {
            return this.role;
        }

        /**
         * @return vendor
         */
        public java.util.List < String > getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private java.util.List < String > model; 
            private java.util.List < String > role; 
            private java.util.List < String > vendor; 

            /**
             * Model.
             */
            public Builder model(java.util.List < String > model) {
                this.model = model;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(java.util.List < String > role) {
                this.role = role;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(java.util.List < String > vendor) {
                this.vendor = vendor;
                return this;
            }

            public Architecture build() {
                return new Architecture(this);
            } 

        } 

    }
}
