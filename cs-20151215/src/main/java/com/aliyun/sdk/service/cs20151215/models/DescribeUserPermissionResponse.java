// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserPermissionResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserPermissionResponse</p>
 */
public class DescribeUserPermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < DescribeUserPermissionResponseBody> body;

    private DescribeUserPermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserPermissionResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public java.util.List < DescribeUserPermissionResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserPermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < DescribeUserPermissionResponseBody> body);

        @Override
        DescribeUserPermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserPermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < DescribeUserPermissionResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserPermissionResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List < DescribeUserPermissionResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserPermissionResponse build() {
            return new DescribeUserPermissionResponse(this);
        } 

    } 

    public static class DescribeUserPermissionResponseBody extends TeaModel {
        @NameInMap("resource_id")
        private String resourceId;

        @NameInMap("resource_type")
        private String resourceType;

        @NameInMap("role_name")
        private String roleName;

        @NameInMap("role_type")
        private String roleType;

        @NameInMap("is_owner")
        private Long isOwner;

        @NameInMap("is_ram_role")
        private Long isRamRole;

        private DescribeUserPermissionResponseBody(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.roleName = builder.roleName;
            this.roleType = builder.roleType;
            this.isOwner = builder.isOwner;
            this.isRamRole = builder.isRamRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeUserPermissionResponseBody create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        /**
         * @return isOwner
         */
        public Long getIsOwner() {
            return this.isOwner;
        }

        /**
         * @return isRamRole
         */
        public Long getIsRamRole() {
            return this.isRamRole;
        }

        public static final class Builder {
            private String resourceId; 
            private String resourceType; 
            private String roleName; 
            private String roleType; 
            private Long isOwner; 
            private Long isRamRole; 

            /**
             * ?????????????????????????????????
             * <p>
             * 
             * - ??????????????????????????????????????????`{cluster_id}`???
             * - ????????????????????????????????????????????????`{cluster_id}/{namespace}`???
             * - ?????????????????????????????????????????????`all-clusters`???
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ????????????????????????
             * <p>
             * 
             * - `cluster`??????????????????
             * - `namespace`????????????????????????
             * - `console`?????????????????????????????????????????????????????????????????????
             * 
             * 
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * ???????????????????????????????????????????????????????????????????????????????????????????????????????????????
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * ?????????????????????????????????
             * <p>
             * 
             * - `admin`???????????????
             * - `ops`??????????????????
             * - `dev`??????????????????
             * - `restricted`??????????????????
             * - `custom`??????????????????????????????????????????
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            /**
             * ?????????????????????????????????????????????
             * <p>
             * 
             * - `0`????????????????????????????????????????????????
             * - `1`???????????????????????????????????????????????????????????????
             */
            public Builder isOwner(Long isOwner) {
                this.isOwner = isOwner;
                return this;
            }

            /**
             * ?????????RAM????????????????????????
             * <p>
             * 
             * - `0`???????????????????????????RAM???????????????
             * - `1`????????????????????????RAM???????????????
             * 
             * 
             */
            public Builder isRamRole(Long isRamRole) {
                this.isRamRole = isRamRole;
                return this;
            }

            public DescribeUserPermissionResponseBody build() {
                return new DescribeUserPermissionResponseBody(this);
            } 

        } 

    }
}
