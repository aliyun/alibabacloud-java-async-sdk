// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPackagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPackagesResponseBody</p>
 */
public class ListPackagesResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private ListPackagesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPackagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPackagesResponseBody build() {
            return new ListPackagesResponseBody(this);
        } 

    } 

    public static class CreatedPackages extends TeaModel {
        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("name")
        private String name;

        private CreatedPackages(Builder builder) {
            this.createTime = builder.createTime;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreatedPackages create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long createTime; 
            private String name; 

            /**
             * The time when the package was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The name of the package.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CreatedPackages build() {
                return new CreatedPackages(this);
            } 

        } 

    }
    public static class InstalledPackages extends TeaModel {
        @NameInMap("installTime")
        private Long installTime;

        @NameInMap("name")
        private String name;

        @NameInMap("sourceProject")
        private String sourceProject;

        @NameInMap("status")
        private String status;

        private InstalledPackages(Builder builder) {
            this.installTime = builder.installTime;
            this.name = builder.name;
            this.sourceProject = builder.sourceProject;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstalledPackages create() {
            return builder().build();
        }

        /**
         * @return installTime
         */
        public Long getInstallTime() {
            return this.installTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceProject
         */
        public String getSourceProject() {
            return this.sourceProject;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long installTime; 
            private String name; 
            private String sourceProject; 
            private String status; 

            /**
             * The time when the package was installed.
             */
            public Builder installTime(Long installTime) {
                this.installTime = installTime;
                return this;
            }

            /**
             * The name of the package.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The project to which the package belongs. This parameter is required if the package is installed in the MaxCompute project.
             */
            public Builder sourceProject(String sourceProject) {
                this.sourceProject = sourceProject;
                return this;
            }

            /**
             * The status of the package.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InstalledPackages build() {
                return new InstalledPackages(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("createdPackages")
        private java.util.List < CreatedPackages> createdPackages;

        @NameInMap("installedPackages")
        private java.util.List < InstalledPackages> installedPackages;

        private Data(Builder builder) {
            this.createdPackages = builder.createdPackages;
            this.installedPackages = builder.installedPackages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdPackages
         */
        public java.util.List < CreatedPackages> getCreatedPackages() {
            return this.createdPackages;
        }

        /**
         * @return installedPackages
         */
        public java.util.List < InstalledPackages> getInstalledPackages() {
            return this.installedPackages;
        }

        public static final class Builder {
            private java.util.List < CreatedPackages> createdPackages; 
            private java.util.List < InstalledPackages> installedPackages; 

            /**
             * The packages that were created.
             */
            public Builder createdPackages(java.util.List < CreatedPackages> createdPackages) {
                this.createdPackages = createdPackages;
                return this;
            }

            /**
             * The packages that were installed.
             */
            public Builder installedPackages(java.util.List < InstalledPackages> installedPackages) {
                this.installedPackages = installedPackages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
