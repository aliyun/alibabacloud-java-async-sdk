// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecommendTaskDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecommendTaskDetailRequest</p>
 */
public class DescribeRecommendTaskDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    private Long taskId;

    private DescribeRecommendTaskDetailRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecommendTaskDetailRequest create() {
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
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeRecommendTaskDetailRequest, Builder> {
        private String lang; 
        private String regId; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecommendTaskDetailRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.taskId = request.taskId;
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
        public Builder taskId(Long taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeRecommendTaskDetailRequest build() {
            return new DescribeRecommendTaskDetailRequest(this);
        } 

    } 

}
