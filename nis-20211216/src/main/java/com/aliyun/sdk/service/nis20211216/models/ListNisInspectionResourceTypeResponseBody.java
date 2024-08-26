// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNisInspectionResourceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ListNisInspectionResourceTypeResponseBody</p>
 */
public class ListNisInspectionResourceTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceTypeList")
    private java.util.List < ResourceTypeList> resourceTypeList;

    private ListNisInspectionResourceTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceTypeList = builder.resourceTypeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNisInspectionResourceTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceTypeList
     */
    public java.util.List < ResourceTypeList> getResourceTypeList() {
        return this.resourceTypeList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResourceTypeList> resourceTypeList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceTypeList.
         */
        public Builder resourceTypeList(java.util.List < ResourceTypeList> resourceTypeList) {
            this.resourceTypeList = resourceTypeList;
            return this;
        }

        public ListNisInspectionResourceTypeResponseBody build() {
            return new ListNisInspectionResourceTypeResponseBody(this);
        } 

    } 

    public static class ResourceTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private ResourceTypeList(Builder builder) {
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTypeList create() {
            return builder().build();
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String resourceType; 

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceTypeList build() {
                return new ResourceTypeList(this);
            } 

        } 

    }
}
