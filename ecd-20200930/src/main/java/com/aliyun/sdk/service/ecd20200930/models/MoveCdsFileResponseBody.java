// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link MoveCdsFileResponseBody} extends {@link TeaModel}
 *
 * <p>MoveCdsFileResponseBody</p>
 */
public class MoveCdsFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("MoveCdsFileModel")
    private MoveCdsFileModel moveCdsFileModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private MoveCdsFileResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.moveCdsFileModel = builder.moveCdsFileModel;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveCdsFileResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return moveCdsFileModel
     */
    public MoveCdsFileModel getMoveCdsFileModel() {
        return this.moveCdsFileModel;
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
        private String message; 
        private MoveCdsFileModel moveCdsFileModel; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(MoveCdsFileResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.moveCdsFileModel = model.moveCdsFileModel;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The result of the modification. A value of success indicates that the modification is successful. If the modification failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message that is returned. This parameter is not returned if the value of Code is success.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The response object when you move a file.</p>
         */
        public Builder moveCdsFileModel(MoveCdsFileModel moveCdsFileModel) {
            this.moveCdsFileModel = moveCdsFileModel;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><!-- -->
         * 
         * <p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><!-- -->
         * 
         * <p>false</p>
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public MoveCdsFileResponseBody build() {
            return new MoveCdsFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MoveCdsFileResponseBody} extends {@link TeaModel}
     *
     * <p>MoveCdsFileResponseBody</p>
     */
    public static class MoveCdsFileModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsyncTaskId")
        private String asyncTaskId;

        @com.aliyun.core.annotation.NameInMap("Exist")
        private Boolean exist;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        private MoveCdsFileModel(Builder builder) {
            this.asyncTaskId = builder.asyncTaskId;
            this.exist = builder.exist;
            this.fileId = builder.fileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MoveCdsFileModel create() {
            return builder().build();
        }

        /**
         * @return asyncTaskId
         */
        public String getAsyncTaskId() {
            return this.asyncTaskId;
        }

        /**
         * @return exist
         */
        public Boolean getExist() {
            return this.exist;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        public static final class Builder {
            private String asyncTaskId; 
            private Boolean exist; 
            private String fileId; 

            private Builder() {
            } 

            private Builder(MoveCdsFileModel model) {
                this.asyncTaskId = model.asyncTaskId;
                this.exist = model.exist;
                this.fileId = model.fileId;
            } 

            /**
             * <p>The ID of the asynchronous task. This parameter is not returned if you copy files. This parameter is returned if you copy folders in the backend in an asynchronous manner. You can call the GetAsyncTask operation to obtain the ID and details of an asynchronous task.</p>
             * 
             * <strong>example:</strong>
             * <p>fe307518-825a-4c8b-a69c-958f0e8a****</p>
             */
            public Builder asyncTaskId(String asyncTaskId) {
                this.asyncTaskId = asyncTaskId;
                return this;
            }

            /**
             * <p>Indicates whether the file exists.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><!-- -->
             * 
             * <p>true</p>
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><!-- -->
             * 
             * <p>false</p>
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder exist(Boolean exist) {
                this.exist = exist;
                return this;
            }

            /**
             * <p>The ID of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>63636837e47e5a24a8a940218bef395c210e****</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            public MoveCdsFileModel build() {
                return new MoveCdsFileModel(this);
            } 

        } 

    }
}
