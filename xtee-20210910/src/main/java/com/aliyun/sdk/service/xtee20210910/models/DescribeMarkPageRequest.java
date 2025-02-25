// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMarkPageRequest} extends {@link RequestModel}
 *
 * <p>DescribeMarkPageRequest</p>
 */
public class DescribeMarkPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isPage")
    private Boolean isPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskLogId")
    private String taskLogId;

    private DescribeMarkPageRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.currentPage = builder.currentPage;
        this.direction = builder.direction;
        this.isPage = builder.isPage;
        this.order = builder.order;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
        this.taskLogId = builder.taskLogId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMarkPageRequest create() {
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
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return isPage
     */
    public Boolean getIsPage() {
        return this.isPage;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return taskLogId
     */
    public String getTaskLogId() {
        return this.taskLogId;
    }

    public static final class Builder extends Request.Builder<DescribeMarkPageRequest, Builder> {
        private String lang; 
        private String currentPage; 
        private String direction; 
        private Boolean isPage; 
        private String order; 
        private String pageSize; 
        private String regId; 
        private String taskLogId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMarkPageRequest request) {
            super(request);
            this.lang = request.lang;
            this.currentPage = request.currentPage;
            this.direction = request.direction;
            this.isPage = request.isPage;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
            this.taskLogId = request.taskLogId;
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
         * currentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * isPage.
         */
        public Builder isPage(Boolean isPage) {
            this.putQueryParameter("isPage", isPage);
            this.isPage = isPage;
            return this;
        }

        /**
         * order.
         */
        public Builder order(String order) {
            this.putQueryParameter("order", order);
            this.order = order;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
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
         * taskLogId.
         */
        public Builder taskLogId(String taskLogId) {
            this.putQueryParameter("taskLogId", taskLogId);
            this.taskLogId = taskLogId;
            return this;
        }

        @Override
        public DescribeMarkPageRequest build() {
            return new DescribeMarkPageRequest(this);
        } 

    } 

}
