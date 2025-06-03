// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetFileVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileVersionResponseBody</p>
 */
public class GetFileVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetFileVersionResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileVersionResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetFileVersionResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the file version.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid.Tenant.ConnectionNotExists</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The connection does not exist.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
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

        public GetFileVersionResponseBody build() {
            return new GetFileVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileVersionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeType")
        private String changeType;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CommitTime")
        private Long commitTime;

        @com.aliyun.core.annotation.NameInMap("CommitUser")
        private String commitUser;

        @com.aliyun.core.annotation.NameInMap("FileContent")
        private String fileContent;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FilePropertyContent")
        private String filePropertyContent;

        @com.aliyun.core.annotation.NameInMap("FileVersion")
        private Integer fileVersion;

        @com.aliyun.core.annotation.NameInMap("IsCurrentProd")
        private Boolean isCurrentProd;

        @com.aliyun.core.annotation.NameInMap("NodeContent")
        private String nodeContent;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UseType")
        private String useType;

        private Data(Builder builder) {
            this.changeType = builder.changeType;
            this.comment = builder.comment;
            this.commitTime = builder.commitTime;
            this.commitUser = builder.commitUser;
            this.fileContent = builder.fileContent;
            this.fileName = builder.fileName;
            this.filePropertyContent = builder.filePropertyContent;
            this.fileVersion = builder.fileVersion;
            this.isCurrentProd = builder.isCurrentProd;
            this.nodeContent = builder.nodeContent;
            this.nodeId = builder.nodeId;
            this.status = builder.status;
            this.useType = builder.useType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return changeType
         */
        public String getChangeType() {
            return this.changeType;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return commitTime
         */
        public Long getCommitTime() {
            return this.commitTime;
        }

        /**
         * @return commitUser
         */
        public String getCommitUser() {
            return this.commitUser;
        }

        /**
         * @return fileContent
         */
        public String getFileContent() {
            return this.fileContent;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return filePropertyContent
         */
        public String getFilePropertyContent() {
            return this.filePropertyContent;
        }

        /**
         * @return fileVersion
         */
        public Integer getFileVersion() {
            return this.fileVersion;
        }

        /**
         * @return isCurrentProd
         */
        public Boolean getIsCurrentProd() {
            return this.isCurrentProd;
        }

        /**
         * @return nodeContent
         */
        public String getNodeContent() {
            return this.nodeContent;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return useType
         */
        public String getUseType() {
            return this.useType;
        }

        public static final class Builder {
            private String changeType; 
            private String comment; 
            private Long commitTime; 
            private String commitUser; 
            private String fileContent; 
            private String fileName; 
            private String filePropertyContent; 
            private Integer fileVersion; 
            private Boolean isCurrentProd; 
            private String nodeContent; 
            private Long nodeId; 
            private String status; 
            private String useType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.changeType = model.changeType;
                this.comment = model.comment;
                this.commitTime = model.commitTime;
                this.commitUser = model.commitUser;
                this.fileContent = model.fileContent;
                this.fileName = model.fileName;
                this.filePropertyContent = model.filePropertyContent;
                this.fileVersion = model.fileVersion;
                this.isCurrentProd = model.isCurrentProd;
                this.nodeContent = model.nodeContent;
                this.nodeId = model.nodeId;
                this.status = model.status;
                this.useType = model.useType;
            } 

            /**
             * <p>The type of the change to the file of the current version. Valid values: CREATE, UPDATE, and DELETE.</p>
             * 
             * <strong>example:</strong>
             * <p>UPDATE</p>
             */
            public Builder changeType(String changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * <p>The description of the file version.</p>
             * 
             * <strong>example:</strong>
             * <p>Second version submission</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The time when the file version was generated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1593881265000</p>
             */
            public Builder commitTime(Long commitTime) {
                this.commitTime = commitTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to generate the file of the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>7384234****</p>
             */
            public Builder commitUser(String commitUser) {
                this.commitUser = commitUser;
                return this;
            }

            /**
             * <p>The code in the file of the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>SHOW TABLES;</p>
             */
            public Builder fileContent(String fileContent) {
                this.fileContent = fileContent;
                return this;
            }

            /**
             * <p>The name of the file of the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>ods_user_info_d</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The basic information about the file of the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;fileName&quot;:&quot;ods_user_info_d&quot;,&quot;fileType&quot;:10}</p>
             */
            public Builder filePropertyContent(String filePropertyContent) {
                this.filePropertyContent = filePropertyContent;
                return this;
            }

            /**
             * <p>The file version.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder fileVersion(Integer fileVersion) {
                this.fileVersion = fileVersion;
                return this;
            }

            /**
             * <p>Indicates whether the version is the latest version in the production environment. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCurrentProd(Boolean isCurrentProd) {
                this.isCurrentProd = isCurrentProd;
                return this;
            }

            /**
             * <p>The scheduling configurations of the node that corresponds to the file of the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cycleType&quot;:0,&quot;cronExpress&quot;:&quot;00 05 00 * * ?&quot;}</p>
             */
            public Builder nodeContent(String nodeContent) {
                this.nodeContent = nodeContent;
                return this;
            }

            /**
             * <p>The ID of the node that corresponds to the file version.</p>
             * 
             * <strong>example:</strong>
             * <p>3000001</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The status of the file version. Valid values:</p>
             * <ul>
             * <li>COMMITTING</li>
             * <li>COMMITTED or CHECK_OK</li>
             * <li>PACKAGED</li>
             * <li>DEPLOYING</li>
             * <li>DEPLOYED</li>
             * <li>CANCELLED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMMITTED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The module to which the file belongs. Valid values:</p>
             * <ul>
             * <li>0: NORMAL, which indicates that the file is used for DataStudio.</li>
             * <li>1: MANUAL, which indicates that the file is used for a manually triggered node.</li>
             * <li>2: MANUAL_BIZ, which indicates that the file is used for a manually triggered workflow.</li>
             * <li>3: SKIP, which indicates that the file is used for a dry-run node in DataStudio.</li>
             * <li>10: ADHOCQUERY, which indicates that the file is used for an ad hoc query.</li>
             * <li>30: COMPONENT, which indicates that the file is used for a script template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder useType(String useType) {
                this.useType = useType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
