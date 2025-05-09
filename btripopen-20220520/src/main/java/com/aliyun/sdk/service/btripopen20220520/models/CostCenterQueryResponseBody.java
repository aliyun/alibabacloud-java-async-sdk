// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link CostCenterQueryResponseBody} extends {@link TeaModel}
 *
 * <p>CostCenterQueryResponseBody</p>
 */
public class CostCenterQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private java.util.List<Module> module;

    @com.aliyun.core.annotation.NameInMap("more_page")
    private Boolean morePage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private CostCenterQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.morePage = builder.morePage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CostCenterQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return module
     */
    public java.util.List<Module> getModule() {
        return this.module;
    }

    /**
     * @return morePage
     */
    public Boolean getMorePage() {
        return this.morePage;
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
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List<Module> module; 
        private Boolean morePage; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(CostCenterQueryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.morePage = model.morePage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(java.util.List<Module> module) {
            this.module = module;
            return this;
        }

        /**
         * more_page.
         */
        public Builder morePage(Boolean morePage) {
            this.morePage = morePage;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>21041ce316577904808056433edbb2</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CostCenterQueryResponseBody build() {
            return new CostCenterQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CostCenterQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CostCenterQueryResponseBody</p>
     */
    public static class EntityDOS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("entity_id")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("entity_type")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("user_num")
        private Integer userNum;

        private EntityDOS(Builder builder) {
            this.corpId = builder.corpId;
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
            this.name = builder.name;
            this.userNum = builder.userNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityDOS create() {
            return builder().build();
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return userNum
         */
        public Integer getUserNum() {
            return this.userNum;
        }

        public static final class Builder {
            private String corpId; 
            private String entityId; 
            private String entityType; 
            private String name; 
            private Integer userNum; 

            private Builder() {
            } 

            private Builder(EntityDOS model) {
                this.corpId = model.corpId;
                this.entityId = model.entityId;
                this.entityType = model.entityType;
                this.name = model.name;
                this.userNum = model.userNum;
            } 

            /**
             * corp_id.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * entity_id.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * entity_type.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * user_num.
             */
            public Builder userNum(Integer userNum) {
                this.userNum = userNum;
                return this;
            }

            public EntityDOS build() {
                return new EntityDOS(this);
            } 

        } 

    }
    /**
     * 
     * {@link CostCenterQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CostCenterQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alipay_no")
        private String alipayNo;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("disable")
        private Long disable;

        @com.aliyun.core.annotation.NameInMap("entity_d_o_s")
        private java.util.List<EntityDOS> entityDOS;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("rule_code")
        private Long ruleCode;

        @com.aliyun.core.annotation.NameInMap("scope")
        private Long scope;

        @com.aliyun.core.annotation.NameInMap("thirdpart_id")
        private String thirdpartId;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Module(Builder builder) {
            this.alipayNo = builder.alipayNo;
            this.corpId = builder.corpId;
            this.disable = builder.disable;
            this.entityDOS = builder.entityDOS;
            this.id = builder.id;
            this.number = builder.number;
            this.ruleCode = builder.ruleCode;
            this.scope = builder.scope;
            this.thirdpartId = builder.thirdpartId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return alipayNo
         */
        public String getAlipayNo() {
            return this.alipayNo;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return disable
         */
        public Long getDisable() {
            return this.disable;
        }

        /**
         * @return entityDOS
         */
        public java.util.List<EntityDOS> getEntityDOS() {
            return this.entityDOS;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return ruleCode
         */
        public Long getRuleCode() {
            return this.ruleCode;
        }

        /**
         * @return scope
         */
        public Long getScope() {
            return this.scope;
        }

        /**
         * @return thirdpartId
         */
        public String getThirdpartId() {
            return this.thirdpartId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String alipayNo; 
            private String corpId; 
            private Long disable; 
            private java.util.List<EntityDOS> entityDOS; 
            private Long id; 
            private String number; 
            private Long ruleCode; 
            private Long scope; 
            private String thirdpartId; 
            private String title; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.alipayNo = model.alipayNo;
                this.corpId = model.corpId;
                this.disable = model.disable;
                this.entityDOS = model.entityDOS;
                this.id = model.id;
                this.number = model.number;
                this.ruleCode = model.ruleCode;
                this.scope = model.scope;
                this.thirdpartId = model.thirdpartId;
                this.title = model.title;
            } 

            /**
             * alipay_no.
             */
            public Builder alipayNo(String alipayNo) {
                this.alipayNo = alipayNo;
                return this;
            }

            /**
             * corp_id.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * disable.
             */
            public Builder disable(Long disable) {
                this.disable = disable;
                return this;
            }

            /**
             * entity_d_o_s.
             */
            public Builder entityDOS(java.util.List<EntityDOS> entityDOS) {
                this.entityDOS = entityDOS;
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
             * number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>rule code</p>
             * 
             * <strong>example:</strong>
             * <p>500578154</p>
             */
            public Builder ruleCode(Long ruleCode) {
                this.ruleCode = ruleCode;
                return this;
            }

            /**
             * scope.
             */
            public Builder scope(Long scope) {
                this.scope = scope;
                return this;
            }

            /**
             * thirdpart_id.
             */
            public Builder thirdpartId(String thirdpartId) {
                this.thirdpartId = thirdpartId;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
