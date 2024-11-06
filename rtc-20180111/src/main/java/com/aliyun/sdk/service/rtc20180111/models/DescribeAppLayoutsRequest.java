// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAppLayoutsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppLayoutsRequest</p>
 */
public class DescribeAppLayoutsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Condition")
    private Condition condition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private DescribeAppLayoutsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.condition = builder.condition;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppLayoutsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return condition
     */
    public Condition getCondition() {
        return this.condition;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeAppLayoutsRequest, Builder> {
        private String appId; 
        private Condition condition; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppLayoutsRequest request) {
            super(request);
            this.appId = request.appId;
            this.condition = request.condition;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ac7N****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Condition.
         */
        public Builder condition(Condition condition) {
            String conditionShrink = shrink(condition, "Condition", "json");
            this.putQueryParameter("Condition", conditionShrink);
            this.condition = condition;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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

        @Override
        public DescribeAppLayoutsRequest build() {
            return new DescribeAppLayoutsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAppLayoutsRequest} extends {@link TeaModel}
     *
     * <p>DescribeAppLayoutsRequest</p>
     */
    public static class Condition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LayoutId")
        private String layoutId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Condition(Builder builder) {
            this.layoutId = builder.layoutId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Condition create() {
            return builder().build();
        }

        /**
         * @return layoutId
         */
        public String getLayoutId() {
            return this.layoutId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String layoutId; 
            private String name; 

            /**
             * LayoutId.
             */
            public Builder layoutId(String layoutId) {
                this.layoutId = layoutId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Condition build() {
                return new Condition(this);
            } 

        } 

    }
}
