// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFlowTagGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetFlowTagGroupResponseBody</p>
 */
public class GetFlowTagGroupResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("flowTagGroup")
    private FlowTagGroup flowTagGroup;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private GetFlowTagGroupResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.flowTagGroup = builder.flowTagGroup;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlowTagGroupResponseBody create() {
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
     * @return flowTagGroup
     */
    public FlowTagGroup getFlowTagGroup() {
        return this.flowTagGroup;
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
        private FlowTagGroup flowTagGroup; 
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
         * flowTagGroup.
         */
        public Builder flowTagGroup(FlowTagGroup flowTagGroup) {
            this.flowTagGroup = flowTagGroup;
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

        public GetFlowTagGroupResponseBody build() {
            return new GetFlowTagGroupResponseBody(this);
        } 

    } 

    public static class FlowTagList extends TeaModel {
        @NameInMap("color")
        private String color;

        @NameInMap("creatorAccountId")
        private String creatorAccountId;

        @NameInMap("id")
        private Long id;

        @NameInMap("modiferAccountId")
        private String modiferAccountId;

        @NameInMap("name")
        private String name;

        private FlowTagList(Builder builder) {
            this.color = builder.color;
            this.creatorAccountId = builder.creatorAccountId;
            this.id = builder.id;
            this.modiferAccountId = builder.modiferAccountId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowTagList create() {
            return builder().build();
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
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
            private String color; 
            private String creatorAccountId; 
            private Long id; 
            private String modiferAccountId; 
            private String name; 

            /**
             * color.
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * creatorAccountId.
             */
            public Builder creatorAccountId(String creatorAccountId) {
                this.creatorAccountId = creatorAccountId;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * modiferAccountId.
             */
            public Builder modiferAccountId(String modiferAccountId) {
                this.modiferAccountId = modiferAccountId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public FlowTagList build() {
                return new FlowTagList(this);
            } 

        } 

    }
    public static class FlowTagGroup extends TeaModel {
        @NameInMap("creatorAccountId")
        private String creatorAccountId;

        @NameInMap("flowTagList")
        private java.util.List < FlowTagList> flowTagList;

        @NameInMap("id")
        private Long id;

        @NameInMap("modiferAccountId")
        private String modiferAccountId;

        @NameInMap("name")
        private String name;

        private FlowTagGroup(Builder builder) {
            this.creatorAccountId = builder.creatorAccountId;
            this.flowTagList = builder.flowTagList;
            this.id = builder.id;
            this.modiferAccountId = builder.modiferAccountId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowTagGroup create() {
            return builder().build();
        }

        /**
         * @return creatorAccountId
         */
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        /**
         * @return flowTagList
         */
        public java.util.List < FlowTagList> getFlowTagList() {
            return this.flowTagList;
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
            private java.util.List < FlowTagList> flowTagList; 
            private Long id; 
            private String modiferAccountId; 
            private String name; 

            /**
             * creatorAccountId.
             */
            public Builder creatorAccountId(String creatorAccountId) {
                this.creatorAccountId = creatorAccountId;
                return this;
            }

            /**
             * flowTagList.
             */
            public Builder flowTagList(java.util.List < FlowTagList> flowTagList) {
                this.flowTagList = flowTagList;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * modiferAccountId.
             */
            public Builder modiferAccountId(String modiferAccountId) {
                this.modiferAccountId = modiferAccountId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public FlowTagGroup build() {
                return new FlowTagGroup(this);
            } 

        } 

    }
}
