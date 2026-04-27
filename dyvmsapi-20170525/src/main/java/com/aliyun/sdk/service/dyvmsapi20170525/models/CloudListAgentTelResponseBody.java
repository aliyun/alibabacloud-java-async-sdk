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
 * {@link CloudListAgentTelResponseBody} extends {@link TeaModel}
 *
 * <p>CloudListAgentTelResponseBody</p>
 */
public class CloudListAgentTelResponseBody extends TeaModel {
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

    private CloudListAgentTelResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudListAgentTelResponseBody create() {
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

        private Builder(CloudListAgentTelResponseBody model) {
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

        public CloudListAgentTelResponseBody build() {
            return new CloudListAgentTelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudListAgentTelResponseBody} extends {@link TeaModel}
     *
     * <p>CloudListAgentTelResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private Long agentId;

        @com.aliyun.core.annotation.NameInMap("AreaCode")
        private String areaCode;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private Long enterpriseId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsBind")
        private Long isBind;

        @com.aliyun.core.annotation.NameInMap("IsValidity")
        private Long isValidity;

        @com.aliyun.core.annotation.NameInMap("Tel")
        private String tel;

        @com.aliyun.core.annotation.NameInMap("TelType")
        private Long telType;

        private List(Builder builder) {
            this.agentId = builder.agentId;
            this.areaCode = builder.areaCode;
            this.cno = builder.cno;
            this.createTime = builder.createTime;
            this.enterpriseId = builder.enterpriseId;
            this.id = builder.id;
            this.isBind = builder.isBind;
            this.isValidity = builder.isValidity;
            this.tel = builder.tel;
            this.telType = builder.telType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public Long getAgentId() {
            return this.agentId;
        }

        /**
         * @return areaCode
         */
        public String getAreaCode() {
            return this.areaCode;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isBind
         */
        public Long getIsBind() {
            return this.isBind;
        }

        /**
         * @return isValidity
         */
        public Long getIsValidity() {
            return this.isValidity;
        }

        /**
         * @return tel
         */
        public String getTel() {
            return this.tel;
        }

        /**
         * @return telType
         */
        public Long getTelType() {
            return this.telType;
        }

        public static final class Builder {
            private Long agentId; 
            private String areaCode; 
            private String cno; 
            private String createTime; 
            private Long enterpriseId; 
            private Long id; 
            private Long isBind; 
            private Long isValidity; 
            private String tel; 
            private Long telType; 

            private Builder() {
            } 

            private Builder(List model) {
                this.agentId = model.agentId;
                this.areaCode = model.areaCode;
                this.cno = model.cno;
                this.createTime = model.createTime;
                this.enterpriseId = model.enterpriseId;
                this.id = model.id;
                this.isBind = model.isBind;
                this.isValidity = model.isValidity;
                this.tel = model.tel;
                this.telType = model.telType;
            } 

            /**
             * <p>座席id</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
             */
            public Builder agentId(Long agentId) {
                this.agentId = agentId;
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
             * <p>座席工号</p>
             * 
             * <strong>example:</strong>
             * <p>7098</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
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
             * <p>7122600</p>
             */
            public Builder enterpriseId(Long enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>座席电话id</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>是否绑定，0:未绑定 1:绑定</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isBind(Long isBind) {
                this.isBind = isBind;
                return this;
            }

            /**
             * <p>是否验证，0:未验证 1:已验证</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isValidity(Long isValidity) {
                this.isValidity = isValidity;
                return this;
            }

            /**
             * <p>电话号码</p>
             * 
             * <strong>example:</strong>
             * <p>41008502</p>
             */
            public Builder tel(String tel) {
                this.tel = tel;
                return this;
            }

            /**
             * <p>电话类型，1:固话 2:手机 3:分机 4:软电话</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder telType(Long telType) {
                this.telType = telType;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudListAgentTelResponseBody} extends {@link TeaModel}
     *
     * <p>CloudListAgentTelResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        private Data(Builder builder) {
            this.list = builder.list;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        public static final class Builder {
            private java.util.List<List> list; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
            } 

            /**
             * <p>座席电话数组</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
