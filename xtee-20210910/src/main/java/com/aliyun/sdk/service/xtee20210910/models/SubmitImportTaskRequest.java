// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitImportTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitImportTaskRequest</p>
 */
public class SubmitImportTaskRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private SubmitImportTaskRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.fileName = builder.fileName;
        this.regId = builder.regId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitImportTaskRequest create() {
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
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<SubmitImportTaskRequest, Builder> {
        private String lang; 
        private String fileName; 
        private String regId; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(SubmitImportTaskRequest request) {
            super(request);
            this.lang = request.lang;
            this.fileName = request.fileName;
            this.regId = request.regId;
            this.url = request.url;
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
         * url.
         */
        public Builder url(String url) {
            this.putQueryParameter("url", url);
            this.url = url;
            return this;
        }

        @Override
        public SubmitImportTaskRequest build() {
            return new SubmitImportTaskRequest(this);
        } 

    } 

}
