// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteInstanceResponseBody</p>
 */
public class DeleteInstanceResponseBody extends TeaModel {
    @NameInMap("BizTypeList")
    private java.util.List < String > bizTypeList;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CreateUserId")
    private Long createUserId;

    @NameInMap("CreateUserName")
    private String createUserName;

    @NameInMap("Error")
    private String error;

    @NameInMap("Id")
    private Long id;

    @NameInMap("RequestId")
    private byte[] requestId;

    @NameInMap("Response")
    private Long response;

    @NameInMap("Status")
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

    /**
     * @return bizTypeList
     */
    public java.util.List < String > getBizTypeList() {
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
    public byte[] getRequestId() {
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
        private java.util.List < String > bizTypeList; 
        private String createTime; 
        private Long createUserId; 
        private String createUserName; 
        private String error; 
        private Long id; 
        private byte[] requestId; 
        private Long response; 
        private String status; 

        /**
         * 业务类型列表
         */
        public Builder bizTypeList(java.util.List < String > bizTypeList) {
            this.bizTypeList = bizTypeList;
            return this;
        }

        /**
         * 任务创建的 UTC 时间
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 任务创建人Id
         */
        public Builder createUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }

        /**
         * 任务创建人
         */
        public Builder createUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder error(String error) {
            this.error = error;
            return this;
        }

        /**
         * 任务id
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(byte[] requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 任务id
         */
        public Builder response(Long response) {
            this.response = response;
            return this;
        }

        /**
         * 任务状态，可以在GetInstancePublishTaskState API 了解更多的状态
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
