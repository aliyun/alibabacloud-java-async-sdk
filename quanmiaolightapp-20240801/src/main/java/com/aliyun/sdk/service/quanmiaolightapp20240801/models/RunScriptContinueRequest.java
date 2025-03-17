// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link RunScriptContinueRequest} extends {@link RequestModel}
 *
 * <p>RunScriptContinueRequest</p>
 */
public class RunScriptContinueRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptSummary")
    @com.aliyun.core.annotation.Validation(maxLength = 5000)
    private String scriptSummary;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptTypeKeyword")
    @com.aliyun.core.annotation.Validation(maxLength = 5000)
    private String scriptTypeKeyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userProvidedContent")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 5000)
    private String userProvidedContent;

    private RunScriptContinueRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.scriptSummary = builder.scriptSummary;
        this.scriptTypeKeyword = builder.scriptTypeKeyword;
        this.userProvidedContent = builder.userProvidedContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunScriptContinueRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return scriptSummary
     */
    public String getScriptSummary() {
        return this.scriptSummary;
    }

    /**
     * @return scriptTypeKeyword
     */
    public String getScriptTypeKeyword() {
        return this.scriptTypeKeyword;
    }

    /**
     * @return userProvidedContent
     */
    public String getUserProvidedContent() {
        return this.userProvidedContent;
    }

    public static final class Builder extends Request.Builder<RunScriptContinueRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String scriptSummary; 
        private String scriptTypeKeyword; 
        private String userProvidedContent; 

        private Builder() {
            super();
        } 

        private Builder(RunScriptContinueRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.scriptSummary = request.scriptSummary;
            this.scriptTypeKeyword = request.scriptTypeKeyword;
            this.userProvidedContent = request.userProvidedContent;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-e9zzbkg0aj2mlXX</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * scriptSummary.
         */
        public Builder scriptSummary(String scriptSummary) {
            this.putBodyParameter("scriptSummary", scriptSummary);
            this.scriptSummary = scriptSummary;
            return this;
        }

        /**
         * scriptTypeKeyword.
         */
        public Builder scriptTypeKeyword(String scriptTypeKeyword) {
            this.putBodyParameter("scriptTypeKeyword", scriptTypeKeyword);
            this.scriptTypeKeyword = scriptTypeKeyword;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>门厅一片狼藉。朝向天井的窗户开着。公寓门突然被撞开了。\n一名便衣探员、两名穿制服的警察和几位消防员———也身着工作服———进来，四下张望。他们都戴着手套以及盖住口鼻的面罩。在他们身后，门房和他妻子也挤进门厅。他们都捂着鼻子。门房的另一只手里拿着一叠信件和促销广告单。他们身后，跟着一位女邻居。\n便衣探员（对门房和邻居）：请在外面等候。\n他向一名警察示意，警察正忙着把好奇的旁观者请出门外。\n警察（对门房，指着那一叠信件）：最近的一封是哪天的？\n门房（查对信件）：最近的一封似乎是16号的......等一下......\n便衣探员想打开左侧的门，却是徒劳。门用胶带封上了。\n便衣探员（对消防员）：你来试一下好吗？\n消防员摆弄门的时候，便衣探员进了卧室隔壁的餐厅。他迅速打开窗，转身，想经过对开门进左侧的房间。这两扇门也锁着，门缝被贴上了胶带。他右转进入起居室，也打开了窗户</p>
         */
        public Builder userProvidedContent(String userProvidedContent) {
            this.putBodyParameter("userProvidedContent", userProvidedContent);
            this.userProvidedContent = userProvidedContent;
            return this;
        }

        @Override
        public RunScriptContinueRequest build() {
            return new RunScriptContinueRequest(this);
        } 

    } 

}
