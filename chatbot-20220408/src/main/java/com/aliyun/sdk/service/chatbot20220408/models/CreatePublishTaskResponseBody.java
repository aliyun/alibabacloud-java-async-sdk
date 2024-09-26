// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePublishTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePublishTaskResponseBody</p>
 */
public class CreatePublishTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizTypeList")
    private java.util.List < String > bizTypeList;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Error")
    private String error;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Response")
    private String response;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreatePublishTaskResponseBody(Builder builder) {
        this.bizTypeList = builder.bizTypeList;
        this.createTime = builder.createTime;
        this.error = builder.error;
        this.id = builder.id;
        this.modifyTime = builder.modifyTime;
        this.requestId = builder.requestId;
        this.response = builder.response;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePublishTaskResponseBody create() {
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
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
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
    public String getResponse() {
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
        private String error; 
        private Long id; 
        private String modifyTime; 
        private String requestId; 
        private String response; 
        private String status; 

        /**
         * BizTypeList.
         */
        public Builder bizTypeList(java.util.List < String > bizTypeList) {
            this.bizTypeList = bizTypeList;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Error.
         */
        public Builder error(String error) {
            this.error = error;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
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
         * Response.
         */
        public Builder response(String response) {
            this.response = response;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreatePublishTaskResponseBody build() {
            return new CreatePublishTaskResponseBody(this);
        } 

    } 

}
