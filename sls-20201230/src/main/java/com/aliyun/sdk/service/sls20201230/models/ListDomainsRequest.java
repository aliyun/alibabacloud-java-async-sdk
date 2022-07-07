// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListDomainsRequest} extends {@link RequestModel}
 *
 * <p>ListDomainsRequest</p>
 */
public class ListDomainsRequest extends Request {
    @Query
    @NameInMap("domainName")
    private String domainName;

    @Query
    @NameInMap("offset")
    private Integer offset;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("size")
    private Integer size;

    private ListDomainsRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.offset = builder.offset;
        this.project = builder.project;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListDomainsRequest, Builder> {
        private String domainName; 
        private Integer offset; 
        private String project; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListDomainsRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.offset = request.offset;
            this.project = request.project;
            this.size = request.size;
        } 

        /**
         * 用于搜索匹配的自定义域名
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("domainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * Project name
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListDomainsRequest build() {
            return new ListDomainsRequest(this);
        } 

    } 

}
