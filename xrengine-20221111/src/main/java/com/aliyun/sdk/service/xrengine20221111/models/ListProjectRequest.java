// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link ListProjectRequest} extends {@link RequestModel}
 *
 * <p>ListProjectRequest</p>
 */
public class ListProjectRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizUsage")
    private String bizUsage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Current")
    private Integer current;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludedBizUsage")
    private String excludedBizUsage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortField")
    private String sortField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WithSource")
    private Boolean withSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WithUser")
    private Boolean withUser;

    private ListProjectRequest(Builder builder) {
        super(builder);
        this.bizUsage = builder.bizUsage;
        this.current = builder.current;
        this.excludedBizUsage = builder.excludedBizUsage;
        this.jwtToken = builder.jwtToken;
        this.size = builder.size;
        this.sortField = builder.sortField;
        this.status = builder.status;
        this.title = builder.title;
        this.type = builder.type;
        this.withSource = builder.withSource;
        this.withUser = builder.withUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizUsage
     */
    public String getBizUsage() {
        return this.bizUsage;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return excludedBizUsage
     */
    public String getExcludedBizUsage() {
        return this.excludedBizUsage;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
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

    /**
     * @return withSource
     */
    public Boolean getWithSource() {
        return this.withSource;
    }

    /**
     * @return withUser
     */
    public Boolean getWithUser() {
        return this.withUser;
    }

    public static final class Builder extends Request.Builder<ListProjectRequest, Builder> {
        private String bizUsage; 
        private Integer current; 
        private String excludedBizUsage; 
        private String jwtToken; 
        private Integer size; 
        private String sortField; 
        private String status; 
        private String title; 
        private String type; 
        private Boolean withSource; 
        private Boolean withUser; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectRequest request) {
            super(request);
            this.bizUsage = request.bizUsage;
            this.current = request.current;
            this.excludedBizUsage = request.excludedBizUsage;
            this.jwtToken = request.jwtToken;
            this.size = request.size;
            this.sortField = request.sortField;
            this.status = request.status;
            this.title = request.title;
            this.type = request.type;
            this.withSource = request.withSource;
            this.withUser = request.withUser;
        } 

        /**
         * BizUsage.
         */
        public Builder bizUsage(String bizUsage) {
            this.putBodyParameter("BizUsage", bizUsage);
            this.bizUsage = bizUsage;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.putBodyParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * ExcludedBizUsage.
         */
        public Builder excludedBizUsage(String excludedBizUsage) {
            this.putBodyParameter("ExcludedBizUsage", excludedBizUsage);
            this.excludedBizUsage = excludedBizUsage;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putBodyParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * SortField.
         */
        public Builder sortField(String sortField) {
            this.putBodyParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * WithSource.
         */
        public Builder withSource(Boolean withSource) {
            this.putBodyParameter("WithSource", withSource);
            this.withSource = withSource;
            return this;
        }

        /**
         * WithUser.
         */
        public Builder withUser(Boolean withUser) {
            this.putBodyParameter("WithUser", withUser);
            this.withUser = withUser;
            return this;
        }

        @Override
        public ListProjectRequest build() {
            return new ListProjectRequest(this);
        } 

    } 

}
