// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssTokenRequest} extends {@link RequestModel}
 *
 * <p>DescribeOssTokenRequest</p>
 */
public class DescribeOssTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("uploadType")
    private String uploadType;

    private DescribeOssTokenRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.fileName = builder.fileName;
        this.regId = builder.regId;
        this.uploadType = builder.uploadType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return uploadType
     */
    public String getUploadType() {
        return this.uploadType;
    }

    public static final class Builder extends Request.Builder<DescribeOssTokenRequest, Builder> {
        private String lang; 
        private String fileName; 
        private String regId; 
        private String uploadType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOssTokenRequest request) {
            super(request);
            this.lang = request.lang;
            this.fileName = request.fileName;
            this.regId = request.regId;
            this.uploadType = request.uploadType;
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
         * fileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("fileName", fileName);
            this.fileName = fileName;
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

        /**
         * uploadType.
         */
        public Builder uploadType(String uploadType) {
            this.putQueryParameter("uploadType", uploadType);
            this.uploadType = uploadType;
            return this;
        }

        @Override
        public DescribeOssTokenRequest build() {
            return new DescribeOssTokenRequest(this);
        } 

    } 

}
