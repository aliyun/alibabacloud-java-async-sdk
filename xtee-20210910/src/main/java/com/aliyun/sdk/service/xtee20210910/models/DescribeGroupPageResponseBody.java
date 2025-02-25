// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupPageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupPageResponseBody</p>
 */
public class DescribeGroupPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("totalItem")
    private Integer totalItem;

    @com.aliyun.core.annotation.NameInMap("totalPage")
    private Integer totalPage;

    private DescribeGroupPageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.resultObject = builder.resultObject;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupPageResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resultObject
     */
    public java.util.List < ResultObject> getResultObject() {
        return this.resultObject;
    }

    /**
     * @return totalItem
     */
    public Integer getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String requestId; 
        private Integer currentPage; 
        private Integer pageSize; 
        private java.util.List < ResultObject> resultObject; 
        private Integer totalItem; 
        private Integer totalPage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(java.util.List < ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * totalItem.
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * totalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeGroupPageResponseBody build() {
            return new DescribeGroupPageResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("communityNo")
        private String communityNo;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("groupRisk")
        private String groupRisk;

        @com.aliyun.core.annotation.NameInMap("groupScale")
        private String groupScale;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("sceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private ResultObject(Builder builder) {
            this.communityNo = builder.communityNo;
            this.createTime = builder.createTime;
            this.groupRisk = builder.groupRisk;
            this.groupScale = builder.groupScale;
            this.id = builder.id;
            this.sceneName = builder.sceneName;
            this.taskId = builder.taskId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return communityNo
         */
        public String getCommunityNo() {
            return this.communityNo;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return groupRisk
         */
        public String getGroupRisk() {
            return this.groupRisk;
        }

        /**
         * @return groupScale
         */
        public String getGroupScale() {
            return this.groupScale;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String communityNo; 
            private Long createTime; 
            private String groupRisk; 
            private String groupScale; 
            private Long id; 
            private String sceneName; 
            private Long taskId; 
            private String userId; 

            /**
             * communityNo.
             */
            public Builder communityNo(String communityNo) {
                this.communityNo = communityNo;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * groupRisk.
             */
            public Builder groupRisk(String groupRisk) {
                this.groupRisk = groupRisk;
                return this;
            }

            /**
             * groupScale.
             */
            public Builder groupScale(String groupScale) {
                this.groupScale = groupScale;
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
             * sceneName.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
