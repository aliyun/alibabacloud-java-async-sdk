// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelInstancePublishTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CancelInstancePublishTaskResponseBody</p>
 */
public class CancelInstancePublishTaskResponseBody extends TeaModel {
    @NameInMap("BizTypeList")
    private java.util.List < String > bizTypeList;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Error")
    private String error;

    @NameInMap("Id")
    private Long id;

    @NameInMap("ModifyTime")
    private String modifyTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Response")
    private String response;

    @NameInMap("Status")
    private String status;

    private CancelInstancePublishTaskResponseBody(Builder builder) {
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

    public static CancelInstancePublishTaskResponseBody create() {
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
         * job失败信息
         */
        public Builder error(String error) {
            this.error = error;
            return this;
        }

        /**
         * 任务Id
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * 任务修改的 UTC 时间
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 任务Id
         */
        public Builder response(String response) {
            this.response = response;
            return this;
        }

        /**
         * 任务状态
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CancelInstancePublishTaskResponseBody build() {
            return new CancelInstancePublishTaskResponseBody(this);
        } 

    } 

}
