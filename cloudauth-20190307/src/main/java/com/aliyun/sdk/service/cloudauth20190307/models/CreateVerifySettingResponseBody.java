// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateVerifySettingResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVerifySettingResponseBody</p>
 */
public class CreateVerifySettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizName")
    private String bizName;

    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Solution")
    private String solution;

    @com.aliyun.core.annotation.NameInMap("StepList")
    private java.util.List<String> stepList;

    private CreateVerifySettingResponseBody(Builder builder) {
        this.bizName = builder.bizName;
        this.bizType = builder.bizType;
        this.requestId = builder.requestId;
        this.solution = builder.solution;
        this.stepList = builder.stepList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVerifySettingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizName
     */
    public String getBizName() {
        return this.bizName;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return solution
     */
    public String getSolution() {
        return this.solution;
    }

    /**
     * @return stepList
     */
    public java.util.List<String> getStepList() {
        return this.stepList;
    }

    public static final class Builder {
        private String bizName; 
        private String bizType; 
        private String requestId; 
        private String solution; 
        private java.util.List<String> stepList; 

        private Builder() {
        } 

        private Builder(CreateVerifySettingResponseBody model) {
            this.bizName = model.bizName;
            this.bizType = model.bizType;
            this.requestId = model.requestId;
            this.solution = model.solution;
            this.stepList = model.stepList;
        } 

        /**
         * BizName.
         */
        public Builder bizName(String bizName) {
            this.bizName = bizName;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.bizType = bizType;
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
         * Solution.
         */
        public Builder solution(String solution) {
            this.solution = solution;
            return this;
        }

        /**
         * StepList.
         */
        public Builder stepList(java.util.List<String> stepList) {
            this.stepList = stepList;
            return this;
        }

        public CreateVerifySettingResponseBody build() {
            return new CreateVerifySettingResponseBody(this);
        } 

    } 

}
