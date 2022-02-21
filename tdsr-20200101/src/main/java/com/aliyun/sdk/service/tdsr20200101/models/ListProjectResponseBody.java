// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectResponseBody</p>
 */
public class ListProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Count")
    private Long count;

    @NameInMap("CurrentPage")
    private Long currentPage;

    @NameInMap("HasNext")
    private Boolean hasNext;

    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalPage")
    private Long totalPage;

    private ListProjectResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.hasNext = builder.hasNext;
        this.list = builder.list;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return hasNext
     */
    public Boolean getHasNext() {
        return this.hasNext;
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    /**
     * @return totalPage
     */
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private Long code; 
        private Long count; 
        private Long currentPage; 
        private Boolean hasNext; 
        private java.util.List < List> list; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Long totalPage; 

        /**
         * 返回码
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * count
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * 当前页
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * 是否有下一页
         */
        public Builder hasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }

        /**
         * 项目数据
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * 错误消息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求ID，与入参requestId对应
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 是否请求成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * 总页数
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListProjectResponseBody build() {
            return new ListProjectResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("BusinessId")
        private Long businessId;

        @NameInMap("BusinessName")
        private String businessName;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("Token")
        private String token;

        private List(Builder builder) {
            this.businessId = builder.businessId;
            this.businessName = builder.businessName;
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return businessId
         */
        public Long getBusinessId() {
            return this.businessId;
        }

        /**
         * @return businessName
         */
        public String getBusinessName() {
            return this.businessName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private Long businessId; 
            private String businessName; 
            private Long createTime; 
            private String id; 
            private Long modifiedTime; 
            private String name; 
            private String token; 

            /**
             * 业务ID
             */
            public Builder businessId(Long businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * 业务名称
             */
            public Builder businessName(String businessName) {
                this.businessName = businessName;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 项目ID
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 最后修改时间
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * 项目名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Token
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
