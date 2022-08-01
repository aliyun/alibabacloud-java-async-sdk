// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListExternalStoreRequest} extends {@link RequestModel}
 *
 * <p>ListExternalStoreRequest</p>
 */
public class ListExternalStoreRequest extends Request {
    @Query
    @NameInMap("externalStoreName")
    private String externalStoreName;

    @Query
    @NameInMap("offset")
    private Integer offset;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("sizs")
    private Integer sizs;

    private ListExternalStoreRequest(Builder builder) {
        super(builder);
        this.externalStoreName = builder.externalStoreName;
        this.offset = builder.offset;
        this.project = builder.project;
        this.sizs = builder.sizs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExternalStoreRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return externalStoreName
     */
    public String getExternalStoreName() {
        return this.externalStoreName;
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
     * @return sizs
     */
    public Integer getSizs() {
        return this.sizs;
    }

    public static final class Builder extends Request.Builder<ListExternalStoreRequest, Builder> {
        private String externalStoreName; 
        private Integer offset; 
        private String project; 
        private Integer sizs; 

        private Builder() {
            super();
        } 

        private Builder(ListExternalStoreRequest request) {
            super(request);
            this.externalStoreName = request.externalStoreName;
            this.offset = request.offset;
            this.project = request.project;
            this.sizs = request.sizs;
        } 

        /**
         * 可选使用名字 pattern 匹配
         */
        public Builder externalStoreName(String externalStoreName) {
            this.putQueryParameter("externalStoreName", externalStoreName);
            this.externalStoreName = externalStoreName;
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
         * A short description of struct
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * 默认值为 500.
         */
        public Builder sizs(Integer sizs) {
            this.putQueryParameter("sizs", sizs);
            this.sizs = sizs;
            return this;
        }

        @Override
        public ListExternalStoreRequest build() {
            return new ListExternalStoreRequest(this);
        } 

    } 

}
