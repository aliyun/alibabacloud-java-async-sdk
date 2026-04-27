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
 * {@link CloudQueryAgentGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CloudQueryAgentGroupResponseBody</p>
 */
public class CloudQueryAgentGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloudQueryAgentGroupResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudQueryAgentGroupResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloudQueryAgentGroupResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloudQueryAgentGroupResponseBody build() {
            return new CloudQueryAgentGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudQueryAgentGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryAgentGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private Long enterpriseId;

        @com.aliyun.core.annotation.NameInMap("Gno")
        private String gno;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Long type;

        private Data(Builder builder) {
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.enterpriseId = builder.enterpriseId;
            this.gno = builder.gno;
            this.groupName = builder.groupName;
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return enterpriseId
         */
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return gno
         */
        public String getGno() {
            return this.gno;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        public static final class Builder {
            private String comment; 
            private String createTime; 
            private Long enterpriseId; 
            private String gno; 
            private String groupName; 
            private Long id; 
            private Long type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.comment = model.comment;
                this.createTime = model.createTime;
                this.enterpriseId = model.enterpriseId;
                this.gno = model.gno;
                this.groupName = model.groupName;
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * <p>描述信息</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>创建时间，格式: yyyy-MM-dd HH:mm:ss</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-20 10:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>企业编号</p>
             * 
             * <strong>example:</strong>
             * <p>7000002</p>
             */
            public Builder enterpriseId(Long enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>外呼组编号</p>
             * 
             * <strong>example:</strong>
             * <p>233</p>
             */
            public Builder gno(String gno) {
                this.gno = gno;
                return this;
            }

            /**
             * <p>外呼组名称</p>
             * 
             * <strong>example:</strong>
             * <p>name1</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>外呼组id</p>
             * 
             * <strong>example:</strong>
             * <p>33</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>外呼组类型 1：外呼总组 2：外呼组</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
