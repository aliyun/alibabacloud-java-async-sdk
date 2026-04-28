// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link FileTaskResultResponse} extends {@link TeaModel}
 *
 * <p>FileTaskResultResponse</p>
 */
public class FileTaskResultResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("err_code")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("rst_file")
    private FileIDInfo rstFile;

    @com.aliyun.core.annotation.NameInMap("src_file")
    private FileIDInfo srcFile;

    private FileTaskResultResponse(BuilderImpl builder) {
        super(builder);
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.rstFile = builder.rstFile;
        this.srcFile = builder.srcFile;
    }

    public static FileTaskResultResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return rstFile
     */
    public FileIDInfo getRstFile() {
        return this.rstFile;
    }

    /**
     * @return srcFile
     */
    public FileIDInfo getSrcFile() {
        return this.srcFile;
    }

    public interface Builder extends Response.Builder<FileTaskResultResponse, Builder> {

        Builder errCode(String errCode);

        Builder message(String message);

        Builder rstFile(FileIDInfo rstFile);

        Builder srcFile(FileIDInfo srcFile);

        @Override
        FileTaskResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FileTaskResultResponse, Builder>
            implements Builder {
        private String errCode; 
        private String message; 
        private FileIDInfo rstFile; 
        private FileIDInfo srcFile; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FileTaskResultResponse response) {
            super(response);
            this.errCode = response.errCode;
            this.message = response.message;
            this.rstFile = response.rstFile;
            this.srcFile = response.srcFile;
        } 

        /**
         * err_code.
         */
        @Override
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * message.
         */
        @Override
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * rst_file.
         */
        @Override
        public Builder rstFile(FileIDInfo rstFile) {
            this.rstFile = rstFile;
            return this;
        }

        /**
         * src_file.
         */
        @Override
        public Builder srcFile(FileIDInfo srcFile) {
            this.srcFile = srcFile;
            return this;
        }

        @Override
        public FileTaskResultResponse build() {
            return new FileTaskResultResponse(this);
        } 

    } 

}
