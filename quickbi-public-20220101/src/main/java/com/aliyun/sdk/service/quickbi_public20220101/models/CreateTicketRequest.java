// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link CreateTicketRequest} extends {@link RequestModel}
 *
 * <p>CreateTicketRequest</p>
 */
public class CreateTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @Deprecated
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    @Deprecated
    private Integer accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CmptId")
    private String cmptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Integer expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalParam")
    private String globalParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TicketNum")
    private Integer ticketNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatermarkParam")
    private String watermarkParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorksId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String worksId;

    private CreateTicketRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountType = builder.accountType;
        this.cmptId = builder.cmptId;
        this.expireTime = builder.expireTime;
        this.globalParam = builder.globalParam;
        this.ticketNum = builder.ticketNum;
        this.userId = builder.userId;
        this.watermarkParam = builder.watermarkParam;
        this.worksId = builder.worksId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTicketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return accountType
     */
    public Integer getAccountType() {
        return this.accountType;
    }

    /**
     * @return cmptId
     */
    public String getCmptId() {
        return this.cmptId;
    }

    /**
     * @return expireTime
     */
    public Integer getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return globalParam
     */
    public String getGlobalParam() {
        return this.globalParam;
    }

    /**
     * @return ticketNum
     */
    public Integer getTicketNum() {
        return this.ticketNum;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return watermarkParam
     */
    public String getWatermarkParam() {
        return this.watermarkParam;
    }

    /**
     * @return worksId
     */
    public String getWorksId() {
        return this.worksId;
    }

    public static final class Builder extends Request.Builder<CreateTicketRequest, Builder> {
        private String accountName; 
        private Integer accountType; 
        private String cmptId; 
        private Integer expireTime; 
        private String globalParam; 
        private Integer ticketNum; 
        private String userId; 
        private String watermarkParam; 
        private String worksId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTicketRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountType = request.accountType;
            this.cmptId = request.cmptId;
            this.expireTime = request.expireTime;
            this.globalParam = request.globalParam;
            this.ticketNum = request.ticketNum;
            this.userId = request.userId;
            this.watermarkParam = request.watermarkParam;
            this.worksId = request.worksId;
        } 

        /**
         * <p>The user&quot;s account name.</p>
         * <ul>
         * <li>If the user is an Alibaba Cloud primary account <strong>wangwu</strong>, the format is <strong>[Primary Account]</strong>, for example, <strong>wangwu</strong>.</li>
         * <li>If the user is a RAM account <strong>zhangsan</strong>@aliyun.cn, the format is <strong>[Primary Account: Sub-account]</strong>, for example, <strong>wangwu:zhangsan</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>Only one of UserId and AccountName needs to be filled in. If neither is filled in, it will default to binding the report&quot;s Owner, and the report will be accessed with that user&quot;s identity. If you need to configure row-level permissions, please refer to <a href="https://help.aliyun.com/document_detail/322783.html">Row-Level Permissions</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test user</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The type of the user&quot;s account.</p>
         * <ul>
         * <li>1: Alibaba Cloud account</li>
         * <li>3: Quick BI self-built account</li>
         * <li>4: DingTalk</li>
         * <li>5: RAM sub-account</li>
         * <li>9: WeCom</li>
         * <li>10: Feishu<blockquote>
         * <p>If AccountName is not empty, then AccountType must also not be empty.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder accountType(Integer accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>Component ID. This is the ID of a component within the above-mentioned dashboard; other types of works do not support this.
         * Refer to the <a href="https://next.api.aliyun.com/api/quickbi-public/2022-01-01/QueryWorksBloodRelationship?spm=a2c4g.11186623.0.0.15615d7aWVvWAl&params=%7B%7D&lang=JAVA&tab=DOC&sdkStyle=old">QueryWorksBloodRelationship</a> API for obtaining the component ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0fc6a275c7f64f17b1****a306ce0f31</p>
         */
        public Builder cmptId(String cmptId) {
            this.putQueryParameter("CmptId", cmptId);
            this.cmptId = cmptId;
            return this;
        }

        /**
         * <p>Expiration time</p>
         * <ul>
         * <li>Unit: minutes</li>
         * <li>Default: 240</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder expireTime(Integer expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>Global parameters for the report filter conditions.</p>
         * <ul>
         * <li>A string in JsonArray format.</li>
         * </ul>
         * <blockquote>
         * <p>If you need to use global parameter capabilities, please contact the <a href="https://h5-alimebot.dingtalk.com/intl/index.htm?spm=a2c4g.11186623.0.0.3da14f6chrDv9e&sourceType=ding_talk&from=DEFFB9G5KBByQkwq23wneFIOmaJ">Quick BI Operations Manager</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;paramKey&quot;:&quot;price&quot;,&quot;joinType&quot;:&quot;and&quot;,&quot;conditionList&quot;:[{&quot;operate&quot;:&quot;&gt;&quot;,&quot;value&quot;:&quot;0&quot;}]}]</p>
         */
        public Builder globalParam(String globalParam) {
            this.putQueryParameter("GlobalParam", globalParam);
            this.globalParam = globalParam;
            return this;
        }

        /**
         * <p>The number of tickets. Each time a ticket is used, the number of tickets decreases by 1.</p>
         * <ul>
         * <li>Default value: 1</li>
         * <li>Recommended value: 1</li>
         * <li>Maximum value: 99999</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ticketNum(Integer ticketNum) {
            this.putQueryParameter("TicketNum", ticketNum);
            this.ticketNum = ticketNum;
            return this;
        }

        /**
         * <p>Quick BI&quot;s UserId, which is not your Alibaba Cloud account ID.
         * You can call the <a href="https://next.api.aliyun.com/api/quickbi-public/2022-01-01/QueryUserInfoByAccount?spm=a2c4g.11186623.0.0.15615d7aWVvWAl&params=%7B%7D&tab=DOC&sdkStyle=old">QueryUserInfoByAccount</a> API to obtain the UserId. An example of a UserId is fe67f61a35a94b7da1a34ba174a7****.</p>
         * <blockquote>
         * <p>Only one of UserId and AccountName needs to be filled in. If neither is filled in, it will default to binding the report&quot;s Owner, and the report will be accessed with that user&quot;s identity. If you need to configure row-level permissions, please refer to <a href="https://help.aliyun.com/document_detail/322783.html">Row-Level Permissions</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>46e537466****92704c8</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>Watermark parameters for the report.</p>
         * <ul>
         * <li>Must not exceed 50 characters.</li>
         * <li>When the report type is a large screen, watermark parameter passing is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Three-party embedding</p>
         */
        public Builder watermarkParam(String watermarkParam) {
            this.putQueryParameter("WatermarkParam", watermarkParam);
            this.watermarkParam = watermarkParam;
            return this;
        }

        /**
         * <p>The ID of the report to be embedded. Currently supports dashboards, spreadsheets, data screens, self-service data retrieval, ad-hoc analysis, and data entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a206f5f3-****-e9b17c835b03</p>
         */
        public Builder worksId(String worksId) {
            this.putQueryParameter("WorksId", worksId);
            this.worksId = worksId;
            return this;
        }

        @Override
        public CreateTicketRequest build() {
            return new CreateTicketRequest(this);
        } 

    } 

}
