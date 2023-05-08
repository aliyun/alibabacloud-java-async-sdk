// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckWarningDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCheckWarningDetailResponseBody</p>
 */
public class DescribeCheckWarningDetailResponseBody extends TeaModel {
    @NameInMap("Advice")
    private String advice;

    @NameInMap("CheckId")
    private Long checkId;

    @NameInMap("Description")
    private String description;

    @NameInMap("Item")
    private String item;

    @NameInMap("Level")
    private String level;

    @NameInMap("Prompt")
    private String prompt;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Type")
    private String type;

    private DescribeCheckWarningDetailResponseBody(Builder builder) {
        this.advice = builder.advice;
        this.checkId = builder.checkId;
        this.description = builder.description;
        this.item = builder.item;
        this.level = builder.level;
        this.prompt = builder.prompt;
        this.requestId = builder.requestId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckWarningDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return advice
     */
    public String getAdvice() {
        return this.advice;
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return item
     */
    public String getItem() {
        return this.item;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String advice; 
        private Long checkId; 
        private String description; 
        private String item; 
        private String level; 
        private String prompt; 
        private String requestId; 
        private String type; 

        /**
         * Queries the details about a specified check item.
         */
        public Builder advice(String advice) {
            this.advice = advice;
            return this;
        }

        /**
         * CheckId.
         */
        public Builder checkId(Long checkId) {
            this.checkId = checkId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Item.
         */
        public Builder item(String item) {
            this.item = item;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }

        /**
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.prompt = prompt;
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
         * DescribeCheckWarningDetail
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeCheckWarningDetailResponseBody build() {
            return new DescribeCheckWarningDetailResponseBody(this);
        } 

    } 

}
