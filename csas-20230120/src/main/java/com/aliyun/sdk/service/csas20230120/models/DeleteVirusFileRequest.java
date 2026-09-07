// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link DeleteVirusFileRequest} extends {@link RequestModel}
 *
 * <p>DeleteVirusFileRequest</p>
 */
public class DeleteVirusFileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DevTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String devTag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileMd5")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileMd5;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filePath;

    private DeleteVirusFileRequest(Builder builder) {
        super(builder);
        this.devTag = builder.devTag;
        this.fileMd5 = builder.fileMd5;
        this.filePath = builder.filePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVirusFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return devTag
     */
    public String getDevTag() {
        return this.devTag;
    }

    /**
     * @return fileMd5
     */
    public String getFileMd5() {
        return this.fileMd5;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    public static final class Builder extends Request.Builder<DeleteVirusFileRequest, Builder> {
        private String devTag; 
        private String fileMd5; 
        private String filePath; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVirusFileRequest request) {
            super(request);
            this.devTag = request.devTag;
            this.fileMd5 = request.fileMd5;
            this.filePath = request.filePath;
        } 

        /**
         * <p>The unique identifier of the user\&quot;s endpoint device where the virus file is located. The value can be up to 64 characters in length. You can obtain the value from the following operation:</p>
         * <ul>
         * <li><a href="~~ListVirusFileStatuses~~">ListVirusFileStatuses</a>: lists virus file statuses.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        public Builder devTag(String devTag) {
            this.putBodyParameter("DevTag", devTag);
            this.devTag = devTag;
            return this;
        }

        /**
         * <p>The MD5 value of the virus file. The value must be a 32-character hexadecimal string. You can obtain the value from the following operation:</p>
         * <ul>
         * <li><a href="~~ListVirusFileStatuses~~">ListVirusFileStatuses</a>: lists virus file statuses.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d41d8cd98f00b204e9800998ecf8427e</p>
         */
        public Builder fileMd5(String fileMd5) {
            this.putBodyParameter("FileMd5", fileMd5);
            this.fileMd5 = fileMd5;
            return this;
        }

        /**
         * <p>The full path of the virus file on the user\&quot;s endpoint device. Only records with a handling action of Fail can be deleted. You can obtain the value from the following operation:</p>
         * <ul>
         * <li><a href="~~ListVirusFileStatuses~~">ListVirusFileStatuses</a>: lists virus file statuses.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\Users\Public\Downloads\setup.exe</p>
         */
        public Builder filePath(String filePath) {
            this.putBodyParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        @Override
        public DeleteVirusFileRequest build() {
            return new DeleteVirusFileRequest(this);
        } 

    } 

}
