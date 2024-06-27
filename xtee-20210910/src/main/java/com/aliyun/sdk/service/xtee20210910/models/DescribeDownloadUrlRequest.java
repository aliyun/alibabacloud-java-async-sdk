// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>DescribeDownloadUrlRequest</p>
 */
public class DescribeDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileType")
    private String fileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeDownloadUrlRequest(Builder builder) {
        super(builder);
        this.fileType = builder.fileType;
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.taskId = builder.taskId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDownloadUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeDownloadUrlRequest, Builder> {
        private String fileType; 
        private String lang; 
        private String regId; 
        private Long taskId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDownloadUrlRequest request) {
            super(request);
            this.fileType = request.fileType;
            this.lang = request.lang;
            this.regId = request.regId;
            this.taskId = request.taskId;
            this.type = request.type;
        } 

        /**
         * FileType.
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
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
         * RegId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeDownloadUrlRequest build() {
            return new DescribeDownloadUrlRequest(this);
        } 

    } 

}
