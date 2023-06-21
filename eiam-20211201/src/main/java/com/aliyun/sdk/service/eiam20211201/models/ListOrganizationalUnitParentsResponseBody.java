// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrganizationalUnitParentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrganizationalUnitParentsResponseBody</p>
 */
public class ListOrganizationalUnitParentsResponseBody extends TeaModel {
    @NameInMap("Parents")
    private java.util.List < Parents> parents;

    @NameInMap("RequestId")
    private String requestId;

    private ListOrganizationalUnitParentsResponseBody(Builder builder) {
        this.parents = builder.parents;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationalUnitParentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return parents
     */
    public java.util.List < Parents> getParents() {
        return this.parents;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Parents> parents; 
        private String requestId; 

        /**
         * Parents.
         */
        public Builder parents(java.util.List < Parents> parents) {
            this.parents = parents;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListOrganizationalUnitParentsResponseBody build() {
            return new ListOrganizationalUnitParentsResponseBody(this);
        } 

    } 

    public static class Parents extends TeaModel {
        @NameInMap("OrganizationalUnitId")
        private String organizationalUnitId;

        @NameInMap("ParentId")
        private String parentId;

        private Parents(Builder builder) {
            this.organizationalUnitId = builder.organizationalUnitId;
            this.parentId = builder.parentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parents create() {
            return builder().build();
        }

        /**
         * @return organizationalUnitId
         */
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        public static final class Builder {
            private String organizationalUnitId; 
            private String parentId; 

            /**
             * 组织ID
             */
            public Builder organizationalUnitId(String organizationalUnitId) {
                this.organizationalUnitId = organizationalUnitId;
                return this;
            }

            /**
             * 父组织ID
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            public Parents build() {
                return new Parents(this);
            } 

        } 

    }
}
