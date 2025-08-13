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
 * {@link CreateFieldRequest} extends {@link RequestModel}
 *
 * <p>CreateFieldRequest</p>
 */
public class CreateFieldRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("classify")
    private String classify;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enumData")
    private String enumData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateFieldRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.classify = builder.classify;
        this.description = builder.description;
        this.enumData = builder.enumData;
        this.name = builder.name;
        this.regId = builder.regId;
        this.source = builder.source;
        this.title = builder.title;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFieldRequest create() {
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
     * @return classify
     */
    public String getClassify() {
        return this.classify;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enumData
     */
    public String getEnumData() {
        return this.enumData;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateFieldRequest, Builder> {
        private String lang; 
        private String classify; 
        private String description; 
        private String enumData; 
        private String name; 
        private String regId; 
        private String source; 
        private String title; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateFieldRequest request) {
            super(request);
            this.lang = request.lang;
            this.classify = request.classify;
            this.description = request.description;
            this.enumData = request.enumData;
            this.name = request.name;
            this.regId = request.regId;
            this.source = request.source;
            this.title = request.title;
            this.type = request.type;
        } 

        /**
         * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
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
         * <p>Field classification.</p>
         * 
         * <strong>example:</strong>
         * <p>REQUEST_PARAM</p>
         */
        public Builder classify(String classify) {
            this.putQueryParameter("classify", classify);
            this.classify = classify;
            return this;
        }

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>字段描述信息</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Enum data.</p>
         * 
         * <strong>example:</strong>
         * <p>enum</p>
         */
        public Builder enumData(String enumData) {
            this.putQueryParameter("enumData", enumData);
            this.enumData = enumData;
            return this;
        }

        /**
         * <p>Field name.</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Region code.</p>
         * <p>This parameter is required.</p>
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
         * <p>Business source.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFINE</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>年龄</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>Field type.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateFieldRequest build() {
            return new CreateFieldRequest(this);
        } 

    } 

}
