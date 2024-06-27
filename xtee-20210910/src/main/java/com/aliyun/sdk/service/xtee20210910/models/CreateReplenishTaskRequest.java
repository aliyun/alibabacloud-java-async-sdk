// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReplenishTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateReplenishTaskRequest</p>
 */
public class CreateReplenishTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientFileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientFileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private CreateReplenishTaskRequest(Builder builder) {
        super(builder);
        this.clientFileName = builder.clientFileName;
        this.clientPath = builder.clientPath;
        this.lang = builder.lang;
        this.taskId = builder.taskId;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReplenishTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientFileName
     */
    public String getClientFileName() {
        return this.clientFileName;
    }

    /**
     * @return clientPath
     */
    public String getClientPath() {
        return this.clientPath;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<CreateReplenishTaskRequest, Builder> {
        private String clientFileName; 
        private String clientPath; 
        private String lang; 
        private String taskId; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(CreateReplenishTaskRequest request) {
            super(request);
            this.clientFileName = request.clientFileName;
            this.clientPath = request.clientPath;
            this.lang = request.lang;
            this.taskId = request.taskId;
            this.regId = request.regId;
        } 

        /**
         * ClientFileName.
         */
        public Builder clientFileName(String clientFileName) {
            this.putQueryParameter("ClientFileName", clientFileName);
            this.clientFileName = clientFileName;
            return this;
        }

        /**
         * ClientPath.
         */
        public Builder clientPath(String clientPath) {
            this.putQueryParameter("ClientPath", clientPath);
            this.clientPath = clientPath;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public CreateReplenishTaskRequest build() {
            return new CreateReplenishTaskRequest(this);
        } 

    } 

}
