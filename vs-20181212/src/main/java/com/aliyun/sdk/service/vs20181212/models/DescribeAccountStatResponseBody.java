// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountStatResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountStatResponseBody</p>
 */
public class DescribeAccountStatResponseBody extends TeaModel {
    @NameInMap("GroupLimit")
    private Long groupLimit;

    @NameInMap("GroupNum")
    private Long groupNum;

    @NameInMap("Id")
    private String id;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateLimit")
    private Long templateLimit;

    @NameInMap("TemplateNum")
    private Long templateNum;

    private DescribeAccountStatResponseBody(Builder builder) {
        this.groupLimit = builder.groupLimit;
        this.groupNum = builder.groupNum;
        this.id = builder.id;
        this.requestId = builder.requestId;
        this.templateLimit = builder.templateLimit;
        this.templateNum = builder.templateNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountStatResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupLimit
     */
    public Long getGroupLimit() {
        return this.groupLimit;
    }

    /**
     * @return groupNum
     */
    public Long getGroupNum() {
        return this.groupNum;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateLimit
     */
    public Long getTemplateLimit() {
        return this.templateLimit;
    }

    /**
     * @return templateNum
     */
    public Long getTemplateNum() {
        return this.templateNum;
    }

    public static final class Builder {
        private Long groupLimit; 
        private Long groupNum; 
        private String id; 
        private String requestId; 
        private Long templateLimit; 
        private Long templateNum; 

        /**
         * GroupLimit.
         */
        public Builder groupLimit(Long groupLimit) {
            this.groupLimit = groupLimit;
            return this;
        }

        /**
         * GroupNum.
         */
        public Builder groupNum(Long groupNum) {
            this.groupNum = groupNum;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TemplateLimit.
         */
        public Builder templateLimit(Long templateLimit) {
            this.templateLimit = templateLimit;
            return this;
        }

        /**
         * TemplateNum.
         */
        public Builder templateNum(Long templateNum) {
            this.templateNum = templateNum;
            return this;
        }

        public DescribeAccountStatResponseBody build() {
            return new DescribeAccountStatResponseBody(this);
        } 

    } 

}
