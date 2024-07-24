// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSpecReviewTasksRequest} extends {@link RequestModel}
 *
 * <p>ListSpecReviewTasksRequest</p>
 */
public class ListSpecReviewTasksRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListSpecReviewTasksRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.page = builder.page;
        this.size = builder.size;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSpecReviewTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListSpecReviewTasksRequest, Builder> {
        private String appName; 
        private Integer page; 
        private Integer size; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListSpecReviewTasksRequest request) {
            super(request);
            this.appName = request.appName;
            this.page = request.page;
            this.size = request.size;
            this.type = request.type;
        } 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
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

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListSpecReviewTasksRequest build() {
            return new ListSpecReviewTasksRequest(this);
        } 

    } 

}
