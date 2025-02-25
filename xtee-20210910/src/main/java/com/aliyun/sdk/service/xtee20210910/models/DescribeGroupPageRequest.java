// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupPageRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupPageRequest</p>
 */
public class DescribeGroupPageRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timeType")
    private String timeType;

    private DescribeGroupPageRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.currentPage = builder.currentPage;
        this.direction = builder.direction;
        this.order = builder.order;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
        this.taskId = builder.taskId;
        this.timeType = builder.timeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupPageRequest create() {
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return timeType
     */
    public String getTimeType() {
        return this.timeType;
    }

    public static final class Builder extends Request.Builder<DescribeGroupPageRequest, Builder> {
        private String lang; 
        private String currentPage; 
        private String direction; 
        private String order; 
        private String pageSize; 
        private String regId; 
        private String taskId; 
        private String timeType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGroupPageRequest request) {
            super(request);
            this.lang = request.lang;
            this.currentPage = request.currentPage;
            this.direction = request.direction;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
            this.taskId = request.taskId;
            this.timeType = request.timeType;
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
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * timeType.
         */
        public Builder timeType(String timeType) {
            this.putQueryParameter("timeType", timeType);
            this.timeType = timeType;
            return this;
        }

        @Override
        public DescribeGroupPageRequest build() {
            return new DescribeGroupPageRequest(this);
        } 

    } 

}
