// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link CreateModelRequest} extends {@link RequestModel}
 *
 * <p>CreateModelRequest</p>
 */
public class CreateModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Counts")
    @com.aliyun.core.annotation.Validation(required = true)
    private String counts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileMD5")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileMD5;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelScene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelScene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParameterNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parameterNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserLocalFileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userLocalFileName;

    private CreateModelRequest(Builder builder) {
        super(builder);
        this.bucId = builder.bucId;
        this.counts = builder.counts;
        this.fileMD5 = builder.fileMD5;
        this.filePath = builder.filePath;
        this.modelName = builder.modelName;
        this.modelScene = builder.modelScene;
        this.parameterNum = builder.parameterNum;
        this.regId = builder.regId;
        this.userLocalFileName = builder.userLocalFileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucId
     */
    public String getBucId() {
        return this.bucId;
    }

    /**
     * @return counts
     */
    public String getCounts() {
        return this.counts;
    }

    /**
     * @return fileMD5
     */
    public String getFileMD5() {
        return this.fileMD5;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelScene
     */
    public String getModelScene() {
        return this.modelScene;
    }

    /**
     * @return parameterNum
     */
    public String getParameterNum() {
        return this.parameterNum;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return userLocalFileName
     */
    public String getUserLocalFileName() {
        return this.userLocalFileName;
    }

    public static final class Builder extends Request.Builder<CreateModelRequest, Builder> {
        private String bucId; 
        private String counts; 
        private String fileMD5; 
        private String filePath; 
        private String modelName; 
        private String modelScene; 
        private String parameterNum; 
        private String regId; 
        private String userLocalFileName; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelRequest request) {
            super(request);
            this.bucId = request.bucId;
            this.counts = request.counts;
            this.fileMD5 = request.fileMD5;
            this.filePath = request.filePath;
            this.modelName = request.modelName;
            this.modelScene = request.modelScene;
            this.parameterNum = request.parameterNum;
            this.regId = request.regId;
            this.userLocalFileName = request.userLocalFileName;
        } 

        /**
         * <p>Submitter ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WB01160353</p>
         */
        public Builder bucId(String bucId) {
            this.putQueryParameter("BucId", bucId);
            this.bucId = bucId;
            return this;
        }

        /**
         * <p>Number of file rows.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder counts(String counts) {
            this.putQueryParameter("Counts", counts);
            this.counts = counts;
            return this;
        }

        /**
         * <p>File MD5 value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VC6Sj3u138yfWHLxLl7dtA==</p>
         */
        public Builder fileMD5(String fileMD5) {
            this.putQueryParameter("FileMD5", fileMD5);
            this.fileMD5 = fileMD5;
            return this;
        }

        /**
         * <p>File path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tempCache/ef2387dfb357ffe87925fd51d2b5305b/1665717035328/mockData.csv</p>
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>Model name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>Model scenario.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>saf_ai_account_abuse</p>
         */
        public Builder modelScene(String modelScene) {
            this.putQueryParameter("ModelScene", modelScene);
            this.modelScene = modelScene;
            return this;
        }

        /**
         * <p>Number of file columns.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder parameterNum(String parameterNum) {
            this.putQueryParameter("ParameterNum", parameterNum);
            this.parameterNum = parameterNum;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Uploaded file name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fileTest</p>
         */
        public Builder userLocalFileName(String userLocalFileName) {
            this.putQueryParameter("UserLocalFileName", userLocalFileName);
            this.userLocalFileName = userLocalFileName;
            return this;
        }

        @Override
        public CreateModelRequest build() {
            return new CreateModelRequest(this);
        } 

    } 

}
