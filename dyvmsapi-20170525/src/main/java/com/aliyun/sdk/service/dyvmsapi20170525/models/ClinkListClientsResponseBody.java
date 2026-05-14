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
 * {@link ClinkListClientsResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkListClientsResponseBody</p>
 */
public class ClinkListClientsResponseBody extends TeaModel {
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

    private ClinkListClientsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkListClientsResponseBody create() {
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

        private Builder(ClinkListClientsResponseBody model) {
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

        public ClinkListClientsResponseBody build() {
            return new ClinkListClientsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkListClientsResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkListClientsResponseBody</p>
     */
    public static class Clients extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Long active;

        @com.aliyun.core.annotation.NameInMap("AreaCode")
        private String areaCode;

        @com.aliyun.core.annotation.NameInMap("BindTel")
        private String bindTel;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CrmId")
        private String crmId;

        @com.aliyun.core.annotation.NameInMap("HiddenTel")
        private Long hiddenTel;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Qnos")
        private java.util.List<String> qnos;

        @com.aliyun.core.annotation.NameInMap("Role")
        private Long role;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Long type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Clients(Builder builder) {
            this.active = builder.active;
            this.areaCode = builder.areaCode;
            this.bindTel = builder.bindTel;
            this.cno = builder.cno;
            this.createTime = builder.createTime;
            this.crmId = builder.crmId;
            this.hiddenTel = builder.hiddenTel;
            this.id = builder.id;
            this.name = builder.name;
            this.qnos = builder.qnos;
            this.role = builder.role;
            this.status = builder.status;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clients create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Long getActive() {
            return this.active;
        }

        /**
         * @return areaCode
         */
        public String getAreaCode() {
            return this.areaCode;
        }

        /**
         * @return bindTel
         */
        public String getBindTel() {
            return this.bindTel;
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return crmId
         */
        public String getCrmId() {
            return this.crmId;
        }

        /**
         * @return hiddenTel
         */
        public Long getHiddenTel() {
            return this.hiddenTel;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return qnos
         */
        public java.util.List<String> getQnos() {
            return this.qnos;
        }

        /**
         * @return role
         */
        public Long getRole() {
            return this.role;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long active; 
            private String areaCode; 
            private String bindTel; 
            private String cno; 
            private Long createTime; 
            private String crmId; 
            private Long hiddenTel; 
            private Long id; 
            private String name; 
            private java.util.List<String> qnos; 
            private Long role; 
            private Long status; 
            private Long type; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Clients model) {
                this.active = model.active;
                this.areaCode = model.areaCode;
                this.bindTel = model.bindTel;
                this.cno = model.cno;
                this.createTime = model.createTime;
                this.crmId = model.crmId;
                this.hiddenTel = model.hiddenTel;
                this.id = model.id;
                this.name = model.name;
                this.qnos = model.qnos;
                this.role = model.role;
                this.status = model.status;
                this.type = model.type;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>是否激活，0: 否；1: 是</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder active(Long active) {
                this.active = active;
                return this;
            }

            /**
             * <p>区号</p>
             * 
             * <strong>example:</strong>
             * <p>010</p>
             */
            public Builder areaCode(String areaCode) {
                this.areaCode = areaCode;
                return this;
            }

            /**
             * <p>座席绑定电话</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder bindTel(String bindTel) {
                this.bindTel = bindTel;
                return this;
            }

            /**
             * <p>座席号</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>座席crm id</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder crmId(String crmId) {
                this.crmId = crmId;
                return this;
            }

            /**
             * <p>号码隐藏类型，0: 不隐藏；1: 隐藏规则与全局设置保持一致</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder hiddenTel(Long hiddenTel) {
                this.hiddenTel = hiddenTel;
                return this;
            }

            /**
             * <p>座席 Id</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>座席名称</p>
             * 
             * <strong>example:</strong>
             * <p>2222</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>座席所属队列的队列号数组</p>
             */
            public Builder qnos(java.util.List<String> qnos) {
                this.qnos = qnos;
                return this;
            }

            /**
             * <p>座席角色，0: 普通座席；1: 班长座席</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder role(Long role) {
                this.role = role;
                return this;
            }

            /**
             * <p>座席状态，0: 离线；1: 在线</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>座席类型，1：全渠道、2：呼叫中心、3：在线客服</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            /**
             * <p>修改时间</p>
             * 
             * <strong>example:</strong>
             * <p>1775024775</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Clients build() {
                return new Clients(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkListClientsResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkListClientsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clients")
        private java.util.List<Clients> clients;

        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.clients = builder.clients;
            this.clinkRequestId = builder.clinkRequestId;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clients
         */
        public java.util.List<Clients> getClients() {
            return this.clients;
        }

        /**
         * @return clinkRequestId
         */
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Clients> clients; 
            private String clinkRequestId; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clients = model.clients;
                this.clinkRequestId = model.clinkRequestId;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>座席对象列表</p>
             */
            public Builder clients(java.util.List<Clients> clients) {
                this.clients = clients;
                return this;
            }

            /**
             * <p>请求 id</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder clinkRequestId(String clinkRequestId) {
                this.clinkRequestId = clinkRequestId;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
