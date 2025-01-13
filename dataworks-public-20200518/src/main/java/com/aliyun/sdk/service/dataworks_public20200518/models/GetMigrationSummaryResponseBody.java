// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetMigrationSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetMigrationSummaryResponseBody</p>
 */
public class GetMigrationSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetMigrationSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMigrationSummaryResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The details of the migration task.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. You can use the request ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>19999A96-71BA-2845-B455-ED620EF4E37F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMigrationSummaryResponseBody build() {
            return new GetMigrationSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMigrationSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetMigrationSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("MigrationId")
        private Long migrationId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OpUser")
        private String opUser;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.createUser = builder.createUser;
            this.downloadUrl = builder.downloadUrl;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.migrationId = builder.migrationId;
            this.name = builder.name;
            this.opUser = builder.opUser;
            this.projectId = builder.projectId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return migrationId
         */
        public Long getMigrationId() {
            return this.migrationId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return opUser
         */
        public String getOpUser() {
            return this.opUser;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createUser; 
            private String downloadUrl; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long migrationId; 
            private String name; 
            private String opUser; 
            private Long projectId; 
            private String status; 

            /**
             * <p>The ID of the user who created the task.</p>
             * 
             * <strong>example:</strong>
             * <p>982293332403****</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The URL that is used to download the package of the export task. You can use the URL to download the package of the export task.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://shanghai-xxx-oss.oss-cn-shanghai.aliyuncs.com/pre/store/f10_bf47_b4fa7df0860f.zip?Expires=1639540903&OSSAccessKeyId=XXXXXXeF4Lv5j&Signature=qxxxxx">https://shanghai-xxx-oss.oss-cn-shanghai.aliyuncs.com/pre/store/f10_bf47_b4fa7df0860f.zip?Expires=1639540903&amp;OSSAccessKeyId=XXXXXXeF4Lv5j&amp;Signature=qxxxxx</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1589904000000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the task was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1589904000000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder migrationId(Long migrationId) {
                this.migrationId = migrationId;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_export_01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the user who managed the task.</p>
             * 
             * <strong>example:</strong>
             * <p>982293332403****</p>
             */
            public Builder opUser(String opUser) {
                this.opUser = opUser;
                return this;
            }

            /**
             * <p>The ID of the DataWorks workspace to which the migration task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The status of the migration task. Valid values:</p>
             * <ul>
             * <li>INIT</li>
             * <li>EDITING</li>
             * <li>IMPORTING</li>
             * <li>IMPORT_ERROR</li>
             * <li>IMPORT_SUCCESS</li>
             * <li>EXPORTING</li>
             * <li>EXPORT_ERROR</li>
             * <li>EXPORT_SUCCESS</li>
             * <li>REVOKED</li>
             * <li>PARTIAL_SUCCESS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EXPORT_SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
