// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListPackagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPackagesResponseBody</p>
 */
public class ListPackagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListPackagesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc3b4aa16677927210252786e4cb6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPackagesResponseBody build() {
            return new ListPackagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPackagesResponseBody</p>
     */
    public static class CreatedPackages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("name")
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

            private Builder() {
            } 

            private Builder(CreatedPackages model) {
                this.createTime = model.createTime;
                this.name = model.name;
            } 

            /**
             * <p>The time when the package was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-02T02:30:34Z</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the package.</p>
             * 
             * <strong>example:</strong>
             * <p>packageA</p>
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
    /**
     * 
     * {@link ListPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPackagesResponseBody</p>
     */
    public static class InstalledPackages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("installTime")
        private Long installTime;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("sourceProject")
        private String sourceProject;

        @com.aliyun.core.annotation.NameInMap("status")
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

            private Builder() {
            } 

            private Builder(InstalledPackages model) {
                this.installTime = model.installTime;
                this.name = model.name;
                this.sourceProject = model.sourceProject;
                this.status = model.status;
            } 

            /**
             * <p>The time when the package was installed.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-02T02:30:34Z</p>
             */
            public Builder installTime(Long installTime) {
                this.installTime = installTime;
                return this;
            }

            /**
             * <p>The name of the package.</p>
             * 
             * <strong>example:</strong>
             * <p>packageB</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The project to which the package belongs. This parameter is required if the package is installed in the MaxCompute project.</p>
             * 
             * <strong>example:</strong>
             * <p>projectB</p>
             */
            public Builder sourceProject(String sourceProject) {
                this.sourceProject = sourceProject;
                return this;
            }

            /**
             * <p>The status of the package.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
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
    /**
     * 
     * {@link ListPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPackagesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdPackages")
        private java.util.List<CreatedPackages> createdPackages;

        @com.aliyun.core.annotation.NameInMap("installedPackages")
        private java.util.List<InstalledPackages> installedPackages;

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
        public java.util.List<CreatedPackages> getCreatedPackages() {
            return this.createdPackages;
        }

        /**
         * @return installedPackages
         */
        public java.util.List<InstalledPackages> getInstalledPackages() {
            return this.installedPackages;
        }

        public static final class Builder {
            private java.util.List<CreatedPackages> createdPackages; 
            private java.util.List<InstalledPackages> installedPackages; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdPackages = model.createdPackages;
                this.installedPackages = model.installedPackages;
            } 

            /**
             * <p>The packages that were created.</p>
             */
            public Builder createdPackages(java.util.List<CreatedPackages> createdPackages) {
                this.createdPackages = createdPackages;
                return this;
            }

            /**
             * <p>The packages that were installed.</p>
             */
            public Builder installedPackages(java.util.List<InstalledPackages> installedPackages) {
                this.installedPackages = installedPackages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
