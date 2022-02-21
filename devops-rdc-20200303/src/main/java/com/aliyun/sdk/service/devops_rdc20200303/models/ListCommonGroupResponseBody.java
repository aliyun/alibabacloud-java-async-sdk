// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCommonGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListCommonGroupResponseBody</p>
 */
public class ListCommonGroupResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("Object")
    private java.util.List < Object> object;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Successful")
    private Boolean successful;

    private ListCommonGroupResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.successful = builder.successful;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommonGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return object
     */
    public java.util.List < Object> getObject() {
        return this.object;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successful
     */
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private java.util.List < Object> object; 
        private String requestId; 
        private Boolean successful; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Object.
         */
        public Builder object(java.util.List < Object> object) {
            this.object = object;
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
         * Successful.
         */
        public Builder successful(Boolean successful) {
            this.successful = successful;
            return this;
        }

        public ListCommonGroupResponseBody build() {
            return new ListCommonGroupResponseBody(this);
        } 

    } 

    public static class Object extends TeaModel {
        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("IsRoot")
        private Boolean isRoot;

        @NameInMap("Name")
        private String name;

        @NameInMap("Pinyin")
        private String pinyin;

        @NameInMap("Pos")
        private Integer pos;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("ResourceCount")
        private Integer resourceCount;

        @NameInMap("SmartGroupId")
        private String smartGroupId;

        @NameInMap("id")
        private String id;

        private Object(Builder builder) {
            this.creatorId = builder.creatorId;
            this.isRoot = builder.isRoot;
            this.name = builder.name;
            this.pinyin = builder.pinyin;
            this.pos = builder.pos;
            this.projectId = builder.projectId;
            this.resourceCount = builder.resourceCount;
            this.smartGroupId = builder.smartGroupId;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Object create() {
            return builder().build();
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return isRoot
         */
        public Boolean getIsRoot() {
            return this.isRoot;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pinyin
         */
        public String getPinyin() {
            return this.pinyin;
        }

        /**
         * @return pos
         */
        public Integer getPos() {
            return this.pos;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return resourceCount
         */
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        /**
         * @return smartGroupId
         */
        public String getSmartGroupId() {
            return this.smartGroupId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String creatorId; 
            private Boolean isRoot; 
            private String name; 
            private String pinyin; 
            private Integer pos; 
            private String projectId; 
            private Integer resourceCount; 
            private String smartGroupId; 
            private String id; 

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * IsRoot.
             */
            public Builder isRoot(Boolean isRoot) {
                this.isRoot = isRoot;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Pinyin.
             */
            public Builder pinyin(String pinyin) {
                this.pinyin = pinyin;
                return this;
            }

            /**
             * Pos.
             */
            public Builder pos(Integer pos) {
                this.pos = pos;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ResourceCount.
             */
            public Builder resourceCount(Integer resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * SmartGroupId.
             */
            public Builder smartGroupId(String smartGroupId) {
                this.smartGroupId = smartGroupId;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Object build() {
                return new Object(this);
            } 

        } 

    }
}
