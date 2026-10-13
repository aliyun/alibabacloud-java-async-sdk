// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link DeleteInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteInstanceResponseBody</p>
 */
public class DeleteInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizTypeList")
    private java.util.List<String> bizTypeList;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateUserId")
    private Long createUserId;

    @com.aliyun.core.annotation.NameInMap("CreateUserName")
    private String createUserName;

    @com.aliyun.core.annotation.NameInMap("Error")
    private String error;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Response")
    private Long response;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DeleteInstanceResponseBody(Builder builder) {
        this.bizTypeList = builder.bizTypeList;
        this.createTime = builder.createTime;
        this.createUserId = builder.createUserId;
        this.createUserName = builder.createUserName;
        this.error = builder.error;
        this.id = builder.id;
        this.requestId = builder.requestId;
        this.response = builder.response;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizTypeList
     */
    public java.util.List<String> getBizTypeList() {
        return this.bizTypeList;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createUserId
     */
    public Long getCreateUserId() {
        return this.createUserId;
    }

    /**
     * @return createUserName
     */
    public String getCreateUserName() {
        return this.createUserName;
    }

    /**
     * @return error
     */
    public String getError() {
        return this.error;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return response
     */
    public Long getResponse() {
        return this.response;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private java.util.List<String> bizTypeList; 
        private String createTime; 
        private Long createUserId; 
        private String createUserName; 
        private String error; 
        private Long id; 
        private String requestId; 
        private Long response; 
        private String status; 

        private Builder() {
        } 

        private Builder(DeleteInstanceResponseBody model) {
            this.bizTypeList = model.bizTypeList;
            this.createTime = model.createTime;
            this.createUserId = model.createUserId;
            this.createUserName = model.createUserName;
            this.error = model.error;
            this.id = model.id;
            this.requestId = model.requestId;
            this.response = model.response;
            this.status = model.status;
        } 

        /**
         * <p>The list of business types.</p>
         */
        public Builder bizTypeList(java.util.List<String> bizTypeList) {
            this.bizTypeList = bizTypeList;
            return this;
        }

        /**
         * <p>The UTC time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-11T09:26:14Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID of the task creator.</p>
         * 
         * <strong>example:</strong>
         * <p>9052</p>
         */
        public Builder createUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }

        /**
         * <p>The name of the task creator.</p>
         * 
         * <strong>example:</strong>
         * <p>xuqiang_test</p>
         */
        public Builder createUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>An error occurred while checking whether the module to be published is idle, faq</p>
         */
        public Builder error(String error) {
            this.error = error;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8521</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5CBF0581-EAE7-1DC4-95C6-A089656A1E2D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8521</p>
         */
        public Builder response(Long response) {
            this.response = response;
            return this;
        }

        /**
         * <p>The task status. You can call the GetInstancePublishTaskState operation to learn more about the status.</p>
         * 
         * <strong>example:</strong>
         * <p>FE_RUNNING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DeleteInstanceResponseBody build() {
            return new DeleteInstanceResponseBody(this);
        } 

    } 

}
