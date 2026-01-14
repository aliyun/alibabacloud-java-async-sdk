// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

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
 * {@link AgentImportNumberRequest} extends {@link RequestModel}
 *
 * <p>AgentImportNumberRequest</p>
 */
public class AgentImportNumberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private Long agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentTag")
    private String agentTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long callType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Customers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Customers> customers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private Long gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    private AgentImportNumberRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.agentTag = builder.agentTag;
        this.callType = builder.callType;
        this.customers = builder.customers;
        this.gatewayId = builder.gatewayId;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentImportNumberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public Long getAgentId() {
        return this.agentId;
    }

    /**
     * @return agentTag
     */
    public String getAgentTag() {
        return this.agentTag;
    }

    /**
     * @return callType
     */
    public Long getCallType() {
        return this.callType;
    }

    /**
     * @return customers
     */
    public java.util.List<Customers> getCustomers() {
        return this.customers;
    }

    /**
     * @return gatewayId
     */
    public Long getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<AgentImportNumberRequest, Builder> {
        private Long agentId; 
        private String agentTag; 
        private Long callType; 
        private java.util.List<Customers> customers; 
        private Long gatewayId; 
        private String outId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(AgentImportNumberRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.agentTag = request.agentTag;
            this.callType = request.callType;
            this.customers = request.customers;
            this.gatewayId = request.gatewayId;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.templateId = request.templateId;
        } 

        /**
         * <p>坐席ID，可以为空，但agentId与agentTag必须其中1个有值。用于查询对应的坐席信息</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder agentId(Long agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>坐席唯一标识（创建坐席时的用户唯一标识），可以为空，但agentId与agentTag必须其中1个有值。用于查询对应的坐席信息</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder agentTag(String agentTag) {
            this.putQueryParameter("AgentTag", agentTag);
            this.agentTag = agentTag;
            return this;
        }

        /**
         * <p>外呼类型 可选项：1001：坐席-人工外呼，1002：坐席-AI外呼-不转人工，1003：坐席-AI外呼-接通转人工，1004：坐席-AI外呼-智能转人工&quot;</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>79</p>
         */
        public Builder callType(Long callType) {
            this.putQueryParameter("CallType", callType);
            this.callType = callType;
            return this;
        }

        /**
         * <p>具体用户信息，如手机号、姓名等，需根据具体任务参数要求传输。注：当callType为1001时，只会导入第1条数据</p>
         * <p>This parameter is required.</p>
         */
        public Builder customers(java.util.List<Customers> customers) {
            String customersShrink = shrink(customers, "Customers", "json");
            this.putQueryParameter("Customers", customersShrink);
            this.customers = customers;
            return this;
        }

        /**
         * <p>坐席-人工外呼选择的外呼线路，只针对callType=1001生效，其他callType不生效。如callType=1001，且gatewayId不传值，默认按系统的线路配置外呼</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>请求id，具有唯一性，用来做请求幂等处理，一个请求id有效期10分钟。不传则不做幂等处理</p>
         * 
         * <strong>example:</strong>
         * <p>1asgfh</p>
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>AI话术ID 客户已制作并已发布/平台授权的AI话术ID，如callType=1001可不填；如callType=1002,1003或1004 ，必填。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public AgentImportNumberRequest build() {
            return new AgentImportNumberRequest(this);
        } 

    } 

    /**
     * 
     * {@link AgentImportNumberRequest} extends {@link TeaModel}
     *
     * <p>AgentImportNumberRequest</p>
     */
    public static class Customers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientUrl")
        private String clientUrl;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("NumberMD5")
        private String numberMD5;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.Map<String, ?> properties;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private Customers(Builder builder) {
            this.clientUrl = builder.clientUrl;
            this.number = builder.number;
            this.numberMD5 = builder.numberMD5;
            this.properties = builder.properties;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Customers create() {
            return builder().build();
        }

        /**
         * @return clientUrl
         */
        public String getClientUrl() {
            return this.clientUrl;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return numberMD5
         */
        public String getNumberMD5() {
            return this.numberMD5;
        }

        /**
         * @return properties
         */
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String clientUrl; 
            private String number; 
            private String numberMD5; 
            private java.util.Map<String, ?> properties; 
            private String tag; 

            private Builder() {
            } 

            private Builder(Customers model) {
                this.clientUrl = model.clientUrl;
                this.number = model.number;
                this.numberMD5 = model.numberMD5;
                this.properties = model.properties;
                this.tag = model.tag;
            } 

            /**
             * <p>客户详情URL,用于展示客户用户在客户业务系统的详细信息，做多80个字符</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder clientUrl(String clientUrl) {
                this.clientUrl = clientUrl;
                return this;
            }

            /**
             * <p>号码，如手机号等</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>用户电话号码MD5，和number两者必传一个</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder numberMD5(String numberMD5) {
                this.numberMD5 = numberMD5;
                return this;
            }

            /**
             * <p>用户具体信息。如AI话术模板没变量要求或为人工外呼，可为空(总长度500个字符，多余的会被剔除)</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;test&quot;:&quot;234&quot;}</p>
             */
            public Builder properties(java.util.Map<String, ?> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>用户自定义标签,最多50个字符</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public Customers build() {
                return new Customers(this);
            } 

        } 

    }
}
