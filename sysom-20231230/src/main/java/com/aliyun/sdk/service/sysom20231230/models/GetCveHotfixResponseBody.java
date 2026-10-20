// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetCveHotfixResponseBody} extends {@link TeaModel}
 *
 * <p>GetCveHotfixResponseBody</p>
 */
public class GetCveHotfixResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetCveHotfixResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCveHotfixResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCveHotfixResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * <ul>
         * <li>If <code>code == Success</code>, the authorization is successful.</li>
         * <li>Other status codes indicate that the authorization failed. If the authorization failed, check the <code>message</code> field for the detailed fault information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * <ul>
         * <li>If <code>code == Success</code>, this field is empty.</li>
         * <li>Otherwise, this field contains the request error message.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>example-request-id</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCveHotfixResponseBody build() {
            return new GetCveHotfixResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCveHotfixResponseBody} extends {@link TeaModel}
     *
     * <p>GetCveHotfixResponseBody</p>
     */
    public static class Packages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arch")
        private String arch;

        @com.aliyun.core.annotation.NameInMap("distro")
        private String distro;

        @com.aliyun.core.annotation.NameInMap("kernelVersion")
        private String kernelVersion;

        @com.aliyun.core.annotation.NameInMap("rpmNevra")
        private String rpmNevra;

        private Packages(Builder builder) {
            this.arch = builder.arch;
            this.distro = builder.distro;
            this.kernelVersion = builder.kernelVersion;
            this.rpmNevra = builder.rpmNevra;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Packages create() {
            return builder().build();
        }

        /**
         * @return arch
         */
        public String getArch() {
            return this.arch;
        }

        /**
         * @return distro
         */
        public String getDistro() {
            return this.distro;
        }

        /**
         * @return kernelVersion
         */
        public String getKernelVersion() {
            return this.kernelVersion;
        }

        /**
         * @return rpmNevra
         */
        public String getRpmNevra() {
            return this.rpmNevra;
        }

        public static final class Builder {
            private String arch; 
            private String distro; 
            private String kernelVersion; 
            private String rpmNevra; 

            private Builder() {
            } 

            private Builder(Packages model) {
                this.arch = model.arch;
                this.distro = model.distro;
                this.kernelVersion = model.kernelVersion;
                this.rpmNevra = model.rpmNevra;
            } 

            /**
             * <p>The architecture.</p>
             * 
             * <strong>example:</strong>
             * <p>x86_64</p>
             */
            public Builder arch(String arch) {
                this.arch = arch;
                return this;
            }

            /**
             * <p>The distribution. This value is null if the distribution is not registered.</p>
             * 
             * <strong>example:</strong>
             * <p>alinux3</p>
             */
            public Builder distro(String distro) {
                this.distro = distro;
                return this;
            }

            /**
             * <p>The compatible full kernel version.</p>
             * 
             * <strong>example:</strong>
             * <p>5.10.134-18.al8.x86_64</p>
             */
            public Builder kernelVersion(String kernelVersion) {
                this.kernelVersion = kernelVersion;
                return this;
            }

            /**
             * <p>The RPM package identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>kernel-hotfix-example-1.0-1.x86_64</p>
             */
            public Builder rpmNevra(String rpmNevra) {
                this.rpmNevra = rpmNevra;
                return this;
            }

            public Packages build() {
                return new Packages(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCveHotfixResponseBody} extends {@link TeaModel}
     *
     * <p>GetCveHotfixResponseBody</p>
     */
    public static class Hotfix extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("hotfixName")
        private String hotfixName;

        @com.aliyun.core.annotation.NameInMap("moduleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("packages")
        private java.util.List<Packages> packages;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Hotfix(Builder builder) {
            this.description = builder.description;
            this.hotfixName = builder.hotfixName;
            this.moduleName = builder.moduleName;
            this.packages = builder.packages;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hotfix create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hotfixName
         */
        public String getHotfixName() {
            return this.hotfixName;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return packages
         */
        public java.util.List<Packages> getPackages() {
            return this.packages;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String description; 
            private String hotfixName; 
            private String moduleName; 
            private java.util.List<Packages> packages; 
            private String version; 

            private Builder() {
            } 

            private Builder(Hotfix model) {
                this.description = model.description;
                this.hotfixName = model.hotfixName;
                this.moduleName = model.moduleName;
                this.packages = model.packages;
                this.version = model.version;
            } 

            /**
             * <p>The hotfix description.</p>
             * 
             * <strong>example:</strong>
             * <p>Fixes the kernel issue corresponding to the CVE</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The hotfix name.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678</p>
             */
            public Builder hotfixName(String hotfixName) {
                this.hotfixName = hotfixName;
                return this;
            }

            /**
             * <p>The hotfix module name.</p>
             * 
             * <strong>example:</strong>
             * <p>kpatch_example</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The list of published packages that meet the kernel requirements.</p>
             */
            public Builder packages(java.util.List<Packages> packages) {
                this.packages = packages;
                return this;
            }

            /**
             * <p>The hotfix version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Hotfix build() {
                return new Hotfix(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCveHotfixResponseBody} extends {@link TeaModel}
     *
     * <p>GetCveHotfixResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cveId")
        private String cveId;

        @com.aliyun.core.annotation.NameInMap("hotfix")
        private Hotfix hotfix;

        private Data(Builder builder) {
            this.cveId = builder.cveId;
            this.hotfix = builder.hotfix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cveId
         */
        public String getCveId() {
            return this.cveId;
        }

        /**
         * @return hotfix
         */
        public Hotfix getHotfix() {
            return this.hotfix;
        }

        public static final class Builder {
            private String cveId; 
            private Hotfix hotfix; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cveId = model.cveId;
                this.hotfix = model.hotfix;
            } 

            /**
             * <p>The CVE ID.</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2026-12345</p>
             */
            public Builder cveId(String cveId) {
                this.cveId = cveId;
                return this;
            }

            /**
             * <p>The hotfix information for the CVE.</p>
             */
            public Builder hotfix(Hotfix hotfix) {
                this.hotfix = hotfix;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
