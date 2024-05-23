// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLdpsComputeGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetLdpsComputeGroupResponseBody</p>
 */
public class GetLdpsComputeGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("Properties")
    private java.util.Map < String, ? > properties;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLdpsComputeGroupResponseBody(Builder builder) {
        this.groupName = builder.groupName;
        this.properties = builder.properties;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLdpsComputeGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return properties
     */
    public java.util.Map < String, ? > getProperties() {
        return this.properties;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String groupName; 
        private java.util.Map < String, ? > properties; 
        private String requestId; 

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * Properties.
         */
        public Builder properties(java.util.Map < String, ? > properties) {
            this.properties = properties;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLdpsComputeGroupResponseBody build() {
            return new GetLdpsComputeGroupResponseBody(this);
        } 

    } 

}
