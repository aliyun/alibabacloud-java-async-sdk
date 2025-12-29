// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link ListServiceInstanceForPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceInstanceForPageResponseBody</p>
 */
public class ListServiceInstanceForPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListServiceInstanceForPageResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceInstanceForPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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
        private String accessDeniedDetail; 
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListServiceInstanceForPageResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>状态码，OK表示响应成功</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>响应消息</p>
         * 
         * <strong>example:</strong>
         * <p>每页最大100条！</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * <p>请求唯一id</p>
         * 
         * <strong>example:</strong>
         * <p>ED18A5AE-9BBC-5851-1111-8E5B8C23CEDE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>是否成功</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListServiceInstanceForPageResponseBody build() {
            return new ListServiceInstanceForPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceInstanceForPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceInstanceForPageResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RelationAvailableCount")
        private Long relationAvailableCount;

        @com.aliyun.core.annotation.NameInMap("RelationTotalCount")
        private Long relationTotalCount;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private Long sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UsageId")
        private Long usageId;

        @com.aliyun.core.annotation.NameInMap("UsageName")
        private String usageName;

        private Records(Builder builder) {
            this.aliUid = builder.aliUid;
            this.code = builder.code;
            this.gmtCreate = builder.gmtCreate;
            this.instanceStatus = builder.instanceStatus;
            this.name = builder.name;
            this.relationAvailableCount = builder.relationAvailableCount;
            this.relationTotalCount = builder.relationTotalCount;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.status = builder.status;
            this.usageId = builder.usageId;
            this.usageName = builder.usageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return relationAvailableCount
         */
        public Long getRelationAvailableCount() {
            return this.relationAvailableCount;
        }

        /**
         * @return relationTotalCount
         */
        public Long getRelationTotalCount() {
            return this.relationTotalCount;
        }

        /**
         * @return sceneId
         */
        public Long getSceneId() {
            return this.sceneId;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return usageId
         */
        public Long getUsageId() {
            return this.usageId;
        }

        /**
         * @return usageName
         */
        public String getUsageName() {
            return this.usageName;
        }

        public static final class Builder {
            private Long aliUid; 
            private String code; 
            private String gmtCreate; 
            private String instanceStatus; 
            private String name; 
            private Long relationAvailableCount; 
            private Long relationTotalCount; 
            private Long sceneId; 
            private String sceneName; 
            private String status; 
            private Long usageId; 
            private String usageName; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.aliUid = model.aliUid;
                this.code = model.code;
                this.gmtCreate = model.gmtCreate;
                this.instanceStatus = model.instanceStatus;
                this.name = model.name;
                this.relationAvailableCount = model.relationAvailableCount;
                this.relationTotalCount = model.relationTotalCount;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
                this.status = model.status;
                this.usageId = model.usageId;
                this.usageName = model.usageName;
            } 

            /**
             * <p>aliUid</p>
             * 
             * <strong>example:</strong>
             * <p>11******123</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>服务实例号</p>
             * 
             * <strong>example:</strong>
             * <p>0571****1234</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>创建时间（时间戳）</p>
             * 
             * <strong>example:</strong>
             * <p>1759109856000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>实例状态（init：初始化；usable：可用；unusable：不可用；destory：注销）</p>
             * 
             * <strong>example:</strong>
             * <p>init</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>服务实例名称</p>
             * 
             * <strong>example:</strong>
             * <p>测试数据</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>关联可用数量</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder relationAvailableCount(Long relationAvailableCount) {
                this.relationAvailableCount = relationAvailableCount;
                return this;
            }

            /**
             * <p>关联总数量</p>
             * 
             * <strong>example:</strong>
             * <p>33</p>
             */
            public Builder relationTotalCount(Long relationTotalCount) {
                this.relationTotalCount = relationTotalCount;
                return this;
            }

            /**
             * <p>场景ID</p>
             * 
             * <strong>example:</strong>
             * <p>29</p>
             */
            public Builder sceneId(Long sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>场景名称</p>
             * 
             * <strong>example:</strong>
             * <p>系统通知</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>绑定状态：绑定；未绑定</p>
             * 
             * <strong>example:</strong>
             * <p>绑定</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>用途ID</p>
             * 
             * <strong>example:</strong>
             * <p>96</p>
             */
            public Builder usageId(Long usageId) {
                this.usageId = usageId;
                return this;
            }

            /**
             * <p>用途名称</p>
             * 
             * <strong>example:</strong>
             * <p>语音通知</p>
             */
            public Builder usageName(String usageName) {
                this.usageName = usageName;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServiceInstanceForPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceInstanceForPageResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Long totalPage;

        private Model(Builder builder) {
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalCount = builder.totalCount;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPage
         */
        public Long getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Long pageNo; 
            private Long pageSize; 
            private java.util.List<Records> records; 
            private Long totalCount; 
            private Long totalPage; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.records = model.records;
                this.totalCount = model.totalCount;
                this.totalPage = model.totalPage;
            } 

            /**
             * <p>当前页码</p>
             * 
             * <strong>example:</strong>
             * <p>47</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>每页数量</p>
             * 
             * <strong>example:</strong>
             * <p>59</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * <p>总数</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>总页数</p>
             * 
             * <strong>example:</strong>
             * <p>76</p>
             */
            public Builder totalPage(Long totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
