// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListTemplatesRequest</p>
 */
public class ListTemplatesRequest extends Request {
    @Body
    @NameInMap("Lang")
    private String lang;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("Tag")
    private String tag;

    private ListTemplatesRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplatesRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListTemplatesRequest, Builder> {
        private String lang; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(ListTemplatesRequest request) {
            super(request);
            this.lang = request.lang;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.tag = request.tag;
        } 

        /**
         * The language that is used in the templates.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The keyword that is used to search for templates. This parameter is invalid if you specify a tag.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The page number of current page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of templates on each page. A page can contain a maximum of 100 templates. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The tag that is used to search for templates.
         */
        public Builder tag(String tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListTemplatesRequest build() {
            return new ListTemplatesRequest(this);
        } 

    } 

}
