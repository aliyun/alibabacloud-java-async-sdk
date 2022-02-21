// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowTagGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowTagGroupsResponseBody</p>
 */
public class ListFlowTagGroupsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("flowTagGroups")
    private java.util.List < FlowTagGroups> flowTagGroups;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private ListFlowTagGroupsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.flowTagGroups = builder.flowTagGroups;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowTagGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return flowTagGroups
     */
    public java.util.List < FlowTagGroups> getFlowTagGroups() {
        return this.flowTagGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private java.util.List < FlowTagGroups> flowTagGroups; 
        private String requestId; 
        private Boolean success; 

        /**
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 标签分类
         */
        public Builder flowTagGroups(java.util.List < FlowTagGroups> flowTagGroups) {
            this.flowTagGroups = flowTagGroups;
            return this;
        }

        /**
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * true 接口调用成功，false 接口调用失败
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListFlowTagGroupsResponseBody build() {
            return new ListFlowTagGroupsResponseBody(this);
        } 

    } 

    public static class FlowTagGroups extends TeaModel {
        @NameInMap("creatorAccountId")
        private String creatorAccountId;

        @NameInMap("id")
        private Long id;

        @NameInMap("modiferAccountId")
        private String modiferAccountId;

        @NameInMap("name")
        private String name;

        private FlowTagGroups(Builder builder) {
            this.creatorAccountId = builder.creatorAccountId;
            this.id = builder.id;
            this.modiferAccountId = builder.modiferAccountId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowTagGroups create() {
            return builder().build();
        }

        /**
         * @return creatorAccountId
         */
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modiferAccountId
         */
        public String getModiferAccountId() {
            return this.modiferAccountId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String creatorAccountId; 
            private Long id; 
            private String modiferAccountId; 
            private String name; 

            /**
             * 创建人
             */
            public Builder creatorAccountId(String creatorAccountId) {
                this.creatorAccountId = creatorAccountId;
                return this;
            }

            /**
             * 标签分类id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 修改人
             */
            public Builder modiferAccountId(String modiferAccountId) {
                this.modiferAccountId = modiferAccountId;
                return this;
            }

            /**
             * 标签分类名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public FlowTagGroups build() {
                return new FlowTagGroups(this);
            } 

        } 

    }
}
