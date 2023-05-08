// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceCatalogResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceCatalogResponseBody</p>
 */
public class ListInstanceCatalogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Vendors")
    private java.util.List < Vendors> vendors;

    private ListInstanceCatalogResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vendors = builder.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceCatalogResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendors
     */
    public java.util.List < Vendors> getVendors() {
        return this.vendors;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Vendors> vendors; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Vendors.
         */
        public Builder vendors(java.util.List < Vendors> vendors) {
            this.vendors = vendors;
            return this;
        }

        public ListInstanceCatalogResponseBody build() {
            return new ListInstanceCatalogResponseBody(this);
        } 

    } 

    public static class InstanceSubTypes extends TeaModel {
        @NameInMap("Name")
        private String name;

        private InstanceSubTypes(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSubTypes create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public InstanceSubTypes build() {
                return new InstanceSubTypes(this);
            } 

        } 

    }
    public static class InstanceTypes extends TeaModel {
        @NameInMap("InstanceSubTypes")
        private java.util.List < InstanceSubTypes> instanceSubTypes;

        @NameInMap("Name")
        private String name;

        private InstanceTypes(Builder builder) {
            this.instanceSubTypes = builder.instanceSubTypes;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypes create() {
            return builder().build();
        }

        /**
         * @return instanceSubTypes
         */
        public java.util.List < InstanceSubTypes> getInstanceSubTypes() {
            return this.instanceSubTypes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < InstanceSubTypes> instanceSubTypes; 
            private String name; 

            /**
             * InstanceSubTypes.
             */
            public Builder instanceSubTypes(java.util.List < InstanceSubTypes> instanceSubTypes) {
                this.instanceSubTypes = instanceSubTypes;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
    public static class Vendors extends TeaModel {
        @NameInMap("InstanceTypes")
        private java.util.List < InstanceTypes> instanceTypes;

        @NameInMap("Name")
        private String name;

        private Vendors(Builder builder) {
            this.instanceTypes = builder.instanceTypes;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vendors create() {
            return builder().build();
        }

        /**
         * @return instanceTypes
         */
        public java.util.List < InstanceTypes> getInstanceTypes() {
            return this.instanceTypes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < InstanceTypes> instanceTypes; 
            private String name; 

            /**
             * InstanceTypes.
             */
            public Builder instanceTypes(java.util.List < InstanceTypes> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Vendors build() {
                return new Vendors(this);
            } 

        } 

    }
}
