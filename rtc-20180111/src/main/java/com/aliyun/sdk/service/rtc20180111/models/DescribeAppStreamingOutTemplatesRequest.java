// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppStreamingOutTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppStreamingOutTemplatesRequest</p>
 */
public class DescribeAppStreamingOutTemplatesRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Condition")
    private Condition condition;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private DescribeAppStreamingOutTemplatesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.condition = builder.condition;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppStreamingOutTemplatesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAppStreamingOutTemplatesRequest, Builder> {
        private String appId; 
        private Condition condition; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppStreamingOutTemplatesRequest request) {
            super(request);
            this.appId = request.appId;
            this.condition = request.condition;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * AppId.
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
        public DescribeAppStreamingOutTemplatesRequest build() {
            return new DescribeAppStreamingOutTemplatesRequest(this);
        } 

    } 

    public static class Condition extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("TemplateId")
        private String templateId;

        private Condition(Builder builder) {
            this.name = builder.name;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Condition create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String name; 
            private String templateId; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public Condition build() {
                return new Condition(this);
            } 

        } 

    }
}
