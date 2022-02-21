// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectsResponseBody</p>
 */
public class ListProjectsResponseBody extends TeaModel {
    @NameInMap("NextMarker")
    private String nextMarker;

    @NameInMap("Projects")
    private java.util.List < Projects> projects;

    @NameInMap("RequestId")
    private String requestId;

    private ListProjectsResponseBody(Builder builder) {
        this.nextMarker = builder.nextMarker;
        this.projects = builder.projects;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * @return projects
     */
    public java.util.List < Projects> getProjects() {
        return this.projects;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextMarker; 
        private java.util.List < Projects> projects; 
        private String requestId; 

        /**
         * NextMarker.
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        /**
         * Projects.
         */
        public Builder projects(java.util.List < Projects> projects) {
            this.projects = projects;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProjectsResponseBody build() {
            return new ListProjectsResponseBody(this);
        } 

    } 

    public static class Projects extends TeaModel {
        @NameInMap("BillingType")
        private String billingType;

        @NameInMap("CU")
        private Integer CU;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("Project")
        private String project;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ServiceRole")
        private String serviceRole;

        @NameInMap("Type")
        private String type;

        private Projects(Builder builder) {
            this.billingType = builder.billingType;
            this.CU = builder.CU;
            this.createTime = builder.createTime;
            this.endpoint = builder.endpoint;
            this.modifyTime = builder.modifyTime;
            this.project = builder.project;
            this.regionId = builder.regionId;
            this.serviceRole = builder.serviceRole;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Projects create() {
            return builder().build();
        }

        /**
         * @return billingType
         */
        public String getBillingType() {
            return this.billingType;
        }

        /**
         * @return CU
         */
        public Integer getCU() {
            return this.CU;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serviceRole
         */
        public String getServiceRole() {
            return this.serviceRole;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String billingType; 
            private Integer CU; 
            private String createTime; 
            private String endpoint; 
            private String modifyTime; 
            private String project; 
            private String regionId; 
            private String serviceRole; 
            private String type; 

            /**
             * BillingType.
             */
            public Builder billingType(String billingType) {
                this.billingType = billingType;
                return this;
            }

            /**
             * CU.
             */
            public Builder CU(Integer CU) {
                this.CU = CU;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ServiceRole.
             */
            public Builder serviceRole(String serviceRole) {
                this.serviceRole = serviceRole;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Projects build() {
                return new Projects(this);
            } 

        } 

    }
}
