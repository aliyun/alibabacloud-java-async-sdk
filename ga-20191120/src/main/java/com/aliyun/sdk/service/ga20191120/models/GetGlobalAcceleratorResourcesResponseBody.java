// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link GetGlobalAcceleratorResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>GetGlobalAcceleratorResourcesResponseBody</p>
 */
public class GetGlobalAcceleratorResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssociatedResources")
    private java.util.List<AssociatedResources> associatedResources;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetGlobalAcceleratorResourcesResponseBody(Builder builder) {
        this.associatedResources = builder.associatedResources;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGlobalAcceleratorResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return associatedResources
     */
    public java.util.List<AssociatedResources> getAssociatedResources() {
        return this.associatedResources;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AssociatedResources> associatedResources; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetGlobalAcceleratorResourcesResponseBody model) {
            this.associatedResources = model.associatedResources;
            this.requestId = model.requestId;
        } 

        /**
         * AssociatedResources.
         */
        public Builder associatedResources(java.util.List<AssociatedResources> associatedResources) {
            this.associatedResources = associatedResources;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGlobalAcceleratorResourcesResponseBody build() {
            return new GetGlobalAcceleratorResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGlobalAcceleratorResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>GetGlobalAcceleratorResourcesResponseBody</p>
     */
    public static class AssociatedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceleratorId")
        private String acceleratorId;

        @com.aliyun.core.annotation.NameInMap("AssociatedMode")
        private String associatedMode;

        @com.aliyun.core.annotation.NameInMap("AssociatedResourceId")
        private String associatedResourceId;

        @com.aliyun.core.annotation.NameInMap("AssociatedResourceRegionId")
        private String associatedResourceRegionId;

        @com.aliyun.core.annotation.NameInMap("AssociatedResourceType")
        private String associatedResourceType;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private AssociatedResources(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.associatedMode = builder.associatedMode;
            this.associatedResourceId = builder.associatedResourceId;
            this.associatedResourceRegionId = builder.associatedResourceRegionId;
            this.associatedResourceType = builder.associatedResourceType;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedResources create() {
            return builder().build();
        }

        /**
         * @return acceleratorId
         */
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        /**
         * @return associatedMode
         */
        public String getAssociatedMode() {
            return this.associatedMode;
        }

        /**
         * @return associatedResourceId
         */
        public String getAssociatedResourceId() {
            return this.associatedResourceId;
        }

        /**
         * @return associatedResourceRegionId
         */
        public String getAssociatedResourceRegionId() {
            return this.associatedResourceRegionId;
        }

        /**
         * @return associatedResourceType
         */
        public String getAssociatedResourceType() {
            return this.associatedResourceType;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String acceleratorId; 
            private String associatedMode; 
            private String associatedResourceId; 
            private String associatedResourceRegionId; 
            private String associatedResourceType; 
            private String state; 

            private Builder() {
            } 

            private Builder(AssociatedResources model) {
                this.acceleratorId = model.acceleratorId;
                this.associatedMode = model.associatedMode;
                this.associatedResourceId = model.associatedResourceId;
                this.associatedResourceRegionId = model.associatedResourceRegionId;
                this.associatedResourceType = model.associatedResourceType;
                this.state = model.state;
            } 

            /**
             * AcceleratorId.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * AssociatedMode.
             */
            public Builder associatedMode(String associatedMode) {
                this.associatedMode = associatedMode;
                return this;
            }

            /**
             * AssociatedResourceId.
             */
            public Builder associatedResourceId(String associatedResourceId) {
                this.associatedResourceId = associatedResourceId;
                return this;
            }

            /**
             * AssociatedResourceRegionId.
             */
            public Builder associatedResourceRegionId(String associatedResourceRegionId) {
                this.associatedResourceRegionId = associatedResourceRegionId;
                return this;
            }

            /**
             * AssociatedResourceType.
             */
            public Builder associatedResourceType(String associatedResourceType) {
                this.associatedResourceType = associatedResourceType;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public AssociatedResources build() {
                return new AssociatedResources(this);
            } 

        } 

    }
}
