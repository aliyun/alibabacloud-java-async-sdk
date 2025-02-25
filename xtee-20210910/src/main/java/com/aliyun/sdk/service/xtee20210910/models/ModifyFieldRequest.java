// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFieldRequest} extends {@link RequestModel}
 *
 * <p>ModifyFieldRequest</p>
 */
public class ModifyFieldRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private ModifyFieldRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.classify = builder.classify;
        this.description = builder.description;
        this.enumData = builder.enumData;
        this.id = builder.id;
        this.name = builder.name;
        this.regId = builder.regId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFieldRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
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
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<ModifyFieldRequest, Builder> {
        private String lang; 
        private String classify; 
        private String description; 
        private String enumData; 
        private Long id; 
        private String name; 
        private String regId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFieldRequest request) {
            super(request);
            this.lang = request.lang;
            this.classify = request.classify;
            this.description = request.description;
            this.enumData = request.enumData;
            this.id = request.id;
            this.name = request.name;
            this.regId = request.regId;
            this.title = request.title;
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
         * classify.
         */
        public Builder classify(String classify) {
            this.putQueryParameter("classify", classify);
            this.classify = classify;
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
         * enumData.
         */
        public Builder enumData(String enumData) {
            this.putQueryParameter("enumData", enumData);
            this.enumData = enumData;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
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

        @Override
        public ModifyFieldRequest build() {
            return new ModifyFieldRequest(this);
        } 

    } 

}
