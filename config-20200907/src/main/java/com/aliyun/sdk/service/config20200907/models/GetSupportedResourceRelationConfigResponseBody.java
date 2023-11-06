// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSupportedResourceRelationConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetSupportedResourceRelationConfigResponseBody</p>
 */
public class GetSupportedResourceRelationConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceRelationConfigList")
    private java.util.List < ResourceRelationConfigList> resourceRelationConfigList;

    private GetSupportedResourceRelationConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceRelationConfigList = builder.resourceRelationConfigList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSupportedResourceRelationConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceRelationConfigList
     */
    public java.util.List < ResourceRelationConfigList> getResourceRelationConfigList() {
        return this.resourceRelationConfigList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResourceRelationConfigList> resourceRelationConfigList; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The supported resource relationships.
         */
        public Builder resourceRelationConfigList(java.util.List < ResourceRelationConfigList> resourceRelationConfigList) {
            this.resourceRelationConfigList = resourceRelationConfigList;
            return this;
        }

        public GetSupportedResourceRelationConfigResponseBody build() {
            return new GetSupportedResourceRelationConfigResponseBody(this);
        } 

    } 

    public static class ResourceRelationConfigList extends TeaModel {
        @NameInMap("RelationType")
        private String relationType;

        @NameInMap("TargetResourceType")
        private String targetResourceType;

        private ResourceRelationConfigList(Builder builder) {
            this.relationType = builder.relationType;
            this.targetResourceType = builder.targetResourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceRelationConfigList create() {
            return builder().build();
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        /**
         * @return targetResourceType
         */
        public String getTargetResourceType() {
            return this.targetResourceType;
        }

        public static final class Builder {
            private String relationType; 
            private String targetResourceType; 

            /**
             * The relationship type.
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * The resource type.
             */
            public Builder targetResourceType(String targetResourceType) {
                this.targetResourceType = targetResourceType;
                return this;
            }

            public ResourceRelationConfigList build() {
                return new ResourceRelationConfigList(this);
            } 

        } 

    }
}
