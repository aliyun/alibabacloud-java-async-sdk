// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateResourceResponseBody</p>
 */
public class CreateResourceResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @NameInMap("OwnerUid")
    private String ownerUid;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceId")
    private String resourceId;

    @NameInMap("ResourceName")
    private String resourceName;

    private CreateResourceResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.instanceIds = builder.instanceIds;
        this.ownerUid = builder.ownerUid;
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
        this.resourceName = builder.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return ownerUid
     */
    public String getOwnerUid() {
        return this.ownerUid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    public static final class Builder {
        private String clusterId; 
        private java.util.List < String > instanceIds; 
        private String ownerUid; 
        private String requestId; 
        private String resourceId; 
        private String resourceName; 

        /**
         * 资源组所在集群ID
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * 资源组的Owner UID
         */
        public Builder ownerUid(String ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 资源组ID
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * 资源组名称
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public CreateResourceResponseBody build() {
            return new CreateResourceResponseBody(this);
        } 

    } 

}
