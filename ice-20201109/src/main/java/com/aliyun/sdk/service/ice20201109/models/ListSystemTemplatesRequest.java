// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSystemTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListSystemTemplatesRequest</p>
 */
public class ListSystemTemplatesRequest extends Request {
    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Subtype")
    private String subtype;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private ListSystemTemplatesRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.subtype = builder.subtype;
        this.templateId = builder.templateId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subtype
     */
    public String getSubtype() {
        return this.subtype;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListSystemTemplatesRequest, Builder> {
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String status; 
        private String subtype; 
        private String templateId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListSystemTemplatesRequest request) {
            super(request);
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.subtype = request.subtype;
            this.templateId = request.templateId;
            this.type = request.type;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Subtype.
         */
        public Builder subtype(String subtype) {
            this.putQueryParameter("Subtype", subtype);
            this.subtype = subtype;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
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
        public ListSystemTemplatesRequest build() {
            return new ListSystemTemplatesRequest(this);
        } 

    } 

}
