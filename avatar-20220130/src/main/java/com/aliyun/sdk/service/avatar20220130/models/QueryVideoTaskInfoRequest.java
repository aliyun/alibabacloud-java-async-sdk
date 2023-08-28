// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryVideoTaskInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryVideoTaskInfoRequest</p>
 */
public class QueryVideoTaskInfoRequest extends Request {
    @Query
    @NameInMap("App")
    @Validation(required = true)
    private App app;

    @Query
    @NameInMap("OrderById")
    private String orderById;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("TaskUuid")
    private String taskUuid;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    @Query
    @NameInMap("Title")
    private String title;

    @Query
    @NameInMap("Type")
    private Integer type;

    private QueryVideoTaskInfoRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.orderById = builder.orderById;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.taskUuid = builder.taskUuid;
        this.tenantId = builder.tenantId;
        this.title = builder.title;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVideoTaskInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public App getApp() {
        return this.app;
    }

    /**
     * @return orderById
     */
    public String getOrderById() {
        return this.orderById;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return taskUuid
     */
    public String getTaskUuid() {
        return this.taskUuid;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
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
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<QueryVideoTaskInfoRequest, Builder> {
        private App app; 
        private String orderById; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Integer status; 
        private String taskUuid; 
        private Long tenantId; 
        private String title; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(QueryVideoTaskInfoRequest request) {
            super(request);
            this.app = request.app;
            this.orderById = request.orderById;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.taskUuid = request.taskUuid;
            this.tenantId = request.tenantId;
            this.title = request.title;
            this.type = request.type;
        } 

        /**
         * App.
         */
        public Builder app(App app) {
            String appShrink = shrink(app, "App", "json");
            this.putQueryParameter("App", appShrink);
            this.app = app;
            return this;
        }

        /**
         * OrderById.
         */
        public Builder orderById(String orderById) {
            this.putQueryParameter("OrderById", orderById);
            this.orderById = orderById;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TaskUuid.
         */
        public Builder taskUuid(String taskUuid) {
            this.putQueryParameter("TaskUuid", taskUuid);
            this.taskUuid = taskUuid;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public QueryVideoTaskInfoRequest build() {
            return new QueryVideoTaskInfoRequest(this);
        } 

    } 

    public static class App extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        private String appId;

        private App(Builder builder) {
            this.appId = builder.appId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static App create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        public static final class Builder {
            private String appId; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            public App build() {
                return new App(this);
            } 

        } 

    }
}
