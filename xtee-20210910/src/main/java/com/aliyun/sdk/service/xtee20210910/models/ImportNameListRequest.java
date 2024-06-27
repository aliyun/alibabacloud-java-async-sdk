// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportNameListRequest} extends {@link RequestModel}
 *
 * <p>ImportNameListRequest</p>
 */
public class ImportNameListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("data")
    private String data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("importType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String importType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nameListType")
    private String nameListType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("variableId")
    private Long variableId;

    private ImportNameListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.createType = builder.createType;
        this.data = builder.data;
        this.description = builder.description;
        this.importType = builder.importType;
        this.nameListType = builder.nameListType;
        this.regId = builder.regId;
        this.title = builder.title;
        this.variableId = builder.variableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportNameListRequest create() {
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
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return importType
     */
    public String getImportType() {
        return this.importType;
    }

    /**
     * @return nameListType
     */
    public String getNameListType() {
        return this.nameListType;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return variableId
     */
    public Long getVariableId() {
        return this.variableId;
    }

    public static final class Builder extends Request.Builder<ImportNameListRequest, Builder> {
        private String lang; 
        private String createType; 
        private String data; 
        private String description; 
        private String importType; 
        private String nameListType; 
        private String regId; 
        private String title; 
        private Long variableId; 

        private Builder() {
            super();
        } 

        private Builder(ImportNameListRequest request) {
            super(request);
            this.lang = request.lang;
            this.createType = request.createType;
            this.data = request.data;
            this.description = request.description;
            this.importType = request.importType;
            this.nameListType = request.nameListType;
            this.regId = request.regId;
            this.title = request.title;
            this.variableId = request.variableId;
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
         * createType.
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
            return this;
        }

        /**
         * data.
         */
        public Builder data(String data) {
            this.putQueryParameter("data", data);
            this.data = data;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * importType.
         */
        public Builder importType(String importType) {
            this.putQueryParameter("importType", importType);
            this.importType = importType;
            return this;
        }

        /**
         * nameListType.
         */
        public Builder nameListType(String nameListType) {
            this.putQueryParameter("nameListType", nameListType);
            this.nameListType = nameListType;
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
         * title.
         */
        public Builder title(String title) {
            this.putQueryParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * variableId.
         */
        public Builder variableId(Long variableId) {
            this.putQueryParameter("variableId", variableId);
            this.variableId = variableId;
            return this;
        }

        @Override
        public ImportNameListRequest build() {
            return new ImportNameListRequest(this);
        } 

    } 

}
