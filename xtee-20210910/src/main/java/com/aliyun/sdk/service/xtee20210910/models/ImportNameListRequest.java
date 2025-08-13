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
    @com.aliyun.core.annotation.NameInMap("memo")
    private String memo;

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
        this.memo = builder.memo;
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
     * @return memo
     */
    public String getMemo() {
        return this.memo;
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
        private String memo; 
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
            this.memo = request.memo;
            this.nameListType = request.nameListType;
            this.regId = request.regId;
            this.title = request.title;
            this.variableId = request.variableId;
        } 

        /**
         * <p>Set the language type for request and response messages, default value is <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Creation type</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
            return this;
        }

        /**
         * <p>Import name list.</p>
         * 
         * <strong>example:</strong>
         * <p>aa\nbb\ncc</p>
         */
        public Builder data(String data) {
            this.putQueryParameter("data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Document import type:</p>
         * <p>INPUT: Text input
         * CSV: CSV upload
         * NONE: Do not upload for now</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CSV</p>
         */
        public Builder importType(String importType) {
            this.putQueryParameter("importType", importType);
            this.importType = importType;
            return this;
        }

        /**
         * <p>name content memo</p>
         * 
         * <strong>example:</strong>
         * <p>名单内容描述</p>
         */
        public Builder memo(String memo) {
            this.putQueryParameter("memo", memo);
            this.memo = memo;
            return this;
        }

        /**
         * <p>nameListType</p>
         * 
         * <strong>example:</strong>
         * <p>accountId</p>
         */
        public Builder nameListType(String nameListType) {
            this.putQueryParameter("nameListType", nameListType);
            this.nameListType = nameListType;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Title.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>变量title</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>Variable ID</p>
         * 
         * <strong>example:</strong>
         * <p>393314</p>
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
