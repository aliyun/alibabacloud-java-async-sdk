// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListPythonModulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPythonModulesResponseBody</p>
 */
public class ListPythonModulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListPythonModulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPythonModulesResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListPythonModulesResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The backend exception details.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The paged query result with paging details.</p>
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListPythonModulesResponseBody build() {
            return new ListPythonModulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPythonModulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPythonModulesResponseBody</p>
     */
    public static class PythonModuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstallTime")
        private String installTime;

        @com.aliyun.core.annotation.NameInMap("InstallType")
        private String installType;

        @com.aliyun.core.annotation.NameInMap("Installer")
        private String installer;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PythonVersion")
        private String pythonVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private PythonModuleList(Builder builder) {
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.installTime = builder.installTime;
            this.installType = builder.installType;
            this.installer = builder.installer;
            this.name = builder.name;
            this.pythonVersion = builder.pythonVersion;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PythonModuleList create() {
            return builder().build();
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return installTime
         */
        public String getInstallTime() {
            return this.installTime;
        }

        /**
         * @return installType
         */
        public String getInstallType() {
            return this.installType;
        }

        /**
         * @return installer
         */
        public String getInstaller() {
            return this.installer;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pythonVersion
         */
        public String getPythonVersion() {
            return this.pythonVersion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String gmtCreated; 
            private String gmtModified; 
            private Long id; 
            private String installTime; 
            private String installType; 
            private String installer; 
            private String name; 
            private String pythonVersion; 
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(PythonModuleList model) {
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.installTime = model.installTime;
                this.installType = model.installType;
                this.installer = model.installer;
                this.name = model.name;
                this.pythonVersion = model.pythonVersion;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01 10:00:00</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The last update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01 10:00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the Python third-party package.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The installation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01 10:00:00</p>
             */
            public Builder installTime(String installTime) {
                this.installTime = installTime;
                return this;
            }

            /**
             * <p>The installation method. Valid values:</p>
             * <ul>
             * <li>UPLOAD_INSTALL: upload installation package</li>
             * <li>ONLINE_INSTALL: online installation</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UPLOAD_INSTALL</p>
             */
            public Builder installType(String installType) {
                this.installType = installType;
                return this;
            }

            /**
             * <p>The installer.</p>
             * 
             * <strong>example:</strong>
             * <p>30001011</p>
             */
            public Builder installer(String installer) {
                this.installer = installer;
                return this;
            }

            /**
             * <p>The name of the Python third-party package.</p>
             * 
             * <strong>example:</strong>
             * <p>numpy</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Python version. Valid values: PYTHON_2_7, PYTHON_3_7, and PYTHON_3_11.</p>
             * 
             * <strong>example:</strong>
             * <p>PYTHON_3_7</p>
             */
            public Builder pythonVersion(String pythonVersion) {
                this.pythonVersion = pythonVersion;
                return this;
            }

            /**
             * <p>The status of the third-party package. Valid values:</p>
             * <ul>
             * <li>INSTALL_SUCCESS: installation succeeded</li>
             * <li>INSTALL_FAILED: installation failed</li>
             * <li>INSTALLING: installing</li>
             * <li>UPGRADE_SUCCESS: upgrade succeeded</li>
             * <li>UPGRADE_FAILED: upgrade failed</li>
             * <li>UPGRADING: upgrading</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INSTALL_SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The version of the third-party package.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public PythonModuleList build() {
                return new PythonModuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPythonModulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPythonModulesResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PythonModuleList")
        private java.util.List<PythonModuleList> pythonModuleList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageResult(Builder builder) {
            this.pythonModuleList = builder.pythonModuleList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return pythonModuleList
         */
        public java.util.List<PythonModuleList> getPythonModuleList() {
            return this.pythonModuleList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<PythonModuleList> pythonModuleList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.pythonModuleList = model.pythonModuleList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The paginated list of Python third-party packages.</p>
             */
            public Builder pythonModuleList(java.util.List<PythonModuleList> pythonModuleList) {
                this.pythonModuleList = pythonModuleList;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
