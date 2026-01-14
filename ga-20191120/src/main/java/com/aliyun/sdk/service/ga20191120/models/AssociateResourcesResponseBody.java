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
 * {@link AssociateResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>AssociateResourcesResponseBody</p>
 */
public class AssociateResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.NameInMap("AssociatedResourceId")
    private String associatedResourceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AssociateResourcesResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.associatedResourceId = builder.associatedResourceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return associatedResourceId
     */
    public String getAssociatedResourceId() {
        return this.associatedResourceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String acceleratorId; 
        private String associatedResourceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AssociateResourcesResponseBody model) {
            this.acceleratorId = model.acceleratorId;
            this.associatedResourceId = model.associatedResourceId;
            this.requestId = model.requestId;
        } 

        /**
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssociateResourcesResponseBody build() {
            return new AssociateResourcesResponseBody(this);
        } 

    } 

}
